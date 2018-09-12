/**
 * generated by Xtext 2.12.0
 */
package org.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.TripModelLanguageTextRuntimeModule;
import org.TripModelLanguageTextStandaloneSetup;
import org.eclipse.xtext.util.Modules2;
import org.ide.TripModelLanguageTextIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TripModelLanguageTextIdeSetup extends TripModelLanguageTextStandaloneSetup {
  @Override
  public Injector createInjector() {
    TripModelLanguageTextRuntimeModule _tripModelLanguageTextRuntimeModule = new TripModelLanguageTextRuntimeModule();
    TripModelLanguageTextIdeModule _tripModelLanguageTextIdeModule = new TripModelLanguageTextIdeModule();
    return Guice.createInjector(Modules2.mixin(_tripModelLanguageTextRuntimeModule, _tripModelLanguageTextIdeModule));
  }
}