package AutomationPracticeProject;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:src/reports"},
        features = {"C:\\Users\\TECH-W91\\engineering18\\AutomationPracticeProject\\src\\test\\Resources\\Features\\myAccount.feature"},
        glue = {"Step_Defs"},
          tags={"@MyAccountTest"}
)

public class CukesJunitRunner {



}
