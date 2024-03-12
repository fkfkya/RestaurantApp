package auth.factory;

import auth.guest.User;

public interface UserFactory {
    User createUser(String userName, String passwordHash);
}

