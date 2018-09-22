package com.javaguru.lesson11;

class ExceptionTest {

    public static void main(String[] args) {
        try {
            checkedException();
            runtimeException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkedException() throws Exception {
        throw new Exception("Checked Exception");
    }

    private static void runtimeException() {
        throw new RuntimeException("Unchecked exception");
    }
}
