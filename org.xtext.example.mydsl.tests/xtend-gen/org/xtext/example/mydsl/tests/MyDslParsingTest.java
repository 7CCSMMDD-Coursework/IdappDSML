/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.tests.MyDslInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslParsingTest {
  @Inject
  private /* ParseHelper<Model> */Object parseHelper;
  
  @Test
  public void loadModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field MyDslParsingTest.parseHelper refers to the missing type Model"
      + "\neResource cannot be resolved"
      + "\nerrors cannot be resolved"
      + "\nisEmpty cannot be resolved"
      + "\njoin cannot be resolved");
  }
}
