package tarea13.pages;

import org.openqa.selenium.By;
import tarea13.controls.Button;

public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));
    public Button settingButton = new Button(By.xpath("//a[text()='Settings']"));
}
