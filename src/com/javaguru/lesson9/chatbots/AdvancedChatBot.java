package com.javaguru.lesson9.chatbots;

import java.util.HashMap;
import java.util.Map;

class AdvancedChatBot implements ChatBot {

    private Map<String, String> vocabulary;

    public AdvancedChatBot() {
        vocabulary = new HashMap<>();
        vocabulary.put("old", "20 years old");
        vocabulary.put("you", "I'm ");
        vocabulary.put("?", "Thanks! ");
    }

    @Override
    public void answer(String question) {
        String[] words = question.split(" ");
        String answer = generateAnswer(words);
        System.out.println(answer);
    }

    private String generateAnswer(String[] words) {
        StringBuilder answer = new StringBuilder();
        for (int i = words.length - 1; i > 0; i--) {
            if (vocabulary.containsKey(words[i])) {
                answer.append(vocabulary.get(words[i]));
            }
        }
        return answer.toString();
    }
}
