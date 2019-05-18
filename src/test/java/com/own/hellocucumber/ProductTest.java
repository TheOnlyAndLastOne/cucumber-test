package com.own.hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

/**
 * @author zhi.zhao
 * @date 5/15/2019 3:41 PM
 */
//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty","json:target/create_product-json-report.json","html:target/create_product-html-report.html"})
public class ProductTest {

    private Boolean ifTrue = true;

    @Given("create model")
    public void createModel(){
        try {
            create();
        } catch (Exception e) {
            e.printStackTrace();
            ifTrue = false;
        }
    }

    private void create() {
        System.out.println("create model success");
//        throw new RuntimeException();
    }

    @Given("create asset")
    public void createAsset(){
        try {
            createAssetNode();
        } catch (Exception e) {
            e.printStackTrace();
            ifTrue = false;
        }
    }

    private void createAssetNode() {
        System.out.println("upload asset success");
    }

    @Then("return true")
    public void returnTrue(){
        Assert.assertTrue(ifTrue);
    }
}
