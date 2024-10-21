public class UserApp {
    public static void main(String[] args){
        //instantiate the app
        Application app = Application.getInstance();

        //login a user
        app.loginUser("Juan");

        //login another user
        app.loginUser("Maria");

        //logout present user
        app.logoutUser();

        //login another user
        app.loginUser("Maria");


    }
}