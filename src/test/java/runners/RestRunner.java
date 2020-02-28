package runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src\\test\\resources\\features\\rest.feature" }
         ,glue = {"steps" }
        ,snippets = CAMELCASE
       ,tags = "@Test3"
        		)
public class RestRunner {
}
