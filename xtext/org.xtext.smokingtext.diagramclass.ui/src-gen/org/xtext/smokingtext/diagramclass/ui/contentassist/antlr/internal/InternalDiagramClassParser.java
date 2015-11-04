package org.xtext.smokingtext.diagramclass.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.smokingtext.diagramclass.services.DiagramClassGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDiagramClassParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<>'", "'<!>'", "'+'", "'-'", "'#'", "':'", "'{'", "'}'", "','", "'->'", "'e'", "'i'", "'a'", "'['", "']'", "'('", "')'", "'[['", "']]'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalDiagramClassParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDiagramClassParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDiagramClassParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g"; }


     
     	private DiagramClassGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DiagramClassGrammarAccess grammarAccess) {
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:61:1: ( ruleModel EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==29||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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


    // $ANTLR start "entryRuleElements"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:88:1: entryRuleElements : ruleElements EOF ;
    public final void entryRuleElements() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:89:1: ( ruleElements EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:90:1: ruleElements EOF
            {
             before(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_ruleElements_in_entryRuleElements122);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getElementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElements129); 

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
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:97:1: ruleElements : ( ( rule__Elements__Alternatives ) ) ;
    public final void ruleElements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:101:2: ( ( ( rule__Elements__Alternatives ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:102:1: ( ( rule__Elements__Alternatives ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:102:1: ( ( rule__Elements__Alternatives ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:103:1: ( rule__Elements__Alternatives )
            {
             before(grammarAccess.getElementsAccess().getAlternatives()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:104:1: ( rule__Elements__Alternatives )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:104:2: rule__Elements__Alternatives
            {
            pushFollow(FOLLOW_rule__Elements__Alternatives_in_ruleElements155);
            rule__Elements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleClass"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:116:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:117:1: ( ruleClass EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:118:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass182);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass189); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:125:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:129:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:130:1: ( ( rule__Class__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:130:1: ( ( rule__Class__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:131:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:132:1: ( rule__Class__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:132:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass215);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleImplements"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:144:1: entryRuleImplements : ruleImplements EOF ;
    public final void entryRuleImplements() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:145:1: ( ruleImplements EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:146:1: ruleImplements EOF
            {
             before(grammarAccess.getImplementsRule()); 
            pushFollow(FOLLOW_ruleImplements_in_entryRuleImplements242);
            ruleImplements();

            state._fsp--;

             after(grammarAccess.getImplementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplements249); 

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
    // $ANTLR end "entryRuleImplements"


    // $ANTLR start "ruleImplements"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:153:1: ruleImplements : ( ( rule__Implements__Group__0 ) ) ;
    public final void ruleImplements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:157:2: ( ( ( rule__Implements__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:158:1: ( ( rule__Implements__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:158:1: ( ( rule__Implements__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:159:1: ( rule__Implements__Group__0 )
            {
             before(grammarAccess.getImplementsAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:160:1: ( rule__Implements__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:160:2: rule__Implements__Group__0
            {
            pushFollow(FOLLOW_rule__Implements__Group__0_in_ruleImplements275);
            rule__Implements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplementsAccess().getGroup()); 

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
    // $ANTLR end "ruleImplements"


    // $ANTLR start "entryRuleDependancy"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:172:1: entryRuleDependancy : ruleDependancy EOF ;
    public final void entryRuleDependancy() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:173:1: ( ruleDependancy EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:174:1: ruleDependancy EOF
            {
             before(grammarAccess.getDependancyRule()); 
            pushFollow(FOLLOW_ruleDependancy_in_entryRuleDependancy302);
            ruleDependancy();

            state._fsp--;

             after(grammarAccess.getDependancyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependancy309); 

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
    // $ANTLR end "entryRuleDependancy"


    // $ANTLR start "ruleDependancy"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:181:1: ruleDependancy : ( ( rule__Dependancy__Group__0 ) ) ;
    public final void ruleDependancy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:185:2: ( ( ( rule__Dependancy__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:186:1: ( ( rule__Dependancy__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:186:1: ( ( rule__Dependancy__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:187:1: ( rule__Dependancy__Group__0 )
            {
             before(grammarAccess.getDependancyAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:188:1: ( rule__Dependancy__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:188:2: rule__Dependancy__Group__0
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__0_in_ruleDependancy335);
            rule__Dependancy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependancyAccess().getGroup()); 

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
    // $ANTLR end "ruleDependancy"


    // $ANTLR start "entryRuleEnumeration"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:200:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:201:1: ( ruleEnumeration EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:202:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration362);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration369); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:209:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:213:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:214:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:214:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:215:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:216:1: ( rule__Enumeration__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:216:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration395);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:228:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:229:1: ( ruleInterface EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:230:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface422);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface429); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:237:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:241:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:242:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:242:1: ( ( rule__Interface__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:243:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:244:1: ( rule__Interface__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:244:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface455);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleAbstract"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:256:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:257:1: ( ruleAbstract EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:258:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract482);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract489); 

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
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:265:1: ruleAbstract : ( ( rule__Abstract__Group__0 ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:269:2: ( ( ( rule__Abstract__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:270:1: ( ( rule__Abstract__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:270:1: ( ( rule__Abstract__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:271:1: ( rule__Abstract__Group__0 )
            {
             before(grammarAccess.getAbstractAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:272:1: ( rule__Abstract__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:272:2: rule__Abstract__Group__0
            {
            pushFollow(FOLLOW_rule__Abstract__Group__0_in_ruleAbstract515);
            rule__Abstract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getGroup()); 

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
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:284:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:285:1: ( ruleAttribute EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:286:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute542);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute549); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:293:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:297:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:298:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:298:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:299:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:300:1: ( rule__Attribute__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:300:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute575);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleparamIn"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:312:1: entryRuleparamIn : ruleparamIn EOF ;
    public final void entryRuleparamIn() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:313:1: ( ruleparamIn EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:314:1: ruleparamIn EOF
            {
             before(grammarAccess.getParamInRule()); 
            pushFollow(FOLLOW_ruleparamIn_in_entryRuleparamIn602);
            ruleparamIn();

            state._fsp--;

             after(grammarAccess.getParamInRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparamIn609); 

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
    // $ANTLR end "entryRuleparamIn"


    // $ANTLR start "ruleparamIn"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:321:1: ruleparamIn : ( ( rule__ParamIn__Group__0 ) ) ;
    public final void ruleparamIn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:325:2: ( ( ( rule__ParamIn__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:326:1: ( ( rule__ParamIn__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:326:1: ( ( rule__ParamIn__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:327:1: ( rule__ParamIn__Group__0 )
            {
             before(grammarAccess.getParamInAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:328:1: ( rule__ParamIn__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:328:2: rule__ParamIn__Group__0
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__0_in_ruleparamIn635);
            rule__ParamIn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamInAccess().getGroup()); 

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
    // $ANTLR end "ruleparamIn"


    // $ANTLR start "entryRuleMethod"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:340:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:341:1: ( ruleMethod EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:342:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod662);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod669); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:349:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:353:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:354:1: ( ( rule__Method__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:354:1: ( ( rule__Method__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:355:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:356:1: ( rule__Method__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:356:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod695);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleBodyVisibility"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:368:1: entryRuleBodyVisibility : ruleBodyVisibility EOF ;
    public final void entryRuleBodyVisibility() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:369:1: ( ruleBodyVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:370:1: ruleBodyVisibility EOF
            {
             before(grammarAccess.getBodyVisibilityRule()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility722);
            ruleBodyVisibility();

            state._fsp--;

             after(grammarAccess.getBodyVisibilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyVisibility729); 

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
    // $ANTLR end "entryRuleBodyVisibility"


    // $ANTLR start "ruleBodyVisibility"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:377:1: ruleBodyVisibility : ( ( rule__BodyVisibility__Alternatives ) ) ;
    public final void ruleBodyVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:381:2: ( ( ( rule__BodyVisibility__Alternatives ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:382:1: ( ( rule__BodyVisibility__Alternatives ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:382:1: ( ( rule__BodyVisibility__Alternatives ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:383:1: ( rule__BodyVisibility__Alternatives )
            {
             before(grammarAccess.getBodyVisibilityAccess().getAlternatives()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:384:1: ( rule__BodyVisibility__Alternatives )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:384:2: rule__BodyVisibility__Alternatives
            {
            pushFollow(FOLLOW_rule__BodyVisibility__Alternatives_in_ruleBodyVisibility755);
            rule__BodyVisibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyVisibilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBodyVisibility"


    // $ANTLR start "entryRuleClassVisibility"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:396:1: entryRuleClassVisibility : ruleClassVisibility EOF ;
    public final void entryRuleClassVisibility() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:397:1: ( ruleClassVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:398:1: ruleClassVisibility EOF
            {
             before(grammarAccess.getClassVisibilityRule()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility782);
            ruleClassVisibility();

            state._fsp--;

             after(grammarAccess.getClassVisibilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassVisibility789); 

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
    // $ANTLR end "entryRuleClassVisibility"


    // $ANTLR start "ruleClassVisibility"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:405:1: ruleClassVisibility : ( ( rule__ClassVisibility__Alternatives ) ) ;
    public final void ruleClassVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:409:2: ( ( ( rule__ClassVisibility__Alternatives ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:410:1: ( ( rule__ClassVisibility__Alternatives ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:410:1: ( ( rule__ClassVisibility__Alternatives ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:411:1: ( rule__ClassVisibility__Alternatives )
            {
             before(grammarAccess.getClassVisibilityAccess().getAlternatives()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:412:1: ( rule__ClassVisibility__Alternatives )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:412:2: rule__ClassVisibility__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassVisibility__Alternatives_in_ruleClassVisibility815);
            rule__ClassVisibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassVisibilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleClassVisibility"


    // $ANTLR start "entryRulePackage"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:424:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:425:1: ( rulePackage EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:426:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage842);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage849); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:433:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:437:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:438:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:438:1: ( ( rule__Package__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:439:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:440:1: ( rule__Package__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:440:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage875);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "rule__Elements__Alternatives"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:452:1: rule__Elements__Alternatives : ( ( ruleClass ) | ( ruleInterface ) | ( ruleAbstract ) | ( ruleEnumeration ) );
    public final void rule__Elements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:456:1: ( ( ruleClass ) | ( ruleInterface ) | ( ruleAbstract ) | ( ruleEnumeration ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt2=2;
                    }
                    break;
                case 22:
                    {
                    alt2=4;
                    }
                    break;
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==15) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt2=4;
                    }
                    break;
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                case 23:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:457:1: ( ruleClass )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:457:1: ( ruleClass )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:458:1: ruleClass
                    {
                     before(grammarAccess.getElementsAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__Elements__Alternatives911);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:463:6: ( ruleInterface )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:463:6: ( ruleInterface )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:464:1: ruleInterface
                    {
                     before(grammarAccess.getElementsAccess().getInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterface_in_rule__Elements__Alternatives928);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getInterfaceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:469:6: ( ruleAbstract )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:469:6: ( ruleAbstract )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:470:1: ruleAbstract
                    {
                     before(grammarAccess.getElementsAccess().getAbstractParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAbstract_in_rule__Elements__Alternatives945);
                    ruleAbstract();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getAbstractParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:475:6: ( ruleEnumeration )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:475:6: ( ruleEnumeration )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:476:1: ruleEnumeration
                    {
                     before(grammarAccess.getElementsAccess().getEnumerationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Elements__Alternatives962);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getEnumerationParserRuleCall_3()); 

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
    // $ANTLR end "rule__Elements__Alternatives"


    // $ANTLR start "rule__Class__BodyAlternatives_6_0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:486:1: rule__Class__BodyAlternatives_6_0 : ( ( ruleAttribute ) | ( ruleMethod ) | ( ruleDependancy ) );
    public final void rule__Class__BodyAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:490:1: ( ( ruleAttribute ) | ( ruleMethod ) | ( ruleDependancy ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==17) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==27) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_1>=12 && LA3_1<=13)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=12 && LA3_2<=13)) ) {
                    alt3=1;
                }
                else if ( (LA3_2==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==17) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==27) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==17) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==27) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_3>=12 && LA3_3<=13)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:491:1: ( ruleAttribute )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:491:1: ( ruleAttribute )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:492:1: ruleAttribute
                    {
                     before(grammarAccess.getClassAccess().getBodyAttributeParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Class__BodyAlternatives_6_0994);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getBodyAttributeParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:497:6: ( ruleMethod )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:497:6: ( ruleMethod )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:498:1: ruleMethod
                    {
                     before(grammarAccess.getClassAccess().getBodyMethodParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Class__BodyAlternatives_6_01011);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getBodyMethodParserRuleCall_6_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:503:6: ( ruleDependancy )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:503:6: ( ruleDependancy )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:504:1: ruleDependancy
                    {
                     before(grammarAccess.getClassAccess().getBodyDependancyParserRuleCall_6_0_2()); 
                    pushFollow(FOLLOW_ruleDependancy_in_rule__Class__BodyAlternatives_6_01028);
                    ruleDependancy();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getBodyDependancyParserRuleCall_6_0_2()); 

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
    // $ANTLR end "rule__Class__BodyAlternatives_6_0"


    // $ANTLR start "rule__Abstract__BodyAlternatives_7_0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:514:1: rule__Abstract__BodyAlternatives_7_0 : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Abstract__BodyAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:518:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=12 && LA4_1<=13)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==17) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==27) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==17) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==27) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else if ( ((LA4_2>=12 && LA4_2<=13)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3>=12 && LA4_3<=13)) ) {
                    alt4=1;
                }
                else if ( (LA4_3==RULE_ID) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==17) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==27) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:519:1: ( ruleAttribute )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:519:1: ( ruleAttribute )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:520:1: ruleAttribute
                    {
                     before(grammarAccess.getAbstractAccess().getBodyAttributeParserRuleCall_7_0_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Abstract__BodyAlternatives_7_01060);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getBodyAttributeParserRuleCall_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:525:6: ( ruleMethod )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:525:6: ( ruleMethod )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:526:1: ruleMethod
                    {
                     before(grammarAccess.getAbstractAccess().getBodyMethodParserRuleCall_7_0_1()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Abstract__BodyAlternatives_7_01077);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getBodyMethodParserRuleCall_7_0_1()); 

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
    // $ANTLR end "rule__Abstract__BodyAlternatives_7_0"


    // $ANTLR start "rule__Attribute__Alternatives_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:536:1: rule__Attribute__Alternatives_1 : ( ( '<>' ) | ( '<!>' ) );
    public final void rule__Attribute__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:540:1: ( ( '<>' ) | ( '<!>' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:541:1: ( '<>' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:541:1: ( '<>' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:542:1: '<>'
                    {
                     before(grammarAccess.getAttributeAccess().getLessThanSignGreaterThanSignKeyword_1_0()); 
                    match(input,12,FOLLOW_12_in_rule__Attribute__Alternatives_11110); 
                     after(grammarAccess.getAttributeAccess().getLessThanSignGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:549:6: ( '<!>' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:549:6: ( '<!>' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:550:1: '<!>'
                    {
                     before(grammarAccess.getAttributeAccess().getLessThanSignExclamationMarkGreaterThanSignKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__Attribute__Alternatives_11130); 
                     after(grammarAccess.getAttributeAccess().getLessThanSignExclamationMarkGreaterThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_1"


    // $ANTLR start "rule__BodyVisibility__Alternatives"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:562:1: rule__BodyVisibility__Alternatives : ( ( '+' ) | ( '-' ) | ( '#' ) );
    public final void rule__BodyVisibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:566:1: ( ( '+' ) | ( '-' ) | ( '#' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
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
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:567:1: ( '+' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:567:1: ( '+' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:568:1: '+'
                    {
                     before(grammarAccess.getBodyVisibilityAccess().getPlusSignKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__BodyVisibility__Alternatives1165); 
                     after(grammarAccess.getBodyVisibilityAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:575:6: ( '-' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:575:6: ( '-' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:576:1: '-'
                    {
                     before(grammarAccess.getBodyVisibilityAccess().getHyphenMinusKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__BodyVisibility__Alternatives1185); 
                     after(grammarAccess.getBodyVisibilityAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:583:6: ( '#' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:583:6: ( '#' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:584:1: '#'
                    {
                     before(grammarAccess.getBodyVisibilityAccess().getNumberSignKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__BodyVisibility__Alternatives1205); 
                     after(grammarAccess.getBodyVisibilityAccess().getNumberSignKeyword_2()); 

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
    // $ANTLR end "rule__BodyVisibility__Alternatives"


    // $ANTLR start "rule__ClassVisibility__Alternatives"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:596:1: rule__ClassVisibility__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__ClassVisibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:600:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:601:1: ( '+' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:601:1: ( '+' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:602:1: '+'
                    {
                     before(grammarAccess.getClassVisibilityAccess().getPlusSignKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__ClassVisibility__Alternatives1240); 
                     after(grammarAccess.getClassVisibilityAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:609:6: ( '-' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:609:6: ( '-' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:610:1: '-'
                    {
                     before(grammarAccess.getClassVisibilityAccess().getHyphenMinusKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__ClassVisibility__Alternatives1260); 
                     after(grammarAccess.getClassVisibilityAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__ClassVisibility__Alternatives"


    // $ANTLR start "rule__Class__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:624:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:628:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:629:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01292);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01295);
            rule__Class__Group__1();

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
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:636:1: rule__Class__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:640:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:641:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:641:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:642:1: ruleClassVisibility
            {
             before(grammarAccess.getClassAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Class__Group__0__Impl1322);
            ruleClassVisibility();

            state._fsp--;

             after(grammarAccess.getClassAccess().getClassVisibilityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:653:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:657:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:658:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11351);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11354);
            rule__Class__Group__2();

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
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:665:1: rule__Class__Group__1__Impl : ( ( rule__Class__ClassnameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:669:1: ( ( ( rule__Class__ClassnameAssignment_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:670:1: ( ( rule__Class__ClassnameAssignment_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:670:1: ( ( rule__Class__ClassnameAssignment_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:671:1: ( rule__Class__ClassnameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getClassnameAssignment_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:672:1: ( rule__Class__ClassnameAssignment_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:672:2: rule__Class__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__ClassnameAssignment_1_in_rule__Class__Group__1__Impl1381);
            rule__Class__ClassnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getClassnameAssignment_1()); 

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
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:682:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:686:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:687:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21411);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21414);
            rule__Class__Group__3();

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
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:694:1: rule__Class__Group__2__Impl : ( ( ':' )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:698:1: ( ( ( ':' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:699:1: ( ( ':' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:699:1: ( ( ':' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:700:1: ( ':' )?
            {
             before(grammarAccess.getClassAccess().getColonKeyword_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:701:1: ( ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:702:2: ':'
                    {
                    match(input,17,FOLLOW_17_in_rule__Class__Group__2__Impl1443); 

                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:713:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:717:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:718:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31476);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31479);
            rule__Class__Group__4();

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
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:725:1: rule__Class__Group__3__Impl : ( ( rule__Class__ExtensionAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:729:1: ( ( ( rule__Class__ExtensionAssignment_3 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:730:1: ( ( rule__Class__ExtensionAssignment_3 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:730:1: ( ( rule__Class__ExtensionAssignment_3 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:731:1: ( rule__Class__ExtensionAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getExtensionAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:732:1: ( rule__Class__ExtensionAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:732:2: rule__Class__ExtensionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Class__ExtensionAssignment_3_in_rule__Class__Group__3__Impl1506);
                    rule__Class__ExtensionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getExtensionAssignment_3()); 

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
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:742:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:746:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:747:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41537);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41540);
            rule__Class__Group__5();

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
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:754:1: rule__Class__Group__4__Impl : ( ( rule__Class__ImplementsAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:758:1: ( ( ( rule__Class__ImplementsAssignment_4 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:759:1: ( ( rule__Class__ImplementsAssignment_4 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:759:1: ( ( rule__Class__ImplementsAssignment_4 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:760:1: ( rule__Class__ImplementsAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getImplementsAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:761:1: ( rule__Class__ImplementsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:761:2: rule__Class__ImplementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__ImplementsAssignment_4_in_rule__Class__Group__4__Impl1567);
            	    rule__Class__ImplementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getImplementsAssignment_4()); 

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
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:771:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:775:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:776:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51598);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51601);
            rule__Class__Group__6();

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
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:783:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:787:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:788:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:788:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:789:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Class__Group__5__Impl1629); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:802:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:806:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:807:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61660);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__7_in_rule__Class__Group__61663);
            rule__Class__Group__7();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:814:1: rule__Class__Group__6__Impl : ( ( rule__Class__BodyAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:818:1: ( ( ( rule__Class__BodyAssignment_6 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:819:1: ( ( rule__Class__BodyAssignment_6 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:819:1: ( ( rule__Class__BodyAssignment_6 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:820:1: ( rule__Class__BodyAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getBodyAssignment_6()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:821:1: ( rule__Class__BodyAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=14 && LA11_0<=16)||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:821:2: rule__Class__BodyAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class__BodyAssignment_6_in_rule__Class__Group__6__Impl1690);
            	    rule__Class__BodyAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getBodyAssignment_6()); 

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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:831:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:835:1: ( rule__Class__Group__7__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:836:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__71721);
            rule__Class__Group__7__Impl();

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
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:842:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:846:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:847:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:847:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:848:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Class__Group__7__Impl1749); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Implements__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:877:1: rule__Implements__Group__0 : rule__Implements__Group__0__Impl rule__Implements__Group__1 ;
    public final void rule__Implements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:881:1: ( rule__Implements__Group__0__Impl rule__Implements__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:882:2: rule__Implements__Group__0__Impl rule__Implements__Group__1
            {
            pushFollow(FOLLOW_rule__Implements__Group__0__Impl_in_rule__Implements__Group__01796);
            rule__Implements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Implements__Group__1_in_rule__Implements__Group__01799);
            rule__Implements__Group__1();

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
    // $ANTLR end "rule__Implements__Group__0"


    // $ANTLR start "rule__Implements__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:889:1: rule__Implements__Group__0__Impl : ( ( ',' )? ) ;
    public final void rule__Implements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:893:1: ( ( ( ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:894:1: ( ( ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:894:1: ( ( ',' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:895:1: ( ',' )?
            {
             before(grammarAccess.getImplementsAccess().getCommaKeyword_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:896:1: ( ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:897:2: ','
                    {
                    match(input,20,FOLLOW_20_in_rule__Implements__Group__0__Impl1828); 

                    }
                    break;

            }

             after(grammarAccess.getImplementsAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__Implements__Group__0__Impl"


    // $ANTLR start "rule__Implements__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:908:1: rule__Implements__Group__1 : rule__Implements__Group__1__Impl ;
    public final void rule__Implements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:912:1: ( rule__Implements__Group__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:913:2: rule__Implements__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implements__Group__1__Impl_in_rule__Implements__Group__11861);
            rule__Implements__Group__1__Impl();

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
    // $ANTLR end "rule__Implements__Group__1"


    // $ANTLR start "rule__Implements__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:919:1: rule__Implements__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Implements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:923:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:924:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:924:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:925:1: RULE_ID
            {
             before(grammarAccess.getImplementsAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Implements__Group__1__Impl1888); 
             after(grammarAccess.getImplementsAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Implements__Group__1__Impl"


    // $ANTLR start "rule__Dependancy__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:940:1: rule__Dependancy__Group__0 : rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 ;
    public final void rule__Dependancy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:944:1: ( rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:945:2: rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__01921);
            rule__Dependancy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__01924);
            rule__Dependancy__Group__1();

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
    // $ANTLR end "rule__Dependancy__Group__0"


    // $ANTLR start "rule__Dependancy__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:952:1: rule__Dependancy__Group__0__Impl : ( '->' ) ;
    public final void rule__Dependancy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:956:1: ( ( '->' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:957:1: ( '->' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:957:1: ( '->' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:958:1: '->'
            {
             before(grammarAccess.getDependancyAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Dependancy__Group__0__Impl1952); 
             after(grammarAccess.getDependancyAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Dependancy__Group__0__Impl"


    // $ANTLR start "rule__Dependancy__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:971:1: rule__Dependancy__Group__1 : rule__Dependancy__Group__1__Impl ;
    public final void rule__Dependancy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:975:1: ( rule__Dependancy__Group__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:976:2: rule__Dependancy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__11983);
            rule__Dependancy__Group__1__Impl();

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
    // $ANTLR end "rule__Dependancy__Group__1"


    // $ANTLR start "rule__Dependancy__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:982:1: rule__Dependancy__Group__1__Impl : ( ( rule__Dependancy__NameAssignment_1 ) ) ;
    public final void rule__Dependancy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:986:1: ( ( ( rule__Dependancy__NameAssignment_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:987:1: ( ( rule__Dependancy__NameAssignment_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:987:1: ( ( rule__Dependancy__NameAssignment_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:988:1: ( rule__Dependancy__NameAssignment_1 )
            {
             before(grammarAccess.getDependancyAccess().getNameAssignment_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:989:1: ( rule__Dependancy__NameAssignment_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:989:2: rule__Dependancy__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Dependancy__NameAssignment_1_in_rule__Dependancy__Group__1__Impl2010);
            rule__Dependancy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependancyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Dependancy__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1003:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1007:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1008:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02044);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02047);
            rule__Enumeration__Group__1();

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
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1015:1: rule__Enumeration__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1019:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1020:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1020:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1021:1: ruleClassVisibility
            {
             before(grammarAccess.getEnumerationAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Enumeration__Group__0__Impl2074);
            ruleClassVisibility();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getClassVisibilityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1032:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1036:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1037:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12103);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12106);
            rule__Enumeration__Group__2();

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
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1044:1: rule__Enumeration__Group__1__Impl : ( 'e' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1048:1: ( ( 'e' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1049:1: ( 'e' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1049:1: ( 'e' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1050:1: 'e'
            {
             before(grammarAccess.getEnumerationAccess().getEKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Enumeration__Group__1__Impl2134); 
             after(grammarAccess.getEnumerationAccess().getEKeyword_1()); 

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
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1063:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1067:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1068:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22165);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22168);
            rule__Enumeration__Group__3();

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
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1075:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__ClassnameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1079:1: ( ( ( rule__Enumeration__ClassnameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1080:1: ( ( rule__Enumeration__ClassnameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1080:1: ( ( rule__Enumeration__ClassnameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1081:1: ( rule__Enumeration__ClassnameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getClassnameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1082:1: ( rule__Enumeration__ClassnameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1082:2: rule__Enumeration__ClassnameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enumeration__ClassnameAssignment_2_in_rule__Enumeration__Group__2__Impl2195);
            rule__Enumeration__ClassnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getClassnameAssignment_2()); 

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
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1092:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1096:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1097:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32225);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32228);
            rule__Enumeration__Group__4();

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
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1104:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1108:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1109:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1109:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1110:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Enumeration__Group__3__Impl2256); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1123:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1127:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1128:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42287);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42290);
            rule__Enumeration__Group__5();

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
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1135:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1139:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1140:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1140:1: ( ( rule__Enumeration__Group_4__0 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1141:1: ( rule__Enumeration__Group_4__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1142:1: ( rule__Enumeration__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1142:2: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl2317);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1152:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1156:1: ( rule__Enumeration__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1157:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__52348);
            rule__Enumeration__Group__5__Impl();

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
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1163:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1167:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1168:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1168:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1169:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__5__Impl2376); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1194:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1198:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1199:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__02419);
            rule__Enumeration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__02422);
            rule__Enumeration__Group_4__1();

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
    // $ANTLR end "rule__Enumeration__Group_4__0"


    // $ANTLR start "rule__Enumeration__Group_4__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1206:1: rule__Enumeration__Group_4__0__Impl : ( RULE_ID ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1210:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1211:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1211:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1212:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__Group_4__0__Impl2449); 
             after(grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Enumeration__Group_4__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1223:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1227:1: ( rule__Enumeration__Group_4__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1228:2: rule__Enumeration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__12478);
            rule__Enumeration__Group_4__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_4__1"


    // $ANTLR start "rule__Enumeration__Group_4__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1234:1: rule__Enumeration__Group_4__1__Impl : ( ( ',' )? ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1238:1: ( ( ( ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1239:1: ( ( ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1239:1: ( ( ',' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1240:1: ( ',' )?
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1241:1: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1242:2: ','
                    {
                    match(input,20,FOLLOW_20_in_rule__Enumeration__Group_4__1__Impl2507); 

                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getCommaKeyword_4_1()); 

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
    // $ANTLR end "rule__Enumeration__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1257:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1261:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1262:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02544);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02547);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1269:1: rule__Interface__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1273:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1274:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1274:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1275:1: ruleClassVisibility
            {
             before(grammarAccess.getInterfaceAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Interface__Group__0__Impl2574);
            ruleClassVisibility();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getClassVisibilityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1286:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1290:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1291:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12603);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12606);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1298:1: rule__Interface__Group__1__Impl : ( 'i' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1302:1: ( ( 'i' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1303:1: ( 'i' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1303:1: ( 'i' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1304:1: 'i'
            {
             before(grammarAccess.getInterfaceAccess().getIKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Interface__Group__1__Impl2634); 
             after(grammarAccess.getInterfaceAccess().getIKeyword_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1317:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1321:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1322:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__22665);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__22668);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1329:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__MethodnameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1333:1: ( ( ( rule__Interface__MethodnameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1334:1: ( ( rule__Interface__MethodnameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1334:1: ( ( rule__Interface__MethodnameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1335:1: ( rule__Interface__MethodnameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getMethodnameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1336:1: ( rule__Interface__MethodnameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1336:2: rule__Interface__MethodnameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__MethodnameAssignment_2_in_rule__Interface__Group__2__Impl2695);
            rule__Interface__MethodnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getMethodnameAssignment_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1346:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1350:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1351:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__32725);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__32728);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1358:1: rule__Interface__Group__3__Impl : ( '{' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1362:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1363:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1363:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1364:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Interface__Group__3__Impl2756); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1377:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1381:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1382:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__42787);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__42790);
            rule__Interface__Group__5();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1389:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__BodyAssignment_4 )* ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1393:1: ( ( ( rule__Interface__BodyAssignment_4 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1394:1: ( ( rule__Interface__BodyAssignment_4 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1394:1: ( ( rule__Interface__BodyAssignment_4 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1395:1: ( rule__Interface__BodyAssignment_4 )*
            {
             before(grammarAccess.getInterfaceAccess().getBodyAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1396:1: ( rule__Interface__BodyAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=14 && LA15_0<=16)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1396:2: rule__Interface__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interface__BodyAssignment_4_in_rule__Interface__Group__4__Impl2817);
            	    rule__Interface__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getBodyAssignment_4()); 

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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1406:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1410:1: ( rule__Interface__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1411:2: rule__Interface__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__52848);
            rule__Interface__Group__5__Impl();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1417:1: rule__Interface__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1421:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1422:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1422:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1423:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Interface__Group__5__Impl2876); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Abstract__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1448:1: rule__Abstract__Group__0 : rule__Abstract__Group__0__Impl rule__Abstract__Group__1 ;
    public final void rule__Abstract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1452:1: ( rule__Abstract__Group__0__Impl rule__Abstract__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1453:2: rule__Abstract__Group__0__Impl rule__Abstract__Group__1
            {
            pushFollow(FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__02919);
            rule__Abstract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__02922);
            rule__Abstract__Group__1();

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
    // $ANTLR end "rule__Abstract__Group__0"


    // $ANTLR start "rule__Abstract__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1460:1: rule__Abstract__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Abstract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1464:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1465:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1465:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1466:1: ruleClassVisibility
            {
             before(grammarAccess.getAbstractAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Abstract__Group__0__Impl2949);
            ruleClassVisibility();

            state._fsp--;

             after(grammarAccess.getAbstractAccess().getClassVisibilityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Abstract__Group__0__Impl"


    // $ANTLR start "rule__Abstract__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1477:1: rule__Abstract__Group__1 : rule__Abstract__Group__1__Impl rule__Abstract__Group__2 ;
    public final void rule__Abstract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1481:1: ( rule__Abstract__Group__1__Impl rule__Abstract__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1482:2: rule__Abstract__Group__1__Impl rule__Abstract__Group__2
            {
            pushFollow(FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__12978);
            rule__Abstract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__2_in_rule__Abstract__Group__12981);
            rule__Abstract__Group__2();

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
    // $ANTLR end "rule__Abstract__Group__1"


    // $ANTLR start "rule__Abstract__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1489:1: rule__Abstract__Group__1__Impl : ( 'a' ) ;
    public final void rule__Abstract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1493:1: ( ( 'a' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1494:1: ( 'a' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1494:1: ( 'a' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1495:1: 'a'
            {
             before(grammarAccess.getAbstractAccess().getAKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Abstract__Group__1__Impl3009); 
             after(grammarAccess.getAbstractAccess().getAKeyword_1()); 

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
    // $ANTLR end "rule__Abstract__Group__1__Impl"


    // $ANTLR start "rule__Abstract__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1508:1: rule__Abstract__Group__2 : rule__Abstract__Group__2__Impl rule__Abstract__Group__3 ;
    public final void rule__Abstract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1512:1: ( rule__Abstract__Group__2__Impl rule__Abstract__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1513:2: rule__Abstract__Group__2__Impl rule__Abstract__Group__3
            {
            pushFollow(FOLLOW_rule__Abstract__Group__2__Impl_in_rule__Abstract__Group__23040);
            rule__Abstract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__3_in_rule__Abstract__Group__23043);
            rule__Abstract__Group__3();

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
    // $ANTLR end "rule__Abstract__Group__2"


    // $ANTLR start "rule__Abstract__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1520:1: rule__Abstract__Group__2__Impl : ( ( rule__Abstract__ClassnameAssignment_2 ) ) ;
    public final void rule__Abstract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1524:1: ( ( ( rule__Abstract__ClassnameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1525:1: ( ( rule__Abstract__ClassnameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1525:1: ( ( rule__Abstract__ClassnameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1526:1: ( rule__Abstract__ClassnameAssignment_2 )
            {
             before(grammarAccess.getAbstractAccess().getClassnameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1527:1: ( rule__Abstract__ClassnameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1527:2: rule__Abstract__ClassnameAssignment_2
            {
            pushFollow(FOLLOW_rule__Abstract__ClassnameAssignment_2_in_rule__Abstract__Group__2__Impl3070);
            rule__Abstract__ClassnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getClassnameAssignment_2()); 

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
    // $ANTLR end "rule__Abstract__Group__2__Impl"


    // $ANTLR start "rule__Abstract__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1537:1: rule__Abstract__Group__3 : rule__Abstract__Group__3__Impl rule__Abstract__Group__4 ;
    public final void rule__Abstract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1541:1: ( rule__Abstract__Group__3__Impl rule__Abstract__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1542:2: rule__Abstract__Group__3__Impl rule__Abstract__Group__4
            {
            pushFollow(FOLLOW_rule__Abstract__Group__3__Impl_in_rule__Abstract__Group__33100);
            rule__Abstract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__4_in_rule__Abstract__Group__33103);
            rule__Abstract__Group__4();

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
    // $ANTLR end "rule__Abstract__Group__3"


    // $ANTLR start "rule__Abstract__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1549:1: rule__Abstract__Group__3__Impl : ( ( ':' )? ) ;
    public final void rule__Abstract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1553:1: ( ( ( ':' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1554:1: ( ( ':' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1554:1: ( ( ':' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1555:1: ( ':' )?
            {
             before(grammarAccess.getAbstractAccess().getColonKeyword_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1556:1: ( ':' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1557:2: ':'
                    {
                    match(input,17,FOLLOW_17_in_rule__Abstract__Group__3__Impl3132); 

                    }
                    break;

            }

             after(grammarAccess.getAbstractAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Abstract__Group__3__Impl"


    // $ANTLR start "rule__Abstract__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1568:1: rule__Abstract__Group__4 : rule__Abstract__Group__4__Impl rule__Abstract__Group__5 ;
    public final void rule__Abstract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1572:1: ( rule__Abstract__Group__4__Impl rule__Abstract__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1573:2: rule__Abstract__Group__4__Impl rule__Abstract__Group__5
            {
            pushFollow(FOLLOW_rule__Abstract__Group__4__Impl_in_rule__Abstract__Group__43165);
            rule__Abstract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__5_in_rule__Abstract__Group__43168);
            rule__Abstract__Group__5();

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
    // $ANTLR end "rule__Abstract__Group__4"


    // $ANTLR start "rule__Abstract__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1580:1: rule__Abstract__Group__4__Impl : ( ( rule__Abstract__ExtensionAssignment_4 )? ) ;
    public final void rule__Abstract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1584:1: ( ( ( rule__Abstract__ExtensionAssignment_4 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1585:1: ( ( rule__Abstract__ExtensionAssignment_4 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1585:1: ( ( rule__Abstract__ExtensionAssignment_4 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1586:1: ( rule__Abstract__ExtensionAssignment_4 )?
            {
             before(grammarAccess.getAbstractAccess().getExtensionAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1587:1: ( rule__Abstract__ExtensionAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1587:2: rule__Abstract__ExtensionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Abstract__ExtensionAssignment_4_in_rule__Abstract__Group__4__Impl3195);
                    rule__Abstract__ExtensionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractAccess().getExtensionAssignment_4()); 

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
    // $ANTLR end "rule__Abstract__Group__4__Impl"


    // $ANTLR start "rule__Abstract__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1597:1: rule__Abstract__Group__5 : rule__Abstract__Group__5__Impl rule__Abstract__Group__6 ;
    public final void rule__Abstract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1601:1: ( rule__Abstract__Group__5__Impl rule__Abstract__Group__6 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1602:2: rule__Abstract__Group__5__Impl rule__Abstract__Group__6
            {
            pushFollow(FOLLOW_rule__Abstract__Group__5__Impl_in_rule__Abstract__Group__53226);
            rule__Abstract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__6_in_rule__Abstract__Group__53229);
            rule__Abstract__Group__6();

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
    // $ANTLR end "rule__Abstract__Group__5"


    // $ANTLR start "rule__Abstract__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1609:1: rule__Abstract__Group__5__Impl : ( ( rule__Abstract__ImplementsAssignment_5 )* ) ;
    public final void rule__Abstract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1613:1: ( ( ( rule__Abstract__ImplementsAssignment_5 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1614:1: ( ( rule__Abstract__ImplementsAssignment_5 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1614:1: ( ( rule__Abstract__ImplementsAssignment_5 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1615:1: ( rule__Abstract__ImplementsAssignment_5 )*
            {
             before(grammarAccess.getAbstractAccess().getImplementsAssignment_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1616:1: ( rule__Abstract__ImplementsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1616:2: rule__Abstract__ImplementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Abstract__ImplementsAssignment_5_in_rule__Abstract__Group__5__Impl3256);
            	    rule__Abstract__ImplementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAbstractAccess().getImplementsAssignment_5()); 

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
    // $ANTLR end "rule__Abstract__Group__5__Impl"


    // $ANTLR start "rule__Abstract__Group__6"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1626:1: rule__Abstract__Group__6 : rule__Abstract__Group__6__Impl rule__Abstract__Group__7 ;
    public final void rule__Abstract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1630:1: ( rule__Abstract__Group__6__Impl rule__Abstract__Group__7 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1631:2: rule__Abstract__Group__6__Impl rule__Abstract__Group__7
            {
            pushFollow(FOLLOW_rule__Abstract__Group__6__Impl_in_rule__Abstract__Group__63287);
            rule__Abstract__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__7_in_rule__Abstract__Group__63290);
            rule__Abstract__Group__7();

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
    // $ANTLR end "rule__Abstract__Group__6"


    // $ANTLR start "rule__Abstract__Group__6__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1638:1: rule__Abstract__Group__6__Impl : ( '{' ) ;
    public final void rule__Abstract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1642:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1643:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1643:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1644:1: '{'
            {
             before(grammarAccess.getAbstractAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Abstract__Group__6__Impl3318); 
             after(grammarAccess.getAbstractAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Abstract__Group__6__Impl"


    // $ANTLR start "rule__Abstract__Group__7"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1657:1: rule__Abstract__Group__7 : rule__Abstract__Group__7__Impl rule__Abstract__Group__8 ;
    public final void rule__Abstract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1661:1: ( rule__Abstract__Group__7__Impl rule__Abstract__Group__8 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1662:2: rule__Abstract__Group__7__Impl rule__Abstract__Group__8
            {
            pushFollow(FOLLOW_rule__Abstract__Group__7__Impl_in_rule__Abstract__Group__73349);
            rule__Abstract__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__8_in_rule__Abstract__Group__73352);
            rule__Abstract__Group__8();

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
    // $ANTLR end "rule__Abstract__Group__7"


    // $ANTLR start "rule__Abstract__Group__7__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1669:1: rule__Abstract__Group__7__Impl : ( ( rule__Abstract__BodyAssignment_7 )* ) ;
    public final void rule__Abstract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1673:1: ( ( ( rule__Abstract__BodyAssignment_7 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1674:1: ( ( rule__Abstract__BodyAssignment_7 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1674:1: ( ( rule__Abstract__BodyAssignment_7 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1675:1: ( rule__Abstract__BodyAssignment_7 )*
            {
             before(grammarAccess.getAbstractAccess().getBodyAssignment_7()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1676:1: ( rule__Abstract__BodyAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=14 && LA19_0<=16)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1676:2: rule__Abstract__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Abstract__BodyAssignment_7_in_rule__Abstract__Group__7__Impl3379);
            	    rule__Abstract__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAbstractAccess().getBodyAssignment_7()); 

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
    // $ANTLR end "rule__Abstract__Group__7__Impl"


    // $ANTLR start "rule__Abstract__Group__8"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1686:1: rule__Abstract__Group__8 : rule__Abstract__Group__8__Impl ;
    public final void rule__Abstract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1690:1: ( rule__Abstract__Group__8__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1691:2: rule__Abstract__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Abstract__Group__8__Impl_in_rule__Abstract__Group__83410);
            rule__Abstract__Group__8__Impl();

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
    // $ANTLR end "rule__Abstract__Group__8"


    // $ANTLR start "rule__Abstract__Group__8__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1697:1: rule__Abstract__Group__8__Impl : ( '}' ) ;
    public final void rule__Abstract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1701:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1702:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1702:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1703:1: '}'
            {
             before(grammarAccess.getAbstractAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Abstract__Group__8__Impl3438); 
             after(grammarAccess.getAbstractAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Abstract__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1734:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1738:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1739:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03487);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03490);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1746:1: rule__Attribute__Group__0__Impl : ( ruleBodyVisibility ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1750:1: ( ( ruleBodyVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1751:1: ( ruleBodyVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1751:1: ( ruleBodyVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1752:1: ruleBodyVisibility
            {
             before(grammarAccess.getAttributeAccess().getBodyVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_rule__Attribute__Group__0__Impl3517);
            ruleBodyVisibility();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getBodyVisibilityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1763:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1767:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1768:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13546);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13549);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1775:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Alternatives_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1779:1: ( ( ( rule__Attribute__Alternatives_1 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1780:1: ( ( rule__Attribute__Alternatives_1 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1780:1: ( ( rule__Attribute__Alternatives_1 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1781:1: ( rule__Attribute__Alternatives_1 )?
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1782:1: ( rule__Attribute__Alternatives_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=12 && LA20_0<=13)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1782:2: rule__Attribute__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__Alternatives_1_in_rule__Attribute__Group__1__Impl3576);
                    rule__Attribute__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1792:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1796:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1797:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23607);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23610);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1804:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributenameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1808:1: ( ( ( rule__Attribute__AttributenameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1809:1: ( ( rule__Attribute__AttributenameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1809:1: ( ( rule__Attribute__AttributenameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1810:1: ( rule__Attribute__AttributenameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributenameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1811:1: ( rule__Attribute__AttributenameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1811:2: rule__Attribute__AttributenameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__AttributenameAssignment_2_in_rule__Attribute__Group__2__Impl3637);
            rule__Attribute__AttributenameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributenameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1821:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1825:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1826:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33667);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33670);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1833:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1837:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1838:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1838:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1839:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__Group__3__Impl3698); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1852:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1856:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1857:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43729);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__43732);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1864:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1868:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1869:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1869:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1870:1: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1871:1: ( rule__Attribute__TypeAssignment_4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1871:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl3759);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1881:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1885:1: ( rule__Attribute__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1886:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__53789);
            rule__Attribute__Group__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1892:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1896:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1897:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1897:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1898:1: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1899:1: ( rule__Attribute__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1899:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl3816);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1921:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1925:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1926:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__03859);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__03862);
            rule__Attribute__Group_5__1();

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
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1933:1: rule__Attribute__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1937:1: ( ( '[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1938:1: ( '[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1938:1: ( '[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1939:1: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__Attribute__Group_5__0__Impl3890); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1952:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1956:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1957:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__13921);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__13924);
            rule__Attribute__Group_5__2();

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
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1964:1: rule__Attribute__Group_5__1__Impl : ( ( RULE_NUMBER )? ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1968:1: ( ( ( RULE_NUMBER )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1969:1: ( ( RULE_NUMBER )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1969:1: ( ( RULE_NUMBER )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1970:1: ( RULE_NUMBER )?
            {
             before(grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1971:1: ( RULE_NUMBER )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_NUMBER) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1971:3: RULE_NUMBER
                    {
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Attribute__Group_5__1__Impl3952); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1981:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1985:1: ( rule__Attribute__Group_5__2__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1986:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__23983);
            rule__Attribute__Group_5__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5__2"


    // $ANTLR start "rule__Attribute__Group_5__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1992:1: rule__Attribute__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1996:1: ( ( ']' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1997:1: ( ']' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1997:1: ( ']' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1998:1: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,26,FOLLOW_26_in_rule__Attribute__Group_5__2__Impl4011); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__Attribute__Group_5__2__Impl"


    // $ANTLR start "rule__ParamIn__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2017:1: rule__ParamIn__Group__0 : rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1 ;
    public final void rule__ParamIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2021:1: ( rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2022:2: rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__0__Impl_in_rule__ParamIn__Group__04048);
            rule__ParamIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__1_in_rule__ParamIn__Group__04051);
            rule__ParamIn__Group__1();

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
    // $ANTLR end "rule__ParamIn__Group__0"


    // $ANTLR start "rule__ParamIn__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2029:1: rule__ParamIn__Group__0__Impl : ( ( rule__ParamIn__NameAssignment_0 ) ) ;
    public final void rule__ParamIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2033:1: ( ( ( rule__ParamIn__NameAssignment_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2034:1: ( ( rule__ParamIn__NameAssignment_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2034:1: ( ( rule__ParamIn__NameAssignment_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2035:1: ( rule__ParamIn__NameAssignment_0 )
            {
             before(grammarAccess.getParamInAccess().getNameAssignment_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2036:1: ( rule__ParamIn__NameAssignment_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2036:2: rule__ParamIn__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamIn__NameAssignment_0_in_rule__ParamIn__Group__0__Impl4078);
            rule__ParamIn__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamInAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ParamIn__Group__0__Impl"


    // $ANTLR start "rule__ParamIn__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2046:1: rule__ParamIn__Group__1 : rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2 ;
    public final void rule__ParamIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2050:1: ( rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2051:2: rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__1__Impl_in_rule__ParamIn__Group__14108);
            rule__ParamIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__2_in_rule__ParamIn__Group__14111);
            rule__ParamIn__Group__2();

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
    // $ANTLR end "rule__ParamIn__Group__1"


    // $ANTLR start "rule__ParamIn__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2058:1: rule__ParamIn__Group__1__Impl : ( ':' ) ;
    public final void rule__ParamIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2062:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2063:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2063:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2064:1: ':'
            {
             before(grammarAccess.getParamInAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ParamIn__Group__1__Impl4139); 
             after(grammarAccess.getParamInAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ParamIn__Group__1__Impl"


    // $ANTLR start "rule__ParamIn__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2077:1: rule__ParamIn__Group__2 : rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3 ;
    public final void rule__ParamIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2081:1: ( rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2082:2: rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__2__Impl_in_rule__ParamIn__Group__24170);
            rule__ParamIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__3_in_rule__ParamIn__Group__24173);
            rule__ParamIn__Group__3();

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
    // $ANTLR end "rule__ParamIn__Group__2"


    // $ANTLR start "rule__ParamIn__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2089:1: rule__ParamIn__Group__2__Impl : ( ( rule__ParamIn__TypeAssignment_2 ) ) ;
    public final void rule__ParamIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2093:1: ( ( ( rule__ParamIn__TypeAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2094:1: ( ( rule__ParamIn__TypeAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2094:1: ( ( rule__ParamIn__TypeAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2095:1: ( rule__ParamIn__TypeAssignment_2 )
            {
             before(grammarAccess.getParamInAccess().getTypeAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2096:1: ( rule__ParamIn__TypeAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2096:2: rule__ParamIn__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ParamIn__TypeAssignment_2_in_rule__ParamIn__Group__2__Impl4200);
            rule__ParamIn__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamInAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ParamIn__Group__2__Impl"


    // $ANTLR start "rule__ParamIn__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2106:1: rule__ParamIn__Group__3 : rule__ParamIn__Group__3__Impl ;
    public final void rule__ParamIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2110:1: ( rule__ParamIn__Group__3__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2111:2: rule__ParamIn__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__3__Impl_in_rule__ParamIn__Group__34230);
            rule__ParamIn__Group__3__Impl();

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
    // $ANTLR end "rule__ParamIn__Group__3"


    // $ANTLR start "rule__ParamIn__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2117:1: rule__ParamIn__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__ParamIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2121:1: ( ( ( ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2122:1: ( ( ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2122:1: ( ( ',' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2123:1: ( ',' )?
            {
             before(grammarAccess.getParamInAccess().getCommaKeyword_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2124:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2125:2: ','
                    {
                    match(input,20,FOLLOW_20_in_rule__ParamIn__Group__3__Impl4259); 

                    }
                    break;

            }

             after(grammarAccess.getParamInAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__ParamIn__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2144:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2148:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2149:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__04300);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__04303);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2156:1: rule__Method__Group__0__Impl : ( ruleBodyVisibility ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2160:1: ( ( ruleBodyVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2161:1: ( ruleBodyVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2161:1: ( ruleBodyVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2162:1: ruleBodyVisibility
            {
             before(grammarAccess.getMethodAccess().getBodyVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_rule__Method__Group__0__Impl4330);
            ruleBodyVisibility();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getBodyVisibilityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2173:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2177:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2178:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__14359);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__14362);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2185:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2189:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2190:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2190:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2191:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2192:1: ( rule__Method__NameAssignment_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2192:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4389);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2202:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2206:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2207:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__24419);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__24422);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2214:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2218:1: ( ( '(' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2219:1: ( '(' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2219:1: ( '(' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2220:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Method__Group__2__Impl4450); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2233:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2237:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2238:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34481);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34484);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2245:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParamAssignment_3 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2249:1: ( ( ( rule__Method__ParamAssignment_3 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2250:1: ( ( rule__Method__ParamAssignment_3 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2250:1: ( ( rule__Method__ParamAssignment_3 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2251:1: ( rule__Method__ParamAssignment_3 )*
            {
             before(grammarAccess.getMethodAccess().getParamAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2252:1: ( rule__Method__ParamAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2252:2: rule__Method__ParamAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Method__ParamAssignment_3_in_rule__Method__Group__3__Impl4511);
            	    rule__Method__ParamAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getParamAssignment_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2262:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2266:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2267:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44542);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44545);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2274:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2278:1: ( ( ')' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2279:1: ( ')' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2279:1: ( ')' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2280:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Method__Group__4__Impl4573); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2293:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2297:1: ( rule__Method__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2298:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54604);
            rule__Method__Group__5__Impl();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2304:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2308:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2309:1: ( ( rule__Method__Group_5__0 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2309:1: ( ( rule__Method__Group_5__0 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2310:1: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2311:1: ( rule__Method__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2311:2: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_5__0_in_rule__Method__Group__5__Impl4631);
                    rule__Method__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_5__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2333:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2337:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2338:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_rule__Method__Group_5__0__Impl_in_rule__Method__Group_5__04674);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_5__1_in_rule__Method__Group_5__04677);
            rule__Method__Group_5__1();

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
    // $ANTLR end "rule__Method__Group_5__0"


    // $ANTLR start "rule__Method__Group_5__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2345:1: rule__Method__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2349:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2350:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2350:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2351:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_5_0()); 
            match(input,17,FOLLOW_17_in_rule__Method__Group_5__0__Impl4705); 
             after(grammarAccess.getMethodAccess().getColonKeyword_5_0()); 

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
    // $ANTLR end "rule__Method__Group_5__0__Impl"


    // $ANTLR start "rule__Method__Group_5__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2364:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2368:1: ( rule__Method__Group_5__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2369:2: rule__Method__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_5__1__Impl_in_rule__Method__Group_5__14736);
            rule__Method__Group_5__1__Impl();

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
    // $ANTLR end "rule__Method__Group_5__1"


    // $ANTLR start "rule__Method__Group_5__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2375:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2379:1: ( ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2380:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2380:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2381:1: ( rule__Method__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2382:1: ( rule__Method__ReturnTypeAssignment_5_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2382:2: rule__Method__ReturnTypeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Method__ReturnTypeAssignment_5_1_in_rule__Method__Group_5__1__Impl4763);
            rule__Method__ReturnTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__Method__Group_5__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2396:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2400:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2401:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__04797);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__04800);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2408:1: rule__Package__Group__0__Impl : ( ( rule__Package__NameAssignment_0 )? ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2412:1: ( ( ( rule__Package__NameAssignment_0 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2413:1: ( ( rule__Package__NameAssignment_0 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2413:1: ( ( rule__Package__NameAssignment_0 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2414:1: ( rule__Package__NameAssignment_0 )?
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2415:1: ( rule__Package__NameAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2415:2: rule__Package__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Package__NameAssignment_0_in_rule__Package__Group__0__Impl4827);
                    rule__Package__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2425:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2429:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2430:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__14858);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__14861);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2437:1: rule__Package__Group__1__Impl : ( ( rule__Package__Group_1__0 )* ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2441:1: ( ( ( rule__Package__Group_1__0 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2442:1: ( ( rule__Package__Group_1__0 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2442:1: ( ( rule__Package__Group_1__0 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2443:1: ( rule__Package__Group_1__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2444:1: ( rule__Package__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2444:2: rule__Package__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Package__Group_1__0_in_rule__Package__Group__1__Impl4888);
            	    rule__Package__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2454:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2458:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2459:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__24919);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__24922);
            rule__Package__Group__3();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2466:1: rule__Package__Group__2__Impl : ( '[[' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2470:1: ( ( '[[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2471:1: ( '[[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2471:1: ( '[[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2472:1: '[['
            {
             before(grammarAccess.getPackageAccess().getLeftSquareBracketLeftSquareBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Package__Group__2__Impl4950); 
             after(grammarAccess.getPackageAccess().getLeftSquareBracketLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2485:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2489:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2490:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__34981);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__34984);
            rule__Package__Group__4();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2497:1: rule__Package__Group__3__Impl : ( ( rule__Package__ClassTypeAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2501:1: ( ( ( rule__Package__ClassTypeAssignment_3 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2502:1: ( ( rule__Package__ClassTypeAssignment_3 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2502:1: ( ( rule__Package__ClassTypeAssignment_3 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2503:1: ( rule__Package__ClassTypeAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getClassTypeAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2504:1: ( rule__Package__ClassTypeAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=14 && LA28_0<=15)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2504:2: rule__Package__ClassTypeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__ClassTypeAssignment_3_in_rule__Package__Group__3__Impl5011);
            	    rule__Package__ClassTypeAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getClassTypeAssignment_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2514:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2518:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2519:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__45042);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__45045);
            rule__Package__Group__5();

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
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2526:1: rule__Package__Group__4__Impl : ( ( rule__Package__SubPackageAssignment_4 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2530:1: ( ( ( rule__Package__SubPackageAssignment_4 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2531:1: ( ( rule__Package__SubPackageAssignment_4 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2531:1: ( ( rule__Package__SubPackageAssignment_4 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2532:1: ( rule__Package__SubPackageAssignment_4 )?
            {
             before(grammarAccess.getPackageAccess().getSubPackageAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2533:1: ( rule__Package__SubPackageAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==29||LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2533:2: rule__Package__SubPackageAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Package__SubPackageAssignment_4_in_rule__Package__Group__4__Impl5072);
                    rule__Package__SubPackageAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getSubPackageAssignment_4()); 

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
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2543:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2547:1: ( rule__Package__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2548:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__55103);
            rule__Package__Group__5__Impl();

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
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2554:1: rule__Package__Group__5__Impl : ( ']]' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2558:1: ( ( ']]' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2559:1: ( ']]' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2559:1: ( ']]' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2560:1: ']]'
            {
             before(grammarAccess.getPackageAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Package__Group__5__Impl5131); 
             after(grammarAccess.getPackageAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group_1__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2585:1: rule__Package__Group_1__0 : rule__Package__Group_1__0__Impl rule__Package__Group_1__1 ;
    public final void rule__Package__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2589:1: ( rule__Package__Group_1__0__Impl rule__Package__Group_1__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2590:2: rule__Package__Group_1__0__Impl rule__Package__Group_1__1
            {
            pushFollow(FOLLOW_rule__Package__Group_1__0__Impl_in_rule__Package__Group_1__05174);
            rule__Package__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_1__1_in_rule__Package__Group_1__05177);
            rule__Package__Group_1__1();

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
    // $ANTLR end "rule__Package__Group_1__0"


    // $ANTLR start "rule__Package__Group_1__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2597:1: rule__Package__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Package__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2601:1: ( ( '.' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2602:1: ( '.' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2602:1: ( '.' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2603:1: '.'
            {
             before(grammarAccess.getPackageAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Package__Group_1__0__Impl5205); 
             after(grammarAccess.getPackageAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Package__Group_1__0__Impl"


    // $ANTLR start "rule__Package__Group_1__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2616:1: rule__Package__Group_1__1 : rule__Package__Group_1__1__Impl ;
    public final void rule__Package__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2620:1: ( rule__Package__Group_1__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2621:2: rule__Package__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_1__1__Impl_in_rule__Package__Group_1__15236);
            rule__Package__Group_1__1__Impl();

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
    // $ANTLR end "rule__Package__Group_1__1"


    // $ANTLR start "rule__Package__Group_1__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2627:1: rule__Package__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Package__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2631:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2632:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2632:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2633:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__Group_1__1__Impl5263); 
             after(grammarAccess.getPackageAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Package__Group_1__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2649:1: rule__Model__GreetingsAssignment : ( rulePackage ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2653:1: ( ( rulePackage ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2654:1: ( rulePackage )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2654:1: ( rulePackage )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2655:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getGreetingsPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__GreetingsAssignment5301);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsPackageParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Class__ClassnameAssignment_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2664:1: rule__Class__ClassnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2668:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2669:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2669:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2670:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getClassnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ClassnameAssignment_15332); 
             after(grammarAccess.getClassAccess().getClassnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Class__ClassnameAssignment_1"


    // $ANTLR start "rule__Class__ExtensionAssignment_3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2679:1: rule__Class__ExtensionAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__ExtensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2683:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2684:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2684:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2685:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getExtensionIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ExtensionAssignment_35363); 
             after(grammarAccess.getClassAccess().getExtensionIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Class__ExtensionAssignment_3"


    // $ANTLR start "rule__Class__ImplementsAssignment_4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2694:1: rule__Class__ImplementsAssignment_4 : ( ruleImplements ) ;
    public final void rule__Class__ImplementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2698:1: ( ( ruleImplements ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2699:1: ( ruleImplements )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2699:1: ( ruleImplements )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2700:1: ruleImplements
            {
             before(grammarAccess.getClassAccess().getImplementsImplementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleImplements_in_rule__Class__ImplementsAssignment_45394);
            ruleImplements();

            state._fsp--;

             after(grammarAccess.getClassAccess().getImplementsImplementsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Class__ImplementsAssignment_4"


    // $ANTLR start "rule__Class__BodyAssignment_6"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2709:1: rule__Class__BodyAssignment_6 : ( ( rule__Class__BodyAlternatives_6_0 ) ) ;
    public final void rule__Class__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2713:1: ( ( ( rule__Class__BodyAlternatives_6_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2714:1: ( ( rule__Class__BodyAlternatives_6_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2714:1: ( ( rule__Class__BodyAlternatives_6_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2715:1: ( rule__Class__BodyAlternatives_6_0 )
            {
             before(grammarAccess.getClassAccess().getBodyAlternatives_6_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2716:1: ( rule__Class__BodyAlternatives_6_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2716:2: rule__Class__BodyAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Class__BodyAlternatives_6_0_in_rule__Class__BodyAssignment_65425);
            rule__Class__BodyAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getBodyAlternatives_6_0()); 

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
    // $ANTLR end "rule__Class__BodyAssignment_6"


    // $ANTLR start "rule__Dependancy__NameAssignment_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2725:1: rule__Dependancy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dependancy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2729:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2730:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2730:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2731:1: RULE_ID
            {
             before(grammarAccess.getDependancyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependancy__NameAssignment_15458); 
             after(grammarAccess.getDependancyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dependancy__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__ClassnameAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2740:1: rule__Enumeration__ClassnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2744:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2745:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2745:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2746:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getClassnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__ClassnameAssignment_25489); 
             after(grammarAccess.getEnumerationAccess().getClassnameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Enumeration__ClassnameAssignment_2"


    // $ANTLR start "rule__Interface__MethodnameAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2755:1: rule__Interface__MethodnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__MethodnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2759:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2760:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2760:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2761:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getMethodnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__MethodnameAssignment_25520); 
             after(grammarAccess.getInterfaceAccess().getMethodnameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Interface__MethodnameAssignment_2"


    // $ANTLR start "rule__Interface__BodyAssignment_4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2770:1: rule__Interface__BodyAssignment_4 : ( ruleMethod ) ;
    public final void rule__Interface__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2774:1: ( ( ruleMethod ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2775:1: ( ruleMethod )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2775:1: ( ruleMethod )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2776:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getBodyMethodParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__BodyAssignment_45551);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getBodyMethodParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Interface__BodyAssignment_4"


    // $ANTLR start "rule__Abstract__ClassnameAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2785:1: rule__Abstract__ClassnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Abstract__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2789:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2790:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2790:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2791:1: RULE_ID
            {
             before(grammarAccess.getAbstractAccess().getClassnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abstract__ClassnameAssignment_25582); 
             after(grammarAccess.getAbstractAccess().getClassnameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Abstract__ClassnameAssignment_2"


    // $ANTLR start "rule__Abstract__ExtensionAssignment_4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2800:1: rule__Abstract__ExtensionAssignment_4 : ( RULE_ID ) ;
    public final void rule__Abstract__ExtensionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2804:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2805:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2805:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2806:1: RULE_ID
            {
             before(grammarAccess.getAbstractAccess().getExtensionIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abstract__ExtensionAssignment_45613); 
             after(grammarAccess.getAbstractAccess().getExtensionIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Abstract__ExtensionAssignment_4"


    // $ANTLR start "rule__Abstract__ImplementsAssignment_5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2815:1: rule__Abstract__ImplementsAssignment_5 : ( ruleImplements ) ;
    public final void rule__Abstract__ImplementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2819:1: ( ( ruleImplements ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2820:1: ( ruleImplements )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2820:1: ( ruleImplements )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2821:1: ruleImplements
            {
             before(grammarAccess.getAbstractAccess().getImplementsImplementsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleImplements_in_rule__Abstract__ImplementsAssignment_55644);
            ruleImplements();

            state._fsp--;

             after(grammarAccess.getAbstractAccess().getImplementsImplementsParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Abstract__ImplementsAssignment_5"


    // $ANTLR start "rule__Abstract__BodyAssignment_7"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2830:1: rule__Abstract__BodyAssignment_7 : ( ( rule__Abstract__BodyAlternatives_7_0 ) ) ;
    public final void rule__Abstract__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2834:1: ( ( ( rule__Abstract__BodyAlternatives_7_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2835:1: ( ( rule__Abstract__BodyAlternatives_7_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2835:1: ( ( rule__Abstract__BodyAlternatives_7_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2836:1: ( rule__Abstract__BodyAlternatives_7_0 )
            {
             before(grammarAccess.getAbstractAccess().getBodyAlternatives_7_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2837:1: ( rule__Abstract__BodyAlternatives_7_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2837:2: rule__Abstract__BodyAlternatives_7_0
            {
            pushFollow(FOLLOW_rule__Abstract__BodyAlternatives_7_0_in_rule__Abstract__BodyAssignment_75675);
            rule__Abstract__BodyAlternatives_7_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getBodyAlternatives_7_0()); 

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
    // $ANTLR end "rule__Abstract__BodyAssignment_7"


    // $ANTLR start "rule__Attribute__AttributenameAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2846:1: rule__Attribute__AttributenameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2850:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2851:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2851:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2852:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__AttributenameAssignment_25708); 
             after(grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__AttributenameAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2861:1: rule__Attribute__TypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2865:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2866:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2866:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2867:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_45739); 
             after(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__ParamIn__NameAssignment_0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2876:1: rule__ParamIn__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParamIn__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2880:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2881:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2881:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2882:1: RULE_ID
            {
             before(grammarAccess.getParamInAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParamIn__NameAssignment_05770); 
             after(grammarAccess.getParamInAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ParamIn__NameAssignment_0"


    // $ANTLR start "rule__ParamIn__TypeAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2891:1: rule__ParamIn__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParamIn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2895:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2896:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2896:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2897:1: RULE_ID
            {
             before(grammarAccess.getParamInAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParamIn__TypeAssignment_25801); 
             after(grammarAccess.getParamInAccess().getTypeIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ParamIn__TypeAssignment_2"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2906:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2910:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2911:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2911:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2912:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_15832); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParamAssignment_3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2921:1: rule__Method__ParamAssignment_3 : ( ruleparamIn ) ;
    public final void rule__Method__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2925:1: ( ( ruleparamIn ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2926:1: ( ruleparamIn )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2926:1: ( ruleparamIn )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2927:1: ruleparamIn
            {
             before(grammarAccess.getMethodAccess().getParamParamInParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleparamIn_in_rule__Method__ParamAssignment_35863);
            ruleparamIn();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParamParamInParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Method__ParamAssignment_3"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_5_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2936:1: rule__Method__ReturnTypeAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Method__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2940:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2941:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2941:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2942:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReturnTypeIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_5_15894); 
             after(grammarAccess.getMethodAccess().getReturnTypeIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Method__ReturnTypeAssignment_5_1"


    // $ANTLR start "rule__Package__NameAssignment_0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2951:1: rule__Package__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2955:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2956:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2956:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2957:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_05925); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_0"


    // $ANTLR start "rule__Package__ClassTypeAssignment_3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2966:1: rule__Package__ClassTypeAssignment_3 : ( ruleElements ) ;
    public final void rule__Package__ClassTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2970:1: ( ( ruleElements ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2971:1: ( ruleElements )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2971:1: ( ruleElements )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2972:1: ruleElements
            {
             before(grammarAccess.getPackageAccess().getClassTypeElementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleElements_in_rule__Package__ClassTypeAssignment_35956);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassTypeElementsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Package__ClassTypeAssignment_3"


    // $ANTLR start "rule__Package__SubPackageAssignment_4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2981:1: rule__Package__SubPackageAssignment_4 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2985:1: ( ( rulePackage ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2986:1: ( rulePackage )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2986:1: ( rulePackage )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2987:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_45987);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Package__SubPackageAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x00000000A0000012L});
    public static final BitSet FOLLOW_ruleElements_in_entryRuleElements122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElements129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elements__Alternatives_in_ruleElements155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_entryRuleImplements242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplements249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implements__Group__0_in_ruleImplements275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_entryRuleDependancy302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependancy309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__0_in_ruleDependancy335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__0_in_ruleAbstract515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparamIn_in_entryRuleparamIn602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparamIn609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__0_in_ruleparamIn635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyVisibility729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyVisibility__Alternatives_in_ruleBodyVisibility755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassVisibility789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassVisibility__Alternatives_in_ruleClassVisibility815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Elements__Alternatives911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Elements__Alternatives928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__Elements__Alternatives945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Elements__Alternatives962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Class__BodyAlternatives_6_0994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Class__BodyAlternatives_6_01011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_rule__Class__BodyAlternatives_6_01028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Abstract__BodyAlternatives_7_01060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Abstract__BodyAlternatives_7_01077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Attribute__Alternatives_11110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Attribute__Alternatives_11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BodyVisibility__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BodyVisibility__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BodyVisibility__Alternatives1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ClassVisibility__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ClassVisibility__Alternatives1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Class__Group__0__Impl1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11351 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ClassnameAssignment_1_in_rule__Class__Group__1__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21411 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Class__Group__2__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31476 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ExtensionAssignment_3_in_rule__Class__Group__3__Impl1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41537 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ImplementsAssignment_4_in_rule__Class__Group__4__Impl1567 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51598 = new BitSet(new long[]{0x000000000029C000L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class__Group__5__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61660 = new BitSet(new long[]{0x000000000029C000L});
    public static final BitSet FOLLOW_rule__Class__Group__7_in_rule__Class__Group__61663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__BodyAssignment_6_in_rule__Class__Group__6__Impl1690 = new BitSet(new long[]{0x000000000021C002L});
    public static final BitSet FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__71721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group__7__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implements__Group__0__Impl_in_rule__Implements__Group__01796 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Implements__Group__1_in_rule__Implements__Group__01799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Implements__Group__0__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implements__Group__1__Impl_in_rule__Implements__Group__11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Implements__Group__1__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__01921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__01924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Dependancy__Group__0__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__NameAssignment_1_in_rule__Dependancy__Group__1__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02044 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Enumeration__Group__0__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Enumeration__Group__1__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22165 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__ClassnameAssignment_2_in_rule__Enumeration__Group__2__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32225 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Enumeration__Group__3__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42287 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl2317 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__52348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__5__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__02419 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__02422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__Group_4__0__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enumeration__Group_4__1__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02544 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Interface__Group__0__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface__Group__1__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__22665 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__22668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodnameAssignment_2_in_rule__Interface__Group__2__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__32725 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__32728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Interface__Group__3__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__42787 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__42790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__BodyAssignment_4_in_rule__Interface__Group__4__Impl2817 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__52848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Interface__Group__5__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__02919 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__02922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Abstract__Group__0__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__12978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Abstract__Group__2_in_rule__Abstract__Group__12981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Abstract__Group__1__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__2__Impl_in_rule__Abstract__Group__23040 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Abstract__Group__3_in_rule__Abstract__Group__23043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ClassnameAssignment_2_in_rule__Abstract__Group__2__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__3__Impl_in_rule__Abstract__Group__33100 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Abstract__Group__4_in_rule__Abstract__Group__33103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Abstract__Group__3__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__4__Impl_in_rule__Abstract__Group__43165 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Abstract__Group__5_in_rule__Abstract__Group__43168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ExtensionAssignment_4_in_rule__Abstract__Group__4__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__5__Impl_in_rule__Abstract__Group__53226 = new BitSet(new long[]{0x0000000000160010L});
    public static final BitSet FOLLOW_rule__Abstract__Group__6_in_rule__Abstract__Group__53229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ImplementsAssignment_5_in_rule__Abstract__Group__5__Impl3256 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_rule__Abstract__Group__6__Impl_in_rule__Abstract__Group__63287 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__7_in_rule__Abstract__Group__63290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Abstract__Group__6__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__7__Impl_in_rule__Abstract__Group__73349 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__8_in_rule__Abstract__Group__73352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__BodyAssignment_7_in_rule__Abstract__Group__7__Impl3379 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__8__Impl_in_rule__Abstract__Group__83410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Abstract__Group__8__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03487 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_rule__Attribute__Group__0__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13546 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_1_in_rule__Attribute__Group__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23607 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttributenameAssignment_2_in_rule__Attribute__Group__2__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group__3__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43729 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__43732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__53789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__03859 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__03862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Attribute__Group_5__0__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__13921 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__13924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Attribute__Group_5__1__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__23983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Attribute__Group_5__2__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__0__Impl_in_rule__ParamIn__Group__04048 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__1_in_rule__ParamIn__Group__04051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__NameAssignment_0_in_rule__ParamIn__Group__0__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__1__Impl_in_rule__ParamIn__Group__14108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__2_in_rule__ParamIn__Group__14111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ParamIn__Group__1__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__2__Impl_in_rule__ParamIn__Group__24170 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__3_in_rule__ParamIn__Group__24173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__TypeAssignment_2_in_rule__ParamIn__Group__2__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__3__Impl_in_rule__ParamIn__Group__34230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ParamIn__Group__3__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__04300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__04303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_rule__Method__Group__0__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__14359 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__24419 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__24422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Method__Group__2__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34481 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParamAssignment_3_in_rule__Method__Group__3__Impl4511 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44542 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method__Group__4__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__0_in_rule__Method__Group__5__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__0__Impl_in_rule__Method__Group_5__04674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_5__1_in_rule__Method__Group_5__04677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Method__Group_5__0__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__1__Impl_in_rule__Method__Group_5__14736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_5_1_in_rule__Method__Group_5__1__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__04797 = new BitSet(new long[]{0x00000000A0000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__04800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_0_in_rule__Package__Group__0__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__14858 = new BitSet(new long[]{0x00000000A0000010L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__14861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_1__0_in_rule__Package__Group__1__Impl4888 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__24919 = new BitSet(new long[]{0x00000000E000C010L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__24922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Package__Group__2__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__34981 = new BitSet(new long[]{0x00000000E000C010L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__34984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ClassTypeAssignment_3_in_rule__Package__Group__3__Impl5011 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__45042 = new BitSet(new long[]{0x00000000E000C010L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__45045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__SubPackageAssignment_4_in_rule__Package__Group__4__Impl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__55103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Package__Group__5__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_1__0__Impl_in_rule__Package__Group_1__05174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group_1__1_in_rule__Package__Group_1__05177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Package__Group_1__0__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_1__1__Impl_in_rule__Package__Group_1__15236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__Group_1__1__Impl5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__GreetingsAssignment5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ClassnameAssignment_15332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ExtensionAssignment_35363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_rule__Class__ImplementsAssignment_45394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__BodyAlternatives_6_0_in_rule__Class__BodyAssignment_65425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependancy__NameAssignment_15458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__ClassnameAssignment_25489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__MethodnameAssignment_25520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__BodyAssignment_45551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abstract__ClassnameAssignment_25582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abstract__ExtensionAssignment_45613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_rule__Abstract__ImplementsAssignment_55644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__BodyAlternatives_7_0_in_rule__Abstract__BodyAssignment_75675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__AttributenameAssignment_25708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_45739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParamIn__NameAssignment_05770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParamIn__TypeAssignment_25801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparamIn_in_rule__Method__ParamAssignment_35863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_5_15894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_05925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElements_in_rule__Package__ClassTypeAssignment_35956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_45987 = new BitSet(new long[]{0x0000000000000002L});

}