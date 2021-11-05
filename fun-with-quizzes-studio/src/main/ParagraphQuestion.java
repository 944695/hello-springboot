package main;

public class ParagraphQuestion extends Question {

    public ParagraphQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        if(answer.length() > 500) {
            System.out.println("Answer was longer than 80 characters!");
            return false;
        }

        String actualAnswer = this.getTheAnswer();

        if((actualAnswer.toLowerCase()).equals(answer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
