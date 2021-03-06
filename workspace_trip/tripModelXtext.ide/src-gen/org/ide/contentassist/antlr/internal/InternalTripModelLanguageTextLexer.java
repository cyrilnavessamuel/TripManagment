package org.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTripModelLanguageTextLexer extends Lexer {
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

    public InternalTripModelLanguageTextLexer() {;} 
    public InternalTripModelLanguageTextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTripModelLanguageTextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTripModelLanguageText.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:11:7: ( 'E' )
            // InternalTripModelLanguageText.g:11:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:12:7: ( 'e' )
            // InternalTripModelLanguageText.g:12:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:13:7: ( 'TripModel' )
            // InternalTripModelLanguageText.g:13:9: 'TripModel'
            {
            match("TripModel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:14:7: ( '{' )
            // InternalTripModelLanguageText.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:15:7: ( '}' )
            // InternalTripModelLanguageText.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:16:7: ( 'trip' )
            // InternalTripModelLanguageText.g:16:9: 'trip'
            {
            match("trip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:17:7: ( ',' )
            // InternalTripModelLanguageText.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:18:7: ( 'location' )
            // InternalTripModelLanguageText.g:18:9: 'location'
            {
            match("location"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:19:7: ( 'Trip' )
            // InternalTripModelLanguageText.g:19:9: 'Trip'
            {
            match("Trip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:20:7: ( 'source' )
            // InternalTripModelLanguageText.g:20:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:21:7: ( 'destination' )
            // InternalTripModelLanguageText.g:21:9: 'destination'
            {
            match("destination"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:22:7: ( 'End' )
            // InternalTripModelLanguageText.g:22:9: 'End'
            {
            match("End"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:23:7: ( 'Start' )
            // InternalTripModelLanguageText.g:23:9: 'Start'
            {
            match("Start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:24:7: ( 'service' )
            // InternalTripModelLanguageText.g:24:9: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:25:7: ( 'Service' )
            // InternalTripModelLanguageText.g:25:9: 'Service'
            {
            match("Service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:26:7: ( 'Cost' )
            // InternalTripModelLanguageText.g:26:9: 'Cost'
            {
            match("Cost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:27:7: ( 'Duration' )
            // InternalTripModelLanguageText.g:27:9: 'Duration'
            {
            match("Duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:28:7: ( 'Rating' )
            // InternalTripModelLanguageText.g:28:9: 'Rating'
            {
            match("Rating"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:29:7: ( 'Type' )
            // InternalTripModelLanguageText.g:29:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:30:7: ( '-' )
            // InternalTripModelLanguageText.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:31:7: ( '.' )
            // InternalTripModelLanguageText.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:32:7: ( 'OtherService' )
            // InternalTripModelLanguageText.g:32:9: 'OtherService'
            {
            match("OtherService"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:33:7: ( 'TravelService' )
            // InternalTripModelLanguageText.g:33:9: 'TravelService'
            {
            match("TravelService"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3836:11: ( ( '0' .. '9' )* '-' ( '0' .. '9' )* '-' ( '0' .. '9' )* )
            // InternalTripModelLanguageText.g:3836:13: ( '0' .. '9' )* '-' ( '0' .. '9' )* '-' ( '0' .. '9' )*
            {
            // InternalTripModelLanguageText.g:3836:13: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:3836:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('-'); 
            // InternalTripModelLanguageText.g:3836:29: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:3836:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('-'); 
            // InternalTripModelLanguageText.g:3836:45: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:3836:46: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3838:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTripModelLanguageText.g:3838:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTripModelLanguageText.g:3838:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTripModelLanguageText.g:3838:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTripModelLanguageText.g:3838:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3840:10: ( ( '0' .. '9' )+ )
            // InternalTripModelLanguageText.g:3840:12: ( '0' .. '9' )+
            {
            // InternalTripModelLanguageText.g:3840:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:3840:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3842:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTripModelLanguageText.g:3842:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTripModelLanguageText.g:3842:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTripModelLanguageText.g:3842:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTripModelLanguageText.g:3842:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTripModelLanguageText.g:3842:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTripModelLanguageText.g:3842:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTripModelLanguageText.g:3842:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTripModelLanguageText.g:3842:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalTripModelLanguageText.g:3842:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTripModelLanguageText.g:3842:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3844:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTripModelLanguageText.g:3844:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTripModelLanguageText.g:3844:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:3844:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3846:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTripModelLanguageText.g:3846:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTripModelLanguageText.g:3846:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:3846:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalTripModelLanguageText.g:3846:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTripModelLanguageText.g:3846:41: ( '\\r' )? '\\n'
                    {
                    // InternalTripModelLanguageText.g:3846:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalTripModelLanguageText.g:3846:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3848:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTripModelLanguageText.g:3848:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTripModelLanguageText.g:3848:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTripModelLanguageText.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTripModelLanguageText.g:3850:16: ( . )
            // InternalTripModelLanguageText.g:3850:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTripModelLanguageText.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=31;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalTripModelLanguageText.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalTripModelLanguageText.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalTripModelLanguageText.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalTripModelLanguageText.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalTripModelLanguageText.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalTripModelLanguageText.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalTripModelLanguageText.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalTripModelLanguageText.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalTripModelLanguageText.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalTripModelLanguageText.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalTripModelLanguageText.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalTripModelLanguageText.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalTripModelLanguageText.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalTripModelLanguageText.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalTripModelLanguageText.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalTripModelLanguageText.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalTripModelLanguageText.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalTripModelLanguageText.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalTripModelLanguageText.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalTripModelLanguageText.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalTripModelLanguageText.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalTripModelLanguageText.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalTripModelLanguageText.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalTripModelLanguageText.g:1:148: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 25 :
                // InternalTripModelLanguageText.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalTripModelLanguageText.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalTripModelLanguageText.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalTripModelLanguageText.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalTripModelLanguageText.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalTripModelLanguageText.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalTripModelLanguageText.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\34\1\35\1\33\2\uffff\1\33\1\uffff\7\33\1\55\1\uffff\1\33\1\62\1\31\1\uffff\3\31\2\uffff\1\33\3\uffff\2\33\2\uffff\1\33\1\uffff\11\33\3\uffff\1\33\1\62\5\uffff\1\106\16\33\1\uffff\1\126\1\33\1\130\1\131\6\33\1\140\4\33\1\uffff\1\33\2\uffff\4\33\1\152\1\33\1\uffff\6\33\1\162\2\33\1\uffff\2\33\1\167\4\33\1\uffff\1\174\1\33\1\176\1\33\1\uffff\3\33\1\u0083\1\uffff\1\33\1\uffff\1\u0085\1\33\1\u0087\1\33\1\uffff\1\33\1\uffff\1\33\1\uffff\4\33\1\u008f\2\33\1\uffff\1\u0092\1\u0093\2\uffff";
    static final String DFA15_eofS =
        "\u0094\uffff";
    static final String DFA15_minS =
        "\1\0\2\60\1\162\2\uffff\1\162\1\uffff\1\157\3\145\1\157\1\165\1\141\1\55\1\uffff\1\164\1\55\1\101\1\uffff\2\0\1\52\2\uffff\1\144\3\uffff\1\141\1\160\2\uffff\1\151\1\uffff\1\143\1\165\1\162\1\163\1\141\1\162\1\163\1\162\1\164\3\uffff\1\150\1\55\5\uffff\1\60\1\160\1\166\1\145\1\160\1\141\1\162\1\166\1\164\1\162\1\166\1\164\1\141\1\151\1\145\1\uffff\1\60\1\145\2\60\1\164\1\143\2\151\1\164\1\151\1\60\1\164\1\156\1\162\1\157\1\uffff\1\154\2\uffff\1\151\1\145\1\143\1\156\1\60\1\143\1\uffff\1\151\1\147\1\123\1\144\1\123\1\157\1\60\1\145\1\141\1\uffff\1\145\1\157\1\60\3\145\1\156\1\uffff\1\60\1\164\1\60\1\156\1\uffff\1\162\1\154\1\162\1\60\1\uffff\1\151\1\uffff\1\60\1\166\1\60\1\166\1\uffff\1\157\1\uffff\1\151\1\uffff\1\151\1\156\2\143\1\60\2\145\1\uffff\2\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\172\1\171\2\uffff\1\162\1\uffff\2\157\1\145\1\164\1\157\1\165\1\141\1\71\1\uffff\1\164\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\144\3\uffff\1\151\1\160\2\uffff\1\151\1\uffff\1\143\1\165\1\162\1\163\1\141\1\162\1\163\1\162\1\164\3\uffff\1\150\1\71\5\uffff\1\172\1\160\1\166\1\145\1\160\1\141\1\162\1\166\1\164\1\162\1\166\1\164\1\141\1\151\1\145\1\uffff\1\172\1\145\2\172\1\164\1\143\2\151\1\164\1\151\1\172\1\164\1\156\1\162\1\157\1\uffff\1\154\2\uffff\1\151\1\145\1\143\1\156\1\172\1\143\1\uffff\1\151\1\147\1\123\1\144\1\123\1\157\1\172\1\145\1\141\1\uffff\1\145\1\157\1\172\3\145\1\156\1\uffff\1\172\1\164\1\172\1\156\1\uffff\1\162\1\154\1\162\1\172\1\uffff\1\151\1\uffff\1\172\1\166\1\172\1\166\1\uffff\1\157\1\uffff\1\151\1\uffff\1\151\1\156\2\143\1\172\2\145\1\uffff\2\172\2\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\5\1\uffff\1\7\10\uffff\1\25\3\uffff\1\31\3\uffff\1\36\1\37\1\uffff\1\31\1\1\1\2\2\uffff\1\4\1\5\1\uffff\1\7\11\uffff\1\24\1\30\1\25\2\uffff\1\32\1\33\1\34\1\35\1\36\17\uffff\1\14\17\uffff\1\11\1\uffff\1\23\1\6\6\uffff\1\20\11\uffff\1\15\7\uffff\1\12\4\uffff\1\22\4\uffff\1\16\1\uffff\1\17\4\uffff\1\10\1\uffff\1\21\1\uffff\1\3\7\uffff\1\13\2\uffff\1\26\1\27";
    static final String DFA15_specialS =
        "\1\2\24\uffff\1\1\1\0\175\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\4\31\1\7\1\17\1\20\1\27\12\22\7\31\2\24\1\14\1\15\1\1\11\24\1\21\2\24\1\16\1\13\1\3\6\24\3\31\1\23\1\24\1\31\3\24\1\12\1\2\6\24\1\10\6\24\1\11\1\6\6\24\1\4\1\31\1\5\uff82\31",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\32\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\36\6\uffff\1\37",
            "",
            "",
            "\1\42",
            "",
            "\1\44",
            "\1\46\11\uffff\1\45",
            "\1\47",
            "\1\51\16\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56\2\uffff\12\56",
            "",
            "\1\60",
            "\1\56\2\uffff\12\61",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\63",
            "\0\63",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "\1\67",
            "",
            "",
            "",
            "\1\71\7\uffff\1\70",
            "\1\72",
            "",
            "",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "",
            "\1\105",
            "\1\56\2\uffff\12\61",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\12\33\7\uffff\14\33\1\125\15\33\4\uffff\1\33\1\uffff\32\33",
            "\1\127",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\175",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0084",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0086",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0090",
            "\1\u0091",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_22 = input.LA(1);

                        s = -1;
                        if ( ((LA15_22>='\u0000' && LA15_22<='\uFFFF')) ) {s = 51;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_21 = input.LA(1);

                        s = -1;
                        if ( ((LA15_21>='\u0000' && LA15_21<='\uFFFF')) ) {s = 51;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='E') ) {s = 1;}

                        else if ( (LA15_0=='e') ) {s = 2;}

                        else if ( (LA15_0=='T') ) {s = 3;}

                        else if ( (LA15_0=='{') ) {s = 4;}

                        else if ( (LA15_0=='}') ) {s = 5;}

                        else if ( (LA15_0=='t') ) {s = 6;}

                        else if ( (LA15_0==',') ) {s = 7;}

                        else if ( (LA15_0=='l') ) {s = 8;}

                        else if ( (LA15_0=='s') ) {s = 9;}

                        else if ( (LA15_0=='d') ) {s = 10;}

                        else if ( (LA15_0=='S') ) {s = 11;}

                        else if ( (LA15_0=='C') ) {s = 12;}

                        else if ( (LA15_0=='D') ) {s = 13;}

                        else if ( (LA15_0=='R') ) {s = 14;}

                        else if ( (LA15_0=='-') ) {s = 15;}

                        else if ( (LA15_0=='.') ) {s = 16;}

                        else if ( (LA15_0=='O') ) {s = 17;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 18;}

                        else if ( (LA15_0=='^') ) {s = 19;}

                        else if ( ((LA15_0>='A' && LA15_0<='B')||(LA15_0>='F' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='Q')||(LA15_0>='U' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||(LA15_0>='f' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='z')) ) {s = 20;}

                        else if ( (LA15_0=='\"') ) {s = 21;}

                        else if ( (LA15_0=='\'') ) {s = 22;}

                        else if ( (LA15_0=='/') ) {s = 23;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 24;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}