import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {

    private EightBall eightBall;

    @Before
    public void before(){
        ArrayList<String> answers = new ArrayList<>();
        answers.add("You will win the lottery");
        answers.add("Celtic will win 10 in a row");
        answers.add("You will move back to Ireland");
        answers.add("You will stay in Scotland");
        eightBall = new EightBall(answers);
    }


    @Test
    public void canGetRandomAnswer(){
        ArrayList results = eightBall.getAnswers();
        String randomAnswer = eightBall.getRandomAnswer();
        assertTrue(results.contains(randomAnswer));
    }

    @Test
    public void canAddAnswer(){
        eightBall.add("You will finish this homework");
        assertEquals(5, eightBall.getAnswersCount());
        eightBall.add("You will not finish this homework");
        assertEquals(6, eightBall.getAnswersCount());
    }


}
