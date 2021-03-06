/*
 * generated by Xtext 2.12.0
 */
grammar InternalTripModelLanguageText;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTripModel
entryRuleTripModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTripModelRule()); }
	iv_ruleTripModel=ruleTripModel
	{ $current=$iv_ruleTripModel.current; }
	EOF;

// Rule TripModel
ruleTripModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTripModelAccess().getTripModelAction_0(),
					$current);
			}
		)
		otherlv_1='TripModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getTripModelAccess().getTripModelKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='trip'
			{
				newLeafNode(otherlv_3, grammarAccess.getTripModelAccess().getTripKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_2_0());
					}
					lv_trip_5_0=ruleTrip
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTripModelRule());
						}
						add(
							$current,
							"trip",
							lv_trip_5_0,
							"org.TripModelLanguageText.Trip");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getTripModelAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_3_1_0());
						}
						lv_trip_7_0=ruleTrip
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTripModelRule());
							}
							add(
								$current,
								"trip",
								lv_trip_7_0,
								"org.TripModelLanguageText.Trip");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='location'
			{
				newLeafNode(otherlv_9, grammarAccess.getTripModelAccess().getLocationKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_2_0());
					}
					lv_location_11_0=rulelocation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTripModelRule());
						}
						add(
							$current,
							"location",
							lv_location_11_0,
							"org.TripModelLanguageText.location");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getTripModelAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_3_1_0());
						}
						lv_location_13_0=rulelocation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTripModelRule());
							}
							add(
								$current,
								"location",
								lv_location_13_0,
								"org.TripModelLanguageText.location");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleService
entryRuleService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceRule()); }
	iv_ruleService=ruleService
	{ $current=$iv_ruleService.current; }
	EOF;

// Rule Service
ruleService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0());
		}
		this_Service_Impl_0=ruleService_Impl
		{
			$current = $this_Service_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getServiceAccess().getOtherServiceParserRuleCall_1());
		}
		this_OtherService_1=ruleOtherService
		{
			$current = $this_OtherService_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getServiceAccess().getTravelServiceParserRuleCall_2());
		}
		this_TravelService_2=ruleTravelService
		{
			$current = $this_TravelService_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTrip
entryRuleTrip returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTripRule()); }
	iv_ruleTrip=ruleTrip
	{ $current=$iv_ruleTrip.current; }
	EOF;

// Rule Trip
ruleTrip returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Trip'
		{
			newLeafNode(otherlv_0, grammarAccess.getTripAccess().getTripKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTripAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTripRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.TripModelLanguageText.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='End'
			{
				newLeafNode(otherlv_3, grammarAccess.getTripAccess().getEndKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTripAccess().getEndEDateParserRuleCall_3_1_0());
					}
					lv_End_4_0=ruleEDate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTripRule());
						}
						set(
							$current,
							"End",
							lv_End_4_0,
							"org.TripModelLanguageText.EDate");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='Start'
			{
				newLeafNode(otherlv_5, grammarAccess.getTripAccess().getStartKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTripAccess().getStartEDateParserRuleCall_4_1_0());
					}
					lv_Start_6_0=ruleEDate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTripRule());
						}
						set(
							$current,
							"Start",
							lv_Start_6_0,
							"org.TripModelLanguageText.EDate");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='source'
		{
			newLeafNode(otherlv_7, grammarAccess.getTripAccess().getSourceKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTripRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTripAccess().getSourceLocationCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='destination'
		{
			newLeafNode(otherlv_9, grammarAccess.getTripAccess().getDestinationKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTripRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTripAccess().getDestinationLocationCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11='service'
			{
				newLeafNode(otherlv_11, grammarAccess.getTripAccess().getServiceKeyword_9_0());
			}
			otherlv_12='{'
			{
				newLeafNode(otherlv_12, grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_2_0());
					}
					lv_service_13_0=ruleService
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTripRule());
						}
						add(
							$current,
							"service",
							lv_service_13_0,
							"org.TripModelLanguageText.Service");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getTripAccess().getCommaKeyword_9_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_3_1_0());
						}
						lv_service_15_0=ruleService
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTripRule());
							}
							add(
								$current,
								"service",
								lv_service_15_0,
								"org.TripModelLanguageText.Service");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16='}'
			{
				newLeafNode(otherlv_16, grammarAccess.getTripAccess().getRightCurlyBracketKeyword_9_4());
			}
		)?
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getTripAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRulelocation
entryRulelocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocationRule()); }
	iv_rulelocation=rulelocation
	{ $current=$iv_rulelocation.current; }
	EOF;

// Rule location
rulelocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLocationAccess().getLocationAction_0(),
					$current);
			}
		)
		otherlv_1='location'
		{
			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLocationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.TripModelLanguageText.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleService_Impl
entryRuleService_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getService_ImplRule()); }
	iv_ruleService_Impl=ruleService_Impl
	{ $current=$iv_ruleService_Impl.current; }
	EOF;

// Rule Service_Impl
ruleService_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getService_ImplAccess().getServiceAction_0(),
					$current);
			}
		)
		otherlv_1='Service'
		{
			newLeafNode(otherlv_1, grammarAccess.getService_ImplAccess().getServiceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getService_ImplRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.TripModelLanguageText.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getService_ImplAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='Cost'
			{
				newLeafNode(otherlv_4, grammarAccess.getService_ImplAccess().getCostKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getService_ImplAccess().getCostEFloatParserRuleCall_4_1_0());
					}
					lv_Cost_5_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getService_ImplRule());
						}
						set(
							$current,
							"Cost",
							lv_Cost_5_0,
							"org.TripModelLanguageText.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='Duration'
			{
				newLeafNode(otherlv_6, grammarAccess.getService_ImplAccess().getDurationKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getService_ImplAccess().getDurationEIntParserRuleCall_5_1_0());
					}
					lv_Duration_7_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getService_ImplRule());
						}
						set(
							$current,
							"Duration",
							lv_Duration_7_0,
							"org.TripModelLanguageText.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='Rating'
			{
				newLeafNode(otherlv_8, grammarAccess.getService_ImplAccess().getRatingKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getService_ImplAccess().getRatingEIntParserRuleCall_6_1_0());
					}
					lv_Rating_9_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getService_ImplRule());
						}
						set(
							$current,
							"Rating",
							lv_Rating_9_0,
							"org.TripModelLanguageText.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_10='Type'
			{
				newLeafNode(otherlv_10, grammarAccess.getService_ImplAccess().getTypeKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getService_ImplAccess().getTypeEStringParserRuleCall_7_1_0());
					}
					lv_Type_11_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getService_ImplRule());
						}
						set(
							$current,
							"Type",
							lv_Type_11_0,
							"org.TripModelLanguageText.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getService_ImplAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEDate
entryRuleEDate returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDateRule()); }
	iv_ruleEDate=ruleEDate
	{ $current=$iv_ruleEDate.current.getText(); }
	EOF;

// Rule EDate
ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_DATE_0=RULE_DATE
	{
		$current.merge(this_DATE_0);
	}
	{
		newLeafNode(this_DATE_0, grammarAccess.getEDateAccess().getDATETerminalRuleCall());
	}
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEFloat
entryRuleEFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEFloatRule()); }
	iv_ruleEFloat=ruleEFloat
	{ $current=$iv_ruleEFloat.current.getText(); }
	EOF;

// Rule EFloat
ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleOtherService
entryRuleOtherService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOtherServiceRule()); }
	iv_ruleOtherService=ruleOtherService
	{ $current=$iv_ruleOtherService.current; }
	EOF;

// Rule OtherService
ruleOtherService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OtherService'
		{
			newLeafNode(otherlv_0, grammarAccess.getOtherServiceAccess().getOtherServiceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOtherServiceAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOtherServiceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.TripModelLanguageText.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getOtherServiceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='Cost'
			{
				newLeafNode(otherlv_3, grammarAccess.getOtherServiceAccess().getCostKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOtherServiceAccess().getCostEFloatParserRuleCall_3_1_0());
					}
					lv_Cost_4_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherServiceRule());
						}
						set(
							$current,
							"Cost",
							lv_Cost_4_0,
							"org.TripModelLanguageText.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='Duration'
			{
				newLeafNode(otherlv_5, grammarAccess.getOtherServiceAccess().getDurationKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOtherServiceAccess().getDurationEIntParserRuleCall_4_1_0());
					}
					lv_Duration_6_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherServiceRule());
						}
						set(
							$current,
							"Duration",
							lv_Duration_6_0,
							"org.TripModelLanguageText.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='Rating'
			{
				newLeafNode(otherlv_7, grammarAccess.getOtherServiceAccess().getRatingKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOtherServiceAccess().getRatingEIntParserRuleCall_5_1_0());
					}
					lv_Rating_8_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherServiceRule());
						}
						set(
							$current,
							"Rating",
							lv_Rating_8_0,
							"org.TripModelLanguageText.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='Type'
			{
				newLeafNode(otherlv_9, grammarAccess.getOtherServiceAccess().getTypeKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOtherServiceAccess().getTypeEStringParserRuleCall_6_1_0());
					}
					lv_Type_10_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherServiceRule());
						}
						set(
							$current,
							"Type",
							lv_Type_10_0,
							"org.TripModelLanguageText.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_11='location'
		{
			newLeafNode(otherlv_11, grammarAccess.getOtherServiceAccess().getLocationKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOtherServiceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOtherServiceAccess().getLocationLocationCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getOtherServiceAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleTravelService
entryRuleTravelService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTravelServiceRule()); }
	iv_ruleTravelService=ruleTravelService
	{ $current=$iv_ruleTravelService.current; }
	EOF;

// Rule TravelService
ruleTravelService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TravelService'
		{
			newLeafNode(otherlv_0, grammarAccess.getTravelServiceAccess().getTravelServiceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTravelServiceAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTravelServiceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.TripModelLanguageText.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTravelServiceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='Cost'
			{
				newLeafNode(otherlv_3, grammarAccess.getTravelServiceAccess().getCostKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTravelServiceAccess().getCostEFloatParserRuleCall_3_1_0());
					}
					lv_Cost_4_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTravelServiceRule());
						}
						set(
							$current,
							"Cost",
							lv_Cost_4_0,
							"org.TripModelLanguageText.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='Duration'
			{
				newLeafNode(otherlv_5, grammarAccess.getTravelServiceAccess().getDurationKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTravelServiceAccess().getDurationEIntParserRuleCall_4_1_0());
					}
					lv_Duration_6_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTravelServiceRule());
						}
						set(
							$current,
							"Duration",
							lv_Duration_6_0,
							"org.TripModelLanguageText.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='Rating'
			{
				newLeafNode(otherlv_7, grammarAccess.getTravelServiceAccess().getRatingKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTravelServiceAccess().getRatingEIntParserRuleCall_5_1_0());
					}
					lv_Rating_8_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTravelServiceRule());
						}
						set(
							$current,
							"Rating",
							lv_Rating_8_0,
							"org.TripModelLanguageText.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='Type'
			{
				newLeafNode(otherlv_9, grammarAccess.getTravelServiceAccess().getTypeKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTravelServiceAccess().getTypeEStringParserRuleCall_6_1_0());
					}
					lv_Type_10_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTravelServiceRule());
						}
						set(
							$current,
							"Type",
							lv_Type_10_0,
							"org.TripModelLanguageText.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_11='source'
		{
			newLeafNode(otherlv_11, grammarAccess.getTravelServiceAccess().getSourceKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTravelServiceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTravelServiceAccess().getSourceLocationCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='destination'
		{
			newLeafNode(otherlv_13, grammarAccess.getTravelServiceAccess().getDestinationKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTravelServiceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTravelServiceAccess().getDestinationLocationCrossReference_10_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getTravelServiceAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

RULE_DATE : ('0'..'9')* '-' ('0'..'9')* '-' ('0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
