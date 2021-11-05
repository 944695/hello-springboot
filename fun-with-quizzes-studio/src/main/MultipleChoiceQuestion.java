package main;

import java.util.Locale;

public class MultipleChoiceQuestion extends Question {

    // Class Variables

    // Constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();

        if ((actualAnswer.toLowerCase()).equals(answer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
