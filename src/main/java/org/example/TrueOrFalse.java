package org.example;

import java.util.ArrayList;

public class TrueOrFalse extends Question{
    private Boolean answers;

    public TrueOrFalse(String text, ArrayList<String> possibleAnswers, Boolean answers) {
        super(text, possibleAnswers);
        this.answers = answers;
    }

    @Override
    public boolean checkAnswer(String input) {
        return input.equalsIgnoreCase(String.valueOf(answers));
    }

    @Override
    public void printAnswer() {
        System.out.println(answers);
    }
}
