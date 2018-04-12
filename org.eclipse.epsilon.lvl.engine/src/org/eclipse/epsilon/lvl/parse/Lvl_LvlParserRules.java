package org.eclipse.epsilon.lvl.parse;

// $ANTLR 3.1b1 LvlParserRules.g 2018-04-12 18:25:43

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
    public static final int T__92=92;
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
    public static final int LVLMODULE=91;
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
    // LvlParserRules.g:56:1: datasetRule : r= 'dataset' NAME 'over' formalParameter ( from )? ob= '{' ( guard )? ( properties )? ( columnGenerator )* cb= '}' ;
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
            // LvlParserRules.g:61:3: (r= 'dataset' NAME 'over' formalParameter ( from )? ob= '{' ( guard )? ( properties )? ( columnGenerator )* cb= '}' )
            // LvlParserRules.g:61:5: r= 'dataset' NAME 'over' formalParameter ( from )? ob= '{' ( guard )? ( properties )? ( columnGenerator )* cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            r=(Token)match(input,166,FOLLOW_166_in_datasetRule98); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            r_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(r);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(r_tree, root_0);
            }
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_datasetRule101); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME1_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME1);
            adaptor.addChild(root_0, NAME1_tree);
            }
            string_literal2=(Token)match(input,167,FOLLOW_167_in_datasetRule103); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameter_in_datasetRule106);
            formalParameter3=gLvl.formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter3.getTree());
            // LvlParserRules.g:61:47: ( from )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==175) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // LvlParserRules.g:0:0: from
                    {
                    pushFollow(FOLLOW_from_in_datasetRule108);
                    from4=from();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, from4.getTree());

                    }
                    break;

            }

            ob=(Token)match(input,97,FOLLOW_97_in_datasetRule113); if (state.failed) return retval;
            // LvlParserRules.g:62:5: ( guard )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==164) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // LvlParserRules.g:0:0: guard
                    {
                    pushFollow(FOLLOW_guard_in_datasetRule120);
                    guard5=gLvl.guard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, guard5.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:63:5: ( properties )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==168) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // LvlParserRules.g:0:0: properties
                    {
                    pushFollow(FOLLOW_properties_in_datasetRule127);
                    properties6=properties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, properties6.getTree());

                    }
                    break;

            }

            // LvlParserRules.g:64:5: ( columnGenerator )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Annotation||LA4_0==106||(LA4_0>=169 && LA4_0<=171)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LvlParserRules.g:0:0: columnGenerator
            	    {
            	    pushFollow(FOLLOW_columnGenerator_in_datasetRule134);
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

            cb=(Token)match(input,98,FOLLOW_98_in_datasetRule141); if (state.failed) return retval;
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
    // LvlParserRules.g:69:1: columnGenerator : ( simpleReference | ( annotationBlock )? columnDefinition | ( annotationBlock )? grid );
    public final Lvl_LvlParserRules.columnGenerator_return columnGenerator() throws RecognitionException {
        Lvl_LvlParserRules.columnGenerator_return retval = new Lvl_LvlParserRules.columnGenerator_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Lvl_LvlParserRules.simpleReference_return simpleReference8 = null;

        Lvl_EolParserRules.annotationBlock_return annotationBlock9 = null;

        Lvl_LvlParserRules.columnDefinition_return columnDefinition10 = null;

        Lvl_EolParserRules.annotationBlock_return annotationBlock11 = null;

        Lvl_LvlParserRules.grid_return grid12 = null;



        try {
            // LvlParserRules.g:70:3: ( simpleReference | ( annotationBlock )? columnDefinition | ( annotationBlock )? grid )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 169:
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
                else if ( (true) ) {
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
            case 106:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred7_LvlParserRules()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
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
            case 170:
                {
                alt7=2;
                }
                break;
            case 171:
                {
                alt7=3;
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
                    // LvlParserRules.g:70:5: simpleReference
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    pushFollow(FOLLOW_simpleReference_in_columnGenerator159);
                    simpleReference8=simpleReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleReference8.getTree());

                    }
                    break;
                case 2 :
                    // LvlParserRules.g:71:5: ( annotationBlock )? columnDefinition
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    // LvlParserRules.g:71:5: ( annotationBlock )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==Annotation||LA5_0==106) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // LvlParserRules.g:0:0: annotationBlock
                            {
                            pushFollow(FOLLOW_annotationBlock_in_columnGenerator167);
                            annotationBlock9=gLvl.annotationBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationBlock9.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_columnDefinition_in_columnGenerator170);
                    columnDefinition10=columnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, columnDefinition10.getTree());

                    }
                    break;
                case 3 :
                    // LvlParserRules.g:72:5: ( annotationBlock )? grid
                    {
                    root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

                    // LvlParserRules.g:72:5: ( annotationBlock )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Annotation||LA6_0==106) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // LvlParserRules.g:0:0: annotationBlock
                            {
                            pushFollow(FOLLOW_annotationBlock_in_columnGenerator178);
                            annotationBlock11=gLvl.annotationBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationBlock11.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_grid_in_columnGenerator181);
                    grid12=grid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, grid12.getTree());

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

    public static class properties_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start properties
    // LvlParserRules.g:75:1: properties : sf= 'properties' ob= '[' NAME ( ',' NAME )* cb= ']' ;
    public final Lvl_LvlParserRules.properties_return properties() throws RecognitionException {
        Lvl_LvlParserRules.properties_return retval = new Lvl_LvlParserRules.properties_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token sf=null;
        Token ob=null;
        Token cb=null;
        Token NAME13=null;
        Token char_literal14=null;
        Token NAME15=null;

        org.eclipse.epsilon.common.parse.AST sf_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME13_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal14_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME15_tree=null;

        try {
            // LvlParserRules.g:80:3: (sf= 'properties' ob= '[' NAME ( ',' NAME )* cb= ']' )
            // LvlParserRules.g:81:3: sf= 'properties' ob= '[' NAME ( ',' NAME )* cb= ']'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            sf=(Token)match(input,168,FOLLOW_168_in_properties205); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            sf_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(sf);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(sf_tree, root_0);
            }
            ob=(Token)match(input,156,FOLLOW_156_in_properties210); if (state.failed) return retval;
            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_properties213); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME13_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);
            }
            // LvlParserRules.g:81:33: ( ',' NAME )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==95) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // LvlParserRules.g:81:34: ',' NAME
            	    {
            	    char_literal14=(Token)match(input,95,FOLLOW_95_in_properties216); if (state.failed) return retval;
            	    NAME15=(Token)match(input,NAME,FOLLOW_NAME_in_properties219); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME15_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME15);
            	    adaptor.addChild(root_0, NAME15_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            cb=(Token)match(input,157,FOLLOW_157_in_properties225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              sf.setType(PROPERTIES);
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
    // $ANTLR end properties

    public static class simpleReference_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start simpleReference
    // LvlParserRules.g:85:1: simpleReference : sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )? ;
    public final Lvl_LvlParserRules.simpleReference_return simpleReference() throws RecognitionException {
        Lvl_LvlParserRules.simpleReference_return retval = new Lvl_LvlParserRules.simpleReference_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token sr=null;
        Token ob=null;
        Token cb=null;
        Token NAME16=null;
        Token NAME17=null;
        Token char_literal18=null;
        Token NAME19=null;

        org.eclipse.epsilon.common.parse.AST sr_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME16_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME17_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal18_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME19_tree=null;

        try {
            // LvlParserRules.g:90:3: (sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )? )
            // LvlParserRules.g:91:3: sr= 'reference' NAME (ob= '[' NAME ( ',' NAME )* cb= ']' )?
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            sr=(Token)match(input,169,FOLLOW_169_in_simpleReference254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            sr_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(sr);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(sr_tree, root_0);
            }
            NAME16=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference257); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME16_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME16);
            adaptor.addChild(root_0, NAME16_tree);
            }
            // LvlParserRules.g:91:24: (ob= '[' NAME ( ',' NAME )* cb= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==156) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // LvlParserRules.g:91:25: ob= '[' NAME ( ',' NAME )* cb= ']'
                    {
                    ob=(Token)match(input,156,FOLLOW_156_in_simpleReference262); if (state.failed) return retval;
                    NAME17=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference265); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME17_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME17);
                    adaptor.addChild(root_0, NAME17_tree);
                    }
                    // LvlParserRules.g:91:38: ( ',' NAME )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==95) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // LvlParserRules.g:91:39: ',' NAME
                    	    {
                    	    char_literal18=(Token)match(input,95,FOLLOW_95_in_simpleReference268); if (state.failed) return retval;
                    	    NAME19=(Token)match(input,NAME,FOLLOW_NAME_in_simpleReference271); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME19_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME19);
                    	    adaptor.addChild(root_0, NAME19_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    cb=(Token)match(input,157,FOLLOW_157_in_simpleReference277); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              sr.setType(REFERENCE);
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
    // LvlParserRules.g:95:1: columnDefinition : cd= 'column' NAME expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.columnDefinition_return columnDefinition() throws RecognitionException {
        Lvl_LvlParserRules.columnDefinition_return retval = new Lvl_LvlParserRules.columnDefinition_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token cd=null;
        Token NAME20=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock21 = null;


        org.eclipse.epsilon.common.parse.AST cd_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME20_tree=null;

        try {
            // LvlParserRules.g:96:3: (cd= 'column' NAME expressionOrStatementBlock )
            // LvlParserRules.g:96:5: cd= 'column' NAME expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            cd=(Token)match(input,170,FOLLOW_170_in_columnDefinition299); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cd_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cd);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(cd_tree, root_0);
            }
            NAME20=(Token)match(input,NAME,FOLLOW_NAME_in_columnDefinition302); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME20_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME20);
            adaptor.addChild(root_0, NAME20_tree);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_columnDefinition304);
            expressionOrStatementBlock21=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock21.getTree());
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
    // $ANTLR end columnDefinition

    public static class grid_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start grid
    // LvlParserRules.g:100:1: grid : cd= 'grid' ob= '{' gkeys header gbody cb= '}' ;
    public final Lvl_LvlParserRules.grid_return grid() throws RecognitionException {
        Lvl_LvlParserRules.grid_return retval = new Lvl_LvlParserRules.grid_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token cd=null;
        Token ob=null;
        Token cb=null;
        Lvl_LvlParserRules.gkeys_return gkeys22 = null;

        Lvl_LvlParserRules.header_return header23 = null;

        Lvl_LvlParserRules.gbody_return gbody24 = null;


        org.eclipse.epsilon.common.parse.AST cd_tree=null;
        org.eclipse.epsilon.common.parse.AST ob_tree=null;
        org.eclipse.epsilon.common.parse.AST cb_tree=null;

        try {
            // LvlParserRules.g:105:3: (cd= 'grid' ob= '{' gkeys header gbody cb= '}' )
            // LvlParserRules.g:105:5: cd= 'grid' ob= '{' gkeys header gbody cb= '}'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            cd=(Token)match(input,171,FOLLOW_171_in_grid330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            cd_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(cd);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(cd_tree, root_0);
            }
            ob=(Token)match(input,97,FOLLOW_97_in_grid335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ob_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(ob);
            adaptor.addChild(root_0, ob_tree);
            }
            pushFollow(FOLLOW_gkeys_in_grid341);
            gkeys22=gkeys();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gkeys22.getTree());
            pushFollow(FOLLOW_header_in_grid347);
            header23=header();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, header23.getTree());
            pushFollow(FOLLOW_gbody_in_grid353);
            gbody24=gbody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gbody24.getTree());
            cb=(Token)match(input,98,FOLLOW_98_in_grid359); if (state.failed) return retval;
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
    // LvlParserRules.g:113:1: gkeys : gk= 'keys' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.gkeys_return gkeys() throws RecognitionException {
        Lvl_LvlParserRules.gkeys_return retval = new Lvl_LvlParserRules.gkeys_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gk=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock25 = null;


        org.eclipse.epsilon.common.parse.AST gk_tree=null;

        try {
            // LvlParserRules.g:114:3: (gk= 'keys' expressionOrStatementBlock )
            // LvlParserRules.g:114:5: gk= 'keys' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gk=(Token)match(input,172,FOLLOW_172_in_gkeys378); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gk_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gk);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gk_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_gkeys381);
            expressionOrStatementBlock25=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock25.getTree());
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
    // LvlParserRules.g:118:1: header : gh= 'header' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.header_return header() throws RecognitionException {
        Lvl_LvlParserRules.header_return retval = new Lvl_LvlParserRules.header_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gh=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock26 = null;


        org.eclipse.epsilon.common.parse.AST gh_tree=null;

        try {
            // LvlParserRules.g:119:3: (gh= 'header' expressionOrStatementBlock )
            // LvlParserRules.g:119:5: gh= 'header' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gh=(Token)match(input,173,FOLLOW_173_in_header400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gh_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gh);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gh_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_header403);
            expressionOrStatementBlock26=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock26.getTree());
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
    // LvlParserRules.g:123:1: gbody : gb= 'body' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.gbody_return gbody() throws RecognitionException {
        Lvl_LvlParserRules.gbody_return retval = new Lvl_LvlParserRules.gbody_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token gb=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock27 = null;


        org.eclipse.epsilon.common.parse.AST gb_tree=null;

        try {
            // LvlParserRules.g:124:3: (gb= 'body' expressionOrStatementBlock )
            // LvlParserRules.g:124:5: gb= 'body' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            gb=(Token)match(input,174,FOLLOW_174_in_gbody422); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            gb_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(gb);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(gb_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_gbody425);
            expressionOrStatementBlock27=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock27.getTree());
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

    public static class nameslist_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nameslist
    // LvlParserRules.g:128:1: nameslist : nl= '[' NAME ( ',' NAME )* ']' ;
    public final Lvl_LvlParserRules.nameslist_return nameslist() throws RecognitionException {
        Lvl_LvlParserRules.nameslist_return retval = new Lvl_LvlParserRules.nameslist_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token nl=null;
        Token NAME28=null;
        Token char_literal29=null;
        Token NAME30=null;
        Token char_literal31=null;

        org.eclipse.epsilon.common.parse.AST nl_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME28_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal29_tree=null;
        org.eclipse.epsilon.common.parse.AST NAME30_tree=null;
        org.eclipse.epsilon.common.parse.AST char_literal31_tree=null;

        try {
            // LvlParserRules.g:129:2: (nl= '[' NAME ( ',' NAME )* ']' )
            // LvlParserRules.g:129:4: nl= '[' NAME ( ',' NAME )* ']'
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            nl=(Token)match(input,156,FOLLOW_156_in_nameslist443); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            nl_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(nl);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(nl_tree, root_0);
            }
            NAME28=(Token)match(input,NAME,FOLLOW_NAME_in_nameslist446); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME28_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME28);
            adaptor.addChild(root_0, NAME28_tree);
            }
            // LvlParserRules.g:129:17: ( ',' NAME )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==95) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // LvlParserRules.g:129:18: ',' NAME
            	    {
            	    char_literal29=(Token)match(input,95,FOLLOW_95_in_nameslist449); if (state.failed) return retval;
            	    NAME30=(Token)match(input,NAME,FOLLOW_NAME_in_nameslist452); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME30_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(NAME30);
            	    adaptor.addChild(root_0, NAME30_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal31=(Token)match(input,157,FOLLOW_157_in_nameslist456); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              nl.setType(NAMESLIST);
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
    // $ANTLR end nameslist

    public static class from_return extends ParserRuleReturnScope {
        org.eclipse.epsilon.common.parse.AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start from
    // LvlParserRules.g:133:1: from : ff= 'from' expressionOrStatementBlock ;
    public final Lvl_LvlParserRules.from_return from() throws RecognitionException {
        Lvl_LvlParserRules.from_return retval = new Lvl_LvlParserRules.from_return();
        retval.start = input.LT(1);

        org.eclipse.epsilon.common.parse.AST root_0 = null;

        Token ff=null;
        Lvl_EolParserRules.expressionOrStatementBlock_return expressionOrStatementBlock32 = null;


        org.eclipse.epsilon.common.parse.AST ff_tree=null;

        try {
            // LvlParserRules.g:134:3: (ff= 'from' expressionOrStatementBlock )
            // LvlParserRules.g:134:5: ff= 'from' expressionOrStatementBlock
            {
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.nil();

            ff=(Token)match(input,175,FOLLOW_175_in_from476); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ff_tree = (org.eclipse.epsilon.common.parse.AST)adaptor.create(ff);
            root_0 = (org.eclipse.epsilon.common.parse.AST)adaptor.becomeRoot(ff_tree, root_0);
            }
            pushFollow(FOLLOW_expressionOrStatementBlock_in_from479);
            expressionOrStatementBlock32=gLvl.expressionOrStatementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrStatementBlock32.getTree());
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
        // LvlParserRules.g:71:5: ( ( annotationBlock )? columnDefinition )
        // LvlParserRules.g:71:5: ( annotationBlock )? columnDefinition
        {
        // LvlParserRules.g:71:5: ( annotationBlock )?
        int alt12=2;
        int LA12_0 = input.LA(1);

        if ( (LA12_0==Annotation||LA12_0==106) ) {
            alt12=1;
        }
        switch (alt12) {
            case 1 :
                // LvlParserRules.g:0:0: annotationBlock
                {
                pushFollow(FOLLOW_annotationBlock_in_synpred7_LvlParserRules167);
                gLvl.annotationBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_columnDefinition_in_synpred7_LvlParserRules170);
        columnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_LvlParserRules

    // Delegated rules

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


 

    public static final BitSet FOLLOW_166_in_datasetRule98 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_datasetRule101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_datasetRule103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_formalParameter_in_datasetRule106 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_from_in_datasetRule108 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_datasetRule113 = new BitSet(new long[]{0x0000000000800000L,0x0000040400000000L,0x00000F1000000000L});
    public static final BitSet FOLLOW_guard_in_datasetRule120 = new BitSet(new long[]{0x0000000000800000L,0x0000040400000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_properties_in_datasetRule127 = new BitSet(new long[]{0x0000000000800000L,0x0000040400000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_columnGenerator_in_datasetRule134 = new BitSet(new long[]{0x0000000000800000L,0x0000040400000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_98_in_datasetRule141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleReference_in_columnGenerator159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationBlock_in_columnGenerator167 = new BitSet(new long[]{0x0000000000800000L,0x0000040000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_columnDefinition_in_columnGenerator170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationBlock_in_columnGenerator178 = new BitSet(new long[]{0x0000000000800000L,0x0000040400000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_grid_in_columnGenerator181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_properties205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_properties210 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_properties213 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_95_in_properties216 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_properties219 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_properties225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_simpleReference254 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_simpleReference262 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference265 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_95_in_simpleReference268 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_simpleReference271 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_simpleReference277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_columnDefinition299 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_columnDefinition302 = new BitSet(new long[]{0x0000000000000000L,0x0000010200000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_columnDefinition304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_grid330 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_grid335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_gkeys_in_grid341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_header_in_grid347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_gbody_in_grid353 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_grid359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_gkeys378 = new BitSet(new long[]{0x0000000000000000L,0x0000010200000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_gkeys381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_header400 = new BitSet(new long[]{0x0000000000000000L,0x0000010200000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_header403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_gbody422 = new BitSet(new long[]{0x0000000000000000L,0x0000010200000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_gbody425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_nameslist443 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_nameslist446 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_95_in_nameslist449 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_nameslist452 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_nameslist456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_from476 = new BitSet(new long[]{0x0000000000000000L,0x0000010200000000L});
    public static final BitSet FOLLOW_expressionOrStatementBlock_in_from479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationBlock_in_synpred7_LvlParserRules167 = new BitSet(new long[]{0x0000000000800000L,0x0000040000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_columnDefinition_in_synpred7_LvlParserRules170 = new BitSet(new long[]{0x0000000000000002L});

}
