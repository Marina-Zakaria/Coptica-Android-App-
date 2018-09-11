package com.example.android.coptica;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Game2Activity extends AppCompatActivity {
    int[] questions = new int[10];
    int[] correctAns = new int [10];
    int[] wrongAns = new int [20];
    int questionNumber =0,position,scoreValue =100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TextView game = findViewById(R.id.game);
        game.setText("شوف الصورة و اختار معناها بالقبطي");
        questions[0]=R.drawable.daughter;
        questions[1]=R.drawable.purple;
        questions[2]=R.drawable.foot;
        questions[3]=R.drawable.dog;
        questions[4]=R.drawable.horse;
        questions[5]=R.drawable.black;
        questions[6]=R.drawable.ladder;
        questions[7]=R.drawable.elephant;
        questions[8]=R.drawable.yellow;
        questions[9]=R.drawable.hand;

        correctAns[0]=R.drawable.wdaughter;
        correctAns[1]=R.drawable.wpurple;
        correctAns[2]=R.drawable.wfoot;
        correctAns[3]=R.drawable.wdog;
        correctAns[4]=R.drawable.whorse;
        correctAns[5]=R.drawable.wblack;
        correctAns[6]=R.drawable.wladder;
        correctAns[7]=R.drawable.welephant;
        correctAns[8]=R.drawable.wyellow;
        correctAns[9]=R.drawable.whand;

        wrongAns[0]=R.drawable.wblack;
        wrongAns[1]=R.drawable.wmom;
        wrongAns[2]=R.drawable.wgrey;
        wrongAns[3]=R.drawable.wstomach;
        wrongAns[4]=R.drawable.wwhale;
        wrongAns[5]=R.drawable.wnose;
        wrongAns[6]=R.drawable.welbow;
        wrongAns[7]=R.drawable.wtoungue;
        wrongAns[8]=R.drawable.wwall;
        wrongAns[9]=R.drawable.wvillage;
        wrongAns[10]=R.drawable.wtab;
        wrongAns[11]=R.drawable.wsoup;
        wrongAns[12]=R.drawable.wsailor;
        wrongAns[13]=R.drawable.wstreet;
        wrongAns[14]=R.drawable.woven;
        wrongAns[15]=R.drawable.wchick;
        wrongAns[16]=R.drawable.wbear;
        wrongAns[17]=R.drawable.wsailor;
        wrongAns[18]=R.drawable.wring;
        wrongAns[19]=R.drawable.wrain;

        newQuesion();





    }
    public void choice1(View view){
        if(position==0&&questionNumber<10){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("اجابة صحيحة !!!!!");
            builder.setMessage("يلا السؤال اللي جاي ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    questionNumber++;
                    scoreValue=scoreValue+15;
                    newQuesion();}
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this,InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("اجابة خاطئة !!!!!");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this,InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();

        }

    }
    public void choice3(View view){
        if(position==2&&questionNumber<10){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("اجابة صحيحة !!!!!");
            builder.setMessage("يلا السؤال اللي جاي ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    questionNumber++;
                    scoreValue+=15;

                    newQuesion();}
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this,InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("اجابة خاطئة !!!!!");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this,InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();

        }

    }
    public void choice2(View view){
        if(position==1&&questionNumber<10){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("اجابة صحيحة !!!!!");
            builder.setMessage("يلا السؤال اللي جاي ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    questionNumber++;
                    scoreValue+=15;

                    newQuesion();}
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this,InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("اجابة خاطئة !!!!!");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this,InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();

        }

    }


    private void newQuesion(){
        checkEnd();
        if(questionNumber<10){
            Button question = findViewById(R.id.question);
            ImageView choice1 = findViewById(R.id.choice1);
            ImageView choice2 = findViewById(R.id.choice2);
            ImageView choice3 = findViewById(R.id.choice3);
            TextView score = findViewById(R.id.score);
            question.setBackgroundResource(questions[questionNumber]);
            score.setText("الدرجة : "+String.valueOf(scoreValue));

            Random random = new Random();
            position=random.nextInt(3);
            switch (position){
                case 0:
                    choice1.setImageResource(correctAns[questionNumber]);
                    choice2.setImageResource(wrongAns[questionNumber]);
                    choice3.setImageResource(wrongAns[(questionNumber+1)%20]);
                    break;
                case 1:
                    choice2.setImageResource(correctAns[questionNumber]);
                    choice1.setImageResource(wrongAns[questionNumber]);
                    choice3.setImageResource(wrongAns[(questionNumber+1)%20]);
                    break;
                case 2:
                    choice3.setImageResource(correctAns[questionNumber]);
                    choice2.setImageResource(wrongAns[questionNumber]);
                    choice1.setImageResource(wrongAns[(questionNumber+1)%20]);
                    break;

            }}
    }
    private void checkEnd(){
        if(questionNumber==10) {
            Log.e("GameActivity","bound array");
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("مبروووك خلصت المستوي التاني !!!!!");
            builder.setMessage("العب من الاول  ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this, GameActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Game2Activity.this, InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }
    }
    public void playQuestion(View view){
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("خروج !!!!!");
        builder.setMessage("هل أنت متأكد من الخروج  ؟؟");
        builder.setInverseBackgroundForced(true);
        builder.setPositiveButton("ايوة", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Intent intent = new Intent(Game2Activity.this, InterfaceActivity.class);
                finish();

                startActivity(intent);
            }
        });
        builder.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();}

}

