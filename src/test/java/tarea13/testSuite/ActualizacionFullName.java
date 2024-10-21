package tarea13.testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ActualizacionFullName extends TestBase{
    @Test
    public void fullNameTesting() throws InterruptedException {

        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("nataliabilbao@gmail.com");
        loginSection.pwdTextBox.setText("Pass123.");
        loginSection.loginButton.click();
        String newName = new Date().getTime()+"Natalia Bilbao Cano";

        menuSection.settingButton.click();
        profileDialog.fullNameTextBox.clearSetText(newName);
        profileDialog.okButton.click();
        menuSection.settingButton.click();
        String actualResult=profileDialog.fullNameTextBox.getTextProperty("value");
        Assertions.assertEquals(newName,actualResult,"ERROR no se pudo actualizar el Full Name");
    }
}
