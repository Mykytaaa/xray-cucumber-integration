package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {"pretty", "junit:target/cucumber-reports/cucumber-report.xml"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider()  // Запуск тестов в несколько потоков
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
