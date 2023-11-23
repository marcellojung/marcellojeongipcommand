package marcellojeongipcommand.common;

import io.cucumber.spring.CucumberContextConfiguration;
import marcellojeongipcommand.UserInfoApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserInfoApplication.class })
public class CucumberSpingConfiguration {}
