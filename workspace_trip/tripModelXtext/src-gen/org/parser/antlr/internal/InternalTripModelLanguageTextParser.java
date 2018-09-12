package org.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.TripModelLanguageTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTripModelLanguageTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TripModel'", "'{'", "'trip'", "','", "'}'", "'location'", "'Trip'", "'End'", "'Start'", "'source'", "'destination'", "'service'", "'Service'", "'Cost'", "'Duration'", "'Rating'", "'Type'", "'-'", "'.'", "'E'", "'e'", "'OtherService'", "'TravelService'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DATE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTripModelLanguageTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTripModelLanguageTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTripModelLanguageTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTripModelLanguageText.g"; }



     	private TripModelLanguageTextGrammarAccess grammarAccess;

        public InternalTripModelLanguageTextParser(TokenStream input, TripModelLanguageTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TripModel";
       	}

       	@Override
       	protected TripModelLanguageTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTripModel"
    // InternalTripModelLanguageText.g:64:1: entryRuleTripModel returns [EObject current=null] : iv_ruleTripModel= ruleTripModel EOF ;
    public final EObject entryRuleTripModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTripModel = null;


        try {
            // InternalTripModelLanguageText.g:64:50: (iv_ruleTripModel= ruleTripModel EOF )
            // InternalTripModelLanguageText.g:65:2: iv_ruleTripModel= ruleTripModel EOF
            {
             newCompositeNode(grammarAccess.getTripModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTripModel=ruleTripModel();

            state._fsp--;

             current =iv_ruleTripModel; 
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
    // $ANTLR end "entryRuleTripModel"


    // $ANTLR start "ruleTripModel"
    // InternalTripModelLanguageText.g:71:1: ruleTripModel returns [EObject current=null] : ( () otherlv_1= 'TripModel' otherlv_2= '{' (otherlv_3= 'trip' otherlv_4= '{' ( (lv_trip_5_0= ruleTrip ) ) (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )* otherlv_8= '}' )? (otherlv_9= 'location' otherlv_10= '{' ( (lv_location_11_0= rulelocation ) ) (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTripModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_trip_5_0 = null;

        EObject lv_trip_7_0 = null;

        EObject lv_location_11_0 = null;

        EObject lv_location_13_0 = null;



        	enterRule();

        try {
            // InternalTripModelLanguageText.g:77:2: ( ( () otherlv_1= 'TripModel' otherlv_2= '{' (otherlv_3= 'trip' otherlv_4= '{' ( (lv_trip_5_0= ruleTrip ) ) (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )* otherlv_8= '}' )? (otherlv_9= 'location' otherlv_10= '{' ( (lv_location_11_0= rulelocation ) ) (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalTripModelLanguageText.g:78:2: ( () otherlv_1= 'TripModel' otherlv_2= '{' (otherlv_3= 'trip' otherlv_4= '{' ( (lv_trip_5_0= ruleTrip ) ) (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )* otherlv_8= '}' )? (otherlv_9= 'location' otherlv_10= '{' ( (lv_location_11_0= rulelocation ) ) (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalTripModelLanguageText.g:78:2: ( () otherlv_1= 'TripModel' otherlv_2= '{' (otherlv_3= 'trip' otherlv_4= '{' ( (lv_trip_5_0= ruleTrip ) ) (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )* otherlv_8= '}' )? (otherlv_9= 'location' otherlv_10= '{' ( (lv_location_11_0= rulelocation ) ) (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalTripModelLanguageText.g:79:3: () otherlv_1= 'TripModel' otherlv_2= '{' (otherlv_3= 'trip' otherlv_4= '{' ( (lv_trip_5_0= ruleTrip ) ) (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )* otherlv_8= '}' )? (otherlv_9= 'location' otherlv_10= '{' ( (lv_location_11_0= rulelocation ) ) (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalTripModelLanguageText.g:79:3: ()
            // InternalTripModelLanguageText.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTripModelAccess().getTripModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTripModelAccess().getTripModelKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTripModelLanguageText.g:94:3: (otherlv_3= 'trip' otherlv_4= '{' ( (lv_trip_5_0= ruleTrip ) ) (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTripModelLanguageText.g:95:4: otherlv_3= 'trip' otherlv_4= '{' ( (lv_trip_5_0= ruleTrip ) ) (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTripModelAccess().getTripKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTripModelLanguageText.g:103:4: ( (lv_trip_5_0= ruleTrip ) )
                    // InternalTripModelLanguageText.g:104:5: (lv_trip_5_0= ruleTrip )
                    {
                    // InternalTripModelLanguageText.g:104:5: (lv_trip_5_0= ruleTrip )
                    // InternalTripModelLanguageText.g:105:6: lv_trip_5_0= ruleTrip
                    {

                    						newCompositeNode(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_trip_5_0=ruleTrip();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTripModelRule());
                    						}
                    						add(
                    							current,
                    							"trip",
                    							lv_trip_5_0,
                    							"org.TripModelLanguageText.Trip");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTripModelLanguageText.g:122:4: (otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTripModelLanguageText.g:123:5: otherlv_6= ',' ( (lv_trip_7_0= ruleTrip ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTripModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTripModelLanguageText.g:127:5: ( (lv_trip_7_0= ruleTrip ) )
                    	    // InternalTripModelLanguageText.g:128:6: (lv_trip_7_0= ruleTrip )
                    	    {
                    	    // InternalTripModelLanguageText.g:128:6: (lv_trip_7_0= ruleTrip )
                    	    // InternalTripModelLanguageText.g:129:7: lv_trip_7_0= ruleTrip
                    	    {

                    	    							newCompositeNode(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_trip_7_0=ruleTrip();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTripModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"trip",
                    	    								lv_trip_7_0,
                    	    								"org.TripModelLanguageText.Trip");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalTripModelLanguageText.g:152:3: (otherlv_9= 'location' otherlv_10= '{' ( (lv_location_11_0= rulelocation ) ) (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTripModelLanguageText.g:153:4: otherlv_9= 'location' otherlv_10= '{' ( (lv_location_11_0= rulelocation ) ) (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTripModelAccess().getLocationKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTripModelLanguageText.g:161:4: ( (lv_location_11_0= rulelocation ) )
                    // InternalTripModelLanguageText.g:162:5: (lv_location_11_0= rulelocation )
                    {
                    // InternalTripModelLanguageText.g:162:5: (lv_location_11_0= rulelocation )
                    // InternalTripModelLanguageText.g:163:6: lv_location_11_0= rulelocation
                    {

                    						newCompositeNode(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_location_11_0=rulelocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTripModelRule());
                    						}
                    						add(
                    							current,
                    							"location",
                    							lv_location_11_0,
                    							"org.TripModelLanguageText.location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTripModelLanguageText.g:180:4: (otherlv_12= ',' ( (lv_location_13_0= rulelocation ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTripModelLanguageText.g:181:5: otherlv_12= ',' ( (lv_location_13_0= rulelocation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTripModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTripModelLanguageText.g:185:5: ( (lv_location_13_0= rulelocation ) )
                    	    // InternalTripModelLanguageText.g:186:6: (lv_location_13_0= rulelocation )
                    	    {
                    	    // InternalTripModelLanguageText.g:186:6: (lv_location_13_0= rulelocation )
                    	    // InternalTripModelLanguageText.g:187:7: lv_location_13_0= rulelocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_location_13_0=rulelocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTripModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"location",
                    	    								lv_location_13_0,
                    	    								"org.TripModelLanguageText.location");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTripModel"


    // $ANTLR start "entryRuleService"
    // InternalTripModelLanguageText.g:218:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalTripModelLanguageText.g:218:48: (iv_ruleService= ruleService EOF )
            // InternalTripModelLanguageText.g:219:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalTripModelLanguageText.g:225:1: ruleService returns [EObject current=null] : (this_Service_Impl_0= ruleService_Impl | this_OtherService_1= ruleOtherService | this_TravelService_2= ruleTravelService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_Service_Impl_0 = null;

        EObject this_OtherService_1 = null;

        EObject this_TravelService_2 = null;



        	enterRule();

        try {
            // InternalTripModelLanguageText.g:231:2: ( (this_Service_Impl_0= ruleService_Impl | this_OtherService_1= ruleOtherService | this_TravelService_2= ruleTravelService ) )
            // InternalTripModelLanguageText.g:232:2: (this_Service_Impl_0= ruleService_Impl | this_OtherService_1= ruleOtherService | this_TravelService_2= ruleTravelService )
            {
            // InternalTripModelLanguageText.g:232:2: (this_Service_Impl_0= ruleService_Impl | this_OtherService_1= ruleOtherService | this_TravelService_2= ruleTravelService )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTripModelLanguageText.g:233:3: this_Service_Impl_0= ruleService_Impl
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Service_Impl_0=ruleService_Impl();

                    state._fsp--;


                    			current = this_Service_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTripModelLanguageText.g:242:3: this_OtherService_1= ruleOtherService
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getOtherServiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OtherService_1=ruleOtherService();

                    state._fsp--;


                    			current = this_OtherService_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTripModelLanguageText.g:251:3: this_TravelService_2= ruleTravelService
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getTravelServiceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TravelService_2=ruleTravelService();

                    state._fsp--;


                    			current = this_TravelService_2;
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleTrip"
    // InternalTripModelLanguageText.g:263:1: entryRuleTrip returns [EObject current=null] : iv_ruleTrip= ruleTrip EOF ;
    public final EObject entryRuleTrip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrip = null;


        try {
            // InternalTripModelLanguageText.g:263:45: (iv_ruleTrip= ruleTrip EOF )
            // InternalTripModelLanguageText.g:264:2: iv_ruleTrip= ruleTrip EOF
            {
             newCompositeNode(grammarAccess.getTripRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrip=ruleTrip();

            state._fsp--;

             current =iv_ruleTrip; 
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
    // $ANTLR end "entryRuleTrip"


    // $ANTLR start "ruleTrip"
    // InternalTripModelLanguageText.g:270:1: ruleTrip returns [EObject current=null] : (otherlv_0= 'Trip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'End' ( (lv_End_4_0= ruleEDate ) ) )? (otherlv_5= 'Start' ( (lv_Start_6_0= ruleEDate ) ) )? otherlv_7= 'source' ( ( ruleEString ) ) otherlv_9= 'destination' ( ( ruleEString ) ) (otherlv_11= 'service' otherlv_12= '{' ( (lv_service_13_0= ruleService ) ) (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleTrip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_End_4_0 = null;

        AntlrDatatypeRuleToken lv_Start_6_0 = null;

        EObject lv_service_13_0 = null;

        EObject lv_service_15_0 = null;



        	enterRule();

        try {
            // InternalTripModelLanguageText.g:276:2: ( (otherlv_0= 'Trip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'End' ( (lv_End_4_0= ruleEDate ) ) )? (otherlv_5= 'Start' ( (lv_Start_6_0= ruleEDate ) ) )? otherlv_7= 'source' ( ( ruleEString ) ) otherlv_9= 'destination' ( ( ruleEString ) ) (otherlv_11= 'service' otherlv_12= '{' ( (lv_service_13_0= ruleService ) ) (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalTripModelLanguageText.g:277:2: (otherlv_0= 'Trip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'End' ( (lv_End_4_0= ruleEDate ) ) )? (otherlv_5= 'Start' ( (lv_Start_6_0= ruleEDate ) ) )? otherlv_7= 'source' ( ( ruleEString ) ) otherlv_9= 'destination' ( ( ruleEString ) ) (otherlv_11= 'service' otherlv_12= '{' ( (lv_service_13_0= ruleService ) ) (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalTripModelLanguageText.g:277:2: (otherlv_0= 'Trip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'End' ( (lv_End_4_0= ruleEDate ) ) )? (otherlv_5= 'Start' ( (lv_Start_6_0= ruleEDate ) ) )? otherlv_7= 'source' ( ( ruleEString ) ) otherlv_9= 'destination' ( ( ruleEString ) ) (otherlv_11= 'service' otherlv_12= '{' ( (lv_service_13_0= ruleService ) ) (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalTripModelLanguageText.g:278:3: otherlv_0= 'Trip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'End' ( (lv_End_4_0= ruleEDate ) ) )? (otherlv_5= 'Start' ( (lv_Start_6_0= ruleEDate ) ) )? otherlv_7= 'source' ( ( ruleEString ) ) otherlv_9= 'destination' ( ( ruleEString ) ) (otherlv_11= 'service' otherlv_12= '{' ( (lv_service_13_0= ruleService ) ) (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTripAccess().getTripKeyword_0());
            		
            // InternalTripModelLanguageText.g:282:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTripModelLanguageText.g:283:4: (lv_name_1_0= ruleEString )
            {
            // InternalTripModelLanguageText.g:283:4: (lv_name_1_0= ruleEString )
            // InternalTripModelLanguageText.g:284:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTripAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTripRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.TripModelLanguageText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTripModelLanguageText.g:305:3: (otherlv_3= 'End' ( (lv_End_4_0= ruleEDate ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTripModelLanguageText.g:306:4: otherlv_3= 'End' ( (lv_End_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getTripAccess().getEndKeyword_3_0());
                    			
                    // InternalTripModelLanguageText.g:310:4: ( (lv_End_4_0= ruleEDate ) )
                    // InternalTripModelLanguageText.g:311:5: (lv_End_4_0= ruleEDate )
                    {
                    // InternalTripModelLanguageText.g:311:5: (lv_End_4_0= ruleEDate )
                    // InternalTripModelLanguageText.g:312:6: lv_End_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getTripAccess().getEndEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_End_4_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTripRule());
                    						}
                    						set(
                    							current,
                    							"End",
                    							lv_End_4_0,
                    							"org.TripModelLanguageText.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:330:3: (otherlv_5= 'Start' ( (lv_Start_6_0= ruleEDate ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTripModelLanguageText.g:331:4: otherlv_5= 'Start' ( (lv_Start_6_0= ruleEDate ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getTripAccess().getStartKeyword_4_0());
                    			
                    // InternalTripModelLanguageText.g:335:4: ( (lv_Start_6_0= ruleEDate ) )
                    // InternalTripModelLanguageText.g:336:5: (lv_Start_6_0= ruleEDate )
                    {
                    // InternalTripModelLanguageText.g:336:5: (lv_Start_6_0= ruleEDate )
                    // InternalTripModelLanguageText.g:337:6: lv_Start_6_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getTripAccess().getStartEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_Start_6_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTripRule());
                    						}
                    						set(
                    							current,
                    							"Start",
                    							lv_Start_6_0,
                    							"org.TripModelLanguageText.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getTripAccess().getSourceKeyword_5());
            		
            // InternalTripModelLanguageText.g:359:3: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:360:4: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:360:4: ( ruleEString )
            // InternalTripModelLanguageText.g:361:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTripRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTripAccess().getSourceLocationCrossReference_6_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getTripAccess().getDestinationKeyword_7());
            		
            // InternalTripModelLanguageText.g:379:3: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:380:4: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:380:4: ( ruleEString )
            // InternalTripModelLanguageText.g:381:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTripRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTripAccess().getDestinationLocationCrossReference_8_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTripModelLanguageText.g:395:3: (otherlv_11= 'service' otherlv_12= '{' ( (lv_service_13_0= ruleService ) ) (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )* otherlv_16= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTripModelLanguageText.g:396:4: otherlv_11= 'service' otherlv_12= '{' ( (lv_service_13_0= ruleService ) ) (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTripAccess().getServiceKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalTripModelLanguageText.g:404:4: ( (lv_service_13_0= ruleService ) )
                    // InternalTripModelLanguageText.g:405:5: (lv_service_13_0= ruleService )
                    {
                    // InternalTripModelLanguageText.g:405:5: (lv_service_13_0= ruleService )
                    // InternalTripModelLanguageText.g:406:6: lv_service_13_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_service_13_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTripRule());
                    						}
                    						add(
                    							current,
                    							"service",
                    							lv_service_13_0,
                    							"org.TripModelLanguageText.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTripModelLanguageText.g:423:4: (otherlv_14= ',' ( (lv_service_15_0= ruleService ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalTripModelLanguageText.g:424:5: otherlv_14= ',' ( (lv_service_15_0= ruleService ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTripAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalTripModelLanguageText.g:428:5: ( (lv_service_15_0= ruleService ) )
                    	    // InternalTripModelLanguageText.g:429:6: (lv_service_15_0= ruleService )
                    	    {
                    	    // InternalTripModelLanguageText.g:429:6: (lv_service_15_0= ruleService )
                    	    // InternalTripModelLanguageText.g:430:7: lv_service_15_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_service_15_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTripRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"service",
                    	    								lv_service_15_0,
                    	    								"org.TripModelLanguageText.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getTripAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTripAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleTrip"


    // $ANTLR start "entryRulelocation"
    // InternalTripModelLanguageText.g:461:1: entryRulelocation returns [EObject current=null] : iv_rulelocation= rulelocation EOF ;
    public final EObject entryRulelocation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelocation = null;


        try {
            // InternalTripModelLanguageText.g:461:49: (iv_rulelocation= rulelocation EOF )
            // InternalTripModelLanguageText.g:462:2: iv_rulelocation= rulelocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelocation=rulelocation();

            state._fsp--;

             current =iv_rulelocation; 
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
    // $ANTLR end "entryRulelocation"


    // $ANTLR start "rulelocation"
    // InternalTripModelLanguageText.g:468:1: rulelocation returns [EObject current=null] : ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulelocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTripModelLanguageText.g:474:2: ( ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTripModelLanguageText.g:475:2: ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTripModelLanguageText.g:475:2: ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTripModelLanguageText.g:476:3: () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTripModelLanguageText.g:476:3: ()
            // InternalTripModelLanguageText.g:477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLocationKeyword_1());
            		
            // InternalTripModelLanguageText.g:487:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTripModelLanguageText.g:488:4: (lv_name_2_0= ruleEString )
            {
            // InternalTripModelLanguageText.g:488:4: (lv_name_2_0= ruleEString )
            // InternalTripModelLanguageText.g:489:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.TripModelLanguageText.EString");
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
    // $ANTLR end "rulelocation"


    // $ANTLR start "entryRuleService_Impl"
    // InternalTripModelLanguageText.g:510:1: entryRuleService_Impl returns [EObject current=null] : iv_ruleService_Impl= ruleService_Impl EOF ;
    public final EObject entryRuleService_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService_Impl = null;


        try {
            // InternalTripModelLanguageText.g:510:53: (iv_ruleService_Impl= ruleService_Impl EOF )
            // InternalTripModelLanguageText.g:511:2: iv_ruleService_Impl= ruleService_Impl EOF
            {
             newCompositeNode(grammarAccess.getService_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService_Impl=ruleService_Impl();

            state._fsp--;

             current =iv_ruleService_Impl; 
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
    // $ANTLR end "entryRuleService_Impl"


    // $ANTLR start "ruleService_Impl"
    // InternalTripModelLanguageText.g:517:1: ruleService_Impl returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Cost' ( (lv_Cost_5_0= ruleEFloat ) ) )? (otherlv_6= 'Duration' ( (lv_Duration_7_0= ruleEInt ) ) )? (otherlv_8= 'Rating' ( (lv_Rating_9_0= ruleEInt ) ) )? (otherlv_10= 'Type' ( (lv_Type_11_0= ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleService_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_Cost_5_0 = null;

        AntlrDatatypeRuleToken lv_Duration_7_0 = null;

        AntlrDatatypeRuleToken lv_Rating_9_0 = null;

        AntlrDatatypeRuleToken lv_Type_11_0 = null;



        	enterRule();

        try {
            // InternalTripModelLanguageText.g:523:2: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Cost' ( (lv_Cost_5_0= ruleEFloat ) ) )? (otherlv_6= 'Duration' ( (lv_Duration_7_0= ruleEInt ) ) )? (otherlv_8= 'Rating' ( (lv_Rating_9_0= ruleEInt ) ) )? (otherlv_10= 'Type' ( (lv_Type_11_0= ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalTripModelLanguageText.g:524:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Cost' ( (lv_Cost_5_0= ruleEFloat ) ) )? (otherlv_6= 'Duration' ( (lv_Duration_7_0= ruleEInt ) ) )? (otherlv_8= 'Rating' ( (lv_Rating_9_0= ruleEInt ) ) )? (otherlv_10= 'Type' ( (lv_Type_11_0= ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalTripModelLanguageText.g:524:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Cost' ( (lv_Cost_5_0= ruleEFloat ) ) )? (otherlv_6= 'Duration' ( (lv_Duration_7_0= ruleEInt ) ) )? (otherlv_8= 'Rating' ( (lv_Rating_9_0= ruleEInt ) ) )? (otherlv_10= 'Type' ( (lv_Type_11_0= ruleEString ) ) )? otherlv_12= '}' )
            // InternalTripModelLanguageText.g:525:3: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Cost' ( (lv_Cost_5_0= ruleEFloat ) ) )? (otherlv_6= 'Duration' ( (lv_Duration_7_0= ruleEInt ) ) )? (otherlv_8= 'Rating' ( (lv_Rating_9_0= ruleEInt ) ) )? (otherlv_10= 'Type' ( (lv_Type_11_0= ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalTripModelLanguageText.g:525:3: ()
            // InternalTripModelLanguageText.g:526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getService_ImplAccess().getServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getService_ImplAccess().getServiceKeyword_1());
            		
            // InternalTripModelLanguageText.g:536:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTripModelLanguageText.g:537:4: (lv_name_2_0= ruleEString )
            {
            // InternalTripModelLanguageText.g:537:4: (lv_name_2_0= ruleEString )
            // InternalTripModelLanguageText.g:538:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getService_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.TripModelLanguageText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getService_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTripModelLanguageText.g:559:3: (otherlv_4= 'Cost' ( (lv_Cost_5_0= ruleEFloat ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTripModelLanguageText.g:560:4: otherlv_4= 'Cost' ( (lv_Cost_5_0= ruleEFloat ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getService_ImplAccess().getCostKeyword_4_0());
                    			
                    // InternalTripModelLanguageText.g:564:4: ( (lv_Cost_5_0= ruleEFloat ) )
                    // InternalTripModelLanguageText.g:565:5: (lv_Cost_5_0= ruleEFloat )
                    {
                    // InternalTripModelLanguageText.g:565:5: (lv_Cost_5_0= ruleEFloat )
                    // InternalTripModelLanguageText.g:566:6: lv_Cost_5_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getService_ImplAccess().getCostEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_Cost_5_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_ImplRule());
                    						}
                    						set(
                    							current,
                    							"Cost",
                    							lv_Cost_5_0,
                    							"org.TripModelLanguageText.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:584:3: (otherlv_6= 'Duration' ( (lv_Duration_7_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTripModelLanguageText.g:585:4: otherlv_6= 'Duration' ( (lv_Duration_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getService_ImplAccess().getDurationKeyword_5_0());
                    			
                    // InternalTripModelLanguageText.g:589:4: ( (lv_Duration_7_0= ruleEInt ) )
                    // InternalTripModelLanguageText.g:590:5: (lv_Duration_7_0= ruleEInt )
                    {
                    // InternalTripModelLanguageText.g:590:5: (lv_Duration_7_0= ruleEInt )
                    // InternalTripModelLanguageText.g:591:6: lv_Duration_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getService_ImplAccess().getDurationEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_Duration_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_ImplRule());
                    						}
                    						set(
                    							current,
                    							"Duration",
                    							lv_Duration_7_0,
                    							"org.TripModelLanguageText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:609:3: (otherlv_8= 'Rating' ( (lv_Rating_9_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTripModelLanguageText.g:610:4: otherlv_8= 'Rating' ( (lv_Rating_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getService_ImplAccess().getRatingKeyword_6_0());
                    			
                    // InternalTripModelLanguageText.g:614:4: ( (lv_Rating_9_0= ruleEInt ) )
                    // InternalTripModelLanguageText.g:615:5: (lv_Rating_9_0= ruleEInt )
                    {
                    // InternalTripModelLanguageText.g:615:5: (lv_Rating_9_0= ruleEInt )
                    // InternalTripModelLanguageText.g:616:6: lv_Rating_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getService_ImplAccess().getRatingEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_Rating_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_ImplRule());
                    						}
                    						set(
                    							current,
                    							"Rating",
                    							lv_Rating_9_0,
                    							"org.TripModelLanguageText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:634:3: (otherlv_10= 'Type' ( (lv_Type_11_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTripModelLanguageText.g:635:4: otherlv_10= 'Type' ( (lv_Type_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getService_ImplAccess().getTypeKeyword_7_0());
                    			
                    // InternalTripModelLanguageText.g:639:4: ( (lv_Type_11_0= ruleEString ) )
                    // InternalTripModelLanguageText.g:640:5: (lv_Type_11_0= ruleEString )
                    {
                    // InternalTripModelLanguageText.g:640:5: (lv_Type_11_0= ruleEString )
                    // InternalTripModelLanguageText.g:641:6: lv_Type_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getService_ImplAccess().getTypeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_Type_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_ImplRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_11_0,
                    							"org.TripModelLanguageText.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getService_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleService_Impl"


    // $ANTLR start "entryRuleEDate"
    // InternalTripModelLanguageText.g:667:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalTripModelLanguageText.g:667:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalTripModelLanguageText.g:668:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalTripModelLanguageText.g:674:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_0= RULE_DATE ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_0=null;


        	enterRule();

        try {
            // InternalTripModelLanguageText.g:680:2: (this_DATE_0= RULE_DATE )
            // InternalTripModelLanguageText.g:681:2: this_DATE_0= RULE_DATE
            {
            this_DATE_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            		current.merge(this_DATE_0);
            	

            		newLeafNode(this_DATE_0, grammarAccess.getEDateAccess().getDATETerminalRuleCall());
            	

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEString"
    // InternalTripModelLanguageText.g:691:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTripModelLanguageText.g:691:47: (iv_ruleEString= ruleEString EOF )
            // InternalTripModelLanguageText.g:692:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTripModelLanguageText.g:698:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTripModelLanguageText.g:704:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTripModelLanguageText.g:705:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTripModelLanguageText.g:705:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTripModelLanguageText.g:706:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTripModelLanguageText.g:714:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // InternalTripModelLanguageText.g:725:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalTripModelLanguageText.g:725:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalTripModelLanguageText.g:726:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalTripModelLanguageText.g:732:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTripModelLanguageText.g:738:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTripModelLanguageText.g:739:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTripModelLanguageText.g:739:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTripModelLanguageText.g:740:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTripModelLanguageText.g:740:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTripModelLanguageText.g:741:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTripModelLanguageText.g:747:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTripModelLanguageText.g:748:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,30,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_27); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalTripModelLanguageText.g:768:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=31 && LA19_0<=32)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTripModelLanguageText.g:769:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTripModelLanguageText.g:769:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==31) ) {
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
                            // InternalTripModelLanguageText.g:770:5: kw= 'E'
                            {
                            kw=(Token)match(input,31,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTripModelLanguageText.g:776:5: kw= 'e'
                            {
                            kw=(Token)match(input,32,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTripModelLanguageText.g:782:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTripModelLanguageText.g:783:5: kw= '-'
                            {
                            kw=(Token)match(input,29,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // InternalTripModelLanguageText.g:801:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTripModelLanguageText.g:801:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTripModelLanguageText.g:802:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTripModelLanguageText.g:808:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTripModelLanguageText.g:814:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTripModelLanguageText.g:815:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTripModelLanguageText.g:815:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTripModelLanguageText.g:816:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTripModelLanguageText.g:816:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTripModelLanguageText.g:817:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleOtherService"
    // InternalTripModelLanguageText.g:834:1: entryRuleOtherService returns [EObject current=null] : iv_ruleOtherService= ruleOtherService EOF ;
    public final EObject entryRuleOtherService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherService = null;


        try {
            // InternalTripModelLanguageText.g:834:53: (iv_ruleOtherService= ruleOtherService EOF )
            // InternalTripModelLanguageText.g:835:2: iv_ruleOtherService= ruleOtherService EOF
            {
             newCompositeNode(grammarAccess.getOtherServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherService=ruleOtherService();

            state._fsp--;

             current =iv_ruleOtherService; 
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
    // $ANTLR end "entryRuleOtherService"


    // $ANTLR start "ruleOtherService"
    // InternalTripModelLanguageText.g:841:1: ruleOtherService returns [EObject current=null] : (otherlv_0= 'OtherService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'location' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleOtherService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_Cost_4_0 = null;

        AntlrDatatypeRuleToken lv_Duration_6_0 = null;

        AntlrDatatypeRuleToken lv_Rating_8_0 = null;

        AntlrDatatypeRuleToken lv_Type_10_0 = null;



        	enterRule();

        try {
            // InternalTripModelLanguageText.g:847:2: ( (otherlv_0= 'OtherService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'location' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // InternalTripModelLanguageText.g:848:2: (otherlv_0= 'OtherService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'location' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // InternalTripModelLanguageText.g:848:2: (otherlv_0= 'OtherService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'location' ( ( ruleEString ) ) otherlv_13= '}' )
            // InternalTripModelLanguageText.g:849:3: otherlv_0= 'OtherService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'location' ( ( ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherServiceAccess().getOtherServiceKeyword_0());
            		
            // InternalTripModelLanguageText.g:853:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTripModelLanguageText.g:854:4: (lv_name_1_0= ruleEString )
            {
            // InternalTripModelLanguageText.g:854:4: (lv_name_1_0= ruleEString )
            // InternalTripModelLanguageText.g:855:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.TripModelLanguageText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getOtherServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTripModelLanguageText.g:876:3: (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTripModelLanguageText.g:877:4: otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getOtherServiceAccess().getCostKeyword_3_0());
                    			
                    // InternalTripModelLanguageText.g:881:4: ( (lv_Cost_4_0= ruleEFloat ) )
                    // InternalTripModelLanguageText.g:882:5: (lv_Cost_4_0= ruleEFloat )
                    {
                    // InternalTripModelLanguageText.g:882:5: (lv_Cost_4_0= ruleEFloat )
                    // InternalTripModelLanguageText.g:883:6: lv_Cost_4_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getOtherServiceAccess().getCostEFloatParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_Cost_4_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherServiceRule());
                    						}
                    						set(
                    							current,
                    							"Cost",
                    							lv_Cost_4_0,
                    							"org.TripModelLanguageText.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:901:3: (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTripModelLanguageText.g:902:4: otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getOtherServiceAccess().getDurationKeyword_4_0());
                    			
                    // InternalTripModelLanguageText.g:906:4: ( (lv_Duration_6_0= ruleEInt ) )
                    // InternalTripModelLanguageText.g:907:5: (lv_Duration_6_0= ruleEInt )
                    {
                    // InternalTripModelLanguageText.g:907:5: (lv_Duration_6_0= ruleEInt )
                    // InternalTripModelLanguageText.g:908:6: lv_Duration_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getOtherServiceAccess().getDurationEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_Duration_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherServiceRule());
                    						}
                    						set(
                    							current,
                    							"Duration",
                    							lv_Duration_6_0,
                    							"org.TripModelLanguageText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:926:3: (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTripModelLanguageText.g:927:4: otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getOtherServiceAccess().getRatingKeyword_5_0());
                    			
                    // InternalTripModelLanguageText.g:931:4: ( (lv_Rating_8_0= ruleEInt ) )
                    // InternalTripModelLanguageText.g:932:5: (lv_Rating_8_0= ruleEInt )
                    {
                    // InternalTripModelLanguageText.g:932:5: (lv_Rating_8_0= ruleEInt )
                    // InternalTripModelLanguageText.g:933:6: lv_Rating_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getOtherServiceAccess().getRatingEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Rating_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherServiceRule());
                    						}
                    						set(
                    							current,
                    							"Rating",
                    							lv_Rating_8_0,
                    							"org.TripModelLanguageText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:951:3: (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTripModelLanguageText.g:952:4: otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getOtherServiceAccess().getTypeKeyword_6_0());
                    			
                    // InternalTripModelLanguageText.g:956:4: ( (lv_Type_10_0= ruleEString ) )
                    // InternalTripModelLanguageText.g:957:5: (lv_Type_10_0= ruleEString )
                    {
                    // InternalTripModelLanguageText.g:957:5: (lv_Type_10_0= ruleEString )
                    // InternalTripModelLanguageText.g:958:6: lv_Type_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOtherServiceAccess().getTypeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_Type_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherServiceRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_10_0,
                    							"org.TripModelLanguageText.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getOtherServiceAccess().getLocationKeyword_7());
            		
            // InternalTripModelLanguageText.g:980:3: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:981:4: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:981:4: ( ruleEString )
            // InternalTripModelLanguageText.g:982:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOtherServiceAccess().getLocationLocationCrossReference_8_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getOtherServiceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleOtherService"


    // $ANTLR start "entryRuleTravelService"
    // InternalTripModelLanguageText.g:1004:1: entryRuleTravelService returns [EObject current=null] : iv_ruleTravelService= ruleTravelService EOF ;
    public final EObject entryRuleTravelService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTravelService = null;


        try {
            // InternalTripModelLanguageText.g:1004:54: (iv_ruleTravelService= ruleTravelService EOF )
            // InternalTripModelLanguageText.g:1005:2: iv_ruleTravelService= ruleTravelService EOF
            {
             newCompositeNode(grammarAccess.getTravelServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTravelService=ruleTravelService();

            state._fsp--;

             current =iv_ruleTravelService; 
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
    // $ANTLR end "entryRuleTravelService"


    // $ANTLR start "ruleTravelService"
    // InternalTripModelLanguageText.g:1011:1: ruleTravelService returns [EObject current=null] : (otherlv_0= 'TravelService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'source' ( ( ruleEString ) ) otherlv_13= 'destination' ( ( ruleEString ) ) otherlv_15= '}' ) ;
    public final EObject ruleTravelService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_Cost_4_0 = null;

        AntlrDatatypeRuleToken lv_Duration_6_0 = null;

        AntlrDatatypeRuleToken lv_Rating_8_0 = null;

        AntlrDatatypeRuleToken lv_Type_10_0 = null;



        	enterRule();

        try {
            // InternalTripModelLanguageText.g:1017:2: ( (otherlv_0= 'TravelService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'source' ( ( ruleEString ) ) otherlv_13= 'destination' ( ( ruleEString ) ) otherlv_15= '}' ) )
            // InternalTripModelLanguageText.g:1018:2: (otherlv_0= 'TravelService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'source' ( ( ruleEString ) ) otherlv_13= 'destination' ( ( ruleEString ) ) otherlv_15= '}' )
            {
            // InternalTripModelLanguageText.g:1018:2: (otherlv_0= 'TravelService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'source' ( ( ruleEString ) ) otherlv_13= 'destination' ( ( ruleEString ) ) otherlv_15= '}' )
            // InternalTripModelLanguageText.g:1019:3: otherlv_0= 'TravelService' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )? (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )? (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )? (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )? otherlv_11= 'source' ( ( ruleEString ) ) otherlv_13= 'destination' ( ( ruleEString ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTravelServiceAccess().getTravelServiceKeyword_0());
            		
            // InternalTripModelLanguageText.g:1023:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTripModelLanguageText.g:1024:4: (lv_name_1_0= ruleEString )
            {
            // InternalTripModelLanguageText.g:1024:4: (lv_name_1_0= ruleEString )
            // InternalTripModelLanguageText.g:1025:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTravelServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTravelServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.TripModelLanguageText.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getTravelServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTripModelLanguageText.g:1046:3: (otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTripModelLanguageText.g:1047:4: otherlv_3= 'Cost' ( (lv_Cost_4_0= ruleEFloat ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getTravelServiceAccess().getCostKeyword_3_0());
                    			
                    // InternalTripModelLanguageText.g:1051:4: ( (lv_Cost_4_0= ruleEFloat ) )
                    // InternalTripModelLanguageText.g:1052:5: (lv_Cost_4_0= ruleEFloat )
                    {
                    // InternalTripModelLanguageText.g:1052:5: (lv_Cost_4_0= ruleEFloat )
                    // InternalTripModelLanguageText.g:1053:6: lv_Cost_4_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getTravelServiceAccess().getCostEFloatParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_Cost_4_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTravelServiceRule());
                    						}
                    						set(
                    							current,
                    							"Cost",
                    							lv_Cost_4_0,
                    							"org.TripModelLanguageText.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:1071:3: (otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTripModelLanguageText.g:1072:4: otherlv_5= 'Duration' ( (lv_Duration_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getTravelServiceAccess().getDurationKeyword_4_0());
                    			
                    // InternalTripModelLanguageText.g:1076:4: ( (lv_Duration_6_0= ruleEInt ) )
                    // InternalTripModelLanguageText.g:1077:5: (lv_Duration_6_0= ruleEInt )
                    {
                    // InternalTripModelLanguageText.g:1077:5: (lv_Duration_6_0= ruleEInt )
                    // InternalTripModelLanguageText.g:1078:6: lv_Duration_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTravelServiceAccess().getDurationEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_Duration_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTravelServiceRule());
                    						}
                    						set(
                    							current,
                    							"Duration",
                    							lv_Duration_6_0,
                    							"org.TripModelLanguageText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:1096:3: (otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTripModelLanguageText.g:1097:4: otherlv_7= 'Rating' ( (lv_Rating_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getTravelServiceAccess().getRatingKeyword_5_0());
                    			
                    // InternalTripModelLanguageText.g:1101:4: ( (lv_Rating_8_0= ruleEInt ) )
                    // InternalTripModelLanguageText.g:1102:5: (lv_Rating_8_0= ruleEInt )
                    {
                    // InternalTripModelLanguageText.g:1102:5: (lv_Rating_8_0= ruleEInt )
                    // InternalTripModelLanguageText.g:1103:6: lv_Rating_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTravelServiceAccess().getRatingEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_Rating_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTravelServiceRule());
                    						}
                    						set(
                    							current,
                    							"Rating",
                    							lv_Rating_8_0,
                    							"org.TripModelLanguageText.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTripModelLanguageText.g:1121:3: (otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTripModelLanguageText.g:1122:4: otherlv_9= 'Type' ( (lv_Type_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getTravelServiceAccess().getTypeKeyword_6_0());
                    			
                    // InternalTripModelLanguageText.g:1126:4: ( (lv_Type_10_0= ruleEString ) )
                    // InternalTripModelLanguageText.g:1127:5: (lv_Type_10_0= ruleEString )
                    {
                    // InternalTripModelLanguageText.g:1127:5: (lv_Type_10_0= ruleEString )
                    // InternalTripModelLanguageText.g:1128:6: lv_Type_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTravelServiceAccess().getTypeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_Type_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTravelServiceRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_10_0,
                    							"org.TripModelLanguageText.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getTravelServiceAccess().getSourceKeyword_7());
            		
            // InternalTripModelLanguageText.g:1150:3: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:1151:4: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:1151:4: ( ruleEString )
            // InternalTripModelLanguageText.g:1152:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTravelServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTravelServiceAccess().getSourceLocationCrossReference_8_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getTravelServiceAccess().getDestinationKeyword_9());
            		
            // InternalTripModelLanguageText.g:1170:3: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:1171:4: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:1171:4: ( ruleEString )
            // InternalTripModelLanguageText.g:1172:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTravelServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTravelServiceAccess().getDestinationLocationCrossReference_10_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTravelServiceAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleTravelService"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000601000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001E010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001C010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000001E020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000001C020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000001E200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000001C200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010200000L});

}