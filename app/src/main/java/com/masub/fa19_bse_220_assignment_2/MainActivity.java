package com.masub.fa19_bse_220_assignment_2;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonZero,buttonClean,buttonGo;
    TextView textView;
    int passwordCount=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonClean = findViewById(R.id.buttonClean);
        buttonZero = findViewById(R.id.buttonZero);
        buttonGo = findViewById(R.id.buttonGo);
        textView = findViewById(R.id.textView);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt=  textView.getText().toString();
                String num = "1";
                textView.setText(txt+num);
            }
        });
        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String a = "AAA";
//                a = a.substring(0, a.length() - 1);
//                System.out.println(a); // result: AA
                if(textView.length()>0){
                    String txt=  textView.getText().toString();

                    txt = txt.substring(0,txt.length()-1);
                    textView.setText(txt);
                }else
                {
                    Toast.makeText(MainActivity.this, "Password Field is Empty", Toast.LENGTH_SHORT).show();
                }


            }
        });

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = "0000";
                String textViewCode= textView.getText().toString();
                if(textViewCode.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }else if(textViewCode.equals(code)){
                    Intent lockerHome = new Intent(MainActivity.this,Locker_Home.class);
                    startActivity(lockerHome);
                }
                else if (passwordCount==0)
                {
                    finish();
                }
                else
                {
                    passwordCount--;
                    Toast.makeText(MainActivity.this, "Wrong Key Remaining Times"+passwordCount, Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt =  textView.getText().toString();
                String num = "0";
                textView.setText(txt+num);
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "2";
                textView.setText(txt+num);
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "3";
                textView.setText(txt+num);
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "4";
                textView.setText(txt+num);
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "5";
                textView.setText(txt+num);
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "6";
                textView.setText(txt+num);
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "7";
                textView.setText(txt+num);
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "8";
                textView.setText(txt+num);
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = textView.getText().toString();
                String num = "9";
                textView.setText(txt+num);
            }
        });

    }
}