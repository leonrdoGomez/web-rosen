package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/domain.feature",
        glue = "stepDefinitions",
        tags = "@SuccessfulScenario",
        snippets = SnippetType.CAMELCASE
)
public class domainRunner {
}
