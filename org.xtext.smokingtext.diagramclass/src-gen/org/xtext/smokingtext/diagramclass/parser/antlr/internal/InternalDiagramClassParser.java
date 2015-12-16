package org.xtext.smokingtext.diagramclass.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.smokingtext.diagramclass.services.DiagramClassGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDiagramClassParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "','", "'{'", "'}'", "'->'", "'e'", "'i'", "'a'", "'['", "'..'", "'*'", "']'", "'-'", "'<>'", "'<!>'", "'('", "')'", "'+'", "'#'", "'[['", "']]'", "'.'"
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
    public static final int T__32=32;
    public static final int T__33=33;
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
    public String getGrammarFileName() { return "../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g"; }



     	private DiagramClassGrammarAccess grammarAccess;
     	
        public InternalDiagramClassParser(TokenStream input, DiagramClassGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DiagramClassGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:76:1: ruleModel returns [EObject current=null] : ( (lv_package_0_0= rulePackage ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:79:28: ( ( (lv_package_0_0= rulePackage ) )* )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:80:1: ( (lv_package_0_0= rulePackage ) )*
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:80:1: ( (lv_package_0_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==31||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:81:1: (lv_package_0_0= rulePackage )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:81:1: (lv_package_0_0= rulePackage )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:82:3: lv_package_0_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel130);
            	    lv_package_0_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"package",
            	            		lv_package_0_0, 
            	            		"Package");
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


    // $ANTLR start "entryRuleElements"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:106:1: entryRuleElements returns [EObject current=null] : iv_ruleElements= ruleElements EOF ;
    public final EObject entryRuleElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElements = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:107:2: (iv_ruleElements= ruleElements EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:108:2: iv_ruleElements= ruleElements EOF
            {
             newCompositeNode(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_ruleElements_in_entryRuleElements166);
            iv_ruleElements=ruleElements();

            state._fsp--;

             current =iv_ruleElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElements176); 

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
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:115:1: ruleElements returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface | this_Abstract_2= ruleAbstract | this_Enumeration_3= ruleEnumeration ) ;
    public final EObject ruleElements() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;

        EObject this_Abstract_2 = null;

        EObject this_Enumeration_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:118:28: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface | this_Abstract_2= ruleAbstract | this_Enumeration_3= ruleEnumeration ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:119:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface | this_Abstract_2= ruleAbstract | this_Enumeration_3= ruleEnumeration )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:119:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface | this_Abstract_2= ruleAbstract | this_Enumeration_3= ruleEnumeration )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt2=2;
                    }
                    break;
                case 17:
                    {
                    alt2=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==24) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt2=4;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                case 18:
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
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:120:5: this_Class_0= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getElementsAccess().getClassParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleElements223);
                    this_Class_0=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:130:5: this_Interface_1= ruleInterface
                    {
                     
                            newCompositeNode(grammarAccess.getElementsAccess().getInterfaceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterface_in_ruleElements250);
                    this_Interface_1=ruleInterface();

                    state._fsp--;

                     
                            current = this_Interface_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:140:5: this_Abstract_2= ruleAbstract
                    {
                     
                            newCompositeNode(grammarAccess.getElementsAccess().getAbstractParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbstract_in_ruleElements277);
                    this_Abstract_2=ruleAbstract();

                    state._fsp--;

                     
                            current = this_Abstract_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:150:5: this_Enumeration_3= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getElementsAccess().getEnumerationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleElements304);
                    this_Enumeration_3=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_3; 
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
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleClass"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:166:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:167:2: (iv_ruleClass= ruleClass EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:168:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass339);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass349); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:175:1: ruleClass returns [EObject current=null] : ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_implements_5_0= RULE_ID ) ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_classname_1_0=null;
        Token otherlv_2=null;
        Token lv_extension_3_0=null;
        Token otherlv_4=null;
        Token lv_implements_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_body_7_1 = null;

        EObject lv_body_7_2 = null;

        EObject lv_body_7_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:178:28: ( ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_implements_5_0= RULE_ID ) ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) ) )* otherlv_8= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:179:1: ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_implements_5_0= RULE_ID ) ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) ) )* otherlv_8= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:179:1: ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_implements_5_0= RULE_ID ) ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) ) )* otherlv_8= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:180:5: ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_implements_5_0= RULE_ID ) ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) ) )* otherlv_8= '}'
            {
             
                    newCompositeNode(grammarAccess.getClassAccess().getClassVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassVisibility_in_ruleClass390);
            ruleClassVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:187:1: ( (lv_classname_1_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:188:1: (lv_classname_1_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:188:1: (lv_classname_1_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:189:3: lv_classname_1_0= RULE_ID
            {
            lv_classname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass406); 

            			newLeafNode(lv_classname_1_0, grammarAccess.getClassAccess().getClassnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:205:2: (otherlv_2= ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:205:4: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClass424); 

                        	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getColonKeyword_2());
                        

                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:209:3: ( (lv_extension_3_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:210:1: (lv_extension_3_0= RULE_ID )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:210:1: (lv_extension_3_0= RULE_ID )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:211:3: lv_extension_3_0= RULE_ID
                    {
                    lv_extension_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass443); 

                    			newLeafNode(lv_extension_3_0, grammarAccess.getClassAccess().getExtensionIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"extension",
                            		lv_extension_3_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:227:3: (otherlv_4= ',' ( (lv_implements_5_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:227:5: otherlv_4= ',' ( (lv_implements_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClass462); 

            	        	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:231:1: ( (lv_implements_5_0= RULE_ID ) )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:232:1: (lv_implements_5_0= RULE_ID )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:232:1: (lv_implements_5_0= RULE_ID )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:233:3: lv_implements_5_0= RULE_ID
            	    {
            	    lv_implements_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass479); 

            	    			newLeafNode(lv_implements_5_0, grammarAccess.getClassAccess().getImplementsIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClassRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"implements",
            	            		lv_implements_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleClass498); 

                	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:253:1: ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==24||(LA7_0>=29 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:254:1: ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:254:1: ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy ) )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:255:1: (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:255:1: (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod | lv_body_7_3= ruleDependancy )
            	    int alt6=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==RULE_ID) ) {
            	            int LA6_5 = input.LA(3);

            	            if ( (LA6_5==12) ) {
            	                alt6=1;
            	            }
            	            else if ( (LA6_5==27) ) {
            	                alt6=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 6, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( ((LA6_1>=25 && LA6_1<=26)) ) {
            	            alt6=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 24:
            	        {
            	        int LA6_2 = input.LA(2);

            	        if ( ((LA6_2>=25 && LA6_2<=26)) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_2==RULE_ID) ) {
            	            int LA6_5 = input.LA(3);

            	            if ( (LA6_5==12) ) {
            	                alt6=1;
            	            }
            	            else if ( (LA6_5==27) ) {
            	                alt6=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 6, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 30:
            	        {
            	        int LA6_3 = input.LA(2);

            	        if ( ((LA6_3>=25 && LA6_3<=26)) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_3==RULE_ID) ) {
            	            int LA6_5 = input.LA(3);

            	            if ( (LA6_5==12) ) {
            	                alt6=1;
            	            }
            	            else if ( (LA6_5==27) ) {
            	                alt6=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 6, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 3, input);

            	            throw nvae;
            	        }
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
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:256:3: lv_body_7_1= ruleAttribute
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getClassAccess().getBodyAttributeParserRuleCall_6_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAttribute_in_ruleClass521);
            	            lv_body_7_1=ruleAttribute();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_7_1, 
            	                    		"Attribute");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:271:8: lv_body_7_2= ruleMethod
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getClassAccess().getBodyMethodParserRuleCall_6_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleMethod_in_ruleClass540);
            	            lv_body_7_2=ruleMethod();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_7_2, 
            	                    		"Method");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:286:8: lv_body_7_3= ruleDependancy
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getClassAccess().getBodyDependancyParserRuleCall_6_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDependancy_in_ruleClass559);
            	            lv_body_7_3=ruleDependancy();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_7_3, 
            	                    		"Dependancy");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleClass575); 

                	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleDependancy"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:316:1: entryRuleDependancy returns [EObject current=null] : iv_ruleDependancy= ruleDependancy EOF ;
    public final EObject entryRuleDependancy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependancy = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:317:2: (iv_ruleDependancy= ruleDependancy EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:318:2: iv_ruleDependancy= ruleDependancy EOF
            {
             newCompositeNode(grammarAccess.getDependancyRule()); 
            pushFollow(FOLLOW_ruleDependancy_in_entryRuleDependancy611);
            iv_ruleDependancy=ruleDependancy();

            state._fsp--;

             current =iv_ruleDependancy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependancy621); 

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
    // $ANTLR end "entryRuleDependancy"


    // $ANTLR start "ruleDependancy"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:325:1: ruleDependancy returns [EObject current=null] : (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDependancy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:328:28: ( (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:329:1: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:329:1: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:329:3: otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDependancy658); 

                	newLeafNode(otherlv_0, grammarAccess.getDependancyAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:333:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:334:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:334:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:335:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependancy675); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDependancyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDependancyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDependancy"


    // $ANTLR start "entryRuleEnumeration"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:359:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:360:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:361:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration716);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration726); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:368:1: ruleEnumeration returns [EObject current=null] : ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_classname_2_0=null;
        Token otherlv_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:371:28: ( ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:372:1: ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:372:1: ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:373:5: ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}'
            {
             
                    newCompositeNode(grammarAccess.getEnumerationAccess().getClassVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassVisibility_in_ruleEnumeration767);
            ruleClassVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEnumeration778); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:384:1: ( (lv_classname_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:385:1: (lv_classname_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:385:1: (lv_classname_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:386:3: lv_classname_2_0= RULE_ID
            {
            lv_classname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration795); 

            			newLeafNode(lv_classname_2_0, grammarAccess.getEnumerationAccess().getClassnameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEnumeration812); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:406:1: (this_ID_4= RULE_ID (otherlv_5= ',' )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:406:2: this_ID_4= RULE_ID (otherlv_5= ',' )?
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration824); 
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()); 
            	        
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:410:1: (otherlv_5= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==13) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:410:3: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEnumeration836); 

            	                	newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_4_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEnumeration852); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:426:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:427:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:428:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface888);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface898); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:435:1: ruleInterface returns [EObject current=null] : ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_interfacename_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:438:28: ( ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:439:1: ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:439:1: ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:440:5: ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}'
            {
             
                    newCompositeNode(grammarAccess.getInterfaceAccess().getClassVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassVisibility_in_ruleInterface939);
            ruleClassVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleInterface950); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getIKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:451:1: ( (lv_interfacename_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:452:1: (lv_interfacename_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:452:1: (lv_interfacename_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:453:3: lv_interfacename_2_0= RULE_ID
            {
            lv_interfacename_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface967); 

            			newLeafNode(lv_interfacename_2_0, grammarAccess.getInterfaceAccess().getInterfacenameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interfacename",
                    		lv_interfacename_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleInterface984); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:473:1: ( (lv_body_4_0= ruleMethod ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||(LA10_0>=29 && LA10_0<=30)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:474:1: (lv_body_4_0= ruleMethod )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:474:1: (lv_body_4_0= ruleMethod )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:475:3: lv_body_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getBodyMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleInterface1005);
            	    lv_body_4_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_4_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleInterface1018); 

                	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleAbstract"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:503:1: entryRuleAbstract returns [EObject current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final EObject entryRuleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstract = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:504:2: (iv_ruleAbstract= ruleAbstract EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:505:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract1054);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract1064); 

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
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:512:1: ruleAbstract returns [EObject current=null] : ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_implements_6_0= RULE_ID ) ) )* otherlv_7= '{' ( ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_classname_2_0=null;
        Token otherlv_3=null;
        Token lv_extension_4_0=null;
        Token otherlv_5=null;
        Token lv_implements_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_body_8_1 = null;

        EObject lv_body_8_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:515:28: ( ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_implements_6_0= RULE_ID ) ) )* otherlv_7= '{' ( ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) ) )* otherlv_9= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:516:1: ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_implements_6_0= RULE_ID ) ) )* otherlv_7= '{' ( ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) ) )* otherlv_9= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:516:1: ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_implements_6_0= RULE_ID ) ) )* otherlv_7= '{' ( ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) ) )* otherlv_9= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:517:5: ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_implements_6_0= RULE_ID ) ) )* otherlv_7= '{' ( ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) ) )* otherlv_9= '}'
            {
             
                    newCompositeNode(grammarAccess.getAbstractAccess().getClassVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassVisibility_in_ruleAbstract1105);
            ruleClassVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAbstract1116); 

                	newLeafNode(otherlv_1, grammarAccess.getAbstractAccess().getAKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:528:1: ( (lv_classname_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:529:1: (lv_classname_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:529:1: (lv_classname_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:530:3: lv_classname_2_0= RULE_ID
            {
            lv_classname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstract1133); 

            			newLeafNode(lv_classname_2_0, grammarAccess.getAbstractAccess().getClassnameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAbstractRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:546:2: (otherlv_3= ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:546:4: otherlv_3= ':'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAbstract1151); 

                        	newLeafNode(otherlv_3, grammarAccess.getAbstractAccess().getColonKeyword_3());
                        

                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:550:3: ( (lv_extension_4_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:551:1: (lv_extension_4_0= RULE_ID )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:551:1: (lv_extension_4_0= RULE_ID )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:552:3: lv_extension_4_0= RULE_ID
                    {
                    lv_extension_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstract1170); 

                    			newLeafNode(lv_extension_4_0, grammarAccess.getAbstractAccess().getExtensionIDTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"extension",
                            		lv_extension_4_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:568:3: (otherlv_5= ',' ( (lv_implements_6_0= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:568:5: otherlv_5= ',' ( (lv_implements_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAbstract1189); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAbstractAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:572:1: ( (lv_implements_6_0= RULE_ID ) )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:573:1: (lv_implements_6_0= RULE_ID )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:573:1: (lv_implements_6_0= RULE_ID )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:574:3: lv_implements_6_0= RULE_ID
            	    {
            	    lv_implements_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstract1206); 

            	    			newLeafNode(lv_implements_6_0, grammarAccess.getAbstractAccess().getImplementsIDTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAbstractRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"implements",
            	            		lv_implements_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAbstract1225); 

                	newLeafNode(otherlv_7, grammarAccess.getAbstractAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:594:1: ( ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24||(LA15_0>=29 && LA15_0<=30)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:595:1: ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:595:1: ( (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod ) )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:596:1: (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:596:1: (lv_body_8_1= ruleAttribute | lv_body_8_2= ruleMethod )
            	    int alt14=2;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        int LA14_1 = input.LA(2);

            	        if ( ((LA14_1>=25 && LA14_1<=26)) ) {
            	            alt14=1;
            	        }
            	        else if ( (LA14_1==RULE_ID) ) {
            	            int LA14_5 = input.LA(3);

            	            if ( (LA14_5==12) ) {
            	                alt14=1;
            	            }
            	            else if ( (LA14_5==27) ) {
            	                alt14=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 14, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 24:
            	        {
            	        int LA14_2 = input.LA(2);

            	        if ( (LA14_2==RULE_ID) ) {
            	            int LA14_5 = input.LA(3);

            	            if ( (LA14_5==12) ) {
            	                alt14=1;
            	            }
            	            else if ( (LA14_5==27) ) {
            	                alt14=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 14, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( ((LA14_2>=25 && LA14_2<=26)) ) {
            	            alt14=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 30:
            	        {
            	        int LA14_3 = input.LA(2);

            	        if ( (LA14_3==RULE_ID) ) {
            	            int LA14_5 = input.LA(3);

            	            if ( (LA14_5==12) ) {
            	                alt14=1;
            	            }
            	            else if ( (LA14_5==27) ) {
            	                alt14=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 14, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( ((LA14_3>=25 && LA14_3<=26)) ) {
            	            alt14=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:597:3: lv_body_8_1= ruleAttribute
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAbstractAccess().getBodyAttributeParserRuleCall_7_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAttribute_in_ruleAbstract1248);
            	            lv_body_8_1=ruleAttribute();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAbstractRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_8_1, 
            	                    		"Attribute");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:612:8: lv_body_8_2= ruleMethod
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAbstractAccess().getBodyMethodParserRuleCall_7_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleMethod_in_ruleAbstract1267);
            	            lv_body_8_2=ruleMethod();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAbstractRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_8_2, 
            	                    		"Method");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleAbstract1283); 

                	newLeafNode(otherlv_9, grammarAccess.getAbstractAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleBiRelation"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:642:1: entryRuleBiRelation returns [EObject current=null] : iv_ruleBiRelation= ruleBiRelation EOF ;
    public final EObject entryRuleBiRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiRelation = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:643:2: (iv_ruleBiRelation= ruleBiRelation EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:644:2: iv_ruleBiRelation= ruleBiRelation EOF
            {
             newCompositeNode(grammarAccess.getBiRelationRule()); 
            pushFollow(FOLLOW_ruleBiRelation_in_entryRuleBiRelation1319);
            iv_ruleBiRelation=ruleBiRelation();

            state._fsp--;

             current =iv_ruleBiRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBiRelation1329); 

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
    // $ANTLR end "entryRuleBiRelation"


    // $ANTLR start "ruleBiRelation"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:651:1: ruleBiRelation returns [EObject current=null] : (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' ) ;
    public final EObject ruleBiRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_number_1=null;
        Token otherlv_2=null;
        Token this_number_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_linkName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_number_11=null;
        Token otherlv_12=null;
        Token this_number_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:654:28: ( (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:655:1: (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:655:1: (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:655:3: otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBiRelation1366); 

                	newLeafNode(otherlv_0, grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:659:1: ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NUMBER) ) {
                alt19=1;
            }
            else if ( (LA19_0==22) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:659:2: ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:659:2: ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:659:3: (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:659:3: (this_number_1= RULE_NUMBER )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_NUMBER) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:659:4: this_number_1= RULE_NUMBER
                    	    {
                    	    this_number_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1380); 
                    	     
                    	        newLeafNode(this_number_1, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:663:3: (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:663:5: otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleBiRelation1394); 

                        	newLeafNode(otherlv_2, grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_1_0_1_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:667:1: ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_NUMBER) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==22) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:667:2: (this_number_3= RULE_NUMBER )+
                            {
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:667:2: (this_number_3= RULE_NUMBER )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==RULE_NUMBER) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:667:3: this_number_3= RULE_NUMBER
                            	    {
                            	    this_number_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1407); 
                            	     
                            	        newLeafNode(this_number_3, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_1_1_0()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt17 >= 1 ) break loop17;
                                        EarlyExitException eee =
                                            new EarlyExitException(17, input);
                                        throw eee;
                                }
                                cnt17++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:672:7: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1426); 

                                	newLeafNode(otherlv_4, grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_0_1_1_1());
                                

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:677:7: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1447); 

                        	newLeafNode(otherlv_5, grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBiRelation1461); 

                	newLeafNode(otherlv_6, grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_2());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleBiRelation1473); 

                	newLeafNode(otherlv_7, grammarAccess.getBiRelationAccess().getHyphenMinusKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:689:1: ( (lv_linkName_8_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:690:1: (lv_linkName_8_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:690:1: (lv_linkName_8_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:691:3: lv_linkName_8_0= RULE_ID
            {
            lv_linkName_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBiRelation1490); 

            			newLeafNode(lv_linkName_8_0, grammarAccess.getBiRelationAccess().getLinkNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBiRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"linkName",
                    		lv_linkName_8_0, 
                    		"ID");
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleBiRelation1507); 

                	newLeafNode(otherlv_9, grammarAccess.getBiRelationAccess().getHyphenMinusGreaterThanSignKeyword_5());
                
            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleBiRelation1519); 

                	newLeafNode(otherlv_10, grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_6());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:715:1: ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NUMBER) ) {
                alt23=1;
            }
            else if ( (LA23_0==22) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:715:2: ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:715:2: ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:715:3: (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:715:3: (this_number_11= RULE_NUMBER )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_NUMBER) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:715:4: this_number_11= RULE_NUMBER
                    	    {
                    	    this_number_11=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1533); 
                    	     
                    	        newLeafNode(this_number_11, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:719:3: (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:719:5: otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' )
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleBiRelation1547); 

                        	newLeafNode(otherlv_12, grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_7_0_1_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:723:1: ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_NUMBER) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==22) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:723:2: (this_number_13= RULE_NUMBER )+
                            {
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:723:2: (this_number_13= RULE_NUMBER )+
                            int cnt21=0;
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==RULE_NUMBER) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:723:3: this_number_13= RULE_NUMBER
                            	    {
                            	    this_number_13=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1560); 
                            	     
                            	        newLeafNode(this_number_13, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_1_1_0()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt21 >= 1 ) break loop21;
                                        EarlyExitException eee =
                                            new EarlyExitException(21, input);
                                        throw eee;
                                }
                                cnt21++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:728:7: otherlv_14= '*'
                            {
                            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1579); 

                                	newLeafNode(otherlv_14, grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_0_1_1_1());
                                

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:733:7: otherlv_15= '*'
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1600); 

                        	newLeafNode(otherlv_15, grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_1());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleBiRelation1614); 

                	newLeafNode(otherlv_16, grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_8());
                

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
    // $ANTLR end "ruleBiRelation"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:749:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:750:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:751:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1650);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1660); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:758:1: ruleAttribute returns [EObject current=null] : ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_attributename_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token this_number_7=null;
        Token otherlv_8=null;
        EObject lv_birelation_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:761:28: ( ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:762:1: ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:762:1: ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:763:5: ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAttributeAccess().getBodyVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBodyVisibility_in_ruleAttribute1701);
            ruleBodyVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:770:1: (otherlv_1= '<>' | otherlv_2= '<!>' )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            else if ( (LA24_0==26) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:770:3: otherlv_1= '<>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1713); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLessThanSignGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:775:7: otherlv_2= '<!>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleAttribute1731); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLessThanSignExclamationMarkGreaterThanSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:779:3: ( (lv_attributename_3_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:780:1: (lv_attributename_3_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:780:1: (lv_attributename_3_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:781:3: lv_attributename_3_0= RULE_ID
            {
            lv_attributename_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1750); 

            			newLeafNode(lv_attributename_3_0, grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributename",
                    		lv_attributename_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleAttribute1767); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:801:1: ( (lv_type_5_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:802:1: (lv_type_5_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:802:1: (lv_type_5_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:803:3: lv_type_5_0= RULE_ID
            {
            lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1784); 

            			newLeafNode(lv_type_5_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:819:2: ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )?
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:819:3: (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:819:3: (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:819:5: otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleAttribute1803); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:823:1: (this_number_7= RULE_NUMBER )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_NUMBER) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:823:2: this_number_7= RULE_NUMBER
                    	    {
                    	    this_number_7=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute1815); 
                    	     
                    	        newLeafNode(this_number_7, grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleAttribute1828); 

                        	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:832:6: ( (lv_birelation_9_0= ruleBiRelation ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:832:6: ( (lv_birelation_9_0= ruleBiRelation ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:833:1: (lv_birelation_9_0= ruleBiRelation )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:833:1: (lv_birelation_9_0= ruleBiRelation )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:834:3: lv_birelation_9_0= ruleBiRelation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getBirelationBiRelationParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBiRelation_in_ruleAttribute1856);
                    lv_birelation_9_0=ruleBiRelation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"birelation",
                            		lv_birelation_9_0, 
                            		"BiRelation");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleparamIn"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:858:1: entryRuleparamIn returns [EObject current=null] : iv_ruleparamIn= ruleparamIn EOF ;
    public final EObject entryRuleparamIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparamIn = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:859:2: (iv_ruleparamIn= ruleparamIn EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:860:2: iv_ruleparamIn= ruleparamIn EOF
            {
             newCompositeNode(grammarAccess.getParamInRule()); 
            pushFollow(FOLLOW_ruleparamIn_in_entryRuleparamIn1894);
            iv_ruleparamIn=ruleparamIn();

            state._fsp--;

             current =iv_ruleparamIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparamIn1904); 

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
    // $ANTLR end "entryRuleparamIn"


    // $ANTLR start "ruleparamIn"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:867:1: ruleparamIn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleparamIn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:870:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:871:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:871:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:871:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:871:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:872:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:872:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:873:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparamIn1946); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParamInAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamInRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleparamIn1963); 

                	newLeafNode(otherlv_1, grammarAccess.getParamInAccess().getColonKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:893:1: ( (lv_type_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:894:1: (lv_type_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:894:1: (lv_type_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:895:3: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparamIn1980); 

            			newLeafNode(lv_type_2_0, grammarAccess.getParamInAccess().getTypeIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamInRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:911:2: (otherlv_3= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:911:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleparamIn1998); 

                        	newLeafNode(otherlv_3, grammarAccess.getParamInAccess().getCommaKeyword_3());
                        

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
    // $ANTLR end "ruleparamIn"


    // $ANTLR start "entryRuleMethod"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:923:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:924:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:925:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2036);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2046); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:932:1: ruleMethod returns [EObject current=null] : ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_returnType_6_0=null;
        EObject lv_param_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:935:28: ( ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:936:1: ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:936:1: ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:937:5: ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMethodAccess().getBodyVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBodyVisibility_in_ruleMethod2087);
            ruleBodyVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:944:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:945:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:945:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:946:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2103); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMethod2120); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:966:1: ( (lv_param_3_0= ruleparamIn ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:967:1: (lv_param_3_0= ruleparamIn )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:967:1: (lv_param_3_0= ruleparamIn )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:968:3: lv_param_3_0= ruleparamIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParamParamInParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleparamIn_in_ruleMethod2141);
            	    lv_param_3_0=ruleparamIn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"param",
            	            		lv_param_3_0, 
            	            		"paramIn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMethod2154); 

                	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:988:1: (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==12) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:988:3: otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleMethod2167); 

                        	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getColonKeyword_5_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:992:1: ( (lv_returnType_6_0= RULE_ID ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:993:1: (lv_returnType_6_0= RULE_ID )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:993:1: (lv_returnType_6_0= RULE_ID )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:994:3: lv_returnType_6_0= RULE_ID
                    {
                    lv_returnType_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2184); 

                    			newLeafNode(lv_returnType_6_0, grammarAccess.getMethodAccess().getReturnTypeIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"returnType",
                            		lv_returnType_6_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleBodyVisibility"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1018:1: entryRuleBodyVisibility returns [String current=null] : iv_ruleBodyVisibility= ruleBodyVisibility EOF ;
    public final String entryRuleBodyVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBodyVisibility = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1019:2: (iv_ruleBodyVisibility= ruleBodyVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1020:2: iv_ruleBodyVisibility= ruleBodyVisibility EOF
            {
             newCompositeNode(grammarAccess.getBodyVisibilityRule()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility2228);
            iv_ruleBodyVisibility=ruleBodyVisibility();

            state._fsp--;

             current =iv_ruleBodyVisibility.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyVisibility2239); 

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
    // $ANTLR end "entryRuleBodyVisibility"


    // $ANTLR start "ruleBodyVisibility"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1027:1: ruleBodyVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '#' ) ;
    public final AntlrDatatypeRuleToken ruleBodyVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1030:28: ( (kw= '+' | kw= '-' | kw= '#' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1031:1: (kw= '+' | kw= '-' | kw= '#' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1031:1: (kw= '+' | kw= '-' | kw= '#' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt30=1;
                }
                break;
            case 24:
                {
                alt30=2;
                }
                break;
            case 30:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1032:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleBodyVisibility2277); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBodyVisibilityAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1039:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBodyVisibility2296); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBodyVisibilityAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1046:2: kw= '#'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleBodyVisibility2315); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBodyVisibilityAccess().getNumberSignKeyword_2()); 
                        

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
    // $ANTLR end "ruleBodyVisibility"


    // $ANTLR start "entryRuleClassVisibility"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1059:1: entryRuleClassVisibility returns [String current=null] : iv_ruleClassVisibility= ruleClassVisibility EOF ;
    public final String entryRuleClassVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassVisibility = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1060:2: (iv_ruleClassVisibility= ruleClassVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1061:2: iv_ruleClassVisibility= ruleClassVisibility EOF
            {
             newCompositeNode(grammarAccess.getClassVisibilityRule()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility2356);
            iv_ruleClassVisibility=ruleClassVisibility();

            state._fsp--;

             current =iv_ruleClassVisibility.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassVisibility2367); 

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
    // $ANTLR end "entryRuleClassVisibility"


    // $ANTLR start "ruleClassVisibility"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1068:1: ruleClassVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleClassVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1071:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1072:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1072:1: (kw= '+' | kw= '-' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            else if ( (LA31_0==24) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1073:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleClassVisibility2405); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassVisibilityAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1080:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleClassVisibility2424); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassVisibilityAccess().getHyphenMinusKeyword_1()); 
                        

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
    // $ANTLR end "ruleClassVisibility"


    // $ANTLR start "entryRulePackage"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1093:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1094:2: (iv_rulePackage= rulePackage EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1095:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage2464);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage2474); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1102:1: rulePackage returns [EObject current=null] : ( ( (lv_name_0_0= rulePackageName ) ) otherlv_1= '[[' ( (lv_classType_2_0= ruleElements ) )* ( (lv_subPackage_3_0= rulePackage ) )? otherlv_4= ']]' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_classType_2_0 = null;

        EObject lv_subPackage_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1105:28: ( ( ( (lv_name_0_0= rulePackageName ) ) otherlv_1= '[[' ( (lv_classType_2_0= ruleElements ) )* ( (lv_subPackage_3_0= rulePackage ) )? otherlv_4= ']]' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1106:1: ( ( (lv_name_0_0= rulePackageName ) ) otherlv_1= '[[' ( (lv_classType_2_0= ruleElements ) )* ( (lv_subPackage_3_0= rulePackage ) )? otherlv_4= ']]' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1106:1: ( ( (lv_name_0_0= rulePackageName ) ) otherlv_1= '[[' ( (lv_classType_2_0= ruleElements ) )* ( (lv_subPackage_3_0= rulePackage ) )? otherlv_4= ']]' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1106:2: ( (lv_name_0_0= rulePackageName ) ) otherlv_1= '[[' ( (lv_classType_2_0= ruleElements ) )* ( (lv_subPackage_3_0= rulePackage ) )? otherlv_4= ']]'
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1106:2: ( (lv_name_0_0= rulePackageName ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1107:1: (lv_name_0_0= rulePackageName )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1107:1: (lv_name_0_0= rulePackageName )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1108:3: lv_name_0_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_rulePackage2520);
            lv_name_0_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePackage2532); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1128:1: ( (lv_classType_2_0= ruleElements ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24||LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1129:1: (lv_classType_2_0= ruleElements )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1129:1: (lv_classType_2_0= ruleElements )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1130:3: lv_classType_2_0= ruleElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getClassTypeElementsParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElements_in_rulePackage2553);
            	    lv_classType_2_0=ruleElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classType",
            	            		lv_classType_2_0, 
            	            		"Elements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1146:3: ( (lv_subPackage_3_0= rulePackage ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EOF||LA33_0==RULE_ID||LA33_0==31||LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1147:1: (lv_subPackage_3_0= rulePackage )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1147:1: (lv_subPackage_3_0= rulePackage )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1148:3: lv_subPackage_3_0= rulePackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_in_rulePackage2575);
                    lv_subPackage_3_0=rulePackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"subPackage",
                            		lv_subPackage_3_0, 
                            		"Package");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulePackage2588); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightSquareBracketRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackageName"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1176:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1177:2: (iv_rulePackageName= rulePackageName EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1178:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName2625);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName2636); 

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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1185:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )? (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1188:28: ( ( (this_ID_0= RULE_ID )? (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1189:1: ( (this_ID_0= RULE_ID )? (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1189:1: ( (this_ID_0= RULE_ID )? (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1189:2: (this_ID_0= RULE_ID )? (kw= '.' this_ID_2= RULE_ID )*
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1189:2: (this_ID_0= RULE_ID )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1189:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName2677); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1196:3: (kw= '.' this_ID_2= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==33) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1197:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_rulePackageName2698); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName2713); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "rulePackageName"

    // Delegated rules


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\11\uffff";
    static final String DFA26_eofS =
        "\1\2\4\uffff\1\6\3\uffff";
    static final String DFA26_minS =
        "\1\17\1\5\1\uffff\1\5\1\uffff\1\17\1\uffff\1\4\1\14";
    static final String DFA26_maxS =
        "\1\36\1\27\1\uffff\1\27\1\uffff\1\36\1\uffff\1\32\1\33";
    static final String DFA26_acceptS =
        "\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA26_specialS =
        "\11\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\2\3\uffff\1\1\3\uffff\1\2\4\uffff\2\2",
            "\1\3\20\uffff\1\4\1\5",
            "",
            "\1\3\17\uffff\1\4\1\uffff\1\6",
            "",
            "\2\6\7\uffff\1\7\4\uffff\2\6",
            "",
            "\1\10\24\uffff\2\6",
            "\1\6\3\uffff\1\4\12\uffff\1\6"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "819:2: ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel130 = new BitSet(new long[]{0x0000000280000012L});
    public static final BitSet FOLLOW_ruleElements_in_entryRuleElements166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElements176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleElements223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleElements250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleElements277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleElements304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleClass390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass406 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_12_in_ruleClass424 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass443 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleClass462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass479 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleClass498 = new BitSet(new long[]{0x0000000061018000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClass521 = new BitSet(new long[]{0x0000000061018000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleClass540 = new BitSet(new long[]{0x0000000061018000L});
    public static final BitSet FOLLOW_ruleDependancy_in_ruleClass559 = new BitSet(new long[]{0x0000000061018000L});
    public static final BitSet FOLLOW_15_in_ruleClass575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_entryRuleDependancy611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependancy621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDependancy658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependancy675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleEnumeration767 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumeration778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration795 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumeration812 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration824 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_13_in_ruleEnumeration836 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEnumeration852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleInterface939 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInterface950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface967 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface984 = new BitSet(new long[]{0x0000000061008000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleInterface1005 = new BitSet(new long[]{0x0000000061008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleAbstract1105 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAbstract1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstract1133 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_12_in_ruleAbstract1151 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstract1170 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleAbstract1189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstract1206 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleAbstract1225 = new BitSet(new long[]{0x0000000061008000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAbstract1248 = new BitSet(new long[]{0x0000000061008000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAbstract1267 = new BitSet(new long[]{0x0000000061008000L});
    public static final BitSet FOLLOW_15_in_ruleAbstract1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiRelation_in_entryRuleBiRelation1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBiRelation1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBiRelation1366 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1380 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleBiRelation1394 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1407 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1426 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1447 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBiRelation1461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBiRelation1473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBiRelation1490 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBiRelation1507 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBiRelation1519 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1533 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleBiRelation1547 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1560 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1579 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1600 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBiRelation1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_ruleAttribute1701 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_ruleAttribute1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1750 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute1767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1784 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute1803 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute1815 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleAttribute1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiRelation_in_ruleAttribute1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparamIn_in_entryRuleparamIn1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparamIn1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparamIn1946 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleparamIn1963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparamIn1980 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleparamIn1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_ruleMethod2087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2103 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMethod2120 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleparamIn_in_ruleMethod2141 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleMethod2154 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleMethod2167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility2228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyVisibility2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBodyVisibility2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBodyVisibility2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBodyVisibility2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility2356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassVisibility2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleClassVisibility2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleClassVisibility2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage2464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePackage2520 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePackage2532 = new BitSet(new long[]{0x00000003A1000010L});
    public static final BitSet FOLLOW_ruleElements_in_rulePackage2553 = new BitSet(new long[]{0x00000003A1000010L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage2575 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePackage2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName2677 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulePackageName2698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName2713 = new BitSet(new long[]{0x0000000200000002L});

}