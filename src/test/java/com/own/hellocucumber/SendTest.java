package com.own.hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * @author zhi.zhao
 * @date 5/18/2019 4:22 PM
 */
public class SendTest {

    private Boolean right = true;
    
    @Given("create measurePoint")
    public void createPoint(){
        try {
            System.out.println("create measurePoint success");
        } catch (Exception e) {
            e.printStackTrace();
            right = false;
        }
    }

    @When("get right response")
    public void response(){
        try {
            System.out.println("create measurePoint success");
        } catch (Exception e) {
            e.printStackTrace();
            right = false;
        }
    }

    @Then("get true")
    public void judgeResult(){
        Assert.assertTrue(right);
    }


}
