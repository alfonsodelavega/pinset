package org.eclipse.epsilon.lvl.dom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class Features extends AnnotatableModuleElement {

  protected IExecutableModuleElement fromBlock;
  protected String prefix = "";
  protected List<String> features = new ArrayList<String>();

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    AST featuresAST = AstUtil.getChild(cst, LvlParser.NAMESLIST);
    if (featuresAST != null) {
      for (AST child : featuresAST.getChildren()) {
        features.add(child.getText());
      }
    }
    AST fromAST = AstUtil.getChild(cst, LvlParser.FEATURESFROM);
    fromBlock = (IExecutableModuleElement)
        module.createAst(fromAST.getFirstChild(), this);
    AST prefixAST = AstUtil.getChild(cst, LvlParser.FEATURESPREFIX);
    prefix = prefixAST.getFirstChild().getText();
  }

  public List<String> getNames()
      throws EolRuntimeException {
    ArrayList<String> result = new ArrayList<String>();
    for (String feature : features) {
      result.add(prefix + feature);
    }
    return result;
  }

  public List<String> getValues(Object obj, IPropertyGetter getter,
      IEolContext context, String varName) throws EolRuntimeException {
    List<String> values = new ArrayList<String>();
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(varName, obj));
    Object fromObject = fromBlock.execute(context);
    if (fromObject == null) {
      // No object obtained from the expression, blank for all columns
      for (int i = 0; i < features.size(); i++) {
        values.add("");
      }
    } else {
      for (String feature : features) {
        if (!getter.hasProperty(fromObject, feature)) {
          String className = fromObject.getClass().getSimpleName();
          if (fromObject instanceof EObject) {
            className = ((EObject)fromObject).eClass().getName();
          }
          throw new EolRuntimeException(String.format(
              "Instances of type %s do not have a %s feature",
              className, feature));
        }
        values.add(ReturnValueParser.getStringOrBlank(
            getter.invoke(fromObject, feature)));
      }
    }
    return values;
  }
}

