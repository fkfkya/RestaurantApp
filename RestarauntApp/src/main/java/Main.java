import auth.AuthHandler;
import auth.AuthService;
import business.FileHandler;

public class Main {
    public static void main(String[] args) {
        FileHandler.uploadAdmins();
        FileHandler.uploadVisitors();
        FileHandler.uploadDishes("dishes.json");
        FileHandler.uploadStats();

        AuthService authService = new AuthService();
        AuthHandler authHandler = new AuthHandler(authService);
        authHandler.run();
    }
}