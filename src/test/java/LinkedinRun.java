import org.junit.Test;

import static steps.LinkedinSteps.*;

public class LinkedinRun {

    @Test
    public void run() {
        openURL();
        //    введите логин в двойных кавычках
        String username = "";
        //    введите пароль в двойных кавычках
        String password = "";
        auth(username, password);
        subscribe();
    }
}
