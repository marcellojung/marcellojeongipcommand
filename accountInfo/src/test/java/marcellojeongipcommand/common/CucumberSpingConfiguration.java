package marcellojeongipcommand.common;

import io.cucumber.spring.CucumberContextConfiguration;
import marcellojeongipcommand.AccountInfoApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { AccountInfoApplication.class })
public class CucumberSpingConfiguration {}
