package org.eclipse.epsilon.lvl.parse;

// $ANTLR 3.1b1 LvlParserRules.g 2017-10-09 15:21:19

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
    public static final int GHEADER=84;
    public static final int T__129=129;
    public static final int T__126=126;
    public static final int JavaIDDigit=18;
    public static final int T__125=125;
    public static final int MAP=74;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int MODELDECLARATION=67;
    public static final int T__163=163;
    public static final int EXPRESSIONINBRACKETS=59;
    public static final int T__160=160;
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
    public static final int GRID=82;
    public static final int Annotation=23;
    public static final int GBODY=85;
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
    public static final int GKEYS=83;
    public static final int SWITCH=34;
    public static final int FeatureCall=60;
    public static final int T__122=122;
    public static final int LVLMODULE=86;
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
    public static final int T__104=104;
    public static final int POINT=9;
    public static final int T__103=103;
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
    // LvlParserRules.g:54:1: datasetRule : r= 'dataset' NAME 'over' formalParameter ob= '{' ( guard )? ( simpleFeatures )? ( simpleReference )* ( columnDefinition )* ( grid )* cb= '}' ;
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

        Lvl_LvlParserRules.grid_return grid8 = null;


        org.eclipse.epsilon.common.parse.AST r_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME1_tree=null;
        org.eclipse.epsilon.common.parse.AST string_literal2_tree=null;

        try {
            // LvlParserRules.g:59:3: (r= 'dataset' NAME 'over' formalParameter ob= '{' ( guard )? ( simpleFeatures )? ( simpleReference )* ( columnDefinition )* ( grid )* cb= '}' )
            // LvlParserRules.g:59:5: r= 'dataset' NAME 'over' formalParameter ob= '{' ( guard )? ( simpleFeatures )? ( simpleReference )* ( columnDefinition )* ( grid )* cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            r=(Token)match(input,157,FOLLOW_157_in_datasetRule88); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            r_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(r);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(r_tree, root_0);
            }
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_datasetRule91); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME1_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME1);
            adaptor.addChild(root_0, NAME1_tree);
            }
            string_literal2=(Token)match(input,158,FOLLOW_158_in_datasetRule93); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_datasetRule96);
            formalParameter3=gLvl.formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter3.getTree());
            ob=(Token)match(input,92,FOLLOW_92_in_datasetRule100); if (state.failed) return retval;
            // LvlParserRules.g:60:5: ( guard )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==159) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // LvlParserRules.g:0:0: guard
                    {
                    pushFollow(FOLLOW_guard_in_datasetRule107);
                    guard4=guard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, guard4.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:61:5: ( simpleFeatures )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==160) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // LvlParserRules.g:0:0: simpleFeatures
                    {
                    pushFollow(FOLLOW_simpleFeatures_in_datasetRule114);
                    simpleFeatures5=simpleFeatures();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleFeatures5.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:62:5: ( simpleReference )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==161) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LvlParserRules.g:0:0: simpleReference
            	    {
            	    pushFollow(FOLLOW_simpleReference_in_datasetRule121);
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

            // LvlParserRules.g:63:5: ( columnDefinition )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==162) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LvlParserRules.g:0:0: columnDefinition
            	    {
            	    pushFollow(FOLLOW_columnDefinition_in_datasetRule128);
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

            // LvlParserRules.g:64:5: ( grid )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==163) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // LvlParserRules.g:0:0: grid
            	    {
            	    pushFollow(FOLLOW_grid_in_datasetRule135);
            	    grid8=grid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, grid8.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            cb=(Token)match(input,93,FOLLOW_93_in_datasetRule142); if (state.failed) return retval;
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
    // LvlParserRules.g:69:1: guard : g= 'guard' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.guard_return guard() throws RecognitionException {
        Lvl_LvlParserRules.guard_return retval = new Lvl_LvlParserRules.guard_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token g=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock9 = null;


        org.eclipse.epsilon.common.parse.AST g_tree=null;

        try {
            // LvlParserRules.g:70:3: (g= 'guard' expressionOrStatementBlock )
            // LvlParserRules.g:70:5: g= 'guard' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            g=(Token)match(input,159,FOLLOW_159_in_guard162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            g_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(g);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(g_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_guard165);
            expressionOrStatementBlock9=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock9.getTree());
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
    // LvlParserRules.g:74:1: simpleFeatures : sf= 'attributes' ob= '[' NAME ( ',' NAME )* cb= ']' ;
    public final Lvl_LvlParserRules.simpleFeatures_return simpleFeatures() throws RecognitionException {
        Lvl_LvlParserRules.simpleFeatures_return retval = new Lvl_LvlParserRules.simpleFeatures_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token sf=null;
        Token ob=null;
        Token cb=null;
        Token NAME10=null;
        Token char_literal11=null;
        Token NAME12=null;

        org.eclipse.epsilon.common.parse.AST sf_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME10_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal11_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME12_tree=null;

        try {
            // LvlParserRules.g:79:3: (sf= 'attributes' ob= '[' NAME ( ',' NAME )* cb= ']' )
            // LvlParserRules.g:80:3: sf= 'attributes' ob= '[' NAME ( ',' NAME )* cb= ']'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            sf=(Token)match(input,160,FOLLOW_160_in_simpleFeatures193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            sf_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(sf);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(sf_tree, root_0);
            }
            ob=(Token)match(input,151,FOLLOW_151_in_simpleFeatures198); if (state.failed) return retval;
            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_simpleFeatures201); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME10_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);
            }
            // LvlParserRules.g:80:33: ( ',' NAME )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==90) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // LvlParserRules.g:80:34: ',' NAME
            	    {
            	    char_literal11=(Token)match(input,90,FOLLOW_90_in_simpleFeatures204); if (state.failed) return retval;
            	    NAME12=(Token)match(input,NAME,FOLLOW_NAME_in_simpleFeatures207); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME12_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME12);
            	    adaptor.addChild(root_0, NAME12_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            cb=(Token)match(input,152,FOLLOW_152_in_simpleFeatures213); if (state.failed) return retval;
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
    // LvlParserRules.g:84:1: simpleReference : sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )? ;
    public final Lvl_LvlParserRules.simpleReference_return simpleReference() throws RecognitionException {
        Lvl_LvlParserRules.simpleReference_return retval = new Lvl_LvlParserRules.simpleReference_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token sr=null;
        Token ob=null;
        Token cb=null;
        Token NAME13=null;
        Token NAME14=null;
        Token char_literal15=null;
        Token NAME16=null;

        org.eclipse.epsilon.common.parse.AST sr_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME13_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME14_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal15_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME16_tree=null;

        try {
            // LvlParserRules.g:89:3: (sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )? )
            // LvlParserRules.g:90:3: sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )?
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            sr=(Token)match(input,161,FOLLOW_161_in_simpleReference242); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            sr_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(sr);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(sr_tree, root_0);
            }
            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference245); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME13_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);
            }
            // LvlParserRules.g:90:24: (ob= '[' NAME ( ',' NAME )* cb= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==151) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // LvlParserRules.g:90:25: ob= '[' NAME ( ',' NAME )* cb= ']'
                    {
                    ob=(Token)match(input,151,FOLLOW_151_in_simpleReference250); if (state.failed) return retval;
                    NAME14=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME14_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME14);
                    adaptor.addChild(root_0, NAME14_tree);
                    }
                    // LvlParserRules.g:90:38: ( ',' NAME )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==90) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // LvlParserRules.g:90:39: ',' NAME
                    	    {
                    	    char_literal15=(Token)match(input,90,FOLLOW_90_in_simpleReference256); if (state.failed) return retval;
                    	    NAME16=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference259); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME16_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME16);
                    	    adaptor.addChild(root_0, NAME16_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    cb=(Token)match(input,152,FOLLOW_152_in_simpleReference265); if (state.failed) return retval;

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
    // LvlParserRules.g:94:1: columnDefinition : cd= 'column' NAME expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.columnDefinition_return columnDefinition() throws RecognitionException {
        Lvl_LvlParserRules.columnDefinition_return retval = new Lvl_LvlParserRules.columnDefinition_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token cd=null;
        Token NAME17=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock18 = null;


        org.eclipse.epsilon.common.parse.AST cd_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME17_tree=null;

        try {
            // LvlParserRules.g:95:3: (cd= 'column' NAME expressionOrStatementBlock )
            // LvlParserRules.g:95:5: cd= 'column' NAME expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            cd=(Token)match(input,162,FOLLOW_162_in_columnDefinition287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cd_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cd);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(cd_tree, root_0);
            }
            NAME17=(Token)match(input,NAME,FOLLOW_NAME_in_columnDefinition290); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME17_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME17);
            adaptor.addChild(root_0, NAME17_tree);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_columnDefinition292);
            expressionOrStatementBlock18=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock18.getTree());
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

    public static class grid_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start grid
    // LvlParserRules.g:99:1: grid : cd= 'grid' ob= '{' gkeys gheader gbody cb= '}' ;
    public final Lvl_LvlParserRules.grid_return grid() throws RecognitionException {
        Lvl_LvlParserRules.grid_return retval = new Lvl_LvlParserRules.grid_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token cd=null;
        Token ob=null;
        Token cb=null;
        Lvl_LvlParserRules.gkeys_return gkeys19 = null;

        Lvl_LvlParserRules.gheader_return gheader20 = null;

        Lvl_LvlParserRules.gbody_return gbody21 = null;


        org.eclipse.epsilon.common.parse.AST cd_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;

        try {
            // LvlParserRules.g:104:3: (cd= 'grid' ob= '{' gkeys gheader gbody cb= '}' )
            // LvlParserRules.g:104:5: cd= 'grid' ob= '{' gkeys gheader gbody cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            cd=(Token)match(input,163,FOLLOW_163_in_grid318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cd_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cd);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(cd_tree, root_0);
            }
            ob=(Token)match(input,92,FOLLOW_92_in_grid323); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ob_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(ob);
            adaptor.addChild(root_0, ob_tree);
            }
            pushFollow(FOLLOW_gkeys_in_grid329);
            gkeys19=gkeys();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gkeys19.getTree());
            pushFollow(FOLLOW_gheader_in_grid335);
            gheader20=gheader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gheader20.getTree());
            pushFollow(FOLLOW_gbody_in_grid341);
            gbody21=gbody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gbody21.getTree());
            cb=(Token)match(input,93,FOLLOW_93_in_grid347); if (state.failed) return retval;
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
    // LvlParserRules.g:112:1: gkeys : gk= 'keys' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.gkeys_return gkeys() throws RecognitionException {
        Lvl_LvlParserRules.gkeys_return retval = new Lvl_LvlParserRules.gkeys_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gk=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock22 = null;


        org.eclipse.epsilon.common.parse.AST gk_tree=null;

        try {
            // LvlParserRules.g:113:3: (gk= 'keys' expressionOrStatementBlock )
            // LvlParserRules.g:113:5: gk= 'keys' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gk=(Token)match(input,164,FOLLOW_164_in_gkeys366); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gk_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gk);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gk_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_gkeys369);
            expressionOrStatementBlock22=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock22.getTree());
            if ( state.backtracking==0 ) {
              gk.setType(GKEYS);
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

    public static class gheader_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start gheader
    // LvlParserRules.g:117:1: gheader : gh= 'header' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.gheader_return gheader() throws RecognitionException {
        Lvl_LvlParserRules.gheader_return retval = new Lvl_LvlParserRules.gheader_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gh=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock23 = null;


        org.eclipse.epsilon.common.parse.AST gh_tree=null;

        try {
            // LvlParserRules.g:118:3: (gh= 'header' expressionOrStatementBlock )
            // LvlParserRules.g:118:5: gh= 'header' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gh=(Token)match(input,165,FOLLOW_165_in_gheader388); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gh_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gh);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gh_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_gheader391);
            expressionOrStatementBlock23=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock23.getTree());
            if ( state.backtracking==0 ) {
              gh.setType(GHEADER);
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
    // $ANTLR end gheader

    public static class gbody_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start gbody
    // LvlParserRules.g:122:1: gbody : gb= 'body' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.gbody_return gbody() throws RecognitionException {
        Lvl_LvlParserRules.gbody_return retval = new Lvl_LvlParserRules.gbody_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gb=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock24 = null;


        org.eclipse.epsilon.common.parse.AST gb_tree=null;

        try {
            // LvlParserRules.g:123:3: (gb= 'body' expressionOrStatementBlock )
            // LvlParserRules.g:123:5: gb= 'body' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gb=(Token)match(input,166,FOLLOW_166_in_gbody410); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gb_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gb);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gb_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_gbody413);
            expressionOrStatementBlock24=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock24.getTree());
            if ( state.backtracking==0 ) {
              gb.setType(GBODY);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_157_in_datasetRule88 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_datasetRule91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_datasetRule93 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_formalParameter_in_datasetRule96 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_datasetRule100 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000F80000000L});
    public static final BitSet FOLLOW_guard_in_datasetRule107 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_simpleFeatures_in_datasetRule114 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_simpleReference_in_datasetRule121 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_columnDefinition_in_datasetRule128 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_grid_in_datasetRule135 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_93_in_datasetRule142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_guard162 = new BitSet(new long[]{0x0000000000000000L,0x0000000810000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_guard165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_simpleFeatures193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_simpleFeatures198 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleFeatures201 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_90_in_simpleFeatures204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleFeatures207 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_simpleFeatures213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_simpleReference242 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference245 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_simpleReference250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference253 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_90_in_simpleReference256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference259 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_simpleReference265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_columnDefinition287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_columnDefinition290 = new BitSet(new long[]{0x0000000000000000L,0x0000000810000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_columnDefinition292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_grid318 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_grid323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_gkeys_in_grid329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_gheader_in_grid335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_gbody_in_grid341 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_grid347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_gkeys366 = new BitSet(new long[]{0x0000000000000000L,0x0000000810000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_gkeys369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_gheader388 = new BitSet(new long[]{0x0000000000000000L,0x0000000810000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_gheader391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_gbody410 = new BitSet(new long[]{0x0000000000000000L,0x0000000810000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_gbody413 = new BitSet(new long[]{0x0000000000000002L});

}
