package tarea13.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tarea13.session.Session;

public class Control {
    protected By locator;
    protected WebElement control;

    public Control(By locator){
        this.locator = locator;
    }

    public void getControl(){
        control = Session.getInstance().getBrowser().findElement(this.locator);
    }

    public void click(){
        getControl();
        this.control.click();
    }

    public boolean isControlDisplayed(){
        try{
            getControl();
            return control.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public String getText(){
        getControl();
        return this.control.getText();
    }

    public String getTextProperty(String value) {
        getControl();
        return control.getAttribute(value);
    }
}
