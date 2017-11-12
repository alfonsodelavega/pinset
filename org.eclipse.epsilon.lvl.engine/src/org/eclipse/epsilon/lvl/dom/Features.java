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
import org.eclipse.epsilon.eol.execute.context.FrameType;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class Features extends AnnotatableModuleElement {

  private static final String FEATURE_VARNAME = "feature";

  protected IExecutableModuleElement fromBlock;
  protected IExecutableModuleElement headerBlock;
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
    AST fromAST = AstUtil.getChild(cst, LvlParser.FROM);
    fromBlock = (IExecutableModuleElement)
        module.createAst(fromAST.getFirstChild(), this);
    AST headerAST = AstUtil.getChild(cst, LvlParser.HEADER);
    headerBlock = (IExecutableModuleElement)
        module.createAst(headerAST.getFirstChild(), this);
  }

  public boolean validate(Object obj, IPropertyGetter getter,
      IEolContext context, String varName) throws EolRuntimeException {
    boolean res = false;
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(varName, obj));
    Object fromObject = null;
    try {
      fromObject = ReturnValueParser.obtainValue(
          context.getExecutorFactory().execute(fromBlock, context));
    } catch (EolRuntimeException e) {
      if (!(this.hasAnnotation(LvlModule.SILENT_ANNOTATION)
          || ((DatasetRule)parent).hasAnnotation(LvlModule.SILENT_ANNOTATION)
          || ((LvlModule)module).isSilent())) {
        throw e;
      }
    }
    if (fromObject != null) {
      res = true;
      // validation can happen as fromblock returned not null
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
      }
    }
    return res;
  }

  public List<String> getNames(IEolContext context) throws EolRuntimeException {
    context.getFrameStack().enterLocal(FrameType.PROTECTED, headerBlock);
    ArrayList<String> result = new ArrayList<String>();
    for (String feature : features) {
      context.getFrameStack().put(
          Variable.createReadOnlyVariable(FEATURE_VARNAME, feature));
      result.add(ReturnValueParser.obtainValue(
          context.getExecutorFactory().execute(headerBlock, context)).toString());
    }
    context.getFrameStack().leaveLocal(headerBlock);
    return result;
  }

  public List<String> getValues(Object obj, IPropertyGetter getter,
      IEolContext context, String varName) throws EolRuntimeException {
    List<String> values = new ArrayList<String>();
    context.getFrameStack().enterLocal(FrameType.PROTECTED, fromBlock);
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(varName, obj));
    Object fromObject = null;
    try {
      fromObject = ReturnValueParser.obtainValue(
          context.getExecutorFactory().execute(fromBlock, context));
    } catch (EolRuntimeException e) {
      if (!(this.hasAnnotation(LvlModule.SILENT_ANNOTATION)
          || ((DatasetRule)parent).hasAnnotation(LvlModule.SILENT_ANNOTATION)
          || ((LvlModule)module).isSilent())) {
        throw e;
      }
    }
    context.getFrameStack().leaveLocal(fromBlock);
    if (fromObject == null) {
      // No object obtained from the expression, blank for all columns
      for (int i = 0; i < features.size(); i++) {
        values.add("");
      }
    } else {
      for (String feature : features) {
        values.add(ReturnValueParser.getStringOrBlank(
            getter.invoke(fromObject, feature)));
      }
    }
    return values;
  }
}

