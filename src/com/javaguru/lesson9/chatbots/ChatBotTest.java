package com.javaguru.lesson9.chatbots;

class ChatBotTest {

    public static void main(String[] args) {
        ChatBot chatBot = new AdvancedChatBot();
        askQuestion(chatBot, "How old are you ?");
    }

    public static void askQuestion(ChatBot bot, String question) {
        bot.answer(question);
    }
}
