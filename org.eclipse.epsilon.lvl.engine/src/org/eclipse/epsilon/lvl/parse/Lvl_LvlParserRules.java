package org.eclipse.epsilon.lvl.parse;

// $ANTLR 3.1b1 LvlParserRules.g 2017-09-29 12:04:00

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
    public static final int T__125=125;
    public static final int MAP=74;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int MODELDECLARATION=67;
    public static final int EXPRESSIONINBRACKETS=59;
    public static final int TRANSACTION=41;
    public static final int FLOAT_TYPE_SUFFIX=7;
    public static final int SIMPLEREFERENCE=81;
    public static final int ITEMSELECTOR=73;
    public static final int COMMENT=21;
    public static final int ModelElementType=45;
    public static final int IMPORT=66;
    public static final int SIMPLEFEATURES=78;
    public static final int DELETE=52;
    public static final int ARROW=11;
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
    public static final int Annotation=23;
    public static final int CONTINUE=40;
    public static final int ENUMERATION_VALUE=65;
    public static final int OPERATOR=58;
    public static final int EXPONENT=6;
    public static final int STRING=14;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int NAMESPACE=68;
    public static final int T__92=92;
    public static final int COLLECTION=42;
    public static final int NEW=49;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int ALIAS=69;
    public static final int DRIVER=70;
    public static final int DATASET=77;
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
    public static final int ABORT=43;
    public static final int StrangeNameLiteral=15;
    public static final int FOR=30;
    public static final int BLOCK=62;
    public static final int PARAMETERS=46;
    public static final int SpecialNameChar=17;
    public static final int BOOLEAN=12;
    public static final int NAME=19;
    public static final int SWITCH=34;
    public static final int FeatureCall=60;
    public static final int T__122=122;
    public static final int LVLMODULE=82;
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
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int WS=20;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int COLUMNDEFINITION=79;
    public static final int EscapeSequence=13;
    public static final int EOLMODULE=61;
    public static final int DIGIT=5;
    public static final int EXECUTABLEANNOTATION=51;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int WHILE=33;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int POINT=9;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int DEFAULT=36;
    public static final int T__87=87;
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
    // LvlParserRules.g:50:1: datasetRule : r= 'dataset' NAME 'over' formalParameter ob= '{' ( guard )? ( simpleFeatures )? ( simpleReference )* ( columnDefinition )* cb= '}' ;
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

        Lvl_LvlParserRules.guard_return guard4 = null;

        Lvl_LvlParserRules.simpleFeatures_return simpleFeatures5 = null;

        Lvl_LvlParserRules.simpleReference_return simpleReference6 = null;

        Lvl_LvlParserRules.columnDefinition_return columnDefinition7 = null;


        org.eclipse.epsilon.common.parse.AST r_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME1_tree=null;
        org.eclipse.epsilon.common.parse.AST string_literal2_tree=null;

        try {
            // LvlParserRules.g:55:3: (r= 'dataset' NAME 'over' formalParameter ob= '{' ( guard )? ( simpleFeatures )? ( simpleReference )* ( columnDefinition )* cb= '}' )
            // LvlParserRules.g:55:5: r= 'dataset' NAME 'over' formalParameter ob= '{' ( guard )? ( simpleFeatures )? ( simpleReference )* ( columnDefinition )* cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            r=(Token)match(input,153,FOLLOW_153_in_datasetRule68); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            r_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(r);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(r_tree, root_0);
            }
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_datasetRule71); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME1_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME1);
            adaptor.addChild(root_0, NAME1_tree);
            }
            string_literal2=(Token)match(input,154,FOLLOW_154_in_datasetRule73); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_datasetRule76);
            formalParameter3=gLvl.formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter3.getTree());
            ob=(Token)match(input,88,FOLLOW_88_in_datasetRule80); if (state.failed) return retval;
            // LvlParserRules.g:56:5: ( guard )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==155) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // LvlParserRules.g:0:0: guard
                    {
                    pushFollow(FOLLOW_guard_in_datasetRule87);
                    guard4=guard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, guard4.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:57:5: ( simpleFeatures )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==156) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // LvlParserRules.g:0:0: simpleFeatures
                    {
                    pushFollow(FOLLOW_simpleFeatures_in_datasetRule94);
                    simpleFeatures5=simpleFeatures();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleFeatures5.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:58:5: ( simpleReference )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==157) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LvlParserRules.g:0:0: simpleReference
            	    {
            	    pushFollow(FOLLOW_simpleReference_in_datasetRule101);
            	    simpleReference6=simpleReference();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleReference6.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // LvlParserRules.g:59:5: ( columnDefinition )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==158) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LvlParserRules.g:0:0: columnDefinition
            	    {
            	    pushFollow(FOLLOW_columnDefinition_in_datasetRule108);
            	    columnDefinition7=columnDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, columnDefinition7.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            cb=(Token)match(input,89,FOLLOW_89_in_datasetRule115); if (state.failed) return retval;
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

    public static class guard_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start guard
    // LvlParserRules.g:64:1: guard : g= 'guard' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.guard_return guard() throws RecognitionException {
        Lvl_LvlParserRules.guard_return retval = new Lvl_LvlParserRules.guard_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token g=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock8 = null;


        org.eclipse.epsilon.common.parse.AST g_tree=null;

        try {
            // LvlParserRules.g:65:3: (g= 'guard' expressionOrStatementBlock )
            // LvlParserRules.g:65:5: g= 'guard' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            g=(Token)match(input,155,FOLLOW_155_in_guard135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            g_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(g);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(g_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_guard138);
            expressionOrStatementBlock8=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock8.getTree());
            if ( state.backtracking==0 ) {
              g.setType(GUARD);
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
    // $ANTLR end guard

    public static class simpleFeatures_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start simpleFeatures
    // LvlParserRules.g:69:1: simpleFeatures : sf= 'attributes' ob= '[' NAME ( ',' NAME )* cb= ']' ;
    public final Lvl_LvlParserRules.simpleFeatures_return simpleFeatures() throws RecognitionException {
        Lvl_LvlParserRules.simpleFeatures_return retval = new Lvl_LvlParserRules.simpleFeatures_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token sf=null;
        Token ob=null;
        Token cb=null;
        Token NAME9=null;
        Token char_literal10=null;
        Token NAME11=null;

        org.eclipse.epsilon.common.parse.AST sf_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME9_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal10_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME11_tree=null;

        try {
            // LvlParserRules.g:74:3: (sf= 'attributes' ob= '[' NAME ( ',' NAME )* cb= ']' )
            // LvlParserRules.g:75:3: sf= 'attributes' ob= '[' NAME ( ',' NAME )* cb= ']'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            sf=(Token)match(input,156,FOLLOW_156_in_simpleFeatures166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            sf_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(sf);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(sf_tree, root_0);
            }
            ob=(Token)match(input,147,FOLLOW_147_in_simpleFeatures171); if (state.failed) return retval;
            NAME9=(Token)match(input,NAME,FOLLOW_NAME_in_simpleFeatures174); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME9_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME9);
            adaptor.addChild(root_0, NAME9_tree);
            }
            // LvlParserRules.g:75:33: ( ',' NAME )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==86) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // LvlParserRules.g:75:34: ',' NAME
            	    {
            	    char_literal10=(Token)match(input,86,FOLLOW_86_in_simpleFeatures177); if (state.failed) return retval;
            	    NAME11=(Token)match(input,NAME,FOLLOW_NAME_in_simpleFeatures180); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME11_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME11);
            	    adaptor.addChild(root_0, NAME11_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            cb=(Token)match(input,148,FOLLOW_148_in_simpleFeatures186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              sf.setType(SIMPLEFEATURES);
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
    // $ANTLR end simpleFeatures

    public static class simpleReference_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start simpleReference
    // LvlParserRules.g:79:1: simpleReference : sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )? ;
    public final Lvl_LvlParserRules.simpleReference_return simpleReference() throws RecognitionException {
        Lvl_LvlParserRules.simpleReference_return retval = new Lvl_LvlParserRules.simpleReference_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token sr=null;
        Token ob=null;
        Token cb=null;
        Token NAME12=null;
        Token NAME13=null;
        Token char_literal14=null;
        Token NAME15=null;

        org.eclipse.epsilon.common.parse.AST sr_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME12_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME13_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal14_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME15_tree=null;

        try {
            // LvlParserRules.g:84:3: (sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )? )
            // LvlParserRules.g:85:3: sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )?
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            sr=(Token)match(input,157,FOLLOW_157_in_simpleReference215); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            sr_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(sr);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(sr_tree, root_0);
            }
            NAME12=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference218); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME12_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME12);
            adaptor.addChild(root_0, NAME12_tree);
            }
            // LvlParserRules.g:85:24: (ob= '[' NAME ( ',' NAME )* cb= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==147) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // LvlParserRules.g:85:25: ob= '[' NAME ( ',' NAME )* cb= ']'
                    {
                    ob=(Token)match(input,147,FOLLOW_147_in_simpleReference223); if (state.failed) return retval;
                    NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME13_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME13);
                    adaptor.addChild(root_0, NAME13_tree);
                    }
                    // LvlParserRules.g:85:38: ( ',' NAME )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==86) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // LvlParserRules.g:85:39: ',' NAME
                    	    {
                    	    char_literal14=(Token)match(input,86,FOLLOW_86_in_simpleReference229); if (state.failed) return retval;
                    	    NAME15=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference232); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME15_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME15);
                    	    adaptor.addChild(root_0, NAME15_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    cb=(Token)match(input,148,FOLLOW_148_in_simpleReference238); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              sr.setType(SIMPLEREFERENCE);
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
    // $ANTLR end simpleReference

    public static class columnDefinition_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start columnDefinition
    // LvlParserRules.g:89:1: columnDefinition : cd= 'column' NAME expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.columnDefinition_return columnDefinition() throws RecognitionException {
        Lvl_LvlParserRules.columnDefinition_return retval = new Lvl_LvlParserRules.columnDefinition_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token cd=null;
        Token NAME16=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock17 = null;


        org.eclipse.epsilon.common.parse.AST cd_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME16_tree=null;

        try {
            // LvlParserRules.g:90:3: (cd= 'column' NAME expressionOrStatementBlock )
            // LvlParserRules.g:90:5: cd= 'column' NAME expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            cd=(Token)match(input,158,FOLLOW_158_in_columnDefinition260); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cd_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cd);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(cd_tree, root_0);
            }
            NAME16=(Token)match(input,NAME,FOLLOW_NAME_in_columnDefinition263); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME16_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME16);
            adaptor.addChild(root_0, NAME16_tree);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_columnDefinition265);
            expressionOrStatementBlock17=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock17.getTree());
            if ( state.backtracking==0 ) {
              cd.setType(COLUMNDEFINITION);
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
    // $ANTLR end columnDefinition

    // Delegated rules


 

    public static final BitSet FOLLOW_153_in_datasetRule68 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_datasetRule71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_datasetRule73 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_formalParameter_in_datasetRule76 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_datasetRule80 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_guard_in_datasetRule87 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_simpleFeatures_in_datasetRule94 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_simpleReference_in_datasetRule101 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_columnDefinition_in_datasetRule108 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_89_in_datasetRule115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_guard135 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_guard138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_simpleFeatures166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_simpleFeatures171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleFeatures174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_86_in_simpleFeatures177 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleFeatures180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_simpleFeatures186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_simpleReference215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_simpleReference223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_86_in_simpleReference229 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_simpleReference238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_columnDefinition260 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_columnDefinition263 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_columnDefinition265 = new BitSet(new long[]{0x0000000000000002L});

}
