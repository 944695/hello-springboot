package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make?\nA: Bark\nB: Quack\nPlease just type in a single letter for the answer.", "a");
        quiz.addQuesitons(myMultipleChoiceQuestion);
        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all that apply. Which animals can fly?\nA: Owls\nB: Doves\nC:Penguins", "a,b");
        quiz.addQuesitons(myCheckBoxQuestion);
        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Dogs are omnivores?", "True");
        quiz.addQuesitons(myTrueFalseQuestion);
        ShortAnswerQuestion myShortAnswerQuestion = new ShortAnswerQuestion("Kangaroos are from which country?", "Australia");
        quiz.addQuesitons(myShortAnswerQuestion);
        LinearScaleQuestion myLinearScaleQuestion = new LinearScaleQuestion("On a scale from 1 to 10, how cute is a penguin?", 8,10);
        quiz.addQuesitons(myLinearScaleQuestion);
        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion("Tell me why penguins are cool?", "Because they are!");
        quiz.addQuesitons(myParagraphQuestion);
        quiz.runQuiz();
    }
}
