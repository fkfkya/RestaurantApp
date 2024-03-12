package auth.factory;

import auth.guest.User;
import auth.guest.Visitor;

public class VisitorFactory implements UserFactory {
    @Override
    public User createUser(String userName, String passwordHash) {
        return new Visitor(userName, passwordHash);
    }
}