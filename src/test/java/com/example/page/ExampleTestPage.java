package com.example.page;

import com.example.driver.WebDriverHolder;
import com.example.driver.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExampleTestPage extends PageBase {

    @FindBy(xpath = "//input[@title = 'Buscar']")
    private WebElement inputSearch;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    private WebElement btnSearch;

    public ExampleTestPage() {
        super(WebDriverHolder.getWebDriverManager());
        PageFactory.initElements(WebDriverHolder.getWebDriverManager().getWebDriver(), this);
    }

    public boolean typeSearch(String searchText) {
        return sendKeys(inputSearch, searchText);
    }

    public boolean pressSearchButton() {
        return sendKeys(inputSearch, Keys.ENTER);
    }

}
