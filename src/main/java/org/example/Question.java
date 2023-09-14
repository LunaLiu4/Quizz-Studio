package org.example;

import java.util.ArrayList;

public abstract class Question {
    private String text;
    private ArrayList<String> possibleAnswers = new ArrayList<>();

    public Question(String text, ArrayList<String> possibleAnswers) {
        this.text = text;
        this.possibleAnswers = possibleAnswers;
    }

    public String getText() {
        return text;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void printQuestion(){
        System.out.println(text);
        for (int i = 0; i < possibleAnswers.size(); i++){
            System.out.println(i + ": " + possibleAnswers.get(i));
        }
    }

    public abstract boolean checkAnswer(String input);

    public double grading(){
        double score = 0;
        return score;
    }
    
    public void printAnswer(){
    }
}
