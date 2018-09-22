package com.javaguru.lesson11;

class UserValidationService {

    void checkUserPassword(String password) {
        checkPasswordNotNull(password);
        checkPasswordLength(password);
    }

    private void checkPasswordNotNull(String password) {
        if (password == null) {
            throw new ValidationException("Password must be not null");
        }
    }

    private void checkPasswordLength(String password) {
        if (password.length() < 8 || password.length() >= 15) {
            throw new ValidationException("Incorrect password length");
        }
    }
}
