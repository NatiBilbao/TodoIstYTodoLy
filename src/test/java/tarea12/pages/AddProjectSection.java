package tarea12.pages;

import org.openqa.selenium.By;
import tarea12.controls.Button;
import tarea12.controls.TextBox;

public class AddProjectSection {
    public TextBox nametextBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button addButton = new Button(By.xpath("//button[@type=\"submit\"]"));
}
