package AutomationPracticeProject;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:src/reports"},
        features = {"C:\\Users\\TECH-W84.LAPTOP-FCCNLJDE\\IdeaProjects\\AutomationPracticeProject\\src\\test\\resources\\features\\orderhistory.feature"},
        glue = {"Step_Defs"},
          tags={"@OrderHistoryTest"}
)

public class CukesJunitRunner {
}
