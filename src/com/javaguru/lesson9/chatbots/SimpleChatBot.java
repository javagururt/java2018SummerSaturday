package com.javaguru.lesson9.chatbots;

class SimpleChatBot implements ChatBot {

    @Override
    public void answer(String question) {
        switch (question) {
            case "How are you?":
                System.out.println("I'm fine");
                break;
            case "How old are you?":
                System.out.println("I'm 25 years old");
                break;
            default:
                System.out.println("I don't know");
        }
    }
}
