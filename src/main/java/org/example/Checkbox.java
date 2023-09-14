package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Checkbox extends  Question{
    private ArrayList<String> answers;

    public Checkbox(String text, ArrayList<String> possibleAnswers, ArrayList<String> answers) {
        super(text, possibleAnswers);
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    @Override
    public boolean checkAnswer(String input) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split(",")));
            return answers.containsAll(list);
    }

    @Override
    public void printAnswer() {
        for (String answer: answers){
            System.out.println(answer);
        }
    }
}
