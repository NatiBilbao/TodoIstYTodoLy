package tarea12.pages;

import org.openqa.selenium.By;
import tarea12.controls.Button;
import tarea12.controls.TextBox;

public class SettingsSection {
    public TextBox nameTextBox =  new TextBox(By.xpath("//span[text()=\"Nombre\"]/../../..//input"));
    public Button closeButton = new Button(By.xpath("//button[@class=\"dOAUdcnSj9gBY1w5ax6aQxa5xcA8ASxf\"]"));
    public Button updateButton = new Button(By.xpath("//button[span[text()='Actualizar']]"));
}
