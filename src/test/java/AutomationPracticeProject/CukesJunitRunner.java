package AutomationPracticeProject;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:src/reports"},
        features = {"C:\\Users\\TECH-W112\\IdeaProjects\\AutomationPracticeProject\\src\\test\\resources\\features\\login.feature"},
        glue = {"Step_Defs"},
          tags={"@test"}
)

public class CukesJunitRunner {



}
