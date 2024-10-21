package tarea12.pages;

import org.openqa.selenium.By;
import tarea12.controls.Button;
import tarea12.controls.TextBox;

public class SignUpPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@placeholder=\"Introduce tu email...\"]"));
    public TextBox passTextBox = new TextBox(By.xpath("//input[@type=\"password\"]"));
    public Button sendButton = new Button(By.xpath("//button[@data-gtm-id=\"start-email-signup\"]"));
}
