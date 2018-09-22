package com.javaguru.lesson11;

class UserValidationServiceTest {

    public static void main(String[] args) {
        UserValidationServiceTest testCases = new UserValidationServiceTest();
        testCases.shouldThrowValidationExceptionIncorrectLength();
        testCases.shouldThrowValidationExceptionPasswordNull();
    }

    void shouldThrowValidationExceptionIncorrectLength() {
        UserValidationService validationService = new UserValidationService();
        try {
            validationService.checkUserPassword("21312");
            System.err.println("FAIL");
        } catch (ValidationException e) {
            System.out.println("SUCCESS");
        }
    }

    void shouldThrowValidationExceptionPasswordNull() {
        UserValidationService validationService = new UserValidationService();
        try {
            validationService.checkUserPassword(null);
            System.err.println("FAIL");
        } catch (ValidationException e) {
            System.out.println("SUCCESS");
        }
    }
}
