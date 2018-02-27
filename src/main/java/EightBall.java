import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public String getRandomAnswer(){
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<>(this.answers);
    }


    public void add(String answer){
        this.answers.add(answer);
    }

    public int getAnswersCount(){
        return this.answers.size();
    }

    public void remove(String answer){
        this.answers.remove(answer);
    }



}
