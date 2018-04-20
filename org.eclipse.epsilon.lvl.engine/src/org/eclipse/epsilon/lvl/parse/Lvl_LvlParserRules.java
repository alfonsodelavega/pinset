package org.eclipse.epsilon.lvl.parse;

// $ANTLR 3.1b1 LvlParserRules.g 2018-04-20 09:14:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 * -----------------------------------------------------------------------------
 * ANTLR 3 License
 * [The "BSD licence"]
 * Copyright (c) 2005-2008 Terence Parr
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *   derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
public class Lvl_LvlParserRules extends org.eclipse.epsilon.common.parse.EpsilonParser {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int MODELDECLARATIONPARAMETER=72;
    public static final int T__145=145;
    public static final int BREAKALL=39;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int VAR=48;
    public static final int MODELDECLARATIONPARAMETERS=71;
    public static final int T__141=141;
    public static final int THROW=53;
    public static final int PARAMLIST=25;
    public static final int EXPRLIST=54;
    public static final int EXPRRANGE=55;
    public static final int BREAK=38;
    public static final int ELSE=32;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int FORMAL=24;
    public static final int IF=31;
    public static final int MultiplicativeExpression=57;
    public static final int TYPE=64;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__135=135;
    public static final int T__134=134;
    public static final int T__131=131;
    public static final int NewExpression=47;
    public static final int T__130=130;
    public static final int CASE=35;
    public static final int Letter=16;
    public static final int LINE_COMMENT=22;
    public static final int T__129=129;
    public static final int T__126=126;
    public static final int JavaIDDigit=18;
    public static final int GRIDHEADER=88;
    public static final int T__125=125;
    public static final int MAP=74;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int MODELDECLARATION=67;
    public static final int T__163=163;
    public static final int EXPRESSIONINBRACKETS=59;
    public static final int GRIDBODY=89;
    public static final int T__160=160;
    public static final int TRANSACTION=41;
    public static final int FLOAT_TYPE_SUFFIX=7;
    public static final int ITEMSELECTOR=73;
    public static final int COMMENT=21;
    public static final int ModelElementType=45;
    public static final int IMPORT=66;
    public static final int DELETE=52;
    public static final int ARROW=11;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__155=155;
    public static final int SPECIAL_ASSIGNMENT=27;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int GRID=86;
    public static final int Annotation=23;
    public static final int CONTINUE=40;
    public static final int ENUMERATION_VALUE=65;
    public static final int OPERATOR=58;
    public static final int EXPONENT=6;
    public static final int STRING=14;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int NAMESLIST=82;
    public static final int T__100=100;
    public static final int NAMESPACE=68;
    public static final int COLLECTION=42;
    public static final int NEW=49;
    public static final int EXTENDS=79;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int PRE=77;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int PROPERTIES=83;
    public static final int POST=78;
    public static final int ALIAS=69;
    public static final int DRIVER=70;
    public static final int COLUMN=84;
    public static final int DATASET=81;
    public static final int FROM=90;
    public static final int KEYVAL=75;
    public static final int POINT_POINT=10;
    public static final int GUARD=80;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int HELPERMETHOD=28;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int StatementBlock=29;
    public static final int T__98=98;
    public static final int GRIDKEYS=87;
    public static final int T__176=176;
    public static final int ABORT=43;
    public static final int T__173=173;
    public static final int StrangeNameLiteral=15;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FOR=30;
    public static final int BLOCK=62;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int PARAMETERS=46;
    public static final int SpecialNameChar=17;
    public static final int BOOLEAN=12;
    public static final int NAME=19;
    public static final int SWITCH=34;
    public static final int T__169=169;
    public static final int FeatureCall=60;
    public static final int T__122=122;
    public static final int LVLMODULE=92;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int FLOAT=4;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int NativeType=56;
    public static final int INT=8;
    public static final int ANNOTATIONBLOCK=50;
    public static final int RETURN=37;
    public static final int KEYVALLIST=76;
    public static final int FEATURECALL=63;
    public static final int CollectionType=44;
    public static final int T__119=119;
    public static final int ASSIGNMENT=26;
    public static final int REFERENCE=85;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int WS=20;
    public static final int NESTEDFROM=91;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int EscapeSequence=13;
    public static final int EOLMODULE=61;
    public static final int DIGIT=5;
    public static final int EXECUTABLEANNOTATION=51;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int WHILE=33;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int POINT=9;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int DEFAULT=36;
    public static final int T__105=105;

    // delegates
    // delegators
    public LvlParser gLvl;


        public Lvl_LvlParserRules(TokenStream input, LvlParser gLvl) {
            this(input, new RecognizerSharedState(), gLvl);
        }
        public Lvl_LvlParserRules(TokenStream input, RecognizerSharedState state, LvlParser gLvl) {
            super(input, state);
            this.gLvl = gLvl;
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LvlParser.tokenNames; }
    public String getGrammarFileName() { return "LvlParserRules.g"; }


    public static class datasetRule_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start datasetRule
    // LvlParserRules.g:57:1: datasetRule : r= 'dataset' NAME 'over' formalParameter ( from )? ob= '{' ( guard )? ( properties )? ( columnGenerator )* cb= '}' ;
    public final Lvl_LvlParserRules.datasetRule_return datasetRule() throws RecognitionException {
        Lvl_LvlParserRules.datasetRule_return retval = new Lvl_LvlParserRules.datasetRule_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token r=null;
        Token ob=null;
        Token cb=null;
        Token NAME1=null;
        Token string_literal2=null;
        Lvl_EolParserRules.formalParameter_return formalParameter3 = null;

        Lvl_LvlParserRules.from_return from4 = null;

        Lvl_ErlParserRules.guard_return guard5 = null;

        Lvl_LvlParserRules.properties_return properties6 = null;

        Lvl_LvlParserRules.columnGenerator_return columnGenerator7 = null;


        org.eclipse.epsilon.common.parse.AST r_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME1_tree=null;
        org.eclipse.epsilon.common.parse.AST string_literal2_tree=null;

        try {
            // LvlParserRules.g:62:3: (r= 'dataset' NAME 'over' formalParameter ( from )? ob= '{' ( guard )? ( properties )? ( columnGenerator )* cb= '}' )
            // LvlParserRules.g:62:5: r= 'dataset' NAME 'over' formalParameter ( from )? ob= '{' ( guard )? ( properties )? ( columnGenerator )* cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            r=(Token)match(input,167,FOLLOW_167_in_datasetRule103); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            r_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(r);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(r_tree, root_0);
            }
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_datasetRule106); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME1_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME1);
            adaptor.addChild(root_0, NAME1_tree);
            }
            string_literal2=(Token)match(input,168,FOLLOW_168_in_datasetRule108); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_datasetRule111);
            formalParameter3=gLvl.formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter3.getTree());
            // LvlParserRules.g:62:47: ( from )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==169) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // LvlParserRules.g:0:0: from
                    {
                    pushFollow(FOLLOW_from_in_datasetRule113);
                    from4=from();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, from4.getTree());

                    }
                    break;

            }

            ob=(Token)match(input,98,FOLLOW_98_in_datasetRule118); if (state.failed) return retval;
            // LvlParserRules.g:63:5: ( guard )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==165) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // LvlParserRules.g:0:0: guard
                    {
                    pushFollow(FOLLOW_guard_in_datasetRule125);
                    guard5=gLvl.guard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, guard5.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:64:5: ( properties )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==170) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // LvlParserRules.g:0:0: properties
                    {
                    pushFollow(FOLLOW_properties_in_datasetRule132);
                    properties6=properties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, properties6.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:65:5: ( columnGenerator )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Annotation||LA4_0==107||LA4_0==169||(LA4_0>=171 && LA4_0<=173)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LvlParserRules.g:0:0: columnGenerator
            	    {
            	    pushFollow(FOLLOW_columnGenerator_in_datasetRule139);
            	    columnGenerator7=columnGenerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, columnGenerator7.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            cb=(Token)match(input,99,FOLLOW_99_in_datasetRule146); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              r.setType(DATASET);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                  ((org.eclipse.epsilon.common.parse.AST)retval.tree).getExtraTokens().add(ob);
                  ((org.eclipse.epsilon.common.parse.AST)retval.tree).getExtraTokens().add(cb);
                
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end datasetRule

    public static class columnGenerator_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnGenerator
    // LvlParserRules.g:70:1: columnGenerator : ( reference | ( annotationBlock )? column | ( annotationBlock )? grid | nestedFrom );
    public final Lvl_LvlParserRules.columnGenerator_return columnGenerator() throws RecognitionException {
        Lvl_LvlParserRules.columnGenerator_return retval = new Lvl_LvlParserRules.columnGenerator_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Lvl_LvlParserRules.reference_return reference8 = null;

        Lvl_EolParserRules.annotationBlock_return annotationBlock9 = null;

        Lvl_LvlParserRules.column_return column10 = null;

        Lvl_EolParserRules.annotationBlock_return annotationBlock11 = null;

        Lvl_LvlParserRules.grid_return grid12 = null;

        Lvl_LvlParserRules.nestedFrom_return nestedFrom13 = null;



        try {
            // LvlParserRules.g:71:3: ( reference | ( annotationBlock )? column | ( annotationBlock )? grid | nestedFrom )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 171:
                {
                alt7=1;
                }
                break;
            case Annotation:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred7_LvlParserRules()) ) {
                    alt7=2;
                }
                else if ( (synpred9_LvlParserRules()) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 107:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred7_LvlParserRules()) ) {
                    alt7=2;
                }
                else if ( (synpred9_LvlParserRules()) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 172:
                {
                alt7=2;
                }
                break;
            case 173:
                {
                alt7=3;
                }
                break;
            case 169:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // LvlParserRules.g:71:5: reference
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    pushFollow(FOLLOW_reference_in_columnGenerator164);
                    reference8=reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference8.getTree());

                    }
                    break;
                case 2 :
                    // LvlParserRules.g:72:5: ( annotationBlock )? column
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    // LvlParserRules.g:72:5: ( annotationBlock )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==Annotation||LA5_0==107) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // LvlParserRules.g:0:0: annotationBlock
                            {
                            pushFollow(FOLLOW_annotationBlock_in_columnGenerator172);
                            annotationBlock9=gLvl.annotationBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationBlock9.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_in_columnGenerator175);
                    column10=column();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, column10.getTree());

                    }
                    break;
                case 3 :
                    // LvlParserRules.g:73:5: ( annotationBlock )? grid
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    // LvlParserRules.g:73:5: ( annotationBlock )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Annotation||LA6_0==107) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // LvlParserRules.g:0:0: annotationBlock
                            {
                            pushFollow(FOLLOW_annotationBlock_in_columnGenerator183);
                            annotationBlock11=gLvl.annotationBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationBlock11.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_grid_in_columnGenerator186);
                    grid12=grid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, grid12.getTree());

                    }
                    break;
                case 4 :
                    // LvlParserRules.g:74:5: nestedFrom
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    pushFollow(FOLLOW_nestedFrom_in_columnGenerator194);
                    nestedFrom13=nestedFrom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nestedFrom13.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end columnGenerator

    public static class nestedFrom_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nestedFrom
    // LvlParserRules.g:77:1: nestedFrom : nf= 'from' NAME expressionOrStatementBlock '{' ( properties )? ( columnGenerator )* '}' ;
    public final Lvl_LvlParserRules.nestedFrom_return nestedFrom() throws RecognitionException {
        Lvl_LvlParserRules.nestedFrom_return retval = new Lvl_LvlParserRules.nestedFrom_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token nf=null;
        Token NAME14=null;
        Token char_literal16=null;
        Token char_literal19=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock15 = null;

        Lvl_LvlParserRules.properties_return properties17 = null;

        Lvl_LvlParserRules.columnGenerator_return columnGenerator18 = null;


        org.eclipse.epsilon.common.parse.AST nf_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME14_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal16_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal19_tree=null;

        try {
            // LvlParserRules.g:78:3: (nf= 'from' NAME expressionOrStatementBlock '{' ( properties )? ( columnGenerator )* '}' )
            // LvlParserRules.g:78:5: nf= 'from' NAME expressionOrStatementBlock '{' ( properties )? ( columnGenerator )* '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            nf=(Token)match(input,169,FOLLOW_169_in_nestedFrom209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            nf_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(nf);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(nf_tree, root_0);
            }
            NAME14=(Token)match(input,NAME,FOLLOW_NAME_in_nestedFrom212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME14_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME14);
            adaptor.addChild(root_0, NAME14_tree);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_nestedFrom214);
            expressionOrStatementBlock15=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock15.getTree());
            char_literal16=(Token)match(input,98,FOLLOW_98_in_nestedFrom216); if (state.failed) return retval;
            // LvlParserRules.g:79:5: ( properties )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==170) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // LvlParserRules.g:0:0: properties
                    {
                    pushFollow(FOLLOW_properties_in_nestedFrom223);
                    properties17=properties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, properties17.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:80:5: ( columnGenerator )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Annotation||LA9_0==107||LA9_0==169||(LA9_0>=171 && LA9_0<=173)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // LvlParserRules.g:0:0: columnGenerator
            	    {
            	    pushFollow(FOLLOW_columnGenerator_in_nestedFrom230);
            	    columnGenerator18=columnGenerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, columnGenerator18.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal19=(Token)match(input,99,FOLLOW_99_in_nestedFrom235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              nf.setType(NESTEDFROM);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end nestedFrom

    public static class nameslist_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nameslist
    // LvlParserRules.g:85:1: nameslist : nl= '[' NAME ( ',' NAME )* cb= ']' ;
    public final Lvl_LvlParserRules.nameslist_return nameslist() throws RecognitionException {
        Lvl_LvlParserRules.nameslist_return retval = new Lvl_LvlParserRules.nameslist_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token nl=null;
        Token cb=null;
        Token NAME20=null;
        Token char_literal21=null;
        Token NAME22=null;

        org.eclipse.epsilon.common.parse.AST nl_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME20_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal21_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME22_tree=null;

        try {
            // LvlParserRules.g:89:2: (nl= '[' NAME ( ',' NAME )* cb= ']' )
            // LvlParserRules.g:89:4: nl= '[' NAME ( ',' NAME )* cb= ']'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            nl=(Token)match(input,157,FOLLOW_157_in_nameslist262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            nl_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(nl);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(nl_tree, root_0);
            }
            NAME20=(Token)match(input,NAME,FOLLOW_NAME_in_nameslist265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME20_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME20);
            adaptor.addChild(root_0, NAME20_tree);
            }
            // LvlParserRules.g:89:17: ( ',' NAME )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==96) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // LvlParserRules.g:89:18: ',' NAME
            	    {
            	    char_literal21=(Token)match(input,96,FOLLOW_96_in_nameslist268); if (state.failed) return retval;
            	    NAME22=(Token)match(input,NAME,FOLLOW_NAME_in_nameslist271); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME22_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME22);
            	    adaptor.addChild(root_0, NAME22_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            cb=(Token)match(input,158,FOLLOW_158_in_nameslist277); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              nl.setType(NAMESLIST);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                  ((org.eclipse.epsilon.common.parse.AST)retval.tree).getExtraTokens().add(cb);
                
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end nameslist

    public static class properties_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start properties
    // LvlParserRules.g:93:1: properties : sf= 'properties' nameslist ;
    public final Lvl_LvlParserRules.properties_return properties() throws RecognitionException {
        Lvl_LvlParserRules.properties_return retval = new Lvl_LvlParserRules.properties_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token sf=null;
        Lvl_LvlParserRules.nameslist_return nameslist23 = null;


        org.eclipse.epsilon.common.parse.AST sf_tree=null;

        try {
            // LvlParserRules.g:94:3: (sf= 'properties' nameslist )
            // LvlParserRules.g:95:3: sf= 'properties' nameslist
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            sf=(Token)match(input,170,FOLLOW_170_in_properties299); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            sf_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(sf);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(sf_tree, root_0);
            }
            pushFollow(FOLLOW_nameslist_in_properties302);
            nameslist23=nameslist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nameslist23.getTree());
            if ( state.backtracking==0 ) {
              sf.setType(PROPERTIES);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end properties

    public static class reference_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start reference
    // LvlParserRules.g:99:1: reference : r= 'reference' NAME nameslist ;
    public final Lvl_LvlParserRules.reference_return reference() throws RecognitionException {
        Lvl_LvlParserRules.reference_return retval = new Lvl_LvlParserRules.reference_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token r=null;
        Token NAME24=null;
        Lvl_LvlParserRules.nameslist_return nameslist25 = null;


        org.eclipse.epsilon.common.parse.AST r_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME24_tree=null;

        try {
            // LvlParserRules.g:100:3: (r= 'reference' NAME nameslist )
            // LvlParserRules.g:100:5: r= 'reference' NAME nameslist
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            r=(Token)match(input,171,FOLLOW_171_in_reference321); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            r_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(r);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(r_tree, root_0);
            }
            NAME24=(Token)match(input,NAME,FOLLOW_NAME_in_reference324); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME24_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME24);
            adaptor.addChild(root_0, NAME24_tree);
            }
            pushFollow(FOLLOW_nameslist_in_reference326);
            nameslist25=nameslist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nameslist25.getTree());
            if ( state.backtracking==0 ) {
              r.setType(REFERENCE);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end reference

    public static class column_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start column
    // LvlParserRules.g:104:1: column : cd= 'column' NAME expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.column_return column() throws RecognitionException {
        Lvl_LvlParserRules.column_return retval = new Lvl_LvlParserRules.column_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token cd=null;
        Token NAME26=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock27 = null;


        org.eclipse.epsilon.common.parse.AST cd_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME26_tree=null;

        try {
            // LvlParserRules.g:105:3: (cd= 'column' NAME expressionOrStatementBlock )
            // LvlParserRules.g:105:5: cd= 'column' NAME expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            cd=(Token)match(input,172,FOLLOW_172_in_column345); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cd_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cd);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(cd_tree, root_0);
            }
            NAME26=(Token)match(input,NAME,FOLLOW_NAME_in_column348); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME26_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME26);
            adaptor.addChild(root_0, NAME26_tree);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_column350);
            expressionOrStatementBlock27=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock27.getTree());
            if ( state.backtracking==0 ) {
              cd.setType(COLUMN);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end column

    public static class grid_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start grid
    // LvlParserRules.g:109:1: grid : cd= 'grid' ob= '{' gkeys header gbody cb= '}' ;
    public final Lvl_LvlParserRules.grid_return grid() throws RecognitionException {
        Lvl_LvlParserRules.grid_return retval = new Lvl_LvlParserRules.grid_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token cd=null;
        Token ob=null;
        Token cb=null;
        Lvl_LvlParserRules.gkeys_return gkeys28 = null;

        Lvl_LvlParserRules.header_return header29 = null;

        Lvl_LvlParserRules.gbody_return gbody30 = null;


        org.eclipse.epsilon.common.parse.AST cd_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;

        try {
            // LvlParserRules.g:114:3: (cd= 'grid' ob= '{' gkeys header gbody cb= '}' )
            // LvlParserRules.g:114:5: cd= 'grid' ob= '{' gkeys header gbody cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            cd=(Token)match(input,173,FOLLOW_173_in_grid376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cd_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cd);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(cd_tree, root_0);
            }
            ob=(Token)match(input,98,FOLLOW_98_in_grid381); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ob_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(ob);
            adaptor.addChild(root_0, ob_tree);
            }
            pushFollow(FOLLOW_gkeys_in_grid387);
            gkeys28=gkeys();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gkeys28.getTree());
            pushFollow(FOLLOW_header_in_grid393);
            header29=header();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, header29.getTree());
            pushFollow(FOLLOW_gbody_in_grid399);
            gbody30=gbody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gbody30.getTree());
            cb=(Token)match(input,99,FOLLOW_99_in_grid405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cb_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cb);
            adaptor.addChild(root_0, cb_tree);
            }
            if ( state.backtracking==0 ) {
              cd.setType(GRID);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                  ((org.eclipse.epsilon.common.parse.AST)retval.tree).getExtraTokens().add(ob);
                  ((org.eclipse.epsilon.common.parse.AST)retval.tree).getExtraTokens().add(cb);
                
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end grid

    public static class gkeys_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start gkeys
    // LvlParserRules.g:122:1: gkeys : gk= 'keys' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.gkeys_return gkeys() throws RecognitionException {
        Lvl_LvlParserRules.gkeys_return retval = new Lvl_LvlParserRules.gkeys_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gk=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock31 = null;


        org.eclipse.epsilon.common.parse.AST gk_tree=null;

        try {
            // LvlParserRules.g:123:3: (gk= 'keys' expressionOrStatementBlock )
            // LvlParserRules.g:123:5: gk= 'keys' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gk=(Token)match(input,174,FOLLOW_174_in_gkeys424); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gk_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gk);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gk_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_gkeys427);
            expressionOrStatementBlock31=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock31.getTree());
            if ( state.backtracking==0 ) {
              gk.setType(GRIDKEYS);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end gkeys

    public static class header_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start header
    // LvlParserRules.g:127:1: header : gh= 'header' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.header_return header() throws RecognitionException {
        Lvl_LvlParserRules.header_return retval = new Lvl_LvlParserRules.header_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gh=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock32 = null;


        org.eclipse.epsilon.common.parse.AST gh_tree=null;

        try {
            // LvlParserRules.g:128:3: (gh= 'header' expressionOrStatementBlock )
            // LvlParserRules.g:128:5: gh= 'header' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gh=(Token)match(input,175,FOLLOW_175_in_header446); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gh_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gh);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gh_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_header449);
            expressionOrStatementBlock32=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock32.getTree());
            if ( state.backtracking==0 ) {
              gh.setType(GRIDHEADER);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end header

    public static class gbody_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start gbody
    // LvlParserRules.g:132:1: gbody : gb= 'body' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.gbody_return gbody() throws RecognitionException {
        Lvl_LvlParserRules.gbody_return retval = new Lvl_LvlParserRules.gbody_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gb=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock33 = null;


        org.eclipse.epsilon.common.parse.AST gb_tree=null;

        try {
            // LvlParserRules.g:133:3: (gb= 'body' expressionOrStatementBlock )
            // LvlParserRules.g:133:5: gb= 'body' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gb=(Token)match(input,176,FOLLOW_176_in_gbody468); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gb_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gb);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gb_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_gbody471);
            expressionOrStatementBlock33=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock33.getTree());
            if ( state.backtracking==0 ) {
              gb.setType(GRIDBODY);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end gbody

    public static class from_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start from
    // LvlParserRules.g:137:1: from : ff= 'from' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.from_return from() throws RecognitionException {
        Lvl_LvlParserRules.from_return retval = new Lvl_LvlParserRules.from_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token ff=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock34 = null;


        org.eclipse.epsilon.common.parse.AST ff_tree=null;

        try {
            // LvlParserRules.g:138:3: (ff= 'from' expressionOrStatementBlock )
            // LvlParserRules.g:138:5: ff= 'from' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            ff=(Token)match(input,169,FOLLOW_169_in_from490); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ff_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(ff);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(ff_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_from493);
            expressionOrStatementBlock34=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock34.getTree());
            if ( state.backtracking==0 ) {
              ff.setType(FROM);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (org.eclipse.epsilon.common.parse.AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end from

    // $ANTLR start synpred7_LvlParserRules
    public final void synpred7_LvlParserRules_fragment() throws RecognitionException {   
        // LvlParserRules.g:72:5: ( ( annotationBlock )? column )
        // LvlParserRules.g:72:5: ( annotationBlock )? column
        {
        // LvlParserRules.g:72:5: ( annotationBlock )?
        int alt11=2;
        int LA11_0 = input.LA(1);

        if ( (LA11_0==Annotation||LA11_0==107) ) {
            alt11=1;
        }
        switch (alt11) {
            case 1 :
                // LvlParserRules.g:0:0: annotationBlock
                {
                pushFollow(FOLLOW_annotationBlock_in_synpred7_LvlParserRules172);
                gLvl.annotationBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_column_in_synpred7_LvlParserRules175);
        column();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_LvlParserRules

    // $ANTLR start synpred9_LvlParserRules
    public final void synpred9_LvlParserRules_fragment() throws RecognitionException {   
        // LvlParserRules.g:73:5: ( ( annotationBlock )? grid )
        // LvlParserRules.g:73:5: ( annotationBlock )? grid
        {
        // LvlParserRules.g:73:5: ( annotationBlock )?
        int alt12=2;
        int LA12_0 = input.LA(1);

        if ( (LA12_0==Annotation||LA12_0==107) ) {
            alt12=1;
        }
        switch (alt12) {
            case 1 :
                // LvlParserRules.g:0:0: annotationBlock
                {
                pushFollow(FOLLOW_annotationBlock_in_synpred9_LvlParserRules183);
                gLvl.annotationBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_grid_in_synpred9_LvlParserRules186);
        grid();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_LvlParserRules

    // Delegated rules

    public final boolean synpred9_LvlParserRules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_LvlParserRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_LvlParserRules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_LvlParserRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_167_in_datasetRule103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_datasetRule106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_datasetRule108 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_formalParameter_in_datasetRule111 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_from_in_datasetRule113 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_datasetRule118 = new BitSet(new long[]{0x0000000000800000L,0x0000080800000000L,0x00003E2000000000L});
    public static final BitSet FOLLOW_guard_in_datasetRule125 = new BitSet(new long[]{0x0000000000800000L,0x0000080800000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_properties_in_datasetRule132 = new BitSet(new long[]{0x0000000000800000L,0x0000080800000000L,0x00003A0000000000L});
    public static final BitSet FOLLOW_columnGenerator_in_datasetRule139 = new BitSet(new long[]{0x0000000000800000L,0x0000080800000000L,0x00003A0000000000L});
    public static final BitSet FOLLOW_99_in_datasetRule146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_columnGenerator164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationBlock_in_columnGenerator172 = new BitSet(new long[]{0x0000000000800000L,0x0000080000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_column_in_columnGenerator175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationBlock_in_columnGenerator183 = new BitSet(new long[]{0x0000000000800000L,0x0000080000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_grid_in_columnGenerator186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestedFrom_in_columnGenerator194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_nestedFrom209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_nestedFrom212 = new BitSet(new long[]{0x0000000000000000L,0x0000020400000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_nestedFrom214 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_nestedFrom216 = new BitSet(new long[]{0x0000000000800000L,0x0000080800000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_properties_in_nestedFrom223 = new BitSet(new long[]{0x0000000000800000L,0x0000080800000000L,0x00003A0000000000L});
    public static final BitSet FOLLOW_columnGenerator_in_nestedFrom230 = new BitSet(new long[]{0x0000000000800000L,0x0000080800000000L,0x00003A0000000000L});
    public static final BitSet FOLLOW_99_in_nestedFrom235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_nameslist262 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_nameslist265 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_96_in_nameslist268 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_nameslist271 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_nameslist277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_properties299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_nameslist_in_properties302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_reference321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_reference324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_nameslist_in_reference326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_column345 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_column348 = new BitSet(new long[]{0x0000000000000000L,0x0000020400000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_column350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_grid376 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_grid381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_gkeys_in_grid387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_header_in_grid393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_gbody_in_grid399 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_grid405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_gkeys424 = new BitSet(new long[]{0x0000000000000000L,0x0000020400000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_gkeys427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_header446 = new BitSet(new long[]{0x0000000000000000L,0x0000020400000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_header449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_gbody468 = new BitSet(new long[]{0x0000000000000000L,0x0000020400000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_gbody471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_from490 = new BitSet(new long[]{0x0000000000000000L,0x0000020400000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_from493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationBlock_in_synpred7_LvlParserRules172 = new BitSet(new long[]{0x0000000000800000L,0x0000080000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_column_in_synpred7_LvlParserRules175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationBlock_in_synpred9_LvlParserRules183 = new BitSet(new long[]{0x0000000000800000L,0x0000080000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_grid_in_synpred9_LvlParserRules186 = new BitSet(new long[]{0x0000000000000002L});

}
