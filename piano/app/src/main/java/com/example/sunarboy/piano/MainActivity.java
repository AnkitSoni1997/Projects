package com.example.sunarboy.piano;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven;
    String TAG="MainaAtivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.two);
        four=findViewById(R.id.three);
        five=findViewById(R.id.four);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);

            }
        });four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(v);

            }
        });
    }

    public void playMusic(View view){

        int id=view.getId();

        String nameId=view.getResources().getResourceEntryName(id);

        int musicid=view.getResources().getIdentifier(nameId,"raw","com.example.sunarboy.piano");
        MediaPlayer ankit=MediaPlayer.create(this,musicid);
        ankit.start();

    }
}
