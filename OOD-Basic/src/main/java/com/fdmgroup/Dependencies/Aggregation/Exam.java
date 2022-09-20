package com.fdmgroup.Dependencies.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<String> questions = new ArrayList<String>();

    public void addQuestion(String question) {
        questions.add(question);
    }

    public List<String> getAllQuestions() {
        return questions;
    }
}