package com.example.melle.opdracht1.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v)
    {
        // loading checkbox clicked
        CheckBox checkbox = (CheckBox) v;

        // is checkbox checked or unchecked
        boolean checked = checkbox.isChecked();

        // getting text from checkbox
        // apply visibility to appropriate image
        switch(checkbox.getText().toString()) {
            case "arms":

                ImageView arms = (ImageView) findViewById(R.id.arms);
                if (checked)
                {
                    arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case "shoes":
                ImageView shoes = (ImageView) findViewById(R.id.shoes);
                if (checked)
                {
                    shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case "glasses":
                ImageView glasses = (ImageView) findViewById(R.id.glasses);
                if (checked)
                {
                    glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case "hat":
                ImageView hat = (ImageView) findViewById(R.id.hat);
                if (checked)
                {
                    hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case "eyebrows":
                ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                if (checked)
                {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case "mouth":
                ImageView mouth = (ImageView) findViewById(R.id.mouth);
                if (checked)
                {
                    mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case "nose":
                ImageView nose = (ImageView) findViewById(R.id.nose);
                if (checked)
                {
                    nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case "eyes":
                ImageView eyes = (ImageView) findViewById(R.id.eyes);
                if (checked)
                {
                    eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case "ears":
                ImageView ears = (ImageView) findViewById(R.id.ears);
                if (checked)
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case "moustache":
                ImageView mustache = (ImageView) findViewById(R.id.mustache);
                if (checked)
                {
                    mustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    // saving visibility settings
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        ImageView mustache = (ImageView) findViewById(R.id.mustache);
        outState.putInt("mustache", mustache.getVisibility());

        ImageView ears = (ImageView) findViewById(R.id.ears);
        outState.putInt("ears", ears.getVisibility());

        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        outState.putInt("eyes", eyes.getVisibility());

        ImageView nose = (ImageView) findViewById(R.id.nose);
        outState.putInt("nose", nose.getVisibility());

        ImageView mouth = (ImageView) findViewById(R.id.mouth);
        outState.putInt("mouth", mouth.getVisibility());

        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        outState.putInt("eyebrows", eyebrows.getVisibility());

        ImageView hat = (ImageView) findViewById(R.id.hat);
        outState.putInt("hat", hat.getVisibility());

        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        outState.putInt("glasses", glasses.getVisibility());

        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        outState.putInt("shoes", shoes.getVisibility());

        ImageView arms = (ImageView) findViewById(R.id.arms);
        outState.putInt("arms", arms.getVisibility());
    }

}