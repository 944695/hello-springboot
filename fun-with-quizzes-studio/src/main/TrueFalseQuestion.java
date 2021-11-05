package main;

public class TrueFalseQuestion extends Question {
    // Class Variables

    // Constructor
    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {

        if ((answer.toLowerCase()).equals(this.getTheAnswer().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
