package dev.zubi.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

import java.util.HashMap;

public class QuizPage extends AppCompatActivity {

    HashMap<String,String[]> quiz= new HashMap<String,String[]>();
    int activeQuestion=0;
    int score=0;
    int totalQuestions=10;

    Button nextButton;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    TextView questionNumber;
    TextView questionText;
    TextView scoreBoard;

    int selectedIndex;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        nextButton=findViewById(R.id.NEXT);
        option1=findViewById(R.id.OPTION1);
        option2=findViewById(R.id.OPTION2);
        option3=findViewById(R.id.OPTION3);
        option4=findViewById(R.id.OPTION4);
        scoreBoard=findViewById(R.id.scoreboardtext);
        questionNumber=findViewById(R.id.QUESTIONNUMBER);
        questionText=findViewById(R.id.QUESTIONTEXT);
        initQuizData();

    }

    public void initQuizData(){
        String[] question1 = {"1 What is your name?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "0"};


        String[] question2 = {"2 What is my occupation?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "1"};

        String[] question3 = {"3 Select option 3?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "2"};

        String[] question4 = {"4 This is a bad question?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "3"};

        String[] question5 = {"5 This is not even a question?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "0"};

        String[] question6 = {"6 Im hoping for divine mercy.?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "0"};

        String[] question7 = {"7 What is the scientific name of a butterfly?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "2"};

        String[] question8 = {"8 Salaam sir.?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "1"};

        String[] question9 = {"9 Take care everyone.?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "3"};

        String[] question10 = {"10 What is the scientific name of a butterfly?", "Apis",
                "Coleoptera",
                "Formicidae",
                "Rhopalocera", "3"};



        quiz.put("0", question1);
        quiz.put("1", question2);
        quiz.put("2", question3);
        quiz.put("3", question4);
        quiz.put("4", question5);
        quiz.put("5", question6);
        quiz.put("6", question7);
        quiz.put("7", question8);
        quiz.put("8", question9);
        quiz.put("9", question10);

        questionText.setText(quiz.get(( String.valueOf(activeQuestion+1) ))[0].toString());
        option1.setText(quiz.get(( String.valueOf(activeQuestion) ))[1].toString());
        option2.setText(quiz.get(( String.valueOf(activeQuestion) ))[2].toString());
        option3.setText(quiz.get(( String.valueOf(activeQuestion) ))[3].toString());
        option4.setText(quiz.get(( String.valueOf(activeQuestion) ))[4].toString());
        scoreBoard.setText("Score :" + score+"/10");
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);

        Timer timer = new Timer();
        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                System.out.println("going to next");
                if(activeQuestion==9) {
                    this.cancel();
                }

                goToNext();
            }
        };

        timer.schedule(task, 10000, 10000);

    }

    public void nextQuestion(View view) {
        goToNext();


    }

    public void goToNext(){
        if(activeQuestion!=9){
            if(selectedIndex== ( Integer.parseInt(quiz.get((String.valueOf(activeQuestion)))[5]))){
                score++;

            }
            activeQuestion++;
            questionNumber.setText(String.valueOf(activeQuestion+1) + "/10");
            questionText.setText(quiz.get(( String.valueOf(activeQuestion) ))[0].toString());
            option1.setText(quiz.get(( String.valueOf(activeQuestion) ))[1].toString());
            option2.setText(quiz.get(( String.valueOf(activeQuestion) ))[2].toString());
            option3.setText(quiz.get(( String.valueOf(activeQuestion) ))[3].toString());
            option4.setText(quiz.get(( String.valueOf(activeQuestion) ))[4].toString());
            scoreBoard.setText("Score :" + score+"/10");
            selectedIndex=10;
            option1.setBackgroundColor(Color.WHITE);
            option2.setBackgroundColor(Color.WHITE);
            option3.setBackgroundColor(Color.WHITE);
            option4.setBackgroundColor(Color.WHITE);
        }
    }

    public void selectOne(View view) {
        selectedIndex=0;
        option1.setBackgroundColor(Color.GREEN);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);


    }

    public void selectTwo(View view) {
        selectedIndex=1;
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.GREEN);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);
    }

    public void selectThree(View view) {
        selectedIndex=2;
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.GREEN);
        option4.setBackgroundColor(Color.WHITE);
    }

    public void selectFour(View view) {
        selectedIndex=3;
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.GREEN);
    }
}
