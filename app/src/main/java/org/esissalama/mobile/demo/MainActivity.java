package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView dice = (ImageView) findViewById(R.id.dice);
        View jouer = (Button) findViewById(R.id.jouer);
        jouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random =  new Random().nextInt(6)+1;
                int mesImages[] = {
                        R.drawable.dice_1,
                        R.drawable.dice_2,
                        R.drawable.dice_3,
                        R.drawable.dice_4,
                        R.drawable.dice_5,
                        R.drawable.dice_6
                };
                int img ;
                switch (random)
                {
                    case 1:
                        img =  mesImages[0];
                        break;
                    case 2:
                        img =  mesImages[1];
                        break;
                    case 3:
                        img =  mesImages[2];
                        break;
                    case 4:
                        img =  mesImages[3];
                        break;
                    case 5:
                        img =  mesImages[4];
                        break;
                    case 6:
                        img =  mesImages[5];
                        break;
                    default:
                        img= mesImages[1];;
                        break;
                }

                dice.setImageResource(img);

            }
        });

    }


}