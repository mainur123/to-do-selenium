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

        RegisterPage.getInstance().load(driver);

        RegisterPage.getInstance().register(driver, user);
        TodoPage.getInstance().clickOnPlusButton(driver);
        NewtodoPage.getInstance().addTodo(driver, "Learn Selenium");
        String text = TodoPage.getInstance().getTodoText(driver);
        Assert.assertEquals(text, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteTodo(){

        User user = new User();

        RegisterPage.getInstance().load(driver);

        RegisterPage.getInstance().register(driver, user);
        TodoPage.getInstance().clickOnPlusButton(driver);
        NewtodoPage.getInstance().addTodo(driver, "Learn Selenium");
        TodoPage.getInstance().deleteTodo(driver);
        boolean isNoTodosDisplayed = TodoPage.getInstance().isNoTodoMessageDisplayed(driver);
        Assert.assertTrue(isNoTodosDisplayed);
    }

}
