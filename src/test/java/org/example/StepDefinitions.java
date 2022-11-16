package org.example;

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

    @Given("url of ozon {string}")
    public void url_of_ozon(String url) {
        webDriver.get(url);
    }

    @Then("start search {string}")
    public void start_search(String searchParam){
        WebElement searchField = webDriver.findElement(By.id("искать на Ozone"));
        searchField.sendKeys(searchParam);
        searchField.submit();
    }
    @Then("click on first")
    public void click_on_first() {
        webDriver.findElement(By.className("https://www.ozon.ru/product/futbolka-black-star-wear-260649151/?advert=ufvpyrXdbJaBxnsKEA6TviaJ-28C6tpfwsNIJi0CljANVTWhrotBsh55hguvEhssnkMiK_7lUTgMCqOmeBM4LVott0D7xIBJFkdI2caZhrVyNzvn1ZoTBrKvnuVWjGdHcl0srLrV6HpFDBhJxmMi36wXo1UXvOGUTNx5YCCc-_4V9wzW4HiiFUsAy6CVO6rP9mECGqmY6mO3Ht3FsS6FS3R7rMzzN93ymJo1YlpY5-bmo0A5OXygorOq06HubJCkgw088y2IV-qOe54b9BQ6Kun-paWqL2Ib_63JZMPmhxlqhzEjv9nHM_sxVzakDPoCE6wP-pOlIRSliDL5-mrgwdEivljr4U-5hgSe6TuSfsXunDv4RSgXNSc09_IvxYiPSM_2wRr5iV9xNSoLKJ9if1HJ2cKNnIu6Qu1-r4744EHNdHpeGqDG1-2w8WDeh2cAl2dRmvhzmsCXuGwdIeVDlBTXxFkd2EfS11r9D1h-eUPmcUMcUuxHbQ2auGmq1ls6jMhjkz-Xz1bX5hS_T8rzjnL6Z8MBOrwAFpQ4QSPd50wt6yew_uA4fnfUEliEtCOw8cmV1KoNWDwtUEHZIUmT9hxu84v6939N49TE27hew65CrqMQmXVsGcDHosrhtt2L6NMf7M2D_yfgaSD_hTKbcTgWdNuVLPog775KnIaw4ORIsdSZVLLIpYx_yso6JkyCyEmgVhszKW8j6jTIWVtBunXDrUpLR0JuR281F7JUU-0&avtc=1&avte=2&avts=1668611775&keywords=%D1%84%D1%83%D1%82%D0%B1%D0%BE%D0%BB%D0%BA%D0%B0")).click();
    }
    @Then("add to cart")
    public void add_to_cart(){
        webDriver.findElement(By.className("webAddToCart")).click();
    }
    @Then("click add button")
    public void click_add_button(){
        webDriver.findElement(By.className("button-by")).click();
    }
}
