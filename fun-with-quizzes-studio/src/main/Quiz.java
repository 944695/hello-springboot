package main;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    // Class Variables
    private ArrayList<Question> questions = new ArrayList<>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public void Quiz() {

    }

    // Methods
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuesitons(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getTheQuestion());
            String usersAnswer = this.getUsersAnswer();
            boolean usersGetQuestionCorrect = question.checkAnswer(usersAnswer);

            if (usersGetQuestionCorrect) {
                numberOfQuestionsCorrect++;
            }
        }

        double percentageCorrect = 100 * ((double)this.numberOfQuestionsCorrect) / (double)this.questions.size();
        System.out.println("User's grade: " + percentageCorrect + "%");
    }

    private String getUsersAnswer() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
