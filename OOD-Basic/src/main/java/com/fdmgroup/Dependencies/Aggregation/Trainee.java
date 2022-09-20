package com.fdmgroup.Dependencies.Aggregation;

import java.util.List;

public class Trainee {

        private String name;

        public Trainee(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int takeExam(Exam exam) {
            List<String> questions = exam.getAllQuestions();

            for(String question : questions) {
                System.out.println(name + " is answering question: " + question);
            }

            return (int) (Math.random() * 100);
        }
}
