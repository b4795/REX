package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'one'", "'a'", "'an'", "'one_or_more'", "'zero_or_more'", "'has'", "'is_composed_by'", "'contains'", "'is'", "'are_each'", "'it_is_possible_that'", "'it_is_possible_to'", "'it_is_possible'", "'and'", "'or'", "'.'", "'there_is_one'", "'the'", "','", "'there_are'", "'('", "')'", "'if'", "'then'", "';'", "'else'", "'in'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__StmtAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__StmtAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__StmtAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__StmtAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__StmtAssignment )*
            {
             before(grammarAccess.getModelAccess().getStmtAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__StmtAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)||(LA1_0>=21 && LA1_0<=23)||(LA1_0>=27 && LA1_0<=28)||LA1_0==30||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__StmtAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StmtAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStmtAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStmt"
    // InternalMyDsl.g:78:1: entryRuleStmt : ruleStmt EOF ;
    public final void entryRuleStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStmt EOF )
            // InternalMyDsl.g:80:1: ruleStmt EOF
            {
             before(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleStmt();

            state._fsp--;

             after(grammarAccess.getStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMyDsl.g:87:1: ruleStmt : ( ( rule__Stmt__Group__0 ) ) ;
    public final void ruleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Stmt__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Stmt__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Stmt__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Stmt__Group__0 )
            {
             before(grammarAccess.getStmtAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Stmt__Group__0 )
            // InternalMyDsl.g:94:4: rule__Stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleExistenceStmt"
    // InternalMyDsl.g:103:1: entryRuleExistenceStmt : ruleExistenceStmt EOF ;
    public final void entryRuleExistenceStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleExistenceStmt EOF )
            // InternalMyDsl.g:105:1: ruleExistenceStmt EOF
            {
             before(grammarAccess.getExistenceStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceStmt();

            state._fsp--;

             after(grammarAccess.getExistenceStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceStmt"


    // $ANTLR start "ruleExistenceStmt"
    // InternalMyDsl.g:112:1: ruleExistenceStmt : ( ( rule__ExistenceStmt__Alternatives ) ) ;
    public final void ruleExistenceStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ExistenceStmt__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ExistenceStmt__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ExistenceStmt__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__ExistenceStmt__Alternatives )
            {
             before(grammarAccess.getExistenceStmtAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__ExistenceStmt__Alternatives )
            // InternalMyDsl.g:119:4: rule__ExistenceStmt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceStmt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExistenceStmtAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceStmt"


    // $ANTLR start "entryRuleExistenceDefiniteStmt"
    // InternalMyDsl.g:128:1: entryRuleExistenceDefiniteStmt : ruleExistenceDefiniteStmt EOF ;
    public final void entryRuleExistenceDefiniteStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleExistenceDefiniteStmt EOF )
            // InternalMyDsl.g:130:1: ruleExistenceDefiniteStmt EOF
            {
             before(grammarAccess.getExistenceDefiniteStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceDefiniteStmt();

            state._fsp--;

             after(grammarAccess.getExistenceDefiniteStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceDefiniteStmt"


    // $ANTLR start "ruleExistenceDefiniteStmt"
    // InternalMyDsl.g:137:1: ruleExistenceDefiniteStmt : ( ( rule__ExistenceDefiniteStmt__Group__0 ) ) ;
    public final void ruleExistenceDefiniteStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ExistenceDefiniteStmt__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ExistenceDefiniteStmt__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ExistenceDefiniteStmt__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ExistenceDefiniteStmt__Group__0 )
            {
             before(grammarAccess.getExistenceDefiniteStmtAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ExistenceDefiniteStmt__Group__0 )
            // InternalMyDsl.g:144:4: rule__ExistenceDefiniteStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefiniteStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceDefiniteStmt"


    // $ANTLR start "entryRuleExistenceDefinitePhrase"
    // InternalMyDsl.g:153:1: entryRuleExistenceDefinitePhrase : ruleExistenceDefinitePhrase EOF ;
    public final void entryRuleExistenceDefinitePhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleExistenceDefinitePhrase EOF )
            // InternalMyDsl.g:155:1: ruleExistenceDefinitePhrase EOF
            {
             before(grammarAccess.getExistenceDefinitePhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceDefinitePhrase();

            state._fsp--;

             after(grammarAccess.getExistenceDefinitePhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceDefinitePhrase"


    // $ANTLR start "ruleExistenceDefinitePhrase"
    // InternalMyDsl.g:162:1: ruleExistenceDefinitePhrase : ( ( rule__ExistenceDefinitePhrase__NameAssignment ) ) ;
    public final void ruleExistenceDefinitePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ExistenceDefinitePhrase__NameAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ExistenceDefinitePhrase__NameAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ExistenceDefinitePhrase__NameAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__ExistenceDefinitePhrase__NameAssignment )
            {
             before(grammarAccess.getExistenceDefinitePhraseAccess().getNameAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__ExistenceDefinitePhrase__NameAssignment )
            // InternalMyDsl.g:169:4: rule__ExistenceDefinitePhrase__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefinitePhrase__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefinitePhraseAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceDefinitePhrase"


    // $ANTLR start "entryRuleExistenceDefiniteRefPhrase"
    // InternalMyDsl.g:178:1: entryRuleExistenceDefiniteRefPhrase : ruleExistenceDefiniteRefPhrase EOF ;
    public final void entryRuleExistenceDefiniteRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleExistenceDefiniteRefPhrase EOF )
            // InternalMyDsl.g:180:1: ruleExistenceDefiniteRefPhrase EOF
            {
             before(grammarAccess.getExistenceDefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceDefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceDefiniteRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceDefiniteRefPhrase"


    // $ANTLR start "ruleExistenceDefiniteRefPhrase"
    // InternalMyDsl.g:187:1: ruleExistenceDefiniteRefPhrase : ( ( rule__ExistenceDefiniteRefPhrase__Group__0 ) ) ;
    public final void ruleExistenceDefiniteRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ExistenceDefiniteRefPhrase__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ExistenceDefiniteRefPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ExistenceDefiniteRefPhrase__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__ExistenceDefiniteRefPhrase__Group__0 )
            {
             before(grammarAccess.getExistenceDefiniteRefPhraseAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__ExistenceDefiniteRefPhrase__Group__0 )
            // InternalMyDsl.g:194:4: rule__ExistenceDefiniteRefPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefiniteRefPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceDefiniteRefPhrase"


    // $ANTLR start "entryRuleExistenceDefiniteRefListPhrase"
    // InternalMyDsl.g:203:1: entryRuleExistenceDefiniteRefListPhrase : ruleExistenceDefiniteRefListPhrase EOF ;
    public final void entryRuleExistenceDefiniteRefListPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleExistenceDefiniteRefListPhrase EOF )
            // InternalMyDsl.g:205:1: ruleExistenceDefiniteRefListPhrase EOF
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceDefiniteRefListPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceDefiniteRefListPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceDefiniteRefListPhrase"


    // $ANTLR start "ruleExistenceDefiniteRefListPhrase"
    // InternalMyDsl.g:212:1: ruleExistenceDefiniteRefListPhrase : ( ( rule__ExistenceDefiniteRefListPhrase__Group__0 ) ) ;
    public final void ruleExistenceDefiniteRefListPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ExistenceDefiniteRefListPhrase__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ExistenceDefiniteRefListPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ExistenceDefiniteRefListPhrase__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ExistenceDefiniteRefListPhrase__Group__0 )
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ExistenceDefiniteRefListPhrase__Group__0 )
            // InternalMyDsl.g:219:4: rule__ExistenceDefiniteRefListPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceDefiniteRefListPhrase"


    // $ANTLR start "entryRuleExistenceIndefiniteStmt"
    // InternalMyDsl.g:228:1: entryRuleExistenceIndefiniteStmt : ruleExistenceIndefiniteStmt EOF ;
    public final void entryRuleExistenceIndefiniteStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleExistenceIndefiniteStmt EOF )
            // InternalMyDsl.g:230:1: ruleExistenceIndefiniteStmt EOF
            {
             before(grammarAccess.getExistenceIndefiniteStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceIndefiniteStmt();

            state._fsp--;

             after(grammarAccess.getExistenceIndefiniteStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceIndefiniteStmt"


    // $ANTLR start "ruleExistenceIndefiniteStmt"
    // InternalMyDsl.g:237:1: ruleExistenceIndefiniteStmt : ( ( rule__ExistenceIndefiniteStmt__Group__0 ) ) ;
    public final void ruleExistenceIndefiniteStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ExistenceIndefiniteStmt__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ExistenceIndefiniteStmt__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ExistenceIndefiniteStmt__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__ExistenceIndefiniteStmt__Group__0 )
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__ExistenceIndefiniteStmt__Group__0 )
            // InternalMyDsl.g:244:4: rule__ExistenceIndefiniteStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceIndefiniteStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceIndefiniteStmt"


    // $ANTLR start "entryRuleExistenceSingularIndefinitePhrase"
    // InternalMyDsl.g:253:1: entryRuleExistenceSingularIndefinitePhrase : ruleExistenceSingularIndefinitePhrase EOF ;
    public final void entryRuleExistenceSingularIndefinitePhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleExistenceSingularIndefinitePhrase EOF )
            // InternalMyDsl.g:255:1: ruleExistenceSingularIndefinitePhrase EOF
            {
             before(grammarAccess.getExistenceSingularIndefinitePhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceSingularIndefinitePhrase();

            state._fsp--;

             after(grammarAccess.getExistenceSingularIndefinitePhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceSingularIndefinitePhrase"


    // $ANTLR start "ruleExistenceSingularIndefinitePhrase"
    // InternalMyDsl.g:262:1: ruleExistenceSingularIndefinitePhrase : ( ( rule__ExistenceSingularIndefinitePhrase__NameAssignment ) ) ;
    public final void ruleExistenceSingularIndefinitePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ExistenceSingularIndefinitePhrase__NameAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ExistenceSingularIndefinitePhrase__NameAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ExistenceSingularIndefinitePhrase__NameAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__ExistenceSingularIndefinitePhrase__NameAssignment )
            {
             before(grammarAccess.getExistenceSingularIndefinitePhraseAccess().getNameAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__ExistenceSingularIndefinitePhrase__NameAssignment )
            // InternalMyDsl.g:269:4: rule__ExistenceSingularIndefinitePhrase__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefinitePhrase__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularIndefinitePhraseAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceSingularIndefinitePhrase"


    // $ANTLR start "entryRuleExistencePluralIndefinitePhrase"
    // InternalMyDsl.g:278:1: entryRuleExistencePluralIndefinitePhrase : ruleExistencePluralIndefinitePhrase EOF ;
    public final void entryRuleExistencePluralIndefinitePhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleExistencePluralIndefinitePhrase EOF )
            // InternalMyDsl.g:280:1: ruleExistencePluralIndefinitePhrase EOF
            {
             before(grammarAccess.getExistencePluralIndefinitePhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistencePluralIndefinitePhrase();

            state._fsp--;

             after(grammarAccess.getExistencePluralIndefinitePhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistencePluralIndefinitePhrase"


    // $ANTLR start "ruleExistencePluralIndefinitePhrase"
    // InternalMyDsl.g:287:1: ruleExistencePluralIndefinitePhrase : ( ( rule__ExistencePluralIndefinitePhrase__NameAssignment ) ) ;
    public final void ruleExistencePluralIndefinitePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ExistencePluralIndefinitePhrase__NameAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ExistencePluralIndefinitePhrase__NameAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ExistencePluralIndefinitePhrase__NameAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__ExistencePluralIndefinitePhrase__NameAssignment )
            {
             before(grammarAccess.getExistencePluralIndefinitePhraseAccess().getNameAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__ExistencePluralIndefinitePhrase__NameAssignment )
            // InternalMyDsl.g:294:4: rule__ExistencePluralIndefinitePhrase__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefinitePhrase__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExistencePluralIndefinitePhraseAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistencePluralIndefinitePhrase"


    // $ANTLR start "entryRuleExistenceSingularIndefiniteRefPhrase"
    // InternalMyDsl.g:303:1: entryRuleExistenceSingularIndefiniteRefPhrase : ruleExistenceSingularIndefiniteRefPhrase EOF ;
    public final void entryRuleExistenceSingularIndefiniteRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleExistenceSingularIndefiniteRefPhrase EOF )
            // InternalMyDsl.g:305:1: ruleExistenceSingularIndefiniteRefPhrase EOF
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceSingularIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceSingularIndefiniteRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceSingularIndefiniteRefPhrase"


    // $ANTLR start "ruleExistenceSingularIndefiniteRefPhrase"
    // InternalMyDsl.g:312:1: ruleExistenceSingularIndefiniteRefPhrase : ( ( rule__ExistenceSingularIndefiniteRefPhrase__Group__0 ) ) ;
    public final void ruleExistenceSingularIndefiniteRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ExistenceSingularIndefiniteRefPhrase__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ExistenceSingularIndefiniteRefPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ExistenceSingularIndefiniteRefPhrase__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ExistenceSingularIndefiniteRefPhrase__Group__0 )
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ExistenceSingularIndefiniteRefPhrase__Group__0 )
            // InternalMyDsl.g:319:4: rule__ExistenceSingularIndefiniteRefPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceSingularIndefiniteRefPhrase"


    // $ANTLR start "entryRuleExistencePluralIndefiniteRefPhrase"
    // InternalMyDsl.g:328:1: entryRuleExistencePluralIndefiniteRefPhrase : ruleExistencePluralIndefiniteRefPhrase EOF ;
    public final void entryRuleExistencePluralIndefiniteRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleExistencePluralIndefiniteRefPhrase EOF )
            // InternalMyDsl.g:330:1: ruleExistencePluralIndefiniteRefPhrase EOF
            {
             before(grammarAccess.getExistencePluralIndefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistencePluralIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistencePluralIndefiniteRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistencePluralIndefiniteRefPhrase"


    // $ANTLR start "ruleExistencePluralIndefiniteRefPhrase"
    // InternalMyDsl.g:337:1: ruleExistencePluralIndefiniteRefPhrase : ( ( rule__ExistencePluralIndefiniteRefPhrase__Group__0 ) ) ;
    public final void ruleExistencePluralIndefiniteRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ExistencePluralIndefiniteRefPhrase__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ExistencePluralIndefiniteRefPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ExistencePluralIndefiniteRefPhrase__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ExistencePluralIndefiniteRefPhrase__Group__0 )
            {
             before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ExistencePluralIndefiniteRefPhrase__Group__0 )
            // InternalMyDsl.g:344:4: rule__ExistencePluralIndefiniteRefPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistencePluralIndefiniteRefPhrase"


    // $ANTLR start "entryRuleExistenceSingularIndefiniteRefListPhrase"
    // InternalMyDsl.g:353:1: entryRuleExistenceSingularIndefiniteRefListPhrase : ruleExistenceSingularIndefiniteRefListPhrase EOF ;
    public final void entryRuleExistenceSingularIndefiniteRefListPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleExistenceSingularIndefiniteRefListPhrase EOF )
            // InternalMyDsl.g:355:1: ruleExistenceSingularIndefiniteRefListPhrase EOF
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceSingularIndefiniteRefListPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceSingularIndefiniteRefListPhrase"


    // $ANTLR start "ruleExistenceSingularIndefiniteRefListPhrase"
    // InternalMyDsl.g:362:1: ruleExistenceSingularIndefiniteRefListPhrase : ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__0 ) ) ;
    public final void ruleExistenceSingularIndefiniteRefListPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__0 )
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__0 )
            // InternalMyDsl.g:369:4: rule__ExistenceSingularIndefiniteRefListPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceSingularIndefiniteRefListPhrase"


    // $ANTLR start "entryRuleExistencePluralIndefiniteRefListPhrase"
    // InternalMyDsl.g:378:1: entryRuleExistencePluralIndefiniteRefListPhrase : ruleExistencePluralIndefiniteRefListPhrase EOF ;
    public final void entryRuleExistencePluralIndefiniteRefListPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleExistencePluralIndefiniteRefListPhrase EOF )
            // InternalMyDsl.g:380:1: ruleExistencePluralIndefiniteRefListPhrase EOF
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistencePluralIndefiniteRefListPhrase();

            state._fsp--;

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistencePluralIndefiniteRefListPhrase"


    // $ANTLR start "ruleExistencePluralIndefiniteRefListPhrase"
    // InternalMyDsl.g:387:1: ruleExistencePluralIndefiniteRefListPhrase : ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group__0 ) ) ;
    public final void ruleExistencePluralIndefiniteRefListPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__ExistencePluralIndefiniteRefListPhrase__Group__0 )
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__ExistencePluralIndefiniteRefListPhrase__Group__0 )
            // InternalMyDsl.g:394:4: rule__ExistencePluralIndefiniteRefListPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistencePluralIndefiniteRefListPhrase"


    // $ANTLR start "entryRuleExistenceSingularRefListPhrase"
    // InternalMyDsl.g:403:1: entryRuleExistenceSingularRefListPhrase : ruleExistenceSingularRefListPhrase EOF ;
    public final void entryRuleExistenceSingularRefListPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleExistenceSingularRefListPhrase EOF )
            // InternalMyDsl.g:405:1: ruleExistenceSingularRefListPhrase EOF
            {
             before(grammarAccess.getExistenceSingularRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceSingularRefListPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceSingularRefListPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceSingularRefListPhrase"


    // $ANTLR start "ruleExistenceSingularRefListPhrase"
    // InternalMyDsl.g:412:1: ruleExistenceSingularRefListPhrase : ( ( rule__ExistenceSingularRefListPhrase__Alternatives ) ) ;
    public final void ruleExistenceSingularRefListPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__ExistenceSingularRefListPhrase__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__ExistenceSingularRefListPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__ExistenceSingularRefListPhrase__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__ExistenceSingularRefListPhrase__Alternatives )
            {
             before(grammarAccess.getExistenceSingularRefListPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__ExistenceSingularRefListPhrase__Alternatives )
            // InternalMyDsl.g:419:4: rule__ExistenceSingularRefListPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularRefListPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularRefListPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceSingularRefListPhrase"


    // $ANTLR start "entryRuleExistenceAnyRefListPhrase"
    // InternalMyDsl.g:428:1: entryRuleExistenceAnyRefListPhrase : ruleExistenceAnyRefListPhrase EOF ;
    public final void entryRuleExistenceAnyRefListPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleExistenceAnyRefListPhrase EOF )
            // InternalMyDsl.g:430:1: ruleExistenceAnyRefListPhrase EOF
            {
             before(grammarAccess.getExistenceAnyRefListPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceAnyRefListPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceAnyRefListPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceAnyRefListPhrase"


    // $ANTLR start "ruleExistenceAnyRefListPhrase"
    // InternalMyDsl.g:437:1: ruleExistenceAnyRefListPhrase : ( ( rule__ExistenceAnyRefListPhrase__Alternatives ) ) ;
    public final void ruleExistenceAnyRefListPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__ExistenceAnyRefListPhrase__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__ExistenceAnyRefListPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__ExistenceAnyRefListPhrase__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__ExistenceAnyRefListPhrase__Alternatives )
            {
             before(grammarAccess.getExistenceAnyRefListPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__ExistenceAnyRefListPhrase__Alternatives )
            // InternalMyDsl.g:444:4: rule__ExistenceAnyRefListPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceAnyRefListPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExistenceAnyRefListPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceAnyRefListPhrase"


    // $ANTLR start "entryRuleExistenceIndefiniteRefPhrase"
    // InternalMyDsl.g:453:1: entryRuleExistenceIndefiniteRefPhrase : ruleExistenceIndefiniteRefPhrase EOF ;
    public final void entryRuleExistenceIndefiniteRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleExistenceIndefiniteRefPhrase EOF )
            // InternalMyDsl.g:455:1: ruleExistenceIndefiniteRefPhrase EOF
            {
             before(grammarAccess.getExistenceIndefiniteRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenceIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceIndefiniteRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistenceIndefiniteRefPhrase"


    // $ANTLR start "ruleExistenceIndefiniteRefPhrase"
    // InternalMyDsl.g:462:1: ruleExistenceIndefiniteRefPhrase : ( ( rule__ExistenceIndefiniteRefPhrase__Alternatives ) ) ;
    public final void ruleExistenceIndefiniteRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__ExistenceIndefiniteRefPhrase__Alternatives ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__ExistenceIndefiniteRefPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__ExistenceIndefiniteRefPhrase__Alternatives ) )
            // InternalMyDsl.g:468:3: ( rule__ExistenceIndefiniteRefPhrase__Alternatives )
            {
             before(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:469:3: ( rule__ExistenceIndefiniteRefPhrase__Alternatives )
            // InternalMyDsl.g:469:4: rule__ExistenceIndefiniteRefPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteRefPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistenceIndefiniteRefPhrase"


    // $ANTLR start "entryRuleCompositionStmt"
    // InternalMyDsl.g:478:1: entryRuleCompositionStmt : ruleCompositionStmt EOF ;
    public final void entryRuleCompositionStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleCompositionStmt EOF )
            // InternalMyDsl.g:480:1: ruleCompositionStmt EOF
            {
             before(grammarAccess.getCompositionStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositionStmt();

            state._fsp--;

             after(grammarAccess.getCompositionStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositionStmt"


    // $ANTLR start "ruleCompositionStmt"
    // InternalMyDsl.g:487:1: ruleCompositionStmt : ( ( rule__CompositionStmt__Group__0 ) ) ;
    public final void ruleCompositionStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__CompositionStmt__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__CompositionStmt__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__CompositionStmt__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__CompositionStmt__Group__0 )
            {
             before(grammarAccess.getCompositionStmtAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__CompositionStmt__Group__0 )
            // InternalMyDsl.g:494:4: rule__CompositionStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionStmt"


    // $ANTLR start "entryRuleInheritanceStmt"
    // InternalMyDsl.g:503:1: entryRuleInheritanceStmt : ruleInheritanceStmt EOF ;
    public final void entryRuleInheritanceStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleInheritanceStmt EOF )
            // InternalMyDsl.g:505:1: ruleInheritanceStmt EOF
            {
             before(grammarAccess.getInheritanceStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleInheritanceStmt();

            state._fsp--;

             after(grammarAccess.getInheritanceStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInheritanceStmt"


    // $ANTLR start "ruleInheritanceStmt"
    // InternalMyDsl.g:512:1: ruleInheritanceStmt : ( ( rule__InheritanceStmt__Group__0 ) ) ;
    public final void ruleInheritanceStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__InheritanceStmt__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__InheritanceStmt__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__InheritanceStmt__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__InheritanceStmt__Group__0 )
            {
             before(grammarAccess.getInheritanceStmtAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__InheritanceStmt__Group__0 )
            // InternalMyDsl.g:519:4: rule__InheritanceStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInheritanceStmt"


    // $ANTLR start "entryRuleOperationStmt"
    // InternalMyDsl.g:528:1: entryRuleOperationStmt : ruleOperationStmt EOF ;
    public final void entryRuleOperationStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleOperationStmt EOF )
            // InternalMyDsl.g:530:1: ruleOperationStmt EOF
            {
             before(grammarAccess.getOperationStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationStmt();

            state._fsp--;

             after(grammarAccess.getOperationStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationStmt"


    // $ANTLR start "ruleOperationStmt"
    // InternalMyDsl.g:537:1: ruleOperationStmt : ( ( rule__OperationStmt__Alternatives ) ) ;
    public final void ruleOperationStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__OperationStmt__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__OperationStmt__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__OperationStmt__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__OperationStmt__Alternatives )
            {
             before(grammarAccess.getOperationStmtAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__OperationStmt__Alternatives )
            // InternalMyDsl.g:544:4: rule__OperationStmt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationStmt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationStmtAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationStmt"


    // $ANTLR start "entryRuleOperationDeclarationStmt"
    // InternalMyDsl.g:553:1: entryRuleOperationDeclarationStmt : ruleOperationDeclarationStmt EOF ;
    public final void entryRuleOperationDeclarationStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleOperationDeclarationStmt EOF )
            // InternalMyDsl.g:555:1: ruleOperationDeclarationStmt EOF
            {
             before(grammarAccess.getOperationDeclarationStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDeclarationStmt();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDeclarationStmt"


    // $ANTLR start "ruleOperationDeclarationStmt"
    // InternalMyDsl.g:562:1: ruleOperationDeclarationStmt : ( ( rule__OperationDeclarationStmt__Group__0 ) ) ;
    public final void ruleOperationDeclarationStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__OperationDeclarationStmt__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__OperationDeclarationStmt__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__OperationDeclarationStmt__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__OperationDeclarationStmt__Group__0 )
            {
             before(grammarAccess.getOperationDeclarationStmtAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__OperationDeclarationStmt__Group__0 )
            // InternalMyDsl.g:569:4: rule__OperationDeclarationStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclarationStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDeclarationStmt"


    // $ANTLR start "entryRuleOperationDeclarionHeaderStmt"
    // InternalMyDsl.g:578:1: entryRuleOperationDeclarionHeaderStmt : ruleOperationDeclarionHeaderStmt EOF ;
    public final void entryRuleOperationDeclarionHeaderStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleOperationDeclarionHeaderStmt EOF )
            // InternalMyDsl.g:580:1: ruleOperationDeclarionHeaderStmt EOF
            {
             before(grammarAccess.getOperationDeclarionHeaderStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDeclarionHeaderStmt();

            state._fsp--;

             after(grammarAccess.getOperationDeclarionHeaderStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDeclarionHeaderStmt"


    // $ANTLR start "ruleOperationDeclarionHeaderStmt"
    // InternalMyDsl.g:587:1: ruleOperationDeclarionHeaderStmt : ( ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment ) ) ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )* ) ) ;
    public final void ruleOperationDeclarionHeaderStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment ) ) ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )* ) ) )
            // InternalMyDsl.g:592:2: ( ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment ) ) ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )* ) )
            {
            // InternalMyDsl.g:592:2: ( ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment ) ) ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )* ) )
            // InternalMyDsl.g:593:3: ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment ) ) ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )* )
            {
            // InternalMyDsl.g:593:3: ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment ) )
            // InternalMyDsl.g:594:4: ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )
            {
             before(grammarAccess.getOperationDeclarionHeaderStmtAccess().getParametersAssignment()); 
            // InternalMyDsl.g:595:4: ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )
            // InternalMyDsl.g:595:5: rule__OperationDeclarionHeaderStmt__ParametersAssignment
            {
            pushFollow(FOLLOW_4);
            rule__OperationDeclarionHeaderStmt__ParametersAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarionHeaderStmtAccess().getParametersAssignment()); 

            }

            // InternalMyDsl.g:598:3: ( ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )* )
            // InternalMyDsl.g:599:4: ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )*
            {
             before(grammarAccess.getOperationDeclarionHeaderStmtAccess().getParametersAssignment()); 
            // InternalMyDsl.g:600:4: ( rule__OperationDeclarionHeaderStmt__ParametersAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)||(LA2_0>=11 && LA2_0<=15)||LA2_0==19||(LA2_0>=24 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:600:5: rule__OperationDeclarionHeaderStmt__ParametersAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__OperationDeclarionHeaderStmt__ParametersAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getOperationDeclarionHeaderStmtAccess().getParametersAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDeclarionHeaderStmt"


    // $ANTLR start "entryRuleOperationParameterPhrase"
    // InternalMyDsl.g:610:1: entryRuleOperationParameterPhrase : ruleOperationParameterPhrase EOF ;
    public final void entryRuleOperationParameterPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:611:1: ( ruleOperationParameterPhrase EOF )
            // InternalMyDsl.g:612:1: ruleOperationParameterPhrase EOF
            {
             before(grammarAccess.getOperationParameterPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationParameterPhrase();

            state._fsp--;

             after(grammarAccess.getOperationParameterPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationParameterPhrase"


    // $ANTLR start "ruleOperationParameterPhrase"
    // InternalMyDsl.g:619:1: ruleOperationParameterPhrase : ( ( rule__OperationParameterPhrase__Alternatives ) ) ;
    public final void ruleOperationParameterPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:2: ( ( ( rule__OperationParameterPhrase__Alternatives ) ) )
            // InternalMyDsl.g:624:2: ( ( rule__OperationParameterPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:624:2: ( ( rule__OperationParameterPhrase__Alternatives ) )
            // InternalMyDsl.g:625:3: ( rule__OperationParameterPhrase__Alternatives )
            {
             before(grammarAccess.getOperationParameterPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:626:3: ( rule__OperationParameterPhrase__Alternatives )
            // InternalMyDsl.g:626:4: rule__OperationParameterPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationParameterPhrase"


    // $ANTLR start "entryRuleOperationDefinitionStmt"
    // InternalMyDsl.g:635:1: entryRuleOperationDefinitionStmt : ruleOperationDefinitionStmt EOF ;
    public final void entryRuleOperationDefinitionStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:636:1: ( ruleOperationDefinitionStmt EOF )
            // InternalMyDsl.g:637:1: ruleOperationDefinitionStmt EOF
            {
             before(grammarAccess.getOperationDefinitionStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionStmt();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionStmt"


    // $ANTLR start "ruleOperationDefinitionStmt"
    // InternalMyDsl.g:644:1: ruleOperationDefinitionStmt : ( ( rule__OperationDefinitionStmt__Group__0 ) ) ;
    public final void ruleOperationDefinitionStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:2: ( ( ( rule__OperationDefinitionStmt__Group__0 ) ) )
            // InternalMyDsl.g:649:2: ( ( rule__OperationDefinitionStmt__Group__0 ) )
            {
            // InternalMyDsl.g:649:2: ( ( rule__OperationDefinitionStmt__Group__0 ) )
            // InternalMyDsl.g:650:3: ( rule__OperationDefinitionStmt__Group__0 )
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getGroup()); 
            // InternalMyDsl.g:651:3: ( rule__OperationDefinitionStmt__Group__0 )
            // InternalMyDsl.g:651:4: rule__OperationDefinitionStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionStmt"


    // $ANTLR start "entryRuleOperationDefinitionBodyStmts"
    // InternalMyDsl.g:660:1: entryRuleOperationDefinitionBodyStmts : ruleOperationDefinitionBodyStmts EOF ;
    public final void entryRuleOperationDefinitionBodyStmts() throws RecognitionException {
        try {
            // InternalMyDsl.g:661:1: ( ruleOperationDefinitionBodyStmts EOF )
            // InternalMyDsl.g:662:1: ruleOperationDefinitionBodyStmts EOF
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyStmts();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyStmtsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyStmts"


    // $ANTLR start "ruleOperationDefinitionBodyStmts"
    // InternalMyDsl.g:669:1: ruleOperationDefinitionBodyStmts : ( ( rule__OperationDefinitionBodyStmts__Group__0 ) ) ;
    public final void ruleOperationDefinitionBodyStmts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:2: ( ( ( rule__OperationDefinitionBodyStmts__Group__0 ) ) )
            // InternalMyDsl.g:674:2: ( ( rule__OperationDefinitionBodyStmts__Group__0 ) )
            {
            // InternalMyDsl.g:674:2: ( ( rule__OperationDefinitionBodyStmts__Group__0 ) )
            // InternalMyDsl.g:675:3: ( rule__OperationDefinitionBodyStmts__Group__0 )
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsAccess().getGroup()); 
            // InternalMyDsl.g:676:3: ( rule__OperationDefinitionBodyStmts__Group__0 )
            // InternalMyDsl.g:676:4: rule__OperationDefinitionBodyStmts__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmts__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyStmtsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyStmts"


    // $ANTLR start "entryRuleOperationDefinitionBodyStmt"
    // InternalMyDsl.g:685:1: entryRuleOperationDefinitionBodyStmt : ruleOperationDefinitionBodyStmt EOF ;
    public final void entryRuleOperationDefinitionBodyStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:686:1: ( ruleOperationDefinitionBodyStmt EOF )
            // InternalMyDsl.g:687:1: ruleOperationDefinitionBodyStmt EOF
            {
             before(grammarAccess.getOperationDefinitionBodyStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyStmt();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyStmt"


    // $ANTLR start "ruleOperationDefinitionBodyStmt"
    // InternalMyDsl.g:694:1: ruleOperationDefinitionBodyStmt : ( ( rule__OperationDefinitionBodyStmt__Alternatives ) ) ;
    public final void ruleOperationDefinitionBodyStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:2: ( ( ( rule__OperationDefinitionBodyStmt__Alternatives ) ) )
            // InternalMyDsl.g:699:2: ( ( rule__OperationDefinitionBodyStmt__Alternatives ) )
            {
            // InternalMyDsl.g:699:2: ( ( rule__OperationDefinitionBodyStmt__Alternatives ) )
            // InternalMyDsl.g:700:3: ( rule__OperationDefinitionBodyStmt__Alternatives )
            {
             before(grammarAccess.getOperationDefinitionBodyStmtAccess().getAlternatives()); 
            // InternalMyDsl.g:701:3: ( rule__OperationDefinitionBodyStmt__Alternatives )
            // InternalMyDsl.g:701:4: rule__OperationDefinitionBodyStmt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyStmtAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyStmt"


    // $ANTLR start "entryRuleOperationDefinitionBodyUnconditionalStmt"
    // InternalMyDsl.g:710:1: entryRuleOperationDefinitionBodyUnconditionalStmt : ruleOperationDefinitionBodyUnconditionalStmt EOF ;
    public final void entryRuleOperationDefinitionBodyUnconditionalStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:711:1: ( ruleOperationDefinitionBodyUnconditionalStmt EOF )
            // InternalMyDsl.g:712:1: ruleOperationDefinitionBodyUnconditionalStmt EOF
            {
             before(grammarAccess.getOperationDefinitionBodyUnconditionalStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyUnconditionalStmt();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyUnconditionalStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyUnconditionalStmt"


    // $ANTLR start "ruleOperationDefinitionBodyUnconditionalStmt"
    // InternalMyDsl.g:719:1: ruleOperationDefinitionBodyUnconditionalStmt : ( ruleOperationDefinitionBodyUnconditionalPhrase ) ;
    public final void ruleOperationDefinitionBodyUnconditionalStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:2: ( ( ruleOperationDefinitionBodyUnconditionalPhrase ) )
            // InternalMyDsl.g:724:2: ( ruleOperationDefinitionBodyUnconditionalPhrase )
            {
            // InternalMyDsl.g:724:2: ( ruleOperationDefinitionBodyUnconditionalPhrase )
            // InternalMyDsl.g:725:3: ruleOperationDefinitionBodyUnconditionalPhrase
            {
             before(grammarAccess.getOperationDefinitionBodyUnconditionalStmtAccess().getOperationDefinitionBodyUnconditionalPhraseParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyUnconditionalPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyUnconditionalStmtAccess().getOperationDefinitionBodyUnconditionalPhraseParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyUnconditionalStmt"


    // $ANTLR start "entryRuleOperationDefinitionBodyUnconditionalPhrase"
    // InternalMyDsl.g:735:1: entryRuleOperationDefinitionBodyUnconditionalPhrase : ruleOperationDefinitionBodyUnconditionalPhrase EOF ;
    public final void entryRuleOperationDefinitionBodyUnconditionalPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:736:1: ( ruleOperationDefinitionBodyUnconditionalPhrase EOF )
            // InternalMyDsl.g:737:1: ruleOperationDefinitionBodyUnconditionalPhrase EOF
            {
             before(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyUnconditionalPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyUnconditionalPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyUnconditionalPhrase"
    // InternalMyDsl.g:744:1: ruleOperationDefinitionBodyUnconditionalPhrase : ( ( rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives ) ) ;
    public final void ruleOperationDefinitionBodyUnconditionalPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:2: ( ( ( rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives ) ) )
            // InternalMyDsl.g:749:2: ( ( rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:749:2: ( ( rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives ) )
            // InternalMyDsl.g:750:3: ( rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives )
            {
             before(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:751:3: ( rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives )
            // InternalMyDsl.g:751:4: rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyUnconditionalPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallPhrase"
    // InternalMyDsl.g:760:1: entryRuleOperationDefinitionBodyFunctionCallPhrase : ruleOperationDefinitionBodyFunctionCallPhrase EOF ;
    public final void entryRuleOperationDefinitionBodyFunctionCallPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:761:1: ( ruleOperationDefinitionBodyFunctionCallPhrase EOF )
            // InternalMyDsl.g:762:1: ruleOperationDefinitionBodyFunctionCallPhrase EOF
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyFunctionCallPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallPhrase"
    // InternalMyDsl.g:769:1: ruleOperationDefinitionBodyFunctionCallPhrase : ( ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment ) ) ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )* ) ) ;
    public final void ruleOperationDefinitionBodyFunctionCallPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:2: ( ( ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment ) ) ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )* ) ) )
            // InternalMyDsl.g:774:2: ( ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment ) ) ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )* ) )
            {
            // InternalMyDsl.g:774:2: ( ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment ) ) ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )* ) )
            // InternalMyDsl.g:775:3: ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment ) ) ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )* )
            {
            // InternalMyDsl.g:775:3: ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment ) )
            // InternalMyDsl.g:776:4: ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseAccess().getArgumentsAssignment()); 
            // InternalMyDsl.g:777:4: ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )
            // InternalMyDsl.g:777:5: rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment
            {
            pushFollow(FOLLOW_5);
            rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseAccess().getArgumentsAssignment()); 

            }

            // InternalMyDsl.g:780:3: ( ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )* )
            // InternalMyDsl.g:781:4: ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )*
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseAccess().getArgumentsAssignment()); 
            // InternalMyDsl.g:782:4: ( rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)||LA3_0==19||(LA3_0>=24 && LA3_0<=25)||LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:782:5: rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseAccess().getArgumentsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase"
    // InternalMyDsl.g:792:1: entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase : ruleOperationDefinitionBodyFunctionCallArgumentsPhrase EOF ;
    public final void entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:793:1: ( ruleOperationDefinitionBodyFunctionCallArgumentsPhrase EOF )
            // InternalMyDsl.g:794:1: ruleOperationDefinitionBodyFunctionCallArgumentsPhrase EOF
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyFunctionCallArgumentsPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallArgumentsPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallArgumentsPhrase"
    // InternalMyDsl.g:801:1: ruleOperationDefinitionBodyFunctionCallArgumentsPhrase : ( ( rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives ) ) ;
    public final void ruleOperationDefinitionBodyFunctionCallArgumentsPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:2: ( ( ( rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives ) ) )
            // InternalMyDsl.g:806:2: ( ( rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:806:2: ( ( rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives ) )
            // InternalMyDsl.g:807:3: ( rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives )
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:808:3: ( rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives )
            // InternalMyDsl.g:808:4: rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallArgumentsPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase"
    // InternalMyDsl.g:817:1: entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase : ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase EOF ;
    public final void entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:818:1: ( ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase EOF )
            // InternalMyDsl.g:819:1: ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase EOF
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallInRefsRefPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase"
    // InternalMyDsl.g:826:1: ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase : ( ( rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment ) ) ;
    public final void ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:2: ( ( ( rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment ) ) )
            // InternalMyDsl.g:831:2: ( ( rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment ) )
            {
            // InternalMyDsl.g:831:2: ( ( rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment ) )
            // InternalMyDsl.g:832:3: ( rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment )
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseAccess().getRefAssignment()); 
            // InternalMyDsl.g:833:3: ( rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment )
            // InternalMyDsl.g:833:4: rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"
    // InternalMyDsl.g:842:1: entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase : ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase EOF ;
    public final void entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:843:1: ( ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase EOF )
            // InternalMyDsl.g:844:1: ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase EOF
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"
    // InternalMyDsl.g:851:1: ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase : ( ( rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives ) ) ;
    public final void ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:2: ( ( ( rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives ) ) )
            // InternalMyDsl.g:856:2: ( ( rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:856:2: ( ( rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives ) )
            // InternalMyDsl.g:857:3: ( rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives )
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:858:3: ( rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives )
            // InternalMyDsl.g:858:4: rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyFunctionCallInRefsObjectsPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyVariableDeclarationPhrase"
    // InternalMyDsl.g:867:1: entryRuleOperationDefinitionBodyVariableDeclarationPhrase : ruleOperationDefinitionBodyVariableDeclarationPhrase EOF ;
    public final void entryRuleOperationDefinitionBodyVariableDeclarationPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:868:1: ( ruleOperationDefinitionBodyVariableDeclarationPhrase EOF )
            // InternalMyDsl.g:869:1: ruleOperationDefinitionBodyVariableDeclarationPhrase EOF
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyVariableDeclarationPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyVariableDeclarationPhrase"


    // $ANTLR start "ruleOperationDefinitionBodyVariableDeclarationPhrase"
    // InternalMyDsl.g:876:1: ruleOperationDefinitionBodyVariableDeclarationPhrase : ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0 ) ) ;
    public final void ruleOperationDefinitionBodyVariableDeclarationPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:2: ( ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0 ) ) )
            // InternalMyDsl.g:881:2: ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:881:2: ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0 ) )
            // InternalMyDsl.g:882:3: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0 )
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getGroup()); 
            // InternalMyDsl.g:883:3: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0 )
            // InternalMyDsl.g:883:4: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyVariableDeclarationPhrase"


    // $ANTLR start "entryRuleOperationDefinitionBodyConditionalStmt"
    // InternalMyDsl.g:892:1: entryRuleOperationDefinitionBodyConditionalStmt : ruleOperationDefinitionBodyConditionalStmt EOF ;
    public final void entryRuleOperationDefinitionBodyConditionalStmt() throws RecognitionException {
        try {
            // InternalMyDsl.g:893:1: ( ruleOperationDefinitionBodyConditionalStmt EOF )
            // InternalMyDsl.g:894:1: ruleOperationDefinitionBodyConditionalStmt EOF
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDefinitionBodyConditionalStmt();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDefinitionBodyConditionalStmt"


    // $ANTLR start "ruleOperationDefinitionBodyConditionalStmt"
    // InternalMyDsl.g:901:1: ruleOperationDefinitionBodyConditionalStmt : ( ( rule__OperationDefinitionBodyConditionalStmt__Group__0 ) ) ;
    public final void ruleOperationDefinitionBodyConditionalStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:2: ( ( ( rule__OperationDefinitionBodyConditionalStmt__Group__0 ) ) )
            // InternalMyDsl.g:906:2: ( ( rule__OperationDefinitionBodyConditionalStmt__Group__0 ) )
            {
            // InternalMyDsl.g:906:2: ( ( rule__OperationDefinitionBodyConditionalStmt__Group__0 ) )
            // InternalMyDsl.g:907:3: ( rule__OperationDefinitionBodyConditionalStmt__Group__0 )
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getGroup()); 
            // InternalMyDsl.g:908:3: ( rule__OperationDefinitionBodyConditionalStmt__Group__0 )
            // InternalMyDsl.g:908:4: rule__OperationDefinitionBodyConditionalStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDefinitionBodyConditionalStmt"


    // $ANTLR start "entryRuleOperationParameterVariableDeclarationPhrase"
    // InternalMyDsl.g:917:1: entryRuleOperationParameterVariableDeclarationPhrase : ruleOperationParameterVariableDeclarationPhrase EOF ;
    public final void entryRuleOperationParameterVariableDeclarationPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:918:1: ( ruleOperationParameterVariableDeclarationPhrase EOF )
            // InternalMyDsl.g:919:1: ruleOperationParameterVariableDeclarationPhrase EOF
            {
             before(grammarAccess.getOperationParameterVariableDeclarationPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationParameterVariableDeclarationPhrase();

            state._fsp--;

             after(grammarAccess.getOperationParameterVariableDeclarationPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationParameterVariableDeclarationPhrase"


    // $ANTLR start "ruleOperationParameterVariableDeclarationPhrase"
    // InternalMyDsl.g:926:1: ruleOperationParameterVariableDeclarationPhrase : ( ( rule__OperationParameterVariableDeclarationPhrase__Group__0 ) ) ;
    public final void ruleOperationParameterVariableDeclarationPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:2: ( ( ( rule__OperationParameterVariableDeclarationPhrase__Group__0 ) ) )
            // InternalMyDsl.g:931:2: ( ( rule__OperationParameterVariableDeclarationPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:931:2: ( ( rule__OperationParameterVariableDeclarationPhrase__Group__0 ) )
            // InternalMyDsl.g:932:3: ( rule__OperationParameterVariableDeclarationPhrase__Group__0 )
            {
             before(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getGroup()); 
            // InternalMyDsl.g:933:3: ( rule__OperationParameterVariableDeclarationPhrase__Group__0 )
            // InternalMyDsl.g:933:4: rule__OperationParameterVariableDeclarationPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterVariableDeclarationPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationParameterVariableDeclarationPhrase"


    // $ANTLR start "entryRuleOperationParameterConnectionPhrase"
    // InternalMyDsl.g:942:1: entryRuleOperationParameterConnectionPhrase : ruleOperationParameterConnectionPhrase EOF ;
    public final void entryRuleOperationParameterConnectionPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:943:1: ( ruleOperationParameterConnectionPhrase EOF )
            // InternalMyDsl.g:944:1: ruleOperationParameterConnectionPhrase EOF
            {
             before(grammarAccess.getOperationParameterConnectionPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationParameterConnectionPhrase();

            state._fsp--;

             after(grammarAccess.getOperationParameterConnectionPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationParameterConnectionPhrase"


    // $ANTLR start "ruleOperationParameterConnectionPhrase"
    // InternalMyDsl.g:951:1: ruleOperationParameterConnectionPhrase : ( ( rule__OperationParameterConnectionPhrase__NameAssignment ) ) ;
    public final void ruleOperationParameterConnectionPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:2: ( ( ( rule__OperationParameterConnectionPhrase__NameAssignment ) ) )
            // InternalMyDsl.g:956:2: ( ( rule__OperationParameterConnectionPhrase__NameAssignment ) )
            {
            // InternalMyDsl.g:956:2: ( ( rule__OperationParameterConnectionPhrase__NameAssignment ) )
            // InternalMyDsl.g:957:3: ( rule__OperationParameterConnectionPhrase__NameAssignment )
            {
             before(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameAssignment()); 
            // InternalMyDsl.g:958:3: ( rule__OperationParameterConnectionPhrase__NameAssignment )
            // InternalMyDsl.g:958:4: rule__OperationParameterConnectionPhrase__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterConnectionPhrase__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationParameterConnectionPhrase"


    // $ANTLR start "entryRuleOperationParameterConnectionBuiltinRefPhrase"
    // InternalMyDsl.g:967:1: entryRuleOperationParameterConnectionBuiltinRefPhrase : ruleOperationParameterConnectionBuiltinRefPhrase EOF ;
    public final void entryRuleOperationParameterConnectionBuiltinRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:968:1: ( ruleOperationParameterConnectionBuiltinRefPhrase EOF )
            // InternalMyDsl.g:969:1: ruleOperationParameterConnectionBuiltinRefPhrase EOF
            {
             before(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationParameterConnectionBuiltinRefPhrase();

            state._fsp--;

             after(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationParameterConnectionBuiltinRefPhrase"


    // $ANTLR start "ruleOperationParameterConnectionBuiltinRefPhrase"
    // InternalMyDsl.g:976:1: ruleOperationParameterConnectionBuiltinRefPhrase : ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment ) ) ;
    public final void ruleOperationParameterConnectionBuiltinRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:2: ( ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment ) ) )
            // InternalMyDsl.g:981:2: ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment ) )
            {
            // InternalMyDsl.g:981:2: ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment ) )
            // InternalMyDsl.g:982:3: ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment )
            {
             before(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameAssignment()); 
            // InternalMyDsl.g:983:3: ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment )
            // InternalMyDsl.g:983:4: rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationParameterConnectionBuiltinRefPhrase"


    // $ANTLR start "entryRuleInstanceRefPhrase"
    // InternalMyDsl.g:992:1: entryRuleInstanceRefPhrase : ruleInstanceRefPhrase EOF ;
    public final void entryRuleInstanceRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:993:1: ( ruleInstanceRefPhrase EOF )
            // InternalMyDsl.g:994:1: ruleInstanceRefPhrase EOF
            {
             before(grammarAccess.getInstanceRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceRefPhrase();

            state._fsp--;

             after(grammarAccess.getInstanceRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceRefPhrase"


    // $ANTLR start "ruleInstanceRefPhrase"
    // InternalMyDsl.g:1001:1: ruleInstanceRefPhrase : ( ( rule__InstanceRefPhrase__Alternatives ) ) ;
    public final void ruleInstanceRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:2: ( ( ( rule__InstanceRefPhrase__Alternatives ) ) )
            // InternalMyDsl.g:1006:2: ( ( rule__InstanceRefPhrase__Alternatives ) )
            {
            // InternalMyDsl.g:1006:2: ( ( rule__InstanceRefPhrase__Alternatives ) )
            // InternalMyDsl.g:1007:3: ( rule__InstanceRefPhrase__Alternatives )
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:1008:3: ( rule__InstanceRefPhrase__Alternatives )
            // InternalMyDsl.g:1008:4: rule__InstanceRefPhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InstanceRefPhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstanceRefPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceRefPhrase"


    // $ANTLR start "entryRuleInstanceDirectRefPhrase"
    // InternalMyDsl.g:1017:1: entryRuleInstanceDirectRefPhrase : ruleInstanceDirectRefPhrase EOF ;
    public final void entryRuleInstanceDirectRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:1018:1: ( ruleInstanceDirectRefPhrase EOF )
            // InternalMyDsl.g:1019:1: ruleInstanceDirectRefPhrase EOF
            {
             before(grammarAccess.getInstanceDirectRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceDirectRefPhrase();

            state._fsp--;

             after(grammarAccess.getInstanceDirectRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceDirectRefPhrase"


    // $ANTLR start "ruleInstanceDirectRefPhrase"
    // InternalMyDsl.g:1026:1: ruleInstanceDirectRefPhrase : ( ( rule__InstanceDirectRefPhrase__ValueAssignment ) ) ;
    public final void ruleInstanceDirectRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:2: ( ( ( rule__InstanceDirectRefPhrase__ValueAssignment ) ) )
            // InternalMyDsl.g:1031:2: ( ( rule__InstanceDirectRefPhrase__ValueAssignment ) )
            {
            // InternalMyDsl.g:1031:2: ( ( rule__InstanceDirectRefPhrase__ValueAssignment ) )
            // InternalMyDsl.g:1032:3: ( rule__InstanceDirectRefPhrase__ValueAssignment )
            {
             before(grammarAccess.getInstanceDirectRefPhraseAccess().getValueAssignment()); 
            // InternalMyDsl.g:1033:3: ( rule__InstanceDirectRefPhrase__ValueAssignment )
            // InternalMyDsl.g:1033:4: rule__InstanceDirectRefPhrase__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InstanceDirectRefPhrase__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInstanceDirectRefPhraseAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceDirectRefPhrase"


    // $ANTLR start "entryRuleInstanceIndirectRefPhrase"
    // InternalMyDsl.g:1042:1: entryRuleInstanceIndirectRefPhrase : ruleInstanceIndirectRefPhrase EOF ;
    public final void entryRuleInstanceIndirectRefPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:1043:1: ( ruleInstanceIndirectRefPhrase EOF )
            // InternalMyDsl.g:1044:1: ruleInstanceIndirectRefPhrase EOF
            {
             before(grammarAccess.getInstanceIndirectRefPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceIndirectRefPhrase();

            state._fsp--;

             after(grammarAccess.getInstanceIndirectRefPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceIndirectRefPhrase"


    // $ANTLR start "ruleInstanceIndirectRefPhrase"
    // InternalMyDsl.g:1051:1: ruleInstanceIndirectRefPhrase : ( ( rule__InstanceIndirectRefPhrase__Group__0 ) ) ;
    public final void ruleInstanceIndirectRefPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:2: ( ( ( rule__InstanceIndirectRefPhrase__Group__0 ) ) )
            // InternalMyDsl.g:1056:2: ( ( rule__InstanceIndirectRefPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:1056:2: ( ( rule__InstanceIndirectRefPhrase__Group__0 ) )
            // InternalMyDsl.g:1057:3: ( rule__InstanceIndirectRefPhrase__Group__0 )
            {
             before(grammarAccess.getInstanceIndirectRefPhraseAccess().getGroup()); 
            // InternalMyDsl.g:1058:3: ( rule__InstanceIndirectRefPhrase__Group__0 )
            // InternalMyDsl.g:1058:4: rule__InstanceIndirectRefPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceIndirectRefPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceIndirectRefPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceIndirectRefPhrase"


    // $ANTLR start "entryRuleInstanceBuiltinValuePhrase"
    // InternalMyDsl.g:1067:1: entryRuleInstanceBuiltinValuePhrase : ruleInstanceBuiltinValuePhrase EOF ;
    public final void entryRuleInstanceBuiltinValuePhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:1068:1: ( ruleInstanceBuiltinValuePhrase EOF )
            // InternalMyDsl.g:1069:1: ruleInstanceBuiltinValuePhrase EOF
            {
             before(grammarAccess.getInstanceBuiltinValuePhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceBuiltinValuePhrase();

            state._fsp--;

             after(grammarAccess.getInstanceBuiltinValuePhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceBuiltinValuePhrase"


    // $ANTLR start "ruleInstanceBuiltinValuePhrase"
    // InternalMyDsl.g:1076:1: ruleInstanceBuiltinValuePhrase : ( ( rule__InstanceBuiltinValuePhrase__Alternatives ) ) ;
    public final void ruleInstanceBuiltinValuePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:2: ( ( ( rule__InstanceBuiltinValuePhrase__Alternatives ) ) )
            // InternalMyDsl.g:1081:2: ( ( rule__InstanceBuiltinValuePhrase__Alternatives ) )
            {
            // InternalMyDsl.g:1081:2: ( ( rule__InstanceBuiltinValuePhrase__Alternatives ) )
            // InternalMyDsl.g:1082:3: ( rule__InstanceBuiltinValuePhrase__Alternatives )
            {
             before(grammarAccess.getInstanceBuiltinValuePhraseAccess().getAlternatives()); 
            // InternalMyDsl.g:1083:3: ( rule__InstanceBuiltinValuePhrase__Alternatives )
            // InternalMyDsl.g:1083:4: rule__InstanceBuiltinValuePhrase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValuePhrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBuiltinValuePhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceBuiltinValuePhrase"


    // $ANTLR start "entryRuleInstanceBuiltinValueIntegerPhrase"
    // InternalMyDsl.g:1092:1: entryRuleInstanceBuiltinValueIntegerPhrase : ruleInstanceBuiltinValueIntegerPhrase EOF ;
    public final void entryRuleInstanceBuiltinValueIntegerPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:1093:1: ( ruleInstanceBuiltinValueIntegerPhrase EOF )
            // InternalMyDsl.g:1094:1: ruleInstanceBuiltinValueIntegerPhrase EOF
            {
             before(grammarAccess.getInstanceBuiltinValueIntegerPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceBuiltinValueIntegerPhrase();

            state._fsp--;

             after(grammarAccess.getInstanceBuiltinValueIntegerPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceBuiltinValueIntegerPhrase"


    // $ANTLR start "ruleInstanceBuiltinValueIntegerPhrase"
    // InternalMyDsl.g:1101:1: ruleInstanceBuiltinValueIntegerPhrase : ( ( rule__InstanceBuiltinValueIntegerPhrase__Group__0 ) ) ;
    public final void ruleInstanceBuiltinValueIntegerPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:2: ( ( ( rule__InstanceBuiltinValueIntegerPhrase__Group__0 ) ) )
            // InternalMyDsl.g:1106:2: ( ( rule__InstanceBuiltinValueIntegerPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:1106:2: ( ( rule__InstanceBuiltinValueIntegerPhrase__Group__0 ) )
            // InternalMyDsl.g:1107:3: ( rule__InstanceBuiltinValueIntegerPhrase__Group__0 )
            {
             before(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getGroup()); 
            // InternalMyDsl.g:1108:3: ( rule__InstanceBuiltinValueIntegerPhrase__Group__0 )
            // InternalMyDsl.g:1108:4: rule__InstanceBuiltinValueIntegerPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueIntegerPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceBuiltinValueIntegerPhrase"


    // $ANTLR start "entryRuleInstanceBuiltinValueStringPhrase"
    // InternalMyDsl.g:1117:1: entryRuleInstanceBuiltinValueStringPhrase : ruleInstanceBuiltinValueStringPhrase EOF ;
    public final void entryRuleInstanceBuiltinValueStringPhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:1118:1: ( ruleInstanceBuiltinValueStringPhrase EOF )
            // InternalMyDsl.g:1119:1: ruleInstanceBuiltinValueStringPhrase EOF
            {
             before(grammarAccess.getInstanceBuiltinValueStringPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceBuiltinValueStringPhrase();

            state._fsp--;

             after(grammarAccess.getInstanceBuiltinValueStringPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceBuiltinValueStringPhrase"


    // $ANTLR start "ruleInstanceBuiltinValueStringPhrase"
    // InternalMyDsl.g:1126:1: ruleInstanceBuiltinValueStringPhrase : ( ( rule__InstanceBuiltinValueStringPhrase__Group__0 ) ) ;
    public final void ruleInstanceBuiltinValueStringPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:2: ( ( ( rule__InstanceBuiltinValueStringPhrase__Group__0 ) ) )
            // InternalMyDsl.g:1131:2: ( ( rule__InstanceBuiltinValueStringPhrase__Group__0 ) )
            {
            // InternalMyDsl.g:1131:2: ( ( rule__InstanceBuiltinValueStringPhrase__Group__0 ) )
            // InternalMyDsl.g:1132:3: ( rule__InstanceBuiltinValueStringPhrase__Group__0 )
            {
             before(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getGroup()); 
            // InternalMyDsl.g:1133:3: ( rule__InstanceBuiltinValueStringPhrase__Group__0 )
            // InternalMyDsl.g:1133:4: rule__InstanceBuiltinValueStringPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueStringPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceBuiltinValueStringPhrase"


    // $ANTLR start "rule__Stmt__Alternatives_0"
    // InternalMyDsl.g:1141:1: rule__Stmt__Alternatives_0 : ( ( ruleExistenceStmt ) | ( ruleCompositionStmt ) | ( ruleInheritanceStmt ) | ( ruleOperationStmt ) );
    public final void rule__Stmt__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ruleExistenceStmt ) | ( ruleCompositionStmt ) | ( ruleInheritanceStmt ) | ( ruleOperationStmt ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1146:2: ( ruleExistenceStmt )
                    {
                    // InternalMyDsl.g:1146:2: ( ruleExistenceStmt )
                    // InternalMyDsl.g:1147:3: ruleExistenceStmt
                    {
                     before(grammarAccess.getStmtAccess().getExistenceStmtParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getExistenceStmtParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1152:2: ( ruleCompositionStmt )
                    {
                    // InternalMyDsl.g:1152:2: ( ruleCompositionStmt )
                    // InternalMyDsl.g:1153:3: ruleCompositionStmt
                    {
                     before(grammarAccess.getStmtAccess().getCompositionStmtParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositionStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getCompositionStmtParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1158:2: ( ruleInheritanceStmt )
                    {
                    // InternalMyDsl.g:1158:2: ( ruleInheritanceStmt )
                    // InternalMyDsl.g:1159:3: ruleInheritanceStmt
                    {
                     before(grammarAccess.getStmtAccess().getInheritanceStmtParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInheritanceStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getInheritanceStmtParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1164:2: ( ruleOperationStmt )
                    {
                    // InternalMyDsl.g:1164:2: ( ruleOperationStmt )
                    // InternalMyDsl.g:1165:3: ruleOperationStmt
                    {
                     before(grammarAccess.getStmtAccess().getOperationStmtParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getOperationStmtParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Alternatives_0"


    // $ANTLR start "rule__ExistenceStmt__Alternatives"
    // InternalMyDsl.g:1174:1: rule__ExistenceStmt__Alternatives : ( ( ruleExistenceDefiniteStmt ) | ( ruleExistenceIndefiniteStmt ) );
    public final void rule__ExistenceStmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( ruleExistenceDefiniteStmt ) | ( ruleExistenceIndefiniteStmt ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1179:2: ( ruleExistenceDefiniteStmt )
                    {
                    // InternalMyDsl.g:1179:2: ( ruleExistenceDefiniteStmt )
                    // InternalMyDsl.g:1180:3: ruleExistenceDefiniteStmt
                    {
                     before(grammarAccess.getExistenceStmtAccess().getExistenceDefiniteStmtParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceDefiniteStmt();

                    state._fsp--;

                     after(grammarAccess.getExistenceStmtAccess().getExistenceDefiniteStmtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1185:2: ( ruleExistenceIndefiniteStmt )
                    {
                    // InternalMyDsl.g:1185:2: ( ruleExistenceIndefiniteStmt )
                    // InternalMyDsl.g:1186:3: ruleExistenceIndefiniteStmt
                    {
                     before(grammarAccess.getExistenceStmtAccess().getExistenceIndefiniteStmtParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceIndefiniteStmt();

                    state._fsp--;

                     after(grammarAccess.getExistenceStmtAccess().getExistenceIndefiniteStmtParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceStmt__Alternatives"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0"
    // InternalMyDsl.g:1195:1: rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0 : ( ( 'one' ) | ( 'a' ) | ( 'an' ) );
    public final void rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( ( 'one' ) | ( 'a' ) | ( 'an' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
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
                    // InternalMyDsl.g:1200:2: ( 'one' )
                    {
                    // InternalMyDsl.g:1200:2: ( 'one' )
                    // InternalMyDsl.g:1201:3: 'one'
                    {
                     before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getOneKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getOneKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1206:2: ( 'a' )
                    {
                    // InternalMyDsl.g:1206:2: ( 'a' )
                    // InternalMyDsl.g:1207:3: 'a'
                    {
                     before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1212:2: ( 'an' )
                    {
                    // InternalMyDsl.g:1212:2: ( 'an' )
                    // InternalMyDsl.g:1213:3: 'an'
                    {
                     before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAnKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAnKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0"
    // InternalMyDsl.g:1222:1: rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0 : ( ( RULE_INT ) | ( 'one_or_more' ) | ( 'zero_or_more' ) );
    public final void rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( ( RULE_INT ) | ( 'one_or_more' ) | ( 'zero_or_more' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1227:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1227:2: ( RULE_INT )
                    // InternalMyDsl.g:1228:3: RULE_INT
                    {
                     before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1233:2: ( 'one_or_more' )
                    {
                    // InternalMyDsl.g:1233:2: ( 'one_or_more' )
                    // InternalMyDsl.g:1234:3: 'one_or_more'
                    {
                     before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getOne_or_moreKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getOne_or_moreKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1239:2: ( 'zero_or_more' )
                    {
                    // InternalMyDsl.g:1239:2: ( 'zero_or_more' )
                    // InternalMyDsl.g:1240:3: 'zero_or_more'
                    {
                     before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getZero_or_moreKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getZero_or_moreKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0"


    // $ANTLR start "rule__ExistenceSingularRefListPhrase__Alternatives"
    // InternalMyDsl.g:1249:1: rule__ExistenceSingularRefListPhrase__Alternatives : ( ( ruleExistenceDefiniteRefListPhrase ) | ( ruleExistenceSingularIndefiniteRefListPhrase ) );
    public final void rule__ExistenceSingularRefListPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( ruleExistenceDefiniteRefListPhrase ) | ( ruleExistenceSingularIndefiniteRefListPhrase ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=11 && LA8_0<=13)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1254:2: ( ruleExistenceDefiniteRefListPhrase )
                    {
                    // InternalMyDsl.g:1254:2: ( ruleExistenceDefiniteRefListPhrase )
                    // InternalMyDsl.g:1255:3: ruleExistenceDefiniteRefListPhrase
                    {
                     before(grammarAccess.getExistenceSingularRefListPhraseAccess().getExistenceDefiniteRefListPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceDefiniteRefListPhrase();

                    state._fsp--;

                     after(grammarAccess.getExistenceSingularRefListPhraseAccess().getExistenceDefiniteRefListPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1260:2: ( ruleExistenceSingularIndefiniteRefListPhrase )
                    {
                    // InternalMyDsl.g:1260:2: ( ruleExistenceSingularIndefiniteRefListPhrase )
                    // InternalMyDsl.g:1261:3: ruleExistenceSingularIndefiniteRefListPhrase
                    {
                     before(grammarAccess.getExistenceSingularRefListPhraseAccess().getExistenceSingularIndefiniteRefListPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceSingularIndefiniteRefListPhrase();

                    state._fsp--;

                     after(grammarAccess.getExistenceSingularRefListPhraseAccess().getExistenceSingularIndefiniteRefListPhraseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularRefListPhrase__Alternatives"


    // $ANTLR start "rule__ExistenceAnyRefListPhrase__Alternatives"
    // InternalMyDsl.g:1270:1: rule__ExistenceAnyRefListPhrase__Alternatives : ( ( ruleExistenceDefiniteRefListPhrase ) | ( ruleExistenceSingularIndefiniteRefListPhrase ) | ( ruleExistencePluralIndefiniteRefListPhrase ) );
    public final void rule__ExistenceAnyRefListPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( ( ruleExistenceDefiniteRefListPhrase ) | ( ruleExistenceSingularIndefiniteRefListPhrase ) | ( ruleExistencePluralIndefiniteRefListPhrase ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 11:
            case 12:
            case 13:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 14:
            case 15:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1275:2: ( ruleExistenceDefiniteRefListPhrase )
                    {
                    // InternalMyDsl.g:1275:2: ( ruleExistenceDefiniteRefListPhrase )
                    // InternalMyDsl.g:1276:3: ruleExistenceDefiniteRefListPhrase
                    {
                     before(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistenceDefiniteRefListPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceDefiniteRefListPhrase();

                    state._fsp--;

                     after(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistenceDefiniteRefListPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1281:2: ( ruleExistenceSingularIndefiniteRefListPhrase )
                    {
                    // InternalMyDsl.g:1281:2: ( ruleExistenceSingularIndefiniteRefListPhrase )
                    // InternalMyDsl.g:1282:3: ruleExistenceSingularIndefiniteRefListPhrase
                    {
                     before(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistenceSingularIndefiniteRefListPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceSingularIndefiniteRefListPhrase();

                    state._fsp--;

                     after(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistenceSingularIndefiniteRefListPhraseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1287:2: ( ruleExistencePluralIndefiniteRefListPhrase )
                    {
                    // InternalMyDsl.g:1287:2: ( ruleExistencePluralIndefiniteRefListPhrase )
                    // InternalMyDsl.g:1288:3: ruleExistencePluralIndefiniteRefListPhrase
                    {
                     before(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistencePluralIndefiniteRefListPhraseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExistencePluralIndefiniteRefListPhrase();

                    state._fsp--;

                     after(grammarAccess.getExistenceAnyRefListPhraseAccess().getExistencePluralIndefiniteRefListPhraseParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceAnyRefListPhrase__Alternatives"


    // $ANTLR start "rule__ExistenceIndefiniteRefPhrase__Alternatives"
    // InternalMyDsl.g:1297:1: rule__ExistenceIndefiniteRefPhrase__Alternatives : ( ( ruleExistenceSingularIndefiniteRefPhrase ) | ( ruleExistencePluralIndefiniteRefPhrase ) );
    public final void rule__ExistenceIndefiniteRefPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( ( ruleExistenceSingularIndefiniteRefPhrase ) | ( ruleExistencePluralIndefiniteRefPhrase ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=11 && LA10_0<=13)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_ID)||(LA10_0>=14 && LA10_0<=15)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1302:2: ( ruleExistenceSingularIndefiniteRefPhrase )
                    {
                    // InternalMyDsl.g:1302:2: ( ruleExistenceSingularIndefiniteRefPhrase )
                    // InternalMyDsl.g:1303:3: ruleExistenceSingularIndefiniteRefPhrase
                    {
                     before(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getExistenceSingularIndefiniteRefPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenceSingularIndefiniteRefPhrase();

                    state._fsp--;

                     after(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getExistenceSingularIndefiniteRefPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1308:2: ( ruleExistencePluralIndefiniteRefPhrase )
                    {
                    // InternalMyDsl.g:1308:2: ( ruleExistencePluralIndefiniteRefPhrase )
                    // InternalMyDsl.g:1309:3: ruleExistencePluralIndefiniteRefPhrase
                    {
                     before(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getExistencePluralIndefiniteRefPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExistencePluralIndefiniteRefPhrase();

                    state._fsp--;

                     after(grammarAccess.getExistenceIndefiniteRefPhraseAccess().getExistencePluralIndefiniteRefPhraseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteRefPhrase__Alternatives"


    // $ANTLR start "rule__CompositionStmt__Alternatives_1"
    // InternalMyDsl.g:1318:1: rule__CompositionStmt__Alternatives_1 : ( ( 'has' ) | ( 'is_composed_by' ) | ( 'contains' ) );
    public final void rule__CompositionStmt__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( 'has' ) | ( 'is_composed_by' ) | ( 'contains' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1323:2: ( 'has' )
                    {
                    // InternalMyDsl.g:1323:2: ( 'has' )
                    // InternalMyDsl.g:1324:3: 'has'
                    {
                     before(grammarAccess.getCompositionStmtAccess().getHasKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCompositionStmtAccess().getHasKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1329:2: ( 'is_composed_by' )
                    {
                    // InternalMyDsl.g:1329:2: ( 'is_composed_by' )
                    // InternalMyDsl.g:1330:3: 'is_composed_by'
                    {
                     before(grammarAccess.getCompositionStmtAccess().getIs_composed_byKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCompositionStmtAccess().getIs_composed_byKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1335:2: ( 'contains' )
                    {
                    // InternalMyDsl.g:1335:2: ( 'contains' )
                    // InternalMyDsl.g:1336:3: 'contains'
                    {
                     before(grammarAccess.getCompositionStmtAccess().getContainsKeyword_1_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCompositionStmtAccess().getContainsKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__Alternatives_1"


    // $ANTLR start "rule__InheritanceStmt__Alternatives_1"
    // InternalMyDsl.g:1345:1: rule__InheritanceStmt__Alternatives_1 : ( ( 'is' ) | ( 'are_each' ) );
    public final void rule__InheritanceStmt__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( ( 'is' ) | ( 'are_each' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1350:2: ( 'is' )
                    {
                    // InternalMyDsl.g:1350:2: ( 'is' )
                    // InternalMyDsl.g:1351:3: 'is'
                    {
                     before(grammarAccess.getInheritanceStmtAccess().getIsKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getInheritanceStmtAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1356:2: ( 'are_each' )
                    {
                    // InternalMyDsl.g:1356:2: ( 'are_each' )
                    // InternalMyDsl.g:1357:3: 'are_each'
                    {
                     before(grammarAccess.getInheritanceStmtAccess().getAre_eachKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getInheritanceStmtAccess().getAre_eachKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__Alternatives_1"


    // $ANTLR start "rule__OperationStmt__Alternatives"
    // InternalMyDsl.g:1366:1: rule__OperationStmt__Alternatives : ( ( ruleOperationDeclarationStmt ) | ( ruleOperationDefinitionStmt ) );
    public final void rule__OperationStmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( ( ruleOperationDeclarationStmt ) | ( ruleOperationDefinitionStmt ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=21 && LA13_0<=23)) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1371:2: ( ruleOperationDeclarationStmt )
                    {
                    // InternalMyDsl.g:1371:2: ( ruleOperationDeclarationStmt )
                    // InternalMyDsl.g:1372:3: ruleOperationDeclarationStmt
                    {
                     before(grammarAccess.getOperationStmtAccess().getOperationDeclarationStmtParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDeclarationStmt();

                    state._fsp--;

                     after(grammarAccess.getOperationStmtAccess().getOperationDeclarationStmtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1377:2: ( ruleOperationDefinitionStmt )
                    {
                    // InternalMyDsl.g:1377:2: ( ruleOperationDefinitionStmt )
                    // InternalMyDsl.g:1378:3: ruleOperationDefinitionStmt
                    {
                     before(grammarAccess.getOperationStmtAccess().getOperationDefinitionStmtParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinitionStmt();

                    state._fsp--;

                     after(grammarAccess.getOperationStmtAccess().getOperationDefinitionStmtParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationStmt__Alternatives"


    // $ANTLR start "rule__OperationDeclarationStmt__Alternatives_0"
    // InternalMyDsl.g:1387:1: rule__OperationDeclarationStmt__Alternatives_0 : ( ( 'it_is_possible_that' ) | ( 'it_is_possible_to' ) | ( 'it_is_possible' ) );
    public final void rule__OperationDeclarationStmt__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( 'it_is_possible_that' ) | ( 'it_is_possible_to' ) | ( 'it_is_possible' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1392:2: ( 'it_is_possible_that' )
                    {
                    // InternalMyDsl.g:1392:2: ( 'it_is_possible_that' )
                    // InternalMyDsl.g:1393:3: 'it_is_possible_that'
                    {
                     before(grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possible_thatKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possible_thatKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1398:2: ( 'it_is_possible_to' )
                    {
                    // InternalMyDsl.g:1398:2: ( 'it_is_possible_to' )
                    // InternalMyDsl.g:1399:3: 'it_is_possible_to'
                    {
                     before(grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possible_toKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possible_toKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1404:2: ( 'it_is_possible' )
                    {
                    // InternalMyDsl.g:1404:2: ( 'it_is_possible' )
                    // InternalMyDsl.g:1405:3: 'it_is_possible'
                    {
                     before(grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possibleKeyword_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperationDeclarationStmtAccess().getIt_is_possibleKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclarationStmt__Alternatives_0"


    // $ANTLR start "rule__OperationParameterPhrase__Alternatives"
    // InternalMyDsl.g:1414:1: rule__OperationParameterPhrase__Alternatives : ( ( ruleOperationParameterVariableDeclarationPhrase ) | ( ruleOperationParameterConnectionPhrase ) );
    public final void rule__OperationParameterPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( ruleOperationParameterVariableDeclarationPhrase ) | ( ruleOperationParameterConnectionPhrase ) )
            int alt15=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==RULE_ID) ) {
                    alt15=1;
                }
                else if ( (LA15_2==EOF||LA15_2==RULE_INT||(LA15_2>=11 && LA15_2<=15)||LA15_2==19||(LA15_2>=24 && LA15_2<=26)||LA15_2==29) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
            case 24:
            case 25:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1419:2: ( ruleOperationParameterVariableDeclarationPhrase )
                    {
                    // InternalMyDsl.g:1419:2: ( ruleOperationParameterVariableDeclarationPhrase )
                    // InternalMyDsl.g:1420:3: ruleOperationParameterVariableDeclarationPhrase
                    {
                     before(grammarAccess.getOperationParameterPhraseAccess().getOperationParameterVariableDeclarationPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationParameterVariableDeclarationPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationParameterPhraseAccess().getOperationParameterVariableDeclarationPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1425:2: ( ruleOperationParameterConnectionPhrase )
                    {
                    // InternalMyDsl.g:1425:2: ( ruleOperationParameterConnectionPhrase )
                    // InternalMyDsl.g:1426:3: ruleOperationParameterConnectionPhrase
                    {
                     before(grammarAccess.getOperationParameterPhraseAccess().getOperationParameterConnectionPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationParameterConnectionPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationParameterPhraseAccess().getOperationParameterConnectionPhraseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterPhrase__Alternatives"


    // $ANTLR start "rule__OperationDefinitionBodyStmt__Alternatives"
    // InternalMyDsl.g:1435:1: rule__OperationDefinitionBodyStmt__Alternatives : ( ( ruleOperationDefinitionBodyUnconditionalStmt ) | ( ruleOperationDefinitionBodyConditionalStmt ) );
    public final void rule__OperationDefinitionBodyStmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( ruleOperationDefinitionBodyUnconditionalStmt ) | ( ruleOperationDefinitionBodyConditionalStmt ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_STRING)||LA16_0==19||(LA16_0>=24 && LA16_0<=25)||(LA16_0>=27 && LA16_0<=28)) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1440:2: ( ruleOperationDefinitionBodyUnconditionalStmt )
                    {
                    // InternalMyDsl.g:1440:2: ( ruleOperationDefinitionBodyUnconditionalStmt )
                    // InternalMyDsl.g:1441:3: ruleOperationDefinitionBodyUnconditionalStmt
                    {
                     before(grammarAccess.getOperationDefinitionBodyStmtAccess().getOperationDefinitionBodyUnconditionalStmtParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinitionBodyUnconditionalStmt();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyStmtAccess().getOperationDefinitionBodyUnconditionalStmtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1446:2: ( ruleOperationDefinitionBodyConditionalStmt )
                    {
                    // InternalMyDsl.g:1446:2: ( ruleOperationDefinitionBodyConditionalStmt )
                    // InternalMyDsl.g:1447:3: ruleOperationDefinitionBodyConditionalStmt
                    {
                     before(grammarAccess.getOperationDefinitionBodyStmtAccess().getOperationDefinitionBodyConditionalStmtParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinitionBodyConditionalStmt();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyStmtAccess().getOperationDefinitionBodyConditionalStmtParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmt__Alternatives"


    // $ANTLR start "rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives"
    // InternalMyDsl.g:1456:1: rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives : ( ( ruleOperationDefinitionBodyFunctionCallPhrase ) | ( ruleOperationDefinitionBodyVariableDeclarationPhrase ) );
    public final void rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( ruleOperationDefinitionBodyFunctionCallPhrase ) | ( ruleOperationDefinitionBodyVariableDeclarationPhrase ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_STRING)||LA17_0==19||(LA17_0>=24 && LA17_0<=25)||LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1461:2: ( ruleOperationDefinitionBodyFunctionCallPhrase )
                    {
                    // InternalMyDsl.g:1461:2: ( ruleOperationDefinitionBodyFunctionCallPhrase )
                    // InternalMyDsl.g:1462:3: ruleOperationDefinitionBodyFunctionCallPhrase
                    {
                     before(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getOperationDefinitionBodyFunctionCallPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinitionBodyFunctionCallPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getOperationDefinitionBodyFunctionCallPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1467:2: ( ruleOperationDefinitionBodyVariableDeclarationPhrase )
                    {
                    // InternalMyDsl.g:1467:2: ( ruleOperationDefinitionBodyVariableDeclarationPhrase )
                    // InternalMyDsl.g:1468:3: ruleOperationDefinitionBodyVariableDeclarationPhrase
                    {
                     before(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getOperationDefinitionBodyVariableDeclarationPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinitionBodyVariableDeclarationPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyUnconditionalPhraseAccess().getOperationDefinitionBodyVariableDeclarationPhraseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyUnconditionalPhrase__Alternatives"


    // $ANTLR start "rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives"
    // InternalMyDsl.g:1477:1: rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives : ( ( ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase ) | ( ruleInstanceRefPhrase ) | ( ruleOperationParameterConnectionBuiltinRefPhrase ) );
    public final void rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( ( ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase ) | ( ruleInstanceRefPhrase ) | ( ruleOperationParameterConnectionBuiltinRefPhrase ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 28:
                {
                alt18=2;
                }
                break;
            case 19:
            case 24:
            case 25:
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
                    // InternalMyDsl.g:1482:2: ( ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase )
                    {
                    // InternalMyDsl.g:1482:2: ( ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase )
                    // InternalMyDsl.g:1483:3: ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase
                    {
                     before(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getOperationDefinitionBodyFunctionCallInRefsRefPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinitionBodyFunctionCallInRefsRefPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getOperationDefinitionBodyFunctionCallInRefsRefPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1488:2: ( ruleInstanceRefPhrase )
                    {
                    // InternalMyDsl.g:1488:2: ( ruleInstanceRefPhrase )
                    // InternalMyDsl.g:1489:3: ruleInstanceRefPhrase
                    {
                     before(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getInstanceRefPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInstanceRefPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getInstanceRefPhraseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1494:2: ( ruleOperationParameterConnectionBuiltinRefPhrase )
                    {
                    // InternalMyDsl.g:1494:2: ( ruleOperationParameterConnectionBuiltinRefPhrase )
                    // InternalMyDsl.g:1495:3: ruleOperationParameterConnectionBuiltinRefPhrase
                    {
                     before(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getOperationParameterConnectionBuiltinRefPhraseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationParameterConnectionBuiltinRefPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyFunctionCallArgumentsPhraseAccess().getOperationParameterConnectionBuiltinRefPhraseParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyFunctionCallArgumentsPhrase__Alternatives"


    // $ANTLR start "rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives"
    // InternalMyDsl.g:1504:1: rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives : ( ( ruleOperationParameterVariableDeclarationPhrase ) | ( ruleOperationDefinitionBodyVariableDeclarationPhrase ) );
    public final void rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( ( ruleOperationParameterVariableDeclarationPhrase ) | ( ruleOperationDefinitionBodyVariableDeclarationPhrase ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_ID)||(LA19_0>=11 && LA19_0<=15)) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1509:2: ( ruleOperationParameterVariableDeclarationPhrase )
                    {
                    // InternalMyDsl.g:1509:2: ( ruleOperationParameterVariableDeclarationPhrase )
                    // InternalMyDsl.g:1510:3: ruleOperationParameterVariableDeclarationPhrase
                    {
                     before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getOperationParameterVariableDeclarationPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationParameterVariableDeclarationPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getOperationParameterVariableDeclarationPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1515:2: ( ruleOperationDefinitionBodyVariableDeclarationPhrase )
                    {
                    // InternalMyDsl.g:1515:2: ( ruleOperationDefinitionBodyVariableDeclarationPhrase )
                    // InternalMyDsl.g:1516:3: ruleOperationDefinitionBodyVariableDeclarationPhrase
                    {
                     before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getOperationDefinitionBodyVariableDeclarationPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationDefinitionBodyVariableDeclarationPhrase();

                    state._fsp--;

                     after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsObjectsPhraseAccess().getOperationDefinitionBodyVariableDeclarationPhraseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyFunctionCallInRefsObjectsPhrase__Alternatives"


    // $ANTLR start "rule__OperationParameterConnectionPhrase__NameAlternatives_0"
    // InternalMyDsl.g:1525:1: rule__OperationParameterConnectionPhrase__NameAlternatives_0 : ( ( RULE_ID ) | ( 'is' ) | ( 'and' ) | ( 'or' ) );
    public final void rule__OperationParameterConnectionPhrase__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( RULE_ID ) | ( 'is' ) | ( 'and' ) | ( 'or' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 19:
                {
                alt20=2;
                }
                break;
            case 24:
                {
                alt20=3;
                }
                break;
            case 25:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1530:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1530:2: ( RULE_ID )
                    // InternalMyDsl.g:1531:3: RULE_ID
                    {
                     before(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1536:2: ( 'is' )
                    {
                    // InternalMyDsl.g:1536:2: ( 'is' )
                    // InternalMyDsl.g:1537:3: 'is'
                    {
                     before(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameIsKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameIsKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1542:2: ( 'and' )
                    {
                    // InternalMyDsl.g:1542:2: ( 'and' )
                    // InternalMyDsl.g:1543:3: 'and'
                    {
                     before(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameAndKeyword_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameAndKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1548:2: ( 'or' )
                    {
                    // InternalMyDsl.g:1548:2: ( 'or' )
                    // InternalMyDsl.g:1549:3: 'or'
                    {
                     before(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameOrKeyword_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameOrKeyword_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterConnectionPhrase__NameAlternatives_0"


    // $ANTLR start "rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0"
    // InternalMyDsl.g:1558:1: rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0 : ( ( 'is' ) | ( 'and' ) | ( 'or' ) );
    public final void rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( ( 'is' ) | ( 'and' ) | ( 'or' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt21=1;
                }
                break;
            case 24:
                {
                alt21=2;
                }
                break;
            case 25:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1563:2: ( 'is' )
                    {
                    // InternalMyDsl.g:1563:2: ( 'is' )
                    // InternalMyDsl.g:1564:3: 'is'
                    {
                     before(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameIsKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameIsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1569:2: ( 'and' )
                    {
                    // InternalMyDsl.g:1569:2: ( 'and' )
                    // InternalMyDsl.g:1570:3: 'and'
                    {
                     before(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameAndKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameAndKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1575:2: ( 'or' )
                    {
                    // InternalMyDsl.g:1575:2: ( 'or' )
                    // InternalMyDsl.g:1576:3: 'or'
                    {
                     before(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameOrKeyword_0_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameOrKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0"


    // $ANTLR start "rule__InstanceRefPhrase__Alternatives"
    // InternalMyDsl.g:1585:1: rule__InstanceRefPhrase__Alternatives : ( ( ( rule__InstanceRefPhrase__FAssignment_0 ) ) | ( ( rule__InstanceRefPhrase__Group_1__0 ) ) );
    public final void rule__InstanceRefPhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( ( rule__InstanceRefPhrase__FAssignment_0 ) ) | ( ( rule__InstanceRefPhrase__Group_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT||LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==28) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1590:2: ( ( rule__InstanceRefPhrase__FAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1590:2: ( ( rule__InstanceRefPhrase__FAssignment_0 ) )
                    // InternalMyDsl.g:1591:3: ( rule__InstanceRefPhrase__FAssignment_0 )
                    {
                     before(grammarAccess.getInstanceRefPhraseAccess().getFAssignment_0()); 
                    // InternalMyDsl.g:1592:3: ( rule__InstanceRefPhrase__FAssignment_0 )
                    // InternalMyDsl.g:1592:4: rule__InstanceRefPhrase__FAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceRefPhrase__FAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceRefPhraseAccess().getFAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1596:2: ( ( rule__InstanceRefPhrase__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1596:2: ( ( rule__InstanceRefPhrase__Group_1__0 ) )
                    // InternalMyDsl.g:1597:3: ( rule__InstanceRefPhrase__Group_1__0 )
                    {
                     before(grammarAccess.getInstanceRefPhraseAccess().getGroup_1()); 
                    // InternalMyDsl.g:1598:3: ( rule__InstanceRefPhrase__Group_1__0 )
                    // InternalMyDsl.g:1598:4: rule__InstanceRefPhrase__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceRefPhrase__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceRefPhraseAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__Alternatives"


    // $ANTLR start "rule__InstanceRefPhrase__FAlternatives_1_2_0"
    // InternalMyDsl.g:1606:1: rule__InstanceRefPhrase__FAlternatives_1_2_0 : ( ( ruleInstanceDirectRefPhrase ) | ( ruleInstanceIndirectRefPhrase ) );
    public final void rule__InstanceRefPhrase__FAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ruleInstanceDirectRefPhrase ) | ( ruleInstanceIndirectRefPhrase ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1611:2: ( ruleInstanceDirectRefPhrase )
                    {
                    // InternalMyDsl.g:1611:2: ( ruleInstanceDirectRefPhrase )
                    // InternalMyDsl.g:1612:3: ruleInstanceDirectRefPhrase
                    {
                     before(grammarAccess.getInstanceRefPhraseAccess().getFInstanceDirectRefPhraseParserRuleCall_1_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInstanceDirectRefPhrase();

                    state._fsp--;

                     after(grammarAccess.getInstanceRefPhraseAccess().getFInstanceDirectRefPhraseParserRuleCall_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1617:2: ( ruleInstanceIndirectRefPhrase )
                    {
                    // InternalMyDsl.g:1617:2: ( ruleInstanceIndirectRefPhrase )
                    // InternalMyDsl.g:1618:3: ruleInstanceIndirectRefPhrase
                    {
                     before(grammarAccess.getInstanceRefPhraseAccess().getFInstanceIndirectRefPhraseParserRuleCall_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInstanceIndirectRefPhrase();

                    state._fsp--;

                     after(grammarAccess.getInstanceRefPhraseAccess().getFInstanceIndirectRefPhraseParserRuleCall_1_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__FAlternatives_1_2_0"


    // $ANTLR start "rule__InstanceBuiltinValuePhrase__Alternatives"
    // InternalMyDsl.g:1627:1: rule__InstanceBuiltinValuePhrase__Alternatives : ( ( ruleInstanceBuiltinValueIntegerPhrase ) | ( ruleInstanceBuiltinValueStringPhrase ) );
    public final void rule__InstanceBuiltinValuePhrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1631:1: ( ( ruleInstanceBuiltinValueIntegerPhrase ) | ( ruleInstanceBuiltinValueStringPhrase ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1632:2: ( ruleInstanceBuiltinValueIntegerPhrase )
                    {
                    // InternalMyDsl.g:1632:2: ( ruleInstanceBuiltinValueIntegerPhrase )
                    // InternalMyDsl.g:1633:3: ruleInstanceBuiltinValueIntegerPhrase
                    {
                     before(grammarAccess.getInstanceBuiltinValuePhraseAccess().getInstanceBuiltinValueIntegerPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInstanceBuiltinValueIntegerPhrase();

                    state._fsp--;

                     after(grammarAccess.getInstanceBuiltinValuePhraseAccess().getInstanceBuiltinValueIntegerPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1638:2: ( ruleInstanceBuiltinValueStringPhrase )
                    {
                    // InternalMyDsl.g:1638:2: ( ruleInstanceBuiltinValueStringPhrase )
                    // InternalMyDsl.g:1639:3: ruleInstanceBuiltinValueStringPhrase
                    {
                     before(grammarAccess.getInstanceBuiltinValuePhraseAccess().getInstanceBuiltinValueStringPhraseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInstanceBuiltinValueStringPhrase();

                    state._fsp--;

                     after(grammarAccess.getInstanceBuiltinValuePhraseAccess().getInstanceBuiltinValueStringPhraseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValuePhrase__Alternatives"


    // $ANTLR start "rule__Stmt__Group__0"
    // InternalMyDsl.g:1648:1: rule__Stmt__Group__0 : rule__Stmt__Group__0__Impl rule__Stmt__Group__1 ;
    public final void rule__Stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Stmt__Group__0__Impl rule__Stmt__Group__1 )
            // InternalMyDsl.g:1653:2: rule__Stmt__Group__0__Impl rule__Stmt__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Stmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0"


    // $ANTLR start "rule__Stmt__Group__0__Impl"
    // InternalMyDsl.g:1660:1: rule__Stmt__Group__0__Impl : ( ( rule__Stmt__Alternatives_0 ) ) ;
    public final void rule__Stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( ( rule__Stmt__Alternatives_0 ) ) )
            // InternalMyDsl.g:1665:1: ( ( rule__Stmt__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1665:1: ( ( rule__Stmt__Alternatives_0 ) )
            // InternalMyDsl.g:1666:2: ( rule__Stmt__Alternatives_0 )
            {
             before(grammarAccess.getStmtAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1667:2: ( rule__Stmt__Alternatives_0 )
            // InternalMyDsl.g:1667:3: rule__Stmt__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStmtAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0__Impl"


    // $ANTLR start "rule__Stmt__Group__1"
    // InternalMyDsl.g:1675:1: rule__Stmt__Group__1 : rule__Stmt__Group__1__Impl ;
    public final void rule__Stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Stmt__Group__1__Impl )
            // InternalMyDsl.g:1680:2: rule__Stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1"


    // $ANTLR start "rule__Stmt__Group__1__Impl"
    // InternalMyDsl.g:1686:1: rule__Stmt__Group__1__Impl : ( '.' ) ;
    public final void rule__Stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( '.' ) )
            // InternalMyDsl.g:1691:1: ( '.' )
            {
            // InternalMyDsl.g:1691:1: ( '.' )
            // InternalMyDsl.g:1692:2: '.'
            {
             before(grammarAccess.getStmtAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStmtAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1__Impl"


    // $ANTLR start "rule__ExistenceDefiniteStmt__Group__0"
    // InternalMyDsl.g:1702:1: rule__ExistenceDefiniteStmt__Group__0 : rule__ExistenceDefiniteStmt__Group__0__Impl rule__ExistenceDefiniteStmt__Group__1 ;
    public final void rule__ExistenceDefiniteStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__ExistenceDefiniteStmt__Group__0__Impl rule__ExistenceDefiniteStmt__Group__1 )
            // InternalMyDsl.g:1707:2: rule__ExistenceDefiniteStmt__Group__0__Impl rule__ExistenceDefiniteStmt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExistenceDefiniteStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteStmt__Group__0"


    // $ANTLR start "rule__ExistenceDefiniteStmt__Group__0__Impl"
    // InternalMyDsl.g:1714:1: rule__ExistenceDefiniteStmt__Group__0__Impl : ( 'there_is_one' ) ;
    public final void rule__ExistenceDefiniteStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( 'there_is_one' ) )
            // InternalMyDsl.g:1719:1: ( 'there_is_one' )
            {
            // InternalMyDsl.g:1719:1: ( 'there_is_one' )
            // InternalMyDsl.g:1720:2: 'there_is_one'
            {
             before(grammarAccess.getExistenceDefiniteStmtAccess().getThere_is_oneKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExistenceDefiniteStmtAccess().getThere_is_oneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteStmt__Group__0__Impl"


    // $ANTLR start "rule__ExistenceDefiniteStmt__Group__1"
    // InternalMyDsl.g:1729:1: rule__ExistenceDefiniteStmt__Group__1 : rule__ExistenceDefiniteStmt__Group__1__Impl ;
    public final void rule__ExistenceDefiniteStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__ExistenceDefiniteStmt__Group__1__Impl )
            // InternalMyDsl.g:1734:2: rule__ExistenceDefiniteStmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteStmt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteStmt__Group__1"


    // $ANTLR start "rule__ExistenceDefiniteStmt__Group__1__Impl"
    // InternalMyDsl.g:1740:1: rule__ExistenceDefiniteStmt__Group__1__Impl : ( ( rule__ExistenceDefiniteStmt__DefiniteAssignment_1 ) ) ;
    public final void rule__ExistenceDefiniteStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( ( rule__ExistenceDefiniteStmt__DefiniteAssignment_1 ) ) )
            // InternalMyDsl.g:1745:1: ( ( rule__ExistenceDefiniteStmt__DefiniteAssignment_1 ) )
            {
            // InternalMyDsl.g:1745:1: ( ( rule__ExistenceDefiniteStmt__DefiniteAssignment_1 ) )
            // InternalMyDsl.g:1746:2: ( rule__ExistenceDefiniteStmt__DefiniteAssignment_1 )
            {
             before(grammarAccess.getExistenceDefiniteStmtAccess().getDefiniteAssignment_1()); 
            // InternalMyDsl.g:1747:2: ( rule__ExistenceDefiniteStmt__DefiniteAssignment_1 )
            // InternalMyDsl.g:1747:3: rule__ExistenceDefiniteStmt__DefiniteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteStmt__DefiniteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefiniteStmtAccess().getDefiniteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteStmt__Group__1__Impl"


    // $ANTLR start "rule__ExistenceDefiniteRefPhrase__Group__0"
    // InternalMyDsl.g:1756:1: rule__ExistenceDefiniteRefPhrase__Group__0 : rule__ExistenceDefiniteRefPhrase__Group__0__Impl rule__ExistenceDefiniteRefPhrase__Group__1 ;
    public final void rule__ExistenceDefiniteRefPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__ExistenceDefiniteRefPhrase__Group__0__Impl rule__ExistenceDefiniteRefPhrase__Group__1 )
            // InternalMyDsl.g:1761:2: rule__ExistenceDefiniteRefPhrase__Group__0__Impl rule__ExistenceDefiniteRefPhrase__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExistenceDefiniteRefPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefPhrase__Group__0"


    // $ANTLR start "rule__ExistenceDefiniteRefPhrase__Group__0__Impl"
    // InternalMyDsl.g:1768:1: rule__ExistenceDefiniteRefPhrase__Group__0__Impl : ( 'the' ) ;
    public final void rule__ExistenceDefiniteRefPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( 'the' ) )
            // InternalMyDsl.g:1773:1: ( 'the' )
            {
            // InternalMyDsl.g:1773:1: ( 'the' )
            // InternalMyDsl.g:1774:2: 'the'
            {
             before(grammarAccess.getExistenceDefiniteRefPhraseAccess().getTheKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExistenceDefiniteRefPhraseAccess().getTheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefPhrase__Group__0__Impl"


    // $ANTLR start "rule__ExistenceDefiniteRefPhrase__Group__1"
    // InternalMyDsl.g:1783:1: rule__ExistenceDefiniteRefPhrase__Group__1 : rule__ExistenceDefiniteRefPhrase__Group__1__Impl ;
    public final void rule__ExistenceDefiniteRefPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__ExistenceDefiniteRefPhrase__Group__1__Impl )
            // InternalMyDsl.g:1788:2: rule__ExistenceDefiniteRefPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefPhrase__Group__1"


    // $ANTLR start "rule__ExistenceDefiniteRefPhrase__Group__1__Impl"
    // InternalMyDsl.g:1794:1: rule__ExistenceDefiniteRefPhrase__Group__1__Impl : ( ( rule__ExistenceDefiniteRefPhrase__RefAssignment_1 ) ) ;
    public final void rule__ExistenceDefiniteRefPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( ( rule__ExistenceDefiniteRefPhrase__RefAssignment_1 ) ) )
            // InternalMyDsl.g:1799:1: ( ( rule__ExistenceDefiniteRefPhrase__RefAssignment_1 ) )
            {
            // InternalMyDsl.g:1799:1: ( ( rule__ExistenceDefiniteRefPhrase__RefAssignment_1 ) )
            // InternalMyDsl.g:1800:2: ( rule__ExistenceDefiniteRefPhrase__RefAssignment_1 )
            {
             before(grammarAccess.getExistenceDefiniteRefPhraseAccess().getRefAssignment_1()); 
            // InternalMyDsl.g:1801:2: ( rule__ExistenceDefiniteRefPhrase__RefAssignment_1 )
            // InternalMyDsl.g:1801:3: rule__ExistenceDefiniteRefPhrase__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefPhrase__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefiniteRefPhraseAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefPhrase__Group__1__Impl"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group__0"
    // InternalMyDsl.g:1810:1: rule__ExistenceDefiniteRefListPhrase__Group__0 : rule__ExistenceDefiniteRefListPhrase__Group__0__Impl rule__ExistenceDefiniteRefListPhrase__Group__1 ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__ExistenceDefiniteRefListPhrase__Group__0__Impl rule__ExistenceDefiniteRefListPhrase__Group__1 )
            // InternalMyDsl.g:1815:2: rule__ExistenceDefiniteRefListPhrase__Group__0__Impl rule__ExistenceDefiniteRefListPhrase__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExistenceDefiniteRefListPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group__0"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group__0__Impl"
    // InternalMyDsl.g:1822:1: rule__ExistenceDefiniteRefListPhrase__Group__0__Impl : ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0 ) ) ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:1827:1: ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:1827:1: ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0 ) )
            // InternalMyDsl.g:1828:2: ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0 )
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:1829:2: ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0 )
            // InternalMyDsl.g:1829:3: rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group__0__Impl"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group__1"
    // InternalMyDsl.g:1837:1: rule__ExistenceDefiniteRefListPhrase__Group__1 : rule__ExistenceDefiniteRefListPhrase__Group__1__Impl ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__ExistenceDefiniteRefListPhrase__Group__1__Impl )
            // InternalMyDsl.g:1842:2: rule__ExistenceDefiniteRefListPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group__1"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group__1__Impl"
    // InternalMyDsl.g:1848:1: rule__ExistenceDefiniteRefListPhrase__Group__1__Impl : ( ( rule__ExistenceDefiniteRefListPhrase__Group_1__0 )* ) ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ( rule__ExistenceDefiniteRefListPhrase__Group_1__0 )* ) )
            // InternalMyDsl.g:1853:1: ( ( rule__ExistenceDefiniteRefListPhrase__Group_1__0 )* )
            {
            // InternalMyDsl.g:1853:1: ( ( rule__ExistenceDefiniteRefListPhrase__Group_1__0 )* )
            // InternalMyDsl.g:1854:2: ( rule__ExistenceDefiniteRefListPhrase__Group_1__0 )*
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getGroup_1()); 
            // InternalMyDsl.g:1855:2: ( rule__ExistenceDefiniteRefListPhrase__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1855:3: rule__ExistenceDefiniteRefListPhrase__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ExistenceDefiniteRefListPhrase__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group__1__Impl"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group_1__0"
    // InternalMyDsl.g:1864:1: rule__ExistenceDefiniteRefListPhrase__Group_1__0 : rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl rule__ExistenceDefiniteRefListPhrase__Group_1__1 ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl rule__ExistenceDefiniteRefListPhrase__Group_1__1 )
            // InternalMyDsl.g:1869:2: rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl rule__ExistenceDefiniteRefListPhrase__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group_1__0"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl"
    // InternalMyDsl.g:1876:1: rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( ',' ) )
            // InternalMyDsl.g:1881:1: ( ',' )
            {
            // InternalMyDsl.g:1881:1: ( ',' )
            // InternalMyDsl.g:1882:2: ','
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getCommaKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group_1__0__Impl"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group_1__1"
    // InternalMyDsl.g:1891:1: rule__ExistenceDefiniteRefListPhrase__Group_1__1 : rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl rule__ExistenceDefiniteRefListPhrase__Group_1__2 ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl rule__ExistenceDefiniteRefListPhrase__Group_1__2 )
            // InternalMyDsl.g:1896:2: rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl rule__ExistenceDefiniteRefListPhrase__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group_1__1"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl"
    // InternalMyDsl.g:1903:1: rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl : ( ( 'and' )? ) ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ( 'and' )? ) )
            // InternalMyDsl.g:1908:1: ( ( 'and' )? )
            {
            // InternalMyDsl.g:1908:1: ( ( 'and' )? )
            // InternalMyDsl.g:1909:2: ( 'and' )?
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getAndKeyword_1_1()); 
            // InternalMyDsl.g:1910:2: ( 'and' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1910:3: 'and'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group_1__1__Impl"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group_1__2"
    // InternalMyDsl.g:1918:1: rule__ExistenceDefiniteRefListPhrase__Group_1__2 : rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl )
            // InternalMyDsl.g:1923:2: rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group_1__2"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl"
    // InternalMyDsl.g:1929:1: rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl : ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2 ) ) ;
    public final void rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2 ) ) )
            // InternalMyDsl.g:1934:1: ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1934:1: ( ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2 ) )
            // InternalMyDsl.g:1935:2: ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2 )
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsAssignment_1_2()); 
            // InternalMyDsl.g:1936:2: ( rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2 )
            // InternalMyDsl.g:1936:3: rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__Group_1__2__Impl"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__0"
    // InternalMyDsl.g:1945:1: rule__ExistenceIndefiniteStmt__Group__0 : rule__ExistenceIndefiniteStmt__Group__0__Impl rule__ExistenceIndefiniteStmt__Group__1 ;
    public final void rule__ExistenceIndefiniteStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__ExistenceIndefiniteStmt__Group__0__Impl rule__ExistenceIndefiniteStmt__Group__1 )
            // InternalMyDsl.g:1950:2: rule__ExistenceIndefiniteStmt__Group__0__Impl rule__ExistenceIndefiniteStmt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExistenceIndefiniteStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__0"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__0__Impl"
    // InternalMyDsl.g:1957:1: rule__ExistenceIndefiniteStmt__Group__0__Impl : ( 'there_are' ) ;
    public final void rule__ExistenceIndefiniteStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( 'there_are' ) )
            // InternalMyDsl.g:1962:1: ( 'there_are' )
            {
            // InternalMyDsl.g:1962:1: ( 'there_are' )
            // InternalMyDsl.g:1963:2: 'there_are'
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getThere_areKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExistenceIndefiniteStmtAccess().getThere_areKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__0__Impl"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__1"
    // InternalMyDsl.g:1972:1: rule__ExistenceIndefiniteStmt__Group__1 : rule__ExistenceIndefiniteStmt__Group__1__Impl rule__ExistenceIndefiniteStmt__Group__2 ;
    public final void rule__ExistenceIndefiniteStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__ExistenceIndefiniteStmt__Group__1__Impl rule__ExistenceIndefiniteStmt__Group__2 )
            // InternalMyDsl.g:1977:2: rule__ExistenceIndefiniteStmt__Group__1__Impl rule__ExistenceIndefiniteStmt__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ExistenceIndefiniteStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__1"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__1__Impl"
    // InternalMyDsl.g:1984:1: rule__ExistenceIndefiniteStmt__Group__1__Impl : ( ( rule__ExistenceIndefiniteStmt__PluralAssignment_1 ) ) ;
    public final void rule__ExistenceIndefiniteStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( ( rule__ExistenceIndefiniteStmt__PluralAssignment_1 ) ) )
            // InternalMyDsl.g:1989:1: ( ( rule__ExistenceIndefiniteStmt__PluralAssignment_1 ) )
            {
            // InternalMyDsl.g:1989:1: ( ( rule__ExistenceIndefiniteStmt__PluralAssignment_1 ) )
            // InternalMyDsl.g:1990:2: ( rule__ExistenceIndefiniteStmt__PluralAssignment_1 )
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getPluralAssignment_1()); 
            // InternalMyDsl.g:1991:2: ( rule__ExistenceIndefiniteStmt__PluralAssignment_1 )
            // InternalMyDsl.g:1991:3: rule__ExistenceIndefiniteStmt__PluralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__PluralAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistenceIndefiniteStmtAccess().getPluralAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__1__Impl"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__2"
    // InternalMyDsl.g:1999:1: rule__ExistenceIndefiniteStmt__Group__2 : rule__ExistenceIndefiniteStmt__Group__2__Impl rule__ExistenceIndefiniteStmt__Group__3 ;
    public final void rule__ExistenceIndefiniteStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__ExistenceIndefiniteStmt__Group__2__Impl rule__ExistenceIndefiniteStmt__Group__3 )
            // InternalMyDsl.g:2004:2: rule__ExistenceIndefiniteStmt__Group__2__Impl rule__ExistenceIndefiniteStmt__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ExistenceIndefiniteStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__2"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__2__Impl"
    // InternalMyDsl.g:2011:1: rule__ExistenceIndefiniteStmt__Group__2__Impl : ( '(' ) ;
    public final void rule__ExistenceIndefiniteStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( '(' ) )
            // InternalMyDsl.g:2016:1: ( '(' )
            {
            // InternalMyDsl.g:2016:1: ( '(' )
            // InternalMyDsl.g:2017:2: '('
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExistenceIndefiniteStmtAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__2__Impl"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__3"
    // InternalMyDsl.g:2026:1: rule__ExistenceIndefiniteStmt__Group__3 : rule__ExistenceIndefiniteStmt__Group__3__Impl rule__ExistenceIndefiniteStmt__Group__4 ;
    public final void rule__ExistenceIndefiniteStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__ExistenceIndefiniteStmt__Group__3__Impl rule__ExistenceIndefiniteStmt__Group__4 )
            // InternalMyDsl.g:2031:2: rule__ExistenceIndefiniteStmt__Group__3__Impl rule__ExistenceIndefiniteStmt__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ExistenceIndefiniteStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__3"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__3__Impl"
    // InternalMyDsl.g:2038:1: rule__ExistenceIndefiniteStmt__Group__3__Impl : ( ( rule__ExistenceIndefiniteStmt__SingularAssignment_3 ) ) ;
    public final void rule__ExistenceIndefiniteStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( ( rule__ExistenceIndefiniteStmt__SingularAssignment_3 ) ) )
            // InternalMyDsl.g:2043:1: ( ( rule__ExistenceIndefiniteStmt__SingularAssignment_3 ) )
            {
            // InternalMyDsl.g:2043:1: ( ( rule__ExistenceIndefiniteStmt__SingularAssignment_3 ) )
            // InternalMyDsl.g:2044:2: ( rule__ExistenceIndefiniteStmt__SingularAssignment_3 )
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getSingularAssignment_3()); 
            // InternalMyDsl.g:2045:2: ( rule__ExistenceIndefiniteStmt__SingularAssignment_3 )
            // InternalMyDsl.g:2045:3: rule__ExistenceIndefiniteStmt__SingularAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__SingularAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExistenceIndefiniteStmtAccess().getSingularAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__3__Impl"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__4"
    // InternalMyDsl.g:2053:1: rule__ExistenceIndefiniteStmt__Group__4 : rule__ExistenceIndefiniteStmt__Group__4__Impl ;
    public final void rule__ExistenceIndefiniteStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__ExistenceIndefiniteStmt__Group__4__Impl )
            // InternalMyDsl.g:2058:2: rule__ExistenceIndefiniteStmt__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceIndefiniteStmt__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__4"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__Group__4__Impl"
    // InternalMyDsl.g:2064:1: rule__ExistenceIndefiniteStmt__Group__4__Impl : ( ')' ) ;
    public final void rule__ExistenceIndefiniteStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ')' ) )
            // InternalMyDsl.g:2069:1: ( ')' )
            {
            // InternalMyDsl.g:2069:1: ( ')' )
            // InternalMyDsl.g:2070:2: ')'
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getRightParenthesisKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExistenceIndefiniteStmtAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__Group__4__Impl"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefPhrase__Group__0"
    // InternalMyDsl.g:2080:1: rule__ExistenceSingularIndefiniteRefPhrase__Group__0 : rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl rule__ExistenceSingularIndefiniteRefPhrase__Group__1 ;
    public final void rule__ExistenceSingularIndefiniteRefPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl rule__ExistenceSingularIndefiniteRefPhrase__Group__1 )
            // InternalMyDsl.g:2085:2: rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl rule__ExistenceSingularIndefiniteRefPhrase__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefPhrase__Group__0"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl"
    // InternalMyDsl.g:2092:1: rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl : ( ( rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0 ) ) ;
    public final void rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( ( rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0 ) ) )
            // InternalMyDsl.g:2097:1: ( ( rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0 ) )
            {
            // InternalMyDsl.g:2097:1: ( ( rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0 ) )
            // InternalMyDsl.g:2098:2: ( rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0 )
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2099:2: ( rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0 )
            // InternalMyDsl.g:2099:3: rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefPhrase__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefPhrase__Group__0__Impl"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefPhrase__Group__1"
    // InternalMyDsl.g:2107:1: rule__ExistenceSingularIndefiniteRefPhrase__Group__1 : rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl ;
    public final void rule__ExistenceSingularIndefiniteRefPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl )
            // InternalMyDsl.g:2112:2: rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefPhrase__Group__1"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl"
    // InternalMyDsl.g:2118:1: rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl : ( ( rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1 ) ) ;
    public final void rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1 ) ) )
            // InternalMyDsl.g:2123:1: ( ( rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1 ) )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1 ) )
            // InternalMyDsl.g:2124:2: ( rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1 )
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getRefAssignment_1()); 
            // InternalMyDsl.g:2125:2: ( rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1 )
            // InternalMyDsl.g:2125:3: rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefPhrase__Group__1__Impl"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefPhrase__Group__0"
    // InternalMyDsl.g:2134:1: rule__ExistencePluralIndefiniteRefPhrase__Group__0 : rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl rule__ExistencePluralIndefiniteRefPhrase__Group__1 ;
    public final void rule__ExistencePluralIndefiniteRefPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl rule__ExistencePluralIndefiniteRefPhrase__Group__1 )
            // InternalMyDsl.g:2139:2: rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl rule__ExistencePluralIndefiniteRefPhrase__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefPhrase__Group__0"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl"
    // InternalMyDsl.g:2146:1: rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl : ( ( rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0 )? ) ;
    public final void rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( ( rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0 )? ) )
            // InternalMyDsl.g:2151:1: ( ( rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0 )? )
            {
            // InternalMyDsl.g:2151:1: ( ( rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0 )? )
            // InternalMyDsl.g:2152:2: ( rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0 )?
            {
             before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2153:2: ( rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||(LA27_0>=14 && LA27_0<=15)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2153:3: rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExistencePluralIndefiniteRefPhrase__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefPhrase__Group__0__Impl"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefPhrase__Group__1"
    // InternalMyDsl.g:2161:1: rule__ExistencePluralIndefiniteRefPhrase__Group__1 : rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl ;
    public final void rule__ExistencePluralIndefiniteRefPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl )
            // InternalMyDsl.g:2166:2: rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefPhrase__Group__1"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl"
    // InternalMyDsl.g:2172:1: rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl : ( ( rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1 ) ) ;
    public final void rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( ( rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1 ) ) )
            // InternalMyDsl.g:2177:1: ( ( rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1 ) )
            {
            // InternalMyDsl.g:2177:1: ( ( rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1 ) )
            // InternalMyDsl.g:2178:2: ( rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1 )
            {
             before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getRefAssignment_1()); 
            // InternalMyDsl.g:2179:2: ( rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1 )
            // InternalMyDsl.g:2179:3: rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefPhrase__Group__1__Impl"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group__0"
    // InternalMyDsl.g:2188:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group__0 : rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group__1 ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group__1 )
            // InternalMyDsl.g:2193:2: rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group__0"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl"
    // InternalMyDsl.g:2200:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl : ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0 ) ) ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:2205:1: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:2205:1: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0 ) )
            // InternalMyDsl.g:2206:2: ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0 )
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:2207:2: ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0 )
            // InternalMyDsl.g:2207:3: rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group__0__Impl"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group__1"
    // InternalMyDsl.g:2215:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group__1 : rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl )
            // InternalMyDsl.g:2220:2: rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group__1"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl"
    // InternalMyDsl.g:2226:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl : ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0 )* ) ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0 )* ) )
            // InternalMyDsl.g:2231:1: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0 )* )
            {
            // InternalMyDsl.g:2231:1: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0 )* )
            // InternalMyDsl.g:2232:2: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0 )*
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getGroup_1()); 
            // InternalMyDsl.g:2233:2: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2233:3: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group__1__Impl"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0"
    // InternalMyDsl.g:2242:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0 : rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1 ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1 )
            // InternalMyDsl.g:2247:2: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl"
    // InternalMyDsl.g:2254:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( ',' ) )
            // InternalMyDsl.g:2259:1: ( ',' )
            {
            // InternalMyDsl.g:2259:1: ( ',' )
            // InternalMyDsl.g:2260:2: ','
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getCommaKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__0__Impl"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1"
    // InternalMyDsl.g:2269:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1 : rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2 ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2 )
            // InternalMyDsl.g:2274:2: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl"
    // InternalMyDsl.g:2281:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl : ( ( 'and' )? ) ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( ( 'and' )? ) )
            // InternalMyDsl.g:2286:1: ( ( 'and' )? )
            {
            // InternalMyDsl.g:2286:1: ( ( 'and' )? )
            // InternalMyDsl.g:2287:2: ( 'and' )?
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getAndKeyword_1_1()); 
            // InternalMyDsl.g:2288:2: ( 'and' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2288:3: 'and'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__1__Impl"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2"
    // InternalMyDsl.g:2296:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2 : rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl )
            // InternalMyDsl.g:2301:2: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl"
    // InternalMyDsl.g:2307:1: rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl : ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2 ) ) ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2 ) ) )
            // InternalMyDsl.g:2312:1: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2312:1: ( ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2 ) )
            // InternalMyDsl.g:2313:2: ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2 )
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsAssignment_1_2()); 
            // InternalMyDsl.g:2314:2: ( rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2 )
            // InternalMyDsl.g:2314:3: rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__Group_1__2__Impl"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group__0"
    // InternalMyDsl.g:2323:1: rule__ExistencePluralIndefiniteRefListPhrase__Group__0 : rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group__1 ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group__1 )
            // InternalMyDsl.g:2328:2: rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group__0"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl"
    // InternalMyDsl.g:2335:1: rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl : ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0 ) ) ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:2340:1: ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:2340:1: ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0 ) )
            // InternalMyDsl.g:2341:2: ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0 )
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:2342:2: ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0 )
            // InternalMyDsl.g:2342:3: rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group__0__Impl"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group__1"
    // InternalMyDsl.g:2350:1: rule__ExistencePluralIndefiniteRefListPhrase__Group__1 : rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl )
            // InternalMyDsl.g:2355:2: rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group__1"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl"
    // InternalMyDsl.g:2361:1: rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl : ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0 )* ) ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0 )* ) )
            // InternalMyDsl.g:2366:1: ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0 )* )
            {
            // InternalMyDsl.g:2366:1: ( ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0 )* )
            // InternalMyDsl.g:2367:2: ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0 )*
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getGroup_1()); 
            // InternalMyDsl.g:2368:2: ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:2368:3: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group__1__Impl"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0"
    // InternalMyDsl.g:2377:1: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0 : rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1 ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1 )
            // InternalMyDsl.g:2382:2: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl"
    // InternalMyDsl.g:2389:1: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( ',' ) )
            // InternalMyDsl.g:2394:1: ( ',' )
            {
            // InternalMyDsl.g:2394:1: ( ',' )
            // InternalMyDsl.g:2395:2: ','
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getCommaKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__0__Impl"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1"
    // InternalMyDsl.g:2404:1: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1 : rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2 ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2 )
            // InternalMyDsl.g:2409:2: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl"
    // InternalMyDsl.g:2416:1: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl : ( ( 'and' )? ) ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( ( 'and' )? ) )
            // InternalMyDsl.g:2421:1: ( ( 'and' )? )
            {
            // InternalMyDsl.g:2421:1: ( ( 'and' )? )
            // InternalMyDsl.g:2422:2: ( 'and' )?
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getAndKeyword_1_1()); 
            // InternalMyDsl.g:2423:2: ( 'and' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2423:3: 'and'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__1__Impl"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2"
    // InternalMyDsl.g:2431:1: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2 : rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl )
            // InternalMyDsl.g:2436:2: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl"
    // InternalMyDsl.g:2442:1: rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl : ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2 ) ) ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2 ) ) )
            // InternalMyDsl.g:2447:1: ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2447:1: ( ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2 ) )
            // InternalMyDsl.g:2448:2: ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2 )
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsAssignment_1_2()); 
            // InternalMyDsl.g:2449:2: ( rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2 )
            // InternalMyDsl.g:2449:3: rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__Group_1__2__Impl"


    // $ANTLR start "rule__CompositionStmt__Group__0"
    // InternalMyDsl.g:2458:1: rule__CompositionStmt__Group__0 : rule__CompositionStmt__Group__0__Impl rule__CompositionStmt__Group__1 ;
    public final void rule__CompositionStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__CompositionStmt__Group__0__Impl rule__CompositionStmt__Group__1 )
            // InternalMyDsl.g:2463:2: rule__CompositionStmt__Group__0__Impl rule__CompositionStmt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__CompositionStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__Group__0"


    // $ANTLR start "rule__CompositionStmt__Group__0__Impl"
    // InternalMyDsl.g:2470:1: rule__CompositionStmt__Group__0__Impl : ( ( rule__CompositionStmt__ParentAssignment_0 ) ) ;
    public final void rule__CompositionStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( ( ( rule__CompositionStmt__ParentAssignment_0 ) ) )
            // InternalMyDsl.g:2475:1: ( ( rule__CompositionStmt__ParentAssignment_0 ) )
            {
            // InternalMyDsl.g:2475:1: ( ( rule__CompositionStmt__ParentAssignment_0 ) )
            // InternalMyDsl.g:2476:2: ( rule__CompositionStmt__ParentAssignment_0 )
            {
             before(grammarAccess.getCompositionStmtAccess().getParentAssignment_0()); 
            // InternalMyDsl.g:2477:2: ( rule__CompositionStmt__ParentAssignment_0 )
            // InternalMyDsl.g:2477:3: rule__CompositionStmt__ParentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionStmt__ParentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionStmtAccess().getParentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__Group__0__Impl"


    // $ANTLR start "rule__CompositionStmt__Group__1"
    // InternalMyDsl.g:2485:1: rule__CompositionStmt__Group__1 : rule__CompositionStmt__Group__1__Impl rule__CompositionStmt__Group__2 ;
    public final void rule__CompositionStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__CompositionStmt__Group__1__Impl rule__CompositionStmt__Group__2 )
            // InternalMyDsl.g:2490:2: rule__CompositionStmt__Group__1__Impl rule__CompositionStmt__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__CompositionStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionStmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__Group__1"


    // $ANTLR start "rule__CompositionStmt__Group__1__Impl"
    // InternalMyDsl.g:2497:1: rule__CompositionStmt__Group__1__Impl : ( ( rule__CompositionStmt__Alternatives_1 ) ) ;
    public final void rule__CompositionStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( ( ( rule__CompositionStmt__Alternatives_1 ) ) )
            // InternalMyDsl.g:2502:1: ( ( rule__CompositionStmt__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2502:1: ( ( rule__CompositionStmt__Alternatives_1 ) )
            // InternalMyDsl.g:2503:2: ( rule__CompositionStmt__Alternatives_1 )
            {
             before(grammarAccess.getCompositionStmtAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2504:2: ( rule__CompositionStmt__Alternatives_1 )
            // InternalMyDsl.g:2504:3: rule__CompositionStmt__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionStmt__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionStmtAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__Group__1__Impl"


    // $ANTLR start "rule__CompositionStmt__Group__2"
    // InternalMyDsl.g:2512:1: rule__CompositionStmt__Group__2 : rule__CompositionStmt__Group__2__Impl ;
    public final void rule__CompositionStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__CompositionStmt__Group__2__Impl )
            // InternalMyDsl.g:2517:2: rule__CompositionStmt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionStmt__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__Group__2"


    // $ANTLR start "rule__CompositionStmt__Group__2__Impl"
    // InternalMyDsl.g:2523:1: rule__CompositionStmt__Group__2__Impl : ( ( rule__CompositionStmt__ChildrenAssignment_2 ) ) ;
    public final void rule__CompositionStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( ( rule__CompositionStmt__ChildrenAssignment_2 ) ) )
            // InternalMyDsl.g:2528:1: ( ( rule__CompositionStmt__ChildrenAssignment_2 ) )
            {
            // InternalMyDsl.g:2528:1: ( ( rule__CompositionStmt__ChildrenAssignment_2 ) )
            // InternalMyDsl.g:2529:2: ( rule__CompositionStmt__ChildrenAssignment_2 )
            {
             before(grammarAccess.getCompositionStmtAccess().getChildrenAssignment_2()); 
            // InternalMyDsl.g:2530:2: ( rule__CompositionStmt__ChildrenAssignment_2 )
            // InternalMyDsl.g:2530:3: rule__CompositionStmt__ChildrenAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositionStmt__ChildrenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositionStmtAccess().getChildrenAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__Group__2__Impl"


    // $ANTLR start "rule__InheritanceStmt__Group__0"
    // InternalMyDsl.g:2539:1: rule__InheritanceStmt__Group__0 : rule__InheritanceStmt__Group__0__Impl rule__InheritanceStmt__Group__1 ;
    public final void rule__InheritanceStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( rule__InheritanceStmt__Group__0__Impl rule__InheritanceStmt__Group__1 )
            // InternalMyDsl.g:2544:2: rule__InheritanceStmt__Group__0__Impl rule__InheritanceStmt__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__InheritanceStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InheritanceStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__Group__0"


    // $ANTLR start "rule__InheritanceStmt__Group__0__Impl"
    // InternalMyDsl.g:2551:1: rule__InheritanceStmt__Group__0__Impl : ( ( rule__InheritanceStmt__ClassAssignment_0 ) ) ;
    public final void rule__InheritanceStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( ( rule__InheritanceStmt__ClassAssignment_0 ) ) )
            // InternalMyDsl.g:2556:1: ( ( rule__InheritanceStmt__ClassAssignment_0 ) )
            {
            // InternalMyDsl.g:2556:1: ( ( rule__InheritanceStmt__ClassAssignment_0 ) )
            // InternalMyDsl.g:2557:2: ( rule__InheritanceStmt__ClassAssignment_0 )
            {
             before(grammarAccess.getInheritanceStmtAccess().getClassAssignment_0()); 
            // InternalMyDsl.g:2558:2: ( rule__InheritanceStmt__ClassAssignment_0 )
            // InternalMyDsl.g:2558:3: rule__InheritanceStmt__ClassAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceStmt__ClassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceStmtAccess().getClassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__Group__0__Impl"


    // $ANTLR start "rule__InheritanceStmt__Group__1"
    // InternalMyDsl.g:2566:1: rule__InheritanceStmt__Group__1 : rule__InheritanceStmt__Group__1__Impl rule__InheritanceStmt__Group__2 ;
    public final void rule__InheritanceStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( rule__InheritanceStmt__Group__1__Impl rule__InheritanceStmt__Group__2 )
            // InternalMyDsl.g:2571:2: rule__InheritanceStmt__Group__1__Impl rule__InheritanceStmt__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__InheritanceStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InheritanceStmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__Group__1"


    // $ANTLR start "rule__InheritanceStmt__Group__1__Impl"
    // InternalMyDsl.g:2578:1: rule__InheritanceStmt__Group__1__Impl : ( ( rule__InheritanceStmt__Alternatives_1 ) ) ;
    public final void rule__InheritanceStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( ( ( rule__InheritanceStmt__Alternatives_1 ) ) )
            // InternalMyDsl.g:2583:1: ( ( rule__InheritanceStmt__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2583:1: ( ( rule__InheritanceStmt__Alternatives_1 ) )
            // InternalMyDsl.g:2584:2: ( rule__InheritanceStmt__Alternatives_1 )
            {
             before(grammarAccess.getInheritanceStmtAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2585:2: ( rule__InheritanceStmt__Alternatives_1 )
            // InternalMyDsl.g:2585:3: rule__InheritanceStmt__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceStmt__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceStmtAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__Group__1__Impl"


    // $ANTLR start "rule__InheritanceStmt__Group__2"
    // InternalMyDsl.g:2593:1: rule__InheritanceStmt__Group__2 : rule__InheritanceStmt__Group__2__Impl ;
    public final void rule__InheritanceStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( rule__InheritanceStmt__Group__2__Impl )
            // InternalMyDsl.g:2598:2: rule__InheritanceStmt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceStmt__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__Group__2"


    // $ANTLR start "rule__InheritanceStmt__Group__2__Impl"
    // InternalMyDsl.g:2604:1: rule__InheritanceStmt__Group__2__Impl : ( ( rule__InheritanceStmt__SuperclassAssignment_2 ) ) ;
    public final void rule__InheritanceStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( ( rule__InheritanceStmt__SuperclassAssignment_2 ) ) )
            // InternalMyDsl.g:2609:1: ( ( rule__InheritanceStmt__SuperclassAssignment_2 ) )
            {
            // InternalMyDsl.g:2609:1: ( ( rule__InheritanceStmt__SuperclassAssignment_2 ) )
            // InternalMyDsl.g:2610:2: ( rule__InheritanceStmt__SuperclassAssignment_2 )
            {
             before(grammarAccess.getInheritanceStmtAccess().getSuperclassAssignment_2()); 
            // InternalMyDsl.g:2611:2: ( rule__InheritanceStmt__SuperclassAssignment_2 )
            // InternalMyDsl.g:2611:3: rule__InheritanceStmt__SuperclassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceStmt__SuperclassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceStmtAccess().getSuperclassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__Group__2__Impl"


    // $ANTLR start "rule__OperationDeclarationStmt__Group__0"
    // InternalMyDsl.g:2620:1: rule__OperationDeclarationStmt__Group__0 : rule__OperationDeclarationStmt__Group__0__Impl rule__OperationDeclarationStmt__Group__1 ;
    public final void rule__OperationDeclarationStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( rule__OperationDeclarationStmt__Group__0__Impl rule__OperationDeclarationStmt__Group__1 )
            // InternalMyDsl.g:2625:2: rule__OperationDeclarationStmt__Group__0__Impl rule__OperationDeclarationStmt__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__OperationDeclarationStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclarationStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclarationStmt__Group__0"


    // $ANTLR start "rule__OperationDeclarationStmt__Group__0__Impl"
    // InternalMyDsl.g:2632:1: rule__OperationDeclarationStmt__Group__0__Impl : ( ( rule__OperationDeclarationStmt__Alternatives_0 ) ) ;
    public final void rule__OperationDeclarationStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( ( rule__OperationDeclarationStmt__Alternatives_0 ) ) )
            // InternalMyDsl.g:2637:1: ( ( rule__OperationDeclarationStmt__Alternatives_0 ) )
            {
            // InternalMyDsl.g:2637:1: ( ( rule__OperationDeclarationStmt__Alternatives_0 ) )
            // InternalMyDsl.g:2638:2: ( rule__OperationDeclarationStmt__Alternatives_0 )
            {
             before(grammarAccess.getOperationDeclarationStmtAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2639:2: ( rule__OperationDeclarationStmt__Alternatives_0 )
            // InternalMyDsl.g:2639:3: rule__OperationDeclarationStmt__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclarationStmt__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationStmtAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclarationStmt__Group__0__Impl"


    // $ANTLR start "rule__OperationDeclarationStmt__Group__1"
    // InternalMyDsl.g:2647:1: rule__OperationDeclarationStmt__Group__1 : rule__OperationDeclarationStmt__Group__1__Impl ;
    public final void rule__OperationDeclarationStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( rule__OperationDeclarationStmt__Group__1__Impl )
            // InternalMyDsl.g:2652:2: rule__OperationDeclarationStmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclarationStmt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclarationStmt__Group__1"


    // $ANTLR start "rule__OperationDeclarationStmt__Group__1__Impl"
    // InternalMyDsl.g:2658:1: rule__OperationDeclarationStmt__Group__1__Impl : ( ruleOperationDeclarionHeaderStmt ) ;
    public final void rule__OperationDeclarationStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( ( ruleOperationDeclarionHeaderStmt ) )
            // InternalMyDsl.g:2663:1: ( ruleOperationDeclarionHeaderStmt )
            {
            // InternalMyDsl.g:2663:1: ( ruleOperationDeclarionHeaderStmt )
            // InternalMyDsl.g:2664:2: ruleOperationDeclarionHeaderStmt
            {
             before(grammarAccess.getOperationDeclarationStmtAccess().getOperationDeclarionHeaderStmtParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclarionHeaderStmt();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationStmtAccess().getOperationDeclarionHeaderStmtParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclarationStmt__Group__1__Impl"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__0"
    // InternalMyDsl.g:2674:1: rule__OperationDefinitionStmt__Group__0 : rule__OperationDefinitionStmt__Group__0__Impl rule__OperationDefinitionStmt__Group__1 ;
    public final void rule__OperationDefinitionStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( rule__OperationDefinitionStmt__Group__0__Impl rule__OperationDefinitionStmt__Group__1 )
            // InternalMyDsl.g:2679:2: rule__OperationDefinitionStmt__Group__0__Impl rule__OperationDefinitionStmt__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__OperationDefinitionStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__0"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__0__Impl"
    // InternalMyDsl.g:2686:1: rule__OperationDefinitionStmt__Group__0__Impl : ( 'if' ) ;
    public final void rule__OperationDefinitionStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( ( 'if' ) )
            // InternalMyDsl.g:2691:1: ( 'if' )
            {
            // InternalMyDsl.g:2691:1: ( 'if' )
            // InternalMyDsl.g:2692:2: 'if'
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionStmtAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__0__Impl"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__1"
    // InternalMyDsl.g:2701:1: rule__OperationDefinitionStmt__Group__1 : rule__OperationDefinitionStmt__Group__1__Impl rule__OperationDefinitionStmt__Group__2 ;
    public final void rule__OperationDefinitionStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( rule__OperationDefinitionStmt__Group__1__Impl rule__OperationDefinitionStmt__Group__2 )
            // InternalMyDsl.g:2706:2: rule__OperationDefinitionStmt__Group__1__Impl rule__OperationDefinitionStmt__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OperationDefinitionStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__1"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__1__Impl"
    // InternalMyDsl.g:2713:1: rule__OperationDefinitionStmt__Group__1__Impl : ( ( rule__OperationDefinitionStmt__HeaderAssignment_1 ) ) ;
    public final void rule__OperationDefinitionStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( ( ( rule__OperationDefinitionStmt__HeaderAssignment_1 ) ) )
            // InternalMyDsl.g:2718:1: ( ( rule__OperationDefinitionStmt__HeaderAssignment_1 ) )
            {
            // InternalMyDsl.g:2718:1: ( ( rule__OperationDefinitionStmt__HeaderAssignment_1 ) )
            // InternalMyDsl.g:2719:2: ( rule__OperationDefinitionStmt__HeaderAssignment_1 )
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getHeaderAssignment_1()); 
            // InternalMyDsl.g:2720:2: ( rule__OperationDefinitionStmt__HeaderAssignment_1 )
            // InternalMyDsl.g:2720:3: rule__OperationDefinitionStmt__HeaderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__HeaderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionStmtAccess().getHeaderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__1__Impl"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__2"
    // InternalMyDsl.g:2728:1: rule__OperationDefinitionStmt__Group__2 : rule__OperationDefinitionStmt__Group__2__Impl rule__OperationDefinitionStmt__Group__3 ;
    public final void rule__OperationDefinitionStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2732:1: ( rule__OperationDefinitionStmt__Group__2__Impl rule__OperationDefinitionStmt__Group__3 )
            // InternalMyDsl.g:2733:2: rule__OperationDefinitionStmt__Group__2__Impl rule__OperationDefinitionStmt__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__OperationDefinitionStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__2"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__2__Impl"
    // InternalMyDsl.g:2740:1: rule__OperationDefinitionStmt__Group__2__Impl : ( ',' ) ;
    public final void rule__OperationDefinitionStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( ( ',' ) )
            // InternalMyDsl.g:2745:1: ( ',' )
            {
            // InternalMyDsl.g:2745:1: ( ',' )
            // InternalMyDsl.g:2746:2: ','
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionStmtAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__2__Impl"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__3"
    // InternalMyDsl.g:2755:1: rule__OperationDefinitionStmt__Group__3 : rule__OperationDefinitionStmt__Group__3__Impl rule__OperationDefinitionStmt__Group__4 ;
    public final void rule__OperationDefinitionStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2759:1: ( rule__OperationDefinitionStmt__Group__3__Impl rule__OperationDefinitionStmt__Group__4 )
            // InternalMyDsl.g:2760:2: rule__OperationDefinitionStmt__Group__3__Impl rule__OperationDefinitionStmt__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__OperationDefinitionStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__3"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__3__Impl"
    // InternalMyDsl.g:2767:1: rule__OperationDefinitionStmt__Group__3__Impl : ( 'then' ) ;
    public final void rule__OperationDefinitionStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( ( 'then' ) )
            // InternalMyDsl.g:2772:1: ( 'then' )
            {
            // InternalMyDsl.g:2772:1: ( 'then' )
            // InternalMyDsl.g:2773:2: 'then'
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getThenKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionStmtAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__3__Impl"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__4"
    // InternalMyDsl.g:2782:1: rule__OperationDefinitionStmt__Group__4 : rule__OperationDefinitionStmt__Group__4__Impl ;
    public final void rule__OperationDefinitionStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( rule__OperationDefinitionStmt__Group__4__Impl )
            // InternalMyDsl.g:2787:2: rule__OperationDefinitionStmt__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__4"


    // $ANTLR start "rule__OperationDefinitionStmt__Group__4__Impl"
    // InternalMyDsl.g:2793:1: rule__OperationDefinitionStmt__Group__4__Impl : ( ( rule__OperationDefinitionStmt__BodyAssignment_4 ) ) ;
    public final void rule__OperationDefinitionStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( ( ( rule__OperationDefinitionStmt__BodyAssignment_4 ) ) )
            // InternalMyDsl.g:2798:1: ( ( rule__OperationDefinitionStmt__BodyAssignment_4 ) )
            {
            // InternalMyDsl.g:2798:1: ( ( rule__OperationDefinitionStmt__BodyAssignment_4 ) )
            // InternalMyDsl.g:2799:2: ( rule__OperationDefinitionStmt__BodyAssignment_4 )
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getBodyAssignment_4()); 
            // InternalMyDsl.g:2800:2: ( rule__OperationDefinitionStmt__BodyAssignment_4 )
            // InternalMyDsl.g:2800:3: rule__OperationDefinitionStmt__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionStmt__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionStmtAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__Group__4__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group__0"
    // InternalMyDsl.g:2809:1: rule__OperationDefinitionBodyStmts__Group__0 : rule__OperationDefinitionBodyStmts__Group__0__Impl rule__OperationDefinitionBodyStmts__Group__1 ;
    public final void rule__OperationDefinitionBodyStmts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( rule__OperationDefinitionBodyStmts__Group__0__Impl rule__OperationDefinitionBodyStmts__Group__1 )
            // InternalMyDsl.g:2814:2: rule__OperationDefinitionBodyStmts__Group__0__Impl rule__OperationDefinitionBodyStmts__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OperationDefinitionBodyStmts__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmts__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group__0"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group__0__Impl"
    // InternalMyDsl.g:2821:1: rule__OperationDefinitionBodyStmts__Group__0__Impl : ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_0 ) ) ;
    public final void rule__OperationDefinitionBodyStmts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_0 ) ) )
            // InternalMyDsl.g:2826:1: ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_0 ) )
            {
            // InternalMyDsl.g:2826:1: ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_0 ) )
            // InternalMyDsl.g:2827:2: ( rule__OperationDefinitionBodyStmts__StmtsAssignment_0 )
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsAssignment_0()); 
            // InternalMyDsl.g:2828:2: ( rule__OperationDefinitionBodyStmts__StmtsAssignment_0 )
            // InternalMyDsl.g:2828:3: rule__OperationDefinitionBodyStmts__StmtsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmts__StmtsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group__0__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group__1"
    // InternalMyDsl.g:2836:1: rule__OperationDefinitionBodyStmts__Group__1 : rule__OperationDefinitionBodyStmts__Group__1__Impl ;
    public final void rule__OperationDefinitionBodyStmts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2840:1: ( rule__OperationDefinitionBodyStmts__Group__1__Impl )
            // InternalMyDsl.g:2841:2: rule__OperationDefinitionBodyStmts__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmts__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group__1"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group__1__Impl"
    // InternalMyDsl.g:2847:1: rule__OperationDefinitionBodyStmts__Group__1__Impl : ( ( rule__OperationDefinitionBodyStmts__Group_1__0 )* ) ;
    public final void rule__OperationDefinitionBodyStmts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( ( ( rule__OperationDefinitionBodyStmts__Group_1__0 )* ) )
            // InternalMyDsl.g:2852:1: ( ( rule__OperationDefinitionBodyStmts__Group_1__0 )* )
            {
            // InternalMyDsl.g:2852:1: ( ( rule__OperationDefinitionBodyStmts__Group_1__0 )* )
            // InternalMyDsl.g:2853:2: ( rule__OperationDefinitionBodyStmts__Group_1__0 )*
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsAccess().getGroup_1()); 
            // InternalMyDsl.g:2854:2: ( rule__OperationDefinitionBodyStmts__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:2854:3: rule__OperationDefinitionBodyStmts__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__OperationDefinitionBodyStmts__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getOperationDefinitionBodyStmtsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group__1__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group_1__0"
    // InternalMyDsl.g:2863:1: rule__OperationDefinitionBodyStmts__Group_1__0 : rule__OperationDefinitionBodyStmts__Group_1__0__Impl rule__OperationDefinitionBodyStmts__Group_1__1 ;
    public final void rule__OperationDefinitionBodyStmts__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( rule__OperationDefinitionBodyStmts__Group_1__0__Impl rule__OperationDefinitionBodyStmts__Group_1__1 )
            // InternalMyDsl.g:2868:2: rule__OperationDefinitionBodyStmts__Group_1__0__Impl rule__OperationDefinitionBodyStmts__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__OperationDefinitionBodyStmts__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmts__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group_1__0"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group_1__0__Impl"
    // InternalMyDsl.g:2875:1: rule__OperationDefinitionBodyStmts__Group_1__0__Impl : ( ',' ) ;
    public final void rule__OperationDefinitionBodyStmts__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( ( ',' ) )
            // InternalMyDsl.g:2880:1: ( ',' )
            {
            // InternalMyDsl.g:2880:1: ( ',' )
            // InternalMyDsl.g:2881:2: ','
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsAccess().getCommaKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyStmtsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group_1__0__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group_1__1"
    // InternalMyDsl.g:2890:1: rule__OperationDefinitionBodyStmts__Group_1__1 : rule__OperationDefinitionBodyStmts__Group_1__1__Impl ;
    public final void rule__OperationDefinitionBodyStmts__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2894:1: ( rule__OperationDefinitionBodyStmts__Group_1__1__Impl )
            // InternalMyDsl.g:2895:2: rule__OperationDefinitionBodyStmts__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmts__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group_1__1"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__Group_1__1__Impl"
    // InternalMyDsl.g:2901:1: rule__OperationDefinitionBodyStmts__Group_1__1__Impl : ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1 ) ) ;
    public final void rule__OperationDefinitionBodyStmts__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1 ) ) )
            // InternalMyDsl.g:2906:1: ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2906:1: ( ( rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1 ) )
            // InternalMyDsl.g:2907:2: ( rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1 )
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsAssignment_1_1()); 
            // InternalMyDsl.g:2908:2: ( rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1 )
            // InternalMyDsl.g:2908:3: rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__Group_1__1__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0"
    // InternalMyDsl.g:2917:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0 : rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1 ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2921:1: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1 )
            // InternalMyDsl.g:2922:2: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl"
    // InternalMyDsl.g:2929:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl : ( 'there_is_one' ) ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( ( 'there_is_one' ) )
            // InternalMyDsl.g:2934:1: ( 'there_is_one' )
            {
            // InternalMyDsl.g:2934:1: ( 'there_is_one' )
            // InternalMyDsl.g:2935:2: 'there_is_one'
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getThere_is_oneKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getThere_is_oneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__0__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1"
    // InternalMyDsl.g:2944:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1 : rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2 ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2 )
            // InternalMyDsl.g:2949:2: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl"
    // InternalMyDsl.g:2956:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl : ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1 ) ) ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:2961:1: ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2961:1: ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1 ) )
            // InternalMyDsl.g:2962:2: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1 )
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:2963:2: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1 )
            // InternalMyDsl.g:2963:3: rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__1__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2"
    // InternalMyDsl.g:2971:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2 : rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2975:1: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl )
            // InternalMyDsl.g:2976:2: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl"
    // InternalMyDsl.g:2982:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl : ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2 ) ) ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2987:1: ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2987:1: ( ( rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2 ) )
            // InternalMyDsl.g:2988:2: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2 )
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2989:2: ( rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2 )
            // InternalMyDsl.g:2989:3: rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__Group__2__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__0"
    // InternalMyDsl.g:2998:1: rule__OperationDefinitionBodyConditionalStmt__Group__0 : rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl rule__OperationDefinitionBodyConditionalStmt__Group__1 ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3002:1: ( rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl rule__OperationDefinitionBodyConditionalStmt__Group__1 )
            // InternalMyDsl.g:3003:2: rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl rule__OperationDefinitionBodyConditionalStmt__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__0"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl"
    // InternalMyDsl.g:3010:1: rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl : ( 'if' ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( ( 'if' ) )
            // InternalMyDsl.g:3015:1: ( 'if' )
            {
            // InternalMyDsl.g:3015:1: ( 'if' )
            // InternalMyDsl.g:3016:2: 'if'
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__0__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__1"
    // InternalMyDsl.g:3025:1: rule__OperationDefinitionBodyConditionalStmt__Group__1 : rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl rule__OperationDefinitionBodyConditionalStmt__Group__2 ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3029:1: ( rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl rule__OperationDefinitionBodyConditionalStmt__Group__2 )
            // InternalMyDsl.g:3030:2: rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl rule__OperationDefinitionBodyConditionalStmt__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__1"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl"
    // InternalMyDsl.g:3037:1: rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl : ( ( rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1 ) ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( ( ( rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1 ) ) )
            // InternalMyDsl.g:3042:1: ( ( rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1 ) )
            {
            // InternalMyDsl.g:3042:1: ( ( rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1 ) )
            // InternalMyDsl.g:3043:2: ( rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1 )
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getConditionAssignment_1()); 
            // InternalMyDsl.g:3044:2: ( rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1 )
            // InternalMyDsl.g:3044:3: rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__1__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__2"
    // InternalMyDsl.g:3052:1: rule__OperationDefinitionBodyConditionalStmt__Group__2 : rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl rule__OperationDefinitionBodyConditionalStmt__Group__3 ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3056:1: ( rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl rule__OperationDefinitionBodyConditionalStmt__Group__3 )
            // InternalMyDsl.g:3057:2: rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl rule__OperationDefinitionBodyConditionalStmt__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__2"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl"
    // InternalMyDsl.g:3064:1: rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl : ( ',' ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( ( ',' ) )
            // InternalMyDsl.g:3069:1: ( ',' )
            {
            // InternalMyDsl.g:3069:1: ( ',' )
            // InternalMyDsl.g:3070:2: ','
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__2__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__3"
    // InternalMyDsl.g:3079:1: rule__OperationDefinitionBodyConditionalStmt__Group__3 : rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl rule__OperationDefinitionBodyConditionalStmt__Group__4 ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3083:1: ( rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl rule__OperationDefinitionBodyConditionalStmt__Group__4 )
            // InternalMyDsl.g:3084:2: rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl rule__OperationDefinitionBodyConditionalStmt__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__3"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl"
    // InternalMyDsl.g:3091:1: rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl : ( 'then' ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( ( 'then' ) )
            // InternalMyDsl.g:3096:1: ( 'then' )
            {
            // InternalMyDsl.g:3096:1: ( 'then' )
            // InternalMyDsl.g:3097:2: 'then'
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__3__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__4"
    // InternalMyDsl.g:3106:1: rule__OperationDefinitionBodyConditionalStmt__Group__4 : rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl rule__OperationDefinitionBodyConditionalStmt__Group__5 ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3110:1: ( rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl rule__OperationDefinitionBodyConditionalStmt__Group__5 )
            // InternalMyDsl.g:3111:2: rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl rule__OperationDefinitionBodyConditionalStmt__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__4"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl"
    // InternalMyDsl.g:3118:1: rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl : ( ( rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4 ) ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3122:1: ( ( ( rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4 ) ) )
            // InternalMyDsl.g:3123:1: ( ( rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4 ) )
            {
            // InternalMyDsl.g:3123:1: ( ( rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4 ) )
            // InternalMyDsl.g:3124:2: ( rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4 )
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenBodyAssignment_4()); 
            // InternalMyDsl.g:3125:2: ( rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4 )
            // InternalMyDsl.g:3125:3: rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__4__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__5"
    // InternalMyDsl.g:3133:1: rule__OperationDefinitionBodyConditionalStmt__Group__5 : rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl )
            // InternalMyDsl.g:3138:2: rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__5"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl"
    // InternalMyDsl.g:3144:1: rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl : ( ( rule__OperationDefinitionBodyConditionalStmt__Group_5__0 )? ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3148:1: ( ( ( rule__OperationDefinitionBodyConditionalStmt__Group_5__0 )? ) )
            // InternalMyDsl.g:3149:1: ( ( rule__OperationDefinitionBodyConditionalStmt__Group_5__0 )? )
            {
            // InternalMyDsl.g:3149:1: ( ( rule__OperationDefinitionBodyConditionalStmt__Group_5__0 )? )
            // InternalMyDsl.g:3150:2: ( rule__OperationDefinitionBodyConditionalStmt__Group_5__0 )?
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getGroup_5()); 
            // InternalMyDsl.g:3151:2: ( rule__OperationDefinitionBodyConditionalStmt__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3151:3: rule__OperationDefinitionBodyConditionalStmt__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDefinitionBodyConditionalStmt__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group__5__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group_5__0"
    // InternalMyDsl.g:3160:1: rule__OperationDefinitionBodyConditionalStmt__Group_5__0 : rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl rule__OperationDefinitionBodyConditionalStmt__Group_5__1 ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3164:1: ( rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl rule__OperationDefinitionBodyConditionalStmt__Group_5__1 )
            // InternalMyDsl.g:3165:2: rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl rule__OperationDefinitionBodyConditionalStmt__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group_5__0"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl"
    // InternalMyDsl.g:3172:1: rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl : ( ';' ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( ( ';' ) )
            // InternalMyDsl.g:3177:1: ( ';' )
            {
            // InternalMyDsl.g:3177:1: ( ';' )
            // InternalMyDsl.g:3178:2: ';'
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getSemicolonKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getSemicolonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group_5__0__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group_5__1"
    // InternalMyDsl.g:3187:1: rule__OperationDefinitionBodyConditionalStmt__Group_5__1 : rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl rule__OperationDefinitionBodyConditionalStmt__Group_5__2 ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl rule__OperationDefinitionBodyConditionalStmt__Group_5__2 )
            // InternalMyDsl.g:3192:2: rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl rule__OperationDefinitionBodyConditionalStmt__Group_5__2
            {
            pushFollow(FOLLOW_21);
            rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group_5__1"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl"
    // InternalMyDsl.g:3199:1: rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl : ( 'else' ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3203:1: ( ( 'else' ) )
            // InternalMyDsl.g:3204:1: ( 'else' )
            {
            // InternalMyDsl.g:3204:1: ( 'else' )
            // InternalMyDsl.g:3205:2: 'else'
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseKeyword_5_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group_5__1__Impl"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group_5__2"
    // InternalMyDsl.g:3214:1: rule__OperationDefinitionBodyConditionalStmt__Group_5__2 : rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3218:1: ( rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl )
            // InternalMyDsl.g:3219:2: rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group_5__2"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl"
    // InternalMyDsl.g:3225:1: rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl : ( ( rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2 ) ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3229:1: ( ( ( rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2 ) ) )
            // InternalMyDsl.g:3230:1: ( ( rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2 ) )
            {
            // InternalMyDsl.g:3230:1: ( ( rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2 ) )
            // InternalMyDsl.g:3231:2: ( rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2 )
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseBodyAssignment_5_2()); 
            // InternalMyDsl.g:3232:2: ( rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2 )
            // InternalMyDsl.g:3232:3: rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseBodyAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__Group_5__2__Impl"


    // $ANTLR start "rule__OperationParameterVariableDeclarationPhrase__Group__0"
    // InternalMyDsl.g:3241:1: rule__OperationParameterVariableDeclarationPhrase__Group__0 : rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl rule__OperationParameterVariableDeclarationPhrase__Group__1 ;
    public final void rule__OperationParameterVariableDeclarationPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3245:1: ( rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl rule__OperationParameterVariableDeclarationPhrase__Group__1 )
            // InternalMyDsl.g:3246:2: rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl rule__OperationParameterVariableDeclarationPhrase__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationParameterVariableDeclarationPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterVariableDeclarationPhrase__Group__0"


    // $ANTLR start "rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl"
    // InternalMyDsl.g:3253:1: rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl : ( ( rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0 ) ) ;
    public final void rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3257:1: ( ( ( rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:3258:1: ( ( rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:3258:1: ( ( rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0 ) )
            // InternalMyDsl.g:3259:2: ( rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0 )
            {
             before(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:3260:2: ( rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0 )
            // InternalMyDsl.g:3260:3: rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterVariableDeclarationPhrase__Group__0__Impl"


    // $ANTLR start "rule__OperationParameterVariableDeclarationPhrase__Group__1"
    // InternalMyDsl.g:3268:1: rule__OperationParameterVariableDeclarationPhrase__Group__1 : rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl ;
    public final void rule__OperationParameterVariableDeclarationPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3272:1: ( rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl )
            // InternalMyDsl.g:3273:2: rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterVariableDeclarationPhrase__Group__1"


    // $ANTLR start "rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl"
    // InternalMyDsl.g:3279:1: rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl : ( ( rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1 ) ) ;
    public final void rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3283:1: ( ( ( rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3284:1: ( ( rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3284:1: ( ( rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1 ) )
            // InternalMyDsl.g:3285:2: ( rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1 )
            {
             before(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3286:2: ( rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1 )
            // InternalMyDsl.g:3286:3: rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterVariableDeclarationPhrase__Group__1__Impl"


    // $ANTLR start "rule__InstanceRefPhrase__Group_1__0"
    // InternalMyDsl.g:3295:1: rule__InstanceRefPhrase__Group_1__0 : rule__InstanceRefPhrase__Group_1__0__Impl rule__InstanceRefPhrase__Group_1__1 ;
    public final void rule__InstanceRefPhrase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3299:1: ( rule__InstanceRefPhrase__Group_1__0__Impl rule__InstanceRefPhrase__Group_1__1 )
            // InternalMyDsl.g:3300:2: rule__InstanceRefPhrase__Group_1__0__Impl rule__InstanceRefPhrase__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__InstanceRefPhrase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceRefPhrase__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__Group_1__0"


    // $ANTLR start "rule__InstanceRefPhrase__Group_1__0__Impl"
    // InternalMyDsl.g:3307:1: rule__InstanceRefPhrase__Group_1__0__Impl : ( 'the' ) ;
    public final void rule__InstanceRefPhrase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( ( 'the' ) )
            // InternalMyDsl.g:3312:1: ( 'the' )
            {
            // InternalMyDsl.g:3312:1: ( 'the' )
            // InternalMyDsl.g:3313:2: 'the'
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getTheKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInstanceRefPhraseAccess().getTheKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__Group_1__0__Impl"


    // $ANTLR start "rule__InstanceRefPhrase__Group_1__1"
    // InternalMyDsl.g:3322:1: rule__InstanceRefPhrase__Group_1__1 : rule__InstanceRefPhrase__Group_1__1__Impl rule__InstanceRefPhrase__Group_1__2 ;
    public final void rule__InstanceRefPhrase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( rule__InstanceRefPhrase__Group_1__1__Impl rule__InstanceRefPhrase__Group_1__2 )
            // InternalMyDsl.g:3327:2: rule__InstanceRefPhrase__Group_1__1__Impl rule__InstanceRefPhrase__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__InstanceRefPhrase__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceRefPhrase__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__Group_1__1"


    // $ANTLR start "rule__InstanceRefPhrase__Group_1__1__Impl"
    // InternalMyDsl.g:3334:1: rule__InstanceRefPhrase__Group_1__1__Impl : ( ( rule__InstanceRefPhrase__ClassAssignment_1_1 ) ) ;
    public final void rule__InstanceRefPhrase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3338:1: ( ( ( rule__InstanceRefPhrase__ClassAssignment_1_1 ) ) )
            // InternalMyDsl.g:3339:1: ( ( rule__InstanceRefPhrase__ClassAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3339:1: ( ( rule__InstanceRefPhrase__ClassAssignment_1_1 ) )
            // InternalMyDsl.g:3340:2: ( rule__InstanceRefPhrase__ClassAssignment_1_1 )
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getClassAssignment_1_1()); 
            // InternalMyDsl.g:3341:2: ( rule__InstanceRefPhrase__ClassAssignment_1_1 )
            // InternalMyDsl.g:3341:3: rule__InstanceRefPhrase__ClassAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceRefPhrase__ClassAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceRefPhraseAccess().getClassAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__Group_1__1__Impl"


    // $ANTLR start "rule__InstanceRefPhrase__Group_1__2"
    // InternalMyDsl.g:3349:1: rule__InstanceRefPhrase__Group_1__2 : rule__InstanceRefPhrase__Group_1__2__Impl ;
    public final void rule__InstanceRefPhrase__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3353:1: ( rule__InstanceRefPhrase__Group_1__2__Impl )
            // InternalMyDsl.g:3354:2: rule__InstanceRefPhrase__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceRefPhrase__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__Group_1__2"


    // $ANTLR start "rule__InstanceRefPhrase__Group_1__2__Impl"
    // InternalMyDsl.g:3360:1: rule__InstanceRefPhrase__Group_1__2__Impl : ( ( rule__InstanceRefPhrase__FAssignment_1_2 )? ) ;
    public final void rule__InstanceRefPhrase__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3364:1: ( ( ( rule__InstanceRefPhrase__FAssignment_1_2 )? ) )
            // InternalMyDsl.g:3365:1: ( ( rule__InstanceRefPhrase__FAssignment_1_2 )? )
            {
            // InternalMyDsl.g:3365:1: ( ( rule__InstanceRefPhrase__FAssignment_1_2 )? )
            // InternalMyDsl.g:3366:2: ( rule__InstanceRefPhrase__FAssignment_1_2 )?
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getFAssignment_1_2()); 
            // InternalMyDsl.g:3367:2: ( rule__InstanceRefPhrase__FAssignment_1_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_STRING||LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3367:3: rule__InstanceRefPhrase__FAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceRefPhrase__FAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceRefPhraseAccess().getFAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__Group_1__2__Impl"


    // $ANTLR start "rule__InstanceIndirectRefPhrase__Group__0"
    // InternalMyDsl.g:3376:1: rule__InstanceIndirectRefPhrase__Group__0 : rule__InstanceIndirectRefPhrase__Group__0__Impl rule__InstanceIndirectRefPhrase__Group__1 ;
    public final void rule__InstanceIndirectRefPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3380:1: ( rule__InstanceIndirectRefPhrase__Group__0__Impl rule__InstanceIndirectRefPhrase__Group__1 )
            // InternalMyDsl.g:3381:2: rule__InstanceIndirectRefPhrase__Group__0__Impl rule__InstanceIndirectRefPhrase__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__InstanceIndirectRefPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceIndirectRefPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceIndirectRefPhrase__Group__0"


    // $ANTLR start "rule__InstanceIndirectRefPhrase__Group__0__Impl"
    // InternalMyDsl.g:3388:1: rule__InstanceIndirectRefPhrase__Group__0__Impl : ( 'in' ) ;
    public final void rule__InstanceIndirectRefPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3392:1: ( ( 'in' ) )
            // InternalMyDsl.g:3393:1: ( 'in' )
            {
            // InternalMyDsl.g:3393:1: ( 'in' )
            // InternalMyDsl.g:3394:2: 'in'
            {
             before(grammarAccess.getInstanceIndirectRefPhraseAccess().getInKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInstanceIndirectRefPhraseAccess().getInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceIndirectRefPhrase__Group__0__Impl"


    // $ANTLR start "rule__InstanceIndirectRefPhrase__Group__1"
    // InternalMyDsl.g:3403:1: rule__InstanceIndirectRefPhrase__Group__1 : rule__InstanceIndirectRefPhrase__Group__1__Impl ;
    public final void rule__InstanceIndirectRefPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3407:1: ( rule__InstanceIndirectRefPhrase__Group__1__Impl )
            // InternalMyDsl.g:3408:2: rule__InstanceIndirectRefPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceIndirectRefPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceIndirectRefPhrase__Group__1"


    // $ANTLR start "rule__InstanceIndirectRefPhrase__Group__1__Impl"
    // InternalMyDsl.g:3414:1: rule__InstanceIndirectRefPhrase__Group__1__Impl : ( ( rule__InstanceIndirectRefPhrase__ParentAssignment_1 ) ) ;
    public final void rule__InstanceIndirectRefPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3418:1: ( ( ( rule__InstanceIndirectRefPhrase__ParentAssignment_1 ) ) )
            // InternalMyDsl.g:3419:1: ( ( rule__InstanceIndirectRefPhrase__ParentAssignment_1 ) )
            {
            // InternalMyDsl.g:3419:1: ( ( rule__InstanceIndirectRefPhrase__ParentAssignment_1 ) )
            // InternalMyDsl.g:3420:2: ( rule__InstanceIndirectRefPhrase__ParentAssignment_1 )
            {
             before(grammarAccess.getInstanceIndirectRefPhraseAccess().getParentAssignment_1()); 
            // InternalMyDsl.g:3421:2: ( rule__InstanceIndirectRefPhrase__ParentAssignment_1 )
            // InternalMyDsl.g:3421:3: rule__InstanceIndirectRefPhrase__ParentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceIndirectRefPhrase__ParentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceIndirectRefPhraseAccess().getParentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceIndirectRefPhrase__Group__1__Impl"


    // $ANTLR start "rule__InstanceBuiltinValueIntegerPhrase__Group__0"
    // InternalMyDsl.g:3430:1: rule__InstanceBuiltinValueIntegerPhrase__Group__0 : rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl rule__InstanceBuiltinValueIntegerPhrase__Group__1 ;
    public final void rule__InstanceBuiltinValueIntegerPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3434:1: ( rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl rule__InstanceBuiltinValueIntegerPhrase__Group__1 )
            // InternalMyDsl.g:3435:2: rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl rule__InstanceBuiltinValueIntegerPhrase__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueIntegerPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueIntegerPhrase__Group__0"


    // $ANTLR start "rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl"
    // InternalMyDsl.g:3442:1: rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl : ( () ) ;
    public final void rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3446:1: ( ( () ) )
            // InternalMyDsl.g:3447:1: ( () )
            {
            // InternalMyDsl.g:3447:1: ( () )
            // InternalMyDsl.g:3448:2: ()
            {
             before(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getInstanceBuiltinValueIntegerPhraseAction_0()); 
            // InternalMyDsl.g:3449:2: ()
            // InternalMyDsl.g:3449:3: 
            {
            }

             after(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getInstanceBuiltinValueIntegerPhraseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueIntegerPhrase__Group__0__Impl"


    // $ANTLR start "rule__InstanceBuiltinValueIntegerPhrase__Group__1"
    // InternalMyDsl.g:3457:1: rule__InstanceBuiltinValueIntegerPhrase__Group__1 : rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl ;
    public final void rule__InstanceBuiltinValueIntegerPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3461:1: ( rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl )
            // InternalMyDsl.g:3462:2: rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueIntegerPhrase__Group__1"


    // $ANTLR start "rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl"
    // InternalMyDsl.g:3468:1: rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl : ( ( rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1 ) ) ;
    public final void rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3472:1: ( ( ( rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1 ) ) )
            // InternalMyDsl.g:3473:1: ( ( rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1 ) )
            {
            // InternalMyDsl.g:3473:1: ( ( rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1 ) )
            // InternalMyDsl.g:3474:2: ( rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1 )
            {
             before(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getVAssignment_1()); 
            // InternalMyDsl.g:3475:2: ( rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1 )
            // InternalMyDsl.g:3475:3: rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getVAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueIntegerPhrase__Group__1__Impl"


    // $ANTLR start "rule__InstanceBuiltinValueStringPhrase__Group__0"
    // InternalMyDsl.g:3484:1: rule__InstanceBuiltinValueStringPhrase__Group__0 : rule__InstanceBuiltinValueStringPhrase__Group__0__Impl rule__InstanceBuiltinValueStringPhrase__Group__1 ;
    public final void rule__InstanceBuiltinValueStringPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3488:1: ( rule__InstanceBuiltinValueStringPhrase__Group__0__Impl rule__InstanceBuiltinValueStringPhrase__Group__1 )
            // InternalMyDsl.g:3489:2: rule__InstanceBuiltinValueStringPhrase__Group__0__Impl rule__InstanceBuiltinValueStringPhrase__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__InstanceBuiltinValueStringPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueStringPhrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueStringPhrase__Group__0"


    // $ANTLR start "rule__InstanceBuiltinValueStringPhrase__Group__0__Impl"
    // InternalMyDsl.g:3496:1: rule__InstanceBuiltinValueStringPhrase__Group__0__Impl : ( () ) ;
    public final void rule__InstanceBuiltinValueStringPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3500:1: ( ( () ) )
            // InternalMyDsl.g:3501:1: ( () )
            {
            // InternalMyDsl.g:3501:1: ( () )
            // InternalMyDsl.g:3502:2: ()
            {
             before(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getInstanceBuiltinValueStringPhraseAction_0()); 
            // InternalMyDsl.g:3503:2: ()
            // InternalMyDsl.g:3503:3: 
            {
            }

             after(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getInstanceBuiltinValueStringPhraseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueStringPhrase__Group__0__Impl"


    // $ANTLR start "rule__InstanceBuiltinValueStringPhrase__Group__1"
    // InternalMyDsl.g:3511:1: rule__InstanceBuiltinValueStringPhrase__Group__1 : rule__InstanceBuiltinValueStringPhrase__Group__1__Impl ;
    public final void rule__InstanceBuiltinValueStringPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3515:1: ( rule__InstanceBuiltinValueStringPhrase__Group__1__Impl )
            // InternalMyDsl.g:3516:2: rule__InstanceBuiltinValueStringPhrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueStringPhrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueStringPhrase__Group__1"


    // $ANTLR start "rule__InstanceBuiltinValueStringPhrase__Group__1__Impl"
    // InternalMyDsl.g:3522:1: rule__InstanceBuiltinValueStringPhrase__Group__1__Impl : ( ( rule__InstanceBuiltinValueStringPhrase__VAssignment_1 ) ) ;
    public final void rule__InstanceBuiltinValueStringPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3526:1: ( ( ( rule__InstanceBuiltinValueStringPhrase__VAssignment_1 ) ) )
            // InternalMyDsl.g:3527:1: ( ( rule__InstanceBuiltinValueStringPhrase__VAssignment_1 ) )
            {
            // InternalMyDsl.g:3527:1: ( ( rule__InstanceBuiltinValueStringPhrase__VAssignment_1 ) )
            // InternalMyDsl.g:3528:2: ( rule__InstanceBuiltinValueStringPhrase__VAssignment_1 )
            {
             before(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getVAssignment_1()); 
            // InternalMyDsl.g:3529:2: ( rule__InstanceBuiltinValueStringPhrase__VAssignment_1 )
            // InternalMyDsl.g:3529:3: rule__InstanceBuiltinValueStringPhrase__VAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBuiltinValueStringPhrase__VAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getVAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueStringPhrase__Group__1__Impl"


    // $ANTLR start "rule__Model__StmtAssignment"
    // InternalMyDsl.g:3538:1: rule__Model__StmtAssignment : ( ruleStmt ) ;
    public final void rule__Model__StmtAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3542:1: ( ( ruleStmt ) )
            // InternalMyDsl.g:3543:2: ( ruleStmt )
            {
            // InternalMyDsl.g:3543:2: ( ruleStmt )
            // InternalMyDsl.g:3544:3: ruleStmt
            {
             before(grammarAccess.getModelAccess().getStmtStmtParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStmt();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStmtStmtParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StmtAssignment"


    // $ANTLR start "rule__ExistenceDefiniteStmt__DefiniteAssignment_1"
    // InternalMyDsl.g:3553:1: rule__ExistenceDefiniteStmt__DefiniteAssignment_1 : ( ruleExistenceDefinitePhrase ) ;
    public final void rule__ExistenceDefiniteStmt__DefiniteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3557:1: ( ( ruleExistenceDefinitePhrase ) )
            // InternalMyDsl.g:3558:2: ( ruleExistenceDefinitePhrase )
            {
            // InternalMyDsl.g:3558:2: ( ruleExistenceDefinitePhrase )
            // InternalMyDsl.g:3559:3: ruleExistenceDefinitePhrase
            {
             before(grammarAccess.getExistenceDefiniteStmtAccess().getDefiniteExistenceDefinitePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceDefinitePhrase();

            state._fsp--;

             after(grammarAccess.getExistenceDefiniteStmtAccess().getDefiniteExistenceDefinitePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteStmt__DefiniteAssignment_1"


    // $ANTLR start "rule__ExistenceDefinitePhrase__NameAssignment"
    // InternalMyDsl.g:3568:1: rule__ExistenceDefinitePhrase__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExistenceDefinitePhrase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3573:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3573:2: ( RULE_ID )
            // InternalMyDsl.g:3574:3: RULE_ID
            {
             before(grammarAccess.getExistenceDefinitePhraseAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExistenceDefinitePhraseAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefinitePhrase__NameAssignment"


    // $ANTLR start "rule__ExistenceDefiniteRefPhrase__RefAssignment_1"
    // InternalMyDsl.g:3583:1: rule__ExistenceDefiniteRefPhrase__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExistenceDefiniteRefPhrase__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3588:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3588:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3589:3: ( RULE_ID )
            {
             before(grammarAccess.getExistenceDefiniteRefPhraseAccess().getRefExistenceDefinitePhraseCrossReference_1_0()); 
            // InternalMyDsl.g:3590:3: ( RULE_ID )
            // InternalMyDsl.g:3591:4: RULE_ID
            {
             before(grammarAccess.getExistenceDefiniteRefPhraseAccess().getRefExistenceDefinitePhraseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExistenceDefiniteRefPhraseAccess().getRefExistenceDefinitePhraseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExistenceDefiniteRefPhraseAccess().getRefExistenceDefinitePhraseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefPhrase__RefAssignment_1"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0"
    // InternalMyDsl.g:3602:1: rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0 : ( ruleExistenceDefiniteRefPhrase ) ;
    public final void rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3606:1: ( ( ruleExistenceDefiniteRefPhrase ) )
            // InternalMyDsl.g:3607:2: ( ruleExistenceDefiniteRefPhrase )
            {
            // InternalMyDsl.g:3607:2: ( ruleExistenceDefiniteRefPhrase )
            // InternalMyDsl.g:3608:3: ruleExistenceDefiniteRefPhrase
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsExistenceDefiniteRefPhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceDefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsExistenceDefiniteRefPhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_0"


    // $ANTLR start "rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2"
    // InternalMyDsl.g:3617:1: rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2 : ( ruleExistenceDefiniteRefPhrase ) ;
    public final void rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3621:1: ( ( ruleExistenceDefiniteRefPhrase ) )
            // InternalMyDsl.g:3622:2: ( ruleExistenceDefiniteRefPhrase )
            {
            // InternalMyDsl.g:3622:2: ( ruleExistenceDefiniteRefPhrase )
            // InternalMyDsl.g:3623:3: ruleExistenceDefiniteRefPhrase
            {
             before(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsExistenceDefiniteRefPhraseParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceDefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceDefiniteRefListPhraseAccess().getElementsExistenceDefiniteRefPhraseParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceDefiniteRefListPhrase__ElementsAssignment_1_2"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__PluralAssignment_1"
    // InternalMyDsl.g:3632:1: rule__ExistenceIndefiniteStmt__PluralAssignment_1 : ( ruleExistencePluralIndefinitePhrase ) ;
    public final void rule__ExistenceIndefiniteStmt__PluralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3636:1: ( ( ruleExistencePluralIndefinitePhrase ) )
            // InternalMyDsl.g:3637:2: ( ruleExistencePluralIndefinitePhrase )
            {
            // InternalMyDsl.g:3637:2: ( ruleExistencePluralIndefinitePhrase )
            // InternalMyDsl.g:3638:3: ruleExistencePluralIndefinitePhrase
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getPluralExistencePluralIndefinitePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExistencePluralIndefinitePhrase();

            state._fsp--;

             after(grammarAccess.getExistenceIndefiniteStmtAccess().getPluralExistencePluralIndefinitePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__PluralAssignment_1"


    // $ANTLR start "rule__ExistenceIndefiniteStmt__SingularAssignment_3"
    // InternalMyDsl.g:3647:1: rule__ExistenceIndefiniteStmt__SingularAssignment_3 : ( ruleExistenceSingularIndefinitePhrase ) ;
    public final void rule__ExistenceIndefiniteStmt__SingularAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3651:1: ( ( ruleExistenceSingularIndefinitePhrase ) )
            // InternalMyDsl.g:3652:2: ( ruleExistenceSingularIndefinitePhrase )
            {
            // InternalMyDsl.g:3652:2: ( ruleExistenceSingularIndefinitePhrase )
            // InternalMyDsl.g:3653:3: ruleExistenceSingularIndefinitePhrase
            {
             before(grammarAccess.getExistenceIndefiniteStmtAccess().getSingularExistenceSingularIndefinitePhraseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceSingularIndefinitePhrase();

            state._fsp--;

             after(grammarAccess.getExistenceIndefiniteStmtAccess().getSingularExistenceSingularIndefinitePhraseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceIndefiniteStmt__SingularAssignment_3"


    // $ANTLR start "rule__ExistenceSingularIndefinitePhrase__NameAssignment"
    // InternalMyDsl.g:3662:1: rule__ExistenceSingularIndefinitePhrase__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExistenceSingularIndefinitePhrase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3666:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3667:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3667:2: ( RULE_ID )
            // InternalMyDsl.g:3668:3: RULE_ID
            {
             before(grammarAccess.getExistenceSingularIndefinitePhraseAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExistenceSingularIndefinitePhraseAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefinitePhrase__NameAssignment"


    // $ANTLR start "rule__ExistencePluralIndefinitePhrase__NameAssignment"
    // InternalMyDsl.g:3677:1: rule__ExistencePluralIndefinitePhrase__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExistencePluralIndefinitePhrase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3681:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3682:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3682:2: ( RULE_ID )
            // InternalMyDsl.g:3683:3: RULE_ID
            {
             before(grammarAccess.getExistencePluralIndefinitePhraseAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExistencePluralIndefinitePhraseAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefinitePhrase__NameAssignment"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1"
    // InternalMyDsl.g:3692:1: rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3696:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3697:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3697:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3698:3: ( RULE_ID )
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getRefExistenceSingularIndefinitePhraseCrossReference_1_0()); 
            // InternalMyDsl.g:3699:3: ( RULE_ID )
            // InternalMyDsl.g:3700:4: RULE_ID
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getRefExistenceSingularIndefinitePhraseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getRefExistenceSingularIndefinitePhraseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExistenceSingularIndefiniteRefPhraseAccess().getRefExistenceSingularIndefinitePhraseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefPhrase__RefAssignment_1"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1"
    // InternalMyDsl.g:3711:1: rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3716:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3716:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3717:3: ( RULE_ID )
            {
             before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getRefExistencePluralIndefinitePhraseCrossReference_1_0()); 
            // InternalMyDsl.g:3718:3: ( RULE_ID )
            // InternalMyDsl.g:3719:4: RULE_ID
            {
             before(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getRefExistencePluralIndefinitePhraseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getRefExistencePluralIndefinitePhraseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExistencePluralIndefiniteRefPhraseAccess().getRefExistencePluralIndefinitePhraseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefPhrase__RefAssignment_1"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0"
    // InternalMyDsl.g:3730:1: rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0 : ( ruleExistenceSingularIndefiniteRefPhrase ) ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( ruleExistenceSingularIndefiniteRefPhrase ) )
            // InternalMyDsl.g:3735:2: ( ruleExistenceSingularIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:3735:2: ( ruleExistenceSingularIndefiniteRefPhrase )
            // InternalMyDsl.g:3736:3: ruleExistenceSingularIndefiniteRefPhrase
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsExistenceSingularIndefiniteRefPhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceSingularIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsExistenceSingularIndefiniteRefPhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_0"


    // $ANTLR start "rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2"
    // InternalMyDsl.g:3745:1: rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2 : ( ruleExistenceSingularIndefiniteRefPhrase ) ;
    public final void rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( ( ruleExistenceSingularIndefiniteRefPhrase ) )
            // InternalMyDsl.g:3750:2: ( ruleExistenceSingularIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:3750:2: ( ruleExistenceSingularIndefiniteRefPhrase )
            // InternalMyDsl.g:3751:3: ruleExistenceSingularIndefiniteRefPhrase
            {
             before(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsExistenceSingularIndefiniteRefPhraseParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceSingularIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistenceSingularIndefiniteRefListPhraseAccess().getElementsExistenceSingularIndefiniteRefPhraseParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistenceSingularIndefiniteRefListPhrase__ElementsAssignment_1_2"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0"
    // InternalMyDsl.g:3760:1: rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0 : ( ruleExistencePluralIndefiniteRefPhrase ) ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3764:1: ( ( ruleExistencePluralIndefiniteRefPhrase ) )
            // InternalMyDsl.g:3765:2: ( ruleExistencePluralIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:3765:2: ( ruleExistencePluralIndefiniteRefPhrase )
            // InternalMyDsl.g:3766:3: ruleExistencePluralIndefiniteRefPhrase
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsExistencePluralIndefiniteRefPhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistencePluralIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsExistencePluralIndefiniteRefPhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_0"


    // $ANTLR start "rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2"
    // InternalMyDsl.g:3775:1: rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2 : ( ruleExistencePluralIndefiniteRefPhrase ) ;
    public final void rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3779:1: ( ( ruleExistencePluralIndefiniteRefPhrase ) )
            // InternalMyDsl.g:3780:2: ( ruleExistencePluralIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:3780:2: ( ruleExistencePluralIndefiniteRefPhrase )
            // InternalMyDsl.g:3781:3: ruleExistencePluralIndefiniteRefPhrase
            {
             before(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsExistencePluralIndefiniteRefPhraseParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExistencePluralIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getExistencePluralIndefiniteRefListPhraseAccess().getElementsExistencePluralIndefiniteRefPhraseParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistencePluralIndefiniteRefListPhrase__ElementsAssignment_1_2"


    // $ANTLR start "rule__CompositionStmt__ParentAssignment_0"
    // InternalMyDsl.g:3790:1: rule__CompositionStmt__ParentAssignment_0 : ( ruleExistenceSingularRefListPhrase ) ;
    public final void rule__CompositionStmt__ParentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3794:1: ( ( ruleExistenceSingularRefListPhrase ) )
            // InternalMyDsl.g:3795:2: ( ruleExistenceSingularRefListPhrase )
            {
            // InternalMyDsl.g:3795:2: ( ruleExistenceSingularRefListPhrase )
            // InternalMyDsl.g:3796:3: ruleExistenceSingularRefListPhrase
            {
             before(grammarAccess.getCompositionStmtAccess().getParentExistenceSingularRefListPhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceSingularRefListPhrase();

            state._fsp--;

             after(grammarAccess.getCompositionStmtAccess().getParentExistenceSingularRefListPhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__ParentAssignment_0"


    // $ANTLR start "rule__CompositionStmt__ChildrenAssignment_2"
    // InternalMyDsl.g:3805:1: rule__CompositionStmt__ChildrenAssignment_2 : ( ruleExistenceAnyRefListPhrase ) ;
    public final void rule__CompositionStmt__ChildrenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( ( ruleExistenceAnyRefListPhrase ) )
            // InternalMyDsl.g:3810:2: ( ruleExistenceAnyRefListPhrase )
            {
            // InternalMyDsl.g:3810:2: ( ruleExistenceAnyRefListPhrase )
            // InternalMyDsl.g:3811:3: ruleExistenceAnyRefListPhrase
            {
             before(grammarAccess.getCompositionStmtAccess().getChildrenExistenceAnyRefListPhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceAnyRefListPhrase();

            state._fsp--;

             after(grammarAccess.getCompositionStmtAccess().getChildrenExistenceAnyRefListPhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionStmt__ChildrenAssignment_2"


    // $ANTLR start "rule__InheritanceStmt__ClassAssignment_0"
    // InternalMyDsl.g:3820:1: rule__InheritanceStmt__ClassAssignment_0 : ( ruleExistenceSingularRefListPhrase ) ;
    public final void rule__InheritanceStmt__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3824:1: ( ( ruleExistenceSingularRefListPhrase ) )
            // InternalMyDsl.g:3825:2: ( ruleExistenceSingularRefListPhrase )
            {
            // InternalMyDsl.g:3825:2: ( ruleExistenceSingularRefListPhrase )
            // InternalMyDsl.g:3826:3: ruleExistenceSingularRefListPhrase
            {
             before(grammarAccess.getInheritanceStmtAccess().getClassExistenceSingularRefListPhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceSingularRefListPhrase();

            state._fsp--;

             after(grammarAccess.getInheritanceStmtAccess().getClassExistenceSingularRefListPhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__ClassAssignment_0"


    // $ANTLR start "rule__InheritanceStmt__SuperclassAssignment_2"
    // InternalMyDsl.g:3835:1: rule__InheritanceStmt__SuperclassAssignment_2 : ( ruleExistenceSingularRefListPhrase ) ;
    public final void rule__InheritanceStmt__SuperclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3839:1: ( ( ruleExistenceSingularRefListPhrase ) )
            // InternalMyDsl.g:3840:2: ( ruleExistenceSingularRefListPhrase )
            {
            // InternalMyDsl.g:3840:2: ( ruleExistenceSingularRefListPhrase )
            // InternalMyDsl.g:3841:3: ruleExistenceSingularRefListPhrase
            {
             before(grammarAccess.getInheritanceStmtAccess().getSuperclassExistenceSingularRefListPhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceSingularRefListPhrase();

            state._fsp--;

             after(grammarAccess.getInheritanceStmtAccess().getSuperclassExistenceSingularRefListPhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceStmt__SuperclassAssignment_2"


    // $ANTLR start "rule__OperationDeclarionHeaderStmt__ParametersAssignment"
    // InternalMyDsl.g:3850:1: rule__OperationDeclarionHeaderStmt__ParametersAssignment : ( ruleOperationParameterPhrase ) ;
    public final void rule__OperationDeclarionHeaderStmt__ParametersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3854:1: ( ( ruleOperationParameterPhrase ) )
            // InternalMyDsl.g:3855:2: ( ruleOperationParameterPhrase )
            {
            // InternalMyDsl.g:3855:2: ( ruleOperationParameterPhrase )
            // InternalMyDsl.g:3856:3: ruleOperationParameterPhrase
            {
             before(grammarAccess.getOperationDeclarionHeaderStmtAccess().getParametersOperationParameterPhraseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationParameterPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDeclarionHeaderStmtAccess().getParametersOperationParameterPhraseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclarionHeaderStmt__ParametersAssignment"


    // $ANTLR start "rule__OperationDefinitionStmt__HeaderAssignment_1"
    // InternalMyDsl.g:3865:1: rule__OperationDefinitionStmt__HeaderAssignment_1 : ( ruleOperationDeclarionHeaderStmt ) ;
    public final void rule__OperationDefinitionStmt__HeaderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3869:1: ( ( ruleOperationDeclarionHeaderStmt ) )
            // InternalMyDsl.g:3870:2: ( ruleOperationDeclarionHeaderStmt )
            {
            // InternalMyDsl.g:3870:2: ( ruleOperationDeclarionHeaderStmt )
            // InternalMyDsl.g:3871:3: ruleOperationDeclarionHeaderStmt
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getHeaderOperationDeclarionHeaderStmtParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclarionHeaderStmt();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionStmtAccess().getHeaderOperationDeclarionHeaderStmtParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__HeaderAssignment_1"


    // $ANTLR start "rule__OperationDefinitionStmt__BodyAssignment_4"
    // InternalMyDsl.g:3880:1: rule__OperationDefinitionStmt__BodyAssignment_4 : ( ruleOperationDefinitionBodyStmts ) ;
    public final void rule__OperationDefinitionStmt__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( ( ruleOperationDefinitionBodyStmts ) )
            // InternalMyDsl.g:3885:2: ( ruleOperationDefinitionBodyStmts )
            {
            // InternalMyDsl.g:3885:2: ( ruleOperationDefinitionBodyStmts )
            // InternalMyDsl.g:3886:3: ruleOperationDefinitionBodyStmts
            {
             before(grammarAccess.getOperationDefinitionStmtAccess().getBodyOperationDefinitionBodyStmtsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyStmts();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionStmtAccess().getBodyOperationDefinitionBodyStmtsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionStmt__BodyAssignment_4"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__StmtsAssignment_0"
    // InternalMyDsl.g:3895:1: rule__OperationDefinitionBodyStmts__StmtsAssignment_0 : ( ruleOperationDefinitionBodyStmt ) ;
    public final void rule__OperationDefinitionBodyStmts__StmtsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3899:1: ( ( ruleOperationDefinitionBodyStmt ) )
            // InternalMyDsl.g:3900:2: ( ruleOperationDefinitionBodyStmt )
            {
            // InternalMyDsl.g:3900:2: ( ruleOperationDefinitionBodyStmt )
            // InternalMyDsl.g:3901:3: ruleOperationDefinitionBodyStmt
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsOperationDefinitionBodyStmtParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyStmt();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsOperationDefinitionBodyStmtParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__StmtsAssignment_0"


    // $ANTLR start "rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1"
    // InternalMyDsl.g:3910:1: rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1 : ( ruleOperationDefinitionBodyStmt ) ;
    public final void rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3914:1: ( ( ruleOperationDefinitionBodyStmt ) )
            // InternalMyDsl.g:3915:2: ( ruleOperationDefinitionBodyStmt )
            {
            // InternalMyDsl.g:3915:2: ( ruleOperationDefinitionBodyStmt )
            // InternalMyDsl.g:3916:3: ruleOperationDefinitionBodyStmt
            {
             before(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsOperationDefinitionBodyStmtParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyStmt();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyStmtsAccess().getStmtsOperationDefinitionBodyStmtParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyStmts__StmtsAssignment_1_1"


    // $ANTLR start "rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment"
    // InternalMyDsl.g:3925:1: rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment : ( ruleOperationDefinitionBodyFunctionCallArgumentsPhrase ) ;
    public final void rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3929:1: ( ( ruleOperationDefinitionBodyFunctionCallArgumentsPhrase ) )
            // InternalMyDsl.g:3930:2: ( ruleOperationDefinitionBodyFunctionCallArgumentsPhrase )
            {
            // InternalMyDsl.g:3930:2: ( ruleOperationDefinitionBodyFunctionCallArgumentsPhrase )
            // InternalMyDsl.g:3931:3: ruleOperationDefinitionBodyFunctionCallArgumentsPhrase
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseAccess().getArgumentsOperationDefinitionBodyFunctionCallArgumentsPhraseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyFunctionCallArgumentsPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyFunctionCallPhraseAccess().getArgumentsOperationDefinitionBodyFunctionCallArgumentsPhraseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyFunctionCallPhrase__ArgumentsAssignment"


    // $ANTLR start "rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment"
    // InternalMyDsl.g:3940:1: rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3945:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3945:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3946:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseAccess().getRefOperationDefinitionBodyFunctionCallInRefsPhraseCrossReference_0()); 
            // InternalMyDsl.g:3947:3: ( RULE_ID )
            // InternalMyDsl.g:3948:4: RULE_ID
            {
             before(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseAccess().getRefOperationDefinitionBodyFunctionCallInRefsPhraseIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseAccess().getRefOperationDefinitionBodyFunctionCallInRefsPhraseIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getOperationDefinitionBodyFunctionCallInRefsRefPhraseAccess().getRefOperationDefinitionBodyFunctionCallInRefsPhraseCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyFunctionCallInRefsRefPhrase__RefAssignment"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1"
    // InternalMyDsl.g:3959:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3963:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3964:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3964:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3965:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getTypeExistenceSingularIndefinitePhraseCrossReference_1_0()); 
            // InternalMyDsl.g:3966:3: ( RULE_ID )
            // InternalMyDsl.g:3967:4: RULE_ID
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getTypeExistenceSingularIndefinitePhraseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getTypeExistenceSingularIndefinitePhraseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getTypeExistenceSingularIndefinitePhraseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__TypeAssignment_1"


    // $ANTLR start "rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2"
    // InternalMyDsl.g:3978:1: rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3983:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3983:2: ( RULE_ID )
            // InternalMyDsl.g:3984:3: RULE_ID
            {
             before(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDefinitionBodyVariableDeclarationPhraseAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyVariableDeclarationPhrase__NameAssignment_2"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1"
    // InternalMyDsl.g:3993:1: rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1 : ( ruleOperationDefinitionBodyFunctionCallPhrase ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3997:1: ( ( ruleOperationDefinitionBodyFunctionCallPhrase ) )
            // InternalMyDsl.g:3998:2: ( ruleOperationDefinitionBodyFunctionCallPhrase )
            {
            // InternalMyDsl.g:3998:2: ( ruleOperationDefinitionBodyFunctionCallPhrase )
            // InternalMyDsl.g:3999:3: ruleOperationDefinitionBodyFunctionCallPhrase
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getConditionOperationDefinitionBodyFunctionCallPhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyFunctionCallPhrase();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getConditionOperationDefinitionBodyFunctionCallPhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__ConditionAssignment_1"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4"
    // InternalMyDsl.g:4008:1: rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4 : ( ruleOperationDefinitionBodyStmts ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4012:1: ( ( ruleOperationDefinitionBodyStmts ) )
            // InternalMyDsl.g:4013:2: ( ruleOperationDefinitionBodyStmts )
            {
            // InternalMyDsl.g:4013:2: ( ruleOperationDefinitionBodyStmts )
            // InternalMyDsl.g:4014:3: ruleOperationDefinitionBodyStmts
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenBodyOperationDefinitionBodyStmtsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyStmts();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getThenBodyOperationDefinitionBodyStmtsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__ThenBodyAssignment_4"


    // $ANTLR start "rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2"
    // InternalMyDsl.g:4023:1: rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2 : ( ruleOperationDefinitionBodyStmts ) ;
    public final void rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4027:1: ( ( ruleOperationDefinitionBodyStmts ) )
            // InternalMyDsl.g:4028:2: ( ruleOperationDefinitionBodyStmts )
            {
            // InternalMyDsl.g:4028:2: ( ruleOperationDefinitionBodyStmts )
            // InternalMyDsl.g:4029:3: ruleOperationDefinitionBodyStmts
            {
             before(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseBodyOperationDefinitionBodyStmtsParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDefinitionBodyStmts();

            state._fsp--;

             after(grammarAccess.getOperationDefinitionBodyConditionalStmtAccess().getElseBodyOperationDefinitionBodyStmtsParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDefinitionBodyConditionalStmt__ElseBodyAssignment_5_2"


    // $ANTLR start "rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0"
    // InternalMyDsl.g:4038:1: rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0 : ( ruleExistenceIndefiniteRefPhrase ) ;
    public final void rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4042:1: ( ( ruleExistenceIndefiniteRefPhrase ) )
            // InternalMyDsl.g:4043:2: ( ruleExistenceIndefiniteRefPhrase )
            {
            // InternalMyDsl.g:4043:2: ( ruleExistenceIndefiniteRefPhrase )
            // InternalMyDsl.g:4044:3: ruleExistenceIndefiniteRefPhrase
            {
             before(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getTypeExistenceIndefiniteRefPhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenceIndefiniteRefPhrase();

            state._fsp--;

             after(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getTypeExistenceIndefiniteRefPhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterVariableDeclarationPhrase__TypeAssignment_0"


    // $ANTLR start "rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1"
    // InternalMyDsl.g:4053:1: rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4057:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4058:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4058:2: ( RULE_ID )
            // InternalMyDsl.g:4059:3: RULE_ID
            {
             before(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationParameterVariableDeclarationPhraseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterVariableDeclarationPhrase__NameAssignment_1"


    // $ANTLR start "rule__OperationParameterConnectionPhrase__NameAssignment"
    // InternalMyDsl.g:4068:1: rule__OperationParameterConnectionPhrase__NameAssignment : ( ( rule__OperationParameterConnectionPhrase__NameAlternatives_0 ) ) ;
    public final void rule__OperationParameterConnectionPhrase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( ( ( rule__OperationParameterConnectionPhrase__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:4073:2: ( ( rule__OperationParameterConnectionPhrase__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:4073:2: ( ( rule__OperationParameterConnectionPhrase__NameAlternatives_0 ) )
            // InternalMyDsl.g:4074:3: ( rule__OperationParameterConnectionPhrase__NameAlternatives_0 )
            {
             before(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:4075:3: ( rule__OperationParameterConnectionPhrase__NameAlternatives_0 )
            // InternalMyDsl.g:4075:4: rule__OperationParameterConnectionPhrase__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterConnectionPhrase__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterConnectionPhraseAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterConnectionPhrase__NameAssignment"


    // $ANTLR start "rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment"
    // InternalMyDsl.g:4083:1: rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment : ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0 ) ) ;
    public final void rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4087:1: ( ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:4088:2: ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:4088:2: ( ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0 ) )
            // InternalMyDsl.g:4089:3: ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0 )
            {
             before(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:4090:3: ( rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0 )
            // InternalMyDsl.g:4090:4: rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationParameterConnectionBuiltinRefPhrase__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationParameterConnectionBuiltinRefPhraseAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationParameterConnectionBuiltinRefPhrase__NameAssignment"


    // $ANTLR start "rule__InstanceRefPhrase__FAssignment_0"
    // InternalMyDsl.g:4098:1: rule__InstanceRefPhrase__FAssignment_0 : ( ruleInstanceDirectRefPhrase ) ;
    public final void rule__InstanceRefPhrase__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4102:1: ( ( ruleInstanceDirectRefPhrase ) )
            // InternalMyDsl.g:4103:2: ( ruleInstanceDirectRefPhrase )
            {
            // InternalMyDsl.g:4103:2: ( ruleInstanceDirectRefPhrase )
            // InternalMyDsl.g:4104:3: ruleInstanceDirectRefPhrase
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getFInstanceDirectRefPhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceDirectRefPhrase();

            state._fsp--;

             after(grammarAccess.getInstanceRefPhraseAccess().getFInstanceDirectRefPhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__FAssignment_0"


    // $ANTLR start "rule__InstanceRefPhrase__ClassAssignment_1_1"
    // InternalMyDsl.g:4113:1: rule__InstanceRefPhrase__ClassAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceRefPhrase__ClassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4118:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4118:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4119:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getClassExistenceAnyPhraseCrossReference_1_1_0()); 
            // InternalMyDsl.g:4120:3: ( RULE_ID )
            // InternalMyDsl.g:4121:4: RULE_ID
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getClassExistenceAnyPhraseIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceRefPhraseAccess().getClassExistenceAnyPhraseIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getInstanceRefPhraseAccess().getClassExistenceAnyPhraseCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__ClassAssignment_1_1"


    // $ANTLR start "rule__InstanceRefPhrase__FAssignment_1_2"
    // InternalMyDsl.g:4132:1: rule__InstanceRefPhrase__FAssignment_1_2 : ( ( rule__InstanceRefPhrase__FAlternatives_1_2_0 ) ) ;
    public final void rule__InstanceRefPhrase__FAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4136:1: ( ( ( rule__InstanceRefPhrase__FAlternatives_1_2_0 ) ) )
            // InternalMyDsl.g:4137:2: ( ( rule__InstanceRefPhrase__FAlternatives_1_2_0 ) )
            {
            // InternalMyDsl.g:4137:2: ( ( rule__InstanceRefPhrase__FAlternatives_1_2_0 ) )
            // InternalMyDsl.g:4138:3: ( rule__InstanceRefPhrase__FAlternatives_1_2_0 )
            {
             before(grammarAccess.getInstanceRefPhraseAccess().getFAlternatives_1_2_0()); 
            // InternalMyDsl.g:4139:3: ( rule__InstanceRefPhrase__FAlternatives_1_2_0 )
            // InternalMyDsl.g:4139:4: rule__InstanceRefPhrase__FAlternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceRefPhrase__FAlternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceRefPhraseAccess().getFAlternatives_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceRefPhrase__FAssignment_1_2"


    // $ANTLR start "rule__InstanceDirectRefPhrase__ValueAssignment"
    // InternalMyDsl.g:4147:1: rule__InstanceDirectRefPhrase__ValueAssignment : ( ruleInstanceBuiltinValuePhrase ) ;
    public final void rule__InstanceDirectRefPhrase__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4151:1: ( ( ruleInstanceBuiltinValuePhrase ) )
            // InternalMyDsl.g:4152:2: ( ruleInstanceBuiltinValuePhrase )
            {
            // InternalMyDsl.g:4152:2: ( ruleInstanceBuiltinValuePhrase )
            // InternalMyDsl.g:4153:3: ruleInstanceBuiltinValuePhrase
            {
             before(grammarAccess.getInstanceDirectRefPhraseAccess().getValueInstanceBuiltinValuePhraseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceBuiltinValuePhrase();

            state._fsp--;

             after(grammarAccess.getInstanceDirectRefPhraseAccess().getValueInstanceBuiltinValuePhraseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceDirectRefPhrase__ValueAssignment"


    // $ANTLR start "rule__InstanceIndirectRefPhrase__ParentAssignment_1"
    // InternalMyDsl.g:4162:1: rule__InstanceIndirectRefPhrase__ParentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceIndirectRefPhrase__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4166:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4167:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4167:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4168:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceIndirectRefPhraseAccess().getParentOperationDefinitionBodyFunctionCallInRefsObjectsPhraseCrossReference_1_0()); 
            // InternalMyDsl.g:4169:3: ( RULE_ID )
            // InternalMyDsl.g:4170:4: RULE_ID
            {
             before(grammarAccess.getInstanceIndirectRefPhraseAccess().getParentOperationDefinitionBodyFunctionCallInRefsObjectsPhraseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceIndirectRefPhraseAccess().getParentOperationDefinitionBodyFunctionCallInRefsObjectsPhraseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInstanceIndirectRefPhraseAccess().getParentOperationDefinitionBodyFunctionCallInRefsObjectsPhraseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceIndirectRefPhrase__ParentAssignment_1"


    // $ANTLR start "rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1"
    // InternalMyDsl.g:4181:1: rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1 : ( RULE_INT ) ;
    public final void rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4185:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4186:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4186:2: ( RULE_INT )
            // InternalMyDsl.g:4187:3: RULE_INT
            {
             before(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getVINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstanceBuiltinValueIntegerPhraseAccess().getVINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueIntegerPhrase__VAssignment_1"


    // $ANTLR start "rule__InstanceBuiltinValueStringPhrase__VAssignment_1"
    // InternalMyDsl.g:4196:1: rule__InstanceBuiltinValueStringPhrase__VAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InstanceBuiltinValueStringPhrase__VAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4200:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4201:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4201:2: ( RULE_STRING )
            // InternalMyDsl.g:4202:3: RULE_STRING
            {
             before(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getVSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstanceBuiltinValueStringPhraseAccess().getVSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBuiltinValueStringPhrase__VAssignment_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\13\1\uffff\4\5\1\uffff\2\20\1\30\2\uffff\1\13\1\34\1\5\1\13\3\5\2\20";
    static final String dfa_3s = "\1\41\1\uffff\4\5\1\uffff\2\35\1\34\2\uffff\1\30\1\34\1\5\1\15\3\5\2\35";
    static final String dfa_4s = "\1\uffff\1\1\4\uffff\1\4\3\uffff\1\3\1\2\11\uffff";
    static final String dfa_5s = "\25\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\5\7\uffff\3\6\3\uffff\1\1\1\2\1\uffff\1\1\2\uffff\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\10",
            "\1\10",
            "",
            "\3\13\2\12\10\uffff\1\11",
            "\3\13\2\12\10\uffff\1\14",
            "\1\15\3\uffff\1\16",
            "",
            "",
            "\1\20\1\21\1\22\12\uffff\1\17",
            "\1\16",
            "\1\23",
            "\1\20\1\21\1\22",
            "\1\24",
            "\1\24",
            "\1\24",
            "\3\13\2\12\10\uffff\1\11",
            "\3\13\2\12\10\uffff\1\14"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1141:1: rule__Stmt__Alternatives_0 : ( ( ruleExistenceStmt ) | ( ruleCompositionStmt ) | ( ruleInheritanceStmt ) | ( ruleOperationStmt ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000258E03802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001308F832L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000013080072L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001000F830L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000011003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001100F830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010003800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001308F830L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000021B080070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000013080070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000050L});

}