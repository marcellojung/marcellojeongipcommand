package marcellojeongipcommand.common;

import io.cucumber.spring.CucumberContextConfiguration;
import marcellojeongipcommand.WorkApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { WorkApplication.class })
public class CucumberSpingConfiguration {}
