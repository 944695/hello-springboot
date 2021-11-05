package tests;

import main.CheckBoxQuestion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckBoxQuestionTest {

    CheckBoxQuestion myCheckBoxQuestion;

    @Before
    public void setUpTests() {
        this.myCheckBoxQuestion = new CheckBoxQuestion("A test question", "A test answer");
    }

    @Test
    public void constructorSetProperties() {
        assertEquals("A test question", this.myCheckBoxQuestion.getTheQuestion());
        assertEquals("A test answer", this.myCheckBoxQuestion.getTheAnswer());
    }

    @Test
    public void checkAnswerReturnsTrue() {
        boolean actualAnswer = myCheckBoxQuestion.checkAnswer("A test answer");
        assertTrue(actualAnswer);

    }
}
