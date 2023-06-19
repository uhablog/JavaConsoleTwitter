package model;

import java.util.Objects;

public class User {

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean checkPassword(String password) {
        if (this.password.equals(password)) return true;

        return false;
    }

    @Override
    public String toString() {
        return userName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        User user = (User) obj;
        return userName.equals(user.userName);
    }
}
