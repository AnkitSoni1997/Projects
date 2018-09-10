package com.example.sunarboy.bikelight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
ImageView iv,iv1;
boolean isFadeOut=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=findViewById(R.id.iv);
        iv1=findViewById(R.id.iv1);


        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                if (!isFadeOut)
                YoYo.with(Techniques.FadeOut).duration(1000).playOn(iv1);
                else
                    YoYo.with(Techniques.FadeIn).duration(1000).playOn(iv1);
                isFadeOut=!isFadeOut;}
                catch (Exception e){}

            }
        });







    }
}
