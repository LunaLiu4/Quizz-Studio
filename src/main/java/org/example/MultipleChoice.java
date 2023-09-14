package org.example;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private String answers;

    public MultipleChoice(String text, ArrayList<String> possibleAnswers, String answers) {
        super(text, possibleAnswers);
        this.answers = answers;
    }

    @Override
    public boolean checkAnswer(String input) {
        return input.equalsIgnoreCase(answers);
    }

    @Override
    public double grading() {
        return super.grading();
    }

    @Override
    public void printAnswer() {
        System.out.println(answers);
    }
}
