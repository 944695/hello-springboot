package tests;

import main.LinearScaleQuestion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinearScaleQuestionTest {

    LinearScaleQuestion myLinearScaleQuestion;

    @Before
    public void setUpTests() {
        this.myLinearScaleQuestion = new LinearScaleQuestion("A test question",10,1);
    }

    @Test
    public void constructorSetProperties() {
        assertEquals("A test question", this.myLinearScaleQuestion.getTheQuestion());
        assertEquals(10,this.myLinearScaleQuestion.getHighValue());
        assertEquals(1, this.myLinearScaleQuestion.getLowValue());
    }

    @Test
    public void getLinearAnswerAndReturnsTrue() {
        boolean actualAnswer = myLinearScaleQuestion.checkAnswer("5");
        assertTrue(actualAnswer);

    }
}
