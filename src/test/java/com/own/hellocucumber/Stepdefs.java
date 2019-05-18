package com.own.hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @author zhi.zhao
 * @date 5/11/2019 5:27 PM
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber-json-report.json","html:target/cucumber-html-report.html"})
public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is_Sunday(String today) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        today = "Sunday";
        this.today = today;
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        today = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        assertEquals(expectedAnswer, actualAnswer);
    }

}

class IsItFriday {
    static String isItFriday(String today) {
        String result = "Friday".equals(today) ? "TGIF" : "Nope";
        System.out.println("today is"+today+";result is :"+result);
        return result;
    }
}
