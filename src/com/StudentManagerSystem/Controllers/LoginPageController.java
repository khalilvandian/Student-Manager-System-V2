package com.StudentManagerSystem.Controllers;
import com.StudentManagerSystem.SystemManage;


public class LoginPageController {

    private static Input input;
    private static Object loggedIn;
    private static String Password;

    public static class Input {

        String username;
        String password;
        int userType;
        /**
         * 0 = student
         * 1 = student Manager
         * 2 = admin
         */

        public Input(String username, String password, int userType) {
            this.username = username;
            this.password = password;
            this.userType = userType;
        }

    }

    //methods
    static public boolean login(Input input) {
        //TODO input get
        //TODO not Completed
        if (input.userType == 0){
            return SystemManage.authenticateStudent(Integer.parseInt( input.username), input.password);
        }else if (input.userType == 1){
            return SystemManage.authenticateAdministrator(input.username, input.password);
        }else return false;
    }

    //getter and setters
    static Object getLoggedIn() {
        return loggedIn;
    }
    private static void setLoggedIn(Object loggedIn) {
        LoginPageController.loggedIn = loggedIn;
    }
    private static void setPassword(String password) {
        Password = password;
    }
}
