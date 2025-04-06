package com.example.csc311_cardgame_24;

import io.github.sashirestela.openai.SimpleOpenAI;
import io.github.sashirestela.openai.domain.chat.ChatMessage;
import io.github.sashirestela.openai.domain.chat.ChatRequest;

public class Api {
    public String getResponse(String c1, String c2, String c3, String c4) {
        String key = System.getenv("OPENAI_API_KEY");

        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("API key is not set in the environment variables.");
       }
        var openAI = SimpleOpenAI.builder()
               .apiKey(System.getenv("OPENAI_API_KEY"))

                .build();
        var chatRequest = ChatRequest.builder()
                .model("gpt-4o-mini")
                .message(ChatMessage.SystemMessage.of("You are an expert in finding expressions that equal 24."))
                .message(ChatMessage.UserMessage.of("Give me an expression that equals 24 using these numbers: " + c1 + c2 + c3 + c4))
                .temperature(0.0)
                .maxCompletionTokens(300)
                .build();
        var futureChat = openAI.chatCompletions().create(chatRequest);
        var chatResponse = futureChat.join();
        return chatResponse.firstContent();
    }
}
