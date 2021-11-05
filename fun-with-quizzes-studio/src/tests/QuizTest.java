package tests;

import main.CheckBoxQuestion;
import main.Quiz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuizTest {

    Quiz myQuiz;

    @Before
    public void setUpTests() {
        this.myQuiz = new Quiz();
    }

    @Test
    public void addQuestionMethodAddsQuestion() {
        CheckBoxQuestion testQuestion = new CheckBoxQuestion("A test question", "A test answer");
        this.myQuiz.addQuesitons(testQuestion);
        assertEquals(1,this.myQuiz.getQuestions().size());

    }


}
