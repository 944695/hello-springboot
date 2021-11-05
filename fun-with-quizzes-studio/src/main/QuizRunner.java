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

        quiz.runQuiz();
    }
}
