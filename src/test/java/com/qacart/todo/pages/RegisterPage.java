package com.qacart.todo.pages;

import com.qacart.todo.models.User;
import com.qacart.todo.utils.ConfigUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {

    private static RegisterPage registerPage;
    //Elements
    private final By firstNameInput = By.cssSelector("[data-testid=\"first-name\"]");
    private final By lastNameInput = By.cssSelector("[data-testid=\"last-name\"]");
    private final By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private final By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private final By confirmPasswordInput = By.cssSelector("[data-testid=\"confirm-password\"]");
    private final By submitButton = By.cssSelector("[data-testid=\"submit\"]");

    //Constructor
    private RegisterPage() {}

    public static RegisterPage getInstance() {
        if(registerPage == null){
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    //Methods or, Steps

    public void load(WebDriver driver) {
        driver.get(ConfigUtils.getInstance().getBaseUrl() +"/signup");
    }
    public void register(WebDriver driver, User user) {
        driver.findElement(firstNameInput).sendKeys(user.getFirstName());
        driver.findElement(lastNameInput).sendKeys(user.getLastName());
        driver.findElement(emailInput).sendKeys(user.getEmail());
        driver.findElement(passwordInput).sendKeys(user.getPassword());
        driver.findElement(confirmPasswordInput).sendKeys(user.getPassword());
        driver.findElement(submitButton).click();
    }


}
