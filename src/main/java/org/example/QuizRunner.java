package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {

        MultipleChoice question1 = new MultipleChoice("Who is the president of USA?",
                new ArrayList<>(Arrays.asList("Barack Obama","Donald Trump","Joe Biden")),
                "Joe Biden");

        Checkbox question2 = new Checkbox("Which type of fruits you enjoy?",
                new ArrayList<>(Arrays.asList("Apples","Bananas","Peaches","Oranges","Grapes","Strawberries")),
                new ArrayList<>(Arrays.asList("Oranges","Strawberries")));

        TrueOrFalse question3 = new TrueOrFalse("Is tomorrow Friday?",
                new ArrayList<>(Arrays.asList("True","False")),true);

        TrueOrFalse question4 = new TrueOrFalse("A class derived from an abstract class must implement all of the abstract methods it inherits",
                new ArrayList<>(Arrays.asList("True","False")),true);
        MultipleChoice question5 = new MultipleChoice("Which of the following is NOT a term for one class that extends another?",
                new ArrayList<>(Arrays.asList("subclass","subclass","extension class","child class")),"extension class");

        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);

        Scanner input = new Scanner(System.in);
        String yourAnswer;
        float score = 0;
        for (Question question: questions){
            question.printQuestion();
            System.out.println("Your answer: ");
            yourAnswer = input.nextLine();
            System.out.println("The correct answer is: ");
            question.printAnswer();
            if (question.checkAnswer(yourAnswer)){
                score++;
            }
        }
        System.out.println("Your total score is: " + score);
    }
}