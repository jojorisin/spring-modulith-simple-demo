package se.jensen.johanna.modularmonolithdemo;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

// Test som verifierar att inga moduler bryter mot sina regler
public class ArchitectureTest {

  @Test
  void verifyModularArchitecture() {
    ApplicationModules modules = ApplicationModules.of(ModularMonolithDemoApplication.class);

    modules.verify();
  }

}
