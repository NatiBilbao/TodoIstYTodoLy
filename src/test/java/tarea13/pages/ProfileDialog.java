package tarea13.pages;

import org.openqa.selenium.By;
import tarea13.controls.Button;
import tarea13.controls.TextBox;

public class ProfileDialog {
    public TextBox fullNameTextBox = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//span[text()='Ok']"));
}
