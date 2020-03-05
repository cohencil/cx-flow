package com.checkmarx.flow.cucumber.component.scan;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary", "html:build/cucumber/component/scan", "json:build/cucumber/component/scan/cucumber.json"},
        features = "src/test/resources/cucumber/features",
        glue = {"com.checkmarx.flow.cucumber.common.steps", "com.checkmarx.flow.cucumber.component.scan"},
        tags = " @ScanFeature and @ComponentTest and not @Skip")
public class RunScanComponentTest {
}
