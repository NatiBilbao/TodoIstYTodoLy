package tarea13.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import tarea13.pages.*;
import tarea13.session.Session;

public class TestBase {
    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();

    LeftSection leftSection = new LeftSection();

    CenterSection centerSection = new CenterSection();

    ProfileDialog profileDialog = new ProfileDialog();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
}
