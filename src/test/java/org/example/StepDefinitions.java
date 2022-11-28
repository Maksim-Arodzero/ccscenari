package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private static final WebDriver webDriver;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\вперёд\\Desktop\\Тетсировщик\\cc scenari\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Given("url of skill_factory {string}")
    public void url_of_skill_factory(String url) {
        webDriver.get(url);
    }

    @Then("click on first")
    public void click_on_first() {
        webDriver.findElement(By.className("https://skillfactory.ru/courses")).click();
    }

    @And("add to data Science")
    public void add_to_data_Science() {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/data-science")).click();
    }

    @Then("click add button")
    public void click_add_button() {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/iskustvennyy-intellekt")).click();
    }

    @Then("click add data Science")
    public void click_add_data_Science() {
        webDriver.findElement(By.className("https://skillfactory.ru/data-scientist-pro")).click();
    }

    @Then("click add button {string}")
    public void click_add_button(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/programmirovanie")).click();
    }

    @Then("click on button {string}")
    public void click_on_button(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/testirovanie")).click();
    }

    @Then("click on Postman")
    public void click_on_Postman() {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/testirovanie")).click();
    }
}


