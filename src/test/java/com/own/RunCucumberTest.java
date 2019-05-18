package com.own;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/create_product-json-report.json","html:target/create_product-html-report.html"})
public class RunCucumberTest {
}
