package dev.zubi.calculatormc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button subtract;
    private Button divide;
    private Button multiply;
    private Button equal;
    private Button clear;
    private Button decimal;
    private TextView input;
    private TextView result;

    private Float num1;
    private Float num2;

    boolean adding, subtracting, multiplicating, dividing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + ".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                result.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input == null) {
                    input.setText("");
                } else {
                    num1 = Float.parseFloat(input.getText() + "");
                    adding = true;
                    input.setText(null);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(input.getText() + "");
                subtracting = true;
                input.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(input.getText() + "");
                multiplicating = true;
                input.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(input.getText() + "");
                dividing = true;
                input.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(input.getText() + "");

                if (adding == true) {
                    result.setText(num1 + num2 + "");  input.setText("");
                    adding = false;
                }

                if (subtracting == true) {
                    result.setText(num1 - num2 + "");  input.setText("");
                    subtracting = false;
                }

                if (multiplicating == true) {
                    result.setText(num1 * num2 + "");  input.setText("");
                    multiplicating = false;
                }

                if (dividing == true) {
                    result.setText(num1 / num2 + "");
                    input.setText("");
                    dividing = false;
                }
            }
        });



    }

    private void initializeView(){
        one= findViewById(R.id.button1);
        two= findViewById(R.id.button2);
        three= findViewById(R.id.button3);
        four= findViewById(R.id.button4);
        five= findViewById(R.id.button5);
        six= findViewById(R.id.button6);
        seven= findViewById(R.id.button7);
        eight= findViewById(R.id.button8);
        nine= findViewById(R.id.button9);
        zero= findViewById(R.id.button0);
        add= findViewById(R.id.ADD);
        subtract= findViewById(R.id.SUBTRACT);
        divide= findViewById(R.id.DIVIDE);
        multiply= findViewById(R.id.MULTIPLY);
        equal= findViewById(R.id.EQUALS);
        clear= findViewById(R.id.CLEAR);
        decimal= findViewById(R.id.DECIMAL);
        input= findViewById(R.id.operation);
        result= findViewById(R.id.result);


    }
}
