package com.example.quiz.model;

import java.util.List;

public class Question {
    private int id;
    private String question;
    private List<String> options;
    private String answer;

    public Question(int id, String question, List<String> options, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    // Getters
    public int getId() { return id; }
    public String getQuestion() { return question; }
    public List<String> getOptions() { return options; }
    public String getAnswer() { return answer; }

    // Setter for options (needed for shuffling)
    public void setOptions(List<String> options) { this.options = options; }
}
