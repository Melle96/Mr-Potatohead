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
        CheckBox checkbox = (CheckBox) v;
        boolean checked = checkbox.isChecked();

        switch(v.getId()) {
            case R.id.arms:

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
            case R.id.shoes:
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
            case R.id.glasses:
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
            case R.id.hat:
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
            case R.id.eyebrows:
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
            case R.id.mouth:
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
            case R.id.nose:
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
            case R.id.eyes:
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
            case R.id.ears:
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
            case R.id.mustache:
                ImageView moustache = (ImageView) findViewById(R.id.mustache);
                if (checked)
                {
                    moustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    moustache.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

}


}
