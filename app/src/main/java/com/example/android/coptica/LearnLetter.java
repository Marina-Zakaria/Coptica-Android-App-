package com.example.android.coptica;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.IOException;

import Model.Letter;

public class LearnLetter extends AppCompatActivity {
    Letter[] letters=Letters.letters;
    MediaPlayer mediaPlayer = new MediaPlayer();
    VideoView videoview;

    int letterNumber;
    int[] sound = new int[32];
    int[] exampleImage = new int[32];
    int[]example = new int[32];
    int[] video = new int[32];
    TextView name;
    ImageView letter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_letter);
       // videoview = (VideoView) findViewById(R.id.video);
        sound[0]=R.raw.alfa;
        sound[1]=R.raw.veta;
        sound[2]=R.raw.gamma;
        sound[3]=R.raw.delta;
        sound[4]=R.raw.ei;
        sound[5]=R.raw.soo;
        sound[6]=R.raw.zeta;
        sound[7]=R.raw.eita;
        sound[8]=R.raw.theta;
        sound[9]=R.raw.yota;
        sound[10]=R.raw.kapa;
        sound[11]=R.raw.lolla;
        sound[12]=R.raw.mei;
        sound[13]=R.raw.nei;
        sound[14]=R.raw.exy;
        sound[15]=R.raw.omekron;
        sound[16]=R.raw.pei;
        sound[17]=R.raw.ro;
        sound[18]=R.raw.cima;
        //sound[19]=R.raw.tav;
        sound[20]=R.raw.epsilon;
        sound[21]=R.raw.fei;
        sound[22]=R.raw.kei;
        sound[23]=R.raw.epsy;
        sound[24]=R.raw.omega;
        sound[25]=R.raw.shay;
        sound[26]=R.raw.fay;
        sound[27]=R.raw.khay;
        sound[28]=R.raw.hory;
        //sound[29]=R.raw.gengea;
        sound[30]=R.raw.chima;
        sound[31]=R.raw.ty;
        /*video[0]=R.raw.valfa;
        video[1]=R.raw.vveta;
        video[2]=R.raw.vgamma;
        //video[3]=R.raw.vdelta;
        video[4]=R.raw.vei;
        video[5]=R.raw.vsoo;
        video[6]=R.raw.vzeta;
        video[7]=R.raw.veita;
        video[8]=R.raw.vtheta;
        video[9]=R.raw.vyota;
        video[10]=R.raw.vkappa;
        video[11]=R.raw.vlolla;
        video[12]=R.raw.vmei;
        video[13]=R.raw.vnei;
        video[14]=R.raw.vexy;
        video[15]=R.raw.voo;
        video[16]=R.raw.vpei;
        video[17]=R.raw.vroo;
        video[18]=R.raw.vcima;
        video[19]=R.raw.vtav;
        video[20]=R.raw.vepsilon;
        video[21]=R.raw.vfei;
        //video[22]=R.raw.vkei;
       // video[23]=R.raw.vepsy;
        video[24]=R.raw.vomega;
        video[25]=R.raw.vshay;
        video[26]=R.raw.vfay;
        video[27]=R.raw.vkhay;
        video[28]=R.raw.vhoory;
        video[29]=R.raw.vgengea;
        video[30]=R.raw.vchima;
        video[31]=R.raw.vty;*/
        exampleImage[0]=R.drawable.cheese;
        exampleImage[1]=R.drawable.tree;
        exampleImage[2]=R.drawable.book;
        exampleImage[3]=R.drawable.plate;
        exampleImage[4]=R.drawable.chick;
        exampleImage[5]=R.drawable.six;
        exampleImage[6]=R.drawable.soup;
        exampleImage[7]=R.drawable.dome;
        exampleImage[8]=R.drawable.oven;
        exampleImage[9]=R.drawable.mirror;
        exampleImage[10]=R.drawable.whale;
        exampleImage[11]=R.drawable.lion;
        exampleImage[12]=R.drawable.soldier;
        exampleImage[13]=R.drawable.sailor;
        exampleImage[14]=R.drawable.rular;
        exampleImage[15]=R.drawable.kati3;
        exampleImage[16]=R.drawable.stone;
        exampleImage[17]=R.drawable.wall;
        exampleImage[18]=R.drawable.teacher;
       exampleImage[19]=R.drawable.ladder;
        exampleImage[20]=R.drawable.rain;
        exampleImage[21]=R.drawable.watermelon;
        exampleImage[22]=R.drawable.necklace;
        exampleImage[23]=R.drawable.scissors;
        exampleImage[24]=R.drawable.bread;
        exampleImage[25]=R.drawable.ring;
        exampleImage[26]=R.drawable.towel;
        exampleImage[27]=R.drawable.street;
        exampleImage[28]=R.drawable.tab;
       exampleImage[29]=R.drawable.olive;
        exampleImage[30]=R.drawable.ball;
        exampleImage[31]=R.drawable.village;

        example[0]=R.drawable.wcheese;
        example[1]=R.drawable.wtree;
        example[2]=R.drawable.wbook;
        example[3]=R.drawable.wplate;
        example[4]=R.drawable.wchick;
        example[5]=R.drawable.six;
        example[6]=R.drawable.wsoup;
        example[7]=R.drawable.wdome;
        example[8]=R.drawable.woven;
        example[9]=R.drawable.wmirror;
        example[10]=R.drawable.wwhale;
        example[11]=R.drawable.wlion;
        example[12]=R.drawable.wsoldier;
        example[13]=R.drawable.wsailor;
        example[14]=R.drawable.wrular;
        example[15]=R.drawable.wkati3;
        example[16]=R.drawable.wstone;
        example[17]=R.drawable.wwall;
        example[18]=R.drawable.wteacher;
        example[19]=R.drawable.wladder;
        example[20]=R.drawable.wrain;
        example[21]=R.drawable.wwatermalon;
        example[22]=R.drawable.wneclace;
        example[23]=R.drawable.wscissors;
        example[24]=R.drawable.wbread;
        example[25]=R.drawable.wring;
        example[26]=R.drawable.wtowl;
        example[27]=R.drawable.wstreet;
        example[28]=R.drawable.wtab;
        example[29]=R.drawable.wolive;
        exampleImage[30]=R.drawable.wball;
        example[31]=R.drawable.wvillage;

        for(int i=0;i<32;i++){
            letters[i].setImageExampleId(exampleImage[i]);
            letters[i].setSoundExampleId(sound[i]);
            letters[i].setVideoId(video[i]);
            letters[i].setExampleId(example[i]);
        }
        Intent intent=getIntent();
        letterNumber=intent.getIntExtra("letterNumber",0);
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(letters[letterNumber].getName());
        ImageView letter = (ImageView)findViewById(R.id.letter);
        letter.setImageResource(letters[letterNumber].getImageId());
        ImageView exampleimg = (ImageView)findViewById(R.id.example);
        exampleimg.setImageResource(letters[letterNumber].getExampleId());
        ImageView exampleImageimg = (ImageView)findViewById(R.id.exampleImage);
        exampleImageimg.setImageResource(letters[letterNumber].getImageExampleId());



    }
    public  void previous (View view){
        if(letterNumber!=0) {
            letterNumber--;
            TextView name = (TextView)findViewById(R.id.name);
            name.setText(letters[letterNumber].getName());
            ImageView letter = (ImageView)findViewById(R.id.letter);
            letter.setImageResource(letters[letterNumber].getImageId());
            ImageView exampleimg = (ImageView)findViewById(R.id.example);
            exampleimg.setImageResource(letters[letterNumber].getExampleId());
            ImageView exampleImageimg = (ImageView)findViewById(R.id.exampleImage);
            exampleImageimg.setImageResource(letters[letterNumber].getImageExampleId());

        }
    }
    public  void next (View view){
        if(letterNumber!=31) {
            letterNumber++;
            TextView name = (TextView)findViewById(R.id.name);
            name.setText(letters[letterNumber].getName());
            ImageView letter = (ImageView)findViewById(R.id.letter);
            letter.setImageResource(letters[letterNumber].getImageId());
            ImageView exampleimg = (ImageView)findViewById(R.id.example);
            exampleimg.setImageResource(letters[letterNumber].getExampleId());
            ImageView exampleImageimg = (ImageView)findViewById(R.id.exampleImage);
            exampleImageimg.setImageResource(letters[letterNumber].getImageExampleId());

        }
    }


    public void playSound(View view) throws IOException {


        mediaPlayer=MediaPlayer.create(LearnLetter.this,letters[letterNumber].getSoundExampleId());
        mediaPlayer.start();
    }
}
