package com.example.android.coptica;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    int[] questions = new int[10];
    int[] correctAns = new int [10];
    int[] wrongAns = new int [20];
    int questionNumber =0,position,scoreValue =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TextView game = findViewById(R.id.game);
        game.setText("اسمع الكلمة و اختار شكلها الصحيح");
        questions[0]=R.raw.daughter;
        questions[1]=R.raw.purple;
        questions[2]=R.raw.foot;
        questions[3]=R.raw.dog;
        questions[4]=R.raw.horse;
        questions[5]=R.raw.black;
        questions[6]=R.raw.epsy;
        questions[7]=R.raw.ro;
        questions[8]=R.raw.yrllow;
        questions[9]=R.raw.hand;

        correctAns[0]=R.drawable.wdaughter;
        correctAns[1]=R.drawable.wpurple;
        correctAns[2]=R.drawable.wfoot;
        correctAns[3]=R.drawable.wdog;
        correctAns[4]=R.drawable.whorse;
        correctAns[5]=R.drawable.wblack;
        correctAns[6]=R.drawable.epsy;
        correctAns[7]=R.drawable.roo;
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
        wrongAns[17]=R.drawable.wladder;
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
                    scoreValue=scoreValue+10;
                newQuesion();}
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(GameActivity.this,InterfaceActivity.class);
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
            builder.setMessage("حاول مرة تانية ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(GameActivity.this,InterfaceActivity.class);
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
                    scoreValue+=10;

                    newQuesion();}
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(GameActivity.this,InterfaceActivity.class);
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
            builder.setMessage("حاول مرة تانية ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(GameActivity.this,InterfaceActivity.class);
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
                    scoreValue+=10;

                    newQuesion();}
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(GameActivity.this,InterfaceActivity.class);
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
            builder.setMessage("حاول مرة تانية ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();

                    Intent intent = new Intent(GameActivity.this,InterfaceActivity.class);
                    finish();
                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();

        }

    }

    public void playQuestion(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(GameActivity.this,questions[questionNumber]);
        mediaPlayer.start();
    }
    private void newQuesion(){
        checkEnd();
        if(questionNumber<10){
        ImageView choice1 = findViewById(R.id.choice1);
        ImageView choice2 = findViewById(R.id.choice2);
        ImageView choice3 = findViewById(R.id.choice3);
        TextView score = findViewById(R.id.score);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setTitle("مبروووك خلصت المتوي الاول !!!!!");
            builder.setMessage("يلا المستوي اللي بعده  ؟؟");
            builder.setInverseBackgroundForced(true);
            builder.setPositiveButton("يلا", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(GameActivity.this, Game2Activity.class);
                    finish();

                    startActivity(intent);
                }
            });
            builder.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(GameActivity.this, InterfaceActivity.class);
                    finish();

                    startActivity(intent);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }
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
                Intent intent = new Intent(GameActivity.this, InterfaceActivity.class);
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

