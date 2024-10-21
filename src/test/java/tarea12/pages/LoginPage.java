package tarea12.pages;

import org.openqa.selenium.By;
import tarea12.controls.Button;
import tarea12.controls.TextBox;

public class LoginPage {
    public Button mainLoginButton = new Button(By.xpath("//a[contains(text(),\"Iniciar sesi\" )]"));
    public TextBox emailTextBox = new TextBox(By.id("element-0"));
    public TextBox pwdTextBox = new TextBox(By.id("element-3"));
    public Button loginButton = new Button(By.xpath("//button[@data-gtm-id=\"start-email-login\"]"));
    public Button signUpButton = new Button(By.xpath("//a[@href=\"/auth/signup\"]"));
}
