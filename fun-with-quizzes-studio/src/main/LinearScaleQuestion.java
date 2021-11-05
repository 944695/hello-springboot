package main;

public class LinearScaleQuestion extends Question {

    // Class Variables
    private final int highValue;
    private final int lowValue;

    public LinearScaleQuestion(String question, int highValue, int lowValue) {
        super(question,null);
        this.highValue = highValue;
        this.lowValue = lowValue;
    }

    public int getHighValue() {
        return highValue;
    }

    public int getLowValue() {
        return lowValue;
    }

    @Override
    public boolean checkAnswer(String answer) {
        int answerAsAnInt = Integer.parseInt(answer);

        if(answerAsAnInt >= this.lowValue && answerAsAnInt <= this.highValue) {
            return true;
        }
        else {
            return false;
        }
    }
}
