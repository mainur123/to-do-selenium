package com.qacart.todo.pages;

import com.qacart.todo.apis.TodoApi;
import com.qacart.todo.models.User;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewtodoPage {

    private static NewtodoPage newtodoPage;

    //Elements
    private final By newTodoInput = By.cssSelector("[data-testid=\"new-todo\"]");
    private final By newTodoSubmit = By.cssSelector("[data-testid=\"submit-newTask\"]");

    //Constructor

    private NewtodoPage() { }

    public static NewtodoPage getInstance(){
        if(newtodoPage == null){
            newtodoPage = new NewtodoPage();
        }
        return newtodoPage;
    }

    //Methods or, Steps
    @Step("Add todo using the UI")
    public void addTodo(WebDriver driver, String item) {
        driver.findElement(newTodoInput).sendKeys(item);
        driver.findElement(newTodoSubmit).click();
    }

    @Step("Add todo using the API")
    public void addTodoUsingApi(User user, String item){
        TodoApi.getInstance().addTodo(user, item);
    }
}
