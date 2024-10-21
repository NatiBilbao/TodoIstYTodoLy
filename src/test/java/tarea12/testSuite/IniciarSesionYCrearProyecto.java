package tarea12.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tarea12.pages.*;
import tarea12.session.Session;

public class IniciarSesionYCrearProyecto {
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    MenuSection menuSection = new MenuSection();

    OnBoardPage onBoardPage = new OnBoardPage();
    AddProjectSection addProjectSection = new AddProjectSection();
    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://app.todoist.com/");
    }

    @Test
    public void createUserAndProject() throws InterruptedException {

        loginPage.signUpButton.click();
        signUpPage.emailTextBox.setText("nataliabilbaocano@gmail.com");
        signUpPage.passTextBox.setText("Pass123.");
        signUpPage.sendButton.click();

        onBoardPage.nameTextBox.setText("Natalia Bilbao");
        onBoardPage.nameButton.click();
        onBoardPage.eduButton.click();
        onBoardPage.goToMenu.doubleClick();

        Assertions.assertTrue(menuSection.addTaskButton.isControlDisplayed(),
                "ERROR no se pudo iniciar sesion");

        menuSection.projectButton.click();
        menuSection.addProjectButton.click();

        String name = "Proyecto de Natalia Bilbao";
        addProjectSection.nametextBox.setText(name);
        addProjectSection.addButton.click();

        menuSection.setProjectName(name);
        Assertions.assertTrue(menuSection.projectName.isControlDisplayed(),
                "ERROR no se pudo creo el proyecto");
    }
}
