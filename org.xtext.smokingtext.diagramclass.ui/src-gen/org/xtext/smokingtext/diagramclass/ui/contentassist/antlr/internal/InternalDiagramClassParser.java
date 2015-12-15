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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'<>'", "'<!>'", "'+'", "'-'", "'#'", "':'", "'{'", "'}'", "','", "'->'", "'e'", "'i'", "'a'", "'['", "']'", "'..'", "'('", "')'", "'[['", "']]'", "'.'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=4;
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

                if ( (LA1_0==RULE_ID||LA1_0==31||LA1_0==33) ) {
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


    // $ANTLR start "entryRuleBiRelation"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:284:1: entryRuleBiRelation : ruleBiRelation EOF ;
    public final void entryRuleBiRelation() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:285:1: ( ruleBiRelation EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:286:1: ruleBiRelation EOF
            {
             before(grammarAccess.getBiRelationRule()); 
            pushFollow(FOLLOW_ruleBiRelation_in_entryRuleBiRelation542);
            ruleBiRelation();

            state._fsp--;

             after(grammarAccess.getBiRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBiRelation549); 

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
    // $ANTLR end "entryRuleBiRelation"


    // $ANTLR start "ruleBiRelation"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:293:1: ruleBiRelation : ( ( rule__BiRelation__Group__0 ) ) ;
    public final void ruleBiRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:297:2: ( ( ( rule__BiRelation__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:298:1: ( ( rule__BiRelation__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:298:1: ( ( rule__BiRelation__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:299:1: ( rule__BiRelation__Group__0 )
            {
             before(grammarAccess.getBiRelationAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:300:1: ( rule__BiRelation__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:300:2: rule__BiRelation__Group__0
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__0_in_ruleBiRelation575);
            rule__BiRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBiRelationAccess().getGroup()); 

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
    // $ANTLR end "ruleBiRelation"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:312:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:313:1: ( ruleAttribute EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:314:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute602);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute609); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:321:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:325:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:326:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:326:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:327:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:328:1: ( rule__Attribute__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:328:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:340:1: entryRuleparamIn : ruleparamIn EOF ;
    public final void entryRuleparamIn() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:341:1: ( ruleparamIn EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:342:1: ruleparamIn EOF
            {
             before(grammarAccess.getParamInRule()); 
            pushFollow(FOLLOW_ruleparamIn_in_entryRuleparamIn662);
            ruleparamIn();

            state._fsp--;

             after(grammarAccess.getParamInRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparamIn669); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:349:1: ruleparamIn : ( ( rule__ParamIn__Group__0 ) ) ;
    public final void ruleparamIn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:353:2: ( ( ( rule__ParamIn__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:354:1: ( ( rule__ParamIn__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:354:1: ( ( rule__ParamIn__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:355:1: ( rule__ParamIn__Group__0 )
            {
             before(grammarAccess.getParamInAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:356:1: ( rule__ParamIn__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:356:2: rule__ParamIn__Group__0
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__0_in_ruleparamIn695);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:368:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:369:1: ( ruleMethod EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:370:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod722);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod729); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:377:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:381:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:382:1: ( ( rule__Method__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:382:1: ( ( rule__Method__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:383:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:384:1: ( rule__Method__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:384:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod755);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:396:1: entryRuleBodyVisibility : ruleBodyVisibility EOF ;
    public final void entryRuleBodyVisibility() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:397:1: ( ruleBodyVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:398:1: ruleBodyVisibility EOF
            {
             before(grammarAccess.getBodyVisibilityRule()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility782);
            ruleBodyVisibility();

            state._fsp--;

             after(grammarAccess.getBodyVisibilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyVisibility789); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:405:1: ruleBodyVisibility : ( ( rule__BodyVisibility__Alternatives ) ) ;
    public final void ruleBodyVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:409:2: ( ( ( rule__BodyVisibility__Alternatives ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:410:1: ( ( rule__BodyVisibility__Alternatives ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:410:1: ( ( rule__BodyVisibility__Alternatives ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:411:1: ( rule__BodyVisibility__Alternatives )
            {
             before(grammarAccess.getBodyVisibilityAccess().getAlternatives()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:412:1: ( rule__BodyVisibility__Alternatives )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:412:2: rule__BodyVisibility__Alternatives
            {
            pushFollow(FOLLOW_rule__BodyVisibility__Alternatives_in_ruleBodyVisibility815);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:424:1: entryRuleClassVisibility : ruleClassVisibility EOF ;
    public final void entryRuleClassVisibility() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:425:1: ( ruleClassVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:426:1: ruleClassVisibility EOF
            {
             before(grammarAccess.getClassVisibilityRule()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility842);
            ruleClassVisibility();

            state._fsp--;

             after(grammarAccess.getClassVisibilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassVisibility849); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:433:1: ruleClassVisibility : ( ( rule__ClassVisibility__Alternatives ) ) ;
    public final void ruleClassVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:437:2: ( ( ( rule__ClassVisibility__Alternatives ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:438:1: ( ( rule__ClassVisibility__Alternatives ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:438:1: ( ( rule__ClassVisibility__Alternatives ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:439:1: ( rule__ClassVisibility__Alternatives )
            {
             before(grammarAccess.getClassVisibilityAccess().getAlternatives()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:440:1: ( rule__ClassVisibility__Alternatives )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:440:2: rule__ClassVisibility__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassVisibility__Alternatives_in_ruleClassVisibility875);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:452:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:453:1: ( rulePackage EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:454:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage902);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage909); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:461:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:465:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:466:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:466:1: ( ( rule__Package__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:467:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:468:1: ( rule__Package__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:468:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage935);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:480:1: rule__Elements__Alternatives : ( ( ruleClass ) | ( ruleInterface ) | ( ruleAbstract ) | ( ruleEnumeration ) );
    public final void rule__Elements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:484:1: ( ( ruleClass ) | ( ruleInterface ) | ( ruleAbstract ) | ( ruleEnumeration ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                case 23:
                    {
                    alt2=4;
                    }
                    break;
                case 24:
                    {
                    alt2=2;
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
            else if ( (LA2_0==16) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                case 23:
                    {
                    alt2=4;
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
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:485:1: ( ruleClass )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:485:1: ( ruleClass )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:486:1: ruleClass
                    {
                     before(grammarAccess.getElementsAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__Elements__Alternatives971);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:491:6: ( ruleInterface )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:491:6: ( ruleInterface )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:492:1: ruleInterface
                    {
                     before(grammarAccess.getElementsAccess().getInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterface_in_rule__Elements__Alternatives988);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getInterfaceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:497:6: ( ruleAbstract )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:497:6: ( ruleAbstract )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:498:1: ruleAbstract
                    {
                     before(grammarAccess.getElementsAccess().getAbstractParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAbstract_in_rule__Elements__Alternatives1005);
                    ruleAbstract();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getAbstractParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:503:6: ( ruleEnumeration )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:503:6: ( ruleEnumeration )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:504:1: ruleEnumeration
                    {
                     before(grammarAccess.getElementsAccess().getEnumerationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Elements__Alternatives1022);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:514:1: rule__Class__BodyAlternatives_6_0 : ( ( ruleAttribute ) | ( ruleMethod ) | ( ruleDependancy ) );
    public final void rule__Class__BodyAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:518:1: ( ( ruleAttribute ) | ( ruleMethod ) | ( ruleDependancy ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==29) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==18) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_1>=13 && LA3_1<=14)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==29) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==18) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_2>=13 && LA3_2<=14)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==29) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==18) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_3>=13 && LA3_3<=14)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
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
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:519:1: ( ruleAttribute )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:519:1: ( ruleAttribute )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:520:1: ruleAttribute
                    {
                     before(grammarAccess.getClassAccess().getBodyAttributeParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Class__BodyAlternatives_6_01054);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getBodyAttributeParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:525:6: ( ruleMethod )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:525:6: ( ruleMethod )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:526:1: ruleMethod
                    {
                     before(grammarAccess.getClassAccess().getBodyMethodParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Class__BodyAlternatives_6_01071);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getBodyMethodParserRuleCall_6_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:531:6: ( ruleDependancy )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:531:6: ( ruleDependancy )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:532:1: ruleDependancy
                    {
                     before(grammarAccess.getClassAccess().getBodyDependancyParserRuleCall_6_0_2()); 
                    pushFollow(FOLLOW_ruleDependancy_in_rule__Class__BodyAlternatives_6_01088);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:542:1: rule__Abstract__BodyAlternatives_7_0 : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Abstract__BodyAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:546:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==29) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA4_1>=13 && LA4_1<=14)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==29) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA4_2>=13 && LA4_2<=14)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==29) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA4_3>=13 && LA4_3<=14)) ) {
                    alt4=1;
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
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:547:1: ( ruleAttribute )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:547:1: ( ruleAttribute )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:548:1: ruleAttribute
                    {
                     before(grammarAccess.getAbstractAccess().getBodyAttributeParserRuleCall_7_0_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Abstract__BodyAlternatives_7_01120);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getBodyAttributeParserRuleCall_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:553:6: ( ruleMethod )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:553:6: ( ruleMethod )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:554:1: ruleMethod
                    {
                     before(grammarAccess.getAbstractAccess().getBodyMethodParserRuleCall_7_0_1()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Abstract__BodyAlternatives_7_01137);
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


    // $ANTLR start "rule__BiRelation__Alternatives_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:564:1: rule__BiRelation__Alternatives_1 : ( ( ( rule__BiRelation__Group_1_0__0 ) ) | ( '*' ) );
    public final void rule__BiRelation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:568:1: ( ( ( rule__BiRelation__Group_1_0__0 ) ) | ( '*' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NUMBER) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:569:1: ( ( rule__BiRelation__Group_1_0__0 ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:569:1: ( ( rule__BiRelation__Group_1_0__0 ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:570:1: ( rule__BiRelation__Group_1_0__0 )
                    {
                     before(grammarAccess.getBiRelationAccess().getGroup_1_0()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:571:1: ( rule__BiRelation__Group_1_0__0 )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:571:2: rule__BiRelation__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__BiRelation__Group_1_0__0_in_rule__BiRelation__Alternatives_11169);
                    rule__BiRelation__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBiRelationAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:575:6: ( '*' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:575:6: ( '*' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:576:1: '*'
                    {
                     before(grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BiRelation__Alternatives_11188); 
                     after(grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_1()); 

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
    // $ANTLR end "rule__BiRelation__Alternatives_1"


    // $ANTLR start "rule__BiRelation__Alternatives_1_0_1_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:588:1: rule__BiRelation__Alternatives_1_0_1_1 : ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) | ( '*' ) );
    public final void rule__BiRelation__Alternatives_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:592:1: ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) | ( '*' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NUMBER) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:593:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:593:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:594:1: ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:594:1: ( ( RULE_NUMBER ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:595:1: ( RULE_NUMBER )
                    {
                     before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_1_1_0()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:596:1: ( RULE_NUMBER )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:596:3: RULE_NUMBER
                    {
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_1_0_1_11225); 

                    }

                     after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_1_1_0()); 

                    }

                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:599:1: ( ( RULE_NUMBER )* )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:600:1: ( RULE_NUMBER )*
                    {
                     before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_1_1_0()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:601:1: ( RULE_NUMBER )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_NUMBER) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:601:3: RULE_NUMBER
                    	    {
                    	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_1_0_1_11238); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_1_1_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:606:6: ( '*' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:606:6: ( '*' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:607:1: '*'
                    {
                     before(grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_0_1_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BiRelation__Alternatives_1_0_1_11260); 
                     after(grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_0_1_1_1()); 

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
    // $ANTLR end "rule__BiRelation__Alternatives_1_0_1_1"


    // $ANTLR start "rule__BiRelation__Alternatives_7"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:619:1: rule__BiRelation__Alternatives_7 : ( ( ( rule__BiRelation__Group_7_0__0 ) ) | ( '*' ) );
    public final void rule__BiRelation__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:623:1: ( ( ( rule__BiRelation__Group_7_0__0 ) ) | ( '*' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NUMBER) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:624:1: ( ( rule__BiRelation__Group_7_0__0 ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:624:1: ( ( rule__BiRelation__Group_7_0__0 ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:625:1: ( rule__BiRelation__Group_7_0__0 )
                    {
                     before(grammarAccess.getBiRelationAccess().getGroup_7_0()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:626:1: ( rule__BiRelation__Group_7_0__0 )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:626:2: rule__BiRelation__Group_7_0__0
                    {
                    pushFollow(FOLLOW_rule__BiRelation__Group_7_0__0_in_rule__BiRelation__Alternatives_71294);
                    rule__BiRelation__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBiRelationAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:630:6: ( '*' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:630:6: ( '*' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:631:1: '*'
                    {
                     before(grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_1()); 
                    match(input,12,FOLLOW_12_in_rule__BiRelation__Alternatives_71313); 
                     after(grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_1()); 

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
    // $ANTLR end "rule__BiRelation__Alternatives_7"


    // $ANTLR start "rule__BiRelation__Alternatives_7_0_1_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:643:1: rule__BiRelation__Alternatives_7_0_1_1 : ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) | ( '*' ) );
    public final void rule__BiRelation__Alternatives_7_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:647:1: ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) | ( '*' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NUMBER) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:648:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:648:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:649:1: ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:649:1: ( ( RULE_NUMBER ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:650:1: ( RULE_NUMBER )
                    {
                     before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_1_1_0()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:651:1: ( RULE_NUMBER )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:651:3: RULE_NUMBER
                    {
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_7_0_1_11350); 

                    }

                     after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_1_1_0()); 

                    }

                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:654:1: ( ( RULE_NUMBER )* )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:655:1: ( RULE_NUMBER )*
                    {
                     before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_1_1_0()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:656:1: ( RULE_NUMBER )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_NUMBER) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:656:3: RULE_NUMBER
                    	    {
                    	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_7_0_1_11363); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_1_1_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:661:6: ( '*' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:661:6: ( '*' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:662:1: '*'
                    {
                     before(grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_0_1_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BiRelation__Alternatives_7_0_1_11385); 
                     after(grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_0_1_1_1()); 

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
    // $ANTLR end "rule__BiRelation__Alternatives_7_0_1_1"


    // $ANTLR start "rule__Attribute__Alternatives_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:674:1: rule__Attribute__Alternatives_1 : ( ( '<>' ) | ( '<!>' ) );
    public final void rule__Attribute__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:678:1: ( ( '<>' ) | ( '<!>' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:679:1: ( '<>' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:679:1: ( '<>' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:680:1: '<>'
                    {
                     before(grammarAccess.getAttributeAccess().getLessThanSignGreaterThanSignKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__Attribute__Alternatives_11420); 
                     after(grammarAccess.getAttributeAccess().getLessThanSignGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:687:6: ( '<!>' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:687:6: ( '<!>' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:688:1: '<!>'
                    {
                     before(grammarAccess.getAttributeAccess().getLessThanSignExclamationMarkGreaterThanSignKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__Attribute__Alternatives_11440); 
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


    // $ANTLR start "rule__Attribute__Alternatives_5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:700:1: rule__Attribute__Alternatives_5 : ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ( rule__Attribute__BirelationAssignment_5_1 ) ) );
    public final void rule__Attribute__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:704:1: ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ( rule__Attribute__BirelationAssignment_5_1 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:705:1: ( ( rule__Attribute__Group_5_0__0 ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:705:1: ( ( rule__Attribute__Group_5_0__0 ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:706:1: ( rule__Attribute__Group_5_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_5_0()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:707:1: ( rule__Attribute__Group_5_0__0 )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:707:2: rule__Attribute__Group_5_0__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_5_0__0_in_rule__Attribute__Alternatives_51474);
                    rule__Attribute__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:711:6: ( ( rule__Attribute__BirelationAssignment_5_1 ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:711:6: ( ( rule__Attribute__BirelationAssignment_5_1 ) )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:712:1: ( rule__Attribute__BirelationAssignment_5_1 )
                    {
                     before(grammarAccess.getAttributeAccess().getBirelationAssignment_5_1()); 
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:713:1: ( rule__Attribute__BirelationAssignment_5_1 )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:713:2: rule__Attribute__BirelationAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__BirelationAssignment_5_1_in_rule__Attribute__Alternatives_51492);
                    rule__Attribute__BirelationAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getBirelationAssignment_5_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_5"


    // $ANTLR start "rule__BodyVisibility__Alternatives"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:722:1: rule__BodyVisibility__Alternatives : ( ( '+' ) | ( '-' ) | ( '#' ) );
    public final void rule__BodyVisibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:726:1: ( ( '+' ) | ( '-' ) | ( '#' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt13=1;
                }
                break;
            case 16:
                {
                alt13=2;
                }
                break;
            case 17:
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
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:727:1: ( '+' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:727:1: ( '+' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:728:1: '+'
                    {
                     before(grammarAccess.getBodyVisibilityAccess().getPlusSignKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__BodyVisibility__Alternatives1526); 
                     after(grammarAccess.getBodyVisibilityAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:735:6: ( '-' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:735:6: ( '-' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:736:1: '-'
                    {
                     before(grammarAccess.getBodyVisibilityAccess().getHyphenMinusKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__BodyVisibility__Alternatives1546); 
                     after(grammarAccess.getBodyVisibilityAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:743:6: ( '#' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:743:6: ( '#' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:744:1: '#'
                    {
                     before(grammarAccess.getBodyVisibilityAccess().getNumberSignKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__BodyVisibility__Alternatives1566); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:756:1: rule__ClassVisibility__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__ClassVisibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:760:1: ( ( '+' ) | ( '-' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            else if ( (LA14_0==16) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:761:1: ( '+' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:761:1: ( '+' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:762:1: '+'
                    {
                     before(grammarAccess.getClassVisibilityAccess().getPlusSignKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__ClassVisibility__Alternatives1601); 
                     after(grammarAccess.getClassVisibilityAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:769:6: ( '-' )
                    {
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:769:6: ( '-' )
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:770:1: '-'
                    {
                     before(grammarAccess.getClassVisibilityAccess().getHyphenMinusKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__ClassVisibility__Alternatives1621); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:784:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:788:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:789:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01653);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01656);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:796:1: rule__Class__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:800:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:801:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:801:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:802:1: ruleClassVisibility
            {
             before(grammarAccess.getClassAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Class__Group__0__Impl1683);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:813:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:817:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:818:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11712);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11715);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:825:1: rule__Class__Group__1__Impl : ( ( rule__Class__ClassnameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:829:1: ( ( ( rule__Class__ClassnameAssignment_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:830:1: ( ( rule__Class__ClassnameAssignment_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:830:1: ( ( rule__Class__ClassnameAssignment_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:831:1: ( rule__Class__ClassnameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getClassnameAssignment_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:832:1: ( rule__Class__ClassnameAssignment_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:832:2: rule__Class__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__ClassnameAssignment_1_in_rule__Class__Group__1__Impl1742);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:842:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:846:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:847:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21772);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21775);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:854:1: rule__Class__Group__2__Impl : ( ( ':' )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:858:1: ( ( ( ':' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:859:1: ( ( ':' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:859:1: ( ( ':' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:860:1: ( ':' )?
            {
             before(grammarAccess.getClassAccess().getColonKeyword_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:861:1: ( ':' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:862:2: ':'
                    {
                    match(input,18,FOLLOW_18_in_rule__Class__Group__2__Impl1804); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:873:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:877:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:878:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31837);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31840);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:885:1: rule__Class__Group__3__Impl : ( ( rule__Class__ExtensionAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:889:1: ( ( ( rule__Class__ExtensionAssignment_3 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:890:1: ( ( rule__Class__ExtensionAssignment_3 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:890:1: ( ( rule__Class__ExtensionAssignment_3 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:891:1: ( rule__Class__ExtensionAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getExtensionAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:892:1: ( rule__Class__ExtensionAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:892:2: rule__Class__ExtensionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Class__ExtensionAssignment_3_in_rule__Class__Group__3__Impl1867);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:902:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:906:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:907:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41898);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41901);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:914:1: rule__Class__Group__4__Impl : ( ( rule__Class__ImplementsAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:918:1: ( ( ( rule__Class__ImplementsAssignment_4 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:919:1: ( ( rule__Class__ImplementsAssignment_4 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:919:1: ( ( rule__Class__ImplementsAssignment_4 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:920:1: ( rule__Class__ImplementsAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getImplementsAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:921:1: ( rule__Class__ImplementsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:921:2: rule__Class__ImplementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__ImplementsAssignment_4_in_rule__Class__Group__4__Impl1928);
            	    rule__Class__ImplementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:931:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:935:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:936:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51959);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51962);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:943:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:947:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:948:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:948:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:949:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Class__Group__5__Impl1990); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:962:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:966:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:967:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__62021);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__7_in_rule__Class__Group__62024);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:974:1: rule__Class__Group__6__Impl : ( ( rule__Class__BodyAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:978:1: ( ( ( rule__Class__BodyAssignment_6 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:979:1: ( ( rule__Class__BodyAssignment_6 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:979:1: ( ( rule__Class__BodyAssignment_6 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:980:1: ( rule__Class__BodyAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getBodyAssignment_6()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:981:1: ( rule__Class__BodyAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=15 && LA18_0<=17)||LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:981:2: rule__Class__BodyAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class__BodyAssignment_6_in_rule__Class__Group__6__Impl2051);
            	    rule__Class__BodyAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:991:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:995:1: ( rule__Class__Group__7__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:996:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__72082);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1002:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1006:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1007:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1007:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1008:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__Class__Group__7__Impl2110); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1037:1: rule__Implements__Group__0 : rule__Implements__Group__0__Impl rule__Implements__Group__1 ;
    public final void rule__Implements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1041:1: ( rule__Implements__Group__0__Impl rule__Implements__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1042:2: rule__Implements__Group__0__Impl rule__Implements__Group__1
            {
            pushFollow(FOLLOW_rule__Implements__Group__0__Impl_in_rule__Implements__Group__02157);
            rule__Implements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Implements__Group__1_in_rule__Implements__Group__02160);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1049:1: rule__Implements__Group__0__Impl : ( ( ',' )? ) ;
    public final void rule__Implements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1053:1: ( ( ( ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1054:1: ( ( ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1054:1: ( ( ',' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1055:1: ( ',' )?
            {
             before(grammarAccess.getImplementsAccess().getCommaKeyword_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1056:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1057:2: ','
                    {
                    match(input,21,FOLLOW_21_in_rule__Implements__Group__0__Impl2189); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1068:1: rule__Implements__Group__1 : rule__Implements__Group__1__Impl ;
    public final void rule__Implements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1072:1: ( rule__Implements__Group__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1073:2: rule__Implements__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implements__Group__1__Impl_in_rule__Implements__Group__12222);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1079:1: rule__Implements__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Implements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1083:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1084:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1084:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1085:1: RULE_ID
            {
             before(grammarAccess.getImplementsAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Implements__Group__1__Impl2249); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1100:1: rule__Dependancy__Group__0 : rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 ;
    public final void rule__Dependancy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1104:1: ( rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1105:2: rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__02282);
            rule__Dependancy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__02285);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1112:1: rule__Dependancy__Group__0__Impl : ( '->' ) ;
    public final void rule__Dependancy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1116:1: ( ( '->' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1117:1: ( '->' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1117:1: ( '->' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1118:1: '->'
            {
             before(grammarAccess.getDependancyAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Dependancy__Group__0__Impl2313); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1131:1: rule__Dependancy__Group__1 : rule__Dependancy__Group__1__Impl ;
    public final void rule__Dependancy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1135:1: ( rule__Dependancy__Group__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1136:2: rule__Dependancy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__12344);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1142:1: rule__Dependancy__Group__1__Impl : ( ( rule__Dependancy__NameAssignment_1 ) ) ;
    public final void rule__Dependancy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1146:1: ( ( ( rule__Dependancy__NameAssignment_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1147:1: ( ( rule__Dependancy__NameAssignment_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1147:1: ( ( rule__Dependancy__NameAssignment_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1148:1: ( rule__Dependancy__NameAssignment_1 )
            {
             before(grammarAccess.getDependancyAccess().getNameAssignment_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1149:1: ( rule__Dependancy__NameAssignment_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1149:2: rule__Dependancy__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Dependancy__NameAssignment_1_in_rule__Dependancy__Group__1__Impl2371);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1163:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1167:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1168:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02405);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02408);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1175:1: rule__Enumeration__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1179:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1180:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1180:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1181:1: ruleClassVisibility
            {
             before(grammarAccess.getEnumerationAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Enumeration__Group__0__Impl2435);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1192:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1196:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1197:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12464);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12467);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1204:1: rule__Enumeration__Group__1__Impl : ( 'e' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1208:1: ( ( 'e' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1209:1: ( 'e' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1209:1: ( 'e' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1210:1: 'e'
            {
             before(grammarAccess.getEnumerationAccess().getEKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Enumeration__Group__1__Impl2495); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1223:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1227:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1228:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22526);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22529);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1235:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__ClassnameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1239:1: ( ( ( rule__Enumeration__ClassnameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1240:1: ( ( rule__Enumeration__ClassnameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1240:1: ( ( rule__Enumeration__ClassnameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1241:1: ( rule__Enumeration__ClassnameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getClassnameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1242:1: ( rule__Enumeration__ClassnameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1242:2: rule__Enumeration__ClassnameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enumeration__ClassnameAssignment_2_in_rule__Enumeration__Group__2__Impl2556);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1252:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1256:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1257:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32586);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32589);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1264:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1268:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1269:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1269:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1270:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__3__Impl2617); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1283:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1287:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1288:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42648);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42651);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1295:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1299:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1300:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1300:1: ( ( rule__Enumeration__Group_4__0 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1301:1: ( rule__Enumeration__Group_4__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1302:1: ( rule__Enumeration__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1302:2: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl2678);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1312:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1316:1: ( rule__Enumeration__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1317:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__52709);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1323:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1327:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1328:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1328:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1329:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Enumeration__Group__5__Impl2737); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1354:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1358:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1359:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__02780);
            rule__Enumeration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__02783);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1366:1: rule__Enumeration__Group_4__0__Impl : ( RULE_ID ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1370:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1371:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1371:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1372:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__Group_4__0__Impl2810); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1383:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1387:1: ( rule__Enumeration__Group_4__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1388:2: rule__Enumeration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__12839);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1394:1: rule__Enumeration__Group_4__1__Impl : ( ( ',' )? ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1398:1: ( ( ( ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1399:1: ( ( ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1399:1: ( ( ',' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1400:1: ( ',' )?
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1401:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1402:2: ','
                    {
                    match(input,21,FOLLOW_21_in_rule__Enumeration__Group_4__1__Impl2868); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1417:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1421:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1422:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02905);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02908);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1429:1: rule__Interface__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1433:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1434:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1434:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1435:1: ruleClassVisibility
            {
             before(grammarAccess.getInterfaceAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Interface__Group__0__Impl2935);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1446:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1450:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1451:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12964);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12967);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1458:1: rule__Interface__Group__1__Impl : ( 'i' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1462:1: ( ( 'i' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1463:1: ( 'i' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1463:1: ( 'i' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1464:1: 'i'
            {
             before(grammarAccess.getInterfaceAccess().getIKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Interface__Group__1__Impl2995); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1477:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1481:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1482:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23026);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23029);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1489:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__InterfacenameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1493:1: ( ( ( rule__Interface__InterfacenameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1494:1: ( ( rule__Interface__InterfacenameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1494:1: ( ( rule__Interface__InterfacenameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1495:1: ( rule__Interface__InterfacenameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getInterfacenameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1496:1: ( rule__Interface__InterfacenameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1496:2: rule__Interface__InterfacenameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__InterfacenameAssignment_2_in_rule__Interface__Group__2__Impl3056);
            rule__Interface__InterfacenameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getInterfacenameAssignment_2()); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1506:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1510:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1511:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__33086);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__33089);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1518:1: rule__Interface__Group__3__Impl : ( '{' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1522:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1523:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1523:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1524:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Interface__Group__3__Impl3117); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1537:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1541:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1542:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__43148);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__43151);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1549:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__BodyAssignment_4 )* ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1553:1: ( ( ( rule__Interface__BodyAssignment_4 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1554:1: ( ( rule__Interface__BodyAssignment_4 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1554:1: ( ( rule__Interface__BodyAssignment_4 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1555:1: ( rule__Interface__BodyAssignment_4 )*
            {
             before(grammarAccess.getInterfaceAccess().getBodyAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1556:1: ( rule__Interface__BodyAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=15 && LA22_0<=17)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1556:2: rule__Interface__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interface__BodyAssignment_4_in_rule__Interface__Group__4__Impl3178);
            	    rule__Interface__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1566:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1570:1: ( rule__Interface__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1571:2: rule__Interface__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__53209);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1577:1: rule__Interface__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1581:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1582:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1582:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1583:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Interface__Group__5__Impl3237); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1608:1: rule__Abstract__Group__0 : rule__Abstract__Group__0__Impl rule__Abstract__Group__1 ;
    public final void rule__Abstract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1612:1: ( rule__Abstract__Group__0__Impl rule__Abstract__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1613:2: rule__Abstract__Group__0__Impl rule__Abstract__Group__1
            {
            pushFollow(FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__03280);
            rule__Abstract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__03283);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1620:1: rule__Abstract__Group__0__Impl : ( ruleClassVisibility ) ;
    public final void rule__Abstract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1624:1: ( ( ruleClassVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1625:1: ( ruleClassVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1625:1: ( ruleClassVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1626:1: ruleClassVisibility
            {
             before(grammarAccess.getAbstractAccess().getClassVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Abstract__Group__0__Impl3310);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1637:1: rule__Abstract__Group__1 : rule__Abstract__Group__1__Impl rule__Abstract__Group__2 ;
    public final void rule__Abstract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1641:1: ( rule__Abstract__Group__1__Impl rule__Abstract__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1642:2: rule__Abstract__Group__1__Impl rule__Abstract__Group__2
            {
            pushFollow(FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__13339);
            rule__Abstract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__2_in_rule__Abstract__Group__13342);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1649:1: rule__Abstract__Group__1__Impl : ( 'a' ) ;
    public final void rule__Abstract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1653:1: ( ( 'a' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1654:1: ( 'a' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1654:1: ( 'a' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1655:1: 'a'
            {
             before(grammarAccess.getAbstractAccess().getAKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Abstract__Group__1__Impl3370); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1668:1: rule__Abstract__Group__2 : rule__Abstract__Group__2__Impl rule__Abstract__Group__3 ;
    public final void rule__Abstract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1672:1: ( rule__Abstract__Group__2__Impl rule__Abstract__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1673:2: rule__Abstract__Group__2__Impl rule__Abstract__Group__3
            {
            pushFollow(FOLLOW_rule__Abstract__Group__2__Impl_in_rule__Abstract__Group__23401);
            rule__Abstract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__3_in_rule__Abstract__Group__23404);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1680:1: rule__Abstract__Group__2__Impl : ( ( rule__Abstract__ClassnameAssignment_2 ) ) ;
    public final void rule__Abstract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1684:1: ( ( ( rule__Abstract__ClassnameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1685:1: ( ( rule__Abstract__ClassnameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1685:1: ( ( rule__Abstract__ClassnameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1686:1: ( rule__Abstract__ClassnameAssignment_2 )
            {
             before(grammarAccess.getAbstractAccess().getClassnameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1687:1: ( rule__Abstract__ClassnameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1687:2: rule__Abstract__ClassnameAssignment_2
            {
            pushFollow(FOLLOW_rule__Abstract__ClassnameAssignment_2_in_rule__Abstract__Group__2__Impl3431);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1697:1: rule__Abstract__Group__3 : rule__Abstract__Group__3__Impl rule__Abstract__Group__4 ;
    public final void rule__Abstract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1701:1: ( rule__Abstract__Group__3__Impl rule__Abstract__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1702:2: rule__Abstract__Group__3__Impl rule__Abstract__Group__4
            {
            pushFollow(FOLLOW_rule__Abstract__Group__3__Impl_in_rule__Abstract__Group__33461);
            rule__Abstract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__4_in_rule__Abstract__Group__33464);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1709:1: rule__Abstract__Group__3__Impl : ( ( ':' )? ) ;
    public final void rule__Abstract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1713:1: ( ( ( ':' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1714:1: ( ( ':' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1714:1: ( ( ':' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1715:1: ( ':' )?
            {
             before(grammarAccess.getAbstractAccess().getColonKeyword_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1716:1: ( ':' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1717:2: ':'
                    {
                    match(input,18,FOLLOW_18_in_rule__Abstract__Group__3__Impl3493); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1728:1: rule__Abstract__Group__4 : rule__Abstract__Group__4__Impl rule__Abstract__Group__5 ;
    public final void rule__Abstract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1732:1: ( rule__Abstract__Group__4__Impl rule__Abstract__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1733:2: rule__Abstract__Group__4__Impl rule__Abstract__Group__5
            {
            pushFollow(FOLLOW_rule__Abstract__Group__4__Impl_in_rule__Abstract__Group__43526);
            rule__Abstract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__5_in_rule__Abstract__Group__43529);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1740:1: rule__Abstract__Group__4__Impl : ( ( rule__Abstract__ExtensionAssignment_4 )? ) ;
    public final void rule__Abstract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1744:1: ( ( ( rule__Abstract__ExtensionAssignment_4 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1745:1: ( ( rule__Abstract__ExtensionAssignment_4 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1745:1: ( ( rule__Abstract__ExtensionAssignment_4 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1746:1: ( rule__Abstract__ExtensionAssignment_4 )?
            {
             before(grammarAccess.getAbstractAccess().getExtensionAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1747:1: ( rule__Abstract__ExtensionAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1747:2: rule__Abstract__ExtensionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Abstract__ExtensionAssignment_4_in_rule__Abstract__Group__4__Impl3556);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1757:1: rule__Abstract__Group__5 : rule__Abstract__Group__5__Impl rule__Abstract__Group__6 ;
    public final void rule__Abstract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1761:1: ( rule__Abstract__Group__5__Impl rule__Abstract__Group__6 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1762:2: rule__Abstract__Group__5__Impl rule__Abstract__Group__6
            {
            pushFollow(FOLLOW_rule__Abstract__Group__5__Impl_in_rule__Abstract__Group__53587);
            rule__Abstract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__6_in_rule__Abstract__Group__53590);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1769:1: rule__Abstract__Group__5__Impl : ( ( rule__Abstract__ImplementsAssignment_5 )* ) ;
    public final void rule__Abstract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1773:1: ( ( ( rule__Abstract__ImplementsAssignment_5 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1774:1: ( ( rule__Abstract__ImplementsAssignment_5 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1774:1: ( ( rule__Abstract__ImplementsAssignment_5 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1775:1: ( rule__Abstract__ImplementsAssignment_5 )*
            {
             before(grammarAccess.getAbstractAccess().getImplementsAssignment_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1776:1: ( rule__Abstract__ImplementsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1776:2: rule__Abstract__ImplementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Abstract__ImplementsAssignment_5_in_rule__Abstract__Group__5__Impl3617);
            	    rule__Abstract__ImplementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1786:1: rule__Abstract__Group__6 : rule__Abstract__Group__6__Impl rule__Abstract__Group__7 ;
    public final void rule__Abstract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1790:1: ( rule__Abstract__Group__6__Impl rule__Abstract__Group__7 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1791:2: rule__Abstract__Group__6__Impl rule__Abstract__Group__7
            {
            pushFollow(FOLLOW_rule__Abstract__Group__6__Impl_in_rule__Abstract__Group__63648);
            rule__Abstract__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__7_in_rule__Abstract__Group__63651);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1798:1: rule__Abstract__Group__6__Impl : ( '{' ) ;
    public final void rule__Abstract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1802:1: ( ( '{' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1803:1: ( '{' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1803:1: ( '{' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1804:1: '{'
            {
             before(grammarAccess.getAbstractAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Abstract__Group__6__Impl3679); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1817:1: rule__Abstract__Group__7 : rule__Abstract__Group__7__Impl rule__Abstract__Group__8 ;
    public final void rule__Abstract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1821:1: ( rule__Abstract__Group__7__Impl rule__Abstract__Group__8 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1822:2: rule__Abstract__Group__7__Impl rule__Abstract__Group__8
            {
            pushFollow(FOLLOW_rule__Abstract__Group__7__Impl_in_rule__Abstract__Group__73710);
            rule__Abstract__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__8_in_rule__Abstract__Group__73713);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1829:1: rule__Abstract__Group__7__Impl : ( ( rule__Abstract__BodyAssignment_7 )* ) ;
    public final void rule__Abstract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1833:1: ( ( ( rule__Abstract__BodyAssignment_7 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1834:1: ( ( rule__Abstract__BodyAssignment_7 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1834:1: ( ( rule__Abstract__BodyAssignment_7 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1835:1: ( rule__Abstract__BodyAssignment_7 )*
            {
             before(grammarAccess.getAbstractAccess().getBodyAssignment_7()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1836:1: ( rule__Abstract__BodyAssignment_7 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=15 && LA26_0<=17)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1836:2: rule__Abstract__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Abstract__BodyAssignment_7_in_rule__Abstract__Group__7__Impl3740);
            	    rule__Abstract__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1846:1: rule__Abstract__Group__8 : rule__Abstract__Group__8__Impl ;
    public final void rule__Abstract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1850:1: ( rule__Abstract__Group__8__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1851:2: rule__Abstract__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Abstract__Group__8__Impl_in_rule__Abstract__Group__83771);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1857:1: rule__Abstract__Group__8__Impl : ( '}' ) ;
    public final void rule__Abstract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1861:1: ( ( '}' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1862:1: ( '}' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1862:1: ( '}' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1863:1: '}'
            {
             before(grammarAccess.getAbstractAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Abstract__Group__8__Impl3799); 
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


    // $ANTLR start "rule__BiRelation__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1894:1: rule__BiRelation__Group__0 : rule__BiRelation__Group__0__Impl rule__BiRelation__Group__1 ;
    public final void rule__BiRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1898:1: ( rule__BiRelation__Group__0__Impl rule__BiRelation__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1899:2: rule__BiRelation__Group__0__Impl rule__BiRelation__Group__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__0__Impl_in_rule__BiRelation__Group__03848);
            rule__BiRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__1_in_rule__BiRelation__Group__03851);
            rule__BiRelation__Group__1();

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
    // $ANTLR end "rule__BiRelation__Group__0"


    // $ANTLR start "rule__BiRelation__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1906:1: rule__BiRelation__Group__0__Impl : ( '[' ) ;
    public final void rule__BiRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1910:1: ( ( '[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1911:1: ( '[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1911:1: ( '[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1912:1: '['
            {
             before(grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__BiRelation__Group__0__Impl3879); 
             after(grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__BiRelation__Group__0__Impl"


    // $ANTLR start "rule__BiRelation__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1925:1: rule__BiRelation__Group__1 : rule__BiRelation__Group__1__Impl rule__BiRelation__Group__2 ;
    public final void rule__BiRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1929:1: ( rule__BiRelation__Group__1__Impl rule__BiRelation__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1930:2: rule__BiRelation__Group__1__Impl rule__BiRelation__Group__2
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__1__Impl_in_rule__BiRelation__Group__13910);
            rule__BiRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__2_in_rule__BiRelation__Group__13913);
            rule__BiRelation__Group__2();

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
    // $ANTLR end "rule__BiRelation__Group__1"


    // $ANTLR start "rule__BiRelation__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1937:1: rule__BiRelation__Group__1__Impl : ( ( rule__BiRelation__Alternatives_1 )? ) ;
    public final void rule__BiRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1941:1: ( ( ( rule__BiRelation__Alternatives_1 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1942:1: ( ( rule__BiRelation__Alternatives_1 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1942:1: ( ( rule__BiRelation__Alternatives_1 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1943:1: ( rule__BiRelation__Alternatives_1 )?
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1944:1: ( rule__BiRelation__Alternatives_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NUMBER||LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1944:2: rule__BiRelation__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__BiRelation__Alternatives_1_in_rule__BiRelation__Group__1__Impl3940);
                    rule__BiRelation__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBiRelationAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__BiRelation__Group__1__Impl"


    // $ANTLR start "rule__BiRelation__Group__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1954:1: rule__BiRelation__Group__2 : rule__BiRelation__Group__2__Impl rule__BiRelation__Group__3 ;
    public final void rule__BiRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1958:1: ( rule__BiRelation__Group__2__Impl rule__BiRelation__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1959:2: rule__BiRelation__Group__2__Impl rule__BiRelation__Group__3
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__2__Impl_in_rule__BiRelation__Group__23971);
            rule__BiRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__3_in_rule__BiRelation__Group__23974);
            rule__BiRelation__Group__3();

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
    // $ANTLR end "rule__BiRelation__Group__2"


    // $ANTLR start "rule__BiRelation__Group__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1966:1: rule__BiRelation__Group__2__Impl : ( ']' ) ;
    public final void rule__BiRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1970:1: ( ( ']' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1971:1: ( ']' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1971:1: ( ']' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1972:1: ']'
            {
             before(grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__BiRelation__Group__2__Impl4002); 
             after(grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__BiRelation__Group__2__Impl"


    // $ANTLR start "rule__BiRelation__Group__3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1985:1: rule__BiRelation__Group__3 : rule__BiRelation__Group__3__Impl rule__BiRelation__Group__4 ;
    public final void rule__BiRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1989:1: ( rule__BiRelation__Group__3__Impl rule__BiRelation__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1990:2: rule__BiRelation__Group__3__Impl rule__BiRelation__Group__4
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__3__Impl_in_rule__BiRelation__Group__34033);
            rule__BiRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__4_in_rule__BiRelation__Group__34036);
            rule__BiRelation__Group__4();

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
    // $ANTLR end "rule__BiRelation__Group__3"


    // $ANTLR start "rule__BiRelation__Group__3__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1997:1: rule__BiRelation__Group__3__Impl : ( '-' ) ;
    public final void rule__BiRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2001:1: ( ( '-' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2002:1: ( '-' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2002:1: ( '-' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2003:1: '-'
            {
             before(grammarAccess.getBiRelationAccess().getHyphenMinusKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BiRelation__Group__3__Impl4064); 
             after(grammarAccess.getBiRelationAccess().getHyphenMinusKeyword_3()); 

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
    // $ANTLR end "rule__BiRelation__Group__3__Impl"


    // $ANTLR start "rule__BiRelation__Group__4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2016:1: rule__BiRelation__Group__4 : rule__BiRelation__Group__4__Impl rule__BiRelation__Group__5 ;
    public final void rule__BiRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2020:1: ( rule__BiRelation__Group__4__Impl rule__BiRelation__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2021:2: rule__BiRelation__Group__4__Impl rule__BiRelation__Group__5
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__4__Impl_in_rule__BiRelation__Group__44095);
            rule__BiRelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__5_in_rule__BiRelation__Group__44098);
            rule__BiRelation__Group__5();

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
    // $ANTLR end "rule__BiRelation__Group__4"


    // $ANTLR start "rule__BiRelation__Group__4__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2028:1: rule__BiRelation__Group__4__Impl : ( ( rule__BiRelation__LinkNameAssignment_4 ) ) ;
    public final void rule__BiRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2032:1: ( ( ( rule__BiRelation__LinkNameAssignment_4 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2033:1: ( ( rule__BiRelation__LinkNameAssignment_4 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2033:1: ( ( rule__BiRelation__LinkNameAssignment_4 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2034:1: ( rule__BiRelation__LinkNameAssignment_4 )
            {
             before(grammarAccess.getBiRelationAccess().getLinkNameAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2035:1: ( rule__BiRelation__LinkNameAssignment_4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2035:2: rule__BiRelation__LinkNameAssignment_4
            {
            pushFollow(FOLLOW_rule__BiRelation__LinkNameAssignment_4_in_rule__BiRelation__Group__4__Impl4125);
            rule__BiRelation__LinkNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBiRelationAccess().getLinkNameAssignment_4()); 

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
    // $ANTLR end "rule__BiRelation__Group__4__Impl"


    // $ANTLR start "rule__BiRelation__Group__5"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2045:1: rule__BiRelation__Group__5 : rule__BiRelation__Group__5__Impl rule__BiRelation__Group__6 ;
    public final void rule__BiRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2049:1: ( rule__BiRelation__Group__5__Impl rule__BiRelation__Group__6 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2050:2: rule__BiRelation__Group__5__Impl rule__BiRelation__Group__6
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__5__Impl_in_rule__BiRelation__Group__54155);
            rule__BiRelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__6_in_rule__BiRelation__Group__54158);
            rule__BiRelation__Group__6();

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
    // $ANTLR end "rule__BiRelation__Group__5"


    // $ANTLR start "rule__BiRelation__Group__5__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2057:1: rule__BiRelation__Group__5__Impl : ( '->' ) ;
    public final void rule__BiRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2061:1: ( ( '->' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2062:1: ( '->' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2062:1: ( '->' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2063:1: '->'
            {
             before(grammarAccess.getBiRelationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__BiRelation__Group__5__Impl4186); 
             after(grammarAccess.getBiRelationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__BiRelation__Group__5__Impl"


    // $ANTLR start "rule__BiRelation__Group__6"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2076:1: rule__BiRelation__Group__6 : rule__BiRelation__Group__6__Impl rule__BiRelation__Group__7 ;
    public final void rule__BiRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2080:1: ( rule__BiRelation__Group__6__Impl rule__BiRelation__Group__7 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2081:2: rule__BiRelation__Group__6__Impl rule__BiRelation__Group__7
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__6__Impl_in_rule__BiRelation__Group__64217);
            rule__BiRelation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__7_in_rule__BiRelation__Group__64220);
            rule__BiRelation__Group__7();

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
    // $ANTLR end "rule__BiRelation__Group__6"


    // $ANTLR start "rule__BiRelation__Group__6__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2088:1: rule__BiRelation__Group__6__Impl : ( '[' ) ;
    public final void rule__BiRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2092:1: ( ( '[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2093:1: ( '[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2093:1: ( '[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2094:1: '['
            {
             before(grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__BiRelation__Group__6__Impl4248); 
             after(grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__BiRelation__Group__6__Impl"


    // $ANTLR start "rule__BiRelation__Group__7"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2107:1: rule__BiRelation__Group__7 : rule__BiRelation__Group__7__Impl rule__BiRelation__Group__8 ;
    public final void rule__BiRelation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2111:1: ( rule__BiRelation__Group__7__Impl rule__BiRelation__Group__8 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2112:2: rule__BiRelation__Group__7__Impl rule__BiRelation__Group__8
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__7__Impl_in_rule__BiRelation__Group__74279);
            rule__BiRelation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__8_in_rule__BiRelation__Group__74282);
            rule__BiRelation__Group__8();

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
    // $ANTLR end "rule__BiRelation__Group__7"


    // $ANTLR start "rule__BiRelation__Group__7__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2119:1: rule__BiRelation__Group__7__Impl : ( ( rule__BiRelation__Alternatives_7 )? ) ;
    public final void rule__BiRelation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2123:1: ( ( ( rule__BiRelation__Alternatives_7 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2124:1: ( ( rule__BiRelation__Alternatives_7 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2124:1: ( ( rule__BiRelation__Alternatives_7 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2125:1: ( rule__BiRelation__Alternatives_7 )?
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_7()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2126:1: ( rule__BiRelation__Alternatives_7 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NUMBER||LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2126:2: rule__BiRelation__Alternatives_7
                    {
                    pushFollow(FOLLOW_rule__BiRelation__Alternatives_7_in_rule__BiRelation__Group__7__Impl4309);
                    rule__BiRelation__Alternatives_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBiRelationAccess().getAlternatives_7()); 

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
    // $ANTLR end "rule__BiRelation__Group__7__Impl"


    // $ANTLR start "rule__BiRelation__Group__8"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2136:1: rule__BiRelation__Group__8 : rule__BiRelation__Group__8__Impl ;
    public final void rule__BiRelation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2140:1: ( rule__BiRelation__Group__8__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2141:2: rule__BiRelation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__8__Impl_in_rule__BiRelation__Group__84340);
            rule__BiRelation__Group__8__Impl();

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
    // $ANTLR end "rule__BiRelation__Group__8"


    // $ANTLR start "rule__BiRelation__Group__8__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2147:1: rule__BiRelation__Group__8__Impl : ( ']' ) ;
    public final void rule__BiRelation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2151:1: ( ( ']' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2152:1: ( ']' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2152:1: ( ']' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2153:1: ']'
            {
             before(grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__BiRelation__Group__8__Impl4368); 
             after(grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__BiRelation__Group__8__Impl"


    // $ANTLR start "rule__BiRelation__Group_1_0__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2184:1: rule__BiRelation__Group_1_0__0 : rule__BiRelation__Group_1_0__0__Impl rule__BiRelation__Group_1_0__1 ;
    public final void rule__BiRelation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2188:1: ( rule__BiRelation__Group_1_0__0__Impl rule__BiRelation__Group_1_0__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2189:2: rule__BiRelation__Group_1_0__0__Impl rule__BiRelation__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0__0__Impl_in_rule__BiRelation__Group_1_0__04417);
            rule__BiRelation__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_1_0__1_in_rule__BiRelation__Group_1_0__04420);
            rule__BiRelation__Group_1_0__1();

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
    // $ANTLR end "rule__BiRelation__Group_1_0__0"


    // $ANTLR start "rule__BiRelation__Group_1_0__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2196:1: rule__BiRelation__Group_1_0__0__Impl : ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) ;
    public final void rule__BiRelation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2200:1: ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2201:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2201:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2202:1: ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2202:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2203:1: ( RULE_NUMBER )
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2204:1: ( RULE_NUMBER )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2204:3: RULE_NUMBER
            {
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4450); 

            }

             after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 

            }

            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2207:1: ( ( RULE_NUMBER )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2208:1: ( RULE_NUMBER )*
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2209:1: ( RULE_NUMBER )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_NUMBER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2209:3: RULE_NUMBER
            	    {
            	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4463); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__BiRelation__Group_1_0__0__Impl"


    // $ANTLR start "rule__BiRelation__Group_1_0__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2220:1: rule__BiRelation__Group_1_0__1 : rule__BiRelation__Group_1_0__1__Impl ;
    public final void rule__BiRelation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2224:1: ( rule__BiRelation__Group_1_0__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2225:2: rule__BiRelation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0__1__Impl_in_rule__BiRelation__Group_1_0__14496);
            rule__BiRelation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__BiRelation__Group_1_0__1"


    // $ANTLR start "rule__BiRelation__Group_1_0__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2231:1: rule__BiRelation__Group_1_0__1__Impl : ( ( rule__BiRelation__Group_1_0_1__0 ) ) ;
    public final void rule__BiRelation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2235:1: ( ( ( rule__BiRelation__Group_1_0_1__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2236:1: ( ( rule__BiRelation__Group_1_0_1__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2236:1: ( ( rule__BiRelation__Group_1_0_1__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2237:1: ( rule__BiRelation__Group_1_0_1__0 )
            {
             before(grammarAccess.getBiRelationAccess().getGroup_1_0_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2238:1: ( rule__BiRelation__Group_1_0_1__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2238:2: rule__BiRelation__Group_1_0_1__0
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__0_in_rule__BiRelation__Group_1_0__1__Impl4523);
            rule__BiRelation__Group_1_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBiRelationAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__BiRelation__Group_1_0__1__Impl"


    // $ANTLR start "rule__BiRelation__Group_1_0_1__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2252:1: rule__BiRelation__Group_1_0_1__0 : rule__BiRelation__Group_1_0_1__0__Impl rule__BiRelation__Group_1_0_1__1 ;
    public final void rule__BiRelation__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2256:1: ( rule__BiRelation__Group_1_0_1__0__Impl rule__BiRelation__Group_1_0_1__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2257:2: rule__BiRelation__Group_1_0_1__0__Impl rule__BiRelation__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__0__Impl_in_rule__BiRelation__Group_1_0_1__04557);
            rule__BiRelation__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__1_in_rule__BiRelation__Group_1_0_1__04560);
            rule__BiRelation__Group_1_0_1__1();

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
    // $ANTLR end "rule__BiRelation__Group_1_0_1__0"


    // $ANTLR start "rule__BiRelation__Group_1_0_1__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2264:1: rule__BiRelation__Group_1_0_1__0__Impl : ( '..' ) ;
    public final void rule__BiRelation__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2268:1: ( ( '..' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2269:1: ( '..' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2269:1: ( '..' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2270:1: '..'
            {
             before(grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_1_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__BiRelation__Group_1_0_1__0__Impl4588); 
             after(grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__BiRelation__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__BiRelation__Group_1_0_1__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2283:1: rule__BiRelation__Group_1_0_1__1 : rule__BiRelation__Group_1_0_1__1__Impl ;
    public final void rule__BiRelation__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2287:1: ( rule__BiRelation__Group_1_0_1__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2288:2: rule__BiRelation__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__1__Impl_in_rule__BiRelation__Group_1_0_1__14619);
            rule__BiRelation__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__BiRelation__Group_1_0_1__1"


    // $ANTLR start "rule__BiRelation__Group_1_0_1__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2294:1: rule__BiRelation__Group_1_0_1__1__Impl : ( ( rule__BiRelation__Alternatives_1_0_1_1 ) ) ;
    public final void rule__BiRelation__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2298:1: ( ( ( rule__BiRelation__Alternatives_1_0_1_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2299:1: ( ( rule__BiRelation__Alternatives_1_0_1_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2299:1: ( ( rule__BiRelation__Alternatives_1_0_1_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2300:1: ( rule__BiRelation__Alternatives_1_0_1_1 )
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_1_0_1_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2301:1: ( rule__BiRelation__Alternatives_1_0_1_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2301:2: rule__BiRelation__Alternatives_1_0_1_1
            {
            pushFollow(FOLLOW_rule__BiRelation__Alternatives_1_0_1_1_in_rule__BiRelation__Group_1_0_1__1__Impl4646);
            rule__BiRelation__Alternatives_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBiRelationAccess().getAlternatives_1_0_1_1()); 

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
    // $ANTLR end "rule__BiRelation__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__BiRelation__Group_7_0__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2315:1: rule__BiRelation__Group_7_0__0 : rule__BiRelation__Group_7_0__0__Impl rule__BiRelation__Group_7_0__1 ;
    public final void rule__BiRelation__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2319:1: ( rule__BiRelation__Group_7_0__0__Impl rule__BiRelation__Group_7_0__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2320:2: rule__BiRelation__Group_7_0__0__Impl rule__BiRelation__Group_7_0__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0__0__Impl_in_rule__BiRelation__Group_7_0__04680);
            rule__BiRelation__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_7_0__1_in_rule__BiRelation__Group_7_0__04683);
            rule__BiRelation__Group_7_0__1();

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
    // $ANTLR end "rule__BiRelation__Group_7_0__0"


    // $ANTLR start "rule__BiRelation__Group_7_0__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2327:1: rule__BiRelation__Group_7_0__0__Impl : ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) ;
    public final void rule__BiRelation__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2331:1: ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2332:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2332:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2333:1: ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2333:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2334:1: ( RULE_NUMBER )
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2335:1: ( RULE_NUMBER )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2335:3: RULE_NUMBER
            {
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4713); 

            }

             after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 

            }

            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2338:1: ( ( RULE_NUMBER )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2339:1: ( RULE_NUMBER )*
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2340:1: ( RULE_NUMBER )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_NUMBER) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2340:3: RULE_NUMBER
            	    {
            	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4726); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__BiRelation__Group_7_0__0__Impl"


    // $ANTLR start "rule__BiRelation__Group_7_0__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2351:1: rule__BiRelation__Group_7_0__1 : rule__BiRelation__Group_7_0__1__Impl ;
    public final void rule__BiRelation__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2355:1: ( rule__BiRelation__Group_7_0__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2356:2: rule__BiRelation__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0__1__Impl_in_rule__BiRelation__Group_7_0__14759);
            rule__BiRelation__Group_7_0__1__Impl();

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
    // $ANTLR end "rule__BiRelation__Group_7_0__1"


    // $ANTLR start "rule__BiRelation__Group_7_0__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2362:1: rule__BiRelation__Group_7_0__1__Impl : ( ( rule__BiRelation__Group_7_0_1__0 ) ) ;
    public final void rule__BiRelation__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2366:1: ( ( ( rule__BiRelation__Group_7_0_1__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2367:1: ( ( rule__BiRelation__Group_7_0_1__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2367:1: ( ( rule__BiRelation__Group_7_0_1__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2368:1: ( rule__BiRelation__Group_7_0_1__0 )
            {
             before(grammarAccess.getBiRelationAccess().getGroup_7_0_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2369:1: ( rule__BiRelation__Group_7_0_1__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2369:2: rule__BiRelation__Group_7_0_1__0
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__0_in_rule__BiRelation__Group_7_0__1__Impl4786);
            rule__BiRelation__Group_7_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBiRelationAccess().getGroup_7_0_1()); 

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
    // $ANTLR end "rule__BiRelation__Group_7_0__1__Impl"


    // $ANTLR start "rule__BiRelation__Group_7_0_1__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2383:1: rule__BiRelation__Group_7_0_1__0 : rule__BiRelation__Group_7_0_1__0__Impl rule__BiRelation__Group_7_0_1__1 ;
    public final void rule__BiRelation__Group_7_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2387:1: ( rule__BiRelation__Group_7_0_1__0__Impl rule__BiRelation__Group_7_0_1__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2388:2: rule__BiRelation__Group_7_0_1__0__Impl rule__BiRelation__Group_7_0_1__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__0__Impl_in_rule__BiRelation__Group_7_0_1__04820);
            rule__BiRelation__Group_7_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__1_in_rule__BiRelation__Group_7_0_1__04823);
            rule__BiRelation__Group_7_0_1__1();

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
    // $ANTLR end "rule__BiRelation__Group_7_0_1__0"


    // $ANTLR start "rule__BiRelation__Group_7_0_1__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2395:1: rule__BiRelation__Group_7_0_1__0__Impl : ( '..' ) ;
    public final void rule__BiRelation__Group_7_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2399:1: ( ( '..' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2400:1: ( '..' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2400:1: ( '..' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2401:1: '..'
            {
             before(grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_7_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__BiRelation__Group_7_0_1__0__Impl4851); 
             after(grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_7_0_1_0()); 

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
    // $ANTLR end "rule__BiRelation__Group_7_0_1__0__Impl"


    // $ANTLR start "rule__BiRelation__Group_7_0_1__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2414:1: rule__BiRelation__Group_7_0_1__1 : rule__BiRelation__Group_7_0_1__1__Impl ;
    public final void rule__BiRelation__Group_7_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2418:1: ( rule__BiRelation__Group_7_0_1__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2419:2: rule__BiRelation__Group_7_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__1__Impl_in_rule__BiRelation__Group_7_0_1__14882);
            rule__BiRelation__Group_7_0_1__1__Impl();

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
    // $ANTLR end "rule__BiRelation__Group_7_0_1__1"


    // $ANTLR start "rule__BiRelation__Group_7_0_1__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2425:1: rule__BiRelation__Group_7_0_1__1__Impl : ( ( rule__BiRelation__Alternatives_7_0_1_1 ) ) ;
    public final void rule__BiRelation__Group_7_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2429:1: ( ( ( rule__BiRelation__Alternatives_7_0_1_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2430:1: ( ( rule__BiRelation__Alternatives_7_0_1_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2430:1: ( ( rule__BiRelation__Alternatives_7_0_1_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2431:1: ( rule__BiRelation__Alternatives_7_0_1_1 )
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_7_0_1_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2432:1: ( rule__BiRelation__Alternatives_7_0_1_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2432:2: rule__BiRelation__Alternatives_7_0_1_1
            {
            pushFollow(FOLLOW_rule__BiRelation__Alternatives_7_0_1_1_in_rule__BiRelation__Group_7_0_1__1__Impl4909);
            rule__BiRelation__Alternatives_7_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBiRelationAccess().getAlternatives_7_0_1_1()); 

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
    // $ANTLR end "rule__BiRelation__Group_7_0_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2446:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2450:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2451:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04943);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04946);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2458:1: rule__Attribute__Group__0__Impl : ( ruleBodyVisibility ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2462:1: ( ( ruleBodyVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2463:1: ( ruleBodyVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2463:1: ( ruleBodyVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2464:1: ruleBodyVisibility
            {
             before(grammarAccess.getAttributeAccess().getBodyVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_rule__Attribute__Group__0__Impl4973);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2475:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2479:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2480:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15002);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15005);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2487:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Alternatives_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2491:1: ( ( ( rule__Attribute__Alternatives_1 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2492:1: ( ( rule__Attribute__Alternatives_1 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2492:1: ( ( rule__Attribute__Alternatives_1 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2493:1: ( rule__Attribute__Alternatives_1 )?
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2494:1: ( rule__Attribute__Alternatives_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=13 && LA31_0<=14)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2494:2: rule__Attribute__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__Alternatives_1_in_rule__Attribute__Group__1__Impl5032);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2504:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2508:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2509:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25063);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25066);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2516:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributenameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2520:1: ( ( ( rule__Attribute__AttributenameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2521:1: ( ( rule__Attribute__AttributenameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2521:1: ( ( rule__Attribute__AttributenameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2522:1: ( rule__Attribute__AttributenameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributenameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2523:1: ( rule__Attribute__AttributenameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2523:2: rule__Attribute__AttributenameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__AttributenameAssignment_2_in_rule__Attribute__Group__2__Impl5093);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2533:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2537:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2538:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35123);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35126);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2545:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2549:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2550:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2550:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2551:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__Group__3__Impl5154); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2564:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2568:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2569:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__45185);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__45188);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2576:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2580:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2581:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2581:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2582:1: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2583:1: ( rule__Attribute__TypeAssignment_4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2583:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl5215);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2593:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2597:1: ( rule__Attribute__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2598:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__55245);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2604:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Alternatives_5 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2608:1: ( ( ( rule__Attribute__Alternatives_5 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2609:1: ( ( rule__Attribute__Alternatives_5 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2609:1: ( ( rule__Attribute__Alternatives_5 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2610:1: ( rule__Attribute__Alternatives_5 )?
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2611:1: ( rule__Attribute__Alternatives_5 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2611:2: rule__Attribute__Alternatives_5
                    {
                    pushFollow(FOLLOW_rule__Attribute__Alternatives_5_in_rule__Attribute__Group__5__Impl5272);
                    rule__Attribute__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAlternatives_5()); 

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


    // $ANTLR start "rule__Attribute__Group_5_0__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2633:1: rule__Attribute__Group_5_0__0 : rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 ;
    public final void rule__Attribute__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2637:1: ( rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2638:2: rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5_0__0__Impl_in_rule__Attribute__Group_5_0__05315);
            rule__Attribute__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5_0__1_in_rule__Attribute__Group_5_0__05318);
            rule__Attribute__Group_5_0__1();

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
    // $ANTLR end "rule__Attribute__Group_5_0__0"


    // $ANTLR start "rule__Attribute__Group_5_0__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2645:1: rule__Attribute__Group_5_0__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2649:1: ( ( '[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2650:1: ( '[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2650:1: ( '[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2651:1: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Attribute__Group_5_0__0__Impl5346); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_0__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2664:1: rule__Attribute__Group_5_0__1 : rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 ;
    public final void rule__Attribute__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2668:1: ( rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2669:2: rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5_0__1__Impl_in_rule__Attribute__Group_5_0__15377);
            rule__Attribute__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5_0__2_in_rule__Attribute__Group_5_0__15380);
            rule__Attribute__Group_5_0__2();

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
    // $ANTLR end "rule__Attribute__Group_5_0__1"


    // $ANTLR start "rule__Attribute__Group_5_0__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2676:1: rule__Attribute__Group_5_0__1__Impl : ( ( RULE_NUMBER )* ) ;
    public final void rule__Attribute__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2680:1: ( ( ( RULE_NUMBER )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2681:1: ( ( RULE_NUMBER )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2681:1: ( ( RULE_NUMBER )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2682:1: ( RULE_NUMBER )*
            {
             before(grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_0_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2683:1: ( RULE_NUMBER )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_NUMBER) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2683:3: RULE_NUMBER
            	    {
            	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Attribute__Group_5_0__1__Impl5408); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_0_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5_0__2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2693:1: rule__Attribute__Group_5_0__2 : rule__Attribute__Group_5_0__2__Impl ;
    public final void rule__Attribute__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2697:1: ( rule__Attribute__Group_5_0__2__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2698:2: rule__Attribute__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5_0__2__Impl_in_rule__Attribute__Group_5_0__25439);
            rule__Attribute__Group_5_0__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5_0__2"


    // $ANTLR start "rule__Attribute__Group_5_0__2__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2704:1: rule__Attribute__Group_5_0__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2708:1: ( ( ']' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2709:1: ( ']' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2709:1: ( ']' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2710:1: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Attribute__Group_5_0__2__Impl5467); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_0_2()); 

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
    // $ANTLR end "rule__Attribute__Group_5_0__2__Impl"


    // $ANTLR start "rule__ParamIn__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2729:1: rule__ParamIn__Group__0 : rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1 ;
    public final void rule__ParamIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2733:1: ( rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2734:2: rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__0__Impl_in_rule__ParamIn__Group__05504);
            rule__ParamIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__1_in_rule__ParamIn__Group__05507);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2741:1: rule__ParamIn__Group__0__Impl : ( ( rule__ParamIn__NameAssignment_0 ) ) ;
    public final void rule__ParamIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2745:1: ( ( ( rule__ParamIn__NameAssignment_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2746:1: ( ( rule__ParamIn__NameAssignment_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2746:1: ( ( rule__ParamIn__NameAssignment_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2747:1: ( rule__ParamIn__NameAssignment_0 )
            {
             before(grammarAccess.getParamInAccess().getNameAssignment_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2748:1: ( rule__ParamIn__NameAssignment_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2748:2: rule__ParamIn__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamIn__NameAssignment_0_in_rule__ParamIn__Group__0__Impl5534);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2758:1: rule__ParamIn__Group__1 : rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2 ;
    public final void rule__ParamIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2762:1: ( rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2763:2: rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__1__Impl_in_rule__ParamIn__Group__15564);
            rule__ParamIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__2_in_rule__ParamIn__Group__15567);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2770:1: rule__ParamIn__Group__1__Impl : ( ':' ) ;
    public final void rule__ParamIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2774:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2775:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2775:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2776:1: ':'
            {
             before(grammarAccess.getParamInAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ParamIn__Group__1__Impl5595); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2789:1: rule__ParamIn__Group__2 : rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3 ;
    public final void rule__ParamIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2793:1: ( rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2794:2: rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__2__Impl_in_rule__ParamIn__Group__25626);
            rule__ParamIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__3_in_rule__ParamIn__Group__25629);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2801:1: rule__ParamIn__Group__2__Impl : ( ( rule__ParamIn__TypeAssignment_2 ) ) ;
    public final void rule__ParamIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2805:1: ( ( ( rule__ParamIn__TypeAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2806:1: ( ( rule__ParamIn__TypeAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2806:1: ( ( rule__ParamIn__TypeAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2807:1: ( rule__ParamIn__TypeAssignment_2 )
            {
             before(grammarAccess.getParamInAccess().getTypeAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2808:1: ( rule__ParamIn__TypeAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2808:2: rule__ParamIn__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ParamIn__TypeAssignment_2_in_rule__ParamIn__Group__2__Impl5656);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2818:1: rule__ParamIn__Group__3 : rule__ParamIn__Group__3__Impl ;
    public final void rule__ParamIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2822:1: ( rule__ParamIn__Group__3__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2823:2: rule__ParamIn__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__3__Impl_in_rule__ParamIn__Group__35686);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2829:1: rule__ParamIn__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__ParamIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2833:1: ( ( ( ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2834:1: ( ( ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2834:1: ( ( ',' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2835:1: ( ',' )?
            {
             before(grammarAccess.getParamInAccess().getCommaKeyword_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2836:1: ( ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2837:2: ','
                    {
                    match(input,21,FOLLOW_21_in_rule__ParamIn__Group__3__Impl5715); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2856:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2860:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2861:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__05756);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__05759);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2868:1: rule__Method__Group__0__Impl : ( ruleBodyVisibility ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2872:1: ( ( ruleBodyVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2873:1: ( ruleBodyVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2873:1: ( ruleBodyVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2874:1: ruleBodyVisibility
            {
             before(grammarAccess.getMethodAccess().getBodyVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_rule__Method__Group__0__Impl5786);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2885:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2889:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2890:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__15815);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__15818);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2897:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2901:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2902:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2902:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2903:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2904:1: ( rule__Method__NameAssignment_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2904:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl5845);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2914:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2918:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2919:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__25875);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__25878);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2926:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2930:1: ( ( '(' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2931:1: ( '(' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2931:1: ( '(' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2932:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Method__Group__2__Impl5906); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2945:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2949:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2950:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__35937);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__35940);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2957:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParamAssignment_3 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2961:1: ( ( ( rule__Method__ParamAssignment_3 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2962:1: ( ( rule__Method__ParamAssignment_3 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2962:1: ( ( rule__Method__ParamAssignment_3 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2963:1: ( rule__Method__ParamAssignment_3 )*
            {
             before(grammarAccess.getMethodAccess().getParamAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2964:1: ( rule__Method__ParamAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2964:2: rule__Method__ParamAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Method__ParamAssignment_3_in_rule__Method__Group__3__Impl5967);
            	    rule__Method__ParamAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2974:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2978:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2979:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__45998);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46001);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2986:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2990:1: ( ( ')' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2991:1: ( ')' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2991:1: ( ')' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2992:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Method__Group__4__Impl6029); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3005:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3009:1: ( rule__Method__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3010:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56060);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3016:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3020:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3021:1: ( ( rule__Method__Group_5__0 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3021:1: ( ( rule__Method__Group_5__0 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3022:1: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3023:1: ( rule__Method__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3023:2: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_5__0_in_rule__Method__Group__5__Impl6087);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3045:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3049:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3050:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_rule__Method__Group_5__0__Impl_in_rule__Method__Group_5__06130);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_5__1_in_rule__Method__Group_5__06133);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3057:1: rule__Method__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3061:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3062:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3062:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3063:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__Method__Group_5__0__Impl6161); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3076:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3080:1: ( rule__Method__Group_5__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3081:2: rule__Method__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_5__1__Impl_in_rule__Method__Group_5__16192);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3087:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3091:1: ( ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3092:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3092:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3093:1: ( rule__Method__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3094:1: ( rule__Method__ReturnTypeAssignment_5_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3094:2: rule__Method__ReturnTypeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Method__ReturnTypeAssignment_5_1_in_rule__Method__Group_5__1__Impl6219);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3108:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3112:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3113:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__06253);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__06256);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3120:1: rule__Package__Group__0__Impl : ( ( rule__Package__NameAssignment_0 )? ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3124:1: ( ( ( rule__Package__NameAssignment_0 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3125:1: ( ( rule__Package__NameAssignment_0 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3125:1: ( ( rule__Package__NameAssignment_0 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3126:1: ( rule__Package__NameAssignment_0 )?
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3127:1: ( rule__Package__NameAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3127:2: rule__Package__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Package__NameAssignment_0_in_rule__Package__Group__0__Impl6283);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3137:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3141:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3142:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__16314);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__16317);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3149:1: rule__Package__Group__1__Impl : ( ( rule__Package__Group_1__0 )* ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3153:1: ( ( ( rule__Package__Group_1__0 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3154:1: ( ( rule__Package__Group_1__0 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3154:1: ( ( rule__Package__Group_1__0 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3155:1: ( rule__Package__Group_1__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3156:1: ( rule__Package__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==33) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3156:2: rule__Package__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Package__Group_1__0_in_rule__Package__Group__1__Impl6344);
            	    rule__Package__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3166:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3170:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3171:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__26375);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__26378);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3178:1: rule__Package__Group__2__Impl : ( '[[' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3182:1: ( ( '[[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3183:1: ( '[[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3183:1: ( '[[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3184:1: '[['
            {
             before(grammarAccess.getPackageAccess().getLeftSquareBracketLeftSquareBracketKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Package__Group__2__Impl6406); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3197:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3201:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3202:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__36437);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__36440);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3209:1: rule__Package__Group__3__Impl : ( ( rule__Package__ClassTypeAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3213:1: ( ( ( rule__Package__ClassTypeAssignment_3 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3214:1: ( ( rule__Package__ClassTypeAssignment_3 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3214:1: ( ( rule__Package__ClassTypeAssignment_3 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3215:1: ( rule__Package__ClassTypeAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getClassTypeAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3216:1: ( rule__Package__ClassTypeAssignment_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=15 && LA39_0<=16)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3216:2: rule__Package__ClassTypeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__ClassTypeAssignment_3_in_rule__Package__Group__3__Impl6467);
            	    rule__Package__ClassTypeAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3226:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3230:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3231:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__46498);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__46501);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3238:1: rule__Package__Group__4__Impl : ( ( rule__Package__SubPackageAssignment_4 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3242:1: ( ( ( rule__Package__SubPackageAssignment_4 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3243:1: ( ( rule__Package__SubPackageAssignment_4 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3243:1: ( ( rule__Package__SubPackageAssignment_4 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3244:1: ( rule__Package__SubPackageAssignment_4 )?
            {
             before(grammarAccess.getPackageAccess().getSubPackageAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3245:1: ( rule__Package__SubPackageAssignment_4 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==31||LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3245:2: rule__Package__SubPackageAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Package__SubPackageAssignment_4_in_rule__Package__Group__4__Impl6528);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3255:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3259:1: ( rule__Package__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3260:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__56559);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3266:1: rule__Package__Group__5__Impl : ( ']]' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3270:1: ( ( ']]' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3271:1: ( ']]' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3271:1: ( ']]' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3272:1: ']]'
            {
             before(grammarAccess.getPackageAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__Package__Group__5__Impl6587); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3297:1: rule__Package__Group_1__0 : rule__Package__Group_1__0__Impl rule__Package__Group_1__1 ;
    public final void rule__Package__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3301:1: ( rule__Package__Group_1__0__Impl rule__Package__Group_1__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3302:2: rule__Package__Group_1__0__Impl rule__Package__Group_1__1
            {
            pushFollow(FOLLOW_rule__Package__Group_1__0__Impl_in_rule__Package__Group_1__06630);
            rule__Package__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_1__1_in_rule__Package__Group_1__06633);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3309:1: rule__Package__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Package__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3313:1: ( ( '.' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3314:1: ( '.' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3314:1: ( '.' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3315:1: '.'
            {
             before(grammarAccess.getPackageAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Package__Group_1__0__Impl6661); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3328:1: rule__Package__Group_1__1 : rule__Package__Group_1__1__Impl ;
    public final void rule__Package__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3332:1: ( rule__Package__Group_1__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3333:2: rule__Package__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_1__1__Impl_in_rule__Package__Group_1__16692);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3339:1: rule__Package__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Package__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3343:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3344:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3344:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3345:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__Group_1__1__Impl6719); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3361:1: rule__Model__GreetingsAssignment : ( rulePackage ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3365:1: ( ( rulePackage ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3366:1: ( rulePackage )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3366:1: ( rulePackage )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3367:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getGreetingsPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__GreetingsAssignment6757);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3376:1: rule__Class__ClassnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3380:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3381:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3381:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3382:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getClassnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ClassnameAssignment_16788); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3391:1: rule__Class__ExtensionAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__ExtensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3395:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3396:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3396:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3397:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getExtensionIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ExtensionAssignment_36819); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3406:1: rule__Class__ImplementsAssignment_4 : ( ruleImplements ) ;
    public final void rule__Class__ImplementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3410:1: ( ( ruleImplements ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3411:1: ( ruleImplements )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3411:1: ( ruleImplements )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3412:1: ruleImplements
            {
             before(grammarAccess.getClassAccess().getImplementsImplementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleImplements_in_rule__Class__ImplementsAssignment_46850);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3421:1: rule__Class__BodyAssignment_6 : ( ( rule__Class__BodyAlternatives_6_0 ) ) ;
    public final void rule__Class__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3425:1: ( ( ( rule__Class__BodyAlternatives_6_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3426:1: ( ( rule__Class__BodyAlternatives_6_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3426:1: ( ( rule__Class__BodyAlternatives_6_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3427:1: ( rule__Class__BodyAlternatives_6_0 )
            {
             before(grammarAccess.getClassAccess().getBodyAlternatives_6_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3428:1: ( rule__Class__BodyAlternatives_6_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3428:2: rule__Class__BodyAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Class__BodyAlternatives_6_0_in_rule__Class__BodyAssignment_66881);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3437:1: rule__Dependancy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dependancy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3441:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3442:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3442:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3443:1: RULE_ID
            {
             before(grammarAccess.getDependancyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependancy__NameAssignment_16914); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3452:1: rule__Enumeration__ClassnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3456:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3457:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3457:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3458:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getClassnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__ClassnameAssignment_26945); 
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


    // $ANTLR start "rule__Interface__InterfacenameAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3467:1: rule__Interface__InterfacenameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__InterfacenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3471:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3472:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3472:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3473:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getInterfacenameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__InterfacenameAssignment_26976); 
             after(grammarAccess.getInterfaceAccess().getInterfacenameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Interface__InterfacenameAssignment_2"


    // $ANTLR start "rule__Interface__BodyAssignment_4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3482:1: rule__Interface__BodyAssignment_4 : ( ruleMethod ) ;
    public final void rule__Interface__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3486:1: ( ( ruleMethod ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3487:1: ( ruleMethod )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3487:1: ( ruleMethod )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3488:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getBodyMethodParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__BodyAssignment_47007);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3497:1: rule__Abstract__ClassnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Abstract__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3501:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3502:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3502:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3503:1: RULE_ID
            {
             before(grammarAccess.getAbstractAccess().getClassnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abstract__ClassnameAssignment_27038); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3512:1: rule__Abstract__ExtensionAssignment_4 : ( RULE_ID ) ;
    public final void rule__Abstract__ExtensionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3516:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3517:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3517:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3518:1: RULE_ID
            {
             before(grammarAccess.getAbstractAccess().getExtensionIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abstract__ExtensionAssignment_47069); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3527:1: rule__Abstract__ImplementsAssignment_5 : ( ruleImplements ) ;
    public final void rule__Abstract__ImplementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3531:1: ( ( ruleImplements ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3532:1: ( ruleImplements )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3532:1: ( ruleImplements )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3533:1: ruleImplements
            {
             before(grammarAccess.getAbstractAccess().getImplementsImplementsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleImplements_in_rule__Abstract__ImplementsAssignment_57100);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3542:1: rule__Abstract__BodyAssignment_7 : ( ( rule__Abstract__BodyAlternatives_7_0 ) ) ;
    public final void rule__Abstract__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3546:1: ( ( ( rule__Abstract__BodyAlternatives_7_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3547:1: ( ( rule__Abstract__BodyAlternatives_7_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3547:1: ( ( rule__Abstract__BodyAlternatives_7_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3548:1: ( rule__Abstract__BodyAlternatives_7_0 )
            {
             before(grammarAccess.getAbstractAccess().getBodyAlternatives_7_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3549:1: ( rule__Abstract__BodyAlternatives_7_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3549:2: rule__Abstract__BodyAlternatives_7_0
            {
            pushFollow(FOLLOW_rule__Abstract__BodyAlternatives_7_0_in_rule__Abstract__BodyAssignment_77131);
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


    // $ANTLR start "rule__BiRelation__LinkNameAssignment_4"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3558:1: rule__BiRelation__LinkNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__BiRelation__LinkNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3562:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3563:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3563:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3564:1: RULE_ID
            {
             before(grammarAccess.getBiRelationAccess().getLinkNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BiRelation__LinkNameAssignment_47164); 
             after(grammarAccess.getBiRelationAccess().getLinkNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__BiRelation__LinkNameAssignment_4"


    // $ANTLR start "rule__Attribute__AttributenameAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3573:1: rule__Attribute__AttributenameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3577:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3578:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3578:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3579:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__AttributenameAssignment_27195); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3588:1: rule__Attribute__TypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3592:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3593:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3593:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3594:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_47226); 
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


    // $ANTLR start "rule__Attribute__BirelationAssignment_5_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3603:1: rule__Attribute__BirelationAssignment_5_1 : ( ruleBiRelation ) ;
    public final void rule__Attribute__BirelationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3607:1: ( ( ruleBiRelation ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3608:1: ( ruleBiRelation )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3608:1: ( ruleBiRelation )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3609:1: ruleBiRelation
            {
             before(grammarAccess.getAttributeAccess().getBirelationBiRelationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleBiRelation_in_rule__Attribute__BirelationAssignment_5_17257);
            ruleBiRelation();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getBirelationBiRelationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Attribute__BirelationAssignment_5_1"


    // $ANTLR start "rule__ParamIn__NameAssignment_0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3618:1: rule__ParamIn__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParamIn__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3622:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3623:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3623:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3624:1: RULE_ID
            {
             before(grammarAccess.getParamInAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParamIn__NameAssignment_07288); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3633:1: rule__ParamIn__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParamIn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3637:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3638:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3638:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3639:1: RULE_ID
            {
             before(grammarAccess.getParamInAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParamIn__TypeAssignment_27319); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3648:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3652:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3653:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3653:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3654:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_17350); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3663:1: rule__Method__ParamAssignment_3 : ( ruleparamIn ) ;
    public final void rule__Method__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3667:1: ( ( ruleparamIn ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3668:1: ( ruleparamIn )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3668:1: ( ruleparamIn )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3669:1: ruleparamIn
            {
             before(grammarAccess.getMethodAccess().getParamParamInParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleparamIn_in_rule__Method__ParamAssignment_37381);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3678:1: rule__Method__ReturnTypeAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Method__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3682:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3683:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3683:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3684:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReturnTypeIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_5_17412); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3693:1: rule__Package__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3697:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3698:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3698:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3699:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_07443); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3708:1: rule__Package__ClassTypeAssignment_3 : ( ruleElements ) ;
    public final void rule__Package__ClassTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3712:1: ( ( ruleElements ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3713:1: ( ruleElements )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3713:1: ( ruleElements )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3714:1: ruleElements
            {
             before(grammarAccess.getPackageAccess().getClassTypeElementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleElements_in_rule__Package__ClassTypeAssignment_37474);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3723:1: rule__Package__SubPackageAssignment_4 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3727:1: ( ( rulePackage ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3728:1: ( rulePackage )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3728:1: ( rulePackage )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3729:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_47505);
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


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\11\uffff";
    static final String DFA12_eofS =
        "\4\uffff\1\5\4\uffff";
    static final String DFA12_minS =
        "\1\32\2\4\1\uffff\1\17\1\uffff\1\4\1\5\1\22";
    static final String DFA12_maxS =
        "\1\32\1\33\1\34\1\uffff\1\26\1\uffff\1\34\1\16\1\35";
    static final String DFA12_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\3\uffff";
    static final String DFA12_specialS =
        "\11\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2\7\uffff\1\3\16\uffff\1\4",
            "\1\6\26\uffff\1\5\1\3",
            "",
            "\1\5\1\7\1\5\2\uffff\1\5\1\uffff\1\5",
            "",
            "\1\6\26\uffff\1\5\1\3",
            "\1\10\7\uffff\2\5",
            "\1\5\3\uffff\1\3\6\uffff\1\5"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "700:1: rule__Attribute__Alternatives_5 : ( ( ( rule__Attribute__Group_5_0__0 ) ) | ( ( rule__Attribute__BirelationAssignment_5_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000280000022L});
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
    public static final BitSet FOLLOW_ruleBiRelation_in_entryRuleBiRelation542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBiRelation549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__0_in_ruleBiRelation575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparamIn_in_entryRuleparamIn662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparamIn669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__0_in_ruleparamIn695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyVisibility789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyVisibility__Alternatives_in_ruleBodyVisibility815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassVisibility849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassVisibility__Alternatives_in_ruleClassVisibility875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Elements__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Elements__Alternatives988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__Elements__Alternatives1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Elements__Alternatives1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Class__BodyAlternatives_6_01054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Class__BodyAlternatives_6_01071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_rule__Class__BodyAlternatives_6_01088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Abstract__BodyAlternatives_7_01120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Abstract__BodyAlternatives_7_01137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0__0_in_rule__BiRelation__Alternatives_11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BiRelation__Alternatives_11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_1_0_1_11225 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_1_0_1_11238 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12_in_rule__BiRelation__Alternatives_1_0_1_11260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0__0_in_rule__BiRelation__Alternatives_71294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BiRelation__Alternatives_71313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_7_0_1_11350 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Alternatives_7_0_1_11363 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12_in_rule__BiRelation__Alternatives_7_0_1_11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Attribute__Alternatives_11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Alternatives_11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__0_in_rule__Attribute__Alternatives_51474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__BirelationAssignment_5_1_in_rule__Attribute__Alternatives_51492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BodyVisibility__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BodyVisibility__Alternatives1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BodyVisibility__Alternatives1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ClassVisibility__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ClassVisibility__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Class__Group__0__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11712 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ClassnameAssignment_1_in_rule__Class__Group__1__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21772 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class__Group__2__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31837 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ExtensionAssignment_3_in_rule__Class__Group__3__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41898 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ImplementsAssignment_4_in_rule__Class__Group__4__Impl1928 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51959 = new BitSet(new long[]{0x0000000000538000L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group__5__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__62021 = new BitSet(new long[]{0x0000000000538000L});
    public static final BitSet FOLLOW_rule__Class__Group__7_in_rule__Class__Group__62024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__BodyAssignment_6_in_rule__Class__Group__6__Impl2051 = new BitSet(new long[]{0x0000000000438002L});
    public static final BitSet FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__72082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Class__Group__7__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implements__Group__0__Impl_in_rule__Implements__Group__02157 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Implements__Group__1_in_rule__Implements__Group__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Implements__Group__0__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implements__Group__1__Impl_in_rule__Implements__Group__12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Implements__Group__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__02282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__02285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Dependancy__Group__0__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__12344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__NameAssignment_1_in_rule__Dependancy__Group__1__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02405 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Enumeration__Group__0__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Enumeration__Group__1__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22526 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__ClassnameAssignment_2_in_rule__Enumeration__Group__2__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32586 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__3__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42648 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl2678 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__52709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enumeration__Group__5__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__02780 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__02783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__Group_4__0__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__12839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Enumeration__Group_4__1__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02905 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Interface__Group__0__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23026 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__InterfacenameAssignment_2_in_rule__Interface__Group__2__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__33086 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__33089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Interface__Group__3__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__43148 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__43151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__BodyAssignment_4_in_rule__Interface__Group__4__Impl3178 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__53209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Interface__Group__5__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__03280 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Abstract__Group__0__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__13339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__2_in_rule__Abstract__Group__13342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Abstract__Group__1__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__2__Impl_in_rule__Abstract__Group__23401 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__3_in_rule__Abstract__Group__23404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ClassnameAssignment_2_in_rule__Abstract__Group__2__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__3__Impl_in_rule__Abstract__Group__33461 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__4_in_rule__Abstract__Group__33464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Abstract__Group__3__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__4__Impl_in_rule__Abstract__Group__43526 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__5_in_rule__Abstract__Group__43529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ExtensionAssignment_4_in_rule__Abstract__Group__4__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__5__Impl_in_rule__Abstract__Group__53587 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__6_in_rule__Abstract__Group__53590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ImplementsAssignment_5_in_rule__Abstract__Group__5__Impl3617 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_rule__Abstract__Group__6__Impl_in_rule__Abstract__Group__63648 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__7_in_rule__Abstract__Group__63651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Abstract__Group__6__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__7__Impl_in_rule__Abstract__Group__73710 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__8_in_rule__Abstract__Group__73713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__BodyAssignment_7_in_rule__Abstract__Group__7__Impl3740 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__8__Impl_in_rule__Abstract__Group__83771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Abstract__Group__8__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__0__Impl_in_rule__BiRelation__Group__03848 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__1_in_rule__BiRelation__Group__03851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BiRelation__Group__0__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__1__Impl_in_rule__BiRelation__Group__13910 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__2_in_rule__BiRelation__Group__13913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_1_in_rule__BiRelation__Group__1__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__2__Impl_in_rule__BiRelation__Group__23971 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__3_in_rule__BiRelation__Group__23974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BiRelation__Group__2__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__3__Impl_in_rule__BiRelation__Group__34033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__4_in_rule__BiRelation__Group__34036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BiRelation__Group__3__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__4__Impl_in_rule__BiRelation__Group__44095 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__5_in_rule__BiRelation__Group__44098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__LinkNameAssignment_4_in_rule__BiRelation__Group__4__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__5__Impl_in_rule__BiRelation__Group__54155 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__6_in_rule__BiRelation__Group__54158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BiRelation__Group__5__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__6__Impl_in_rule__BiRelation__Group__64217 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__7_in_rule__BiRelation__Group__64220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BiRelation__Group__6__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__7__Impl_in_rule__BiRelation__Group__74279 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__8_in_rule__BiRelation__Group__74282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_7_in_rule__BiRelation__Group__7__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__8__Impl_in_rule__BiRelation__Group__84340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BiRelation__Group__8__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0__0__Impl_in_rule__BiRelation__Group_1_0__04417 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0__1_in_rule__BiRelation__Group_1_0__04420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4450 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4463 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0__1__Impl_in_rule__BiRelation__Group_1_0__14496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__0_in_rule__BiRelation__Group_1_0__1__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__0__Impl_in_rule__BiRelation__Group_1_0_1__04557 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__1_in_rule__BiRelation__Group_1_0_1__04560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BiRelation__Group_1_0_1__0__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__1__Impl_in_rule__BiRelation__Group_1_0_1__14619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_1_0_1_1_in_rule__BiRelation__Group_1_0_1__1__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0__0__Impl_in_rule__BiRelation__Group_7_0__04680 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0__1_in_rule__BiRelation__Group_7_0__04683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4713 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4726 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0__1__Impl_in_rule__BiRelation__Group_7_0__14759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__0_in_rule__BiRelation__Group_7_0__1__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__0__Impl_in_rule__BiRelation__Group_7_0_1__04820 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__1_in_rule__BiRelation__Group_7_0_1__04823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BiRelation__Group_7_0_1__0__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__1__Impl_in_rule__BiRelation__Group_7_0_1__14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_7_0_1_1_in_rule__BiRelation__Group_7_0_1__1__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04943 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_rule__Attribute__Group__0__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15002 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_1_in_rule__Attribute__Group__1__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25063 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttributenameAssignment_2_in_rule__Attribute__Group__2__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__Group__3__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__45185 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__45188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__55245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_5_in_rule__Attribute__Group__5__Impl5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__0__Impl_in_rule__Attribute__Group_5_0__05315 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__1_in_rule__Attribute__Group_5_0__05318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Attribute__Group_5_0__0__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__1__Impl_in_rule__Attribute__Group_5_0__15377 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__2_in_rule__Attribute__Group_5_0__15380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Attribute__Group_5_0__1__Impl5408 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__2__Impl_in_rule__Attribute__Group_5_0__25439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Attribute__Group_5_0__2__Impl5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__0__Impl_in_rule__ParamIn__Group__05504 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__1_in_rule__ParamIn__Group__05507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__NameAssignment_0_in_rule__ParamIn__Group__0__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__1__Impl_in_rule__ParamIn__Group__15564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__2_in_rule__ParamIn__Group__15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ParamIn__Group__1__Impl5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__2__Impl_in_rule__ParamIn__Group__25626 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__3_in_rule__ParamIn__Group__25629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__TypeAssignment_2_in_rule__ParamIn__Group__2__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__3__Impl_in_rule__ParamIn__Group__35686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ParamIn__Group__3__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__05756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__05759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_rule__Method__Group__0__Impl5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__15815 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__15818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__25875 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__25878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method__Group__2__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__35937 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__35940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParamAssignment_3_in_rule__Method__Group__3__Impl5967 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__45998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Method__Group__4__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__0_in_rule__Method__Group__5__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__0__Impl_in_rule__Method__Group_5__06130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group_5__1_in_rule__Method__Group_5__06133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group_5__0__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__1__Impl_in_rule__Method__Group_5__16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_5_1_in_rule__Method__Group_5__1__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__06253 = new BitSet(new long[]{0x0000000280000020L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__06256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_0_in_rule__Package__Group__0__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__16314 = new BitSet(new long[]{0x0000000280000020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__16317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_1__0_in_rule__Package__Group__1__Impl6344 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__26375 = new BitSet(new long[]{0x0000000380018020L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__26378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Package__Group__2__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__36437 = new BitSet(new long[]{0x0000000380018020L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__36440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ClassTypeAssignment_3_in_rule__Package__Group__3__Impl6467 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__46498 = new BitSet(new long[]{0x0000000380018020L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__46501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__SubPackageAssignment_4_in_rule__Package__Group__4__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__56559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Package__Group__5__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_1__0__Impl_in_rule__Package__Group_1__06630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group_1__1_in_rule__Package__Group_1__06633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Package__Group_1__0__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_1__1__Impl_in_rule__Package__Group_1__16692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__Group_1__1__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__GreetingsAssignment6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ClassnameAssignment_16788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ExtensionAssignment_36819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_rule__Class__ImplementsAssignment_46850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__BodyAlternatives_6_0_in_rule__Class__BodyAssignment_66881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependancy__NameAssignment_16914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__ClassnameAssignment_26945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__InterfacenameAssignment_26976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__BodyAssignment_47007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abstract__ClassnameAssignment_27038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abstract__ExtensionAssignment_47069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_rule__Abstract__ImplementsAssignment_57100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__BodyAlternatives_7_0_in_rule__Abstract__BodyAssignment_77131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BiRelation__LinkNameAssignment_47164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__AttributenameAssignment_27195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_47226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiRelation_in_rule__Attribute__BirelationAssignment_5_17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParamIn__NameAssignment_07288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParamIn__TypeAssignment_27319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_17350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparamIn_in_rule__Method__ParamAssignment_37381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_5_17412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_07443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElements_in_rule__Package__ClassTypeAssignment_37474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_47505 = new BitSet(new long[]{0x0000000000000002L});

}