package marcellojeongipcommand.common;

import io.cucumber.spring.CucumberContextConfiguration;
import marcellojeongipcommand.WorkTypeApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { WorkTypeApplication.class })
public class CucumberSpingConfiguration {}
