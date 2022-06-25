package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'there_is_one'", "'the'", "','", "'and'", "'there_are'", "'('", "')'", "'one'", "'a'", "'an'", "'one_or_more'", "'zero_or_more'", "'has'", "'is_composed_by'", "'contains'", "'is'", "'are_each'", "'it_is_possible_that'", "'it_is_possible_to'", "'it_is_possible'", "'if'", "'then'", "';'", "'else'", "'or'", "'in'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_stmt_0_0= ruleStmt ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_stmt_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_stmt_0_0= ruleStmt ) )* )
            // InternalMyDsl.g:78:2: ( (lv_stmt_0_0= ruleStmt ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_stmt_0_0= ruleStmt ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==16||(LA1_0>=19 && LA1_0<=21)||(LA1_0>=29 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_stmt_0_0= ruleStmt )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_stmt_0_0= ruleStmt )
            	    // InternalMyDsl.g:80:4: lv_stmt_0_0= ruleStmt
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStmtStmtParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_stmt_0_0=ruleStmt();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"stmt",
            	    					lv_stmt_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Stmt");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStmt"
    // InternalMyDsl.g:100:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMyDsl.g:100:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMyDsl.g:101:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMyDsl.g:107:1: ruleStmt returns [EObject current=null] : ( (this_ExistenceStmt_0= ruleExistenceStmt | this_CompositionStmt_1= ruleCompositionStmt | this_InheritanceStmt_2= ruleInheritanceStmt | this_OperationStmt_3= ruleOperationStmt ) otherlv_4= '.' ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ExistenceStmt_0 = null;

        EObject this_CompositionStmt_1 = null;

        EObject this_InheritanceStmt_2 = null;

        EObject this_OperationStmt_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (this_ExistenceStmt_0= ruleExistenceStmt | this_CompositionStmt_1= ruleCompositionStmt | this_InheritanceStmt_2= ruleInheritanceStmt | this_OperationStmt_3= ruleOperationStmt ) otherlv_4= '.' ) )
            // InternalMyDsl.g:114:2: ( (this_ExistenceStmt_0= ruleExistenceStmt | this_CompositionStmt_1= ruleCompositionStmt | this_InheritanceStmt_2= ruleInheritanceStmt | this_OperationStmt_3= ruleOperationStmt ) otherlv_4= '.' )
            {
            // InternalMyDsl.g:114:2: ( (this_ExistenceStmt_0= ruleExistenceStmt | this_CompositionStmt_1= ruleCompositionStmt | this_InheritanceStmt_2= ruleInheritanceStmt | this_OperationStmt_3= ruleOperationStmt ) otherlv_4= '.' )
            // InternalMyDsl.g:115:3: (this_ExistenceStmt_0= ruleExistenceStmt | this_CompositionStmt_1= ruleCompositionStmt | this_InheritanceStmt_2= ruleInheritanceStmt | this_OperationStmt_3= ruleOperationStmt ) otherlv_4= '.'
            {
            // InternalMyDsl.g:115:3: (this_ExistenceStmt_0= ruleExistenceStmt | this_CompositionStmt_1= ruleCompositionStmt | this_InheritanceStmt_2= ruleInheritanceStmt | this_OperationStmt_3= ruleOperationStmt )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:116:4: this_ExistenceStmt_0= ruleExistenceStmt
                    {

                    				newCompositeNode(grammarAccess.getStmtAccess().getExistenceStmtParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_ExistenceStmt_0=ruleExistenceStmt();

                    state._fsp--;


                    				current = this_ExistenceStmt_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:125:4: this_CompositionStmt_1= ruleCompositionStmt
                    {

                    				newCompositeNode(grammarAccess.getStmtAccess().getCompositionStmtParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_CompositionStmt_1=ruleCompositionStmt();

                    state._fsp--;


                    				current = this_CompositionStmt_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:134:4: this_InheritanceStmt_2= ruleInheritanceStmt
                    {

                    				newCompositeNode(grammarAccess.getStmtAccess().getInheritanceStmtParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_InheritanceStmt_2=ruleInheritanceStmt();

                    state._fsp--;


                    				current = this_InheritanceStmt_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:143:4: this_OperationStmt_3= ruleOperationStmt
                    {

                    				newCompositeNode(grammarAccess.getStmtAccess().getOperationStmtParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_OperationStmt_3=ruleOperationStmt();

                    state._fsp--;


                    				current = this_OperationStmt_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStmtAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleExistenceStmt"
    // InternalMyDsl.g:160:1: entryRuleExistenceStmt returns [EObject current=null] : iv_ruleExistenceStmt= ruleExistenceStmt EOF ;
    public final EObject entryRuleExistenceStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceStmt = null;


        try {
            // InternalMyDsl.g:160:54: (iv_ruleExistenceStmt= ruleExistenceStmt EOF )
            // InternalMyDsl.g:161:2: iv_ruleExistenceStmt= ruleExistenceStmt EOF
            {
             newCompositeNode(grammarAccess.getExistenceStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceStmt=ruleExistenceStmt();

            state._fsp--;

             current =iv_ruleExistenceStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceStmt"


    // $ANTLR start "ruleExistenceStmt"
    // InternalMyDsl.g:167:1: ruleExistenceStmt returns [EObject current=null] : (this_ExistenceDefiniteStmt_0= ruleExistenceDefiniteStmt | this_ExistenceIndefiniteStmt_1= ruleExistenceIndefiniteStmt ) ;
    public final EObject ruleExistenceStmt() throws RecognitionException {
        EObject current = null;

        EObject this_ExistenceDefiniteStmt_0 = null;

        EObject this_ExistenceIndefiniteStmt_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:173:2: ( (this_ExistenceDefiniteStmt_0= ruleExistenceDefiniteStmt | this_ExistenceIndefiniteStmt_1= ruleExistenceIndefiniteStmt ) )
            // InternalMyDsl.g:174:2: (this_ExistenceDefiniteStmt_0= ruleExistenceDefiniteStmt | this_ExistenceIndefiniteStmt_1= ruleExistenceIndefiniteStmt )
            {
            // InternalMyDsl.g:174:2: (this_ExistenceDefiniteStmt_0= ruleExistenceDefiniteStmt | this_ExistenceIndefiniteStmt_1= ruleExistenceIndefiniteStmt )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:175:3: this_ExistenceDefiniteStmt_0= ruleExistenceDefiniteStmt
                    {

                    			newCompositeNode(grammarAccess.getExistenceStmtAccess().getExistenceDefiniteStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistenceDefiniteStmt_0=ruleExistenceDefiniteStmt();

                    state._fsp--;


                    			current = this_ExistenceDefiniteStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:184:3: this_ExistenceIndefiniteStmt_1= ruleExistenceIndefiniteStmt
                    {

                    			newCompositeNode(grammarAccess.getExistenceStmtAccess().getExistenceIndefiniteStmtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistenceIndefiniteStmt_1=ruleExistenceIndefiniteStmt();

                    state._fsp--;


                    			current = this_ExistenceIndefiniteStmt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceStmt"


    // $ANTLR start "entryRuleExistenceDefiniteStmt"
    // InternalMyDsl.g:196:1: entryRuleExistenceDefiniteStmt returns [EObject current=null] : iv_ruleExistenceDefiniteStmt= ruleExistenceDefiniteStmt EOF ;
    public final EObject entryRuleExistenceDefiniteStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceDefiniteStmt = null;


        try {
            // InternalMyDsl.g:196:62: (iv_ruleExistenceDefiniteStmt= ruleExistenceDefiniteStmt EOF )
            // InternalMyDsl.g:197:2: iv_ruleExistenceDefiniteStmt= ruleExistenceDefiniteStmt EOF
            {
             newCompositeNode(grammarAccess.getExistenceDefiniteStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceDefiniteStmt=ruleExistenceDefiniteStmt();

            state._fsp--;

             current =iv_ruleExistenceDefiniteStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceDefiniteStmt"


    // $ANTLR start "ruleExistenceDefiniteStmt"
    // InternalMyDsl.g:203:1: ruleExistenceDefiniteStmt returns [EObject current=null] : (otherlv_0= 'there_is_one' ( (lv_definite_1_0= ruleExistenceDefinitePhrase ) ) ) ;
    public final EObject ruleExistenceDefiniteStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_definite_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:209:2: ( (otherlv_0= 'there_is_one' ( (lv_definite_1_0= ruleExistenceDefinitePhrase ) ) ) )
            // InternalMyDsl.g:210:2: (otherlv_0= 'there_is_one' ( (lv_definite_1_0= ruleExistenceDefinitePhrase ) ) )
            {
            // InternalMyDsl.g:210:2: (otherlv_0= 'there_is_one' ( (lv_definite_1_0= ruleExistenceDefinitePhrase ) ) )
            // InternalMyDsl.g:211:3: otherlv_0= 'there_is_one' ( (lv_definite_1_0= ruleExistenceDefinitePhrase ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExistenceDefiniteStmtAccess().getThere_is_oneKeyword_0());
            		
            // InternalMyDsl.g:215:3: ( (lv_definite_1_0= ruleExistenceDefinitePhrase ) )
            // InternalMyDsl.g:216:4: (lv_definite_1_0= ruleExistenceDefinitePhrase )
            {
            // InternalMyDsl.g:216:4: (lv_definite_1_0= ruleExistenceDefinitePhrase )
            // InternalMyDsl.g:217:5: lv_definite_1_0= ruleExistenceDefinitePhrase
            {

            					newCompositeNode(grammarAccess.getExistenceDefiniteStmtAccess().getDefiniteExistenceDefinitePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_definite_1_0=ruleExistenceDefinitePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceDefiniteStmtRule());
            					}
            					set(
            						current,
            						"definite",
            						lv_definite_1_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceDefinitePhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceDefiniteStmt"


    // $ANTLR start "entryRuleExistenceDefinitePhrase"
    // InternalMyDsl.g:238:1: entryRuleExistenceDefinitePhrase returns [EObject current=null] : iv_ruleExistenceDefinitePhrase= ruleExistenceDefinitePhrase EOF ;
    public final EObject entryRuleExistenceDefinitePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceDefinitePhrase = null;


        try {
            // InternalMyDsl.g:238:64: (iv_ruleExistenceDefinitePhrase= ruleExistenceDefinitePhrase EOF )
            // InternalMyDsl.g:239:2: iv_ruleExistenceDefinitePhrase= ruleExistenceDefinitePhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceDefinitePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceDefinitePhrase=ruleExistenceDefinitePhrase();

            state._fsp--;

             current =iv_ruleExistenceDefinitePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceDefinitePhrase"


    // $ANTLR start "ruleExistenceDefinitePhrase"
    // InternalMyDsl.g:245:1: ruleExistenceDefinitePhrase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExistenceDefinitePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:251:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:252:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:252:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:253:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:253:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:254:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExistenceDefinitePhraseAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExistenceDefinitePhraseRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceDefinitePhrase"


    // $ANTLR start "entryRuleExistenceDefiniteRefPhrase"
    // InternalMyDsl.g:273:1: entryRuleExistenceDefiniteRefPhrase returns [EObject current=null] : iv_ruleExistenceDefiniteRefPhrase= ruleExistenceDefiniteRefPhrase EOF ;
    public final EObject entryRuleExistenceDefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceDefiniteRefPhrase = null;


        try {
            // InternalMyDsl.g:273:67: (iv_ruleExistenceDefiniteRefPhrase= ruleExistenceDefiniteRefPhrase EOF )
            // InternalMyDsl.g:274:2: iv_ruleExistenceDefiniteRefPhrase= ruleExistenceDefiniteRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceDefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceDefiniteRefPhrase=ruleExistenceDefiniteRefPhrase();

            state._fsp--;

             current =iv_ruleExistenceDefiniteRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceDefiniteRefPhrase"


    // $ANTLR start "ruleExistenceDefiniteRefPhrase"
    // InternalMyDsl.g:280:1: ruleExistenceDefiniteRefPhrase returns [EObject current=null] : (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExistenceDefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:286:2: ( (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:287:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:287:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:288:3: otherlv_0= 'the' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExistenceDefiniteRefPhraseAccess().getTheKeyword_0());
            		
            // InternalMyDsl.g:292:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:293:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:293:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:294:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExistenceDefiniteRefPhraseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getExistenceDefiniteRefPhraseAccess().getRefExistenceDefinitePhraseCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceDefiniteRefPhrase"


    // $ANTLR start "entryRuleExistenceDefiniteRefListPhrase"
    // InternalMyDsl.g:309:1: entryRuleExistenceDefiniteRefListPhrase returns [EObject current=null] : iv_ruleExistenceDefiniteRefListPhrase= ruleExistenceDefiniteRefListPhrase EOF ;
    public final EObject entryRuleExistenceDefiniteRefListPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceDefiniteRefListPhrase = null;


        try {
            // InternalMyDsl.g:309:71: (iv_ruleExistenceDefiniteRefListPhrase= ruleExistenceDefiniteRefListPhrase EOF )
            // InternalMyDsl.g:310:2: iv_ruleExistenceDefiniteRefListPhrase= ruleExistenceDefiniteRefListPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceDefiniteRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceDefiniteRefListPhrase=ruleExistenceDefiniteRefListPhrase();

            state._fsp--;

             current =iv_ruleExistenceDefiniteRefListPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceDefiniteRefListPhrase"


    // $ANTLR start "ruleExistenceDefiniteRefListPhrase"
    // InternalMyDsl.g:316:1: ruleExistenceDefiniteRefListPhrase returns [EObject current=null] : ( ( (lv_elements_0_0= ruleExistenceDefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) ) )* ) ;
    public final EObject ruleExistenceDefiniteRefListPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:322:2: ( ( ( (lv_elements_0_0= ruleExistenceDefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) ) )* ) )
            // InternalMyDsl.g:323:2: ( ( (lv_elements_0_0= ruleExistenceDefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) ) )* )
            {
            // InternalMyDsl.g:323:2: ( ( (lv_elements_0_0= ruleExistenceDefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) ) )* )
            // InternalMyDsl.g:324:3: ( (lv_elements_0_0= ruleExistenceDefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) ) )*
            {
            // InternalMyDsl.g:324:3: ( (lv_elements_0_0= ruleExistenceDefiniteRefPhrase ) )
            // InternalMyDsl.g:325:4: (lv_elements_0_0= ruleExistenceDefiniteRefPhrase )
            {
            // InternalMyDsl.g:325:4: (lv_elements_0_0= ruleExistenceDefiniteRefPhrase )
            // InternalMyDsl.g:326:5: lv_elements_0_0= ruleExistenceDefiniteRefPhrase
            {

            					newCompositeNode(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsExistenceDefiniteRefPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_0_0=ruleExistenceDefiniteRefPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceDefiniteRefListPhraseRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceDefiniteRefPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:343:3: (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:344:4: otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExistenceDefiniteRefListPhraseAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:348:4: (otherlv_2= 'and' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==15) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDsl.g:349:5: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            	            					newLeafNode(otherlv_2, grammarAccess.getExistenceDefiniteRefListPhraseAccess().getAndKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:354:4: ( (lv_elements_3_0= ruleExistenceDefiniteRefPhrase ) )
            	    // InternalMyDsl.g:355:5: (lv_elements_3_0= ruleExistenceDefiniteRefPhrase )
            	    {
            	    // InternalMyDsl.g:355:5: (lv_elements_3_0= ruleExistenceDefiniteRefPhrase )
            	    // InternalMyDsl.g:356:6: lv_elements_3_0= ruleExistenceDefiniteRefPhrase
            	    {

            	    						newCompositeNode(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsExistenceDefiniteRefPhraseParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleExistenceDefiniteRefPhrase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExistenceDefiniteRefListPhraseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ExistenceDefiniteRefPhrase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceDefiniteRefListPhrase"


    // $ANTLR start "entryRuleExistenceIndefiniteStmt"
    // InternalMyDsl.g:378:1: entryRuleExistenceIndefiniteStmt returns [EObject current=null] : iv_ruleExistenceIndefiniteStmt= ruleExistenceIndefiniteStmt EOF ;
    public final EObject entryRuleExistenceIndefiniteStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceIndefiniteStmt = null;


        try {
            // InternalMyDsl.g:378:64: (iv_ruleExistenceIndefiniteStmt= ruleExistenceIndefiniteStmt EOF )
            // InternalMyDsl.g:379:2: iv_ruleExistenceIndefiniteStmt= ruleExistenceIndefiniteStmt EOF
            {
             newCompositeNode(grammarAccess.getExistenceIndefiniteStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceIndefiniteStmt=ruleExistenceIndefiniteStmt();

            state._fsp--;

             current =iv_ruleExistenceIndefiniteStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceIndefiniteStmt"


    // $ANTLR start "ruleExistenceIndefiniteStmt"
    // InternalMyDsl.g:385:1: ruleExistenceIndefiniteStmt returns [EObject current=null] : (otherlv_0= 'there_are' ( (lv_plural_1_0= ruleExistencePluralIndefinitePhrase ) ) otherlv_2= '(' ( (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase ) ) otherlv_4= ')' ) ;
    public final EObject ruleExistenceIndefiniteStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_plural_1_0 = null;

        EObject lv_singular_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:391:2: ( (otherlv_0= 'there_are' ( (lv_plural_1_0= ruleExistencePluralIndefinitePhrase ) ) otherlv_2= '(' ( (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:392:2: (otherlv_0= 'there_are' ( (lv_plural_1_0= ruleExistencePluralIndefinitePhrase ) ) otherlv_2= '(' ( (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:392:2: (otherlv_0= 'there_are' ( (lv_plural_1_0= ruleExistencePluralIndefinitePhrase ) ) otherlv_2= '(' ( (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase ) ) otherlv_4= ')' )
            // InternalMyDsl.g:393:3: otherlv_0= 'there_are' ( (lv_plural_1_0= ruleExistencePluralIndefinitePhrase ) ) otherlv_2= '(' ( (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExistenceIndefiniteStmtAccess().getThere_areKeyword_0());
            		
            // InternalMyDsl.g:397:3: ( (lv_plural_1_0= ruleExistencePluralIndefinitePhrase ) )
            // InternalMyDsl.g:398:4: (lv_plural_1_0= ruleExistencePluralIndefinitePhrase )
            {
            // InternalMyDsl.g:398:4: (lv_plural_1_0= ruleExistencePluralIndefinitePhrase )
            // InternalMyDsl.g:399:5: lv_plural_1_0= ruleExistencePluralIndefinitePhrase
            {

            					newCompositeNode(grammarAccess.getExistenceIndefiniteStmtAccess().getPluralExistencePluralIndefinitePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_plural_1_0=ruleExistencePluralIndefinitePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceIndefiniteStmtRule());
            					}
            					set(
            						current,
            						"plural",
            						lv_plural_1_0,
            						"org.xtext.example.mydsl.MyDsl.ExistencePluralIndefinitePhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExistenceIndefiniteStmtAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:420:3: ( (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase ) )
            // InternalMyDsl.g:421:4: (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase )
            {
            // InternalMyDsl.g:421:4: (lv_singular_3_0= ruleExistenceSingularIndefinitePhrase )
            // InternalMyDsl.g:422:5: lv_singular_3_0= ruleExistenceSingularIndefinitePhrase
            {

            					newCompositeNode(grammarAccess.getExistenceIndefiniteStmtAccess().getSingularExistenceSingularIndefinitePhraseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_singular_3_0=ruleExistenceSingularIndefinitePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceIndefiniteStmtRule());
            					}
            					set(
            						current,
            						"singular",
            						lv_singular_3_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceSingularIndefinitePhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExistenceIndefiniteStmtAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceIndefiniteStmt"


    // $ANTLR start "entryRuleExistenceSingularIndefinitePhrase"
    // InternalMyDsl.g:447:1: entryRuleExistenceSingularIndefinitePhrase returns [EObject current=null] : iv_ruleExistenceSingularIndefinitePhrase= ruleExistenceSingularIndefinitePhrase EOF ;
    public final EObject entryRuleExistenceSingularIndefinitePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceSingularIndefinitePhrase = null;


        try {
            // InternalMyDsl.g:447:74: (iv_ruleExistenceSingularIndefinitePhrase= ruleExistenceSingularIndefinitePhrase EOF )
            // InternalMyDsl.g:448:2: iv_ruleExistenceSingularIndefinitePhrase= ruleExistenceSingularIndefinitePhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceSingularIndefinitePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceSingularIndefinitePhrase=ruleExistenceSingularIndefinitePhrase();

            state._fsp--;

             current =iv_ruleExistenceSingularIndefinitePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceSingularIndefinitePhrase"


    // $ANTLR start "ruleExistenceSingularIndefinitePhrase"
    // InternalMyDsl.g:454:1: ruleExistenceSingularIndefinitePhrase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExistenceSingularIndefinitePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:460:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:461:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:461:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:462:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:462:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:463:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExistenceSingularIndefinitePhraseAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExistenceSingularIndefinitePhraseRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceSingularIndefinitePhrase"


    // $ANTLR start "entryRuleExistencePluralIndefinitePhrase"
    // InternalMyDsl.g:482:1: entryRuleExistencePluralIndefinitePhrase returns [EObject current=null] : iv_ruleExistencePluralIndefinitePhrase= ruleExistencePluralIndefinitePhrase EOF ;
    public final EObject entryRuleExistencePluralIndefinitePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistencePluralIndefinitePhrase = null;


        try {
            // InternalMyDsl.g:482:72: (iv_ruleExistencePluralIndefinitePhrase= ruleExistencePluralIndefinitePhrase EOF )
            // InternalMyDsl.g:483:2: iv_ruleExistencePluralIndefinitePhrase= ruleExistencePluralIndefinitePhrase EOF
            {
             newCompositeNode(grammarAccess.getExistencePluralIndefinitePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistencePluralIndefinitePhrase=ruleExistencePluralIndefinitePhrase();

            state._fsp--;

             current =iv_ruleExistencePluralIndefinitePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistencePluralIndefinitePhrase"


    // $ANTLR start "ruleExistencePluralIndefinitePhrase"
    // InternalMyDsl.g:489:1: ruleExistencePluralIndefinitePhrase returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExistencePluralIndefinitePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:495:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:496:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:496:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:497:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:497:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:498:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExistencePluralIndefinitePhraseAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExistencePluralIndefinitePhraseRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistencePluralIndefinitePhrase"


    // $ANTLR start "entryRuleExistenceSingularIndefiniteRefPhrase"
    // InternalMyDsl.g:517:1: entryRuleExistenceSingularIndefiniteRefPhrase returns [EObject current=null] : iv_ruleExistenceSingularIndefiniteRefPhrase= ruleExistenceSingularIndefiniteRefPhrase EOF ;
    public final EObject entryRuleExistenceSingularIndefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceSingularIndefiniteRefPhrase = null;


        try {
            // InternalMyDsl.g:517:77: (iv_ruleExistenceSingularIndefiniteRefPhrase= ruleExistenceSingularIndefiniteRefPhrase EOF )
            // InternalMyDsl.g:518:2: iv_ruleExistenceSingularIndefiniteRefPhrase= ruleExistenceSingularIndefiniteRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceSingularIndefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceSingularIndefiniteRefPhrase=ruleExistenceSingularIndefiniteRefPhrase();

            state._fsp--;

             current =iv_ruleExistenceSingularIndefiniteRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceSingularIndefiniteRefPhrase"


    // $ANTLR start "ruleExistenceSingularIndefiniteRefPhrase"
    // InternalMyDsl.g:524:1: ruleExistenceSingularIndefiniteRefPhrase returns [EObject current=null] : ( (otherlv_0= 'one' | otherlv_1= 'a' | otherlv_2= 'an' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExistenceSingularIndefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:530:2: ( ( (otherlv_0= 'one' | otherlv_1= 'a' | otherlv_2= 'an' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMyDsl.g:531:2: ( (otherlv_0= 'one' | otherlv_1= 'a' | otherlv_2= 'an' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMyDsl.g:531:2: ( (otherlv_0= 'one' | otherlv_1= 'a' | otherlv_2= 'an' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDsl.g:532:3: (otherlv_0= 'one' | otherlv_1= 'a' | otherlv_2= 'an' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalMyDsl.g:532:3: (otherlv_0= 'one' | otherlv_1= 'a' | otherlv_2= 'an' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:533:4: otherlv_0= 'one'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getOneKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:538:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:543:4: otherlv_2= 'an'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAnKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:548:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:549:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:549:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:550:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExistenceSingularIndefiniteRefPhraseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getRefExistenceSingularIndefinitePhraseCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceSingularIndefiniteRefPhrase"


    // $ANTLR start "entryRuleExistencePluralIndefiniteRefPhrase"
    // InternalMyDsl.g:565:1: entryRuleExistencePluralIndefiniteRefPhrase returns [EObject current=null] : iv_ruleExistencePluralIndefiniteRefPhrase= ruleExistencePluralIndefiniteRefPhrase EOF ;
    public final EObject entryRuleExistencePluralIndefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistencePluralIndefiniteRefPhrase = null;


        try {
            // InternalMyDsl.g:565:75: (iv_ruleExistencePluralIndefiniteRefPhrase= ruleExistencePluralIndefiniteRefPhrase EOF )
            // InternalMyDsl.g:566:2: iv_ruleExistencePluralIndefiniteRefPhrase= ruleExistencePluralIndefiniteRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistencePluralIndefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistencePluralIndefiniteRefPhrase=ruleExistencePluralIndefiniteRefPhrase();

            state._fsp--;

             current =iv_ruleExistencePluralIndefiniteRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistencePluralIndefiniteRefPhrase"


    // $ANTLR start "ruleExistencePluralIndefiniteRefPhrase"
    // InternalMyDsl.g:572:1: ruleExistencePluralIndefiniteRefPhrase returns [EObject current=null] : ( (this_INT_0= RULE_INT | otherlv_1= 'one_or_more' | otherlv_2= 'zero_or_more' )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExistencePluralIndefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:578:2: ( ( (this_INT_0= RULE_INT | otherlv_1= 'one_or_more' | otherlv_2= 'zero_or_more' )? ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMyDsl.g:579:2: ( (this_INT_0= RULE_INT | otherlv_1= 'one_or_more' | otherlv_2= 'zero_or_more' )? ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMyDsl.g:579:2: ( (this_INT_0= RULE_INT | otherlv_1= 'one_or_more' | otherlv_2= 'zero_or_more' )? ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDsl.g:580:3: (this_INT_0= RULE_INT | otherlv_1= 'one_or_more' | otherlv_2= 'zero_or_more' )? ( (otherlv_3= RULE_ID ) )
            {
            // InternalMyDsl.g:580:3: (this_INT_0= RULE_INT | otherlv_1= 'one_or_more' | otherlv_2= 'zero_or_more' )?
            int alt7=4;
            switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt7=1;
                    }
                    break;
                case 22:
                    {
                    alt7=2;
                    }
                    break;
                case 23:
                    {
                    alt7=3;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:581:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    				newLeafNode(this_INT_0, grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getINTTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:586:4: otherlv_1= 'one_or_more'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getOne_or_moreKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:591:4: otherlv_2= 'zero_or_more'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getZero_or_moreKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:596:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:597:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:597:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:598:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExistencePluralIndefiniteRefPhraseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getRefExistencePluralIndefinitePhraseCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistencePluralIndefiniteRefPhrase"


    // $ANTLR start "entryRuleExistenceSingularIndefiniteRefListPhrase"
    // InternalMyDsl.g:613:1: entryRuleExistenceSingularIndefiniteRefListPhrase returns [EObject current=null] : iv_ruleExistenceSingularIndefiniteRefListPhrase= ruleExistenceSingularIndefiniteRefListPhrase EOF ;
    public final EObject entryRuleExistenceSingularIndefiniteRefListPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceSingularIndefiniteRefListPhrase = null;


        try {
            // InternalMyDsl.g:613:81: (iv_ruleExistenceSingularIndefiniteRefListPhrase= ruleExistenceSingularIndefiniteRefListPhrase EOF )
            // InternalMyDsl.g:614:2: iv_ruleExistenceSingularIndefiniteRefListPhrase= ruleExistenceSingularIndefiniteRefListPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceSingularIndefiniteRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceSingularIndefiniteRefListPhrase=ruleExistenceSingularIndefiniteRefListPhrase();

            state._fsp--;

             current =iv_ruleExistenceSingularIndefiniteRefListPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceSingularIndefiniteRefListPhrase"


    // $ANTLR start "ruleExistenceSingularIndefiniteRefListPhrase"
    // InternalMyDsl.g:620:1: ruleExistenceSingularIndefiniteRefListPhrase returns [EObject current=null] : ( ( (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) ) )* ) ;
    public final EObject ruleExistenceSingularIndefiniteRefListPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:626:2: ( ( ( (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) ) )* ) )
            // InternalMyDsl.g:627:2: ( ( (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) ) )* )
            {
            // InternalMyDsl.g:627:2: ( ( (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) ) )* )
            // InternalMyDsl.g:628:3: ( (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) ) )*
            {
            // InternalMyDsl.g:628:3: ( (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase ) )
            // InternalMyDsl.g:629:4: (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:629:4: (lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase )
            // InternalMyDsl.g:630:5: lv_elements_0_0= ruleExistenceSingularIndefiniteRefPhrase
            {

            					newCompositeNode(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsExistenceSingularIndefiniteRefPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_0_0=ruleExistenceSingularIndefiniteRefPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenceSingularIndefiniteRefListPhraseRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceSingularIndefiniteRefPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:647:3: (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:648:4: otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:652:4: (otherlv_2= 'and' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==15) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalMyDsl.g:653:5: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            	            					newLeafNode(otherlv_2, grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getAndKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:658:4: ( (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase ) )
            	    // InternalMyDsl.g:659:5: (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase )
            	    {
            	    // InternalMyDsl.g:659:5: (lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase )
            	    // InternalMyDsl.g:660:6: lv_elements_3_0= ruleExistenceSingularIndefiniteRefPhrase
            	    {

            	    						newCompositeNode(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsExistenceSingularIndefiniteRefPhraseParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleExistenceSingularIndefiniteRefPhrase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExistenceSingularIndefiniteRefListPhraseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ExistenceSingularIndefiniteRefPhrase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceSingularIndefiniteRefListPhrase"


    // $ANTLR start "entryRuleExistencePluralIndefiniteRefListPhrase"
    // InternalMyDsl.g:682:1: entryRuleExistencePluralIndefiniteRefListPhrase returns [EObject current=null] : iv_ruleExistencePluralIndefiniteRefListPhrase= ruleExistencePluralIndefiniteRefListPhrase EOF ;
    public final EObject entryRuleExistencePluralIndefiniteRefListPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistencePluralIndefiniteRefListPhrase = null;


        try {
            // InternalMyDsl.g:682:79: (iv_ruleExistencePluralIndefiniteRefListPhrase= ruleExistencePluralIndefiniteRefListPhrase EOF )
            // InternalMyDsl.g:683:2: iv_ruleExistencePluralIndefiniteRefListPhrase= ruleExistencePluralIndefiniteRefListPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistencePluralIndefiniteRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistencePluralIndefiniteRefListPhrase=ruleExistencePluralIndefiniteRefListPhrase();

            state._fsp--;

             current =iv_ruleExistencePluralIndefiniteRefListPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistencePluralIndefiniteRefListPhrase"


    // $ANTLR start "ruleExistencePluralIndefiniteRefListPhrase"
    // InternalMyDsl.g:689:1: ruleExistencePluralIndefiniteRefListPhrase returns [EObject current=null] : ( ( (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) ) )* ) ;
    public final EObject ruleExistencePluralIndefiniteRefListPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:695:2: ( ( ( (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) ) )* ) )
            // InternalMyDsl.g:696:2: ( ( (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) ) )* )
            {
            // InternalMyDsl.g:696:2: ( ( (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) ) )* )
            // InternalMyDsl.g:697:3: ( (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase ) ) (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) ) )*
            {
            // InternalMyDsl.g:697:3: ( (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase ) )
            // InternalMyDsl.g:698:4: (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:698:4: (lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase )
            // InternalMyDsl.g:699:5: lv_elements_0_0= ruleExistencePluralIndefiniteRefPhrase
            {

            					newCompositeNode(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsExistencePluralIndefiniteRefPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_0_0=ruleExistencePluralIndefiniteRefPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistencePluralIndefiniteRefListPhraseRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyDsl.ExistencePluralIndefiniteRefPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:716:3: (otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:717:4: otherlv_1= ',' (otherlv_2= 'and' )? ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:721:4: (otherlv_2= 'and' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==15) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMyDsl.g:722:5: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            	            					newLeafNode(otherlv_2, grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getAndKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:727:4: ( (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase ) )
            	    // InternalMyDsl.g:728:5: (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase )
            	    {
            	    // InternalMyDsl.g:728:5: (lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase )
            	    // InternalMyDsl.g:729:6: lv_elements_3_0= ruleExistencePluralIndefiniteRefPhrase
            	    {

            	    						newCompositeNode(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsExistencePluralIndefiniteRefPhraseParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleExistencePluralIndefiniteRefPhrase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExistencePluralIndefiniteRefListPhraseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ExistencePluralIndefiniteRefPhrase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistencePluralIndefiniteRefListPhrase"


    // $ANTLR start "entryRuleExistenceSingularRefListPhrase"
    // InternalMyDsl.g:751:1: entryRuleExistenceSingularRefListPhrase returns [EObject current=null] : iv_ruleExistenceSingularRefListPhrase= ruleExistenceSingularRefListPhrase EOF ;
    public final EObject entryRuleExistenceSingularRefListPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceSingularRefListPhrase = null;


        try {
            // InternalMyDsl.g:751:71: (iv_ruleExistenceSingularRefListPhrase= ruleExistenceSingularRefListPhrase EOF )
            // InternalMyDsl.g:752:2: iv_ruleExistenceSingularRefListPhrase= ruleExistenceSingularRefListPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceSingularRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceSingularRefListPhrase=ruleExistenceSingularRefListPhrase();

            state._fsp--;

             current =iv_ruleExistenceSingularRefListPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceSingularRefListPhrase"


    // $ANTLR start "ruleExistenceSingularRefListPhrase"
    // InternalMyDsl.g:758:1: ruleExistenceSingularRefListPhrase returns [EObject current=null] : (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase ) ;
    public final EObject ruleExistenceSingularRefListPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_ExistenceDefiniteRefListPhrase_0 = null;

        EObject this_ExistenceSingularIndefiniteRefListPhrase_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:764:2: ( (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase ) )
            // InternalMyDsl.g:765:2: (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase )
            {
            // InternalMyDsl.g:765:2: (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=19 && LA12_0<=21)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:766:3: this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase
                    {

                    			newCompositeNode(grammarAccess.getExistenceSingularRefListPhraseAccess().getExistenceDefiniteRefListPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistenceDefiniteRefListPhrase_0=ruleExistenceDefiniteRefListPhrase();

                    state._fsp--;


                    			current = this_ExistenceDefiniteRefListPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:775:3: this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase
                    {

                    			newCompositeNode(grammarAccess.getExistenceSingularRefListPhraseAccess().getExistenceSingularIndefiniteRefListPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistenceSingularIndefiniteRefListPhrase_1=ruleExistenceSingularIndefiniteRefListPhrase();

                    state._fsp--;


                    			current = this_ExistenceSingularIndefiniteRefListPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceSingularRefListPhrase"


    // $ANTLR start "entryRuleExistenceAnyRefListPhrase"
    // InternalMyDsl.g:787:1: entryRuleExistenceAnyRefListPhrase returns [EObject current=null] : iv_ruleExistenceAnyRefListPhrase= ruleExistenceAnyRefListPhrase EOF ;
    public final EObject entryRuleExistenceAnyRefListPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceAnyRefListPhrase = null;


        try {
            // InternalMyDsl.g:787:66: (iv_ruleExistenceAnyRefListPhrase= ruleExistenceAnyRefListPhrase EOF )
            // InternalMyDsl.g:788:2: iv_ruleExistenceAnyRefListPhrase= ruleExistenceAnyRefListPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceAnyRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceAnyRefListPhrase=ruleExistenceAnyRefListPhrase();

            state._fsp--;

             current =iv_ruleExistenceAnyRefListPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceAnyRefListPhrase"


    // $ANTLR start "ruleExistenceAnyRefListPhrase"
    // InternalMyDsl.g:794:1: ruleExistenceAnyRefListPhrase returns [EObject current=null] : (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase | this_ExistencePluralIndefiniteRefListPhrase_2= ruleExistencePluralIndefiniteRefListPhrase ) ;
    public final EObject ruleExistenceAnyRefListPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_ExistenceDefiniteRefListPhrase_0 = null;

        EObject this_ExistenceSingularIndefiniteRefListPhrase_1 = null;

        EObject this_ExistencePluralIndefiniteRefListPhrase_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:800:2: ( (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase | this_ExistencePluralIndefiniteRefListPhrase_2= ruleExistencePluralIndefiniteRefListPhrase ) )
            // InternalMyDsl.g:801:2: (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase | this_ExistencePluralIndefiniteRefListPhrase_2= ruleExistencePluralIndefiniteRefListPhrase )
            {
            // InternalMyDsl.g:801:2: (this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase | this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase | this_ExistencePluralIndefiniteRefListPhrase_2= ruleExistencePluralIndefiniteRefListPhrase )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt13=1;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 22:
            case 23:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:802:3: this_ExistenceDefiniteRefListPhrase_0= ruleExistenceDefiniteRefListPhrase
                    {

                    			newCompositeNode(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistenceDefiniteRefListPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistenceDefiniteRefListPhrase_0=ruleExistenceDefiniteRefListPhrase();

                    state._fsp--;


                    			current = this_ExistenceDefiniteRefListPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:811:3: this_ExistenceSingularIndefiniteRefListPhrase_1= ruleExistenceSingularIndefiniteRefListPhrase
                    {

                    			newCompositeNode(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistenceSingularIndefiniteRefListPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistenceSingularIndefiniteRefListPhrase_1=ruleExistenceSingularIndefiniteRefListPhrase();

                    state._fsp--;


                    			current = this_ExistenceSingularIndefiniteRefListPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:820:3: this_ExistencePluralIndefiniteRefListPhrase_2= ruleExistencePluralIndefiniteRefListPhrase
                    {

                    			newCompositeNode(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistencePluralIndefiniteRefListPhraseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistencePluralIndefiniteRefListPhrase_2=ruleExistencePluralIndefiniteRefListPhrase();

                    state._fsp--;


                    			current = this_ExistencePluralIndefiniteRefListPhrase_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceAnyRefListPhrase"


    // $ANTLR start "entryRuleExistenceIndefiniteRefPhrase"
    // InternalMyDsl.g:832:1: entryRuleExistenceIndefiniteRefPhrase returns [EObject current=null] : iv_ruleExistenceIndefiniteRefPhrase= ruleExistenceIndefiniteRefPhrase EOF ;
    public final EObject entryRuleExistenceIndefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenceIndefiniteRefPhrase = null;


        try {
            // InternalMyDsl.g:832:69: (iv_ruleExistenceIndefiniteRefPhrase= ruleExistenceIndefiniteRefPhrase EOF )
            // InternalMyDsl.g:833:2: iv_ruleExistenceIndefiniteRefPhrase= ruleExistenceIndefiniteRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getExistenceIndefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenceIndefiniteRefPhrase=ruleExistenceIndefiniteRefPhrase();

            state._fsp--;

             current =iv_ruleExistenceIndefiniteRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenceIndefiniteRefPhrase"


    // $ANTLR start "ruleExistenceIndefiniteRefPhrase"
    // InternalMyDsl.g:839:1: ruleExistenceIndefiniteRefPhrase returns [EObject current=null] : (this_ExistenceSingularIndefiniteRefPhrase_0= ruleExistenceSingularIndefiniteRefPhrase | this_ExistencePluralIndefiniteRefPhrase_1= ruleExistencePluralIndefiniteRefPhrase ) ;
    public final EObject ruleExistenceIndefiniteRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_ExistenceSingularIndefiniteRefPhrase_0 = null;

        EObject this_ExistencePluralIndefiniteRefPhrase_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:845:2: ( (this_ExistenceSingularIndefiniteRefPhrase_0= ruleExistenceSingularIndefiniteRefPhrase | this_ExistencePluralIndefiniteRefPhrase_1= ruleExistencePluralIndefiniteRefPhrase ) )
            // InternalMyDsl.g:846:2: (this_ExistenceSingularIndefiniteRefPhrase_0= ruleExistenceSingularIndefiniteRefPhrase | this_ExistencePluralIndefiniteRefPhrase_1= ruleExistencePluralIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:846:2: (this_ExistenceSingularIndefiniteRefPhrase_0= ruleExistenceSingularIndefiniteRefPhrase | this_ExistencePluralIndefiniteRefPhrase_1= ruleExistencePluralIndefiniteRefPhrase )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=21)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=22 && LA14_0<=23)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:847:3: this_ExistenceSingularIndefiniteRefPhrase_0= ruleExistenceSingularIndefiniteRefPhrase
                    {

                    			newCompositeNode(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getExistenceSingularIndefiniteRefPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistenceSingularIndefiniteRefPhrase_0=ruleExistenceSingularIndefiniteRefPhrase();

                    state._fsp--;


                    			current = this_ExistenceSingularIndefiniteRefPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:856:3: this_ExistencePluralIndefiniteRefPhrase_1= ruleExistencePluralIndefiniteRefPhrase
                    {

                    			newCompositeNode(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getExistencePluralIndefiniteRefPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistencePluralIndefiniteRefPhrase_1=ruleExistencePluralIndefiniteRefPhrase();

                    state._fsp--;


                    			current = this_ExistencePluralIndefiniteRefPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenceIndefiniteRefPhrase"


    // $ANTLR start "entryRuleCompositionStmt"
    // InternalMyDsl.g:868:1: entryRuleCompositionStmt returns [EObject current=null] : iv_ruleCompositionStmt= ruleCompositionStmt EOF ;
    public final EObject entryRuleCompositionStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionStmt = null;


        try {
            // InternalMyDsl.g:868:56: (iv_ruleCompositionStmt= ruleCompositionStmt EOF )
            // InternalMyDsl.g:869:2: iv_ruleCompositionStmt= ruleCompositionStmt EOF
            {
             newCompositeNode(grammarAccess.getCompositionStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionStmt=ruleCompositionStmt();

            state._fsp--;

             current =iv_ruleCompositionStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionStmt"


    // $ANTLR start "ruleCompositionStmt"
    // InternalMyDsl.g:875:1: ruleCompositionStmt returns [EObject current=null] : ( ( (lv_parent_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'has' | otherlv_2= 'is_composed_by' | otherlv_3= 'contains' ) ( (lv_children_4_0= ruleExistenceAnyRefListPhrase ) ) ) ;
    public final EObject ruleCompositionStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_parent_0_0 = null;

        EObject lv_children_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:881:2: ( ( ( (lv_parent_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'has' | otherlv_2= 'is_composed_by' | otherlv_3= 'contains' ) ( (lv_children_4_0= ruleExistenceAnyRefListPhrase ) ) ) )
            // InternalMyDsl.g:882:2: ( ( (lv_parent_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'has' | otherlv_2= 'is_composed_by' | otherlv_3= 'contains' ) ( (lv_children_4_0= ruleExistenceAnyRefListPhrase ) ) )
            {
            // InternalMyDsl.g:882:2: ( ( (lv_parent_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'has' | otherlv_2= 'is_composed_by' | otherlv_3= 'contains' ) ( (lv_children_4_0= ruleExistenceAnyRefListPhrase ) ) )
            // InternalMyDsl.g:883:3: ( (lv_parent_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'has' | otherlv_2= 'is_composed_by' | otherlv_3= 'contains' ) ( (lv_children_4_0= ruleExistenceAnyRefListPhrase ) )
            {
            // InternalMyDsl.g:883:3: ( (lv_parent_0_0= ruleExistenceSingularRefListPhrase ) )
            // InternalMyDsl.g:884:4: (lv_parent_0_0= ruleExistenceSingularRefListPhrase )
            {
            // InternalMyDsl.g:884:4: (lv_parent_0_0= ruleExistenceSingularRefListPhrase )
            // InternalMyDsl.g:885:5: lv_parent_0_0= ruleExistenceSingularRefListPhrase
            {

            					newCompositeNode(grammarAccess.getCompositionStmtAccess().getParentExistenceSingularRefListPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_parent_0_0=ruleExistenceSingularRefListPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionStmtRule());
            					}
            					set(
            						current,
            						"parent",
            						lv_parent_0_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceSingularRefListPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:902:3: (otherlv_1= 'has' | otherlv_2= 'is_composed_by' | otherlv_3= 'contains' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:903:4: otherlv_1= 'has'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getCompositionStmtAccess().getHasKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:908:4: otherlv_2= 'is_composed_by'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionStmtAccess().getIs_composed_byKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:913:4: otherlv_3= 'contains'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositionStmtAccess().getContainsKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:918:3: ( (lv_children_4_0= ruleExistenceAnyRefListPhrase ) )
            // InternalMyDsl.g:919:4: (lv_children_4_0= ruleExistenceAnyRefListPhrase )
            {
            // InternalMyDsl.g:919:4: (lv_children_4_0= ruleExistenceAnyRefListPhrase )
            // InternalMyDsl.g:920:5: lv_children_4_0= ruleExistenceAnyRefListPhrase
            {

            					newCompositeNode(grammarAccess.getCompositionStmtAccess().getChildrenExistenceAnyRefListPhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_children_4_0=ruleExistenceAnyRefListPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionStmtRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_4_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceAnyRefListPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositionStmt"


    // $ANTLR start "entryRuleInheritanceStmt"
    // InternalMyDsl.g:941:1: entryRuleInheritanceStmt returns [EObject current=null] : iv_ruleInheritanceStmt= ruleInheritanceStmt EOF ;
    public final EObject entryRuleInheritanceStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceStmt = null;


        try {
            // InternalMyDsl.g:941:56: (iv_ruleInheritanceStmt= ruleInheritanceStmt EOF )
            // InternalMyDsl.g:942:2: iv_ruleInheritanceStmt= ruleInheritanceStmt EOF
            {
             newCompositeNode(grammarAccess.getInheritanceStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInheritanceStmt=ruleInheritanceStmt();

            state._fsp--;

             current =iv_ruleInheritanceStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInheritanceStmt"


    // $ANTLR start "ruleInheritanceStmt"
    // InternalMyDsl.g:948:1: ruleInheritanceStmt returns [EObject current=null] : ( ( (lv_class_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'is' | otherlv_2= 'are_each' ) ( (lv_superclass_3_0= ruleExistenceSingularRefListPhrase ) ) ) ;
    public final EObject ruleInheritanceStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_class_0_0 = null;

        EObject lv_superclass_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:954:2: ( ( ( (lv_class_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'is' | otherlv_2= 'are_each' ) ( (lv_superclass_3_0= ruleExistenceSingularRefListPhrase ) ) ) )
            // InternalMyDsl.g:955:2: ( ( (lv_class_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'is' | otherlv_2= 'are_each' ) ( (lv_superclass_3_0= ruleExistenceSingularRefListPhrase ) ) )
            {
            // InternalMyDsl.g:955:2: ( ( (lv_class_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'is' | otherlv_2= 'are_each' ) ( (lv_superclass_3_0= ruleExistenceSingularRefListPhrase ) ) )
            // InternalMyDsl.g:956:3: ( (lv_class_0_0= ruleExistenceSingularRefListPhrase ) ) (otherlv_1= 'is' | otherlv_2= 'are_each' ) ( (lv_superclass_3_0= ruleExistenceSingularRefListPhrase ) )
            {
            // InternalMyDsl.g:956:3: ( (lv_class_0_0= ruleExistenceSingularRefListPhrase ) )
            // InternalMyDsl.g:957:4: (lv_class_0_0= ruleExistenceSingularRefListPhrase )
            {
            // InternalMyDsl.g:957:4: (lv_class_0_0= ruleExistenceSingularRefListPhrase )
            // InternalMyDsl.g:958:5: lv_class_0_0= ruleExistenceSingularRefListPhrase
            {

            					newCompositeNode(grammarAccess.getInheritanceStmtAccess().getClassExistenceSingularRefListPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_class_0_0=ruleExistenceSingularRefListPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInheritanceStmtRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_0_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceSingularRefListPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:975:3: (otherlv_1= 'is' | otherlv_2= 'are_each' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:976:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getInheritanceStmtAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:981:4: otherlv_2= 'are_each'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getInheritanceStmtAccess().getAre_eachKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:986:3: ( (lv_superclass_3_0= ruleExistenceSingularRefListPhrase ) )
            // InternalMyDsl.g:987:4: (lv_superclass_3_0= ruleExistenceSingularRefListPhrase )
            {
            // InternalMyDsl.g:987:4: (lv_superclass_3_0= ruleExistenceSingularRefListPhrase )
            // InternalMyDsl.g:988:5: lv_superclass_3_0= ruleExistenceSingularRefListPhrase
            {

            					newCompositeNode(grammarAccess.getInheritanceStmtAccess().getSuperclassExistenceSingularRefListPhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_superclass_3_0=ruleExistenceSingularRefListPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInheritanceStmtRule());
            					}
            					set(
            						current,
            						"superclass",
            						lv_superclass_3_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceSingularRefListPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInheritanceStmt"


    // $ANTLR start "entryRuleOperationStmt"
    // InternalMyDsl.g:1009:1: entryRuleOperationStmt returns [EObject current=null] : iv_ruleOperationStmt= ruleOperationStmt EOF ;
    public final EObject entryRuleOperationStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationStmt = null;


        try {
            // InternalMyDsl.g:1009:54: (iv_ruleOperationStmt= ruleOperationStmt EOF )
            // InternalMyDsl.g:1010:2: iv_ruleOperationStmt= ruleOperationStmt EOF
            {
             newCompositeNode(grammarAccess.getOperationStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationStmt=ruleOperationStmt();

            state._fsp--;

             current =iv_ruleOperationStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationStmt"


    // $ANTLR start "ruleOperationStmt"
    // InternalMyDsl.g:1016:1: ruleOperationStmt returns [EObject current=null] : (this_OperationDeclarationStmt_0= ruleOperationDeclarationStmt | this_OperationDefinitionStmt_1= ruleOperationDefinitionStmt ) ;
    public final EObject ruleOperationStmt() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDeclarationStmt_0 = null;

        EObject this_OperationDefinitionStmt_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1022:2: ( (this_OperationDeclarationStmt_0= ruleOperationDeclarationStmt | this_OperationDefinitionStmt_1= ruleOperationDefinitionStmt ) )
            // InternalMyDsl.g:1023:2: (this_OperationDeclarationStmt_0= ruleOperationDeclarationStmt | this_OperationDefinitionStmt_1= ruleOperationDefinitionStmt )
            {
            // InternalMyDsl.g:1023:2: (this_OperationDeclarationStmt_0= ruleOperationDeclarationStmt | this_OperationDefinitionStmt_1= ruleOperationDefinitionStmt )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=29 && LA17_0<=31)) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1024:3: this_OperationDeclarationStmt_0= ruleOperationDeclarationStmt
                    {

                    			newCompositeNode(grammarAccess.getOperationStmtAccess().getOperationDeclarationStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDeclarationStmt_0=ruleOperationDeclarationStmt();

                    state._fsp--;


                    			current = this_OperationDeclarationStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1033:3: this_OperationDefinitionStmt_1= ruleOperationDefinitionStmt
                    {

                    			newCompositeNode(grammarAccess.getOperationStmtAccess().getOperationDefinitionStmtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinitionStmt_1=ruleOperationDefinitionStmt();

                    state._fsp--;


                    			current = this_OperationDefinitionStmt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationStmt"


    // $ANTLR start "entryRuleOperationDeclarationStmt"
    // InternalMyDsl.g:1045:1: entryRuleOperationDeclarationStmt returns [EObject current=null] : iv_ruleOperationDeclarationStmt= ruleOperationDeclarationStmt EOF ;
    public final EObject entryRuleOperationDeclarationStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclarationStmt = null;


        try {
            // InternalMyDsl.g:1045:65: (iv_ruleOperationDeclarationStmt= ruleOperationDeclarationStmt EOF )
            // InternalMyDsl.g:1046:2: iv_ruleOperationDeclarationStmt= ruleOperationDeclarationStmt EOF
            {
             newCompositeNode(grammarAccess.getOperationDeclarationStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDeclarationStmt=ruleOperationDeclarationStmt();

            state._fsp--;

             current =iv_ruleOperationDeclarationStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDeclarationStmt"


    // $ANTLR start "ruleOperationDeclarationStmt"
    // InternalMyDsl.g:1052:1: ruleOperationDeclarationStmt returns [EObject current=null] : ( (otherlv_0= 'it_is_possible_that' | otherlv_1= 'it_is_possible_to' | otherlv_2= 'it_is_possible' ) this_OperationDeclarionHeaderStmt_3= ruleOperationDeclarionHeaderStmt ) ;
    public final EObject ruleOperationDeclarationStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_OperationDeclarionHeaderStmt_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1058:2: ( ( (otherlv_0= 'it_is_possible_that' | otherlv_1= 'it_is_possible_to' | otherlv_2= 'it_is_possible' ) this_OperationDeclarionHeaderStmt_3= ruleOperationDeclarionHeaderStmt ) )
            // InternalMyDsl.g:1059:2: ( (otherlv_0= 'it_is_possible_that' | otherlv_1= 'it_is_possible_to' | otherlv_2= 'it_is_possible' ) this_OperationDeclarionHeaderStmt_3= ruleOperationDeclarionHeaderStmt )
            {
            // InternalMyDsl.g:1059:2: ( (otherlv_0= 'it_is_possible_that' | otherlv_1= 'it_is_possible_to' | otherlv_2= 'it_is_possible' ) this_OperationDeclarionHeaderStmt_3= ruleOperationDeclarionHeaderStmt )
            // InternalMyDsl.g:1060:3: (otherlv_0= 'it_is_possible_that' | otherlv_1= 'it_is_possible_to' | otherlv_2= 'it_is_possible' ) this_OperationDeclarionHeaderStmt_3= ruleOperationDeclarionHeaderStmt
            {
            // InternalMyDsl.g:1060:3: (otherlv_0= 'it_is_possible_that' | otherlv_1= 'it_is_possible_to' | otherlv_2= 'it_is_possible' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1061:4: otherlv_0= 'it_is_possible_that'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possible_thatKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1066:4: otherlv_1= 'it_is_possible_to'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possible_toKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1071:4: otherlv_2= 'it_is_possible'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possibleKeyword_0_2());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getOperationDeclarationStmtAccess().getOperationDeclarionHeaderStmtParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OperationDeclarionHeaderStmt_3=ruleOperationDeclarionHeaderStmt();

            state._fsp--;


            			current = this_OperationDeclarionHeaderStmt_3;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDeclarationStmt"


    // $ANTLR start "entryRuleOperationDeclarionHeaderStmt"
    // InternalMyDsl.g:1088:1: entryRuleOperationDeclarionHeaderStmt returns [EObject current=null] : iv_ruleOperationDeclarionHeaderStmt= ruleOperationDeclarionHeaderStmt EOF ;
    public final EObject entryRuleOperationDeclarionHeaderStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclarionHeaderStmt = null;


        try {
            // InternalMyDsl.g:1088:69: (iv_ruleOperationDeclarionHeaderStmt= ruleOperationDeclarionHeaderStmt EOF )
            // InternalMyDsl.g:1089:2: iv_ruleOperationDeclarionHeaderStmt= ruleOperationDeclarionHeaderStmt EOF
            {
             newCompositeNode(grammarAccess.getOperationDeclarionHeaderStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDeclarionHeaderStmt=ruleOperationDeclarionHeaderStmt();

            state._fsp--;

             current =iv_ruleOperationDeclarionHeaderStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDeclarionHeaderStmt"


    // $ANTLR start "ruleOperationDeclarionHeaderStmt"
    // InternalMyDsl.g:1095:1: ruleOperationDeclarionHeaderStmt returns [EObject current=null] : ( (lv_parameters_0_0= ruleOperationParameterPhrase ) )+ ;
    public final EObject ruleOperationDeclarionHeaderStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1101:2: ( ( (lv_parameters_0_0= ruleOperationParameterPhrase ) )+ )
            // InternalMyDsl.g:1102:2: ( (lv_parameters_0_0= ruleOperationParameterPhrase ) )+
            {
            // InternalMyDsl.g:1102:2: ( (lv_parameters_0_0= ruleOperationParameterPhrase ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==15||(LA19_0>=19 && LA19_0<=23)||LA19_0==27||LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1103:3: (lv_parameters_0_0= ruleOperationParameterPhrase )
            	    {
            	    // InternalMyDsl.g:1103:3: (lv_parameters_0_0= ruleOperationParameterPhrase )
            	    // InternalMyDsl.g:1104:4: lv_parameters_0_0= ruleOperationParameterPhrase
            	    {

            	    				newCompositeNode(grammarAccess.getOperationDeclarionHeaderStmtAccess().getParametersOperationParameterPhraseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_18);
            	    lv_parameters_0_0=ruleOperationParameterPhrase();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOperationDeclarionHeaderStmtRule());
            	    				}
            	    				add(
            	    					current,
            	    					"parameters",
            	    					lv_parameters_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.OperationParameterPhrase");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDeclarionHeaderStmt"


    // $ANTLR start "entryRuleOperationParameterPhrase"
    // InternalMyDsl.g:1124:1: entryRuleOperationParameterPhrase returns [EObject current=null] : iv_ruleOperationParameterPhrase= ruleOperationParameterPhrase EOF ;
    public final EObject entryRuleOperationParameterPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameterPhrase = null;


        try {
            // InternalMyDsl.g:1124:65: (iv_ruleOperationParameterPhrase= ruleOperationParameterPhrase EOF )
            // InternalMyDsl.g:1125:2: iv_ruleOperationParameterPhrase= ruleOperationParameterPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationParameterPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationParameterPhrase=ruleOperationParameterPhrase();

            state._fsp--;

             current =iv_ruleOperationParameterPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationParameterPhrase"


    // $ANTLR start "ruleOperationParameterPhrase"
    // InternalMyDsl.g:1131:1: ruleOperationParameterPhrase returns [EObject current=null] : (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationParameterConnectionPhrase_1= ruleOperationParameterConnectionPhrase ) ;
    public final EObject ruleOperationParameterPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_OperationParameterVariableDeclarationPhrase_0 = null;

        EObject this_OperationParameterConnectionPhrase_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1137:2: ( (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationParameterConnectionPhrase_1= ruleOperationParameterConnectionPhrase ) )
            // InternalMyDsl.g:1138:2: (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationParameterConnectionPhrase_1= ruleOperationParameterConnectionPhrase )
            {
            // InternalMyDsl.g:1138:2: (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationParameterConnectionPhrase_1= ruleOperationParameterConnectionPhrase )
            int alt20=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==EOF||LA20_2==RULE_INT||LA20_2==11||(LA20_2>=14 && LA20_2<=15)||(LA20_2>=19 && LA20_2<=23)||LA20_2==27||LA20_2==36) ) {
                    alt20=2;
                }
                else if ( (LA20_2==RULE_ID) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 27:
            case 36:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1139:3: this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationParameterPhraseAccess().getOperationParameterVariableDeclarationPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationParameterVariableDeclarationPhrase_0=ruleOperationParameterVariableDeclarationPhrase();

                    state._fsp--;


                    			current = this_OperationParameterVariableDeclarationPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1148:3: this_OperationParameterConnectionPhrase_1= ruleOperationParameterConnectionPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationParameterPhraseAccess().getOperationParameterConnectionPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationParameterConnectionPhrase_1=ruleOperationParameterConnectionPhrase();

                    state._fsp--;


                    			current = this_OperationParameterConnectionPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationParameterPhrase"


    // $ANTLR start "entryRuleOperationDefinitionStmt"
    // InternalMyDsl.g:1160:1: entryRuleOperationDefinitionStmt returns [EObject current=null] : iv_ruleOperationDefinitionStmt= ruleOperationDefinitionStmt EOF ;
    public final EObject entryRuleOperationDefinitionStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionStmt = null;


        try {
            // InternalMyDsl.g:1160:64: (iv_ruleOperationDefinitionStmt= ruleOperationDefinitionStmt EOF )
            // InternalMyDsl.g:1161:2: iv_ruleOperationDefinitionStmt= ruleOperationDefinitionStmt EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionStmt=ruleOperationDefinitionStmt();

            state._fsp--;

             current =iv_ruleOperationDefinitionStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionStmt"


    // $ANTLR start "ruleOperationDefinitionStmt"
    // InternalMyDsl.g:1167:1: ruleOperationDefinitionStmt returns [EObject current=null] : (otherlv_0= 'if' ( (lv_header_1_0= ruleOperationDeclarionHeaderStmt ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_body_4_0= ruleOperationDefinitionBodyStmts ) ) ) ;
    public final EObject ruleOperationDefinitionStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_header_1_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1173:2: ( (otherlv_0= 'if' ( (lv_header_1_0= ruleOperationDeclarionHeaderStmt ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_body_4_0= ruleOperationDefinitionBodyStmts ) ) ) )
            // InternalMyDsl.g:1174:2: (otherlv_0= 'if' ( (lv_header_1_0= ruleOperationDeclarionHeaderStmt ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_body_4_0= ruleOperationDefinitionBodyStmts ) ) )
            {
            // InternalMyDsl.g:1174:2: (otherlv_0= 'if' ( (lv_header_1_0= ruleOperationDeclarionHeaderStmt ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_body_4_0= ruleOperationDefinitionBodyStmts ) ) )
            // InternalMyDsl.g:1175:3: otherlv_0= 'if' ( (lv_header_1_0= ruleOperationDeclarionHeaderStmt ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_body_4_0= ruleOperationDefinitionBodyStmts ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationDefinitionStmtAccess().getIfKeyword_0());
            		
            // InternalMyDsl.g:1179:3: ( (lv_header_1_0= ruleOperationDeclarionHeaderStmt ) )
            // InternalMyDsl.g:1180:4: (lv_header_1_0= ruleOperationDeclarionHeaderStmt )
            {
            // InternalMyDsl.g:1180:4: (lv_header_1_0= ruleOperationDeclarionHeaderStmt )
            // InternalMyDsl.g:1181:5: lv_header_1_0= ruleOperationDeclarionHeaderStmt
            {

            					newCompositeNode(grammarAccess.getOperationDefinitionStmtAccess().getHeaderOperationDeclarionHeaderStmtParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_header_1_0=ruleOperationDeclarionHeaderStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationDefinitionStmtRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_1_0,
            						"org.xtext.example.mydsl.MyDsl.OperationDeclarionHeaderStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationDefinitionStmtAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionStmtAccess().getThenKeyword_3());
            		
            // InternalMyDsl.g:1206:3: ( (lv_body_4_0= ruleOperationDefinitionBodyStmts ) )
            // InternalMyDsl.g:1207:4: (lv_body_4_0= ruleOperationDefinitionBodyStmts )
            {
            // InternalMyDsl.g:1207:4: (lv_body_4_0= ruleOperationDefinitionBodyStmts )
            // InternalMyDsl.g:1208:5: lv_body_4_0= ruleOperationDefinitionBodyStmts
            {

            					newCompositeNode(grammarAccess.getOperationDefinitionStmtAccess().getBodyOperationDefinitionBodyStmtsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleOperationDefinitionBodyStmts();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationDefinitionStmtRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
            						"org.xtext.example.mydsl.MyDsl.OperationDefinitionBodyStmts");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionStmt"


    // $ANTLR start "entryRuleOperationDefinitionBodyStmts"
    // InternalMyDsl.g:1229:1: entryRuleOperationDefinitionBodyStmts returns [EObject current=null] : iv_ruleOperationDefinitionBodyStmts= ruleOperationDefinitionBodyStmts EOF ;
    public final EObject entryRuleOperationDefinitionBodyStmts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyStmts = null;


        try {
            // InternalMyDsl.g:1229:69: (iv_ruleOperationDefinitionBodyStmts= ruleOperationDefinitionBodyStmts EOF )
            // InternalMyDsl.g:1230:2: iv_ruleOperationDefinitionBodyStmts= ruleOperationDefinitionBodyStmts EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyStmtsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyStmts=ruleOperationDefinitionBodyStmts();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyStmts; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyStmts"


    // $ANTLR start "ruleOperationDefinitionBodyStmts"
    // InternalMyDsl.g:1236:1: ruleOperationDefinitionBodyStmts returns [EObject current=null] : ( ( (lv_stmts_0_0= ruleOperationDefinitionBodyStmt ) ) (otherlv_1= ',' ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) ) )* ) ;
    public final EObject ruleOperationDefinitionBodyStmts() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_stmts_0_0 = null;

        EObject lv_stmts_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1242:2: ( ( ( (lv_stmts_0_0= ruleOperationDefinitionBodyStmt ) ) (otherlv_1= ',' ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) ) )* ) )
            // InternalMyDsl.g:1243:2: ( ( (lv_stmts_0_0= ruleOperationDefinitionBodyStmt ) ) (otherlv_1= ',' ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) ) )* )
            {
            // InternalMyDsl.g:1243:2: ( ( (lv_stmts_0_0= ruleOperationDefinitionBodyStmt ) ) (otherlv_1= ',' ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) ) )* )
            // InternalMyDsl.g:1244:3: ( (lv_stmts_0_0= ruleOperationDefinitionBodyStmt ) ) (otherlv_1= ',' ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) ) )*
            {
            // InternalMyDsl.g:1244:3: ( (lv_stmts_0_0= ruleOperationDefinitionBodyStmt ) )
            // InternalMyDsl.g:1245:4: (lv_stmts_0_0= ruleOperationDefinitionBodyStmt )
            {
            // InternalMyDsl.g:1245:4: (lv_stmts_0_0= ruleOperationDefinitionBodyStmt )
            // InternalMyDsl.g:1246:5: lv_stmts_0_0= ruleOperationDefinitionBodyStmt
            {

            					newCompositeNode(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsOperationDefinitionBodyStmtParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_stmts_0_0=ruleOperationDefinitionBodyStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationDefinitionBodyStmtsRule());
            					}
            					add(
            						current,
            						"stmts",
            						lv_stmts_0_0,
            						"org.xtext.example.mydsl.MyDsl.OperationDefinitionBodyStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1263:3: (otherlv_1= ',' ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1264:4: otherlv_1= ',' ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionBodyStmtsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1268:4: ( (lv_stmts_2_0= ruleOperationDefinitionBodyStmt ) )
            	    // InternalMyDsl.g:1269:5: (lv_stmts_2_0= ruleOperationDefinitionBodyStmt )
            	    {
            	    // InternalMyDsl.g:1269:5: (lv_stmts_2_0= ruleOperationDefinitionBodyStmt )
            	    // InternalMyDsl.g:1270:6: lv_stmts_2_0= ruleOperationDefinitionBodyStmt
            	    {

            	    						newCompositeNode(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsOperationDefinitionBodyStmtParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_stmts_2_0=ruleOperationDefinitionBodyStmt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationDefinitionBodyStmtsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stmts",
            	    							lv_stmts_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.OperationDefinitionBodyStmt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyStmts"


    // $ANTLR start "entryRuleOperationDefinitionBodyStmt"
    // InternalMyDsl.g:1292:1: entryRuleOperationDefinitionBodyStmt returns [EObject current=null] : iv_ruleOperationDefinitionBodyStmt= ruleOperationDefinitionBodyStmt EOF ;
    public final EObject entryRuleOperationDefinitionBodyStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyStmt = null;


        try {
            // InternalMyDsl.g:1292:68: (iv_ruleOperationDefinitionBodyStmt= ruleOperationDefinitionBodyStmt EOF )
            // InternalMyDsl.g:1293:2: iv_ruleOperationDefinitionBodyStmt= ruleOperationDefinitionBodyStmt EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyStmt=ruleOperationDefinitionBodyStmt();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyStmt"


    // $ANTLR start "ruleOperationDefinitionBodyStmt"
    // InternalMyDsl.g:1299:1: ruleOperationDefinitionBodyStmt returns [EObject current=null] : (this_OperationDefinitionBodyUnconditionalStmt_0= ruleOperationDefinitionBodyUnconditionalStmt | this_OperationDefinitionBodyConditionalStmt_1= ruleOperationDefinitionBodyConditionalStmt ) ;
    public final EObject ruleOperationDefinitionBodyStmt() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinitionBodyUnconditionalStmt_0 = null;

        EObject this_OperationDefinitionBodyConditionalStmt_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1305:2: ( (this_OperationDefinitionBodyUnconditionalStmt_0= ruleOperationDefinitionBodyUnconditionalStmt | this_OperationDefinitionBodyConditionalStmt_1= ruleOperationDefinitionBodyConditionalStmt ) )
            // InternalMyDsl.g:1306:2: (this_OperationDefinitionBodyUnconditionalStmt_0= ruleOperationDefinitionBodyUnconditionalStmt | this_OperationDefinitionBodyConditionalStmt_1= ruleOperationDefinitionBodyConditionalStmt )
            {
            // InternalMyDsl.g:1306:2: (this_OperationDefinitionBodyUnconditionalStmt_0= ruleOperationDefinitionBodyUnconditionalStmt | this_OperationDefinitionBodyConditionalStmt_1= ruleOperationDefinitionBodyConditionalStmt )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||(LA22_0>=12 && LA22_0<=13)||LA22_0==15||LA22_0==27||LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1307:3: this_OperationDefinitionBodyUnconditionalStmt_0= ruleOperationDefinitionBodyUnconditionalStmt
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyStmtAccess().getOperationDefinitionBodyUnconditionalStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinitionBodyUnconditionalStmt_0=ruleOperationDefinitionBodyUnconditionalStmt();

                    state._fsp--;


                    			current = this_OperationDefinitionBodyUnconditionalStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1316:3: this_OperationDefinitionBodyConditionalStmt_1= ruleOperationDefinitionBodyConditionalStmt
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyStmtAccess().getOperationDefinitionBodyConditionalStmtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinitionBodyConditionalStmt_1=ruleOperationDefinitionBodyConditionalStmt();

                    state._fsp--;


                    			current = this_OperationDefinitionBodyConditionalStmt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyStmt"


    // $ANTLR start "entryRuleOperationDefinitionBodyUnconditionalStmt"
    // InternalMyDsl.g:1328:1: entryRuleOperationDefinitionBodyUnconditionalStmt returns [EObject current=null] : iv_ruleOperationDefinitionBodyUnconditionalStmt= ruleOperationDefinitionBodyUnconditionalStmt EOF ;
    public final EObject entryRuleOperationDefinitionBodyUnconditionalStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyUnconditionalStmt = null;


        try {
            // InternalMyDsl.g:1328:81: (iv_ruleOperationDefinitionBodyUnconditionalStmt= ruleOperationDefinitionBodyUnconditionalStmt EOF )
            // InternalMyDsl.g:1329:2: iv_ruleOperationDefinitionBodyUnconditionalStmt= ruleOperationDefinitionBodyUnconditionalStmt EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyUnconditionalStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyUnconditionalStmt=ruleOperationDefinitionBodyUnconditionalStmt();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyUnconditionalStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyUnconditionalStmt"


    // $ANTLR start "ruleOperationDefinitionBodyUnconditionalStmt"
    // InternalMyDsl.g:1335:1: ruleOperationDefinitionBodyUnconditionalStmt returns [EObject current=null] : this_OperationDefinitionBodyUnconditionalPhrase_0= ruleOperationDefinitionBodyUnconditionalPhrase ;
    public final EObject ruleOperationDefinitionBodyUnconditionalStmt() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinitionBodyUnconditionalPhrase_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1341:2: (this_OperationDefinitionBodyUnconditionalPhrase_0= ruleOperationDefinitionBodyUnconditionalPhrase )
            // InternalMyDsl.g:1342:2: this_OperationDefinitionBodyUnconditionalPhrase_0= ruleOperationDefinitionBodyUnconditionalPhrase
            {

            		newCompositeNode(grammarAccess.getOperationDefinitionBodyUnconditionalStmtAccess().getOperationDefinitionBodyUnconditionalPhraseParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OperationDefinitionBodyUnconditionalPhrase_0=ruleOperationDefinitionBodyUnconditionalPhrase();

            state._fsp--;


            		current = this_OperationDefinitionBodyUnconditionalPhrase_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyUnconditionalStmt"


    // $ANTLR start "entryRuleOperationDefinitionBodyUnconditionalPhrase"
    // InternalMyDsl.g:1353:1: entryRuleOperationDefinitionBodyUnconditionalPhrase returns [EObject current=null] : iv_ruleOperationDefinitionBodyUnconditionalPhrase= ruleOperationDefinitionBodyUnconditionalPhrase EOF ;
    public final EObject entryRuleOperationDefinitionBodyUnconditionalPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyUnconditionalPhrase = null;


        try {
            // InternalMyDsl.g:1353:83: (iv_ruleOperationDefinitionBodyUnconditionalPhrase= ruleOperationDefinitionBodyUnconditionalPhrase EOF )
            // InternalMyDsl.g:1354:2: iv_ruleOperationDefinitionBodyUnconditionalPhrase= ruleOperationDefinitionBodyUnconditionalPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyUnconditionalPhrase=ruleOperationDefinitionBodyUnconditionalPhrase();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyUnconditionalPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyUnconditionalPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyUnconditionalPhrase"
    // InternalMyDsl.g:1360:1: ruleOperationDefinitionBodyUnconditionalPhrase returns [EObject current=null] : (this_OperationDefinitionBodyFunctionCallPhrase_0= ruleOperationDefinitionBodyFunctionCallPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase ) ;
    public final EObject ruleOperationDefinitionBodyUnconditionalPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinitionBodyFunctionCallPhrase_0 = null;

        EObject this_OperationDefinitionBodyVariableDeclarationPhrase_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1366:2: ( (this_OperationDefinitionBodyFunctionCallPhrase_0= ruleOperationDefinitionBodyFunctionCallPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase ) )
            // InternalMyDsl.g:1367:2: (this_OperationDefinitionBodyFunctionCallPhrase_0= ruleOperationDefinitionBodyFunctionCallPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase )
            {
            // InternalMyDsl.g:1367:2: (this_OperationDefinitionBodyFunctionCallPhrase_0= ruleOperationDefinitionBodyFunctionCallPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||LA23_0==13||LA23_0==15||LA23_0==27||LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==12) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1368:3: this_OperationDefinitionBodyFunctionCallPhrase_0= ruleOperationDefinitionBodyFunctionCallPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getOperationDefinitionBodyFunctionCallPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinitionBodyFunctionCallPhrase_0=ruleOperationDefinitionBodyFunctionCallPhrase();

                    state._fsp--;


                    			current = this_OperationDefinitionBodyFunctionCallPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1377:3: this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getOperationDefinitionBodyVariableDeclarationPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinitionBodyVariableDeclarationPhrase_1=ruleOperationDefinitionBodyVariableDeclarationPhrase();

                    state._fsp--;


                    			current = this_OperationDefinitionBodyVariableDeclarationPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyUnconditionalPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallPhrase"
    // InternalMyDsl.g:1389:1: entryRuleOperationDefinitionBodyFunctionCallPhrase returns [EObject current=null] : iv_ruleOperationDefinitionBodyFunctionCallPhrase= ruleOperationDefinitionBodyFunctionCallPhrase EOF ;
    public final EObject entryRuleOperationDefinitionBodyFunctionCallPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyFunctionCallPhrase = null;


        try {
            // InternalMyDsl.g:1389:82: (iv_ruleOperationDefinitionBodyFunctionCallPhrase= ruleOperationDefinitionBodyFunctionCallPhrase EOF )
            // InternalMyDsl.g:1390:2: iv_ruleOperationDefinitionBodyFunctionCallPhrase= ruleOperationDefinitionBodyFunctionCallPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyFunctionCallPhrase=ruleOperationDefinitionBodyFunctionCallPhrase();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyFunctionCallPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallPhrase"
    // InternalMyDsl.g:1396:1: ruleOperationDefinitionBodyFunctionCallPhrase returns [EObject current=null] : ( (lv_arguments_0_0= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase ) )+ ;
    public final EObject ruleOperationDefinitionBodyFunctionCallPhrase() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1402:2: ( ( (lv_arguments_0_0= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase ) )+ )
            // InternalMyDsl.g:1403:2: ( (lv_arguments_0_0= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase ) )+
            {
            // InternalMyDsl.g:1403:2: ( (lv_arguments_0_0= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==13||LA24_0==15||LA24_0==27||LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1404:3: (lv_arguments_0_0= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase )
            	    {
            	    // InternalMyDsl.g:1404:3: (lv_arguments_0_0= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase )
            	    // InternalMyDsl.g:1405:4: lv_arguments_0_0= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase
            	    {

            	    				newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseAccess().getArgumentsOperationDefinitionBodyFunctionCallArgumentsPhraseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_22);
            	    lv_arguments_0_0=ruleOperationDefinitionBodyFunctionCallArgumentsPhrase();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseRule());
            	    				}
            	    				add(
            	    					current,
            	    					"arguments",
            	    					lv_arguments_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.OperationDefinitionBodyFunctionCallArgumentsPhrase");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase"
    // InternalMyDsl.g:1425:1: entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase returns [EObject current=null] : iv_ruleOperationDefinitionBodyFunctionCallArgumentsPhrase= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase EOF ;
    public final EObject entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyFunctionCallArgumentsPhrase = null;


        try {
            // InternalMyDsl.g:1425:91: (iv_ruleOperationDefinitionBodyFunctionCallArgumentsPhrase= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase EOF )
            // InternalMyDsl.g:1426:2: iv_ruleOperationDefinitionBodyFunctionCallArgumentsPhrase= ruleOperationDefinitionBodyFunctionCallArgumentsPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyFunctionCallArgumentsPhrase=ruleOperationDefinitionBodyFunctionCallArgumentsPhrase();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyFunctionCallArgumentsPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallArgumentsPhrase"
    // InternalMyDsl.g:1432:1: ruleOperationDefinitionBodyFunctionCallArgumentsPhrase returns [EObject current=null] : (this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase | this_InstanceRefPhrase_1= ruleInstanceRefPhrase | this_OperationParameterConnectionBuiltinRefPhrase_2= ruleOperationParameterConnectionBuiltinRefPhrase ) ;
    public final EObject ruleOperationDefinitionBodyFunctionCallArgumentsPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0 = null;

        EObject this_InstanceRefPhrase_1 = null;

        EObject this_OperationParameterConnectionBuiltinRefPhrase_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1438:2: ( (this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase | this_InstanceRefPhrase_1= ruleInstanceRefPhrase | this_OperationParameterConnectionBuiltinRefPhrase_2= ruleOperationParameterConnectionBuiltinRefPhrase ) )
            // InternalMyDsl.g:1439:2: (this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase | this_InstanceRefPhrase_1= ruleInstanceRefPhrase | this_OperationParameterConnectionBuiltinRefPhrase_2= ruleOperationParameterConnectionBuiltinRefPhrase )
            {
            // InternalMyDsl.g:1439:2: (this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase | this_InstanceRefPhrase_1= ruleInstanceRefPhrase | this_OperationParameterConnectionBuiltinRefPhrase_2= ruleOperationParameterConnectionBuiltinRefPhrase )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt25=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 13:
                {
                alt25=2;
                }
                break;
            case 15:
            case 27:
            case 36:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1440:3: this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getOperationDefinitionBodyFunctionCallInRefsRefPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0=ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase();

                    state._fsp--;


                    			current = this_OperationDefinitionBodyFunctionCallInRefsRefPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1449:3: this_InstanceRefPhrase_1= ruleInstanceRefPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getInstanceRefPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceRefPhrase_1=ruleInstanceRefPhrase();

                    state._fsp--;


                    			current = this_InstanceRefPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1458:3: this_OperationParameterConnectionBuiltinRefPhrase_2= ruleOperationParameterConnectionBuiltinRefPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getOperationParameterConnectionBuiltinRefPhraseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationParameterConnectionBuiltinRefPhrase_2=ruleOperationParameterConnectionBuiltinRefPhrase();

                    state._fsp--;


                    			current = this_OperationParameterConnectionBuiltinRefPhrase_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallArgumentsPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase"
    // InternalMyDsl.g:1470:1: entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase returns [EObject current=null] : iv_ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase EOF ;
    public final EObject entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase = null;


        try {
            // InternalMyDsl.g:1470:91: (iv_ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase EOF )
            // InternalMyDsl.g:1471:2: iv_ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase= ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase=ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase"
    // InternalMyDsl.g:1477:1: ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1483:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:1484:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1484:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1485:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1485:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1486:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseAccess().getRefOperationDefinitionBodyFunctionCallInRefsPhraseCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"
    // InternalMyDsl.g:1500:1: entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase returns [EObject current=null] : iv_ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase= ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase EOF ;
    public final EObject entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase = null;


        try {
            // InternalMyDsl.g:1500:95: (iv_ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase= ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase EOF )
            // InternalMyDsl.g:1501:2: iv_ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase= ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase=ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"
    // InternalMyDsl.g:1507:1: ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase returns [EObject current=null] : (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase ) ;
    public final EObject ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_OperationParameterVariableDeclarationPhrase_0 = null;

        EObject this_OperationDefinitionBodyVariableDeclarationPhrase_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1513:2: ( (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase ) )
            // InternalMyDsl.g:1514:2: (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase )
            {
            // InternalMyDsl.g:1514:2: (this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase | this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||(LA26_0>=19 && LA26_0<=23)) ) {
                alt26=1;
            }
            else if ( (LA26_0==12) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1515:3: this_OperationParameterVariableDeclarationPhrase_0= ruleOperationParameterVariableDeclarationPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getOperationParameterVariableDeclarationPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationParameterVariableDeclarationPhrase_0=ruleOperationParameterVariableDeclarationPhrase();

                    state._fsp--;


                    			current = this_OperationParameterVariableDeclarationPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1524:3: this_OperationDefinitionBodyVariableDeclarationPhrase_1= ruleOperationDefinitionBodyVariableDeclarationPhrase
                    {

                    			newCompositeNode(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getOperationDefinitionBodyVariableDeclarationPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinitionBodyVariableDeclarationPhrase_1=ruleOperationDefinitionBodyVariableDeclarationPhrase();

                    state._fsp--;


                    			current = this_OperationDefinitionBodyVariableDeclarationPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyVariableDeclarationPhrase"
    // InternalMyDsl.g:1536:1: entryRuleOperationDefinitionBodyVariableDeclarationPhrase returns [EObject current=null] : iv_ruleOperationDefinitionBodyVariableDeclarationPhrase= ruleOperationDefinitionBodyVariableDeclarationPhrase EOF ;
    public final EObject entryRuleOperationDefinitionBodyVariableDeclarationPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyVariableDeclarationPhrase = null;


        try {
            // InternalMyDsl.g:1536:89: (iv_ruleOperationDefinitionBodyVariableDeclarationPhrase= ruleOperationDefinitionBodyVariableDeclarationPhrase EOF )
            // InternalMyDsl.g:1537:2: iv_ruleOperationDefinitionBodyVariableDeclarationPhrase= ruleOperationDefinitionBodyVariableDeclarationPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyVariableDeclarationPhrase=ruleOperationDefinitionBodyVariableDeclarationPhrase();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyVariableDeclarationPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyVariableDeclarationPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyVariableDeclarationPhrase"
    // InternalMyDsl.g:1543:1: ruleOperationDefinitionBodyVariableDeclarationPhrase returns [EObject current=null] : (otherlv_0= 'there_is_one' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOperationDefinitionBodyVariableDeclarationPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1549:2: ( (otherlv_0= 'there_is_one' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1550:2: (otherlv_0= 'there_is_one' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1550:2: (otherlv_0= 'there_is_one' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:1551:3: otherlv_0= 'there_is_one' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getThere_is_oneKeyword_0());
            		
            // InternalMyDsl.g:1555:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1556:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1556:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1557:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getTypeExistenceSingularIndefinitePhraseCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1568:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:1569:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1569:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:1570:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyVariableDeclarationPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyConditionalStmt"
    // InternalMyDsl.g:1590:1: entryRuleOperationDefinitionBodyConditionalStmt returns [EObject current=null] : iv_ruleOperationDefinitionBodyConditionalStmt= ruleOperationDefinitionBodyConditionalStmt EOF ;
    public final EObject entryRuleOperationDefinitionBodyConditionalStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinitionBodyConditionalStmt = null;


        try {
            // InternalMyDsl.g:1590:79: (iv_ruleOperationDefinitionBodyConditionalStmt= ruleOperationDefinitionBodyConditionalStmt EOF )
            // InternalMyDsl.g:1591:2: iv_ruleOperationDefinitionBodyConditionalStmt= ruleOperationDefinitionBodyConditionalStmt EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionBodyConditionalStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinitionBodyConditionalStmt=ruleOperationDefinitionBodyConditionalStmt();

            state._fsp--;

             current =iv_ruleOperationDefinitionBodyConditionalStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyConditionalStmt"


    // $ANTLR start "ruleOperationDefinitionBodyConditionalStmt"
    // InternalMyDsl.g:1597:1: ruleOperationDefinitionBodyConditionalStmt returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts ) ) (otherlv_5= ';' otherlv_6= 'else' ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) ) )? ) ;
    public final EObject ruleOperationDefinitionBodyConditionalStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenBody_4_0 = null;

        EObject lv_elseBody_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1603:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts ) ) (otherlv_5= ';' otherlv_6= 'else' ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) ) )? ) )
            // InternalMyDsl.g:1604:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts ) ) (otherlv_5= ';' otherlv_6= 'else' ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) ) )? )
            {
            // InternalMyDsl.g:1604:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts ) ) (otherlv_5= ';' otherlv_6= 'else' ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) ) )? )
            // InternalMyDsl.g:1605:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase ) ) otherlv_2= ',' otherlv_3= 'then' ( (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts ) ) (otherlv_5= ';' otherlv_6= 'else' ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getIfKeyword_0());
            		
            // InternalMyDsl.g:1609:3: ( (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase ) )
            // InternalMyDsl.g:1610:4: (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase )
            {
            // InternalMyDsl.g:1610:4: (lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase )
            // InternalMyDsl.g:1611:5: lv_condition_1_0= ruleOperationDefinitionBodyFunctionCallPhrase
            {

            					newCompositeNode(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getConditionOperationDefinitionBodyFunctionCallPhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_condition_1_0=ruleOperationDefinitionBodyFunctionCallPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationDefinitionBodyConditionalStmtRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.mydsl.MyDsl.OperationDefinitionBodyFunctionCallPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenKeyword_3());
            		
            // InternalMyDsl.g:1636:3: ( (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts ) )
            // InternalMyDsl.g:1637:4: (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts )
            {
            // InternalMyDsl.g:1637:4: (lv_thenBody_4_0= ruleOperationDefinitionBodyStmts )
            // InternalMyDsl.g:1638:5: lv_thenBody_4_0= ruleOperationDefinitionBodyStmts
            {

            					newCompositeNode(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenBodyOperationDefinitionBodyStmtsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_thenBody_4_0=ruleOperationDefinitionBodyStmts();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationDefinitionBodyConditionalStmtRule());
            					}
            					set(
            						current,
            						"thenBody",
            						lv_thenBody_4_0,
            						"org.xtext.example.mydsl.MyDsl.OperationDefinitionBodyStmts");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1655:3: (otherlv_5= ';' otherlv_6= 'else' ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1656:4: otherlv_5= ';' otherlv_6= 'else' ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getSemicolonKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,35,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseKeyword_5_1());
                    			
                    // InternalMyDsl.g:1664:4: ( (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts ) )
                    // InternalMyDsl.g:1665:5: (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts )
                    {
                    // InternalMyDsl.g:1665:5: (lv_elseBody_7_0= ruleOperationDefinitionBodyStmts )
                    // InternalMyDsl.g:1666:6: lv_elseBody_7_0= ruleOperationDefinitionBodyStmts
                    {

                    						newCompositeNode(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseBodyOperationDefinitionBodyStmtsParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBody_7_0=ruleOperationDefinitionBodyStmts();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationDefinitionBodyConditionalStmtRule());
                    						}
                    						set(
                    							current,
                    							"elseBody",
                    							lv_elseBody_7_0,
                    							"org.xtext.example.mydsl.MyDsl.OperationDefinitionBodyStmts");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDefinitionBodyConditionalStmt"


    // $ANTLR start "entryRuleOperationParameterVariableDeclarationPhrase"
    // InternalMyDsl.g:1688:1: entryRuleOperationParameterVariableDeclarationPhrase returns [EObject current=null] : iv_ruleOperationParameterVariableDeclarationPhrase= ruleOperationParameterVariableDeclarationPhrase EOF ;
    public final EObject entryRuleOperationParameterVariableDeclarationPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameterVariableDeclarationPhrase = null;


        try {
            // InternalMyDsl.g:1688:84: (iv_ruleOperationParameterVariableDeclarationPhrase= ruleOperationParameterVariableDeclarationPhrase EOF )
            // InternalMyDsl.g:1689:2: iv_ruleOperationParameterVariableDeclarationPhrase= ruleOperationParameterVariableDeclarationPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationParameterVariableDeclarationPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationParameterVariableDeclarationPhrase=ruleOperationParameterVariableDeclarationPhrase();

            state._fsp--;

             current =iv_ruleOperationParameterVariableDeclarationPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationParameterVariableDeclarationPhrase"


    // $ANTLR start "ruleOperationParameterVariableDeclarationPhrase"
    // InternalMyDsl.g:1695:1: ruleOperationParameterVariableDeclarationPhrase returns [EObject current=null] : ( ( (lv_type_0_0= ruleExistenceIndefiniteRefPhrase ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOperationParameterVariableDeclarationPhrase() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1701:2: ( ( ( (lv_type_0_0= ruleExistenceIndefiniteRefPhrase ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1702:2: ( ( (lv_type_0_0= ruleExistenceIndefiniteRefPhrase ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1702:2: ( ( (lv_type_0_0= ruleExistenceIndefiniteRefPhrase ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:1703:3: ( (lv_type_0_0= ruleExistenceIndefiniteRefPhrase ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1703:3: ( (lv_type_0_0= ruleExistenceIndefiniteRefPhrase ) )
            // InternalMyDsl.g:1704:4: (lv_type_0_0= ruleExistenceIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:1704:4: (lv_type_0_0= ruleExistenceIndefiniteRefPhrase )
            // InternalMyDsl.g:1705:5: lv_type_0_0= ruleExistenceIndefiniteRefPhrase
            {

            					newCompositeNode(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getTypeExistenceIndefiniteRefPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleExistenceIndefiniteRefPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationParameterVariableDeclarationPhraseRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.MyDsl.ExistenceIndefiniteRefPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1722:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1723:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1723:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1724:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationParameterVariableDeclarationPhraseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationParameterVariableDeclarationPhrase"


    // $ANTLR start "entryRuleOperationParameterConnectionPhrase"
    // InternalMyDsl.g:1744:1: entryRuleOperationParameterConnectionPhrase returns [EObject current=null] : iv_ruleOperationParameterConnectionPhrase= ruleOperationParameterConnectionPhrase EOF ;
    public final EObject entryRuleOperationParameterConnectionPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameterConnectionPhrase = null;


        try {
            // InternalMyDsl.g:1744:75: (iv_ruleOperationParameterConnectionPhrase= ruleOperationParameterConnectionPhrase EOF )
            // InternalMyDsl.g:1745:2: iv_ruleOperationParameterConnectionPhrase= ruleOperationParameterConnectionPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationParameterConnectionPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationParameterConnectionPhrase=ruleOperationParameterConnectionPhrase();

            state._fsp--;

             current =iv_ruleOperationParameterConnectionPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationParameterConnectionPhrase"


    // $ANTLR start "ruleOperationParameterConnectionPhrase"
    // InternalMyDsl.g:1751:1: ruleOperationParameterConnectionPhrase returns [EObject current=null] : ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' ) ) ) ;
    public final EObject ruleOperationParameterConnectionPhrase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1757:2: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' ) ) ) )
            // InternalMyDsl.g:1758:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' ) ) )
            {
            // InternalMyDsl.g:1758:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' ) ) )
            // InternalMyDsl.g:1759:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' ) )
            {
            // InternalMyDsl.g:1759:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' ) )
            // InternalMyDsl.g:1760:4: (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' )
            {
            // InternalMyDsl.g:1760:4: (lv_name_0_1= RULE_ID | lv_name_0_2= 'is' | lv_name_0_3= 'and' | lv_name_0_4= 'or' )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt28=1;
                }
                break;
            case 27:
                {
                alt28=2;
                }
                break;
            case 15:
                {
                alt28=3;
                }
                break;
            case 36:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1761:5: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getOperationParameterConnectionPhraseAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationParameterConnectionPhraseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1776:5: lv_name_0_2= 'is'
                    {
                    lv_name_0_2=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getOperationParameterConnectionPhraseAccess().getNameIsKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationParameterConnectionPhraseRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1787:5: lv_name_0_3= 'and'
                    {
                    lv_name_0_3=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getOperationParameterConnectionPhraseAccess().getNameAndKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationParameterConnectionPhraseRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1798:5: lv_name_0_4= 'or'
                    {
                    lv_name_0_4=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getOperationParameterConnectionPhraseAccess().getNameOrKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationParameterConnectionPhraseRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationParameterConnectionPhrase"


    // $ANTLR start "entryRuleOperationParameterConnectionBuiltinRefPhrase"
    // InternalMyDsl.g:1814:1: entryRuleOperationParameterConnectionBuiltinRefPhrase returns [EObject current=null] : iv_ruleOperationParameterConnectionBuiltinRefPhrase= ruleOperationParameterConnectionBuiltinRefPhrase EOF ;
    public final EObject entryRuleOperationParameterConnectionBuiltinRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameterConnectionBuiltinRefPhrase = null;


        try {
            // InternalMyDsl.g:1814:85: (iv_ruleOperationParameterConnectionBuiltinRefPhrase= ruleOperationParameterConnectionBuiltinRefPhrase EOF )
            // InternalMyDsl.g:1815:2: iv_ruleOperationParameterConnectionBuiltinRefPhrase= ruleOperationParameterConnectionBuiltinRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationParameterConnectionBuiltinRefPhrase=ruleOperationParameterConnectionBuiltinRefPhrase();

            state._fsp--;

             current =iv_ruleOperationParameterConnectionBuiltinRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationParameterConnectionBuiltinRefPhrase"


    // $ANTLR start "ruleOperationParameterConnectionBuiltinRefPhrase"
    // InternalMyDsl.g:1821:1: ruleOperationParameterConnectionBuiltinRefPhrase returns [EObject current=null] : ( ( (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' ) ) ) ;
    public final EObject ruleOperationParameterConnectionBuiltinRefPhrase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1827:2: ( ( ( (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' ) ) ) )
            // InternalMyDsl.g:1828:2: ( ( (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' ) ) )
            {
            // InternalMyDsl.g:1828:2: ( ( (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' ) ) )
            // InternalMyDsl.g:1829:3: ( (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' ) )
            {
            // InternalMyDsl.g:1829:3: ( (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' ) )
            // InternalMyDsl.g:1830:4: (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' )
            {
            // InternalMyDsl.g:1830:4: (lv_name_0_1= 'is' | lv_name_0_2= 'and' | lv_name_0_3= 'or' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt29=1;
                }
                break;
            case 15:
                {
                alt29=2;
                }
                break;
            case 36:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1831:5: lv_name_0_1= 'is'
                    {
                    lv_name_0_1=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameIsKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1842:5: lv_name_0_2= 'and'
                    {
                    lv_name_0_2=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameAndKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1853:5: lv_name_0_3= 'or'
                    {
                    lv_name_0_3=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameOrKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationParameterConnectionBuiltinRefPhrase"


    // $ANTLR start "entryRuleInstanceRefPhrase"
    // InternalMyDsl.g:1869:1: entryRuleInstanceRefPhrase returns [EObject current=null] : iv_ruleInstanceRefPhrase= ruleInstanceRefPhrase EOF ;
    public final EObject entryRuleInstanceRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceRefPhrase = null;


        try {
            // InternalMyDsl.g:1869:58: (iv_ruleInstanceRefPhrase= ruleInstanceRefPhrase EOF )
            // InternalMyDsl.g:1870:2: iv_ruleInstanceRefPhrase= ruleInstanceRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getInstanceRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceRefPhrase=ruleInstanceRefPhrase();

            state._fsp--;

             current =iv_ruleInstanceRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceRefPhrase"


    // $ANTLR start "ruleInstanceRefPhrase"
    // InternalMyDsl.g:1876:1: ruleInstanceRefPhrase returns [EObject current=null] : ( ( (lv_f_0_0= ruleInstanceDirectRefPhrase ) ) | (otherlv_1= 'the' ( (otherlv_2= RULE_ID ) ) ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )? ) ) ;
    public final EObject ruleInstanceRefPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_f_0_0 = null;

        EObject lv_f_3_1 = null;

        EObject lv_f_3_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1882:2: ( ( ( (lv_f_0_0= ruleInstanceDirectRefPhrase ) ) | (otherlv_1= 'the' ( (otherlv_2= RULE_ID ) ) ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )? ) ) )
            // InternalMyDsl.g:1883:2: ( ( (lv_f_0_0= ruleInstanceDirectRefPhrase ) ) | (otherlv_1= 'the' ( (otherlv_2= RULE_ID ) ) ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )? ) )
            {
            // InternalMyDsl.g:1883:2: ( ( (lv_f_0_0= ruleInstanceDirectRefPhrase ) ) | (otherlv_1= 'the' ( (otherlv_2= RULE_ID ) ) ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )? ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_INT && LA32_0<=RULE_STRING)) ) {
                alt32=1;
            }
            else if ( (LA32_0==13) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1884:3: ( (lv_f_0_0= ruleInstanceDirectRefPhrase ) )
                    {
                    // InternalMyDsl.g:1884:3: ( (lv_f_0_0= ruleInstanceDirectRefPhrase ) )
                    // InternalMyDsl.g:1885:4: (lv_f_0_0= ruleInstanceDirectRefPhrase )
                    {
                    // InternalMyDsl.g:1885:4: (lv_f_0_0= ruleInstanceDirectRefPhrase )
                    // InternalMyDsl.g:1886:5: lv_f_0_0= ruleInstanceDirectRefPhrase
                    {

                    					newCompositeNode(grammarAccess.getInstanceRefPhraseAccess().getFInstanceDirectRefPhraseParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_f_0_0=ruleInstanceDirectRefPhrase();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceRefPhraseRule());
                    					}
                    					set(
                    						current,
                    						"f",
                    						lv_f_0_0,
                    						"org.xtext.example.mydsl.MyDsl.InstanceDirectRefPhrase");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1904:3: (otherlv_1= 'the' ( (otherlv_2= RULE_ID ) ) ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )? )
                    {
                    // InternalMyDsl.g:1904:3: (otherlv_1= 'the' ( (otherlv_2= RULE_ID ) ) ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )? )
                    // InternalMyDsl.g:1905:4: otherlv_1= 'the' ( (otherlv_2= RULE_ID ) ) ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )?
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getInstanceRefPhraseAccess().getTheKeyword_1_0());
                    			
                    // InternalMyDsl.g:1909:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:1910:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1910:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1911:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInstanceRefPhraseRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_2, grammarAccess.getInstanceRefPhraseAccess().getClassExistenceAnyPhraseCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1922:4: ( ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_INT) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_STRING||LA31_0==37) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMyDsl.g:1923:5: ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) )
                            {
                            // InternalMyDsl.g:1923:5: ( (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase ) )
                            // InternalMyDsl.g:1924:6: (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase )
                            {
                            // InternalMyDsl.g:1924:6: (lv_f_3_1= ruleInstanceDirectRefPhrase | lv_f_3_2= ruleInstanceIndirectRefPhrase )
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_STRING)) ) {
                                alt30=1;
                            }
                            else if ( (LA30_0==37) ) {
                                alt30=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 0, input);

                                throw nvae;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalMyDsl.g:1925:7: lv_f_3_1= ruleInstanceDirectRefPhrase
                                    {

                                    							newCompositeNode(grammarAccess.getInstanceRefPhraseAccess().getFInstanceDirectRefPhraseParserRuleCall_1_2_0_0());
                                    						
                                    pushFollow(FOLLOW_2);
                                    lv_f_3_1=ruleInstanceDirectRefPhrase();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getInstanceRefPhraseRule());
                                    							}
                                    							set(
                                    								current,
                                    								"f",
                                    								lv_f_3_1,
                                    								"org.xtext.example.mydsl.MyDsl.InstanceDirectRefPhrase");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:1941:7: lv_f_3_2= ruleInstanceIndirectRefPhrase
                                    {

                                    							newCompositeNode(grammarAccess.getInstanceRefPhraseAccess().getFInstanceIndirectRefPhraseParserRuleCall_1_2_0_1());
                                    						
                                    pushFollow(FOLLOW_2);
                                    lv_f_3_2=ruleInstanceIndirectRefPhrase();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getInstanceRefPhraseRule());
                                    							}
                                    							set(
                                    								current,
                                    								"f",
                                    								lv_f_3_2,
                                    								"org.xtext.example.mydsl.MyDsl.InstanceIndirectRefPhrase");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceRefPhrase"


    // $ANTLR start "entryRuleInstanceDirectRefPhrase"
    // InternalMyDsl.g:1964:1: entryRuleInstanceDirectRefPhrase returns [EObject current=null] : iv_ruleInstanceDirectRefPhrase= ruleInstanceDirectRefPhrase EOF ;
    public final EObject entryRuleInstanceDirectRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceDirectRefPhrase = null;


        try {
            // InternalMyDsl.g:1964:64: (iv_ruleInstanceDirectRefPhrase= ruleInstanceDirectRefPhrase EOF )
            // InternalMyDsl.g:1965:2: iv_ruleInstanceDirectRefPhrase= ruleInstanceDirectRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getInstanceDirectRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceDirectRefPhrase=ruleInstanceDirectRefPhrase();

            state._fsp--;

             current =iv_ruleInstanceDirectRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceDirectRefPhrase"


    // $ANTLR start "ruleInstanceDirectRefPhrase"
    // InternalMyDsl.g:1971:1: ruleInstanceDirectRefPhrase returns [EObject current=null] : ( (lv_value_0_0= ruleInstanceBuiltinValuePhrase ) ) ;
    public final EObject ruleInstanceDirectRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1977:2: ( ( (lv_value_0_0= ruleInstanceBuiltinValuePhrase ) ) )
            // InternalMyDsl.g:1978:2: ( (lv_value_0_0= ruleInstanceBuiltinValuePhrase ) )
            {
            // InternalMyDsl.g:1978:2: ( (lv_value_0_0= ruleInstanceBuiltinValuePhrase ) )
            // InternalMyDsl.g:1979:3: (lv_value_0_0= ruleInstanceBuiltinValuePhrase )
            {
            // InternalMyDsl.g:1979:3: (lv_value_0_0= ruleInstanceBuiltinValuePhrase )
            // InternalMyDsl.g:1980:4: lv_value_0_0= ruleInstanceBuiltinValuePhrase
            {

            				newCompositeNode(grammarAccess.getInstanceDirectRefPhraseAccess().getValueInstanceBuiltinValuePhraseParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInstanceBuiltinValuePhrase();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getInstanceDirectRefPhraseRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.MyDsl.InstanceBuiltinValuePhrase");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceDirectRefPhrase"


    // $ANTLR start "entryRuleInstanceIndirectRefPhrase"
    // InternalMyDsl.g:2000:1: entryRuleInstanceIndirectRefPhrase returns [EObject current=null] : iv_ruleInstanceIndirectRefPhrase= ruleInstanceIndirectRefPhrase EOF ;
    public final EObject entryRuleInstanceIndirectRefPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceIndirectRefPhrase = null;


        try {
            // InternalMyDsl.g:2000:66: (iv_ruleInstanceIndirectRefPhrase= ruleInstanceIndirectRefPhrase EOF )
            // InternalMyDsl.g:2001:2: iv_ruleInstanceIndirectRefPhrase= ruleInstanceIndirectRefPhrase EOF
            {
             newCompositeNode(grammarAccess.getInstanceIndirectRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceIndirectRefPhrase=ruleInstanceIndirectRefPhrase();

            state._fsp--;

             current =iv_ruleInstanceIndirectRefPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceIndirectRefPhrase"


    // $ANTLR start "ruleInstanceIndirectRefPhrase"
    // InternalMyDsl.g:2007:1: ruleInstanceIndirectRefPhrase returns [EObject current=null] : (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleInstanceIndirectRefPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2013:2: ( (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:2014:2: (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2014:2: (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:2015:3: otherlv_0= 'in' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceIndirectRefPhraseAccess().getInKeyword_0());
            		
            // InternalMyDsl.g:2019:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:2020:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:2020:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:2021:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceIndirectRefPhraseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getInstanceIndirectRefPhraseAccess().getParentOperationDefinitionBodyFunctionCallInRefsObjectsPhraseCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceIndirectRefPhrase"


    // $ANTLR start "entryRuleInstanceBuiltinValuePhrase"
    // InternalMyDsl.g:2036:1: entryRuleInstanceBuiltinValuePhrase returns [EObject current=null] : iv_ruleInstanceBuiltinValuePhrase= ruleInstanceBuiltinValuePhrase EOF ;
    public final EObject entryRuleInstanceBuiltinValuePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceBuiltinValuePhrase = null;


        try {
            // InternalMyDsl.g:2036:67: (iv_ruleInstanceBuiltinValuePhrase= ruleInstanceBuiltinValuePhrase EOF )
            // InternalMyDsl.g:2037:2: iv_ruleInstanceBuiltinValuePhrase= ruleInstanceBuiltinValuePhrase EOF
            {
             newCompositeNode(grammarAccess.getInstanceBuiltinValuePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceBuiltinValuePhrase=ruleInstanceBuiltinValuePhrase();

            state._fsp--;

             current =iv_ruleInstanceBuiltinValuePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceBuiltinValuePhrase"


    // $ANTLR start "ruleInstanceBuiltinValuePhrase"
    // InternalMyDsl.g:2043:1: ruleInstanceBuiltinValuePhrase returns [EObject current=null] : (this_InstanceBuiltinValueIntegerPhrase_0= ruleInstanceBuiltinValueIntegerPhrase | this_InstanceBuiltinValueStringPhrase_1= ruleInstanceBuiltinValueStringPhrase ) ;
    public final EObject ruleInstanceBuiltinValuePhrase() throws RecognitionException {
        EObject current = null;

        EObject this_InstanceBuiltinValueIntegerPhrase_0 = null;

        EObject this_InstanceBuiltinValueStringPhrase_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2049:2: ( (this_InstanceBuiltinValueIntegerPhrase_0= ruleInstanceBuiltinValueIntegerPhrase | this_InstanceBuiltinValueStringPhrase_1= ruleInstanceBuiltinValueStringPhrase ) )
            // InternalMyDsl.g:2050:2: (this_InstanceBuiltinValueIntegerPhrase_0= ruleInstanceBuiltinValueIntegerPhrase | this_InstanceBuiltinValueStringPhrase_1= ruleInstanceBuiltinValueStringPhrase )
            {
            // InternalMyDsl.g:2050:2: (this_InstanceBuiltinValueIntegerPhrase_0= ruleInstanceBuiltinValueIntegerPhrase | this_InstanceBuiltinValueStringPhrase_1= ruleInstanceBuiltinValueStringPhrase )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2051:3: this_InstanceBuiltinValueIntegerPhrase_0= ruleInstanceBuiltinValueIntegerPhrase
                    {

                    			newCompositeNode(grammarAccess.getInstanceBuiltinValuePhraseAccess().getInstanceBuiltinValueIntegerPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceBuiltinValueIntegerPhrase_0=ruleInstanceBuiltinValueIntegerPhrase();

                    state._fsp--;


                    			current = this_InstanceBuiltinValueIntegerPhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2060:3: this_InstanceBuiltinValueStringPhrase_1= ruleInstanceBuiltinValueStringPhrase
                    {

                    			newCompositeNode(grammarAccess.getInstanceBuiltinValuePhraseAccess().getInstanceBuiltinValueStringPhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceBuiltinValueStringPhrase_1=ruleInstanceBuiltinValueStringPhrase();

                    state._fsp--;


                    			current = this_InstanceBuiltinValueStringPhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceBuiltinValuePhrase"


    // $ANTLR start "entryRuleInstanceBuiltinValueIntegerPhrase"
    // InternalMyDsl.g:2072:1: entryRuleInstanceBuiltinValueIntegerPhrase returns [EObject current=null] : iv_ruleInstanceBuiltinValueIntegerPhrase= ruleInstanceBuiltinValueIntegerPhrase EOF ;
    public final EObject entryRuleInstanceBuiltinValueIntegerPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceBuiltinValueIntegerPhrase = null;


        try {
            // InternalMyDsl.g:2072:74: (iv_ruleInstanceBuiltinValueIntegerPhrase= ruleInstanceBuiltinValueIntegerPhrase EOF )
            // InternalMyDsl.g:2073:2: iv_ruleInstanceBuiltinValueIntegerPhrase= ruleInstanceBuiltinValueIntegerPhrase EOF
            {
             newCompositeNode(grammarAccess.getInstanceBuiltinValueIntegerPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceBuiltinValueIntegerPhrase=ruleInstanceBuiltinValueIntegerPhrase();

            state._fsp--;

             current =iv_ruleInstanceBuiltinValueIntegerPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceBuiltinValueIntegerPhrase"


    // $ANTLR start "ruleInstanceBuiltinValueIntegerPhrase"
    // InternalMyDsl.g:2079:1: ruleInstanceBuiltinValueIntegerPhrase returns [EObject current=null] : ( () ( (lv_v_1_0= RULE_INT ) ) ) ;
    public final EObject ruleInstanceBuiltinValueIntegerPhrase() throws RecognitionException {
        EObject current = null;

        Token lv_v_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2085:2: ( ( () ( (lv_v_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:2086:2: ( () ( (lv_v_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:2086:2: ( () ( (lv_v_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:2087:3: () ( (lv_v_1_0= RULE_INT ) )
            {
            // InternalMyDsl.g:2087:3: ()
            // InternalMyDsl.g:2088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getInstanceBuiltinValueIntegerPhraseAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2094:3: ( (lv_v_1_0= RULE_INT ) )
            // InternalMyDsl.g:2095:4: (lv_v_1_0= RULE_INT )
            {
            // InternalMyDsl.g:2095:4: (lv_v_1_0= RULE_INT )
            // InternalMyDsl.g:2096:5: lv_v_1_0= RULE_INT
            {
            lv_v_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_v_1_0, grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getVINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceBuiltinValueIntegerPhraseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"v",
            						lv_v_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceBuiltinValueIntegerPhrase"


    // $ANTLR start "entryRuleInstanceBuiltinValueStringPhrase"
    // InternalMyDsl.g:2116:1: entryRuleInstanceBuiltinValueStringPhrase returns [EObject current=null] : iv_ruleInstanceBuiltinValueStringPhrase= ruleInstanceBuiltinValueStringPhrase EOF ;
    public final EObject entryRuleInstanceBuiltinValueStringPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceBuiltinValueStringPhrase = null;


        try {
            // InternalMyDsl.g:2116:73: (iv_ruleInstanceBuiltinValueStringPhrase= ruleInstanceBuiltinValueStringPhrase EOF )
            // InternalMyDsl.g:2117:2: iv_ruleInstanceBuiltinValueStringPhrase= ruleInstanceBuiltinValueStringPhrase EOF
            {
             newCompositeNode(grammarAccess.getInstanceBuiltinValueStringPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceBuiltinValueStringPhrase=ruleInstanceBuiltinValueStringPhrase();

            state._fsp--;

             current =iv_ruleInstanceBuiltinValueStringPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceBuiltinValueStringPhrase"


    // $ANTLR start "ruleInstanceBuiltinValueStringPhrase"
    // InternalMyDsl.g:2123:1: ruleInstanceBuiltinValueStringPhrase returns [EObject current=null] : ( () ( (lv_v_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstanceBuiltinValueStringPhrase() throws RecognitionException {
        EObject current = null;

        Token lv_v_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2129:2: ( ( () ( (lv_v_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:2130:2: ( () ( (lv_v_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:2130:2: ( () ( (lv_v_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:2131:3: () ( (lv_v_1_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:2131:3: ()
            // InternalMyDsl.g:2132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getInstanceBuiltinValueStringPhraseAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2138:3: ( (lv_v_1_0= RULE_STRING ) )
            // InternalMyDsl.g:2139:4: (lv_v_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:2139:4: (lv_v_1_0= RULE_STRING )
            // InternalMyDsl.g:2140:5: lv_v_1_0= RULE_STRING
            {
            lv_v_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_v_1_0, grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getVSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceBuiltinValueStringPhraseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"v",
            						lv_v_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceBuiltinValueStringPhrase"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\14\1\uffff\4\4\1\uffff\2\16\1\15\2\uffff\1\17\1\15\1\4\1\23\3\4\2\16";
    static final String dfa_3s = "\1\40\1\uffff\4\4\1\uffff\2\34\1\17\2\uffff\1\25\1\15\1\4\1\25\3\4\2\34";
    static final String dfa_4s = "\1\uffff\1\1\4\uffff\1\4\3\uffff\1\3\1\2\11\uffff";
    static final String dfa_5s = "\25\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\2\uffff\1\1\2\uffff\1\3\1\4\1\5\7\uffff\4\6",
            "",
            "\1\7",
            "\1\10",
            "\1\10",
            "\1\10",
            "",
            "\1\11\11\uffff\3\13\2\12",
            "\1\14\11\uffff\3\13\2\12",
            "\1\16\1\uffff\1\15",
            "",
            "",
            "\1\17\3\uffff\1\20\1\21\1\22",
            "\1\16",
            "\1\23",
            "\1\20\1\21\1\22",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\11\11\uffff\3\13\2\12",
            "\1\14\11\uffff\3\13\2\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:3: (this_ExistenceStmt_0= ruleExistenceStmt | this_CompositionStmt_1= ruleCompositionStmt | this_InheritanceStmt_2= ruleInheritanceStmt | this_OperationStmt_3= ruleOperationStmt )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001E0393002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000038A000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C08030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000F8A030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001008F8A030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001008F8A032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000110800B070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000100800A072L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000100800A070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000062L});

}