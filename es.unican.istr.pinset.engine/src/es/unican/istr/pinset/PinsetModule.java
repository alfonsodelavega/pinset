/*******************************************************************************
 * Copyright (c) 2018 University of York, University of Cantabria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dimitrios Kolovos - initial API and EDL demo implementation
 *     Alfonso de la Vega - initial API and implementation
 ******************************************************************************/
package es.unican.istr.pinset;

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
import org.eclipse.epsilon.eol.dom.ExecutableBlock;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.erl.ErlModule;

import es.unican.istr.pinset.columnGenerators.Column;
import es.unican.istr.pinset.columnGenerators.Grid;
import es.unican.istr.pinset.columnGenerators.NestedFrom;
import es.unican.istr.pinset.columnGenerators.Properties;
import es.unican.istr.pinset.columnGenerators.Reference;
import es.unican.istr.pinset.dom.DatasetRule;
import es.unican.istr.pinset.parse.PinsetLexer;
import es.unican.istr.pinset.parse.PinsetParser;


public class PinsetModule extends ErlModule {

  public static final String SILENT_ANNOTATION = "silent";
  public static final String NORMALIZE_ANNOTATION = "normalize";
  public static final String FILL_NULLS_ANNOTATION = "fillNulls";
  public static final String FILL_NULLS_MEAN = "mean";
  public static final String FILL_NULLS_MODE = "mode";

  protected List<DatasetRule> declaredDatasetRules = new ArrayList<DatasetRule>();
  protected String outputFolder = "";
  protected String separator = ",";
  protected String extension = ".csv";
  protected String prefix = "";
  protected boolean silent = false;

  @Override
  public ModuleElement adapt(AST cst, ModuleElement parentAst) {
    switch (cst.getType()) {
    case PinsetParser.DATASET:
      return new DatasetRule();
    case PinsetParser.GUARD:
      return new ExecutableBlock<Boolean>(Boolean.class);
    case PinsetParser.COLUMN:
      return new Column();
    case PinsetParser.PROPERTIES:
      return new Properties();
    case PinsetParser.REFERENCE:
      return new Reference();
    case PinsetParser.GRID:
      return new Grid();
    case PinsetParser.NESTEDFROM:
      return new NestedFrom();
    }
    return super.adapt(cst, parentAst);
  }

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);

    for (AST processRuleAst : AstUtil.getChildren(cst, PinsetParser.DATASET)) {
      declaredDatasetRules.add((DatasetRule) module.createAst(processRuleAst, this));
    }
  }

  @Override
  public Lexer createLexer(ANTLRInputStream inputStream) {
    return new PinsetLexer(inputStream);
  }

  @Override
  public EpsilonParser createParser(TokenStream tokenStream) {
    return new PinsetParser(tokenStream);
  }

  @Override
  public String getMainRule() {
    return "pinsetModule";
  }

  @Override
  public HashMap<String, Class<?>> getImportConfiguration() {
    HashMap<String, Class<?>> importConfiguration = super.getImportConfiguration();
    importConfiguration.put("pset", PinsetModule.class);
    return importConfiguration;
  }

  @Override
  protected Object processRules() throws EolRuntimeException {
    for (DatasetRule datasetRule : declaredDatasetRules) {
        datasetRule.execute(context);
    }
    return null;
  }

  public List<DatasetRule> getDeclaredDatasetRules() {
    return declaredDatasetRules;
  }

  public void setOutputFolder(String attribute) {
    outputFolder = attribute;
  }

  public String getOutputFolder() {
    return outputFolder;
  }

  public String getSeparator() {
    return separator;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public boolean isSilent() {
    return silent;
  }

  public void setSilent(boolean silent) {
    this.silent = silent;
  }
}
