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

    @Then("click on chapter {string}")
    public void click_on_chapter(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/qa-engineer-python-testirovshchik-programmnogo-obespecheniya")).click();
    }

    @Then("click on word {string}")
    public void click_on_word(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses")).click();
    }

    @Then("click on chapter 2 {string}")
    public void click_on_chapter_2(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/backend-razrabotka")).click();
    }

    @Then("click on Kotlin")
    public void click_on_Kotlin() {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/kotlin")).click();
    }

    @Then("click on chapter 3 {string}")
    public void click_on_chapter_3(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/android-razrabotchik")).click();
    }

    @Then("click on word 2 {string}")
    public void click_on_word_2(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses")).click();
    }

    @Then("click on chapter 4 {string}")
    public void click_on_chapter_4(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/kiberbezopasnost")).click();
    }

    @Then("click on chapter 5 {string}")
    public void click_on_chapter_5(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/cyber-security-etichnij-haker")).click();
    }

    @Then("click on word 3 {string}")
    public void click_on_word_3(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses")).click();
    }

    @Then("click on chapter 6 {string}")
    public void click_on_chapter_6(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses/management-i-upravlenie")).click();
    }

    @Then("click on Product Manager")
    public void click_on_Product_Manger() {
        webDriver.findElement(By.className("https://skillfactory.ru/product-manager-pro")).click();
    }

    @Then("click on word 4 {string}")
    public void click_on_word_4(String click) {
        webDriver.findElement(By.className("https://skillfactory.ru/courses")).click();
    }
}
