package dev.zubi.quizapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton= findViewById(R.id.STARTBUTTON);



    }



    public void startQuiz(View view) {
        Intent i= new Intent(getApplicationContext(),QuizPage.class);
        startActivity(i);
    }
}