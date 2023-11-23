package marcellojeongipcommand.common;

import io.cucumber.spring.CucumberContextConfiguration;
import marcellojeongipcommand.PolicyCheckerApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PolicyCheckerApplication.class })
public class CucumberSpingConfiguration {}
