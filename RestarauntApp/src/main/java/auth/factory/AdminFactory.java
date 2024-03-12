package auth.factory;

import auth.guest.Admin;
import auth.guest.User;

public class AdminFactory implements UserFactory {
    @Override
    public User createUser(String userName, String passwordHash) {
        return new Admin(userName, passwordHash);
    }
}
