package org.ide.contentassist.antlr.internal;

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
import org.services.TripModelLanguageTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTripModelLanguageTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'TripModel'", "'{'", "'}'", "'trip'", "','", "'location'", "'Trip'", "'source'", "'destination'", "'End'", "'Start'", "'service'", "'Service'", "'Cost'", "'Duration'", "'Rating'", "'Type'", "'-'", "'.'", "'OtherService'", "'TravelService'"
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

    	public void setGrammarAccess(TripModelLanguageTextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTripModel"
    // InternalTripModelLanguageText.g:53:1: entryRuleTripModel : ruleTripModel EOF ;
    public final void entryRuleTripModel() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:54:1: ( ruleTripModel EOF )
            // InternalTripModelLanguageText.g:55:1: ruleTripModel EOF
            {
             before(grammarAccess.getTripModelRule()); 
            pushFollow(FOLLOW_1);
            ruleTripModel();

            state._fsp--;

             after(grammarAccess.getTripModelRule()); 
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
    // $ANTLR end "entryRuleTripModel"


    // $ANTLR start "ruleTripModel"
    // InternalTripModelLanguageText.g:62:1: ruleTripModel : ( ( rule__TripModel__Group__0 ) ) ;
    public final void ruleTripModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:66:2: ( ( ( rule__TripModel__Group__0 ) ) )
            // InternalTripModelLanguageText.g:67:2: ( ( rule__TripModel__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:67:2: ( ( rule__TripModel__Group__0 ) )
            // InternalTripModelLanguageText.g:68:3: ( rule__TripModel__Group__0 )
            {
             before(grammarAccess.getTripModelAccess().getGroup()); 
            // InternalTripModelLanguageText.g:69:3: ( rule__TripModel__Group__0 )
            // InternalTripModelLanguageText.g:69:4: rule__TripModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTripModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTripModel"


    // $ANTLR start "entryRuleService"
    // InternalTripModelLanguageText.g:78:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:79:1: ( ruleService EOF )
            // InternalTripModelLanguageText.g:80:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalTripModelLanguageText.g:87:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:91:2: ( ( ( rule__Service__Alternatives ) ) )
            // InternalTripModelLanguageText.g:92:2: ( ( rule__Service__Alternatives ) )
            {
            // InternalTripModelLanguageText.g:92:2: ( ( rule__Service__Alternatives ) )
            // InternalTripModelLanguageText.g:93:3: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // InternalTripModelLanguageText.g:94:3: ( rule__Service__Alternatives )
            // InternalTripModelLanguageText.g:94:4: rule__Service__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Service__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleTrip"
    // InternalTripModelLanguageText.g:103:1: entryRuleTrip : ruleTrip EOF ;
    public final void entryRuleTrip() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:104:1: ( ruleTrip EOF )
            // InternalTripModelLanguageText.g:105:1: ruleTrip EOF
            {
             before(grammarAccess.getTripRule()); 
            pushFollow(FOLLOW_1);
            ruleTrip();

            state._fsp--;

             after(grammarAccess.getTripRule()); 
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
    // $ANTLR end "entryRuleTrip"


    // $ANTLR start "ruleTrip"
    // InternalTripModelLanguageText.g:112:1: ruleTrip : ( ( rule__Trip__Group__0 ) ) ;
    public final void ruleTrip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:116:2: ( ( ( rule__Trip__Group__0 ) ) )
            // InternalTripModelLanguageText.g:117:2: ( ( rule__Trip__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:117:2: ( ( rule__Trip__Group__0 ) )
            // InternalTripModelLanguageText.g:118:3: ( rule__Trip__Group__0 )
            {
             before(grammarAccess.getTripAccess().getGroup()); 
            // InternalTripModelLanguageText.g:119:3: ( rule__Trip__Group__0 )
            // InternalTripModelLanguageText.g:119:4: rule__Trip__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trip__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrip"


    // $ANTLR start "entryRulelocation"
    // InternalTripModelLanguageText.g:128:1: entryRulelocation : rulelocation EOF ;
    public final void entryRulelocation() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:129:1: ( rulelocation EOF )
            // InternalTripModelLanguageText.g:130:1: rulelocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            rulelocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
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
    // $ANTLR end "entryRulelocation"


    // $ANTLR start "rulelocation"
    // InternalTripModelLanguageText.g:137:1: rulelocation : ( ( rule__Location__Group__0 ) ) ;
    public final void rulelocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:141:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalTripModelLanguageText.g:142:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:142:2: ( ( rule__Location__Group__0 ) )
            // InternalTripModelLanguageText.g:143:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalTripModelLanguageText.g:144:3: ( rule__Location__Group__0 )
            // InternalTripModelLanguageText.g:144:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelocation"


    // $ANTLR start "entryRuleService_Impl"
    // InternalTripModelLanguageText.g:153:1: entryRuleService_Impl : ruleService_Impl EOF ;
    public final void entryRuleService_Impl() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:154:1: ( ruleService_Impl EOF )
            // InternalTripModelLanguageText.g:155:1: ruleService_Impl EOF
            {
             before(grammarAccess.getService_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleService_Impl();

            state._fsp--;

             after(grammarAccess.getService_ImplRule()); 
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
    // $ANTLR end "entryRuleService_Impl"


    // $ANTLR start "ruleService_Impl"
    // InternalTripModelLanguageText.g:162:1: ruleService_Impl : ( ( rule__Service_Impl__Group__0 ) ) ;
    public final void ruleService_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:166:2: ( ( ( rule__Service_Impl__Group__0 ) ) )
            // InternalTripModelLanguageText.g:167:2: ( ( rule__Service_Impl__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:167:2: ( ( rule__Service_Impl__Group__0 ) )
            // InternalTripModelLanguageText.g:168:3: ( rule__Service_Impl__Group__0 )
            {
             before(grammarAccess.getService_ImplAccess().getGroup()); 
            // InternalTripModelLanguageText.g:169:3: ( rule__Service_Impl__Group__0 )
            // InternalTripModelLanguageText.g:169:4: rule__Service_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService_Impl"


    // $ANTLR start "entryRuleEDate"
    // InternalTripModelLanguageText.g:178:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:179:1: ( ruleEDate EOF )
            // InternalTripModelLanguageText.g:180:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalTripModelLanguageText.g:187:1: ruleEDate : ( RULE_DATE ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:191:2: ( ( RULE_DATE ) )
            // InternalTripModelLanguageText.g:192:2: ( RULE_DATE )
            {
            // InternalTripModelLanguageText.g:192:2: ( RULE_DATE )
            // InternalTripModelLanguageText.g:193:3: RULE_DATE
            {
             before(grammarAccess.getEDateAccess().getDATETerminalRuleCall()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getDATETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEString"
    // InternalTripModelLanguageText.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:204:1: ( ruleEString EOF )
            // InternalTripModelLanguageText.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTripModelLanguageText.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTripModelLanguageText.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTripModelLanguageText.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalTripModelLanguageText.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTripModelLanguageText.g:219:3: ( rule__EString__Alternatives )
            // InternalTripModelLanguageText.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // InternalTripModelLanguageText.g:228:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:229:1: ( ruleEFloat EOF )
            // InternalTripModelLanguageText.g:230:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalTripModelLanguageText.g:237:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:241:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalTripModelLanguageText.g:242:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:242:2: ( ( rule__EFloat__Group__0 ) )
            // InternalTripModelLanguageText.g:243:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalTripModelLanguageText.g:244:3: ( rule__EFloat__Group__0 )
            // InternalTripModelLanguageText.g:244:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // InternalTripModelLanguageText.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:254:1: ( ruleEInt EOF )
            // InternalTripModelLanguageText.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTripModelLanguageText.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTripModelLanguageText.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalTripModelLanguageText.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTripModelLanguageText.g:269:3: ( rule__EInt__Group__0 )
            // InternalTripModelLanguageText.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleOtherService"
    // InternalTripModelLanguageText.g:278:1: entryRuleOtherService : ruleOtherService EOF ;
    public final void entryRuleOtherService() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:279:1: ( ruleOtherService EOF )
            // InternalTripModelLanguageText.g:280:1: ruleOtherService EOF
            {
             before(grammarAccess.getOtherServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleOtherService();

            state._fsp--;

             after(grammarAccess.getOtherServiceRule()); 
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
    // $ANTLR end "entryRuleOtherService"


    // $ANTLR start "ruleOtherService"
    // InternalTripModelLanguageText.g:287:1: ruleOtherService : ( ( rule__OtherService__Group__0 ) ) ;
    public final void ruleOtherService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:291:2: ( ( ( rule__OtherService__Group__0 ) ) )
            // InternalTripModelLanguageText.g:292:2: ( ( rule__OtherService__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:292:2: ( ( rule__OtherService__Group__0 ) )
            // InternalTripModelLanguageText.g:293:3: ( rule__OtherService__Group__0 )
            {
             before(grammarAccess.getOtherServiceAccess().getGroup()); 
            // InternalTripModelLanguageText.g:294:3: ( rule__OtherService__Group__0 )
            // InternalTripModelLanguageText.g:294:4: rule__OtherService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOtherServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOtherService"


    // $ANTLR start "entryRuleTravelService"
    // InternalTripModelLanguageText.g:303:1: entryRuleTravelService : ruleTravelService EOF ;
    public final void entryRuleTravelService() throws RecognitionException {
        try {
            // InternalTripModelLanguageText.g:304:1: ( ruleTravelService EOF )
            // InternalTripModelLanguageText.g:305:1: ruleTravelService EOF
            {
             before(grammarAccess.getTravelServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleTravelService();

            state._fsp--;

             after(grammarAccess.getTravelServiceRule()); 
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
    // $ANTLR end "entryRuleTravelService"


    // $ANTLR start "ruleTravelService"
    // InternalTripModelLanguageText.g:312:1: ruleTravelService : ( ( rule__TravelService__Group__0 ) ) ;
    public final void ruleTravelService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:316:2: ( ( ( rule__TravelService__Group__0 ) ) )
            // InternalTripModelLanguageText.g:317:2: ( ( rule__TravelService__Group__0 ) )
            {
            // InternalTripModelLanguageText.g:317:2: ( ( rule__TravelService__Group__0 ) )
            // InternalTripModelLanguageText.g:318:3: ( rule__TravelService__Group__0 )
            {
             before(grammarAccess.getTravelServiceAccess().getGroup()); 
            // InternalTripModelLanguageText.g:319:3: ( rule__TravelService__Group__0 )
            // InternalTripModelLanguageText.g:319:4: rule__TravelService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTravelService"


    // $ANTLR start "rule__Service__Alternatives"
    // InternalTripModelLanguageText.g:327:1: rule__Service__Alternatives : ( ( ruleService_Impl ) | ( ruleOtherService ) | ( ruleTravelService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:331:1: ( ( ruleService_Impl ) | ( ruleOtherService ) | ( ruleTravelService ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTripModelLanguageText.g:332:2: ( ruleService_Impl )
                    {
                    // InternalTripModelLanguageText.g:332:2: ( ruleService_Impl )
                    // InternalTripModelLanguageText.g:333:3: ruleService_Impl
                    {
                     before(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleService_Impl();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTripModelLanguageText.g:338:2: ( ruleOtherService )
                    {
                    // InternalTripModelLanguageText.g:338:2: ( ruleOtherService )
                    // InternalTripModelLanguageText.g:339:3: ruleOtherService
                    {
                     before(grammarAccess.getServiceAccess().getOtherServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOtherService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getOtherServiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTripModelLanguageText.g:344:2: ( ruleTravelService )
                    {
                    // InternalTripModelLanguageText.g:344:2: ( ruleTravelService )
                    // InternalTripModelLanguageText.g:345:3: ruleTravelService
                    {
                     before(grammarAccess.getServiceAccess().getTravelServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTravelService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getTravelServiceParserRuleCall_2()); 

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
    // $ANTLR end "rule__Service__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTripModelLanguageText.g:354:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:358:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTripModelLanguageText.g:359:2: ( RULE_STRING )
                    {
                    // InternalTripModelLanguageText.g:359:2: ( RULE_STRING )
                    // InternalTripModelLanguageText.g:360:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTripModelLanguageText.g:365:2: ( RULE_ID )
                    {
                    // InternalTripModelLanguageText.g:365:2: ( RULE_ID )
                    // InternalTripModelLanguageText.g:366:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalTripModelLanguageText.g:375:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:379:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTripModelLanguageText.g:380:2: ( 'E' )
                    {
                    // InternalTripModelLanguageText.g:380:2: ( 'E' )
                    // InternalTripModelLanguageText.g:381:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTripModelLanguageText.g:386:2: ( 'e' )
                    {
                    // InternalTripModelLanguageText.g:386:2: ( 'e' )
                    // InternalTripModelLanguageText.g:387:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__TripModel__Group__0"
    // InternalTripModelLanguageText.g:396:1: rule__TripModel__Group__0 : rule__TripModel__Group__0__Impl rule__TripModel__Group__1 ;
    public final void rule__TripModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:400:1: ( rule__TripModel__Group__0__Impl rule__TripModel__Group__1 )
            // InternalTripModelLanguageText.g:401:2: rule__TripModel__Group__0__Impl rule__TripModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TripModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__0"


    // $ANTLR start "rule__TripModel__Group__0__Impl"
    // InternalTripModelLanguageText.g:408:1: rule__TripModel__Group__0__Impl : ( () ) ;
    public final void rule__TripModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:412:1: ( ( () ) )
            // InternalTripModelLanguageText.g:413:1: ( () )
            {
            // InternalTripModelLanguageText.g:413:1: ( () )
            // InternalTripModelLanguageText.g:414:2: ()
            {
             before(grammarAccess.getTripModelAccess().getTripModelAction_0()); 
            // InternalTripModelLanguageText.g:415:2: ()
            // InternalTripModelLanguageText.g:415:3: 
            {
            }

             after(grammarAccess.getTripModelAccess().getTripModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__0__Impl"


    // $ANTLR start "rule__TripModel__Group__1"
    // InternalTripModelLanguageText.g:423:1: rule__TripModel__Group__1 : rule__TripModel__Group__1__Impl rule__TripModel__Group__2 ;
    public final void rule__TripModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:427:1: ( rule__TripModel__Group__1__Impl rule__TripModel__Group__2 )
            // InternalTripModelLanguageText.g:428:2: rule__TripModel__Group__1__Impl rule__TripModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TripModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__1"


    // $ANTLR start "rule__TripModel__Group__1__Impl"
    // InternalTripModelLanguageText.g:435:1: rule__TripModel__Group__1__Impl : ( 'TripModel' ) ;
    public final void rule__TripModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:439:1: ( ( 'TripModel' ) )
            // InternalTripModelLanguageText.g:440:1: ( 'TripModel' )
            {
            // InternalTripModelLanguageText.g:440:1: ( 'TripModel' )
            // InternalTripModelLanguageText.g:441:2: 'TripModel'
            {
             before(grammarAccess.getTripModelAccess().getTripModelKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getTripModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__1__Impl"


    // $ANTLR start "rule__TripModel__Group__2"
    // InternalTripModelLanguageText.g:450:1: rule__TripModel__Group__2 : rule__TripModel__Group__2__Impl rule__TripModel__Group__3 ;
    public final void rule__TripModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:454:1: ( rule__TripModel__Group__2__Impl rule__TripModel__Group__3 )
            // InternalTripModelLanguageText.g:455:2: rule__TripModel__Group__2__Impl rule__TripModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TripModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__2"


    // $ANTLR start "rule__TripModel__Group__2__Impl"
    // InternalTripModelLanguageText.g:462:1: rule__TripModel__Group__2__Impl : ( '{' ) ;
    public final void rule__TripModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:466:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:467:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:467:1: ( '{' )
            // InternalTripModelLanguageText.g:468:2: '{'
            {
             before(grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__2__Impl"


    // $ANTLR start "rule__TripModel__Group__3"
    // InternalTripModelLanguageText.g:477:1: rule__TripModel__Group__3 : rule__TripModel__Group__3__Impl rule__TripModel__Group__4 ;
    public final void rule__TripModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:481:1: ( rule__TripModel__Group__3__Impl rule__TripModel__Group__4 )
            // InternalTripModelLanguageText.g:482:2: rule__TripModel__Group__3__Impl rule__TripModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TripModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__3"


    // $ANTLR start "rule__TripModel__Group__3__Impl"
    // InternalTripModelLanguageText.g:489:1: rule__TripModel__Group__3__Impl : ( ( rule__TripModel__Group_3__0 )? ) ;
    public final void rule__TripModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:493:1: ( ( ( rule__TripModel__Group_3__0 )? ) )
            // InternalTripModelLanguageText.g:494:1: ( ( rule__TripModel__Group_3__0 )? )
            {
            // InternalTripModelLanguageText.g:494:1: ( ( rule__TripModel__Group_3__0 )? )
            // InternalTripModelLanguageText.g:495:2: ( rule__TripModel__Group_3__0 )?
            {
             before(grammarAccess.getTripModelAccess().getGroup_3()); 
            // InternalTripModelLanguageText.g:496:2: ( rule__TripModel__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTripModelLanguageText.g:496:3: rule__TripModel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TripModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTripModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__3__Impl"


    // $ANTLR start "rule__TripModel__Group__4"
    // InternalTripModelLanguageText.g:504:1: rule__TripModel__Group__4 : rule__TripModel__Group__4__Impl rule__TripModel__Group__5 ;
    public final void rule__TripModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:508:1: ( rule__TripModel__Group__4__Impl rule__TripModel__Group__5 )
            // InternalTripModelLanguageText.g:509:2: rule__TripModel__Group__4__Impl rule__TripModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__TripModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__4"


    // $ANTLR start "rule__TripModel__Group__4__Impl"
    // InternalTripModelLanguageText.g:516:1: rule__TripModel__Group__4__Impl : ( ( rule__TripModel__Group_4__0 )? ) ;
    public final void rule__TripModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:520:1: ( ( ( rule__TripModel__Group_4__0 )? ) )
            // InternalTripModelLanguageText.g:521:1: ( ( rule__TripModel__Group_4__0 )? )
            {
            // InternalTripModelLanguageText.g:521:1: ( ( rule__TripModel__Group_4__0 )? )
            // InternalTripModelLanguageText.g:522:2: ( rule__TripModel__Group_4__0 )?
            {
             before(grammarAccess.getTripModelAccess().getGroup_4()); 
            // InternalTripModelLanguageText.g:523:2: ( rule__TripModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTripModelLanguageText.g:523:3: rule__TripModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TripModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTripModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__4__Impl"


    // $ANTLR start "rule__TripModel__Group__5"
    // InternalTripModelLanguageText.g:531:1: rule__TripModel__Group__5 : rule__TripModel__Group__5__Impl ;
    public final void rule__TripModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:535:1: ( rule__TripModel__Group__5__Impl )
            // InternalTripModelLanguageText.g:536:2: rule__TripModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__5"


    // $ANTLR start "rule__TripModel__Group__5__Impl"
    // InternalTripModelLanguageText.g:542:1: rule__TripModel__Group__5__Impl : ( '}' ) ;
    public final void rule__TripModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:546:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:547:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:547:1: ( '}' )
            // InternalTripModelLanguageText.g:548:2: '}'
            {
             before(grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group__5__Impl"


    // $ANTLR start "rule__TripModel__Group_3__0"
    // InternalTripModelLanguageText.g:558:1: rule__TripModel__Group_3__0 : rule__TripModel__Group_3__0__Impl rule__TripModel__Group_3__1 ;
    public final void rule__TripModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:562:1: ( rule__TripModel__Group_3__0__Impl rule__TripModel__Group_3__1 )
            // InternalTripModelLanguageText.g:563:2: rule__TripModel__Group_3__0__Impl rule__TripModel__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TripModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__0"


    // $ANTLR start "rule__TripModel__Group_3__0__Impl"
    // InternalTripModelLanguageText.g:570:1: rule__TripModel__Group_3__0__Impl : ( 'trip' ) ;
    public final void rule__TripModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:574:1: ( ( 'trip' ) )
            // InternalTripModelLanguageText.g:575:1: ( 'trip' )
            {
            // InternalTripModelLanguageText.g:575:1: ( 'trip' )
            // InternalTripModelLanguageText.g:576:2: 'trip'
            {
             before(grammarAccess.getTripModelAccess().getTripKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getTripKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__0__Impl"


    // $ANTLR start "rule__TripModel__Group_3__1"
    // InternalTripModelLanguageText.g:585:1: rule__TripModel__Group_3__1 : rule__TripModel__Group_3__1__Impl rule__TripModel__Group_3__2 ;
    public final void rule__TripModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:589:1: ( rule__TripModel__Group_3__1__Impl rule__TripModel__Group_3__2 )
            // InternalTripModelLanguageText.g:590:2: rule__TripModel__Group_3__1__Impl rule__TripModel__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__TripModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__1"


    // $ANTLR start "rule__TripModel__Group_3__1__Impl"
    // InternalTripModelLanguageText.g:597:1: rule__TripModel__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TripModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:601:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:602:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:602:1: ( '{' )
            // InternalTripModelLanguageText.g:603:2: '{'
            {
             before(grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__1__Impl"


    // $ANTLR start "rule__TripModel__Group_3__2"
    // InternalTripModelLanguageText.g:612:1: rule__TripModel__Group_3__2 : rule__TripModel__Group_3__2__Impl rule__TripModel__Group_3__3 ;
    public final void rule__TripModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:616:1: ( rule__TripModel__Group_3__2__Impl rule__TripModel__Group_3__3 )
            // InternalTripModelLanguageText.g:617:2: rule__TripModel__Group_3__2__Impl rule__TripModel__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__TripModel__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__2"


    // $ANTLR start "rule__TripModel__Group_3__2__Impl"
    // InternalTripModelLanguageText.g:624:1: rule__TripModel__Group_3__2__Impl : ( ( rule__TripModel__TripAssignment_3_2 ) ) ;
    public final void rule__TripModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:628:1: ( ( ( rule__TripModel__TripAssignment_3_2 ) ) )
            // InternalTripModelLanguageText.g:629:1: ( ( rule__TripModel__TripAssignment_3_2 ) )
            {
            // InternalTripModelLanguageText.g:629:1: ( ( rule__TripModel__TripAssignment_3_2 ) )
            // InternalTripModelLanguageText.g:630:2: ( rule__TripModel__TripAssignment_3_2 )
            {
             before(grammarAccess.getTripModelAccess().getTripAssignment_3_2()); 
            // InternalTripModelLanguageText.g:631:2: ( rule__TripModel__TripAssignment_3_2 )
            // InternalTripModelLanguageText.g:631:3: rule__TripModel__TripAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__TripAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTripModelAccess().getTripAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__2__Impl"


    // $ANTLR start "rule__TripModel__Group_3__3"
    // InternalTripModelLanguageText.g:639:1: rule__TripModel__Group_3__3 : rule__TripModel__Group_3__3__Impl rule__TripModel__Group_3__4 ;
    public final void rule__TripModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:643:1: ( rule__TripModel__Group_3__3__Impl rule__TripModel__Group_3__4 )
            // InternalTripModelLanguageText.g:644:2: rule__TripModel__Group_3__3__Impl rule__TripModel__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__TripModel__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__3"


    // $ANTLR start "rule__TripModel__Group_3__3__Impl"
    // InternalTripModelLanguageText.g:651:1: rule__TripModel__Group_3__3__Impl : ( ( rule__TripModel__Group_3_3__0 )* ) ;
    public final void rule__TripModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:655:1: ( ( ( rule__TripModel__Group_3_3__0 )* ) )
            // InternalTripModelLanguageText.g:656:1: ( ( rule__TripModel__Group_3_3__0 )* )
            {
            // InternalTripModelLanguageText.g:656:1: ( ( rule__TripModel__Group_3_3__0 )* )
            // InternalTripModelLanguageText.g:657:2: ( rule__TripModel__Group_3_3__0 )*
            {
             before(grammarAccess.getTripModelAccess().getGroup_3_3()); 
            // InternalTripModelLanguageText.g:658:2: ( rule__TripModel__Group_3_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:658:3: rule__TripModel__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TripModel__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTripModelAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__3__Impl"


    // $ANTLR start "rule__TripModel__Group_3__4"
    // InternalTripModelLanguageText.g:666:1: rule__TripModel__Group_3__4 : rule__TripModel__Group_3__4__Impl ;
    public final void rule__TripModel__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:670:1: ( rule__TripModel__Group_3__4__Impl )
            // InternalTripModelLanguageText.g:671:2: rule__TripModel__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__4"


    // $ANTLR start "rule__TripModel__Group_3__4__Impl"
    // InternalTripModelLanguageText.g:677:1: rule__TripModel__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TripModel__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:681:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:682:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:682:1: ( '}' )
            // InternalTripModelLanguageText.g:683:2: '}'
            {
             before(grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3__4__Impl"


    // $ANTLR start "rule__TripModel__Group_3_3__0"
    // InternalTripModelLanguageText.g:693:1: rule__TripModel__Group_3_3__0 : rule__TripModel__Group_3_3__0__Impl rule__TripModel__Group_3_3__1 ;
    public final void rule__TripModel__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:697:1: ( rule__TripModel__Group_3_3__0__Impl rule__TripModel__Group_3_3__1 )
            // InternalTripModelLanguageText.g:698:2: rule__TripModel__Group_3_3__0__Impl rule__TripModel__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__TripModel__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3_3__0"


    // $ANTLR start "rule__TripModel__Group_3_3__0__Impl"
    // InternalTripModelLanguageText.g:705:1: rule__TripModel__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TripModel__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:709:1: ( ( ',' ) )
            // InternalTripModelLanguageText.g:710:1: ( ',' )
            {
            // InternalTripModelLanguageText.g:710:1: ( ',' )
            // InternalTripModelLanguageText.g:711:2: ','
            {
             before(grammarAccess.getTripModelAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3_3__0__Impl"


    // $ANTLR start "rule__TripModel__Group_3_3__1"
    // InternalTripModelLanguageText.g:720:1: rule__TripModel__Group_3_3__1 : rule__TripModel__Group_3_3__1__Impl ;
    public final void rule__TripModel__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:724:1: ( rule__TripModel__Group_3_3__1__Impl )
            // InternalTripModelLanguageText.g:725:2: rule__TripModel__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3_3__1"


    // $ANTLR start "rule__TripModel__Group_3_3__1__Impl"
    // InternalTripModelLanguageText.g:731:1: rule__TripModel__Group_3_3__1__Impl : ( ( rule__TripModel__TripAssignment_3_3_1 ) ) ;
    public final void rule__TripModel__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:735:1: ( ( ( rule__TripModel__TripAssignment_3_3_1 ) ) )
            // InternalTripModelLanguageText.g:736:1: ( ( rule__TripModel__TripAssignment_3_3_1 ) )
            {
            // InternalTripModelLanguageText.g:736:1: ( ( rule__TripModel__TripAssignment_3_3_1 ) )
            // InternalTripModelLanguageText.g:737:2: ( rule__TripModel__TripAssignment_3_3_1 )
            {
             before(grammarAccess.getTripModelAccess().getTripAssignment_3_3_1()); 
            // InternalTripModelLanguageText.g:738:2: ( rule__TripModel__TripAssignment_3_3_1 )
            // InternalTripModelLanguageText.g:738:3: rule__TripModel__TripAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__TripAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTripModelAccess().getTripAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_3_3__1__Impl"


    // $ANTLR start "rule__TripModel__Group_4__0"
    // InternalTripModelLanguageText.g:747:1: rule__TripModel__Group_4__0 : rule__TripModel__Group_4__0__Impl rule__TripModel__Group_4__1 ;
    public final void rule__TripModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:751:1: ( rule__TripModel__Group_4__0__Impl rule__TripModel__Group_4__1 )
            // InternalTripModelLanguageText.g:752:2: rule__TripModel__Group_4__0__Impl rule__TripModel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__TripModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__0"


    // $ANTLR start "rule__TripModel__Group_4__0__Impl"
    // InternalTripModelLanguageText.g:759:1: rule__TripModel__Group_4__0__Impl : ( 'location' ) ;
    public final void rule__TripModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:763:1: ( ( 'location' ) )
            // InternalTripModelLanguageText.g:764:1: ( 'location' )
            {
            // InternalTripModelLanguageText.g:764:1: ( 'location' )
            // InternalTripModelLanguageText.g:765:2: 'location'
            {
             before(grammarAccess.getTripModelAccess().getLocationKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getLocationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__0__Impl"


    // $ANTLR start "rule__TripModel__Group_4__1"
    // InternalTripModelLanguageText.g:774:1: rule__TripModel__Group_4__1 : rule__TripModel__Group_4__1__Impl rule__TripModel__Group_4__2 ;
    public final void rule__TripModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:778:1: ( rule__TripModel__Group_4__1__Impl rule__TripModel__Group_4__2 )
            // InternalTripModelLanguageText.g:779:2: rule__TripModel__Group_4__1__Impl rule__TripModel__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__TripModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__1"


    // $ANTLR start "rule__TripModel__Group_4__1__Impl"
    // InternalTripModelLanguageText.g:786:1: rule__TripModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__TripModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:790:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:791:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:791:1: ( '{' )
            // InternalTripModelLanguageText.g:792:2: '{'
            {
             before(grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__1__Impl"


    // $ANTLR start "rule__TripModel__Group_4__2"
    // InternalTripModelLanguageText.g:801:1: rule__TripModel__Group_4__2 : rule__TripModel__Group_4__2__Impl rule__TripModel__Group_4__3 ;
    public final void rule__TripModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:805:1: ( rule__TripModel__Group_4__2__Impl rule__TripModel__Group_4__3 )
            // InternalTripModelLanguageText.g:806:2: rule__TripModel__Group_4__2__Impl rule__TripModel__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__TripModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__2"


    // $ANTLR start "rule__TripModel__Group_4__2__Impl"
    // InternalTripModelLanguageText.g:813:1: rule__TripModel__Group_4__2__Impl : ( ( rule__TripModel__LocationAssignment_4_2 ) ) ;
    public final void rule__TripModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:817:1: ( ( ( rule__TripModel__LocationAssignment_4_2 ) ) )
            // InternalTripModelLanguageText.g:818:1: ( ( rule__TripModel__LocationAssignment_4_2 ) )
            {
            // InternalTripModelLanguageText.g:818:1: ( ( rule__TripModel__LocationAssignment_4_2 ) )
            // InternalTripModelLanguageText.g:819:2: ( rule__TripModel__LocationAssignment_4_2 )
            {
             before(grammarAccess.getTripModelAccess().getLocationAssignment_4_2()); 
            // InternalTripModelLanguageText.g:820:2: ( rule__TripModel__LocationAssignment_4_2 )
            // InternalTripModelLanguageText.g:820:3: rule__TripModel__LocationAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__LocationAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTripModelAccess().getLocationAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__2__Impl"


    // $ANTLR start "rule__TripModel__Group_4__3"
    // InternalTripModelLanguageText.g:828:1: rule__TripModel__Group_4__3 : rule__TripModel__Group_4__3__Impl rule__TripModel__Group_4__4 ;
    public final void rule__TripModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:832:1: ( rule__TripModel__Group_4__3__Impl rule__TripModel__Group_4__4 )
            // InternalTripModelLanguageText.g:833:2: rule__TripModel__Group_4__3__Impl rule__TripModel__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__TripModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__3"


    // $ANTLR start "rule__TripModel__Group_4__3__Impl"
    // InternalTripModelLanguageText.g:840:1: rule__TripModel__Group_4__3__Impl : ( ( rule__TripModel__Group_4_3__0 )* ) ;
    public final void rule__TripModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:844:1: ( ( ( rule__TripModel__Group_4_3__0 )* ) )
            // InternalTripModelLanguageText.g:845:1: ( ( rule__TripModel__Group_4_3__0 )* )
            {
            // InternalTripModelLanguageText.g:845:1: ( ( rule__TripModel__Group_4_3__0 )* )
            // InternalTripModelLanguageText.g:846:2: ( rule__TripModel__Group_4_3__0 )*
            {
             before(grammarAccess.getTripModelAccess().getGroup_4_3()); 
            // InternalTripModelLanguageText.g:847:2: ( rule__TripModel__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:847:3: rule__TripModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TripModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTripModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__3__Impl"


    // $ANTLR start "rule__TripModel__Group_4__4"
    // InternalTripModelLanguageText.g:855:1: rule__TripModel__Group_4__4 : rule__TripModel__Group_4__4__Impl ;
    public final void rule__TripModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:859:1: ( rule__TripModel__Group_4__4__Impl )
            // InternalTripModelLanguageText.g:860:2: rule__TripModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__4"


    // $ANTLR start "rule__TripModel__Group_4__4__Impl"
    // InternalTripModelLanguageText.g:866:1: rule__TripModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__TripModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:870:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:871:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:871:1: ( '}' )
            // InternalTripModelLanguageText.g:872:2: '}'
            {
             before(grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4__4__Impl"


    // $ANTLR start "rule__TripModel__Group_4_3__0"
    // InternalTripModelLanguageText.g:882:1: rule__TripModel__Group_4_3__0 : rule__TripModel__Group_4_3__0__Impl rule__TripModel__Group_4_3__1 ;
    public final void rule__TripModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:886:1: ( rule__TripModel__Group_4_3__0__Impl rule__TripModel__Group_4_3__1 )
            // InternalTripModelLanguageText.g:887:2: rule__TripModel__Group_4_3__0__Impl rule__TripModel__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__TripModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripModel__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4_3__0"


    // $ANTLR start "rule__TripModel__Group_4_3__0__Impl"
    // InternalTripModelLanguageText.g:894:1: rule__TripModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__TripModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:898:1: ( ( ',' ) )
            // InternalTripModelLanguageText.g:899:1: ( ',' )
            {
            // InternalTripModelLanguageText.g:899:1: ( ',' )
            // InternalTripModelLanguageText.g:900:2: ','
            {
             before(grammarAccess.getTripModelAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTripModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__TripModel__Group_4_3__1"
    // InternalTripModelLanguageText.g:909:1: rule__TripModel__Group_4_3__1 : rule__TripModel__Group_4_3__1__Impl ;
    public final void rule__TripModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:913:1: ( rule__TripModel__Group_4_3__1__Impl )
            // InternalTripModelLanguageText.g:914:2: rule__TripModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4_3__1"


    // $ANTLR start "rule__TripModel__Group_4_3__1__Impl"
    // InternalTripModelLanguageText.g:920:1: rule__TripModel__Group_4_3__1__Impl : ( ( rule__TripModel__LocationAssignment_4_3_1 ) ) ;
    public final void rule__TripModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:924:1: ( ( ( rule__TripModel__LocationAssignment_4_3_1 ) ) )
            // InternalTripModelLanguageText.g:925:1: ( ( rule__TripModel__LocationAssignment_4_3_1 ) )
            {
            // InternalTripModelLanguageText.g:925:1: ( ( rule__TripModel__LocationAssignment_4_3_1 ) )
            // InternalTripModelLanguageText.g:926:2: ( rule__TripModel__LocationAssignment_4_3_1 )
            {
             before(grammarAccess.getTripModelAccess().getLocationAssignment_4_3_1()); 
            // InternalTripModelLanguageText.g:927:2: ( rule__TripModel__LocationAssignment_4_3_1 )
            // InternalTripModelLanguageText.g:927:3: rule__TripModel__LocationAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TripModel__LocationAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTripModelAccess().getLocationAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__Trip__Group__0"
    // InternalTripModelLanguageText.g:936:1: rule__Trip__Group__0 : rule__Trip__Group__0__Impl rule__Trip__Group__1 ;
    public final void rule__Trip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:940:1: ( rule__Trip__Group__0__Impl rule__Trip__Group__1 )
            // InternalTripModelLanguageText.g:941:2: rule__Trip__Group__0__Impl rule__Trip__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Trip__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__0"


    // $ANTLR start "rule__Trip__Group__0__Impl"
    // InternalTripModelLanguageText.g:948:1: rule__Trip__Group__0__Impl : ( 'Trip' ) ;
    public final void rule__Trip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:952:1: ( ( 'Trip' ) )
            // InternalTripModelLanguageText.g:953:1: ( 'Trip' )
            {
            // InternalTripModelLanguageText.g:953:1: ( 'Trip' )
            // InternalTripModelLanguageText.g:954:2: 'Trip'
            {
             before(grammarAccess.getTripAccess().getTripKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getTripKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__0__Impl"


    // $ANTLR start "rule__Trip__Group__1"
    // InternalTripModelLanguageText.g:963:1: rule__Trip__Group__1 : rule__Trip__Group__1__Impl rule__Trip__Group__2 ;
    public final void rule__Trip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:967:1: ( rule__Trip__Group__1__Impl rule__Trip__Group__2 )
            // InternalTripModelLanguageText.g:968:2: rule__Trip__Group__1__Impl rule__Trip__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Trip__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__1"


    // $ANTLR start "rule__Trip__Group__1__Impl"
    // InternalTripModelLanguageText.g:975:1: rule__Trip__Group__1__Impl : ( ( rule__Trip__NameAssignment_1 ) ) ;
    public final void rule__Trip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:979:1: ( ( ( rule__Trip__NameAssignment_1 ) ) )
            // InternalTripModelLanguageText.g:980:1: ( ( rule__Trip__NameAssignment_1 ) )
            {
            // InternalTripModelLanguageText.g:980:1: ( ( rule__Trip__NameAssignment_1 ) )
            // InternalTripModelLanguageText.g:981:2: ( rule__Trip__NameAssignment_1 )
            {
             before(grammarAccess.getTripAccess().getNameAssignment_1()); 
            // InternalTripModelLanguageText.g:982:2: ( rule__Trip__NameAssignment_1 )
            // InternalTripModelLanguageText.g:982:3: rule__Trip__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Trip__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__1__Impl"


    // $ANTLR start "rule__Trip__Group__2"
    // InternalTripModelLanguageText.g:990:1: rule__Trip__Group__2 : rule__Trip__Group__2__Impl rule__Trip__Group__3 ;
    public final void rule__Trip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:994:1: ( rule__Trip__Group__2__Impl rule__Trip__Group__3 )
            // InternalTripModelLanguageText.g:995:2: rule__Trip__Group__2__Impl rule__Trip__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Trip__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__2"


    // $ANTLR start "rule__Trip__Group__2__Impl"
    // InternalTripModelLanguageText.g:1002:1: rule__Trip__Group__2__Impl : ( '{' ) ;
    public final void rule__Trip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1006:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:1007:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:1007:1: ( '{' )
            // InternalTripModelLanguageText.g:1008:2: '{'
            {
             before(grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__2__Impl"


    // $ANTLR start "rule__Trip__Group__3"
    // InternalTripModelLanguageText.g:1017:1: rule__Trip__Group__3 : rule__Trip__Group__3__Impl rule__Trip__Group__4 ;
    public final void rule__Trip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1021:1: ( rule__Trip__Group__3__Impl rule__Trip__Group__4 )
            // InternalTripModelLanguageText.g:1022:2: rule__Trip__Group__3__Impl rule__Trip__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Trip__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__3"


    // $ANTLR start "rule__Trip__Group__3__Impl"
    // InternalTripModelLanguageText.g:1029:1: rule__Trip__Group__3__Impl : ( ( rule__Trip__Group_3__0 )? ) ;
    public final void rule__Trip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1033:1: ( ( ( rule__Trip__Group_3__0 )? ) )
            // InternalTripModelLanguageText.g:1034:1: ( ( rule__Trip__Group_3__0 )? )
            {
            // InternalTripModelLanguageText.g:1034:1: ( ( rule__Trip__Group_3__0 )? )
            // InternalTripModelLanguageText.g:1035:2: ( rule__Trip__Group_3__0 )?
            {
             before(grammarAccess.getTripAccess().getGroup_3()); 
            // InternalTripModelLanguageText.g:1036:2: ( rule__Trip__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTripModelLanguageText.g:1036:3: rule__Trip__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trip__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTripAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__3__Impl"


    // $ANTLR start "rule__Trip__Group__4"
    // InternalTripModelLanguageText.g:1044:1: rule__Trip__Group__4 : rule__Trip__Group__4__Impl rule__Trip__Group__5 ;
    public final void rule__Trip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1048:1: ( rule__Trip__Group__4__Impl rule__Trip__Group__5 )
            // InternalTripModelLanguageText.g:1049:2: rule__Trip__Group__4__Impl rule__Trip__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Trip__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__4"


    // $ANTLR start "rule__Trip__Group__4__Impl"
    // InternalTripModelLanguageText.g:1056:1: rule__Trip__Group__4__Impl : ( ( rule__Trip__Group_4__0 )? ) ;
    public final void rule__Trip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1060:1: ( ( ( rule__Trip__Group_4__0 )? ) )
            // InternalTripModelLanguageText.g:1061:1: ( ( rule__Trip__Group_4__0 )? )
            {
            // InternalTripModelLanguageText.g:1061:1: ( ( rule__Trip__Group_4__0 )? )
            // InternalTripModelLanguageText.g:1062:2: ( rule__Trip__Group_4__0 )?
            {
             before(grammarAccess.getTripAccess().getGroup_4()); 
            // InternalTripModelLanguageText.g:1063:2: ( rule__Trip__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTripModelLanguageText.g:1063:3: rule__Trip__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trip__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTripAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__4__Impl"


    // $ANTLR start "rule__Trip__Group__5"
    // InternalTripModelLanguageText.g:1071:1: rule__Trip__Group__5 : rule__Trip__Group__5__Impl rule__Trip__Group__6 ;
    public final void rule__Trip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1075:1: ( rule__Trip__Group__5__Impl rule__Trip__Group__6 )
            // InternalTripModelLanguageText.g:1076:2: rule__Trip__Group__5__Impl rule__Trip__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Trip__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__5"


    // $ANTLR start "rule__Trip__Group__5__Impl"
    // InternalTripModelLanguageText.g:1083:1: rule__Trip__Group__5__Impl : ( 'source' ) ;
    public final void rule__Trip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1087:1: ( ( 'source' ) )
            // InternalTripModelLanguageText.g:1088:1: ( 'source' )
            {
            // InternalTripModelLanguageText.g:1088:1: ( 'source' )
            // InternalTripModelLanguageText.g:1089:2: 'source'
            {
             before(grammarAccess.getTripAccess().getSourceKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getSourceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__5__Impl"


    // $ANTLR start "rule__Trip__Group__6"
    // InternalTripModelLanguageText.g:1098:1: rule__Trip__Group__6 : rule__Trip__Group__6__Impl rule__Trip__Group__7 ;
    public final void rule__Trip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1102:1: ( rule__Trip__Group__6__Impl rule__Trip__Group__7 )
            // InternalTripModelLanguageText.g:1103:2: rule__Trip__Group__6__Impl rule__Trip__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Trip__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__6"


    // $ANTLR start "rule__Trip__Group__6__Impl"
    // InternalTripModelLanguageText.g:1110:1: rule__Trip__Group__6__Impl : ( ( rule__Trip__SourceAssignment_6 ) ) ;
    public final void rule__Trip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1114:1: ( ( ( rule__Trip__SourceAssignment_6 ) ) )
            // InternalTripModelLanguageText.g:1115:1: ( ( rule__Trip__SourceAssignment_6 ) )
            {
            // InternalTripModelLanguageText.g:1115:1: ( ( rule__Trip__SourceAssignment_6 ) )
            // InternalTripModelLanguageText.g:1116:2: ( rule__Trip__SourceAssignment_6 )
            {
             before(grammarAccess.getTripAccess().getSourceAssignment_6()); 
            // InternalTripModelLanguageText.g:1117:2: ( rule__Trip__SourceAssignment_6 )
            // InternalTripModelLanguageText.g:1117:3: rule__Trip__SourceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Trip__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getSourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__6__Impl"


    // $ANTLR start "rule__Trip__Group__7"
    // InternalTripModelLanguageText.g:1125:1: rule__Trip__Group__7 : rule__Trip__Group__7__Impl rule__Trip__Group__8 ;
    public final void rule__Trip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1129:1: ( rule__Trip__Group__7__Impl rule__Trip__Group__8 )
            // InternalTripModelLanguageText.g:1130:2: rule__Trip__Group__7__Impl rule__Trip__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Trip__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__7"


    // $ANTLR start "rule__Trip__Group__7__Impl"
    // InternalTripModelLanguageText.g:1137:1: rule__Trip__Group__7__Impl : ( 'destination' ) ;
    public final void rule__Trip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1141:1: ( ( 'destination' ) )
            // InternalTripModelLanguageText.g:1142:1: ( 'destination' )
            {
            // InternalTripModelLanguageText.g:1142:1: ( 'destination' )
            // InternalTripModelLanguageText.g:1143:2: 'destination'
            {
             before(grammarAccess.getTripAccess().getDestinationKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getDestinationKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__7__Impl"


    // $ANTLR start "rule__Trip__Group__8"
    // InternalTripModelLanguageText.g:1152:1: rule__Trip__Group__8 : rule__Trip__Group__8__Impl rule__Trip__Group__9 ;
    public final void rule__Trip__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1156:1: ( rule__Trip__Group__8__Impl rule__Trip__Group__9 )
            // InternalTripModelLanguageText.g:1157:2: rule__Trip__Group__8__Impl rule__Trip__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Trip__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__8"


    // $ANTLR start "rule__Trip__Group__8__Impl"
    // InternalTripModelLanguageText.g:1164:1: rule__Trip__Group__8__Impl : ( ( rule__Trip__DestinationAssignment_8 ) ) ;
    public final void rule__Trip__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1168:1: ( ( ( rule__Trip__DestinationAssignment_8 ) ) )
            // InternalTripModelLanguageText.g:1169:1: ( ( rule__Trip__DestinationAssignment_8 ) )
            {
            // InternalTripModelLanguageText.g:1169:1: ( ( rule__Trip__DestinationAssignment_8 ) )
            // InternalTripModelLanguageText.g:1170:2: ( rule__Trip__DestinationAssignment_8 )
            {
             before(grammarAccess.getTripAccess().getDestinationAssignment_8()); 
            // InternalTripModelLanguageText.g:1171:2: ( rule__Trip__DestinationAssignment_8 )
            // InternalTripModelLanguageText.g:1171:3: rule__Trip__DestinationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Trip__DestinationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getDestinationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__8__Impl"


    // $ANTLR start "rule__Trip__Group__9"
    // InternalTripModelLanguageText.g:1179:1: rule__Trip__Group__9 : rule__Trip__Group__9__Impl rule__Trip__Group__10 ;
    public final void rule__Trip__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1183:1: ( rule__Trip__Group__9__Impl rule__Trip__Group__10 )
            // InternalTripModelLanguageText.g:1184:2: rule__Trip__Group__9__Impl rule__Trip__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Trip__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__9"


    // $ANTLR start "rule__Trip__Group__9__Impl"
    // InternalTripModelLanguageText.g:1191:1: rule__Trip__Group__9__Impl : ( ( rule__Trip__Group_9__0 )? ) ;
    public final void rule__Trip__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1195:1: ( ( ( rule__Trip__Group_9__0 )? ) )
            // InternalTripModelLanguageText.g:1196:1: ( ( rule__Trip__Group_9__0 )? )
            {
            // InternalTripModelLanguageText.g:1196:1: ( ( rule__Trip__Group_9__0 )? )
            // InternalTripModelLanguageText.g:1197:2: ( rule__Trip__Group_9__0 )?
            {
             before(grammarAccess.getTripAccess().getGroup_9()); 
            // InternalTripModelLanguageText.g:1198:2: ( rule__Trip__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTripModelLanguageText.g:1198:3: rule__Trip__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trip__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTripAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__9__Impl"


    // $ANTLR start "rule__Trip__Group__10"
    // InternalTripModelLanguageText.g:1206:1: rule__Trip__Group__10 : rule__Trip__Group__10__Impl ;
    public final void rule__Trip__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1210:1: ( rule__Trip__Group__10__Impl )
            // InternalTripModelLanguageText.g:1211:2: rule__Trip__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trip__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__10"


    // $ANTLR start "rule__Trip__Group__10__Impl"
    // InternalTripModelLanguageText.g:1217:1: rule__Trip__Group__10__Impl : ( '}' ) ;
    public final void rule__Trip__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1221:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:1222:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:1222:1: ( '}' )
            // InternalTripModelLanguageText.g:1223:2: '}'
            {
             before(grammarAccess.getTripAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group__10__Impl"


    // $ANTLR start "rule__Trip__Group_3__0"
    // InternalTripModelLanguageText.g:1233:1: rule__Trip__Group_3__0 : rule__Trip__Group_3__0__Impl rule__Trip__Group_3__1 ;
    public final void rule__Trip__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1237:1: ( rule__Trip__Group_3__0__Impl rule__Trip__Group_3__1 )
            // InternalTripModelLanguageText.g:1238:2: rule__Trip__Group_3__0__Impl rule__Trip__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Trip__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_3__0"


    // $ANTLR start "rule__Trip__Group_3__0__Impl"
    // InternalTripModelLanguageText.g:1245:1: rule__Trip__Group_3__0__Impl : ( 'End' ) ;
    public final void rule__Trip__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1249:1: ( ( 'End' ) )
            // InternalTripModelLanguageText.g:1250:1: ( 'End' )
            {
            // InternalTripModelLanguageText.g:1250:1: ( 'End' )
            // InternalTripModelLanguageText.g:1251:2: 'End'
            {
             before(grammarAccess.getTripAccess().getEndKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getEndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_3__0__Impl"


    // $ANTLR start "rule__Trip__Group_3__1"
    // InternalTripModelLanguageText.g:1260:1: rule__Trip__Group_3__1 : rule__Trip__Group_3__1__Impl ;
    public final void rule__Trip__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1264:1: ( rule__Trip__Group_3__1__Impl )
            // InternalTripModelLanguageText.g:1265:2: rule__Trip__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trip__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_3__1"


    // $ANTLR start "rule__Trip__Group_3__1__Impl"
    // InternalTripModelLanguageText.g:1271:1: rule__Trip__Group_3__1__Impl : ( ( rule__Trip__EndAssignment_3_1 ) ) ;
    public final void rule__Trip__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1275:1: ( ( ( rule__Trip__EndAssignment_3_1 ) ) )
            // InternalTripModelLanguageText.g:1276:1: ( ( rule__Trip__EndAssignment_3_1 ) )
            {
            // InternalTripModelLanguageText.g:1276:1: ( ( rule__Trip__EndAssignment_3_1 ) )
            // InternalTripModelLanguageText.g:1277:2: ( rule__Trip__EndAssignment_3_1 )
            {
             before(grammarAccess.getTripAccess().getEndAssignment_3_1()); 
            // InternalTripModelLanguageText.g:1278:2: ( rule__Trip__EndAssignment_3_1 )
            // InternalTripModelLanguageText.g:1278:3: rule__Trip__EndAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Trip__EndAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getEndAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_3__1__Impl"


    // $ANTLR start "rule__Trip__Group_4__0"
    // InternalTripModelLanguageText.g:1287:1: rule__Trip__Group_4__0 : rule__Trip__Group_4__0__Impl rule__Trip__Group_4__1 ;
    public final void rule__Trip__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1291:1: ( rule__Trip__Group_4__0__Impl rule__Trip__Group_4__1 )
            // InternalTripModelLanguageText.g:1292:2: rule__Trip__Group_4__0__Impl rule__Trip__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Trip__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_4__0"


    // $ANTLR start "rule__Trip__Group_4__0__Impl"
    // InternalTripModelLanguageText.g:1299:1: rule__Trip__Group_4__0__Impl : ( 'Start' ) ;
    public final void rule__Trip__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1303:1: ( ( 'Start' ) )
            // InternalTripModelLanguageText.g:1304:1: ( 'Start' )
            {
            // InternalTripModelLanguageText.g:1304:1: ( 'Start' )
            // InternalTripModelLanguageText.g:1305:2: 'Start'
            {
             before(grammarAccess.getTripAccess().getStartKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getStartKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_4__0__Impl"


    // $ANTLR start "rule__Trip__Group_4__1"
    // InternalTripModelLanguageText.g:1314:1: rule__Trip__Group_4__1 : rule__Trip__Group_4__1__Impl ;
    public final void rule__Trip__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1318:1: ( rule__Trip__Group_4__1__Impl )
            // InternalTripModelLanguageText.g:1319:2: rule__Trip__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trip__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_4__1"


    // $ANTLR start "rule__Trip__Group_4__1__Impl"
    // InternalTripModelLanguageText.g:1325:1: rule__Trip__Group_4__1__Impl : ( ( rule__Trip__StartAssignment_4_1 ) ) ;
    public final void rule__Trip__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1329:1: ( ( ( rule__Trip__StartAssignment_4_1 ) ) )
            // InternalTripModelLanguageText.g:1330:1: ( ( rule__Trip__StartAssignment_4_1 ) )
            {
            // InternalTripModelLanguageText.g:1330:1: ( ( rule__Trip__StartAssignment_4_1 ) )
            // InternalTripModelLanguageText.g:1331:2: ( rule__Trip__StartAssignment_4_1 )
            {
             before(grammarAccess.getTripAccess().getStartAssignment_4_1()); 
            // InternalTripModelLanguageText.g:1332:2: ( rule__Trip__StartAssignment_4_1 )
            // InternalTripModelLanguageText.g:1332:3: rule__Trip__StartAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Trip__StartAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getStartAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_4__1__Impl"


    // $ANTLR start "rule__Trip__Group_9__0"
    // InternalTripModelLanguageText.g:1341:1: rule__Trip__Group_9__0 : rule__Trip__Group_9__0__Impl rule__Trip__Group_9__1 ;
    public final void rule__Trip__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1345:1: ( rule__Trip__Group_9__0__Impl rule__Trip__Group_9__1 )
            // InternalTripModelLanguageText.g:1346:2: rule__Trip__Group_9__0__Impl rule__Trip__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Trip__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__0"


    // $ANTLR start "rule__Trip__Group_9__0__Impl"
    // InternalTripModelLanguageText.g:1353:1: rule__Trip__Group_9__0__Impl : ( 'service' ) ;
    public final void rule__Trip__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1357:1: ( ( 'service' ) )
            // InternalTripModelLanguageText.g:1358:1: ( 'service' )
            {
            // InternalTripModelLanguageText.g:1358:1: ( 'service' )
            // InternalTripModelLanguageText.g:1359:2: 'service'
            {
             before(grammarAccess.getTripAccess().getServiceKeyword_9_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getServiceKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__0__Impl"


    // $ANTLR start "rule__Trip__Group_9__1"
    // InternalTripModelLanguageText.g:1368:1: rule__Trip__Group_9__1 : rule__Trip__Group_9__1__Impl rule__Trip__Group_9__2 ;
    public final void rule__Trip__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1372:1: ( rule__Trip__Group_9__1__Impl rule__Trip__Group_9__2 )
            // InternalTripModelLanguageText.g:1373:2: rule__Trip__Group_9__1__Impl rule__Trip__Group_9__2
            {
            pushFollow(FOLLOW_15);
            rule__Trip__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__1"


    // $ANTLR start "rule__Trip__Group_9__1__Impl"
    // InternalTripModelLanguageText.g:1380:1: rule__Trip__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Trip__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1384:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:1385:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:1385:1: ( '{' )
            // InternalTripModelLanguageText.g:1386:2: '{'
            {
             before(grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__1__Impl"


    // $ANTLR start "rule__Trip__Group_9__2"
    // InternalTripModelLanguageText.g:1395:1: rule__Trip__Group_9__2 : rule__Trip__Group_9__2__Impl rule__Trip__Group_9__3 ;
    public final void rule__Trip__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1399:1: ( rule__Trip__Group_9__2__Impl rule__Trip__Group_9__3 )
            // InternalTripModelLanguageText.g:1400:2: rule__Trip__Group_9__2__Impl rule__Trip__Group_9__3
            {
            pushFollow(FOLLOW_7);
            rule__Trip__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__2"


    // $ANTLR start "rule__Trip__Group_9__2__Impl"
    // InternalTripModelLanguageText.g:1407:1: rule__Trip__Group_9__2__Impl : ( ( rule__Trip__ServiceAssignment_9_2 ) ) ;
    public final void rule__Trip__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1411:1: ( ( ( rule__Trip__ServiceAssignment_9_2 ) ) )
            // InternalTripModelLanguageText.g:1412:1: ( ( rule__Trip__ServiceAssignment_9_2 ) )
            {
            // InternalTripModelLanguageText.g:1412:1: ( ( rule__Trip__ServiceAssignment_9_2 ) )
            // InternalTripModelLanguageText.g:1413:2: ( rule__Trip__ServiceAssignment_9_2 )
            {
             before(grammarAccess.getTripAccess().getServiceAssignment_9_2()); 
            // InternalTripModelLanguageText.g:1414:2: ( rule__Trip__ServiceAssignment_9_2 )
            // InternalTripModelLanguageText.g:1414:3: rule__Trip__ServiceAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Trip__ServiceAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getServiceAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__2__Impl"


    // $ANTLR start "rule__Trip__Group_9__3"
    // InternalTripModelLanguageText.g:1422:1: rule__Trip__Group_9__3 : rule__Trip__Group_9__3__Impl rule__Trip__Group_9__4 ;
    public final void rule__Trip__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1426:1: ( rule__Trip__Group_9__3__Impl rule__Trip__Group_9__4 )
            // InternalTripModelLanguageText.g:1427:2: rule__Trip__Group_9__3__Impl rule__Trip__Group_9__4
            {
            pushFollow(FOLLOW_7);
            rule__Trip__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__3"


    // $ANTLR start "rule__Trip__Group_9__3__Impl"
    // InternalTripModelLanguageText.g:1434:1: rule__Trip__Group_9__3__Impl : ( ( rule__Trip__Group_9_3__0 )* ) ;
    public final void rule__Trip__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1438:1: ( ( ( rule__Trip__Group_9_3__0 )* ) )
            // InternalTripModelLanguageText.g:1439:1: ( ( rule__Trip__Group_9_3__0 )* )
            {
            // InternalTripModelLanguageText.g:1439:1: ( ( rule__Trip__Group_9_3__0 )* )
            // InternalTripModelLanguageText.g:1440:2: ( rule__Trip__Group_9_3__0 )*
            {
             before(grammarAccess.getTripAccess().getGroup_9_3()); 
            // InternalTripModelLanguageText.g:1441:2: ( rule__Trip__Group_9_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:1441:3: rule__Trip__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Trip__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTripAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__3__Impl"


    // $ANTLR start "rule__Trip__Group_9__4"
    // InternalTripModelLanguageText.g:1449:1: rule__Trip__Group_9__4 : rule__Trip__Group_9__4__Impl ;
    public final void rule__Trip__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1453:1: ( rule__Trip__Group_9__4__Impl )
            // InternalTripModelLanguageText.g:1454:2: rule__Trip__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trip__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__4"


    // $ANTLR start "rule__Trip__Group_9__4__Impl"
    // InternalTripModelLanguageText.g:1460:1: rule__Trip__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Trip__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1464:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:1465:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:1465:1: ( '}' )
            // InternalTripModelLanguageText.g:1466:2: '}'
            {
             before(grammarAccess.getTripAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9__4__Impl"


    // $ANTLR start "rule__Trip__Group_9_3__0"
    // InternalTripModelLanguageText.g:1476:1: rule__Trip__Group_9_3__0 : rule__Trip__Group_9_3__0__Impl rule__Trip__Group_9_3__1 ;
    public final void rule__Trip__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1480:1: ( rule__Trip__Group_9_3__0__Impl rule__Trip__Group_9_3__1 )
            // InternalTripModelLanguageText.g:1481:2: rule__Trip__Group_9_3__0__Impl rule__Trip__Group_9_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Trip__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trip__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9_3__0"


    // $ANTLR start "rule__Trip__Group_9_3__0__Impl"
    // InternalTripModelLanguageText.g:1488:1: rule__Trip__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Trip__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1492:1: ( ( ',' ) )
            // InternalTripModelLanguageText.g:1493:1: ( ',' )
            {
            // InternalTripModelLanguageText.g:1493:1: ( ',' )
            // InternalTripModelLanguageText.g:1494:2: ','
            {
             before(grammarAccess.getTripAccess().getCommaKeyword_9_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTripAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9_3__0__Impl"


    // $ANTLR start "rule__Trip__Group_9_3__1"
    // InternalTripModelLanguageText.g:1503:1: rule__Trip__Group_9_3__1 : rule__Trip__Group_9_3__1__Impl ;
    public final void rule__Trip__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1507:1: ( rule__Trip__Group_9_3__1__Impl )
            // InternalTripModelLanguageText.g:1508:2: rule__Trip__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trip__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9_3__1"


    // $ANTLR start "rule__Trip__Group_9_3__1__Impl"
    // InternalTripModelLanguageText.g:1514:1: rule__Trip__Group_9_3__1__Impl : ( ( rule__Trip__ServiceAssignment_9_3_1 ) ) ;
    public final void rule__Trip__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1518:1: ( ( ( rule__Trip__ServiceAssignment_9_3_1 ) ) )
            // InternalTripModelLanguageText.g:1519:1: ( ( rule__Trip__ServiceAssignment_9_3_1 ) )
            {
            // InternalTripModelLanguageText.g:1519:1: ( ( rule__Trip__ServiceAssignment_9_3_1 ) )
            // InternalTripModelLanguageText.g:1520:2: ( rule__Trip__ServiceAssignment_9_3_1 )
            {
             before(grammarAccess.getTripAccess().getServiceAssignment_9_3_1()); 
            // InternalTripModelLanguageText.g:1521:2: ( rule__Trip__ServiceAssignment_9_3_1 )
            // InternalTripModelLanguageText.g:1521:3: rule__Trip__ServiceAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Trip__ServiceAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTripAccess().getServiceAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__Group_9_3__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalTripModelLanguageText.g:1530:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1534:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalTripModelLanguageText.g:1535:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalTripModelLanguageText.g:1542:1: rule__Location__Group__0__Impl : ( () ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1546:1: ( ( () ) )
            // InternalTripModelLanguageText.g:1547:1: ( () )
            {
            // InternalTripModelLanguageText.g:1547:1: ( () )
            // InternalTripModelLanguageText.g:1548:2: ()
            {
             before(grammarAccess.getLocationAccess().getLocationAction_0()); 
            // InternalTripModelLanguageText.g:1549:2: ()
            // InternalTripModelLanguageText.g:1549:3: 
            {
            }

             after(grammarAccess.getLocationAccess().getLocationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalTripModelLanguageText.g:1557:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1561:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalTripModelLanguageText.g:1562:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalTripModelLanguageText.g:1569:1: rule__Location__Group__1__Impl : ( 'location' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1573:1: ( ( 'location' ) )
            // InternalTripModelLanguageText.g:1574:1: ( 'location' )
            {
            // InternalTripModelLanguageText.g:1574:1: ( 'location' )
            // InternalTripModelLanguageText.g:1575:2: 'location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalTripModelLanguageText.g:1584:1: rule__Location__Group__2 : rule__Location__Group__2__Impl ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1588:1: ( rule__Location__Group__2__Impl )
            // InternalTripModelLanguageText.g:1589:2: rule__Location__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalTripModelLanguageText.g:1595:1: rule__Location__Group__2__Impl : ( ( rule__Location__NameAssignment_2 ) ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1599:1: ( ( ( rule__Location__NameAssignment_2 ) ) )
            // InternalTripModelLanguageText.g:1600:1: ( ( rule__Location__NameAssignment_2 ) )
            {
            // InternalTripModelLanguageText.g:1600:1: ( ( rule__Location__NameAssignment_2 ) )
            // InternalTripModelLanguageText.g:1601:2: ( rule__Location__NameAssignment_2 )
            {
             before(grammarAccess.getLocationAccess().getNameAssignment_2()); 
            // InternalTripModelLanguageText.g:1602:2: ( rule__Location__NameAssignment_2 )
            // InternalTripModelLanguageText.g:1602:3: rule__Location__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Location__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Service_Impl__Group__0"
    // InternalTripModelLanguageText.g:1611:1: rule__Service_Impl__Group__0 : rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1 ;
    public final void rule__Service_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1615:1: ( rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1 )
            // InternalTripModelLanguageText.g:1616:2: rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Service_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__0"


    // $ANTLR start "rule__Service_Impl__Group__0__Impl"
    // InternalTripModelLanguageText.g:1623:1: rule__Service_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Service_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1627:1: ( ( () ) )
            // InternalTripModelLanguageText.g:1628:1: ( () )
            {
            // InternalTripModelLanguageText.g:1628:1: ( () )
            // InternalTripModelLanguageText.g:1629:2: ()
            {
             before(grammarAccess.getService_ImplAccess().getServiceAction_0()); 
            // InternalTripModelLanguageText.g:1630:2: ()
            // InternalTripModelLanguageText.g:1630:3: 
            {
            }

             after(grammarAccess.getService_ImplAccess().getServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__0__Impl"


    // $ANTLR start "rule__Service_Impl__Group__1"
    // InternalTripModelLanguageText.g:1638:1: rule__Service_Impl__Group__1 : rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2 ;
    public final void rule__Service_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1642:1: ( rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2 )
            // InternalTripModelLanguageText.g:1643:2: rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Service_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__1"


    // $ANTLR start "rule__Service_Impl__Group__1__Impl"
    // InternalTripModelLanguageText.g:1650:1: rule__Service_Impl__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1654:1: ( ( 'Service' ) )
            // InternalTripModelLanguageText.g:1655:1: ( 'Service' )
            {
            // InternalTripModelLanguageText.g:1655:1: ( 'Service' )
            // InternalTripModelLanguageText.g:1656:2: 'Service'
            {
             before(grammarAccess.getService_ImplAccess().getServiceKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__1__Impl"


    // $ANTLR start "rule__Service_Impl__Group__2"
    // InternalTripModelLanguageText.g:1665:1: rule__Service_Impl__Group__2 : rule__Service_Impl__Group__2__Impl rule__Service_Impl__Group__3 ;
    public final void rule__Service_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1669:1: ( rule__Service_Impl__Group__2__Impl rule__Service_Impl__Group__3 )
            // InternalTripModelLanguageText.g:1670:2: rule__Service_Impl__Group__2__Impl rule__Service_Impl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Service_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__2"


    // $ANTLR start "rule__Service_Impl__Group__2__Impl"
    // InternalTripModelLanguageText.g:1677:1: rule__Service_Impl__Group__2__Impl : ( ( rule__Service_Impl__NameAssignment_2 ) ) ;
    public final void rule__Service_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1681:1: ( ( ( rule__Service_Impl__NameAssignment_2 ) ) )
            // InternalTripModelLanguageText.g:1682:1: ( ( rule__Service_Impl__NameAssignment_2 ) )
            {
            // InternalTripModelLanguageText.g:1682:1: ( ( rule__Service_Impl__NameAssignment_2 ) )
            // InternalTripModelLanguageText.g:1683:2: ( rule__Service_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getService_ImplAccess().getNameAssignment_2()); 
            // InternalTripModelLanguageText.g:1684:2: ( rule__Service_Impl__NameAssignment_2 )
            // InternalTripModelLanguageText.g:1684:3: rule__Service_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__2__Impl"


    // $ANTLR start "rule__Service_Impl__Group__3"
    // InternalTripModelLanguageText.g:1692:1: rule__Service_Impl__Group__3 : rule__Service_Impl__Group__3__Impl rule__Service_Impl__Group__4 ;
    public final void rule__Service_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1696:1: ( rule__Service_Impl__Group__3__Impl rule__Service_Impl__Group__4 )
            // InternalTripModelLanguageText.g:1697:2: rule__Service_Impl__Group__3__Impl rule__Service_Impl__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Service_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__3"


    // $ANTLR start "rule__Service_Impl__Group__3__Impl"
    // InternalTripModelLanguageText.g:1704:1: rule__Service_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Service_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1708:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:1709:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:1709:1: ( '{' )
            // InternalTripModelLanguageText.g:1710:2: '{'
            {
             before(grammarAccess.getService_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__3__Impl"


    // $ANTLR start "rule__Service_Impl__Group__4"
    // InternalTripModelLanguageText.g:1719:1: rule__Service_Impl__Group__4 : rule__Service_Impl__Group__4__Impl rule__Service_Impl__Group__5 ;
    public final void rule__Service_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1723:1: ( rule__Service_Impl__Group__4__Impl rule__Service_Impl__Group__5 )
            // InternalTripModelLanguageText.g:1724:2: rule__Service_Impl__Group__4__Impl rule__Service_Impl__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Service_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__4"


    // $ANTLR start "rule__Service_Impl__Group__4__Impl"
    // InternalTripModelLanguageText.g:1731:1: rule__Service_Impl__Group__4__Impl : ( ( rule__Service_Impl__Group_4__0 )? ) ;
    public final void rule__Service_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1735:1: ( ( ( rule__Service_Impl__Group_4__0 )? ) )
            // InternalTripModelLanguageText.g:1736:1: ( ( rule__Service_Impl__Group_4__0 )? )
            {
            // InternalTripModelLanguageText.g:1736:1: ( ( rule__Service_Impl__Group_4__0 )? )
            // InternalTripModelLanguageText.g:1737:2: ( rule__Service_Impl__Group_4__0 )?
            {
             before(grammarAccess.getService_ImplAccess().getGroup_4()); 
            // InternalTripModelLanguageText.g:1738:2: ( rule__Service_Impl__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTripModelLanguageText.g:1738:3: rule__Service_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getService_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__4__Impl"


    // $ANTLR start "rule__Service_Impl__Group__5"
    // InternalTripModelLanguageText.g:1746:1: rule__Service_Impl__Group__5 : rule__Service_Impl__Group__5__Impl rule__Service_Impl__Group__6 ;
    public final void rule__Service_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1750:1: ( rule__Service_Impl__Group__5__Impl rule__Service_Impl__Group__6 )
            // InternalTripModelLanguageText.g:1751:2: rule__Service_Impl__Group__5__Impl rule__Service_Impl__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Service_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__5"


    // $ANTLR start "rule__Service_Impl__Group__5__Impl"
    // InternalTripModelLanguageText.g:1758:1: rule__Service_Impl__Group__5__Impl : ( ( rule__Service_Impl__Group_5__0 )? ) ;
    public final void rule__Service_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1762:1: ( ( ( rule__Service_Impl__Group_5__0 )? ) )
            // InternalTripModelLanguageText.g:1763:1: ( ( rule__Service_Impl__Group_5__0 )? )
            {
            // InternalTripModelLanguageText.g:1763:1: ( ( rule__Service_Impl__Group_5__0 )? )
            // InternalTripModelLanguageText.g:1764:2: ( rule__Service_Impl__Group_5__0 )?
            {
             before(grammarAccess.getService_ImplAccess().getGroup_5()); 
            // InternalTripModelLanguageText.g:1765:2: ( rule__Service_Impl__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTripModelLanguageText.g:1765:3: rule__Service_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getService_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__5__Impl"


    // $ANTLR start "rule__Service_Impl__Group__6"
    // InternalTripModelLanguageText.g:1773:1: rule__Service_Impl__Group__6 : rule__Service_Impl__Group__6__Impl rule__Service_Impl__Group__7 ;
    public final void rule__Service_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1777:1: ( rule__Service_Impl__Group__6__Impl rule__Service_Impl__Group__7 )
            // InternalTripModelLanguageText.g:1778:2: rule__Service_Impl__Group__6__Impl rule__Service_Impl__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Service_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__6"


    // $ANTLR start "rule__Service_Impl__Group__6__Impl"
    // InternalTripModelLanguageText.g:1785:1: rule__Service_Impl__Group__6__Impl : ( ( rule__Service_Impl__Group_6__0 )? ) ;
    public final void rule__Service_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1789:1: ( ( ( rule__Service_Impl__Group_6__0 )? ) )
            // InternalTripModelLanguageText.g:1790:1: ( ( rule__Service_Impl__Group_6__0 )? )
            {
            // InternalTripModelLanguageText.g:1790:1: ( ( rule__Service_Impl__Group_6__0 )? )
            // InternalTripModelLanguageText.g:1791:2: ( rule__Service_Impl__Group_6__0 )?
            {
             before(grammarAccess.getService_ImplAccess().getGroup_6()); 
            // InternalTripModelLanguageText.g:1792:2: ( rule__Service_Impl__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTripModelLanguageText.g:1792:3: rule__Service_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getService_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__6__Impl"


    // $ANTLR start "rule__Service_Impl__Group__7"
    // InternalTripModelLanguageText.g:1800:1: rule__Service_Impl__Group__7 : rule__Service_Impl__Group__7__Impl rule__Service_Impl__Group__8 ;
    public final void rule__Service_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1804:1: ( rule__Service_Impl__Group__7__Impl rule__Service_Impl__Group__8 )
            // InternalTripModelLanguageText.g:1805:2: rule__Service_Impl__Group__7__Impl rule__Service_Impl__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Service_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__7"


    // $ANTLR start "rule__Service_Impl__Group__7__Impl"
    // InternalTripModelLanguageText.g:1812:1: rule__Service_Impl__Group__7__Impl : ( ( rule__Service_Impl__Group_7__0 )? ) ;
    public final void rule__Service_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1816:1: ( ( ( rule__Service_Impl__Group_7__0 )? ) )
            // InternalTripModelLanguageText.g:1817:1: ( ( rule__Service_Impl__Group_7__0 )? )
            {
            // InternalTripModelLanguageText.g:1817:1: ( ( rule__Service_Impl__Group_7__0 )? )
            // InternalTripModelLanguageText.g:1818:2: ( rule__Service_Impl__Group_7__0 )?
            {
             before(grammarAccess.getService_ImplAccess().getGroup_7()); 
            // InternalTripModelLanguageText.g:1819:2: ( rule__Service_Impl__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTripModelLanguageText.g:1819:3: rule__Service_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getService_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__7__Impl"


    // $ANTLR start "rule__Service_Impl__Group__8"
    // InternalTripModelLanguageText.g:1827:1: rule__Service_Impl__Group__8 : rule__Service_Impl__Group__8__Impl ;
    public final void rule__Service_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1831:1: ( rule__Service_Impl__Group__8__Impl )
            // InternalTripModelLanguageText.g:1832:2: rule__Service_Impl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__8"


    // $ANTLR start "rule__Service_Impl__Group__8__Impl"
    // InternalTripModelLanguageText.g:1838:1: rule__Service_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Service_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1842:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:1843:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:1843:1: ( '}' )
            // InternalTripModelLanguageText.g:1844:2: '}'
            {
             before(grammarAccess.getService_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__8__Impl"


    // $ANTLR start "rule__Service_Impl__Group_4__0"
    // InternalTripModelLanguageText.g:1854:1: rule__Service_Impl__Group_4__0 : rule__Service_Impl__Group_4__0__Impl rule__Service_Impl__Group_4__1 ;
    public final void rule__Service_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1858:1: ( rule__Service_Impl__Group_4__0__Impl rule__Service_Impl__Group_4__1 )
            // InternalTripModelLanguageText.g:1859:2: rule__Service_Impl__Group_4__0__Impl rule__Service_Impl__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Service_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_4__0"


    // $ANTLR start "rule__Service_Impl__Group_4__0__Impl"
    // InternalTripModelLanguageText.g:1866:1: rule__Service_Impl__Group_4__0__Impl : ( 'Cost' ) ;
    public final void rule__Service_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1870:1: ( ( 'Cost' ) )
            // InternalTripModelLanguageText.g:1871:1: ( 'Cost' )
            {
            // InternalTripModelLanguageText.g:1871:1: ( 'Cost' )
            // InternalTripModelLanguageText.g:1872:2: 'Cost'
            {
             before(grammarAccess.getService_ImplAccess().getCostKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getCostKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Service_Impl__Group_4__1"
    // InternalTripModelLanguageText.g:1881:1: rule__Service_Impl__Group_4__1 : rule__Service_Impl__Group_4__1__Impl ;
    public final void rule__Service_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1885:1: ( rule__Service_Impl__Group_4__1__Impl )
            // InternalTripModelLanguageText.g:1886:2: rule__Service_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_4__1"


    // $ANTLR start "rule__Service_Impl__Group_4__1__Impl"
    // InternalTripModelLanguageText.g:1892:1: rule__Service_Impl__Group_4__1__Impl : ( ( rule__Service_Impl__CostAssignment_4_1 ) ) ;
    public final void rule__Service_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1896:1: ( ( ( rule__Service_Impl__CostAssignment_4_1 ) ) )
            // InternalTripModelLanguageText.g:1897:1: ( ( rule__Service_Impl__CostAssignment_4_1 ) )
            {
            // InternalTripModelLanguageText.g:1897:1: ( ( rule__Service_Impl__CostAssignment_4_1 ) )
            // InternalTripModelLanguageText.g:1898:2: ( rule__Service_Impl__CostAssignment_4_1 )
            {
             before(grammarAccess.getService_ImplAccess().getCostAssignment_4_1()); 
            // InternalTripModelLanguageText.g:1899:2: ( rule__Service_Impl__CostAssignment_4_1 )
            // InternalTripModelLanguageText.g:1899:3: rule__Service_Impl__CostAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__CostAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getCostAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Service_Impl__Group_5__0"
    // InternalTripModelLanguageText.g:1908:1: rule__Service_Impl__Group_5__0 : rule__Service_Impl__Group_5__0__Impl rule__Service_Impl__Group_5__1 ;
    public final void rule__Service_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1912:1: ( rule__Service_Impl__Group_5__0__Impl rule__Service_Impl__Group_5__1 )
            // InternalTripModelLanguageText.g:1913:2: rule__Service_Impl__Group_5__0__Impl rule__Service_Impl__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Service_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_5__0"


    // $ANTLR start "rule__Service_Impl__Group_5__0__Impl"
    // InternalTripModelLanguageText.g:1920:1: rule__Service_Impl__Group_5__0__Impl : ( 'Duration' ) ;
    public final void rule__Service_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1924:1: ( ( 'Duration' ) )
            // InternalTripModelLanguageText.g:1925:1: ( 'Duration' )
            {
            // InternalTripModelLanguageText.g:1925:1: ( 'Duration' )
            // InternalTripModelLanguageText.g:1926:2: 'Duration'
            {
             before(grammarAccess.getService_ImplAccess().getDurationKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getDurationKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Service_Impl__Group_5__1"
    // InternalTripModelLanguageText.g:1935:1: rule__Service_Impl__Group_5__1 : rule__Service_Impl__Group_5__1__Impl ;
    public final void rule__Service_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1939:1: ( rule__Service_Impl__Group_5__1__Impl )
            // InternalTripModelLanguageText.g:1940:2: rule__Service_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_5__1"


    // $ANTLR start "rule__Service_Impl__Group_5__1__Impl"
    // InternalTripModelLanguageText.g:1946:1: rule__Service_Impl__Group_5__1__Impl : ( ( rule__Service_Impl__DurationAssignment_5_1 ) ) ;
    public final void rule__Service_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1950:1: ( ( ( rule__Service_Impl__DurationAssignment_5_1 ) ) )
            // InternalTripModelLanguageText.g:1951:1: ( ( rule__Service_Impl__DurationAssignment_5_1 ) )
            {
            // InternalTripModelLanguageText.g:1951:1: ( ( rule__Service_Impl__DurationAssignment_5_1 ) )
            // InternalTripModelLanguageText.g:1952:2: ( rule__Service_Impl__DurationAssignment_5_1 )
            {
             before(grammarAccess.getService_ImplAccess().getDurationAssignment_5_1()); 
            // InternalTripModelLanguageText.g:1953:2: ( rule__Service_Impl__DurationAssignment_5_1 )
            // InternalTripModelLanguageText.g:1953:3: rule__Service_Impl__DurationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__DurationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getDurationAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Service_Impl__Group_6__0"
    // InternalTripModelLanguageText.g:1962:1: rule__Service_Impl__Group_6__0 : rule__Service_Impl__Group_6__0__Impl rule__Service_Impl__Group_6__1 ;
    public final void rule__Service_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1966:1: ( rule__Service_Impl__Group_6__0__Impl rule__Service_Impl__Group_6__1 )
            // InternalTripModelLanguageText.g:1967:2: rule__Service_Impl__Group_6__0__Impl rule__Service_Impl__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Service_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_6__0"


    // $ANTLR start "rule__Service_Impl__Group_6__0__Impl"
    // InternalTripModelLanguageText.g:1974:1: rule__Service_Impl__Group_6__0__Impl : ( 'Rating' ) ;
    public final void rule__Service_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1978:1: ( ( 'Rating' ) )
            // InternalTripModelLanguageText.g:1979:1: ( 'Rating' )
            {
            // InternalTripModelLanguageText.g:1979:1: ( 'Rating' )
            // InternalTripModelLanguageText.g:1980:2: 'Rating'
            {
             before(grammarAccess.getService_ImplAccess().getRatingKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getRatingKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Service_Impl__Group_6__1"
    // InternalTripModelLanguageText.g:1989:1: rule__Service_Impl__Group_6__1 : rule__Service_Impl__Group_6__1__Impl ;
    public final void rule__Service_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:1993:1: ( rule__Service_Impl__Group_6__1__Impl )
            // InternalTripModelLanguageText.g:1994:2: rule__Service_Impl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_6__1"


    // $ANTLR start "rule__Service_Impl__Group_6__1__Impl"
    // InternalTripModelLanguageText.g:2000:1: rule__Service_Impl__Group_6__1__Impl : ( ( rule__Service_Impl__RatingAssignment_6_1 ) ) ;
    public final void rule__Service_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2004:1: ( ( ( rule__Service_Impl__RatingAssignment_6_1 ) ) )
            // InternalTripModelLanguageText.g:2005:1: ( ( rule__Service_Impl__RatingAssignment_6_1 ) )
            {
            // InternalTripModelLanguageText.g:2005:1: ( ( rule__Service_Impl__RatingAssignment_6_1 ) )
            // InternalTripModelLanguageText.g:2006:2: ( rule__Service_Impl__RatingAssignment_6_1 )
            {
             before(grammarAccess.getService_ImplAccess().getRatingAssignment_6_1()); 
            // InternalTripModelLanguageText.g:2007:2: ( rule__Service_Impl__RatingAssignment_6_1 )
            // InternalTripModelLanguageText.g:2007:3: rule__Service_Impl__RatingAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__RatingAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getRatingAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Service_Impl__Group_7__0"
    // InternalTripModelLanguageText.g:2016:1: rule__Service_Impl__Group_7__0 : rule__Service_Impl__Group_7__0__Impl rule__Service_Impl__Group_7__1 ;
    public final void rule__Service_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2020:1: ( rule__Service_Impl__Group_7__0__Impl rule__Service_Impl__Group_7__1 )
            // InternalTripModelLanguageText.g:2021:2: rule__Service_Impl__Group_7__0__Impl rule__Service_Impl__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__Service_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_7__0"


    // $ANTLR start "rule__Service_Impl__Group_7__0__Impl"
    // InternalTripModelLanguageText.g:2028:1: rule__Service_Impl__Group_7__0__Impl : ( 'Type' ) ;
    public final void rule__Service_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2032:1: ( ( 'Type' ) )
            // InternalTripModelLanguageText.g:2033:1: ( 'Type' )
            {
            // InternalTripModelLanguageText.g:2033:1: ( 'Type' )
            // InternalTripModelLanguageText.g:2034:2: 'Type'
            {
             before(grammarAccess.getService_ImplAccess().getTypeKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getTypeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Service_Impl__Group_7__1"
    // InternalTripModelLanguageText.g:2043:1: rule__Service_Impl__Group_7__1 : rule__Service_Impl__Group_7__1__Impl ;
    public final void rule__Service_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2047:1: ( rule__Service_Impl__Group_7__1__Impl )
            // InternalTripModelLanguageText.g:2048:2: rule__Service_Impl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_7__1"


    // $ANTLR start "rule__Service_Impl__Group_7__1__Impl"
    // InternalTripModelLanguageText.g:2054:1: rule__Service_Impl__Group_7__1__Impl : ( ( rule__Service_Impl__TypeAssignment_7_1 ) ) ;
    public final void rule__Service_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2058:1: ( ( ( rule__Service_Impl__TypeAssignment_7_1 ) ) )
            // InternalTripModelLanguageText.g:2059:1: ( ( rule__Service_Impl__TypeAssignment_7_1 ) )
            {
            // InternalTripModelLanguageText.g:2059:1: ( ( rule__Service_Impl__TypeAssignment_7_1 ) )
            // InternalTripModelLanguageText.g:2060:2: ( rule__Service_Impl__TypeAssignment_7_1 )
            {
             before(grammarAccess.getService_ImplAccess().getTypeAssignment_7_1()); 
            // InternalTripModelLanguageText.g:2061:2: ( rule__Service_Impl__TypeAssignment_7_1 )
            // InternalTripModelLanguageText.g:2061:3: rule__Service_Impl__TypeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalTripModelLanguageText.g:2070:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2074:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalTripModelLanguageText.g:2075:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalTripModelLanguageText.g:2082:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2086:1: ( ( ( '-' )? ) )
            // InternalTripModelLanguageText.g:2087:1: ( ( '-' )? )
            {
            // InternalTripModelLanguageText.g:2087:1: ( ( '-' )? )
            // InternalTripModelLanguageText.g:2088:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalTripModelLanguageText.g:2089:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTripModelLanguageText.g:2089:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalTripModelLanguageText.g:2097:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2101:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalTripModelLanguageText.g:2102:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalTripModelLanguageText.g:2109:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2113:1: ( ( ( RULE_INT )? ) )
            // InternalTripModelLanguageText.g:2114:1: ( ( RULE_INT )? )
            {
            // InternalTripModelLanguageText.g:2114:1: ( ( RULE_INT )? )
            // InternalTripModelLanguageText.g:2115:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalTripModelLanguageText.g:2116:2: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTripModelLanguageText.g:2116:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalTripModelLanguageText.g:2124:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2128:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalTripModelLanguageText.g:2129:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalTripModelLanguageText.g:2136:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2140:1: ( ( '.' ) )
            // InternalTripModelLanguageText.g:2141:1: ( '.' )
            {
            // InternalTripModelLanguageText.g:2141:1: ( '.' )
            // InternalTripModelLanguageText.g:2142:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalTripModelLanguageText.g:2151:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2155:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalTripModelLanguageText.g:2156:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalTripModelLanguageText.g:2163:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2167:1: ( ( RULE_INT ) )
            // InternalTripModelLanguageText.g:2168:1: ( RULE_INT )
            {
            // InternalTripModelLanguageText.g:2168:1: ( RULE_INT )
            // InternalTripModelLanguageText.g:2169:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalTripModelLanguageText.g:2178:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2182:1: ( rule__EFloat__Group__4__Impl )
            // InternalTripModelLanguageText.g:2183:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalTripModelLanguageText.g:2189:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2193:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalTripModelLanguageText.g:2194:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalTripModelLanguageText.g:2194:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalTripModelLanguageText.g:2195:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalTripModelLanguageText.g:2196:2: ( rule__EFloat__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTripModelLanguageText.g:2196:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalTripModelLanguageText.g:2205:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2209:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalTripModelLanguageText.g:2210:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalTripModelLanguageText.g:2217:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2221:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalTripModelLanguageText.g:2222:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalTripModelLanguageText.g:2222:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalTripModelLanguageText.g:2223:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalTripModelLanguageText.g:2224:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalTripModelLanguageText.g:2224:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalTripModelLanguageText.g:2232:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2236:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalTripModelLanguageText.g:2237:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalTripModelLanguageText.g:2244:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2248:1: ( ( ( '-' )? ) )
            // InternalTripModelLanguageText.g:2249:1: ( ( '-' )? )
            {
            // InternalTripModelLanguageText.g:2249:1: ( ( '-' )? )
            // InternalTripModelLanguageText.g:2250:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTripModelLanguageText.g:2251:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTripModelLanguageText.g:2251:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalTripModelLanguageText.g:2259:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2263:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalTripModelLanguageText.g:2264:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalTripModelLanguageText.g:2270:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2274:1: ( ( RULE_INT ) )
            // InternalTripModelLanguageText.g:2275:1: ( RULE_INT )
            {
            // InternalTripModelLanguageText.g:2275:1: ( RULE_INT )
            // InternalTripModelLanguageText.g:2276:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTripModelLanguageText.g:2286:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2290:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTripModelLanguageText.g:2291:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTripModelLanguageText.g:2298:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2302:1: ( ( ( '-' )? ) )
            // InternalTripModelLanguageText.g:2303:1: ( ( '-' )? )
            {
            // InternalTripModelLanguageText.g:2303:1: ( ( '-' )? )
            // InternalTripModelLanguageText.g:2304:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTripModelLanguageText.g:2305:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTripModelLanguageText.g:2305:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTripModelLanguageText.g:2313:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2317:1: ( rule__EInt__Group__1__Impl )
            // InternalTripModelLanguageText.g:2318:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTripModelLanguageText.g:2324:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2328:1: ( ( RULE_INT ) )
            // InternalTripModelLanguageText.g:2329:1: ( RULE_INT )
            {
            // InternalTripModelLanguageText.g:2329:1: ( RULE_INT )
            // InternalTripModelLanguageText.g:2330:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__OtherService__Group__0"
    // InternalTripModelLanguageText.g:2340:1: rule__OtherService__Group__0 : rule__OtherService__Group__0__Impl rule__OtherService__Group__1 ;
    public final void rule__OtherService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2344:1: ( rule__OtherService__Group__0__Impl rule__OtherService__Group__1 )
            // InternalTripModelLanguageText.g:2345:2: rule__OtherService__Group__0__Impl rule__OtherService__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OtherService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__0"


    // $ANTLR start "rule__OtherService__Group__0__Impl"
    // InternalTripModelLanguageText.g:2352:1: rule__OtherService__Group__0__Impl : ( 'OtherService' ) ;
    public final void rule__OtherService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2356:1: ( ( 'OtherService' ) )
            // InternalTripModelLanguageText.g:2357:1: ( 'OtherService' )
            {
            // InternalTripModelLanguageText.g:2357:1: ( 'OtherService' )
            // InternalTripModelLanguageText.g:2358:2: 'OtherService'
            {
             before(grammarAccess.getOtherServiceAccess().getOtherServiceKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getOtherServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__0__Impl"


    // $ANTLR start "rule__OtherService__Group__1"
    // InternalTripModelLanguageText.g:2367:1: rule__OtherService__Group__1 : rule__OtherService__Group__1__Impl rule__OtherService__Group__2 ;
    public final void rule__OtherService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2371:1: ( rule__OtherService__Group__1__Impl rule__OtherService__Group__2 )
            // InternalTripModelLanguageText.g:2372:2: rule__OtherService__Group__1__Impl rule__OtherService__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__OtherService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__1"


    // $ANTLR start "rule__OtherService__Group__1__Impl"
    // InternalTripModelLanguageText.g:2379:1: rule__OtherService__Group__1__Impl : ( ( rule__OtherService__NameAssignment_1 ) ) ;
    public final void rule__OtherService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2383:1: ( ( ( rule__OtherService__NameAssignment_1 ) ) )
            // InternalTripModelLanguageText.g:2384:1: ( ( rule__OtherService__NameAssignment_1 ) )
            {
            // InternalTripModelLanguageText.g:2384:1: ( ( rule__OtherService__NameAssignment_1 ) )
            // InternalTripModelLanguageText.g:2385:2: ( rule__OtherService__NameAssignment_1 )
            {
             before(grammarAccess.getOtherServiceAccess().getNameAssignment_1()); 
            // InternalTripModelLanguageText.g:2386:2: ( rule__OtherService__NameAssignment_1 )
            // InternalTripModelLanguageText.g:2386:3: rule__OtherService__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__1__Impl"


    // $ANTLR start "rule__OtherService__Group__2"
    // InternalTripModelLanguageText.g:2394:1: rule__OtherService__Group__2 : rule__OtherService__Group__2__Impl rule__OtherService__Group__3 ;
    public final void rule__OtherService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2398:1: ( rule__OtherService__Group__2__Impl rule__OtherService__Group__3 )
            // InternalTripModelLanguageText.g:2399:2: rule__OtherService__Group__2__Impl rule__OtherService__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__OtherService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__2"


    // $ANTLR start "rule__OtherService__Group__2__Impl"
    // InternalTripModelLanguageText.g:2406:1: rule__OtherService__Group__2__Impl : ( '{' ) ;
    public final void rule__OtherService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2410:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:2411:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:2411:1: ( '{' )
            // InternalTripModelLanguageText.g:2412:2: '{'
            {
             before(grammarAccess.getOtherServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__2__Impl"


    // $ANTLR start "rule__OtherService__Group__3"
    // InternalTripModelLanguageText.g:2421:1: rule__OtherService__Group__3 : rule__OtherService__Group__3__Impl rule__OtherService__Group__4 ;
    public final void rule__OtherService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2425:1: ( rule__OtherService__Group__3__Impl rule__OtherService__Group__4 )
            // InternalTripModelLanguageText.g:2426:2: rule__OtherService__Group__3__Impl rule__OtherService__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__OtherService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__3"


    // $ANTLR start "rule__OtherService__Group__3__Impl"
    // InternalTripModelLanguageText.g:2433:1: rule__OtherService__Group__3__Impl : ( ( rule__OtherService__Group_3__0 )? ) ;
    public final void rule__OtherService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2437:1: ( ( ( rule__OtherService__Group_3__0 )? ) )
            // InternalTripModelLanguageText.g:2438:1: ( ( rule__OtherService__Group_3__0 )? )
            {
            // InternalTripModelLanguageText.g:2438:1: ( ( rule__OtherService__Group_3__0 )? )
            // InternalTripModelLanguageText.g:2439:2: ( rule__OtherService__Group_3__0 )?
            {
             before(grammarAccess.getOtherServiceAccess().getGroup_3()); 
            // InternalTripModelLanguageText.g:2440:2: ( rule__OtherService__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTripModelLanguageText.g:2440:3: rule__OtherService__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherService__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherServiceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__3__Impl"


    // $ANTLR start "rule__OtherService__Group__4"
    // InternalTripModelLanguageText.g:2448:1: rule__OtherService__Group__4 : rule__OtherService__Group__4__Impl rule__OtherService__Group__5 ;
    public final void rule__OtherService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2452:1: ( rule__OtherService__Group__4__Impl rule__OtherService__Group__5 )
            // InternalTripModelLanguageText.g:2453:2: rule__OtherService__Group__4__Impl rule__OtherService__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__OtherService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__4"


    // $ANTLR start "rule__OtherService__Group__4__Impl"
    // InternalTripModelLanguageText.g:2460:1: rule__OtherService__Group__4__Impl : ( ( rule__OtherService__Group_4__0 )? ) ;
    public final void rule__OtherService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2464:1: ( ( ( rule__OtherService__Group_4__0 )? ) )
            // InternalTripModelLanguageText.g:2465:1: ( ( rule__OtherService__Group_4__0 )? )
            {
            // InternalTripModelLanguageText.g:2465:1: ( ( rule__OtherService__Group_4__0 )? )
            // InternalTripModelLanguageText.g:2466:2: ( rule__OtherService__Group_4__0 )?
            {
             before(grammarAccess.getOtherServiceAccess().getGroup_4()); 
            // InternalTripModelLanguageText.g:2467:2: ( rule__OtherService__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTripModelLanguageText.g:2467:3: rule__OtherService__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherService__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherServiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__4__Impl"


    // $ANTLR start "rule__OtherService__Group__5"
    // InternalTripModelLanguageText.g:2475:1: rule__OtherService__Group__5 : rule__OtherService__Group__5__Impl rule__OtherService__Group__6 ;
    public final void rule__OtherService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2479:1: ( rule__OtherService__Group__5__Impl rule__OtherService__Group__6 )
            // InternalTripModelLanguageText.g:2480:2: rule__OtherService__Group__5__Impl rule__OtherService__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__OtherService__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__5"


    // $ANTLR start "rule__OtherService__Group__5__Impl"
    // InternalTripModelLanguageText.g:2487:1: rule__OtherService__Group__5__Impl : ( ( rule__OtherService__Group_5__0 )? ) ;
    public final void rule__OtherService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2491:1: ( ( ( rule__OtherService__Group_5__0 )? ) )
            // InternalTripModelLanguageText.g:2492:1: ( ( rule__OtherService__Group_5__0 )? )
            {
            // InternalTripModelLanguageText.g:2492:1: ( ( rule__OtherService__Group_5__0 )? )
            // InternalTripModelLanguageText.g:2493:2: ( rule__OtherService__Group_5__0 )?
            {
             before(grammarAccess.getOtherServiceAccess().getGroup_5()); 
            // InternalTripModelLanguageText.g:2494:2: ( rule__OtherService__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTripModelLanguageText.g:2494:3: rule__OtherService__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherService__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherServiceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__5__Impl"


    // $ANTLR start "rule__OtherService__Group__6"
    // InternalTripModelLanguageText.g:2502:1: rule__OtherService__Group__6 : rule__OtherService__Group__6__Impl rule__OtherService__Group__7 ;
    public final void rule__OtherService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2506:1: ( rule__OtherService__Group__6__Impl rule__OtherService__Group__7 )
            // InternalTripModelLanguageText.g:2507:2: rule__OtherService__Group__6__Impl rule__OtherService__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__OtherService__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__6"


    // $ANTLR start "rule__OtherService__Group__6__Impl"
    // InternalTripModelLanguageText.g:2514:1: rule__OtherService__Group__6__Impl : ( ( rule__OtherService__Group_6__0 )? ) ;
    public final void rule__OtherService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2518:1: ( ( ( rule__OtherService__Group_6__0 )? ) )
            // InternalTripModelLanguageText.g:2519:1: ( ( rule__OtherService__Group_6__0 )? )
            {
            // InternalTripModelLanguageText.g:2519:1: ( ( rule__OtherService__Group_6__0 )? )
            // InternalTripModelLanguageText.g:2520:2: ( rule__OtherService__Group_6__0 )?
            {
             before(grammarAccess.getOtherServiceAccess().getGroup_6()); 
            // InternalTripModelLanguageText.g:2521:2: ( rule__OtherService__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTripModelLanguageText.g:2521:3: rule__OtherService__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherService__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOtherServiceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__6__Impl"


    // $ANTLR start "rule__OtherService__Group__7"
    // InternalTripModelLanguageText.g:2529:1: rule__OtherService__Group__7 : rule__OtherService__Group__7__Impl rule__OtherService__Group__8 ;
    public final void rule__OtherService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2533:1: ( rule__OtherService__Group__7__Impl rule__OtherService__Group__8 )
            // InternalTripModelLanguageText.g:2534:2: rule__OtherService__Group__7__Impl rule__OtherService__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__OtherService__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__7"


    // $ANTLR start "rule__OtherService__Group__7__Impl"
    // InternalTripModelLanguageText.g:2541:1: rule__OtherService__Group__7__Impl : ( 'location' ) ;
    public final void rule__OtherService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2545:1: ( ( 'location' ) )
            // InternalTripModelLanguageText.g:2546:1: ( 'location' )
            {
            // InternalTripModelLanguageText.g:2546:1: ( 'location' )
            // InternalTripModelLanguageText.g:2547:2: 'location'
            {
             before(grammarAccess.getOtherServiceAccess().getLocationKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getLocationKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__7__Impl"


    // $ANTLR start "rule__OtherService__Group__8"
    // InternalTripModelLanguageText.g:2556:1: rule__OtherService__Group__8 : rule__OtherService__Group__8__Impl rule__OtherService__Group__9 ;
    public final void rule__OtherService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2560:1: ( rule__OtherService__Group__8__Impl rule__OtherService__Group__9 )
            // InternalTripModelLanguageText.g:2561:2: rule__OtherService__Group__8__Impl rule__OtherService__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__OtherService__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__8"


    // $ANTLR start "rule__OtherService__Group__8__Impl"
    // InternalTripModelLanguageText.g:2568:1: rule__OtherService__Group__8__Impl : ( ( rule__OtherService__LocationAssignment_8 ) ) ;
    public final void rule__OtherService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2572:1: ( ( ( rule__OtherService__LocationAssignment_8 ) ) )
            // InternalTripModelLanguageText.g:2573:1: ( ( rule__OtherService__LocationAssignment_8 ) )
            {
            // InternalTripModelLanguageText.g:2573:1: ( ( rule__OtherService__LocationAssignment_8 ) )
            // InternalTripModelLanguageText.g:2574:2: ( rule__OtherService__LocationAssignment_8 )
            {
             before(grammarAccess.getOtherServiceAccess().getLocationAssignment_8()); 
            // InternalTripModelLanguageText.g:2575:2: ( rule__OtherService__LocationAssignment_8 )
            // InternalTripModelLanguageText.g:2575:3: rule__OtherService__LocationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__LocationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getOtherServiceAccess().getLocationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__8__Impl"


    // $ANTLR start "rule__OtherService__Group__9"
    // InternalTripModelLanguageText.g:2583:1: rule__OtherService__Group__9 : rule__OtherService__Group__9__Impl ;
    public final void rule__OtherService__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2587:1: ( rule__OtherService__Group__9__Impl )
            // InternalTripModelLanguageText.g:2588:2: rule__OtherService__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__9"


    // $ANTLR start "rule__OtherService__Group__9__Impl"
    // InternalTripModelLanguageText.g:2594:1: rule__OtherService__Group__9__Impl : ( '}' ) ;
    public final void rule__OtherService__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2598:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:2599:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:2599:1: ( '}' )
            // InternalTripModelLanguageText.g:2600:2: '}'
            {
             before(grammarAccess.getOtherServiceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group__9__Impl"


    // $ANTLR start "rule__OtherService__Group_3__0"
    // InternalTripModelLanguageText.g:2610:1: rule__OtherService__Group_3__0 : rule__OtherService__Group_3__0__Impl rule__OtherService__Group_3__1 ;
    public final void rule__OtherService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2614:1: ( rule__OtherService__Group_3__0__Impl rule__OtherService__Group_3__1 )
            // InternalTripModelLanguageText.g:2615:2: rule__OtherService__Group_3__0__Impl rule__OtherService__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__OtherService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_3__0"


    // $ANTLR start "rule__OtherService__Group_3__0__Impl"
    // InternalTripModelLanguageText.g:2622:1: rule__OtherService__Group_3__0__Impl : ( 'Cost' ) ;
    public final void rule__OtherService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2626:1: ( ( 'Cost' ) )
            // InternalTripModelLanguageText.g:2627:1: ( 'Cost' )
            {
            // InternalTripModelLanguageText.g:2627:1: ( 'Cost' )
            // InternalTripModelLanguageText.g:2628:2: 'Cost'
            {
             before(grammarAccess.getOtherServiceAccess().getCostKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getCostKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_3__0__Impl"


    // $ANTLR start "rule__OtherService__Group_3__1"
    // InternalTripModelLanguageText.g:2637:1: rule__OtherService__Group_3__1 : rule__OtherService__Group_3__1__Impl ;
    public final void rule__OtherService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2641:1: ( rule__OtherService__Group_3__1__Impl )
            // InternalTripModelLanguageText.g:2642:2: rule__OtherService__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_3__1"


    // $ANTLR start "rule__OtherService__Group_3__1__Impl"
    // InternalTripModelLanguageText.g:2648:1: rule__OtherService__Group_3__1__Impl : ( ( rule__OtherService__CostAssignment_3_1 ) ) ;
    public final void rule__OtherService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2652:1: ( ( ( rule__OtherService__CostAssignment_3_1 ) ) )
            // InternalTripModelLanguageText.g:2653:1: ( ( rule__OtherService__CostAssignment_3_1 ) )
            {
            // InternalTripModelLanguageText.g:2653:1: ( ( rule__OtherService__CostAssignment_3_1 ) )
            // InternalTripModelLanguageText.g:2654:2: ( rule__OtherService__CostAssignment_3_1 )
            {
             before(grammarAccess.getOtherServiceAccess().getCostAssignment_3_1()); 
            // InternalTripModelLanguageText.g:2655:2: ( rule__OtherService__CostAssignment_3_1 )
            // InternalTripModelLanguageText.g:2655:3: rule__OtherService__CostAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__CostAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherServiceAccess().getCostAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_3__1__Impl"


    // $ANTLR start "rule__OtherService__Group_4__0"
    // InternalTripModelLanguageText.g:2664:1: rule__OtherService__Group_4__0 : rule__OtherService__Group_4__0__Impl rule__OtherService__Group_4__1 ;
    public final void rule__OtherService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2668:1: ( rule__OtherService__Group_4__0__Impl rule__OtherService__Group_4__1 )
            // InternalTripModelLanguageText.g:2669:2: rule__OtherService__Group_4__0__Impl rule__OtherService__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__OtherService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_4__0"


    // $ANTLR start "rule__OtherService__Group_4__0__Impl"
    // InternalTripModelLanguageText.g:2676:1: rule__OtherService__Group_4__0__Impl : ( 'Duration' ) ;
    public final void rule__OtherService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2680:1: ( ( 'Duration' ) )
            // InternalTripModelLanguageText.g:2681:1: ( 'Duration' )
            {
            // InternalTripModelLanguageText.g:2681:1: ( 'Duration' )
            // InternalTripModelLanguageText.g:2682:2: 'Duration'
            {
             before(grammarAccess.getOtherServiceAccess().getDurationKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getDurationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_4__0__Impl"


    // $ANTLR start "rule__OtherService__Group_4__1"
    // InternalTripModelLanguageText.g:2691:1: rule__OtherService__Group_4__1 : rule__OtherService__Group_4__1__Impl ;
    public final void rule__OtherService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2695:1: ( rule__OtherService__Group_4__1__Impl )
            // InternalTripModelLanguageText.g:2696:2: rule__OtherService__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_4__1"


    // $ANTLR start "rule__OtherService__Group_4__1__Impl"
    // InternalTripModelLanguageText.g:2702:1: rule__OtherService__Group_4__1__Impl : ( ( rule__OtherService__DurationAssignment_4_1 ) ) ;
    public final void rule__OtherService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2706:1: ( ( ( rule__OtherService__DurationAssignment_4_1 ) ) )
            // InternalTripModelLanguageText.g:2707:1: ( ( rule__OtherService__DurationAssignment_4_1 ) )
            {
            // InternalTripModelLanguageText.g:2707:1: ( ( rule__OtherService__DurationAssignment_4_1 ) )
            // InternalTripModelLanguageText.g:2708:2: ( rule__OtherService__DurationAssignment_4_1 )
            {
             before(grammarAccess.getOtherServiceAccess().getDurationAssignment_4_1()); 
            // InternalTripModelLanguageText.g:2709:2: ( rule__OtherService__DurationAssignment_4_1 )
            // InternalTripModelLanguageText.g:2709:3: rule__OtherService__DurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__DurationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherServiceAccess().getDurationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_4__1__Impl"


    // $ANTLR start "rule__OtherService__Group_5__0"
    // InternalTripModelLanguageText.g:2718:1: rule__OtherService__Group_5__0 : rule__OtherService__Group_5__0__Impl rule__OtherService__Group_5__1 ;
    public final void rule__OtherService__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2722:1: ( rule__OtherService__Group_5__0__Impl rule__OtherService__Group_5__1 )
            // InternalTripModelLanguageText.g:2723:2: rule__OtherService__Group_5__0__Impl rule__OtherService__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__OtherService__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_5__0"


    // $ANTLR start "rule__OtherService__Group_5__0__Impl"
    // InternalTripModelLanguageText.g:2730:1: rule__OtherService__Group_5__0__Impl : ( 'Rating' ) ;
    public final void rule__OtherService__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2734:1: ( ( 'Rating' ) )
            // InternalTripModelLanguageText.g:2735:1: ( 'Rating' )
            {
            // InternalTripModelLanguageText.g:2735:1: ( 'Rating' )
            // InternalTripModelLanguageText.g:2736:2: 'Rating'
            {
             before(grammarAccess.getOtherServiceAccess().getRatingKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getRatingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_5__0__Impl"


    // $ANTLR start "rule__OtherService__Group_5__1"
    // InternalTripModelLanguageText.g:2745:1: rule__OtherService__Group_5__1 : rule__OtherService__Group_5__1__Impl ;
    public final void rule__OtherService__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2749:1: ( rule__OtherService__Group_5__1__Impl )
            // InternalTripModelLanguageText.g:2750:2: rule__OtherService__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_5__1"


    // $ANTLR start "rule__OtherService__Group_5__1__Impl"
    // InternalTripModelLanguageText.g:2756:1: rule__OtherService__Group_5__1__Impl : ( ( rule__OtherService__RatingAssignment_5_1 ) ) ;
    public final void rule__OtherService__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2760:1: ( ( ( rule__OtherService__RatingAssignment_5_1 ) ) )
            // InternalTripModelLanguageText.g:2761:1: ( ( rule__OtherService__RatingAssignment_5_1 ) )
            {
            // InternalTripModelLanguageText.g:2761:1: ( ( rule__OtherService__RatingAssignment_5_1 ) )
            // InternalTripModelLanguageText.g:2762:2: ( rule__OtherService__RatingAssignment_5_1 )
            {
             before(grammarAccess.getOtherServiceAccess().getRatingAssignment_5_1()); 
            // InternalTripModelLanguageText.g:2763:2: ( rule__OtherService__RatingAssignment_5_1 )
            // InternalTripModelLanguageText.g:2763:3: rule__OtherService__RatingAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__RatingAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherServiceAccess().getRatingAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_5__1__Impl"


    // $ANTLR start "rule__OtherService__Group_6__0"
    // InternalTripModelLanguageText.g:2772:1: rule__OtherService__Group_6__0 : rule__OtherService__Group_6__0__Impl rule__OtherService__Group_6__1 ;
    public final void rule__OtherService__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2776:1: ( rule__OtherService__Group_6__0__Impl rule__OtherService__Group_6__1 )
            // InternalTripModelLanguageText.g:2777:2: rule__OtherService__Group_6__0__Impl rule__OtherService__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__OtherService__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherService__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_6__0"


    // $ANTLR start "rule__OtherService__Group_6__0__Impl"
    // InternalTripModelLanguageText.g:2784:1: rule__OtherService__Group_6__0__Impl : ( 'Type' ) ;
    public final void rule__OtherService__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2788:1: ( ( 'Type' ) )
            // InternalTripModelLanguageText.g:2789:1: ( 'Type' )
            {
            // InternalTripModelLanguageText.g:2789:1: ( 'Type' )
            // InternalTripModelLanguageText.g:2790:2: 'Type'
            {
             before(grammarAccess.getOtherServiceAccess().getTypeKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOtherServiceAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_6__0__Impl"


    // $ANTLR start "rule__OtherService__Group_6__1"
    // InternalTripModelLanguageText.g:2799:1: rule__OtherService__Group_6__1 : rule__OtherService__Group_6__1__Impl ;
    public final void rule__OtherService__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2803:1: ( rule__OtherService__Group_6__1__Impl )
            // InternalTripModelLanguageText.g:2804:2: rule__OtherService__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_6__1"


    // $ANTLR start "rule__OtherService__Group_6__1__Impl"
    // InternalTripModelLanguageText.g:2810:1: rule__OtherService__Group_6__1__Impl : ( ( rule__OtherService__TypeAssignment_6_1 ) ) ;
    public final void rule__OtherService__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2814:1: ( ( ( rule__OtherService__TypeAssignment_6_1 ) ) )
            // InternalTripModelLanguageText.g:2815:1: ( ( rule__OtherService__TypeAssignment_6_1 ) )
            {
            // InternalTripModelLanguageText.g:2815:1: ( ( rule__OtherService__TypeAssignment_6_1 ) )
            // InternalTripModelLanguageText.g:2816:2: ( rule__OtherService__TypeAssignment_6_1 )
            {
             before(grammarAccess.getOtherServiceAccess().getTypeAssignment_6_1()); 
            // InternalTripModelLanguageText.g:2817:2: ( rule__OtherService__TypeAssignment_6_1 )
            // InternalTripModelLanguageText.g:2817:3: rule__OtherService__TypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherService__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOtherServiceAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__Group_6__1__Impl"


    // $ANTLR start "rule__TravelService__Group__0"
    // InternalTripModelLanguageText.g:2826:1: rule__TravelService__Group__0 : rule__TravelService__Group__0__Impl rule__TravelService__Group__1 ;
    public final void rule__TravelService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2830:1: ( rule__TravelService__Group__0__Impl rule__TravelService__Group__1 )
            // InternalTripModelLanguageText.g:2831:2: rule__TravelService__Group__0__Impl rule__TravelService__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TravelService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__0"


    // $ANTLR start "rule__TravelService__Group__0__Impl"
    // InternalTripModelLanguageText.g:2838:1: rule__TravelService__Group__0__Impl : ( 'TravelService' ) ;
    public final void rule__TravelService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2842:1: ( ( 'TravelService' ) )
            // InternalTripModelLanguageText.g:2843:1: ( 'TravelService' )
            {
            // InternalTripModelLanguageText.g:2843:1: ( 'TravelService' )
            // InternalTripModelLanguageText.g:2844:2: 'TravelService'
            {
             before(grammarAccess.getTravelServiceAccess().getTravelServiceKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getTravelServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__0__Impl"


    // $ANTLR start "rule__TravelService__Group__1"
    // InternalTripModelLanguageText.g:2853:1: rule__TravelService__Group__1 : rule__TravelService__Group__1__Impl rule__TravelService__Group__2 ;
    public final void rule__TravelService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2857:1: ( rule__TravelService__Group__1__Impl rule__TravelService__Group__2 )
            // InternalTripModelLanguageText.g:2858:2: rule__TravelService__Group__1__Impl rule__TravelService__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TravelService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__1"


    // $ANTLR start "rule__TravelService__Group__1__Impl"
    // InternalTripModelLanguageText.g:2865:1: rule__TravelService__Group__1__Impl : ( ( rule__TravelService__NameAssignment_1 ) ) ;
    public final void rule__TravelService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2869:1: ( ( ( rule__TravelService__NameAssignment_1 ) ) )
            // InternalTripModelLanguageText.g:2870:1: ( ( rule__TravelService__NameAssignment_1 ) )
            {
            // InternalTripModelLanguageText.g:2870:1: ( ( rule__TravelService__NameAssignment_1 ) )
            // InternalTripModelLanguageText.g:2871:2: ( rule__TravelService__NameAssignment_1 )
            {
             before(grammarAccess.getTravelServiceAccess().getNameAssignment_1()); 
            // InternalTripModelLanguageText.g:2872:2: ( rule__TravelService__NameAssignment_1 )
            // InternalTripModelLanguageText.g:2872:3: rule__TravelService__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__1__Impl"


    // $ANTLR start "rule__TravelService__Group__2"
    // InternalTripModelLanguageText.g:2880:1: rule__TravelService__Group__2 : rule__TravelService__Group__2__Impl rule__TravelService__Group__3 ;
    public final void rule__TravelService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2884:1: ( rule__TravelService__Group__2__Impl rule__TravelService__Group__3 )
            // InternalTripModelLanguageText.g:2885:2: rule__TravelService__Group__2__Impl rule__TravelService__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__TravelService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__2"


    // $ANTLR start "rule__TravelService__Group__2__Impl"
    // InternalTripModelLanguageText.g:2892:1: rule__TravelService__Group__2__Impl : ( '{' ) ;
    public final void rule__TravelService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2896:1: ( ( '{' ) )
            // InternalTripModelLanguageText.g:2897:1: ( '{' )
            {
            // InternalTripModelLanguageText.g:2897:1: ( '{' )
            // InternalTripModelLanguageText.g:2898:2: '{'
            {
             before(grammarAccess.getTravelServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__2__Impl"


    // $ANTLR start "rule__TravelService__Group__3"
    // InternalTripModelLanguageText.g:2907:1: rule__TravelService__Group__3 : rule__TravelService__Group__3__Impl rule__TravelService__Group__4 ;
    public final void rule__TravelService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2911:1: ( rule__TravelService__Group__3__Impl rule__TravelService__Group__4 )
            // InternalTripModelLanguageText.g:2912:2: rule__TravelService__Group__3__Impl rule__TravelService__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__TravelService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__3"


    // $ANTLR start "rule__TravelService__Group__3__Impl"
    // InternalTripModelLanguageText.g:2919:1: rule__TravelService__Group__3__Impl : ( ( rule__TravelService__Group_3__0 )? ) ;
    public final void rule__TravelService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2923:1: ( ( ( rule__TravelService__Group_3__0 )? ) )
            // InternalTripModelLanguageText.g:2924:1: ( ( rule__TravelService__Group_3__0 )? )
            {
            // InternalTripModelLanguageText.g:2924:1: ( ( rule__TravelService__Group_3__0 )? )
            // InternalTripModelLanguageText.g:2925:2: ( rule__TravelService__Group_3__0 )?
            {
             before(grammarAccess.getTravelServiceAccess().getGroup_3()); 
            // InternalTripModelLanguageText.g:2926:2: ( rule__TravelService__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTripModelLanguageText.g:2926:3: rule__TravelService__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TravelService__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTravelServiceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__3__Impl"


    // $ANTLR start "rule__TravelService__Group__4"
    // InternalTripModelLanguageText.g:2934:1: rule__TravelService__Group__4 : rule__TravelService__Group__4__Impl rule__TravelService__Group__5 ;
    public final void rule__TravelService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2938:1: ( rule__TravelService__Group__4__Impl rule__TravelService__Group__5 )
            // InternalTripModelLanguageText.g:2939:2: rule__TravelService__Group__4__Impl rule__TravelService__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__TravelService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__4"


    // $ANTLR start "rule__TravelService__Group__4__Impl"
    // InternalTripModelLanguageText.g:2946:1: rule__TravelService__Group__4__Impl : ( ( rule__TravelService__Group_4__0 )? ) ;
    public final void rule__TravelService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2950:1: ( ( ( rule__TravelService__Group_4__0 )? ) )
            // InternalTripModelLanguageText.g:2951:1: ( ( rule__TravelService__Group_4__0 )? )
            {
            // InternalTripModelLanguageText.g:2951:1: ( ( rule__TravelService__Group_4__0 )? )
            // InternalTripModelLanguageText.g:2952:2: ( rule__TravelService__Group_4__0 )?
            {
             before(grammarAccess.getTravelServiceAccess().getGroup_4()); 
            // InternalTripModelLanguageText.g:2953:2: ( rule__TravelService__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTripModelLanguageText.g:2953:3: rule__TravelService__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TravelService__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTravelServiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__4__Impl"


    // $ANTLR start "rule__TravelService__Group__5"
    // InternalTripModelLanguageText.g:2961:1: rule__TravelService__Group__5 : rule__TravelService__Group__5__Impl rule__TravelService__Group__6 ;
    public final void rule__TravelService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2965:1: ( rule__TravelService__Group__5__Impl rule__TravelService__Group__6 )
            // InternalTripModelLanguageText.g:2966:2: rule__TravelService__Group__5__Impl rule__TravelService__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__TravelService__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__5"


    // $ANTLR start "rule__TravelService__Group__5__Impl"
    // InternalTripModelLanguageText.g:2973:1: rule__TravelService__Group__5__Impl : ( ( rule__TravelService__Group_5__0 )? ) ;
    public final void rule__TravelService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2977:1: ( ( ( rule__TravelService__Group_5__0 )? ) )
            // InternalTripModelLanguageText.g:2978:1: ( ( rule__TravelService__Group_5__0 )? )
            {
            // InternalTripModelLanguageText.g:2978:1: ( ( rule__TravelService__Group_5__0 )? )
            // InternalTripModelLanguageText.g:2979:2: ( rule__TravelService__Group_5__0 )?
            {
             before(grammarAccess.getTravelServiceAccess().getGroup_5()); 
            // InternalTripModelLanguageText.g:2980:2: ( rule__TravelService__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTripModelLanguageText.g:2980:3: rule__TravelService__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TravelService__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTravelServiceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__5__Impl"


    // $ANTLR start "rule__TravelService__Group__6"
    // InternalTripModelLanguageText.g:2988:1: rule__TravelService__Group__6 : rule__TravelService__Group__6__Impl rule__TravelService__Group__7 ;
    public final void rule__TravelService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:2992:1: ( rule__TravelService__Group__6__Impl rule__TravelService__Group__7 )
            // InternalTripModelLanguageText.g:2993:2: rule__TravelService__Group__6__Impl rule__TravelService__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__TravelService__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__6"


    // $ANTLR start "rule__TravelService__Group__6__Impl"
    // InternalTripModelLanguageText.g:3000:1: rule__TravelService__Group__6__Impl : ( ( rule__TravelService__Group_6__0 )? ) ;
    public final void rule__TravelService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3004:1: ( ( ( rule__TravelService__Group_6__0 )? ) )
            // InternalTripModelLanguageText.g:3005:1: ( ( rule__TravelService__Group_6__0 )? )
            {
            // InternalTripModelLanguageText.g:3005:1: ( ( rule__TravelService__Group_6__0 )? )
            // InternalTripModelLanguageText.g:3006:2: ( rule__TravelService__Group_6__0 )?
            {
             before(grammarAccess.getTravelServiceAccess().getGroup_6()); 
            // InternalTripModelLanguageText.g:3007:2: ( rule__TravelService__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTripModelLanguageText.g:3007:3: rule__TravelService__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TravelService__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTravelServiceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__6__Impl"


    // $ANTLR start "rule__TravelService__Group__7"
    // InternalTripModelLanguageText.g:3015:1: rule__TravelService__Group__7 : rule__TravelService__Group__7__Impl rule__TravelService__Group__8 ;
    public final void rule__TravelService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3019:1: ( rule__TravelService__Group__7__Impl rule__TravelService__Group__8 )
            // InternalTripModelLanguageText.g:3020:2: rule__TravelService__Group__7__Impl rule__TravelService__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__TravelService__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__7"


    // $ANTLR start "rule__TravelService__Group__7__Impl"
    // InternalTripModelLanguageText.g:3027:1: rule__TravelService__Group__7__Impl : ( 'source' ) ;
    public final void rule__TravelService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3031:1: ( ( 'source' ) )
            // InternalTripModelLanguageText.g:3032:1: ( 'source' )
            {
            // InternalTripModelLanguageText.g:3032:1: ( 'source' )
            // InternalTripModelLanguageText.g:3033:2: 'source'
            {
             before(grammarAccess.getTravelServiceAccess().getSourceKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getSourceKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__7__Impl"


    // $ANTLR start "rule__TravelService__Group__8"
    // InternalTripModelLanguageText.g:3042:1: rule__TravelService__Group__8 : rule__TravelService__Group__8__Impl rule__TravelService__Group__9 ;
    public final void rule__TravelService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3046:1: ( rule__TravelService__Group__8__Impl rule__TravelService__Group__9 )
            // InternalTripModelLanguageText.g:3047:2: rule__TravelService__Group__8__Impl rule__TravelService__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__TravelService__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__8"


    // $ANTLR start "rule__TravelService__Group__8__Impl"
    // InternalTripModelLanguageText.g:3054:1: rule__TravelService__Group__8__Impl : ( ( rule__TravelService__SourceAssignment_8 ) ) ;
    public final void rule__TravelService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3058:1: ( ( ( rule__TravelService__SourceAssignment_8 ) ) )
            // InternalTripModelLanguageText.g:3059:1: ( ( rule__TravelService__SourceAssignment_8 ) )
            {
            // InternalTripModelLanguageText.g:3059:1: ( ( rule__TravelService__SourceAssignment_8 ) )
            // InternalTripModelLanguageText.g:3060:2: ( rule__TravelService__SourceAssignment_8 )
            {
             before(grammarAccess.getTravelServiceAccess().getSourceAssignment_8()); 
            // InternalTripModelLanguageText.g:3061:2: ( rule__TravelService__SourceAssignment_8 )
            // InternalTripModelLanguageText.g:3061:3: rule__TravelService__SourceAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__SourceAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getSourceAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__8__Impl"


    // $ANTLR start "rule__TravelService__Group__9"
    // InternalTripModelLanguageText.g:3069:1: rule__TravelService__Group__9 : rule__TravelService__Group__9__Impl rule__TravelService__Group__10 ;
    public final void rule__TravelService__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3073:1: ( rule__TravelService__Group__9__Impl rule__TravelService__Group__10 )
            // InternalTripModelLanguageText.g:3074:2: rule__TravelService__Group__9__Impl rule__TravelService__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__TravelService__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__9"


    // $ANTLR start "rule__TravelService__Group__9__Impl"
    // InternalTripModelLanguageText.g:3081:1: rule__TravelService__Group__9__Impl : ( 'destination' ) ;
    public final void rule__TravelService__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3085:1: ( ( 'destination' ) )
            // InternalTripModelLanguageText.g:3086:1: ( 'destination' )
            {
            // InternalTripModelLanguageText.g:3086:1: ( 'destination' )
            // InternalTripModelLanguageText.g:3087:2: 'destination'
            {
             before(grammarAccess.getTravelServiceAccess().getDestinationKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getDestinationKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__9__Impl"


    // $ANTLR start "rule__TravelService__Group__10"
    // InternalTripModelLanguageText.g:3096:1: rule__TravelService__Group__10 : rule__TravelService__Group__10__Impl rule__TravelService__Group__11 ;
    public final void rule__TravelService__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3100:1: ( rule__TravelService__Group__10__Impl rule__TravelService__Group__11 )
            // InternalTripModelLanguageText.g:3101:2: rule__TravelService__Group__10__Impl rule__TravelService__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__TravelService__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__10"


    // $ANTLR start "rule__TravelService__Group__10__Impl"
    // InternalTripModelLanguageText.g:3108:1: rule__TravelService__Group__10__Impl : ( ( rule__TravelService__DestinationAssignment_10 ) ) ;
    public final void rule__TravelService__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3112:1: ( ( ( rule__TravelService__DestinationAssignment_10 ) ) )
            // InternalTripModelLanguageText.g:3113:1: ( ( rule__TravelService__DestinationAssignment_10 ) )
            {
            // InternalTripModelLanguageText.g:3113:1: ( ( rule__TravelService__DestinationAssignment_10 ) )
            // InternalTripModelLanguageText.g:3114:2: ( rule__TravelService__DestinationAssignment_10 )
            {
             before(grammarAccess.getTravelServiceAccess().getDestinationAssignment_10()); 
            // InternalTripModelLanguageText.g:3115:2: ( rule__TravelService__DestinationAssignment_10 )
            // InternalTripModelLanguageText.g:3115:3: rule__TravelService__DestinationAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__DestinationAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getDestinationAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__10__Impl"


    // $ANTLR start "rule__TravelService__Group__11"
    // InternalTripModelLanguageText.g:3123:1: rule__TravelService__Group__11 : rule__TravelService__Group__11__Impl ;
    public final void rule__TravelService__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3127:1: ( rule__TravelService__Group__11__Impl )
            // InternalTripModelLanguageText.g:3128:2: rule__TravelService__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__11"


    // $ANTLR start "rule__TravelService__Group__11__Impl"
    // InternalTripModelLanguageText.g:3134:1: rule__TravelService__Group__11__Impl : ( '}' ) ;
    public final void rule__TravelService__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3138:1: ( ( '}' ) )
            // InternalTripModelLanguageText.g:3139:1: ( '}' )
            {
            // InternalTripModelLanguageText.g:3139:1: ( '}' )
            // InternalTripModelLanguageText.g:3140:2: '}'
            {
             before(grammarAccess.getTravelServiceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group__11__Impl"


    // $ANTLR start "rule__TravelService__Group_3__0"
    // InternalTripModelLanguageText.g:3150:1: rule__TravelService__Group_3__0 : rule__TravelService__Group_3__0__Impl rule__TravelService__Group_3__1 ;
    public final void rule__TravelService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3154:1: ( rule__TravelService__Group_3__0__Impl rule__TravelService__Group_3__1 )
            // InternalTripModelLanguageText.g:3155:2: rule__TravelService__Group_3__0__Impl rule__TravelService__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__TravelService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_3__0"


    // $ANTLR start "rule__TravelService__Group_3__0__Impl"
    // InternalTripModelLanguageText.g:3162:1: rule__TravelService__Group_3__0__Impl : ( 'Cost' ) ;
    public final void rule__TravelService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3166:1: ( ( 'Cost' ) )
            // InternalTripModelLanguageText.g:3167:1: ( 'Cost' )
            {
            // InternalTripModelLanguageText.g:3167:1: ( 'Cost' )
            // InternalTripModelLanguageText.g:3168:2: 'Cost'
            {
             before(grammarAccess.getTravelServiceAccess().getCostKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getCostKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_3__0__Impl"


    // $ANTLR start "rule__TravelService__Group_3__1"
    // InternalTripModelLanguageText.g:3177:1: rule__TravelService__Group_3__1 : rule__TravelService__Group_3__1__Impl ;
    public final void rule__TravelService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3181:1: ( rule__TravelService__Group_3__1__Impl )
            // InternalTripModelLanguageText.g:3182:2: rule__TravelService__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_3__1"


    // $ANTLR start "rule__TravelService__Group_3__1__Impl"
    // InternalTripModelLanguageText.g:3188:1: rule__TravelService__Group_3__1__Impl : ( ( rule__TravelService__CostAssignment_3_1 ) ) ;
    public final void rule__TravelService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3192:1: ( ( ( rule__TravelService__CostAssignment_3_1 ) ) )
            // InternalTripModelLanguageText.g:3193:1: ( ( rule__TravelService__CostAssignment_3_1 ) )
            {
            // InternalTripModelLanguageText.g:3193:1: ( ( rule__TravelService__CostAssignment_3_1 ) )
            // InternalTripModelLanguageText.g:3194:2: ( rule__TravelService__CostAssignment_3_1 )
            {
             before(grammarAccess.getTravelServiceAccess().getCostAssignment_3_1()); 
            // InternalTripModelLanguageText.g:3195:2: ( rule__TravelService__CostAssignment_3_1 )
            // InternalTripModelLanguageText.g:3195:3: rule__TravelService__CostAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__CostAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getCostAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_3__1__Impl"


    // $ANTLR start "rule__TravelService__Group_4__0"
    // InternalTripModelLanguageText.g:3204:1: rule__TravelService__Group_4__0 : rule__TravelService__Group_4__0__Impl rule__TravelService__Group_4__1 ;
    public final void rule__TravelService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3208:1: ( rule__TravelService__Group_4__0__Impl rule__TravelService__Group_4__1 )
            // InternalTripModelLanguageText.g:3209:2: rule__TravelService__Group_4__0__Impl rule__TravelService__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__TravelService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_4__0"


    // $ANTLR start "rule__TravelService__Group_4__0__Impl"
    // InternalTripModelLanguageText.g:3216:1: rule__TravelService__Group_4__0__Impl : ( 'Duration' ) ;
    public final void rule__TravelService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3220:1: ( ( 'Duration' ) )
            // InternalTripModelLanguageText.g:3221:1: ( 'Duration' )
            {
            // InternalTripModelLanguageText.g:3221:1: ( 'Duration' )
            // InternalTripModelLanguageText.g:3222:2: 'Duration'
            {
             before(grammarAccess.getTravelServiceAccess().getDurationKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getDurationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_4__0__Impl"


    // $ANTLR start "rule__TravelService__Group_4__1"
    // InternalTripModelLanguageText.g:3231:1: rule__TravelService__Group_4__1 : rule__TravelService__Group_4__1__Impl ;
    public final void rule__TravelService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3235:1: ( rule__TravelService__Group_4__1__Impl )
            // InternalTripModelLanguageText.g:3236:2: rule__TravelService__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_4__1"


    // $ANTLR start "rule__TravelService__Group_4__1__Impl"
    // InternalTripModelLanguageText.g:3242:1: rule__TravelService__Group_4__1__Impl : ( ( rule__TravelService__DurationAssignment_4_1 ) ) ;
    public final void rule__TravelService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3246:1: ( ( ( rule__TravelService__DurationAssignment_4_1 ) ) )
            // InternalTripModelLanguageText.g:3247:1: ( ( rule__TravelService__DurationAssignment_4_1 ) )
            {
            // InternalTripModelLanguageText.g:3247:1: ( ( rule__TravelService__DurationAssignment_4_1 ) )
            // InternalTripModelLanguageText.g:3248:2: ( rule__TravelService__DurationAssignment_4_1 )
            {
             before(grammarAccess.getTravelServiceAccess().getDurationAssignment_4_1()); 
            // InternalTripModelLanguageText.g:3249:2: ( rule__TravelService__DurationAssignment_4_1 )
            // InternalTripModelLanguageText.g:3249:3: rule__TravelService__DurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__DurationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getDurationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_4__1__Impl"


    // $ANTLR start "rule__TravelService__Group_5__0"
    // InternalTripModelLanguageText.g:3258:1: rule__TravelService__Group_5__0 : rule__TravelService__Group_5__0__Impl rule__TravelService__Group_5__1 ;
    public final void rule__TravelService__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3262:1: ( rule__TravelService__Group_5__0__Impl rule__TravelService__Group_5__1 )
            // InternalTripModelLanguageText.g:3263:2: rule__TravelService__Group_5__0__Impl rule__TravelService__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__TravelService__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_5__0"


    // $ANTLR start "rule__TravelService__Group_5__0__Impl"
    // InternalTripModelLanguageText.g:3270:1: rule__TravelService__Group_5__0__Impl : ( 'Rating' ) ;
    public final void rule__TravelService__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3274:1: ( ( 'Rating' ) )
            // InternalTripModelLanguageText.g:3275:1: ( 'Rating' )
            {
            // InternalTripModelLanguageText.g:3275:1: ( 'Rating' )
            // InternalTripModelLanguageText.g:3276:2: 'Rating'
            {
             before(grammarAccess.getTravelServiceAccess().getRatingKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getRatingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_5__0__Impl"


    // $ANTLR start "rule__TravelService__Group_5__1"
    // InternalTripModelLanguageText.g:3285:1: rule__TravelService__Group_5__1 : rule__TravelService__Group_5__1__Impl ;
    public final void rule__TravelService__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3289:1: ( rule__TravelService__Group_5__1__Impl )
            // InternalTripModelLanguageText.g:3290:2: rule__TravelService__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_5__1"


    // $ANTLR start "rule__TravelService__Group_5__1__Impl"
    // InternalTripModelLanguageText.g:3296:1: rule__TravelService__Group_5__1__Impl : ( ( rule__TravelService__RatingAssignment_5_1 ) ) ;
    public final void rule__TravelService__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3300:1: ( ( ( rule__TravelService__RatingAssignment_5_1 ) ) )
            // InternalTripModelLanguageText.g:3301:1: ( ( rule__TravelService__RatingAssignment_5_1 ) )
            {
            // InternalTripModelLanguageText.g:3301:1: ( ( rule__TravelService__RatingAssignment_5_1 ) )
            // InternalTripModelLanguageText.g:3302:2: ( rule__TravelService__RatingAssignment_5_1 )
            {
             before(grammarAccess.getTravelServiceAccess().getRatingAssignment_5_1()); 
            // InternalTripModelLanguageText.g:3303:2: ( rule__TravelService__RatingAssignment_5_1 )
            // InternalTripModelLanguageText.g:3303:3: rule__TravelService__RatingAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__RatingAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getRatingAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_5__1__Impl"


    // $ANTLR start "rule__TravelService__Group_6__0"
    // InternalTripModelLanguageText.g:3312:1: rule__TravelService__Group_6__0 : rule__TravelService__Group_6__0__Impl rule__TravelService__Group_6__1 ;
    public final void rule__TravelService__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3316:1: ( rule__TravelService__Group_6__0__Impl rule__TravelService__Group_6__1 )
            // InternalTripModelLanguageText.g:3317:2: rule__TravelService__Group_6__0__Impl rule__TravelService__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__TravelService__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TravelService__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_6__0"


    // $ANTLR start "rule__TravelService__Group_6__0__Impl"
    // InternalTripModelLanguageText.g:3324:1: rule__TravelService__Group_6__0__Impl : ( 'Type' ) ;
    public final void rule__TravelService__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3328:1: ( ( 'Type' ) )
            // InternalTripModelLanguageText.g:3329:1: ( 'Type' )
            {
            // InternalTripModelLanguageText.g:3329:1: ( 'Type' )
            // InternalTripModelLanguageText.g:3330:2: 'Type'
            {
             before(grammarAccess.getTravelServiceAccess().getTypeKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTravelServiceAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_6__0__Impl"


    // $ANTLR start "rule__TravelService__Group_6__1"
    // InternalTripModelLanguageText.g:3339:1: rule__TravelService__Group_6__1 : rule__TravelService__Group_6__1__Impl ;
    public final void rule__TravelService__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3343:1: ( rule__TravelService__Group_6__1__Impl )
            // InternalTripModelLanguageText.g:3344:2: rule__TravelService__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_6__1"


    // $ANTLR start "rule__TravelService__Group_6__1__Impl"
    // InternalTripModelLanguageText.g:3350:1: rule__TravelService__Group_6__1__Impl : ( ( rule__TravelService__TypeAssignment_6_1 ) ) ;
    public final void rule__TravelService__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3354:1: ( ( ( rule__TravelService__TypeAssignment_6_1 ) ) )
            // InternalTripModelLanguageText.g:3355:1: ( ( rule__TravelService__TypeAssignment_6_1 ) )
            {
            // InternalTripModelLanguageText.g:3355:1: ( ( rule__TravelService__TypeAssignment_6_1 ) )
            // InternalTripModelLanguageText.g:3356:2: ( rule__TravelService__TypeAssignment_6_1 )
            {
             before(grammarAccess.getTravelServiceAccess().getTypeAssignment_6_1()); 
            // InternalTripModelLanguageText.g:3357:2: ( rule__TravelService__TypeAssignment_6_1 )
            // InternalTripModelLanguageText.g:3357:3: rule__TravelService__TypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TravelService__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTravelServiceAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__Group_6__1__Impl"


    // $ANTLR start "rule__TripModel__TripAssignment_3_2"
    // InternalTripModelLanguageText.g:3366:1: rule__TripModel__TripAssignment_3_2 : ( ruleTrip ) ;
    public final void rule__TripModel__TripAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3370:1: ( ( ruleTrip ) )
            // InternalTripModelLanguageText.g:3371:2: ( ruleTrip )
            {
            // InternalTripModelLanguageText.g:3371:2: ( ruleTrip )
            // InternalTripModelLanguageText.g:3372:3: ruleTrip
            {
             before(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTrip();

            state._fsp--;

             after(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__TripAssignment_3_2"


    // $ANTLR start "rule__TripModel__TripAssignment_3_3_1"
    // InternalTripModelLanguageText.g:3381:1: rule__TripModel__TripAssignment_3_3_1 : ( ruleTrip ) ;
    public final void rule__TripModel__TripAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3385:1: ( ( ruleTrip ) )
            // InternalTripModelLanguageText.g:3386:2: ( ruleTrip )
            {
            // InternalTripModelLanguageText.g:3386:2: ( ruleTrip )
            // InternalTripModelLanguageText.g:3387:3: ruleTrip
            {
             before(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrip();

            state._fsp--;

             after(grammarAccess.getTripModelAccess().getTripTripParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__TripAssignment_3_3_1"


    // $ANTLR start "rule__TripModel__LocationAssignment_4_2"
    // InternalTripModelLanguageText.g:3396:1: rule__TripModel__LocationAssignment_4_2 : ( rulelocation ) ;
    public final void rule__TripModel__LocationAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3400:1: ( ( rulelocation ) )
            // InternalTripModelLanguageText.g:3401:2: ( rulelocation )
            {
            // InternalTripModelLanguageText.g:3401:2: ( rulelocation )
            // InternalTripModelLanguageText.g:3402:3: rulelocation
            {
             before(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulelocation();

            state._fsp--;

             after(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__LocationAssignment_4_2"


    // $ANTLR start "rule__TripModel__LocationAssignment_4_3_1"
    // InternalTripModelLanguageText.g:3411:1: rule__TripModel__LocationAssignment_4_3_1 : ( rulelocation ) ;
    public final void rule__TripModel__LocationAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3415:1: ( ( rulelocation ) )
            // InternalTripModelLanguageText.g:3416:2: ( rulelocation )
            {
            // InternalTripModelLanguageText.g:3416:2: ( rulelocation )
            // InternalTripModelLanguageText.g:3417:3: rulelocation
            {
             before(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulelocation();

            state._fsp--;

             after(grammarAccess.getTripModelAccess().getLocationLocationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TripModel__LocationAssignment_4_3_1"


    // $ANTLR start "rule__Trip__NameAssignment_1"
    // InternalTripModelLanguageText.g:3426:1: rule__Trip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Trip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3430:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3431:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3431:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3432:3: ruleEString
            {
             before(grammarAccess.getTripAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTripAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__NameAssignment_1"


    // $ANTLR start "rule__Trip__EndAssignment_3_1"
    // InternalTripModelLanguageText.g:3441:1: rule__Trip__EndAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__Trip__EndAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3445:1: ( ( ruleEDate ) )
            // InternalTripModelLanguageText.g:3446:2: ( ruleEDate )
            {
            // InternalTripModelLanguageText.g:3446:2: ( ruleEDate )
            // InternalTripModelLanguageText.g:3447:3: ruleEDate
            {
             before(grammarAccess.getTripAccess().getEndEDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getTripAccess().getEndEDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__EndAssignment_3_1"


    // $ANTLR start "rule__Trip__StartAssignment_4_1"
    // InternalTripModelLanguageText.g:3456:1: rule__Trip__StartAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__Trip__StartAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3460:1: ( ( ruleEDate ) )
            // InternalTripModelLanguageText.g:3461:2: ( ruleEDate )
            {
            // InternalTripModelLanguageText.g:3461:2: ( ruleEDate )
            // InternalTripModelLanguageText.g:3462:3: ruleEDate
            {
             before(grammarAccess.getTripAccess().getStartEDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getTripAccess().getStartEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__StartAssignment_4_1"


    // $ANTLR start "rule__Trip__SourceAssignment_6"
    // InternalTripModelLanguageText.g:3471:1: rule__Trip__SourceAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Trip__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3475:1: ( ( ( ruleEString ) ) )
            // InternalTripModelLanguageText.g:3476:2: ( ( ruleEString ) )
            {
            // InternalTripModelLanguageText.g:3476:2: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3477:3: ( ruleEString )
            {
             before(grammarAccess.getTripAccess().getSourceLocationCrossReference_6_0()); 
            // InternalTripModelLanguageText.g:3478:3: ( ruleEString )
            // InternalTripModelLanguageText.g:3479:4: ruleEString
            {
             before(grammarAccess.getTripAccess().getSourceLocationEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTripAccess().getSourceLocationEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTripAccess().getSourceLocationCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__SourceAssignment_6"


    // $ANTLR start "rule__Trip__DestinationAssignment_8"
    // InternalTripModelLanguageText.g:3490:1: rule__Trip__DestinationAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Trip__DestinationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3494:1: ( ( ( ruleEString ) ) )
            // InternalTripModelLanguageText.g:3495:2: ( ( ruleEString ) )
            {
            // InternalTripModelLanguageText.g:3495:2: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3496:3: ( ruleEString )
            {
             before(grammarAccess.getTripAccess().getDestinationLocationCrossReference_8_0()); 
            // InternalTripModelLanguageText.g:3497:3: ( ruleEString )
            // InternalTripModelLanguageText.g:3498:4: ruleEString
            {
             before(grammarAccess.getTripAccess().getDestinationLocationEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTripAccess().getDestinationLocationEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getTripAccess().getDestinationLocationCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__DestinationAssignment_8"


    // $ANTLR start "rule__Trip__ServiceAssignment_9_2"
    // InternalTripModelLanguageText.g:3509:1: rule__Trip__ServiceAssignment_9_2 : ( ruleService ) ;
    public final void rule__Trip__ServiceAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3513:1: ( ( ruleService ) )
            // InternalTripModelLanguageText.g:3514:2: ( ruleService )
            {
            // InternalTripModelLanguageText.g:3514:2: ( ruleService )
            // InternalTripModelLanguageText.g:3515:3: ruleService
            {
             before(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__ServiceAssignment_9_2"


    // $ANTLR start "rule__Trip__ServiceAssignment_9_3_1"
    // InternalTripModelLanguageText.g:3524:1: rule__Trip__ServiceAssignment_9_3_1 : ( ruleService ) ;
    public final void rule__Trip__ServiceAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3528:1: ( ( ruleService ) )
            // InternalTripModelLanguageText.g:3529:2: ( ruleService )
            {
            // InternalTripModelLanguageText.g:3529:2: ( ruleService )
            // InternalTripModelLanguageText.g:3530:3: ruleService
            {
             before(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getTripAccess().getServiceServiceParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trip__ServiceAssignment_9_3_1"


    // $ANTLR start "rule__Location__NameAssignment_2"
    // InternalTripModelLanguageText.g:3539:1: rule__Location__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Location__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3543:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3544:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3544:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3545:3: ruleEString
            {
             before(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__NameAssignment_2"


    // $ANTLR start "rule__Service_Impl__NameAssignment_2"
    // InternalTripModelLanguageText.g:3554:1: rule__Service_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Service_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3558:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3559:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3559:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3560:3: ruleEString
            {
             before(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__NameAssignment_2"


    // $ANTLR start "rule__Service_Impl__CostAssignment_4_1"
    // InternalTripModelLanguageText.g:3569:1: rule__Service_Impl__CostAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__Service_Impl__CostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3573:1: ( ( ruleEFloat ) )
            // InternalTripModelLanguageText.g:3574:2: ( ruleEFloat )
            {
            // InternalTripModelLanguageText.g:3574:2: ( ruleEFloat )
            // InternalTripModelLanguageText.g:3575:3: ruleEFloat
            {
             before(grammarAccess.getService_ImplAccess().getCostEFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getService_ImplAccess().getCostEFloatParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__CostAssignment_4_1"


    // $ANTLR start "rule__Service_Impl__DurationAssignment_5_1"
    // InternalTripModelLanguageText.g:3584:1: rule__Service_Impl__DurationAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Service_Impl__DurationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3588:1: ( ( ruleEInt ) )
            // InternalTripModelLanguageText.g:3589:2: ( ruleEInt )
            {
            // InternalTripModelLanguageText.g:3589:2: ( ruleEInt )
            // InternalTripModelLanguageText.g:3590:3: ruleEInt
            {
             before(grammarAccess.getService_ImplAccess().getDurationEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getService_ImplAccess().getDurationEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__DurationAssignment_5_1"


    // $ANTLR start "rule__Service_Impl__RatingAssignment_6_1"
    // InternalTripModelLanguageText.g:3599:1: rule__Service_Impl__RatingAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Service_Impl__RatingAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3603:1: ( ( ruleEInt ) )
            // InternalTripModelLanguageText.g:3604:2: ( ruleEInt )
            {
            // InternalTripModelLanguageText.g:3604:2: ( ruleEInt )
            // InternalTripModelLanguageText.g:3605:3: ruleEInt
            {
             before(grammarAccess.getService_ImplAccess().getRatingEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getService_ImplAccess().getRatingEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__RatingAssignment_6_1"


    // $ANTLR start "rule__Service_Impl__TypeAssignment_7_1"
    // InternalTripModelLanguageText.g:3614:1: rule__Service_Impl__TypeAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Service_Impl__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3618:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3619:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3619:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3620:3: ruleEString
            {
             before(grammarAccess.getService_ImplAccess().getTypeEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getService_ImplAccess().getTypeEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__TypeAssignment_7_1"


    // $ANTLR start "rule__OtherService__NameAssignment_1"
    // InternalTripModelLanguageText.g:3629:1: rule__OtherService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OtherService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3633:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3634:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3634:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3635:3: ruleEString
            {
             before(grammarAccess.getOtherServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__NameAssignment_1"


    // $ANTLR start "rule__OtherService__CostAssignment_3_1"
    // InternalTripModelLanguageText.g:3644:1: rule__OtherService__CostAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__OtherService__CostAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3648:1: ( ( ruleEFloat ) )
            // InternalTripModelLanguageText.g:3649:2: ( ruleEFloat )
            {
            // InternalTripModelLanguageText.g:3649:2: ( ruleEFloat )
            // InternalTripModelLanguageText.g:3650:3: ruleEFloat
            {
             before(grammarAccess.getOtherServiceAccess().getCostEFloatParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getOtherServiceAccess().getCostEFloatParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__CostAssignment_3_1"


    // $ANTLR start "rule__OtherService__DurationAssignment_4_1"
    // InternalTripModelLanguageText.g:3659:1: rule__OtherService__DurationAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__OtherService__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3663:1: ( ( ruleEInt ) )
            // InternalTripModelLanguageText.g:3664:2: ( ruleEInt )
            {
            // InternalTripModelLanguageText.g:3664:2: ( ruleEInt )
            // InternalTripModelLanguageText.g:3665:3: ruleEInt
            {
             before(grammarAccess.getOtherServiceAccess().getDurationEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOtherServiceAccess().getDurationEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__DurationAssignment_4_1"


    // $ANTLR start "rule__OtherService__RatingAssignment_5_1"
    // InternalTripModelLanguageText.g:3674:1: rule__OtherService__RatingAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__OtherService__RatingAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3678:1: ( ( ruleEInt ) )
            // InternalTripModelLanguageText.g:3679:2: ( ruleEInt )
            {
            // InternalTripModelLanguageText.g:3679:2: ( ruleEInt )
            // InternalTripModelLanguageText.g:3680:3: ruleEInt
            {
             before(grammarAccess.getOtherServiceAccess().getRatingEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOtherServiceAccess().getRatingEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__RatingAssignment_5_1"


    // $ANTLR start "rule__OtherService__TypeAssignment_6_1"
    // InternalTripModelLanguageText.g:3689:1: rule__OtherService__TypeAssignment_6_1 : ( ruleEString ) ;
    public final void rule__OtherService__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3693:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3694:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3694:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3695:3: ruleEString
            {
             before(grammarAccess.getOtherServiceAccess().getTypeEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherServiceAccess().getTypeEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__TypeAssignment_6_1"


    // $ANTLR start "rule__OtherService__LocationAssignment_8"
    // InternalTripModelLanguageText.g:3704:1: rule__OtherService__LocationAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__OtherService__LocationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3708:1: ( ( ( ruleEString ) ) )
            // InternalTripModelLanguageText.g:3709:2: ( ( ruleEString ) )
            {
            // InternalTripModelLanguageText.g:3709:2: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3710:3: ( ruleEString )
            {
             before(grammarAccess.getOtherServiceAccess().getLocationLocationCrossReference_8_0()); 
            // InternalTripModelLanguageText.g:3711:3: ( ruleEString )
            // InternalTripModelLanguageText.g:3712:4: ruleEString
            {
             before(grammarAccess.getOtherServiceAccess().getLocationLocationEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOtherServiceAccess().getLocationLocationEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getOtherServiceAccess().getLocationLocationCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherService__LocationAssignment_8"


    // $ANTLR start "rule__TravelService__NameAssignment_1"
    // InternalTripModelLanguageText.g:3723:1: rule__TravelService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TravelService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3727:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3728:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3728:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3729:3: ruleEString
            {
             before(grammarAccess.getTravelServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTravelServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__NameAssignment_1"


    // $ANTLR start "rule__TravelService__CostAssignment_3_1"
    // InternalTripModelLanguageText.g:3738:1: rule__TravelService__CostAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__TravelService__CostAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3742:1: ( ( ruleEFloat ) )
            // InternalTripModelLanguageText.g:3743:2: ( ruleEFloat )
            {
            // InternalTripModelLanguageText.g:3743:2: ( ruleEFloat )
            // InternalTripModelLanguageText.g:3744:3: ruleEFloat
            {
             before(grammarAccess.getTravelServiceAccess().getCostEFloatParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getTravelServiceAccess().getCostEFloatParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__CostAssignment_3_1"


    // $ANTLR start "rule__TravelService__DurationAssignment_4_1"
    // InternalTripModelLanguageText.g:3753:1: rule__TravelService__DurationAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__TravelService__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3757:1: ( ( ruleEInt ) )
            // InternalTripModelLanguageText.g:3758:2: ( ruleEInt )
            {
            // InternalTripModelLanguageText.g:3758:2: ( ruleEInt )
            // InternalTripModelLanguageText.g:3759:3: ruleEInt
            {
             before(grammarAccess.getTravelServiceAccess().getDurationEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTravelServiceAccess().getDurationEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__DurationAssignment_4_1"


    // $ANTLR start "rule__TravelService__RatingAssignment_5_1"
    // InternalTripModelLanguageText.g:3768:1: rule__TravelService__RatingAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__TravelService__RatingAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3772:1: ( ( ruleEInt ) )
            // InternalTripModelLanguageText.g:3773:2: ( ruleEInt )
            {
            // InternalTripModelLanguageText.g:3773:2: ( ruleEInt )
            // InternalTripModelLanguageText.g:3774:3: ruleEInt
            {
             before(grammarAccess.getTravelServiceAccess().getRatingEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTravelServiceAccess().getRatingEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__RatingAssignment_5_1"


    // $ANTLR start "rule__TravelService__TypeAssignment_6_1"
    // InternalTripModelLanguageText.g:3783:1: rule__TravelService__TypeAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TravelService__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3787:1: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3788:2: ( ruleEString )
            {
            // InternalTripModelLanguageText.g:3788:2: ( ruleEString )
            // InternalTripModelLanguageText.g:3789:3: ruleEString
            {
             before(grammarAccess.getTravelServiceAccess().getTypeEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTravelServiceAccess().getTypeEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__TypeAssignment_6_1"


    // $ANTLR start "rule__TravelService__SourceAssignment_8"
    // InternalTripModelLanguageText.g:3798:1: rule__TravelService__SourceAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__TravelService__SourceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3802:1: ( ( ( ruleEString ) ) )
            // InternalTripModelLanguageText.g:3803:2: ( ( ruleEString ) )
            {
            // InternalTripModelLanguageText.g:3803:2: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3804:3: ( ruleEString )
            {
             before(grammarAccess.getTravelServiceAccess().getSourceLocationCrossReference_8_0()); 
            // InternalTripModelLanguageText.g:3805:3: ( ruleEString )
            // InternalTripModelLanguageText.g:3806:4: ruleEString
            {
             before(grammarAccess.getTravelServiceAccess().getSourceLocationEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTravelServiceAccess().getSourceLocationEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getTravelServiceAccess().getSourceLocationCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__SourceAssignment_8"


    // $ANTLR start "rule__TravelService__DestinationAssignment_10"
    // InternalTripModelLanguageText.g:3817:1: rule__TravelService__DestinationAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__TravelService__DestinationAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTripModelLanguageText.g:3821:1: ( ( ( ruleEString ) ) )
            // InternalTripModelLanguageText.g:3822:2: ( ( ruleEString ) )
            {
            // InternalTripModelLanguageText.g:3822:2: ( ( ruleEString ) )
            // InternalTripModelLanguageText.g:3823:3: ( ruleEString )
            {
             before(grammarAccess.getTravelServiceAccess().getDestinationLocationCrossReference_10_0()); 
            // InternalTripModelLanguageText.g:3824:3: ( ruleEString )
            // InternalTripModelLanguageText.g:3825:4: ruleEString
            {
             before(grammarAccess.getTravelServiceAccess().getDestinationLocationEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTravelServiceAccess().getDestinationLocationEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getTravelServiceAccess().getDestinationLocationCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TravelService__DestinationAssignment_10"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000604000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000078010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000180000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000078080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000078200000L});

}