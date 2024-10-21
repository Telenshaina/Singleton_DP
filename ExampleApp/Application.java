public class Application {
    private static Application instance;
    private String user;
    private boolean isUserLoggedIn;

    //this prevents instantation outside of the class
    private Application(){

    }

    // get application instance
    public static synchronized Application getInstance() {
        if (instance == null)
                instance = new Application();
        return instance;
    }

    public synchronized boolean isUserLoggedIn(){
        return isUserLoggedIn;
    }

    // Log in a user
    public synchronized void loginUser(String user){
        if (!isUserLoggedIn){
            isUserLoggedIn = true;
            this.user = user;
            System.out.println(user +"  is logged in!");
        }
        else
            System.out.println("Another user already logged in!");
    }

    // Log out a user
    public synchronized void logoutUser(){
        isUserLoggedIn = false;
        System.out.println(user + " is logged out!");
    }

}