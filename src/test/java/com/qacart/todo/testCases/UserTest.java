package com.qacart.todo.testCases;

import com.github.javafaker.Faker;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.models.User;
import com.qacart.todo.pages.RegisterPage;
import com.qacart.todo.pages.TodoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToRegisterToTheApplication() {
        User user = new User();
        RegisterPage.getInstance().load(driver);
        RegisterPage.getInstance().register(driver, user);
        boolean welcomeDisplayed = TodoPage.getInstance().isWelcomeMessageDisplayed(driver);
        Assert.assertTrue(welcomeDisplayed);
    }

}
