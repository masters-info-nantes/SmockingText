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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'{'", "'}'", "','", "'->'", "'e'", "'i'", "'a'", "'['", "'..'", "'*'", "']'", "'-'", "'<>'", "'<!>'", "'('", "')'", "'+'", "'#'", "'.'", "'[['", "']]'"
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

                if ( (LA1_0==RULE_ID||(LA1_0>=31 && LA1_0<=32)) ) {
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
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==24) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt2=3;
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
                case 18:
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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:175:1: ruleClass returns [EObject current=null] : ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? ( (lv_implements_4_0= ruleImplements ) )* otherlv_5= '{' ( ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_classname_1_0=null;
        Token otherlv_2=null;
        Token lv_extension_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_implements_4_0 = null;

        EObject lv_body_6_1 = null;

        EObject lv_body_6_2 = null;

        EObject lv_body_6_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:178:28: ( ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? ( (lv_implements_4_0= ruleImplements ) )* otherlv_5= '{' ( ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) ) )* otherlv_7= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:179:1: ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? ( (lv_implements_4_0= ruleImplements ) )* otherlv_5= '{' ( ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) ) )* otherlv_7= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:179:1: ( ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? ( (lv_implements_4_0= ruleImplements ) )* otherlv_5= '{' ( ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) ) )* otherlv_7= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:180:5: ruleClassVisibility ( (lv_classname_1_0= RULE_ID ) ) (otherlv_2= ':' )? ( (lv_extension_3_0= RULE_ID ) )? ( (lv_implements_4_0= ruleImplements ) )* otherlv_5= '{' ( ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) ) )* otherlv_7= '}'
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

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:227:3: ( (lv_implements_4_0= ruleImplements ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:228:1: (lv_implements_4_0= ruleImplements )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:228:1: (lv_implements_4_0= ruleImplements )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:229:3: lv_implements_4_0= ruleImplements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getImplementsImplementsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplements_in_ruleClass470);
            	    lv_implements_4_0=ruleImplements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"implements",
            	            		lv_implements_4_0, 
            	            		"Implements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleClass483); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:249:1: ( ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==24||(LA7_0>=29 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:250:1: ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:250:1: ( (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy ) )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:251:1: (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:251:1: (lv_body_6_1= ruleAttribute | lv_body_6_2= ruleMethod | lv_body_6_3= ruleDependancy )
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

            	        if ( (LA6_2==RULE_ID) ) {
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
            	        else if ( ((LA6_2>=25 && LA6_2<=26)) ) {
            	            alt6=1;
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

            	        if ( (LA6_3==RULE_ID) ) {
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
            	        else if ( ((LA6_3>=25 && LA6_3<=26)) ) {
            	            alt6=1;
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
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:252:3: lv_body_6_1= ruleAttribute
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getClassAccess().getBodyAttributeParserRuleCall_6_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAttribute_in_ruleClass506);
            	            lv_body_6_1=ruleAttribute();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_6_1, 
            	                    		"Attribute");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:267:8: lv_body_6_2= ruleMethod
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getClassAccess().getBodyMethodParserRuleCall_6_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleMethod_in_ruleClass525);
            	            lv_body_6_2=ruleMethod();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_6_2, 
            	                    		"Method");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:282:8: lv_body_6_3= ruleDependancy
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getClassAccess().getBodyDependancyParserRuleCall_6_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDependancy_in_ruleClass544);
            	            lv_body_6_3=ruleDependancy();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_6_3, 
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

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleClass560); 

                	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleImplements"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:312:1: entryRuleImplements returns [String current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final String entryRuleImplements() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplements = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:313:2: (iv_ruleImplements= ruleImplements EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:314:2: iv_ruleImplements= ruleImplements EOF
            {
             newCompositeNode(grammarAccess.getImplementsRule()); 
            pushFollow(FOLLOW_ruleImplements_in_entryRuleImplements597);
            iv_ruleImplements=ruleImplements();

            state._fsp--;

             current =iv_ruleImplements.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplements608); 

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
    // $ANTLR end "entryRuleImplements"


    // $ANTLR start "ruleImplements"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:321:1: ruleImplements returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ',' )? this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleImplements() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:324:28: ( ( (kw= ',' )? this_ID_1= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:325:1: ( (kw= ',' )? this_ID_1= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:325:1: ( (kw= ',' )? this_ID_1= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:325:2: (kw= ',' )? this_ID_1= RULE_ID
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:325:2: (kw= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:326:2: kw= ','
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleImplements647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImplementsAccess().getCommaKeyword_0()); 
                        

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplements664); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getImplementsAccess().getIDTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleImplements"


    // $ANTLR start "entryRuleDependancy"
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:346:1: entryRuleDependancy returns [EObject current=null] : iv_ruleDependancy= ruleDependancy EOF ;
    public final EObject entryRuleDependancy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependancy = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:347:2: (iv_ruleDependancy= ruleDependancy EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:348:2: iv_ruleDependancy= ruleDependancy EOF
            {
             newCompositeNode(grammarAccess.getDependancyRule()); 
            pushFollow(FOLLOW_ruleDependancy_in_entryRuleDependancy709);
            iv_ruleDependancy=ruleDependancy();

            state._fsp--;

             current =iv_ruleDependancy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependancy719); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:355:1: ruleDependancy returns [EObject current=null] : (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDependancy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:358:28: ( (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:359:1: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:359:1: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:359:3: otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDependancy756); 

                	newLeafNode(otherlv_0, grammarAccess.getDependancyAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:363:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:364:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:364:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:365:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependancy773); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:389:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:390:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:391:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration814);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration824); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:398:1: ruleEnumeration returns [EObject current=null] : ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' ) ;
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
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:401:28: ( ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:402:1: ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:402:1: ( ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:403:5: ruleClassVisibility otherlv_1= 'e' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '{' (this_ID_4= RULE_ID (otherlv_5= ',' )? )* otherlv_6= '}'
            {
             
                    newCompositeNode(grammarAccess.getEnumerationAccess().getClassVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassVisibility_in_ruleEnumeration865);
            ruleClassVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEnumeration876); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:414:1: ( (lv_classname_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:415:1: (lv_classname_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:415:1: (lv_classname_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:416:3: lv_classname_2_0= RULE_ID
            {
            lv_classname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration893); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEnumeration910); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:436:1: (this_ID_4= RULE_ID (otherlv_5= ',' )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:436:2: this_ID_4= RULE_ID (otherlv_5= ',' )?
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration922); 
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()); 
            	        
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:440:1: (otherlv_5= ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==15) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:440:3: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEnumeration934); 

            	                	newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_4_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEnumeration950); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:456:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:457:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:458:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface986);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface996); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:465:1: ruleInterface returns [EObject current=null] : ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_interfacename_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:468:28: ( ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:469:1: ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:469:1: ( ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:470:5: ruleClassVisibility otherlv_1= 'i' ( (lv_interfacename_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_body_4_0= ruleMethod ) )* otherlv_5= '}'
            {
             
                    newCompositeNode(grammarAccess.getInterfaceAccess().getClassVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassVisibility_in_ruleInterface1037);
            ruleClassVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleInterface1048); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getIKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:481:1: ( (lv_interfacename_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:482:1: (lv_interfacename_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:482:1: (lv_interfacename_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:483:3: lv_interfacename_2_0= RULE_ID
            {
            lv_interfacename_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1065); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleInterface1082); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:503:1: ( (lv_body_4_0= ruleMethod ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||(LA11_0>=29 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:504:1: (lv_body_4_0= ruleMethod )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:504:1: (lv_body_4_0= ruleMethod )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:505:3: lv_body_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getBodyMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleInterface1103);
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
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInterface1116); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:533:1: entryRuleAbstract returns [EObject current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final EObject entryRuleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstract = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:534:2: (iv_ruleAbstract= ruleAbstract EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:535:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract1152);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract1162); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:542:1: ruleAbstract returns [EObject current=null] : ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? ( (lv_implements_5_0= ruleImplements ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_classname_2_0=null;
        Token otherlv_3=null;
        Token lv_extension_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_implements_5_0 = null;

        EObject lv_body_7_1 = null;

        EObject lv_body_7_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:545:28: ( ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? ( (lv_implements_5_0= ruleImplements ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) ) )* otherlv_8= '}' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:546:1: ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? ( (lv_implements_5_0= ruleImplements ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) ) )* otherlv_8= '}' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:546:1: ( ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? ( (lv_implements_5_0= ruleImplements ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) ) )* otherlv_8= '}' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:547:5: ruleClassVisibility otherlv_1= 'a' ( (lv_classname_2_0= RULE_ID ) ) (otherlv_3= ':' )? ( (lv_extension_4_0= RULE_ID ) )? ( (lv_implements_5_0= ruleImplements ) )* otherlv_6= '{' ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) ) )* otherlv_8= '}'
            {
             
                    newCompositeNode(grammarAccess.getAbstractAccess().getClassVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassVisibility_in_ruleAbstract1203);
            ruleClassVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAbstract1214); 

                	newLeafNode(otherlv_1, grammarAccess.getAbstractAccess().getAKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:558:1: ( (lv_classname_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:559:1: (lv_classname_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:559:1: (lv_classname_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:560:3: lv_classname_2_0= RULE_ID
            {
            lv_classname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstract1231); 

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

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:576:2: (otherlv_3= ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:576:4: otherlv_3= ':'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAbstract1249); 

                        	newLeafNode(otherlv_3, grammarAccess.getAbstractAccess().getColonKeyword_3());
                        

                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:580:3: ( (lv_extension_4_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:581:1: (lv_extension_4_0= RULE_ID )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:581:1: (lv_extension_4_0= RULE_ID )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:582:3: lv_extension_4_0= RULE_ID
                    {
                    lv_extension_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstract1268); 

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

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:598:3: ( (lv_implements_5_0= ruleImplements ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:599:1: (lv_implements_5_0= ruleImplements )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:599:1: (lv_implements_5_0= ruleImplements )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:600:3: lv_implements_5_0= ruleImplements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAbstractAccess().getImplementsImplementsParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplements_in_ruleAbstract1295);
            	    lv_implements_5_0=ruleImplements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAbstractRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"implements",
            	            		lv_implements_5_0, 
            	            		"Implements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleAbstract1308); 

                	newLeafNode(otherlv_6, grammarAccess.getAbstractAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:620:1: ( ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24||(LA16_0>=29 && LA16_0<=30)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:621:1: ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:621:1: ( (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod ) )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:622:1: (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:622:1: (lv_body_7_1= ruleAttribute | lv_body_7_2= ruleMethod )
            	    int alt15=2;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        int LA15_1 = input.LA(2);

            	        if ( ((LA15_1>=25 && LA15_1<=26)) ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_1==RULE_ID) ) {
            	            int LA15_5 = input.LA(3);

            	            if ( (LA15_5==12) ) {
            	                alt15=1;
            	            }
            	            else if ( (LA15_5==27) ) {
            	                alt15=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 15, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 24:
            	        {
            	        int LA15_2 = input.LA(2);

            	        if ( ((LA15_2>=25 && LA15_2<=26)) ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_2==RULE_ID) ) {
            	            int LA15_5 = input.LA(3);

            	            if ( (LA15_5==12) ) {
            	                alt15=1;
            	            }
            	            else if ( (LA15_5==27) ) {
            	                alt15=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 15, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 30:
            	        {
            	        int LA15_3 = input.LA(2);

            	        if ( (LA15_3==RULE_ID) ) {
            	            int LA15_5 = input.LA(3);

            	            if ( (LA15_5==12) ) {
            	                alt15=1;
            	            }
            	            else if ( (LA15_5==27) ) {
            	                alt15=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 15, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( ((LA15_3>=25 && LA15_3<=26)) ) {
            	            alt15=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:623:3: lv_body_7_1= ruleAttribute
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAbstractAccess().getBodyAttributeParserRuleCall_7_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAttribute_in_ruleAbstract1331);
            	            lv_body_7_1=ruleAttribute();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAbstractRule());
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
            	            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:638:8: lv_body_7_2= ruleMethod
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAbstractAccess().getBodyMethodParserRuleCall_7_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleMethod_in_ruleAbstract1350);
            	            lv_body_7_2=ruleMethod();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAbstractRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"body",
            	                    		lv_body_7_2, 
            	                    		"Method");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleAbstract1366); 

                	newLeafNode(otherlv_8, grammarAccess.getAbstractAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:668:1: entryRuleBiRelation returns [EObject current=null] : iv_ruleBiRelation= ruleBiRelation EOF ;
    public final EObject entryRuleBiRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiRelation = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:669:2: (iv_ruleBiRelation= ruleBiRelation EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:670:2: iv_ruleBiRelation= ruleBiRelation EOF
            {
             newCompositeNode(grammarAccess.getBiRelationRule()); 
            pushFollow(FOLLOW_ruleBiRelation_in_entryRuleBiRelation1402);
            iv_ruleBiRelation=ruleBiRelation();

            state._fsp--;

             current =iv_ruleBiRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBiRelation1412); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:677:1: ruleBiRelation returns [EObject current=null] : (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' ) ;
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
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:680:28: ( (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:681:1: (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:681:1: (otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:681:3: otherlv_0= '[' ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )? otherlv_6= ']' otherlv_7= '-' ( (lv_linkName_8_0= RULE_ID ) ) otherlv_9= '->' otherlv_10= '[' ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )? otherlv_16= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBiRelation1449); 

                	newLeafNode(otherlv_0, grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:685:1: ( ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) ) | otherlv_5= '*' )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_NUMBER) ) {
                alt20=1;
            }
            else if ( (LA20_0==22) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:685:2: ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:685:2: ( (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:685:3: (this_number_1= RULE_NUMBER )+ (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:685:3: (this_number_1= RULE_NUMBER )+
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
                    	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:685:4: this_number_1= RULE_NUMBER
                    	    {
                    	    this_number_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1463); 
                    	     
                    	        newLeafNode(this_number_1, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_0()); 
                    	        

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

                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:689:3: (otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:689:5: otherlv_2= '..' ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleBiRelation1477); 

                        	newLeafNode(otherlv_2, grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_1_0_1_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:693:1: ( (this_number_3= RULE_NUMBER )+ | otherlv_4= '*' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_NUMBER) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==22) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:693:2: (this_number_3= RULE_NUMBER )+
                            {
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:693:2: (this_number_3= RULE_NUMBER )+
                            int cnt18=0;
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_NUMBER) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:693:3: this_number_3= RULE_NUMBER
                            	    {
                            	    this_number_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1490); 
                            	     
                            	        newLeafNode(this_number_3, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_1_0_1_1_0()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt18 >= 1 ) break loop18;
                                        EarlyExitException eee =
                                            new EarlyExitException(18, input);
                                        throw eee;
                                }
                                cnt18++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:698:7: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1509); 

                                	newLeafNode(otherlv_4, grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_0_1_1_1());
                                

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:703:7: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1530); 

                        	newLeafNode(otherlv_5, grammarAccess.getBiRelationAccess().getAsteriskKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBiRelation1544); 

                	newLeafNode(otherlv_6, grammarAccess.getBiRelationAccess().getRightSquareBracketKeyword_2());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleBiRelation1556); 

                	newLeafNode(otherlv_7, grammarAccess.getBiRelationAccess().getHyphenMinusKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:715:1: ( (lv_linkName_8_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:716:1: (lv_linkName_8_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:716:1: (lv_linkName_8_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:717:3: lv_linkName_8_0= RULE_ID
            {
            lv_linkName_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBiRelation1573); 

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

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleBiRelation1590); 

                	newLeafNode(otherlv_9, grammarAccess.getBiRelationAccess().getHyphenMinusGreaterThanSignKeyword_5());
                
            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleBiRelation1602); 

                	newLeafNode(otherlv_10, grammarAccess.getBiRelationAccess().getLeftSquareBracketKeyword_6());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:741:1: ( ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) ) | otherlv_15= '*' )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NUMBER) ) {
                alt24=1;
            }
            else if ( (LA24_0==22) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:741:2: ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:741:2: ( (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:741:3: (this_number_11= RULE_NUMBER )+ (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:741:3: (this_number_11= RULE_NUMBER )+
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
                    	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:741:4: this_number_11= RULE_NUMBER
                    	    {
                    	    this_number_11=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1616); 
                    	     
                    	        newLeafNode(this_number_11, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_0()); 
                    	        

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

                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:745:3: (otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:745:5: otherlv_12= '..' ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' )
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleBiRelation1630); 

                        	newLeafNode(otherlv_12, grammarAccess.getBiRelationAccess().getFullStopFullStopKeyword_7_0_1_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:749:1: ( (this_number_13= RULE_NUMBER )+ | otherlv_14= '*' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_NUMBER) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==22) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:749:2: (this_number_13= RULE_NUMBER )+
                            {
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:749:2: (this_number_13= RULE_NUMBER )+
                            int cnt22=0;
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_NUMBER) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:749:3: this_number_13= RULE_NUMBER
                            	    {
                            	    this_number_13=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleBiRelation1643); 
                            	     
                            	        newLeafNode(this_number_13, grammarAccess.getBiRelationAccess().getNumberTerminalRuleCall_7_0_1_1_0()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt22 >= 1 ) break loop22;
                                        EarlyExitException eee =
                                            new EarlyExitException(22, input);
                                        throw eee;
                                }
                                cnt22++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:754:7: otherlv_14= '*'
                            {
                            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1662); 

                                	newLeafNode(otherlv_14, grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_0_1_1_1());
                                

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:759:7: otherlv_15= '*'
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleBiRelation1683); 

                        	newLeafNode(otherlv_15, grammarAccess.getBiRelationAccess().getAsteriskKeyword_7_1());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleBiRelation1697); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:775:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:776:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:777:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1733);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1743); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:784:1: ruleAttribute returns [EObject current=null] : ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? ) ;
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
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:787:28: ( ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:788:1: ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:788:1: ( ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )? )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:789:5: ruleBodyVisibility (otherlv_1= '<>' | otherlv_2= '<!>' )? ( (lv_attributename_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAttributeAccess().getBodyVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBodyVisibility_in_ruleAttribute1784);
            ruleBodyVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:796:1: (otherlv_1= '<>' | otherlv_2= '<!>' )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            else if ( (LA25_0==26) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:796:3: otherlv_1= '<>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1796); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLessThanSignGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:801:7: otherlv_2= '<!>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleAttribute1814); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLessThanSignExclamationMarkGreaterThanSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:805:3: ( (lv_attributename_3_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:806:1: (lv_attributename_3_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:806:1: (lv_attributename_3_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:807:3: lv_attributename_3_0= RULE_ID
            {
            lv_attributename_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1833); 

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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleAttribute1850); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_3());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:827:1: ( (lv_type_5_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:828:1: (lv_type_5_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:828:1: (lv_type_5_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:829:3: lv_type_5_0= RULE_ID
            {
            lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1867); 

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

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:845:2: ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )?
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:845:3: (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:845:3: (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:845:5: otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleAttribute1886); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:849:1: (this_number_7= RULE_NUMBER )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_NUMBER) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:849:2: this_number_7= RULE_NUMBER
                    	    {
                    	    this_number_7=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute1898); 
                    	     
                    	        newLeafNode(this_number_7, grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleAttribute1911); 

                        	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:858:6: ( (lv_birelation_9_0= ruleBiRelation ) )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:858:6: ( (lv_birelation_9_0= ruleBiRelation ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:859:1: (lv_birelation_9_0= ruleBiRelation )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:859:1: (lv_birelation_9_0= ruleBiRelation )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:860:3: lv_birelation_9_0= ruleBiRelation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getBirelationBiRelationParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBiRelation_in_ruleAttribute1939);
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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:884:1: entryRuleparamIn returns [EObject current=null] : iv_ruleparamIn= ruleparamIn EOF ;
    public final EObject entryRuleparamIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparamIn = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:885:2: (iv_ruleparamIn= ruleparamIn EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:886:2: iv_ruleparamIn= ruleparamIn EOF
            {
             newCompositeNode(grammarAccess.getParamInRule()); 
            pushFollow(FOLLOW_ruleparamIn_in_entryRuleparamIn1977);
            iv_ruleparamIn=ruleparamIn();

            state._fsp--;

             current =iv_ruleparamIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparamIn1987); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:893:1: ruleparamIn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleparamIn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:896:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:897:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:897:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:897:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:897:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:898:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:898:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:899:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparamIn2029); 

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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleparamIn2046); 

                	newLeafNode(otherlv_1, grammarAccess.getParamInAccess().getColonKeyword_1());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:919:1: ( (lv_type_2_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:920:1: (lv_type_2_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:920:1: (lv_type_2_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:921:3: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparamIn2063); 

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

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:937:2: (otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:937:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleparamIn2081); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:949:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:950:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:951:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2119);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2129); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:958:1: ruleMethod returns [EObject current=null] : ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? ) ;
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
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:961:28: ( ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:962:1: ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:962:1: ( ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )? )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:963:5: ruleBodyVisibility ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleparamIn ) )* otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMethodAccess().getBodyVisibilityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBodyVisibility_in_ruleMethod2170);
            ruleBodyVisibility();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:970:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:971:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:971:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:972:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2186); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMethod2203); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:992:1: ( (lv_param_3_0= ruleparamIn ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:993:1: (lv_param_3_0= ruleparamIn )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:993:1: (lv_param_3_0= ruleparamIn )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:994:3: lv_param_3_0= ruleparamIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParamParamInParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleparamIn_in_ruleMethod2224);
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
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMethod2237); 

                	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1014:1: (otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==12) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1014:3: otherlv_5= ':' ( (lv_returnType_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleMethod2250); 

                        	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getColonKeyword_5_0());
                        
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1018:1: ( (lv_returnType_6_0= RULE_ID ) )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1019:1: (lv_returnType_6_0= RULE_ID )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1019:1: (lv_returnType_6_0= RULE_ID )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1020:3: lv_returnType_6_0= RULE_ID
                    {
                    lv_returnType_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2267); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1044:1: entryRuleBodyVisibility returns [String current=null] : iv_ruleBodyVisibility= ruleBodyVisibility EOF ;
    public final String entryRuleBodyVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBodyVisibility = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1045:2: (iv_ruleBodyVisibility= ruleBodyVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1046:2: iv_ruleBodyVisibility= ruleBodyVisibility EOF
            {
             newCompositeNode(grammarAccess.getBodyVisibilityRule()); 
            pushFollow(FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility2311);
            iv_ruleBodyVisibility=ruleBodyVisibility();

            state._fsp--;

             current =iv_ruleBodyVisibility.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyVisibility2322); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1053:1: ruleBodyVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '#' ) ;
    public final AntlrDatatypeRuleToken ruleBodyVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1056:28: ( (kw= '+' | kw= '-' | kw= '#' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1057:1: (kw= '+' | kw= '-' | kw= '#' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1057:1: (kw= '+' | kw= '-' | kw= '#' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt31=1;
                }
                break;
            case 24:
                {
                alt31=2;
                }
                break;
            case 30:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1058:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleBodyVisibility2360); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBodyVisibilityAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1065:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBodyVisibility2379); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBodyVisibilityAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1072:2: kw= '#'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleBodyVisibility2398); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1085:1: entryRuleClassVisibility returns [String current=null] : iv_ruleClassVisibility= ruleClassVisibility EOF ;
    public final String entryRuleClassVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassVisibility = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1086:2: (iv_ruleClassVisibility= ruleClassVisibility EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1087:2: iv_ruleClassVisibility= ruleClassVisibility EOF
            {
             newCompositeNode(grammarAccess.getClassVisibilityRule()); 
            pushFollow(FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility2439);
            iv_ruleClassVisibility=ruleClassVisibility();

            state._fsp--;

             current =iv_ruleClassVisibility.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassVisibility2450); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1094:1: ruleClassVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleClassVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1097:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1098:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1098:1: (kw= '+' | kw= '-' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            else if ( (LA32_0==24) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1099:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleClassVisibility2488); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassVisibilityAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1106:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleClassVisibility2507); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1119:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1120:2: (iv_rulePackage= rulePackage EOF )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1121:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage2547);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage2557); 

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
    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1128:1: rulePackage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '.' this_ID_2= RULE_ID )* otherlv_3= '[[' ( (lv_classType_4_0= ruleElements ) )* ( (lv_subPackage_5_0= rulePackage ) )? otherlv_6= ']]' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_classType_4_0 = null;

        EObject lv_subPackage_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1131:28: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '.' this_ID_2= RULE_ID )* otherlv_3= '[[' ( (lv_classType_4_0= ruleElements ) )* ( (lv_subPackage_5_0= rulePackage ) )? otherlv_6= ']]' ) )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1132:1: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '.' this_ID_2= RULE_ID )* otherlv_3= '[[' ( (lv_classType_4_0= ruleElements ) )* ( (lv_subPackage_5_0= rulePackage ) )? otherlv_6= ']]' )
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1132:1: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '.' this_ID_2= RULE_ID )* otherlv_3= '[[' ( (lv_classType_4_0= ruleElements ) )* ( (lv_subPackage_5_0= rulePackage ) )? otherlv_6= ']]' )
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1132:2: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '.' this_ID_2= RULE_ID )* otherlv_3= '[[' ( (lv_classType_4_0= ruleElements ) )* ( (lv_subPackage_5_0= rulePackage ) )? otherlv_6= ']]'
            {
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1132:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1133:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1133:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1134:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage2599); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPackageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1150:3: (otherlv_1= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==31) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1150:5: otherlv_1= '.' this_ID_2= RULE_ID
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePackage2618); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getFullStopKeyword_1_0());
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage2629); 
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPackageAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_rulePackage2642); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftSquareBracketLeftSquareBracketKeyword_2());
                
            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1162:1: ( (lv_classType_4_0= ruleElements ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24||LA35_0==29) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1163:1: (lv_classType_4_0= ruleElements )
            	    {
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1163:1: (lv_classType_4_0= ruleElements )
            	    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1164:3: lv_classType_4_0= ruleElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getClassTypeElementsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElements_in_rulePackage2663);
            	    lv_classType_4_0=ruleElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classType",
            	            		lv_classType_4_0, 
            	            		"Elements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1180:3: ( (lv_subPackage_5_0= rulePackage ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||(LA36_0>=31 && LA36_0<=32)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1181:1: (lv_subPackage_5_0= rulePackage )
                    {
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1181:1: (lv_subPackage_5_0= rulePackage )
                    // ../org.xtext.smokingtext.diagramclass/src-gen/org/xtext/smokingtext/diagramclass/parser/antlr/internal/InternalDiagramClass.g:1182:3: lv_subPackage_5_0= rulePackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_in_rulePackage2685);
                    lv_subPackage_5_0=rulePackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"subPackage",
                            		lv_subPackage_5_0, 
                            		"Package");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_rulePackage2698); 

                	newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getRightSquareBracketRightSquareBracketKeyword_5());
                

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

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\11\uffff";
    static final String DFA27_eofS =
        "\1\2\4\uffff\1\6\3\uffff";
    static final String DFA27_minS =
        "\1\16\1\5\1\uffff\1\5\1\uffff\1\16\1\uffff\1\4\1\14";
    static final String DFA27_maxS =
        "\1\36\1\27\1\uffff\1\27\1\uffff\1\36\1\uffff\1\32\1\33";
    static final String DFA27_acceptS =
        "\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA27_specialS =
        "\11\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\1\uffff\1\2\3\uffff\1\1\3\uffff\1\2\4\uffff\2\2",
            "\1\3\20\uffff\1\4\1\5",
            "",
            "\1\3\17\uffff\1\4\1\uffff\1\6",
            "",
            "\1\6\1\uffff\1\6\7\uffff\1\7\4\uffff\2\6",
            "",
            "\1\10\24\uffff\2\6",
            "\1\6\3\uffff\1\4\12\uffff\1\6"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "845:2: ( (otherlv_6= '[' (this_number_7= RULE_NUMBER )* otherlv_8= ']' ) | ( (lv_birelation_9_0= ruleBiRelation ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel130 = new BitSet(new long[]{0x0000000180000012L});
    public static final BitSet FOLLOW_ruleElements_in_entryRuleElements166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElements176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleElements223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleElements250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleElements277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleElements304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleClass390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass406 = new BitSet(new long[]{0x000000000000B010L});
    public static final BitSet FOLLOW_12_in_ruleClass424 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass443 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_ruleImplements_in_ruleClass470 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_13_in_ruleClass483 = new BitSet(new long[]{0x0000000061014000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClass506 = new BitSet(new long[]{0x0000000061014000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleClass525 = new BitSet(new long[]{0x0000000061014000L});
    public static final BitSet FOLLOW_ruleDependancy_in_ruleClass544 = new BitSet(new long[]{0x0000000061014000L});
    public static final BitSet FOLLOW_14_in_ruleClass560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_entryRuleImplements597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplements608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImplements647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplements664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_entryRuleDependancy709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependancy719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDependancy756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependancy773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleEnumeration865 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumeration876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration893 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumeration910 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration922 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_15_in_ruleEnumeration934 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleEnumeration950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleInterface1037 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInterface1048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1065 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInterface1082 = new BitSet(new long[]{0x0000000061004000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleInterface1103 = new BitSet(new long[]{0x0000000061004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_ruleAbstract1203 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAbstract1214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstract1231 = new BitSet(new long[]{0x000000000000B010L});
    public static final BitSet FOLLOW_12_in_ruleAbstract1249 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstract1268 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_ruleImplements_in_ruleAbstract1295 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_13_in_ruleAbstract1308 = new BitSet(new long[]{0x0000000061004000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAbstract1331 = new BitSet(new long[]{0x0000000061004000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAbstract1350 = new BitSet(new long[]{0x0000000061004000L});
    public static final BitSet FOLLOW_14_in_ruleAbstract1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiRelation_in_entryRuleBiRelation1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBiRelation1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBiRelation1449 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1463 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleBiRelation1477 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1490 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1509 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1530 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBiRelation1544 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBiRelation1556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBiRelation1573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBiRelation1590 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBiRelation1602 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1616 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleBiRelation1630 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleBiRelation1643 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1662 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22_in_ruleBiRelation1683 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBiRelation1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_ruleAttribute1784 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_ruleAttribute1814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1833 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute1850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1867 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute1886 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute1898 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleAttribute1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiRelation_in_ruleAttribute1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparamIn_in_entryRuleparamIn1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparamIn1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparamIn2029 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleparamIn2046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparamIn2063 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleparamIn2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_ruleMethod2170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2186 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMethod2203 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleparamIn_in_ruleMethod2224 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleMethod2237 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleMethod2250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyVisibility_in_entryRuleBodyVisibility2311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyVisibility2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBodyVisibility2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBodyVisibility2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBodyVisibility2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVisibility_in_entryRuleClassVisibility2439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassVisibility2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleClassVisibility2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleClassVisibility2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage2599 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_rulePackage2618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage2629 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_rulePackage2642 = new BitSet(new long[]{0x00000003A1000010L});
    public static final BitSet FOLLOW_ruleElements_in_rulePackage2663 = new BitSet(new long[]{0x00000003A1000010L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage2685 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePackage2698 = new BitSet(new long[]{0x0000000000000002L});

}