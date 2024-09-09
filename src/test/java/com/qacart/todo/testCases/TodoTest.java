package com.qacart.todo.testCases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.models.User;
import com.qacart.todo.pages.NewtodoPage;
import com.qacart.todo.pages.RegisterPage;
import com.qacart.todo.pages.TodoPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddATodo() {

        User user = new User();

        RegisterPage.getInstance().load(driver.get());

        RegisterPage.getInstance().registerUsingApi(driver.get(), user);
        TodoPage.getInstance().clickOnPlusButton(driver.get());
        NewtodoPage.getInstance().addTodo(driver.get(), "Learn Selenium");
        String text = TodoPage.getInstance().getTodoText(driver.get());
        Assert.assertEquals(text, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteTodo(){

        User user = new User();

        RegisterPage.getInstance().load(driver.get());

        RegisterPage.getInstance().registerUsingApi(driver.get(), user);
        NewtodoPage.getInstance().addTodoUsingApi(user, "Learn Selenium");
        TodoPage.getInstance().load(driver.get());
        TodoPage.getInstance().deleteTodo(driver.get());
        boolean isNoTodosDisplayed = TodoPage.getInstance().isNoTodoMessageDisplayed(driver.get());
        Assert.assertTrue(isNoTodosDisplayed);
    }

}
