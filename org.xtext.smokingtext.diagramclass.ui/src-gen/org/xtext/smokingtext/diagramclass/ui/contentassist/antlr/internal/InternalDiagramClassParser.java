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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:69:1: ruleModel : ( ( rule__Model__PackageAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:73:2: ( ( ( rule__Model__PackageAssignment )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:74:1: ( ( rule__Model__PackageAssignment )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:74:1: ( ( rule__Model__PackageAssignment )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:75:1: ( rule__Model__PackageAssignment )*
            {
             before(grammarAccess.getModelAccess().getPackageAssignment()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:76:1: ( rule__Model__PackageAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==31||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:76:2: rule__Model__PackageAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackageAssignment_in_ruleModel94);
            	    rule__Model__PackageAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackageAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDependancy"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:144:1: entryRuleDependancy : ruleDependancy EOF ;
    public final void entryRuleDependancy() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:145:1: ( ruleDependancy EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:146:1: ruleDependancy EOF
            {
             before(grammarAccess.getDependancyRule()); 
            pushFollow(FOLLOW_ruleDependancy_in_entryRuleDependancy242);
            ruleDependancy();

            state._fsp--;

             after(grammarAccess.getDependancyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependancy249); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:153:1: ruleDependancy : ( ( rule__Dependancy__Group__0 ) ) ;
    public final void ruleDependancy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:157:2: ( ( ( rule__Dependancy__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:158:1: ( ( rule__Dependancy__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:158:1: ( ( rule__Dependancy__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:159:1: ( rule__Dependancy__Group__0 )
            {
             before(grammarAccess.getDependancyAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:160:1: ( rule__Dependancy__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:160:2: rule__Dependancy__Group__0
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__0_in_ruleDependancy275);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:172:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:173:1: ( ruleEnumeration EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:174:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration302);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration309); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:181:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:185:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:186:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:186:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:187:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:188:1: ( rule__Enumeration__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:188:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration335);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:200:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:201:1: ( ruleInterface EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:202:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface362);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface369); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:209:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:213:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:214:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:214:1: ( ( rule__Interface__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:215:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:216:1: ( rule__Interface__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:216:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface395);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:228:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:229:1: ( ruleAbstract EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:230:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract422);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract429); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:237:1: ruleAbstract : ( ( rule__Abstract__Group__0 ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:241:2: ( ( ( rule__Abstract__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:242:1: ( ( rule__Abstract__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:242:1: ( ( rule__Abstract__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:243:1: ( rule__Abstract__Group__0 )
            {
             before(grammarAccess.getAbstractAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:244:1: ( rule__Abstract__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:244:2: rule__Abstract__Group__0
            {
            pushFollow(FOLLOW_rule__Abstract__Group__0_in_ruleAbstract455);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:256:1: entryRuleBiRelation : ruleBiRelation EOF ;
    public final void entryRuleBiRelation() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:257:1: ( ruleBiRelation EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:258:1: ruleBiRelation EOF
            {
             before(grammarAccess.getBiRelationRule()); 
            pushFollow(FOLLOW_ruleBiRelation_in_entryRuleBiRelation482);
            ruleBiRelation();

            state._fsp--;

             after(grammarAccess.getBiRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBiRelation489); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:265:1: ruleBiRelation : ( ( rule__BiRelation__Group__0 ) ) ;
    public final void ruleBiRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:269:2: ( ( ( rule__BiRelation__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:270:1: ( ( rule__BiRelation__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:270:1: ( ( rule__BiRelation__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:271:1: ( rule__BiRelation__Group__0 )
            {
             before(grammarAccess.getBiRelationAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:272:1: ( rule__BiRelation__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:272:2: rule__BiRelation__Group__0
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__0_in_ruleBiRelation515);
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


    // $ANTLR start "entryRulePackageName"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:452:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:453:1: ( rulePackageName EOF )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:454:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName902);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName909); 

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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:461:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:465:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:466:1: ( ( rule__PackageName__Group__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:466:1: ( ( rule__PackageName__Group__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:467:1: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:468:1: ( rule__PackageName__Group__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:468:2: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0_in_rulePackageName935);
            rule__PackageName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageName"


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
                case RULE_ID:
                    {
                    alt2=1;
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
                case 25:
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

                    if ( (LA3_5==18) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==29) ) {
                        alt3=2;
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

                if ( ((LA3_2>=13 && LA3_2<=14)) ) {
                    alt3=1;
                }
                else if ( (LA3_2==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==18) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==29) ) {
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
            case 17:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_ID) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==18) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==29) ) {
                        alt3=2;
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

                    if ( (LA4_4==29) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==18) ) {
                        alt4=1;
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

                    if ( (LA4_4==29) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==18) ) {
                        alt4=1;
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

                if ( ((LA4_3>=13 && LA4_3<=14)) ) {
                    alt4=1;
                }
                else if ( (LA4_3==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==29) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:914:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:918:1: ( ( ( rule__Class__Group_4__0 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:919:1: ( ( rule__Class__Group_4__0 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:919:1: ( ( rule__Class__Group_4__0 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:920:1: ( rule__Class__Group_4__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:921:1: ( rule__Class__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:921:2: rule__Class__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl1928);
            	    rule__Class__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_4__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1037:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1041:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1042:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__02157);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__02160);
            rule__Class__Group_4__1();

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
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1049:1: rule__Class__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1053:1: ( ( ',' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1054:1: ( ',' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1054:1: ( ',' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1055:1: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Class__Group_4__0__Impl2188); 
             after(grammarAccess.getClassAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1068:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1072:1: ( rule__Class__Group_4__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1073:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__12219);
            rule__Class__Group_4__1__Impl();

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
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1079:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ImplementsAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1083:1: ( ( ( rule__Class__ImplementsAssignment_4_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1084:1: ( ( rule__Class__ImplementsAssignment_4_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1084:1: ( ( rule__Class__ImplementsAssignment_4_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1085:1: ( rule__Class__ImplementsAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getImplementsAssignment_4_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1086:1: ( rule__Class__ImplementsAssignment_4_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1086:2: rule__Class__ImplementsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class__ImplementsAssignment_4_1_in_rule__Class__Group_4__1__Impl2246);
            rule__Class__ImplementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getImplementsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Dependancy__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1100:1: rule__Dependancy__Group__0 : rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 ;
    public final void rule__Dependancy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1104:1: ( rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1105:2: rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__02280);
            rule__Dependancy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__02283);
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
            match(input,22,FOLLOW_22_in_rule__Dependancy__Group__0__Impl2311); 
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
            pushFollow(FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__12342);
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
            pushFollow(FOLLOW_rule__Dependancy__NameAssignment_1_in_rule__Dependancy__Group__1__Impl2369);
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
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02403);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02406);
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
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Enumeration__Group__0__Impl2433);
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
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12462);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12465);
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
            match(input,23,FOLLOW_23_in_rule__Enumeration__Group__1__Impl2493); 
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
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22524);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22527);
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
            pushFollow(FOLLOW_rule__Enumeration__ClassnameAssignment_2_in_rule__Enumeration__Group__2__Impl2554);
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
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32584);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32587);
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
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__3__Impl2615); 
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
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42646);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42649);
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
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1302:2: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl2676);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
            pushFollow(FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__52707);
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
            match(input,20,FOLLOW_20_in_rule__Enumeration__Group__5__Impl2735); 
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
            pushFollow(FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__02778);
            rule__Enumeration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__02781);
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__Group_4__0__Impl2808); 
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
            pushFollow(FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__12837);
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
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1402:2: ','
                    {
                    match(input,21,FOLLOW_21_in_rule__Enumeration__Group_4__1__Impl2866); 

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
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02903);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02906);
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
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Interface__Group__0__Impl2933);
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
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12962);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12965);
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
            match(input,24,FOLLOW_24_in_rule__Interface__Group__1__Impl2993); 
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
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23024);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23027);
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
            pushFollow(FOLLOW_rule__Interface__InterfacenameAssignment_2_in_rule__Interface__Group__2__Impl3054);
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
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__33084);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__33087);
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
            match(input,19,FOLLOW_19_in_rule__Interface__Group__3__Impl3115); 
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
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__43146);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__43149);
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
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=15 && LA21_0<=17)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1556:2: rule__Interface__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interface__BodyAssignment_4_in_rule__Interface__Group__4__Impl3176);
            	    rule__Interface__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__53207);
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
            match(input,20,FOLLOW_20_in_rule__Interface__Group__5__Impl3235); 
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
            pushFollow(FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__03278);
            rule__Abstract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__03281);
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
            pushFollow(FOLLOW_ruleClassVisibility_in_rule__Abstract__Group__0__Impl3308);
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
            pushFollow(FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__13337);
            rule__Abstract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__2_in_rule__Abstract__Group__13340);
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
            match(input,25,FOLLOW_25_in_rule__Abstract__Group__1__Impl3368); 
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
            pushFollow(FOLLOW_rule__Abstract__Group__2__Impl_in_rule__Abstract__Group__23399);
            rule__Abstract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__3_in_rule__Abstract__Group__23402);
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
            pushFollow(FOLLOW_rule__Abstract__ClassnameAssignment_2_in_rule__Abstract__Group__2__Impl3429);
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
            pushFollow(FOLLOW_rule__Abstract__Group__3__Impl_in_rule__Abstract__Group__33459);
            rule__Abstract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__4_in_rule__Abstract__Group__33462);
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
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1717:2: ':'
                    {
                    match(input,18,FOLLOW_18_in_rule__Abstract__Group__3__Impl3491); 

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
            pushFollow(FOLLOW_rule__Abstract__Group__4__Impl_in_rule__Abstract__Group__43524);
            rule__Abstract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__5_in_rule__Abstract__Group__43527);
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
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1747:2: rule__Abstract__ExtensionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Abstract__ExtensionAssignment_4_in_rule__Abstract__Group__4__Impl3554);
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
            pushFollow(FOLLOW_rule__Abstract__Group__5__Impl_in_rule__Abstract__Group__53585);
            rule__Abstract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__6_in_rule__Abstract__Group__53588);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1769:1: rule__Abstract__Group__5__Impl : ( ( rule__Abstract__Group_5__0 )* ) ;
    public final void rule__Abstract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1773:1: ( ( ( rule__Abstract__Group_5__0 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1774:1: ( ( rule__Abstract__Group_5__0 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1774:1: ( ( rule__Abstract__Group_5__0 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1775:1: ( rule__Abstract__Group_5__0 )*
            {
             before(grammarAccess.getAbstractAccess().getGroup_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1776:1: ( rule__Abstract__Group_5__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1776:2: rule__Abstract__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Abstract__Group_5__0_in_rule__Abstract__Group__5__Impl3615);
            	    rule__Abstract__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAbstractAccess().getGroup_5()); 

            }


            }

        }
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
            pushFollow(FOLLOW_rule__Abstract__Group__6__Impl_in_rule__Abstract__Group__63646);
            rule__Abstract__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__7_in_rule__Abstract__Group__63649);
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
            match(input,19,FOLLOW_19_in_rule__Abstract__Group__6__Impl3677); 
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
            pushFollow(FOLLOW_rule__Abstract__Group__7__Impl_in_rule__Abstract__Group__73708);
            rule__Abstract__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__8_in_rule__Abstract__Group__73711);
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
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=15 && LA25_0<=17)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1836:2: rule__Abstract__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Abstract__BodyAssignment_7_in_rule__Abstract__Group__7__Impl3738);
            	    rule__Abstract__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
            pushFollow(FOLLOW_rule__Abstract__Group__8__Impl_in_rule__Abstract__Group__83769);
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
            match(input,20,FOLLOW_20_in_rule__Abstract__Group__8__Impl3797); 
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


    // $ANTLR start "rule__Abstract__Group_5__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1894:1: rule__Abstract__Group_5__0 : rule__Abstract__Group_5__0__Impl rule__Abstract__Group_5__1 ;
    public final void rule__Abstract__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1898:1: ( rule__Abstract__Group_5__0__Impl rule__Abstract__Group_5__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1899:2: rule__Abstract__Group_5__0__Impl rule__Abstract__Group_5__1
            {
            pushFollow(FOLLOW_rule__Abstract__Group_5__0__Impl_in_rule__Abstract__Group_5__03846);
            rule__Abstract__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group_5__1_in_rule__Abstract__Group_5__03849);
            rule__Abstract__Group_5__1();

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
    // $ANTLR end "rule__Abstract__Group_5__0"


    // $ANTLR start "rule__Abstract__Group_5__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1906:1: rule__Abstract__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Abstract__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1910:1: ( ( ',' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1911:1: ( ',' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1911:1: ( ',' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1912:1: ','
            {
             before(grammarAccess.getAbstractAccess().getCommaKeyword_5_0()); 
            match(input,21,FOLLOW_21_in_rule__Abstract__Group_5__0__Impl3877); 
             after(grammarAccess.getAbstractAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Group_5__0__Impl"


    // $ANTLR start "rule__Abstract__Group_5__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1925:1: rule__Abstract__Group_5__1 : rule__Abstract__Group_5__1__Impl ;
    public final void rule__Abstract__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1929:1: ( rule__Abstract__Group_5__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1930:2: rule__Abstract__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Abstract__Group_5__1__Impl_in_rule__Abstract__Group_5__13908);
            rule__Abstract__Group_5__1__Impl();

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
    // $ANTLR end "rule__Abstract__Group_5__1"


    // $ANTLR start "rule__Abstract__Group_5__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1936:1: rule__Abstract__Group_5__1__Impl : ( ( rule__Abstract__ImplementsAssignment_5_1 ) ) ;
    public final void rule__Abstract__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1940:1: ( ( ( rule__Abstract__ImplementsAssignment_5_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1941:1: ( ( rule__Abstract__ImplementsAssignment_5_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1941:1: ( ( rule__Abstract__ImplementsAssignment_5_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1942:1: ( rule__Abstract__ImplementsAssignment_5_1 )
            {
             before(grammarAccess.getAbstractAccess().getImplementsAssignment_5_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1943:1: ( rule__Abstract__ImplementsAssignment_5_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1943:2: rule__Abstract__ImplementsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Abstract__ImplementsAssignment_5_1_in_rule__Abstract__Group_5__1__Impl3935);
            rule__Abstract__ImplementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getImplementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Group_5__1__Impl"


    // $ANTLR start "rule__BiRelation__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1957:1: rule__BiRelation__Group__0 : rule__BiRelation__Group__0__Impl rule__BiRelation__Group__1 ;
    public final void rule__BiRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1961:1: ( rule__BiRelation__Group__0__Impl rule__BiRelation__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1962:2: rule__BiRelation__Group__0__Impl rule__BiRelation__Group__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__0__Impl_in_rule__BiRelation__Group__03969);
            rule__BiRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__1_in_rule__BiRelation__Group__03972);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1969:1: rule__BiRelation__Group__0__Impl : ( '[' ) ;
    public final void rule__BiRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1973:1: ( ( '[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1974:1: ( '[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1974:1: ( '[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1975:1: '['
            {
             before(grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__BiRelation__Group__0__Impl4000); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1988:1: rule__BiRelation__Group__1 : rule__BiRelation__Group__1__Impl rule__BiRelation__Group__2 ;
    public final void rule__BiRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1992:1: ( rule__BiRelation__Group__1__Impl rule__BiRelation__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:1993:2: rule__BiRelation__Group__1__Impl rule__BiRelation__Group__2
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__1__Impl_in_rule__BiRelation__Group__14031);
            rule__BiRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__2_in_rule__BiRelation__Group__14034);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2000:1: rule__BiRelation__Group__1__Impl : ( ( rule__BiRelation__Alternatives_1 )? ) ;
    public final void rule__BiRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2004:1: ( ( ( rule__BiRelation__Alternatives_1 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2005:1: ( ( rule__BiRelation__Alternatives_1 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2005:1: ( ( rule__BiRelation__Alternatives_1 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2006:1: ( rule__BiRelation__Alternatives_1 )?
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2007:1: ( rule__BiRelation__Alternatives_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NUMBER||LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2007:2: rule__BiRelation__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__BiRelation__Alternatives_1_in_rule__BiRelation__Group__1__Impl4061);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2017:1: rule__BiRelation__Group__2 : rule__BiRelation__Group__2__Impl rule__BiRelation__Group__3 ;
    public final void rule__BiRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2021:1: ( rule__BiRelation__Group__2__Impl rule__BiRelation__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2022:2: rule__BiRelation__Group__2__Impl rule__BiRelation__Group__3
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__2__Impl_in_rule__BiRelation__Group__24092);
            rule__BiRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__3_in_rule__BiRelation__Group__24095);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2029:1: rule__BiRelation__Group__2__Impl : ( ']' ) ;
    public final void rule__BiRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2033:1: ( ( ']' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2034:1: ( ']' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2034:1: ( ']' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2035:1: ']'
            {
             before(grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__BiRelation__Group__2__Impl4123); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2048:1: rule__BiRelation__Group__3 : rule__BiRelation__Group__3__Impl rule__BiRelation__Group__4 ;
    public final void rule__BiRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2052:1: ( rule__BiRelation__Group__3__Impl rule__BiRelation__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2053:2: rule__BiRelation__Group__3__Impl rule__BiRelation__Group__4
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__3__Impl_in_rule__BiRelation__Group__34154);
            rule__BiRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__4_in_rule__BiRelation__Group__34157);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2060:1: rule__BiRelation__Group__3__Impl : ( '-' ) ;
    public final void rule__BiRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2064:1: ( ( '-' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2065:1: ( '-' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2065:1: ( '-' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2066:1: '-'
            {
             before(grammarAccess.getBiRelationAccess().getHyphenMinusKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BiRelation__Group__3__Impl4185); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2079:1: rule__BiRelation__Group__4 : rule__BiRelation__Group__4__Impl rule__BiRelation__Group__5 ;
    public final void rule__BiRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2083:1: ( rule__BiRelation__Group__4__Impl rule__BiRelation__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2084:2: rule__BiRelation__Group__4__Impl rule__BiRelation__Group__5
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__4__Impl_in_rule__BiRelation__Group__44216);
            rule__BiRelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__5_in_rule__BiRelation__Group__44219);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2091:1: rule__BiRelation__Group__4__Impl : ( ( rule__BiRelation__LinkNameAssignment_4 ) ) ;
    public final void rule__BiRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2095:1: ( ( ( rule__BiRelation__LinkNameAssignment_4 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2096:1: ( ( rule__BiRelation__LinkNameAssignment_4 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2096:1: ( ( rule__BiRelation__LinkNameAssignment_4 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2097:1: ( rule__BiRelation__LinkNameAssignment_4 )
            {
             before(grammarAccess.getBiRelationAccess().getLinkNameAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2098:1: ( rule__BiRelation__LinkNameAssignment_4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2098:2: rule__BiRelation__LinkNameAssignment_4
            {
            pushFollow(FOLLOW_rule__BiRelation__LinkNameAssignment_4_in_rule__BiRelation__Group__4__Impl4246);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2108:1: rule__BiRelation__Group__5 : rule__BiRelation__Group__5__Impl rule__BiRelation__Group__6 ;
    public final void rule__BiRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2112:1: ( rule__BiRelation__Group__5__Impl rule__BiRelation__Group__6 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2113:2: rule__BiRelation__Group__5__Impl rule__BiRelation__Group__6
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__5__Impl_in_rule__BiRelation__Group__54276);
            rule__BiRelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__6_in_rule__BiRelation__Group__54279);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2120:1: rule__BiRelation__Group__5__Impl : ( '->' ) ;
    public final void rule__BiRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2124:1: ( ( '->' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2125:1: ( '->' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2125:1: ( '->' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2126:1: '->'
            {
             before(grammarAccess.getBiRelationAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__BiRelation__Group__5__Impl4307); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2139:1: rule__BiRelation__Group__6 : rule__BiRelation__Group__6__Impl rule__BiRelation__Group__7 ;
    public final void rule__BiRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2143:1: ( rule__BiRelation__Group__6__Impl rule__BiRelation__Group__7 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2144:2: rule__BiRelation__Group__6__Impl rule__BiRelation__Group__7
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__6__Impl_in_rule__BiRelation__Group__64338);
            rule__BiRelation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__7_in_rule__BiRelation__Group__64341);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2151:1: rule__BiRelation__Group__6__Impl : ( '[' ) ;
    public final void rule__BiRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2155:1: ( ( '[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2156:1: ( '[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2156:1: ( '[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2157:1: '['
            {
             before(grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__BiRelation__Group__6__Impl4369); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2170:1: rule__BiRelation__Group__7 : rule__BiRelation__Group__7__Impl rule__BiRelation__Group__8 ;
    public final void rule__BiRelation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2174:1: ( rule__BiRelation__Group__7__Impl rule__BiRelation__Group__8 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2175:2: rule__BiRelation__Group__7__Impl rule__BiRelation__Group__8
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__7__Impl_in_rule__BiRelation__Group__74400);
            rule__BiRelation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group__8_in_rule__BiRelation__Group__74403);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2182:1: rule__BiRelation__Group__7__Impl : ( ( rule__BiRelation__Alternatives_7 )? ) ;
    public final void rule__BiRelation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2186:1: ( ( ( rule__BiRelation__Alternatives_7 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2187:1: ( ( rule__BiRelation__Alternatives_7 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2187:1: ( ( rule__BiRelation__Alternatives_7 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2188:1: ( rule__BiRelation__Alternatives_7 )?
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_7()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2189:1: ( rule__BiRelation__Alternatives_7 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NUMBER||LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2189:2: rule__BiRelation__Alternatives_7
                    {
                    pushFollow(FOLLOW_rule__BiRelation__Alternatives_7_in_rule__BiRelation__Group__7__Impl4430);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2199:1: rule__BiRelation__Group__8 : rule__BiRelation__Group__8__Impl ;
    public final void rule__BiRelation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2203:1: ( rule__BiRelation__Group__8__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2204:2: rule__BiRelation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group__8__Impl_in_rule__BiRelation__Group__84461);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2210:1: rule__BiRelation__Group__8__Impl : ( ']' ) ;
    public final void rule__BiRelation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2214:1: ( ( ']' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2215:1: ( ']' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2215:1: ( ']' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2216:1: ']'
            {
             before(grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__BiRelation__Group__8__Impl4489); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2247:1: rule__BiRelation__Group_1_0__0 : rule__BiRelation__Group_1_0__0__Impl rule__BiRelation__Group_1_0__1 ;
    public final void rule__BiRelation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2251:1: ( rule__BiRelation__Group_1_0__0__Impl rule__BiRelation__Group_1_0__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2252:2: rule__BiRelation__Group_1_0__0__Impl rule__BiRelation__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0__0__Impl_in_rule__BiRelation__Group_1_0__04538);
            rule__BiRelation__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_1_0__1_in_rule__BiRelation__Group_1_0__04541);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2259:1: rule__BiRelation__Group_1_0__0__Impl : ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) ;
    public final void rule__BiRelation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2263:1: ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2264:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2264:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2265:1: ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2265:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2266:1: ( RULE_NUMBER )
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2267:1: ( RULE_NUMBER )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2267:3: RULE_NUMBER
            {
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4571); 

            }

             after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 

            }

            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2270:1: ( ( RULE_NUMBER )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2271:1: ( RULE_NUMBER )*
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2272:1: ( RULE_NUMBER )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_NUMBER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2272:3: RULE_NUMBER
            	    {
            	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4584); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2283:1: rule__BiRelation__Group_1_0__1 : rule__BiRelation__Group_1_0__1__Impl ;
    public final void rule__BiRelation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2287:1: ( rule__BiRelation__Group_1_0__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2288:2: rule__BiRelation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0__1__Impl_in_rule__BiRelation__Group_1_0__14617);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2294:1: rule__BiRelation__Group_1_0__1__Impl : ( ( rule__BiRelation__Group_1_0_1__0 ) ) ;
    public final void rule__BiRelation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2298:1: ( ( ( rule__BiRelation__Group_1_0_1__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2299:1: ( ( rule__BiRelation__Group_1_0_1__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2299:1: ( ( rule__BiRelation__Group_1_0_1__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2300:1: ( rule__BiRelation__Group_1_0_1__0 )
            {
             before(grammarAccess.getBiRelationAccess().getGroup_1_0_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2301:1: ( rule__BiRelation__Group_1_0_1__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2301:2: rule__BiRelation__Group_1_0_1__0
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__0_in_rule__BiRelation__Group_1_0__1__Impl4644);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2315:1: rule__BiRelation__Group_1_0_1__0 : rule__BiRelation__Group_1_0_1__0__Impl rule__BiRelation__Group_1_0_1__1 ;
    public final void rule__BiRelation__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2319:1: ( rule__BiRelation__Group_1_0_1__0__Impl rule__BiRelation__Group_1_0_1__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2320:2: rule__BiRelation__Group_1_0_1__0__Impl rule__BiRelation__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__0__Impl_in_rule__BiRelation__Group_1_0_1__04678);
            rule__BiRelation__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__1_in_rule__BiRelation__Group_1_0_1__04681);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2327:1: rule__BiRelation__Group_1_0_1__0__Impl : ( '..' ) ;
    public final void rule__BiRelation__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2331:1: ( ( '..' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2332:1: ( '..' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2332:1: ( '..' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2333:1: '..'
            {
             before(grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_1_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__BiRelation__Group_1_0_1__0__Impl4709); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2346:1: rule__BiRelation__Group_1_0_1__1 : rule__BiRelation__Group_1_0_1__1__Impl ;
    public final void rule__BiRelation__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2350:1: ( rule__BiRelation__Group_1_0_1__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2351:2: rule__BiRelation__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_1_0_1__1__Impl_in_rule__BiRelation__Group_1_0_1__14740);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2357:1: rule__BiRelation__Group_1_0_1__1__Impl : ( ( rule__BiRelation__Alternatives_1_0_1_1 ) ) ;
    public final void rule__BiRelation__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2361:1: ( ( ( rule__BiRelation__Alternatives_1_0_1_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2362:1: ( ( rule__BiRelation__Alternatives_1_0_1_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2362:1: ( ( rule__BiRelation__Alternatives_1_0_1_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2363:1: ( rule__BiRelation__Alternatives_1_0_1_1 )
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_1_0_1_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2364:1: ( rule__BiRelation__Alternatives_1_0_1_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2364:2: rule__BiRelation__Alternatives_1_0_1_1
            {
            pushFollow(FOLLOW_rule__BiRelation__Alternatives_1_0_1_1_in_rule__BiRelation__Group_1_0_1__1__Impl4767);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2378:1: rule__BiRelation__Group_7_0__0 : rule__BiRelation__Group_7_0__0__Impl rule__BiRelation__Group_7_0__1 ;
    public final void rule__BiRelation__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2382:1: ( rule__BiRelation__Group_7_0__0__Impl rule__BiRelation__Group_7_0__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2383:2: rule__BiRelation__Group_7_0__0__Impl rule__BiRelation__Group_7_0__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0__0__Impl_in_rule__BiRelation__Group_7_0__04801);
            rule__BiRelation__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_7_0__1_in_rule__BiRelation__Group_7_0__04804);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2390:1: rule__BiRelation__Group_7_0__0__Impl : ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) ;
    public final void rule__BiRelation__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2394:1: ( ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2395:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2395:1: ( ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2396:1: ( ( RULE_NUMBER ) ) ( ( RULE_NUMBER )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2396:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2397:1: ( RULE_NUMBER )
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2398:1: ( RULE_NUMBER )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2398:3: RULE_NUMBER
            {
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4834); 

            }

             after(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 

            }

            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2401:1: ( ( RULE_NUMBER )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2402:1: ( RULE_NUMBER )*
            {
             before(grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2403:1: ( RULE_NUMBER )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_NUMBER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2403:3: RULE_NUMBER
            	    {
            	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4847); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2414:1: rule__BiRelation__Group_7_0__1 : rule__BiRelation__Group_7_0__1__Impl ;
    public final void rule__BiRelation__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2418:1: ( rule__BiRelation__Group_7_0__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2419:2: rule__BiRelation__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0__1__Impl_in_rule__BiRelation__Group_7_0__14880);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2425:1: rule__BiRelation__Group_7_0__1__Impl : ( ( rule__BiRelation__Group_7_0_1__0 ) ) ;
    public final void rule__BiRelation__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2429:1: ( ( ( rule__BiRelation__Group_7_0_1__0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2430:1: ( ( rule__BiRelation__Group_7_0_1__0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2430:1: ( ( rule__BiRelation__Group_7_0_1__0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2431:1: ( rule__BiRelation__Group_7_0_1__0 )
            {
             before(grammarAccess.getBiRelationAccess().getGroup_7_0_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2432:1: ( rule__BiRelation__Group_7_0_1__0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2432:2: rule__BiRelation__Group_7_0_1__0
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__0_in_rule__BiRelation__Group_7_0__1__Impl4907);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2446:1: rule__BiRelation__Group_7_0_1__0 : rule__BiRelation__Group_7_0_1__0__Impl rule__BiRelation__Group_7_0_1__1 ;
    public final void rule__BiRelation__Group_7_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2450:1: ( rule__BiRelation__Group_7_0_1__0__Impl rule__BiRelation__Group_7_0_1__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2451:2: rule__BiRelation__Group_7_0_1__0__Impl rule__BiRelation__Group_7_0_1__1
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__0__Impl_in_rule__BiRelation__Group_7_0_1__04941);
            rule__BiRelation__Group_7_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__1_in_rule__BiRelation__Group_7_0_1__04944);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2458:1: rule__BiRelation__Group_7_0_1__0__Impl : ( '..' ) ;
    public final void rule__BiRelation__Group_7_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2462:1: ( ( '..' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2463:1: ( '..' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2463:1: ( '..' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2464:1: '..'
            {
             before(grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_7_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__BiRelation__Group_7_0_1__0__Impl4972); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2477:1: rule__BiRelation__Group_7_0_1__1 : rule__BiRelation__Group_7_0_1__1__Impl ;
    public final void rule__BiRelation__Group_7_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2481:1: ( rule__BiRelation__Group_7_0_1__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2482:2: rule__BiRelation__Group_7_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BiRelation__Group_7_0_1__1__Impl_in_rule__BiRelation__Group_7_0_1__15003);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2488:1: rule__BiRelation__Group_7_0_1__1__Impl : ( ( rule__BiRelation__Alternatives_7_0_1_1 ) ) ;
    public final void rule__BiRelation__Group_7_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2492:1: ( ( ( rule__BiRelation__Alternatives_7_0_1_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2493:1: ( ( rule__BiRelation__Alternatives_7_0_1_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2493:1: ( ( rule__BiRelation__Alternatives_7_0_1_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2494:1: ( rule__BiRelation__Alternatives_7_0_1_1 )
            {
             before(grammarAccess.getBiRelationAccess().getAlternatives_7_0_1_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2495:1: ( rule__BiRelation__Alternatives_7_0_1_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2495:2: rule__BiRelation__Alternatives_7_0_1_1
            {
            pushFollow(FOLLOW_rule__BiRelation__Alternatives_7_0_1_1_in_rule__BiRelation__Group_7_0_1__1__Impl5030);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2509:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2513:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2514:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05064);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05067);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2521:1: rule__Attribute__Group__0__Impl : ( ruleBodyVisibility ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2525:1: ( ( ruleBodyVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2526:1: ( ruleBodyVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2526:1: ( ruleBodyVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2527:1: ruleBodyVisibility
            {
             before(grammarAccess.getAttributeAccess().getBodyVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_rule__Attribute__Group__0__Impl5094);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2538:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2542:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2543:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15123);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15126);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2550:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Alternatives_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2554:1: ( ( ( rule__Attribute__Alternatives_1 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2555:1: ( ( rule__Attribute__Alternatives_1 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2555:1: ( ( rule__Attribute__Alternatives_1 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2556:1: ( rule__Attribute__Alternatives_1 )?
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2557:1: ( rule__Attribute__Alternatives_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=13 && LA30_0<=14)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2557:2: rule__Attribute__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__Alternatives_1_in_rule__Attribute__Group__1__Impl5153);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2567:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2571:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2572:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25184);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25187);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2579:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributenameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2583:1: ( ( ( rule__Attribute__AttributenameAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2584:1: ( ( rule__Attribute__AttributenameAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2584:1: ( ( rule__Attribute__AttributenameAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2585:1: ( rule__Attribute__AttributenameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributenameAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2586:1: ( rule__Attribute__AttributenameAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2586:2: rule__Attribute__AttributenameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__AttributenameAssignment_2_in_rule__Attribute__Group__2__Impl5214);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2596:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2600:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2601:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35244);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35247);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2608:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2612:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2613:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2613:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2614:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__Group__3__Impl5275); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2627:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2631:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2632:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__45306);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__45309);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2639:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2643:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2644:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2644:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2645:1: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2646:1: ( rule__Attribute__TypeAssignment_4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2646:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl5336);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2656:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2660:1: ( rule__Attribute__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2661:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__55366);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2667:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Alternatives_5 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2671:1: ( ( ( rule__Attribute__Alternatives_5 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2672:1: ( ( rule__Attribute__Alternatives_5 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2672:1: ( ( rule__Attribute__Alternatives_5 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2673:1: ( rule__Attribute__Alternatives_5 )?
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2674:1: ( rule__Attribute__Alternatives_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2674:2: rule__Attribute__Alternatives_5
                    {
                    pushFollow(FOLLOW_rule__Attribute__Alternatives_5_in_rule__Attribute__Group__5__Impl5393);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2696:1: rule__Attribute__Group_5_0__0 : rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 ;
    public final void rule__Attribute__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2700:1: ( rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2701:2: rule__Attribute__Group_5_0__0__Impl rule__Attribute__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5_0__0__Impl_in_rule__Attribute__Group_5_0__05436);
            rule__Attribute__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5_0__1_in_rule__Attribute__Group_5_0__05439);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2708:1: rule__Attribute__Group_5_0__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2712:1: ( ( '[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2713:1: ( '[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2713:1: ( '[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2714:1: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Attribute__Group_5_0__0__Impl5467); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2727:1: rule__Attribute__Group_5_0__1 : rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 ;
    public final void rule__Attribute__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2731:1: ( rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2732:2: rule__Attribute__Group_5_0__1__Impl rule__Attribute__Group_5_0__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5_0__1__Impl_in_rule__Attribute__Group_5_0__15498);
            rule__Attribute__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5_0__2_in_rule__Attribute__Group_5_0__15501);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2739:1: rule__Attribute__Group_5_0__1__Impl : ( ( RULE_NUMBER )* ) ;
    public final void rule__Attribute__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2743:1: ( ( ( RULE_NUMBER )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2744:1: ( ( RULE_NUMBER )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2744:1: ( ( RULE_NUMBER )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2745:1: ( RULE_NUMBER )*
            {
             before(grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_0_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2746:1: ( RULE_NUMBER )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_NUMBER) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2746:3: RULE_NUMBER
            	    {
            	    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Attribute__Group_5_0__1__Impl5529); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2756:1: rule__Attribute__Group_5_0__2 : rule__Attribute__Group_5_0__2__Impl ;
    public final void rule__Attribute__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2760:1: ( rule__Attribute__Group_5_0__2__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2761:2: rule__Attribute__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5_0__2__Impl_in_rule__Attribute__Group_5_0__25560);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2767:1: rule__Attribute__Group_5_0__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2771:1: ( ( ']' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2772:1: ( ']' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2772:1: ( ']' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2773:1: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Attribute__Group_5_0__2__Impl5588); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2792:1: rule__ParamIn__Group__0 : rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1 ;
    public final void rule__ParamIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2796:1: ( rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2797:2: rule__ParamIn__Group__0__Impl rule__ParamIn__Group__1
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__0__Impl_in_rule__ParamIn__Group__05625);
            rule__ParamIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__1_in_rule__ParamIn__Group__05628);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2804:1: rule__ParamIn__Group__0__Impl : ( ( rule__ParamIn__NameAssignment_0 ) ) ;
    public final void rule__ParamIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2808:1: ( ( ( rule__ParamIn__NameAssignment_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2809:1: ( ( rule__ParamIn__NameAssignment_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2809:1: ( ( rule__ParamIn__NameAssignment_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2810:1: ( rule__ParamIn__NameAssignment_0 )
            {
             before(grammarAccess.getParamInAccess().getNameAssignment_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2811:1: ( rule__ParamIn__NameAssignment_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2811:2: rule__ParamIn__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamIn__NameAssignment_0_in_rule__ParamIn__Group__0__Impl5655);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2821:1: rule__ParamIn__Group__1 : rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2 ;
    public final void rule__ParamIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2825:1: ( rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2826:2: rule__ParamIn__Group__1__Impl rule__ParamIn__Group__2
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__1__Impl_in_rule__ParamIn__Group__15685);
            rule__ParamIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__2_in_rule__ParamIn__Group__15688);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2833:1: rule__ParamIn__Group__1__Impl : ( ':' ) ;
    public final void rule__ParamIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2837:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2838:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2838:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2839:1: ':'
            {
             before(grammarAccess.getParamInAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ParamIn__Group__1__Impl5716); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2852:1: rule__ParamIn__Group__2 : rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3 ;
    public final void rule__ParamIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2856:1: ( rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2857:2: rule__ParamIn__Group__2__Impl rule__ParamIn__Group__3
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__2__Impl_in_rule__ParamIn__Group__25747);
            rule__ParamIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamIn__Group__3_in_rule__ParamIn__Group__25750);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2864:1: rule__ParamIn__Group__2__Impl : ( ( rule__ParamIn__TypeAssignment_2 ) ) ;
    public final void rule__ParamIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2868:1: ( ( ( rule__ParamIn__TypeAssignment_2 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2869:1: ( ( rule__ParamIn__TypeAssignment_2 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2869:1: ( ( rule__ParamIn__TypeAssignment_2 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2870:1: ( rule__ParamIn__TypeAssignment_2 )
            {
             before(grammarAccess.getParamInAccess().getTypeAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2871:1: ( rule__ParamIn__TypeAssignment_2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2871:2: rule__ParamIn__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ParamIn__TypeAssignment_2_in_rule__ParamIn__Group__2__Impl5777);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2881:1: rule__ParamIn__Group__3 : rule__ParamIn__Group__3__Impl ;
    public final void rule__ParamIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2885:1: ( rule__ParamIn__Group__3__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2886:2: rule__ParamIn__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamIn__Group__3__Impl_in_rule__ParamIn__Group__35807);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2892:1: rule__ParamIn__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__ParamIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2896:1: ( ( ( ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2897:1: ( ( ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2897:1: ( ( ',' )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2898:1: ( ',' )?
            {
             before(grammarAccess.getParamInAccess().getCommaKeyword_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2899:1: ( ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2900:2: ','
                    {
                    match(input,21,FOLLOW_21_in_rule__ParamIn__Group__3__Impl5836); 

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2919:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2923:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2924:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__05877);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__05880);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2931:1: rule__Method__Group__0__Impl : ( ruleBodyVisibility ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2935:1: ( ( ruleBodyVisibility ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2936:1: ( ruleBodyVisibility )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2936:1: ( ruleBodyVisibility )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2937:1: ruleBodyVisibility
            {
             before(grammarAccess.getMethodAccess().getBodyVisibilityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_rule__Method__Group__0__Impl5907);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2948:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2952:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2953:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__15936);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__15939);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2960:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2964:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2965:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2965:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2966:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2967:1: ( rule__Method__NameAssignment_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2967:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl5966);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2977:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2981:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2982:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__25996);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__25999);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2989:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2993:1: ( ( '(' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2994:1: ( '(' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2994:1: ( '(' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:2995:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Method__Group__2__Impl6027); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3008:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3012:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3013:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36058);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36061);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3020:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParamAssignment_3 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3024:1: ( ( ( rule__Method__ParamAssignment_3 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3025:1: ( ( rule__Method__ParamAssignment_3 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3025:1: ( ( rule__Method__ParamAssignment_3 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3026:1: ( rule__Method__ParamAssignment_3 )*
            {
             before(grammarAccess.getMethodAccess().getParamAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3027:1: ( rule__Method__ParamAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3027:2: rule__Method__ParamAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Method__ParamAssignment_3_in_rule__Method__Group__3__Impl6088);
            	    rule__Method__ParamAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3037:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3041:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3042:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46119);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46122);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3049:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3053:1: ( ( ')' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3054:1: ( ')' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3054:1: ( ')' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3055:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Method__Group__4__Impl6150); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3068:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3072:1: ( rule__Method__Group__5__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3073:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56181);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3079:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3083:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3084:1: ( ( rule__Method__Group_5__0 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3084:1: ( ( rule__Method__Group_5__0 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3085:1: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3086:1: ( rule__Method__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3086:2: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_5__0_in_rule__Method__Group__5__Impl6208);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3108:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3112:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3113:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_rule__Method__Group_5__0__Impl_in_rule__Method__Group_5__06251);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_5__1_in_rule__Method__Group_5__06254);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3120:1: rule__Method__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3124:1: ( ( ':' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3125:1: ( ':' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3125:1: ( ':' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3126:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__Method__Group_5__0__Impl6282); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3139:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3143:1: ( rule__Method__Group_5__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3144:2: rule__Method__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_5__1__Impl_in_rule__Method__Group_5__16313);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3150:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3154:1: ( ( ( rule__Method__ReturnTypeAssignment_5_1 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3155:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3155:1: ( ( rule__Method__ReturnTypeAssignment_5_1 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3156:1: ( rule__Method__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_5_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3157:1: ( rule__Method__ReturnTypeAssignment_5_1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3157:2: rule__Method__ReturnTypeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Method__ReturnTypeAssignment_5_1_in_rule__Method__Group_5__1__Impl6340);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3171:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3175:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3176:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__06374);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__06377);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3183:1: rule__Package__Group__0__Impl : ( ( rule__Package__NameAssignment_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3187:1: ( ( ( rule__Package__NameAssignment_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3188:1: ( ( rule__Package__NameAssignment_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3188:1: ( ( rule__Package__NameAssignment_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3189:1: ( rule__Package__NameAssignment_0 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3190:1: ( rule__Package__NameAssignment_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3190:2: rule__Package__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_0_in_rule__Package__Group__0__Impl6404);
            rule__Package__NameAssignment_0();

            state._fsp--;


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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3200:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3204:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3205:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__16434);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__16437);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3212:1: rule__Package__Group__1__Impl : ( '[[' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3216:1: ( ( '[[' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3217:1: ( '[[' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3217:1: ( '[[' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3218:1: '[['
            {
             before(grammarAccess.getPackageAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Package__Group__1__Impl6465); 
             after(grammarAccess.getPackageAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3231:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3235:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3236:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__26496);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__26499);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3243:1: rule__Package__Group__2__Impl : ( ( rule__Package__ClassTypeAssignment_2 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3247:1: ( ( ( rule__Package__ClassTypeAssignment_2 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3248:1: ( ( rule__Package__ClassTypeAssignment_2 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3248:1: ( ( rule__Package__ClassTypeAssignment_2 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3249:1: ( rule__Package__ClassTypeAssignment_2 )*
            {
             before(grammarAccess.getPackageAccess().getClassTypeAssignment_2()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3250:1: ( rule__Package__ClassTypeAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=15 && LA36_0<=16)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3250:2: rule__Package__ClassTypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Package__ClassTypeAssignment_2_in_rule__Package__Group__2__Impl6526);
            	    rule__Package__ClassTypeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getClassTypeAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3260:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3264:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3265:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__36557);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__36560);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3272:1: rule__Package__Group__3__Impl : ( ( rule__Package__SubPackageAssignment_3 )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3276:1: ( ( ( rule__Package__SubPackageAssignment_3 )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3277:1: ( ( rule__Package__SubPackageAssignment_3 )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3277:1: ( ( rule__Package__SubPackageAssignment_3 )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3278:1: ( rule__Package__SubPackageAssignment_3 )?
            {
             before(grammarAccess.getPackageAccess().getSubPackageAssignment_3()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3279:1: ( rule__Package__SubPackageAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==EOF||LA37_0==RULE_ID||LA37_0==31||LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3279:2: rule__Package__SubPackageAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Package__SubPackageAssignment_3_in_rule__Package__Group__3__Impl6587);
                    rule__Package__SubPackageAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getSubPackageAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3289:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3293:1: ( rule__Package__Group__4__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3294:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__46618);
            rule__Package__Group__4__Impl();

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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3300:1: rule__Package__Group__4__Impl : ( ']]' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3304:1: ( ( ']]' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3305:1: ( ']]' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3305:1: ( ']]' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3306:1: ']]'
            {
             before(grammarAccess.getPackageAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Package__Group__4__Impl6646); 
             after(grammarAccess.getPackageAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackageName__Group__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3329:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3333:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3334:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__06687);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__06690);
            rule__PackageName__Group__1();

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
    // $ANTLR end "rule__PackageName__Group__0"


    // $ANTLR start "rule__PackageName__Group__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3341:1: rule__PackageName__Group__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3345:1: ( ( ( RULE_ID )? ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3346:1: ( ( RULE_ID )? )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3346:1: ( ( RULE_ID )? )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3347:1: ( RULE_ID )?
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3348:1: ( RULE_ID )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3348:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl6718); 

                    }
                    break;

            }

             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__0__Impl"


    // $ANTLR start "rule__PackageName__Group__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3358:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3362:1: ( rule__PackageName__Group__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3363:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__16749);
            rule__PackageName__Group__1__Impl();

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
    // $ANTLR end "rule__PackageName__Group__1"


    // $ANTLR start "rule__PackageName__Group__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3369:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3373:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3374:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3374:1: ( ( rule__PackageName__Group_1__0 )* )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3375:1: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3376:1: ( rule__PackageName__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==33) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3376:2: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl6776);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getPackageNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__1__Impl"


    // $ANTLR start "rule__PackageName__Group_1__0"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3390:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3394:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3395:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__06811);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__06814);
            rule__PackageName__Group_1__1();

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
    // $ANTLR end "rule__PackageName__Group_1__0"


    // $ANTLR start "rule__PackageName__Group_1__0__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3402:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3406:1: ( ( '.' ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3407:1: ( '.' )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3407:1: ( '.' )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3408:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__PackageName__Group_1__0__Impl6842); 
             after(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__0__Impl"


    // $ANTLR start "rule__PackageName__Group_1__1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3421:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3425:1: ( rule__PackageName__Group_1__1__Impl )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3426:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__16873);
            rule__PackageName__Group_1__1__Impl();

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
    // $ANTLR end "rule__PackageName__Group_1__1"


    // $ANTLR start "rule__PackageName__Group_1__1__Impl"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3432:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3436:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3437:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3437:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3438:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl6900); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__PackageAssignment"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3454:1: rule__Model__PackageAssignment : ( rulePackage ) ;
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3458:1: ( ( rulePackage ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3459:1: ( rulePackage )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3459:1: ( rulePackage )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3460:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackageAssignment6938);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageAssignment"


    // $ANTLR start "rule__Class__ClassnameAssignment_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3469:1: rule__Class__ClassnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3473:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3474:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3474:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3475:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getClassnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ClassnameAssignment_16969); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3484:1: rule__Class__ExtensionAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__ExtensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3488:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3489:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3489:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3490:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getExtensionIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ExtensionAssignment_37000); 
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


    // $ANTLR start "rule__Class__ImplementsAssignment_4_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3499:1: rule__Class__ImplementsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Class__ImplementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3503:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3504:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3504:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3505:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getImplementsIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ImplementsAssignment_4_17031); 
             after(grammarAccess.getClassAccess().getImplementsIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ImplementsAssignment_4_1"


    // $ANTLR start "rule__Class__BodyAssignment_6"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3514:1: rule__Class__BodyAssignment_6 : ( ( rule__Class__BodyAlternatives_6_0 ) ) ;
    public final void rule__Class__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3518:1: ( ( ( rule__Class__BodyAlternatives_6_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3519:1: ( ( rule__Class__BodyAlternatives_6_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3519:1: ( ( rule__Class__BodyAlternatives_6_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3520:1: ( rule__Class__BodyAlternatives_6_0 )
            {
             before(grammarAccess.getClassAccess().getBodyAlternatives_6_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3521:1: ( rule__Class__BodyAlternatives_6_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3521:2: rule__Class__BodyAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Class__BodyAlternatives_6_0_in_rule__Class__BodyAssignment_67062);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3530:1: rule__Dependancy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dependancy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3534:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3535:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3535:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3536:1: RULE_ID
            {
             before(grammarAccess.getDependancyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependancy__NameAssignment_17095); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3545:1: rule__Enumeration__ClassnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3549:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3550:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3550:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3551:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getClassnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__ClassnameAssignment_27126); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3560:1: rule__Interface__InterfacenameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__InterfacenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3564:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3565:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3565:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3566:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getInterfacenameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__InterfacenameAssignment_27157); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3575:1: rule__Interface__BodyAssignment_4 : ( ruleMethod ) ;
    public final void rule__Interface__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3579:1: ( ( ruleMethod ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3580:1: ( ruleMethod )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3580:1: ( ruleMethod )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3581:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getBodyMethodParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__BodyAssignment_47188);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3590:1: rule__Abstract__ClassnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Abstract__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3594:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3595:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3595:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3596:1: RULE_ID
            {
             before(grammarAccess.getAbstractAccess().getClassnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abstract__ClassnameAssignment_27219); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3605:1: rule__Abstract__ExtensionAssignment_4 : ( RULE_ID ) ;
    public final void rule__Abstract__ExtensionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3609:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3610:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3610:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3611:1: RULE_ID
            {
             before(grammarAccess.getAbstractAccess().getExtensionIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abstract__ExtensionAssignment_47250); 
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


    // $ANTLR start "rule__Abstract__ImplementsAssignment_5_1"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3620:1: rule__Abstract__ImplementsAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Abstract__ImplementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3624:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3625:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3625:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3626:1: RULE_ID
            {
             before(grammarAccess.getAbstractAccess().getImplementsIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abstract__ImplementsAssignment_5_17281); 
             after(grammarAccess.getAbstractAccess().getImplementsIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__ImplementsAssignment_5_1"


    // $ANTLR start "rule__Abstract__BodyAssignment_7"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3635:1: rule__Abstract__BodyAssignment_7 : ( ( rule__Abstract__BodyAlternatives_7_0 ) ) ;
    public final void rule__Abstract__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3639:1: ( ( ( rule__Abstract__BodyAlternatives_7_0 ) ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3640:1: ( ( rule__Abstract__BodyAlternatives_7_0 ) )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3640:1: ( ( rule__Abstract__BodyAlternatives_7_0 ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3641:1: ( rule__Abstract__BodyAlternatives_7_0 )
            {
             before(grammarAccess.getAbstractAccess().getBodyAlternatives_7_0()); 
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3642:1: ( rule__Abstract__BodyAlternatives_7_0 )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3642:2: rule__Abstract__BodyAlternatives_7_0
            {
            pushFollow(FOLLOW_rule__Abstract__BodyAlternatives_7_0_in_rule__Abstract__BodyAssignment_77312);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3651:1: rule__BiRelation__LinkNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__BiRelation__LinkNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3655:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3656:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3656:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3657:1: RULE_ID
            {
             before(grammarAccess.getBiRelationAccess().getLinkNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BiRelation__LinkNameAssignment_47345); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3666:1: rule__Attribute__AttributenameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3670:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3671:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3671:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3672:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__AttributenameAssignment_27376); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3681:1: rule__Attribute__TypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3685:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3686:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3686:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3687:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_47407); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3696:1: rule__Attribute__BirelationAssignment_5_1 : ( ruleBiRelation ) ;
    public final void rule__Attribute__BirelationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3700:1: ( ( ruleBiRelation ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3701:1: ( ruleBiRelation )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3701:1: ( ruleBiRelation )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3702:1: ruleBiRelation
            {
             before(grammarAccess.getAttributeAccess().getBirelationBiRelationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleBiRelation_in_rule__Attribute__BirelationAssignment_5_17438);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3711:1: rule__ParamIn__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParamIn__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3715:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3716:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3716:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3717:1: RULE_ID
            {
             before(grammarAccess.getParamInAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParamIn__NameAssignment_07469); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3726:1: rule__ParamIn__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParamIn__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3730:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3731:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3731:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3732:1: RULE_ID
            {
             before(grammarAccess.getParamInAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParamIn__TypeAssignment_27500); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3741:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3745:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3746:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3746:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3747:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_17531); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3756:1: rule__Method__ParamAssignment_3 : ( ruleparamIn ) ;
    public final void rule__Method__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3760:1: ( ( ruleparamIn ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3761:1: ( ruleparamIn )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3761:1: ( ruleparamIn )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3762:1: ruleparamIn
            {
             before(grammarAccess.getMethodAccess().getParamParamInParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleparamIn_in_rule__Method__ParamAssignment_37562);
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3771:1: rule__Method__ReturnTypeAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Method__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3775:1: ( ( RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3776:1: ( RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3776:1: ( RULE_ID )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3777:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReturnTypeIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_5_17593); 
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
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3786:1: rule__Package__NameAssignment_0 : ( rulePackageName ) ;
    public final void rule__Package__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3790:1: ( ( rulePackageName ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3791:1: ( rulePackageName )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3791:1: ( rulePackageName )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3792:1: rulePackageName
            {
             before(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Package__NameAssignment_07624);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__ClassTypeAssignment_2"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3801:1: rule__Package__ClassTypeAssignment_2 : ( ruleElements ) ;
    public final void rule__Package__ClassTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3805:1: ( ( ruleElements ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3806:1: ( ruleElements )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3806:1: ( ruleElements )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3807:1: ruleElements
            {
             before(grammarAccess.getPackageAccess().getClassTypeElementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElements_in_rule__Package__ClassTypeAssignment_27655);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassTypeElementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassTypeAssignment_2"


    // $ANTLR start "rule__Package__SubPackageAssignment_3"
    // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3816:1: rule__Package__SubPackageAssignment_3 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3820:1: ( ( rulePackage ) )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3821:1: ( rulePackage )
            {
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3821:1: ( rulePackage )
            // ../org.xtext.smokingtext.diagramclass.ui/src-gen/org/xtext/smokingtext/diagramclass/ui/contentassist/antlr/internal/InternalDiagramClass.g:3822:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_37686);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__SubPackageAssignment_3"

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
    public static final BitSet FOLLOW_rule__Model__PackageAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_ruleElements_in_entryRuleElements122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElements129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elements__Alternatives_in_ruleElements155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_entryRuleDependancy242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependancy249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__0_in_ruleDependancy275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__0_in_ruleAbstract455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiRelation_in_entryRuleBiRelation482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBiRelation489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__0_in_ruleBiRelation515 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0_in_rulePackageName935 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl1928 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51959 = new BitSet(new long[]{0x0000000000538000L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group__5__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__62021 = new BitSet(new long[]{0x0000000000538000L});
    public static final BitSet FOLLOW_rule__Class__Group__7_in_rule__Class__Group__62024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__BodyAssignment_6_in_rule__Class__Group__6__Impl2051 = new BitSet(new long[]{0x0000000000438002L});
    public static final BitSet FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__72082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Class__Group__7__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__02157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group_4__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ImplementsAssignment_4_1_in_rule__Class__Group_4__1__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__02280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__02283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Dependancy__Group__0__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__NameAssignment_1_in_rule__Dependancy__Group__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02403 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Enumeration__Group__0__Impl2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Enumeration__Group__1__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22524 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__ClassnameAssignment_2_in_rule__Enumeration__Group__2__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32584 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__3__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42646 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__0_in_rule__Enumeration__Group__4__Impl2676 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__52707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enumeration__Group__5__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__0__Impl_in_rule__Enumeration__Group_4__02778 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__1_in_rule__Enumeration__Group_4__02781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__Group_4__0__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_4__1__Impl_in_rule__Enumeration__Group_4__12837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Enumeration__Group_4__1__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02903 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Interface__Group__0__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface__Group__1__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23024 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__InterfacenameAssignment_2_in_rule__Interface__Group__2__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__33084 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__33087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Interface__Group__3__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__43146 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__43149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__BodyAssignment_4_in_rule__Interface__Group__4__Impl3176 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__53207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Interface__Group__5__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__03278 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_rule__Abstract__Group__0__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__13337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__2_in_rule__Abstract__Group__13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Abstract__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__2__Impl_in_rule__Abstract__Group__23399 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__3_in_rule__Abstract__Group__23402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ClassnameAssignment_2_in_rule__Abstract__Group__2__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__3__Impl_in_rule__Abstract__Group__33459 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__4_in_rule__Abstract__Group__33462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Abstract__Group__3__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__4__Impl_in_rule__Abstract__Group__43524 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__5_in_rule__Abstract__Group__43527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ExtensionAssignment_4_in_rule__Abstract__Group__4__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__5__Impl_in_rule__Abstract__Group__53585 = new BitSet(new long[]{0x00000000002C0020L});
    public static final BitSet FOLLOW_rule__Abstract__Group__6_in_rule__Abstract__Group__53588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group_5__0_in_rule__Abstract__Group__5__Impl3615 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__6__Impl_in_rule__Abstract__Group__63646 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__7_in_rule__Abstract__Group__63649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Abstract__Group__6__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__7__Impl_in_rule__Abstract__Group__73708 = new BitSet(new long[]{0x0000000000138000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__8_in_rule__Abstract__Group__73711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__BodyAssignment_7_in_rule__Abstract__Group__7__Impl3738 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__8__Impl_in_rule__Abstract__Group__83769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Abstract__Group__8__Impl3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group_5__0__Impl_in_rule__Abstract__Group_5__03846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Abstract__Group_5__1_in_rule__Abstract__Group_5__03849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Abstract__Group_5__0__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group_5__1__Impl_in_rule__Abstract__Group_5__13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__ImplementsAssignment_5_1_in_rule__Abstract__Group_5__1__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__0__Impl_in_rule__BiRelation__Group__03969 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__1_in_rule__BiRelation__Group__03972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BiRelation__Group__0__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__1__Impl_in_rule__BiRelation__Group__14031 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__2_in_rule__BiRelation__Group__14034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_1_in_rule__BiRelation__Group__1__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__2__Impl_in_rule__BiRelation__Group__24092 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__3_in_rule__BiRelation__Group__24095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BiRelation__Group__2__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__3__Impl_in_rule__BiRelation__Group__34154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__4_in_rule__BiRelation__Group__34157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BiRelation__Group__3__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__4__Impl_in_rule__BiRelation__Group__44216 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__5_in_rule__BiRelation__Group__44219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__LinkNameAssignment_4_in_rule__BiRelation__Group__4__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__5__Impl_in_rule__BiRelation__Group__54276 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__6_in_rule__BiRelation__Group__54279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BiRelation__Group__5__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__6__Impl_in_rule__BiRelation__Group__64338 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__7_in_rule__BiRelation__Group__64341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BiRelation__Group__6__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__7__Impl_in_rule__BiRelation__Group__74400 = new BitSet(new long[]{0x0000000008001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__8_in_rule__BiRelation__Group__74403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_7_in_rule__BiRelation__Group__7__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group__8__Impl_in_rule__BiRelation__Group__84461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BiRelation__Group__8__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0__0__Impl_in_rule__BiRelation__Group_1_0__04538 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0__1_in_rule__BiRelation__Group_1_0__04541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4571 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_1_0__0__Impl4584 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0__1__Impl_in_rule__BiRelation__Group_1_0__14617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__0_in_rule__BiRelation__Group_1_0__1__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__0__Impl_in_rule__BiRelation__Group_1_0_1__04678 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__1_in_rule__BiRelation__Group_1_0_1__04681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BiRelation__Group_1_0_1__0__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_1_0_1__1__Impl_in_rule__BiRelation__Group_1_0_1__14740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_1_0_1_1_in_rule__BiRelation__Group_1_0_1__1__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0__0__Impl_in_rule__BiRelation__Group_7_0__04801 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0__1_in_rule__BiRelation__Group_7_0__04804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4834 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__BiRelation__Group_7_0__0__Impl4847 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0__1__Impl_in_rule__BiRelation__Group_7_0__14880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__0_in_rule__BiRelation__Group_7_0__1__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__0__Impl_in_rule__BiRelation__Group_7_0_1__04941 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__1_in_rule__BiRelation__Group_7_0_1__04944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BiRelation__Group_7_0_1__0__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Group_7_0_1__1__Impl_in_rule__BiRelation__Group_7_0_1__15003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BiRelation__Alternatives_7_0_1_1_in_rule__BiRelation__Group_7_0_1__1__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05064 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_rule__Attribute__Group__0__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15123 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_1_in_rule__Attribute__Group__1__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25184 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttributenameAssignment_2_in_rule__Attribute__Group__2__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__Group__3__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__45306 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__45309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__55366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_5_in_rule__Attribute__Group__5__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__0__Impl_in_rule__Attribute__Group_5_0__05436 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__1_in_rule__Attribute__Group_5_0__05439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Attribute__Group_5_0__0__Impl5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__1__Impl_in_rule__Attribute__Group_5_0__15498 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__2_in_rule__Attribute__Group_5_0__15501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Attribute__Group_5_0__1__Impl5529 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5_0__2__Impl_in_rule__Attribute__Group_5_0__25560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Attribute__Group_5_0__2__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__0__Impl_in_rule__ParamIn__Group__05625 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__1_in_rule__ParamIn__Group__05628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__NameAssignment_0_in_rule__ParamIn__Group__0__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__1__Impl_in_rule__ParamIn__Group__15685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__2_in_rule__ParamIn__Group__15688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ParamIn__Group__1__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__2__Impl_in_rule__ParamIn__Group__25747 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__3_in_rule__ParamIn__Group__25750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__TypeAssignment_2_in_rule__ParamIn__Group__2__Impl5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamIn__Group__3__Impl_in_rule__ParamIn__Group__35807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ParamIn__Group__3__Impl5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__05877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__05880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_rule__Method__Group__0__Impl5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__15936 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__15939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__25996 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__25999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method__Group__2__Impl6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36058 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParamAssignment_3_in_rule__Method__Group__3__Impl6088 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46119 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Method__Group__4__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__0_in_rule__Method__Group__5__Impl6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__0__Impl_in_rule__Method__Group_5__06251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group_5__1_in_rule__Method__Group_5__06254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group_5__0__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_5__1__Impl_in_rule__Method__Group_5__16313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_5_1_in_rule__Method__Group_5__1__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__06374 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__06377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_0_in_rule__Package__Group__0__Impl6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__16434 = new BitSet(new long[]{0x0000000300018020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__16437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Package__Group__1__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__26496 = new BitSet(new long[]{0x0000000300018020L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__26499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ClassTypeAssignment_2_in_rule__Package__Group__2__Impl6526 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__36557 = new BitSet(new long[]{0x0000000300018020L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__36560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__SubPackageAssignment_3_in_rule__Package__Group__3__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__46618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Package__Group__4__Impl6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__06687 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__06690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__16749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl6776 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__06811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__06814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PackageName__Group_1__0__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__16873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackageAssignment6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ClassnameAssignment_16969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ExtensionAssignment_37000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ImplementsAssignment_4_17031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__BodyAlternatives_6_0_in_rule__Class__BodyAssignment_67062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependancy__NameAssignment_17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__ClassnameAssignment_27126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__InterfacenameAssignment_27157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__BodyAssignment_47188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abstract__ClassnameAssignment_27219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abstract__ExtensionAssignment_47250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abstract__ImplementsAssignment_5_17281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__BodyAlternatives_7_0_in_rule__Abstract__BodyAssignment_77312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BiRelation__LinkNameAssignment_47345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__AttributenameAssignment_27376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_47407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiRelation_in_rule__Attribute__BirelationAssignment_5_17438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParamIn__NameAssignment_07469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParamIn__TypeAssignment_27500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_17531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparamIn_in_rule__Method__ParamAssignment_37562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__ReturnTypeAssignment_5_17593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Package__NameAssignment_07624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElements_in_rule__Package__ClassTypeAssignment_27655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_37686 = new BitSet(new long[]{0x0000000000000002L});

}