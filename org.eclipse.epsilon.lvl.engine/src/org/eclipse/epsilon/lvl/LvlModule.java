/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.lvl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.TokenStream;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.module.ModuleElement;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.parse.EpsilonParser;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.dom.ExecutableBlock;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.lvl.parse.LvlLexer;
import org.eclipse.epsilon.lvl.parse.LvlParser;


public class LvlModule extends EolModule {

  protected List<DatasetRule> declaredProcessRules = new ArrayList<DatasetRule>();
  private String outputFolder = "";

  @Override
  public ModuleElement adapt(AST cst, ModuleElement parentAst) {
    switch (cst.getType()) {
    case LvlParser.DATASET:
      return new DatasetRule();
    case LvlParser.GUARD:
      return new ExecutableBlock<Boolean>(Boolean.class);
    case LvlParser.COLUMNDEFINITION:
      return new ColumnDefinition();
    case LvlParser.SIMPLEREFERENCE:
      return new SimpleReference();
    }
    return super.adapt(cst, parentAst);
  }

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);

    for (AST processRuleAst : AstUtil.getChildren(cst, LvlParser.DATASET)) {
      declaredProcessRules.add((DatasetRule) module.createAst(processRuleAst, this));
    }
  }

  @Override
  public Lexer createLexer(ANTLRInputStream inputStream) {
    return new LvlLexer(inputStream);
  }

  @Override
  public EpsilonParser createParser(TokenStream tokenStream) {
    return new LvlParser(tokenStream);
  }

  @Override
  public String getMainRule() {
    return "lvlModule";
  }

  @Override
  public HashMap<String, Class<?>> getImportConfiguration() {
    HashMap<String, Class<?>> importConfiguration = super.getImportConfiguration();
    importConfiguration.put("lvl", LvlModule.class);
    return importConfiguration;
  }

  public Object executeImpl() throws EolRuntimeException {
    for (DatasetRule processRule : declaredProcessRules) {
        processRule.execute(context);
    }
    return null;
  }

  @Override
  public IEolContext getContext(){
    return context;
  }

  @Override
  public void setContext(IEolContext context) {
    this.context = context;
  }

  public List<DatasetRule> getDeclaredProcessRules() {
    return declaredProcessRules;
  }

  public void setOutputFolder(String attribute) {
    outputFolder = attribute;
  }

  public String getOutputFolder() {
    return outputFolder;
  }
}
