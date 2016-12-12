package desantisenterprise.ascabcapoeirahub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.Random;

import static desantisenterprise.ascabcapoeirahub.R.id.blueCheck;
import static desantisenterprise.ascabcapoeirahub.R.id.grayCheck;
import static desantisenterprise.ascabcapoeirahub.R.id.greenBlueCheck;
import static desantisenterprise.ascabcapoeirahub.R.id.greenCheck;
import static desantisenterprise.ascabcapoeirahub.R.id.greenYellowCheck;
import static desantisenterprise.ascabcapoeirahub.R.id.numberPrompt;
import static desantisenterprise.ascabcapoeirahub.R.id.otherCheck;
import static desantisenterprise.ascabcapoeirahub.R.id.randomSequence;
import static desantisenterprise.ascabcapoeirahub.R.id.yellowBlueCheck;
import static desantisenterprise.ascabcapoeirahub.R.id.yellowCheck;

/**
 * Created by Broderick on 9/27/2016.
 */
public class RandomSequenceActivity extends Activity {
    private Button generate;
    long count = 0;

    private CheckBox gray;
    private CheckBox green;
    private CheckBox yellow;
    private CheckBox blue;
    private CheckBox greenYellow;
    private CheckBox greenBlue;
    private CheckBox yellowBlue;
    private CheckBox other;
    private EditText numberprompt;

    private boolean[] beltCheck = new boolean[8];

    @Override
    protected void onCreate(Bundle sI){
        super.onCreate(sI);
        setContentView(R.layout.random_sequence_generator_view);


        gray = (CheckBox)findViewById(grayCheck);
        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gray.isChecked()){
                    beltCheck[0] = true;
                } else {
                    beltCheck[0] = false;
                }
            }
        });

        green = (CheckBox)findViewById(greenCheck);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (green.isChecked()){
                    beltCheck[1] = true;
                } else {
                    beltCheck[1] = false;
                }
            }
        });

        yellow = (CheckBox)findViewById(yellowCheck);
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yellow.isChecked()){
                    beltCheck[2] = true;
                } else {
                    beltCheck[2] = false;
                }
            }
        });

        blue = (CheckBox)findViewById(blueCheck);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blue.isChecked()){
                    beltCheck[3] = true;
                } else {
                    beltCheck[3] = false;
                }
            }
        });

        greenYellow = (CheckBox)findViewById(greenYellowCheck);
        greenYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (greenYellow.isChecked()){
                    beltCheck[4] = true;
                } else {
                    beltCheck[4] = false;
                }
            }
        });

        greenBlue = (CheckBox)findViewById(greenBlueCheck);
        greenBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (greenBlue.isChecked()){
                    beltCheck[5] = true;
                } else {
                    beltCheck[5] = false;
                }
            }
        });

        yellowBlue = (CheckBox)findViewById(yellowBlueCheck);
        yellowBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yellowBlue.isChecked()){
                    beltCheck[6] = true;
                } else {
                    beltCheck[6] = false;
                }
            }
        });

        other = (CheckBox)findViewById(otherCheck);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (other.isChecked()){
                    beltCheck[7] = true;
                } else {
                    beltCheck[7] = false;
                }
            }
        });


        numberprompt = (EditText)findViewById(R.id.numMoves);

        //need to get input from keypad and call add that to putExtra. from there the rest should be a cake walk.
        generate  = (Button) findViewById(R.id.Generatebutton);
        generate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count = Integer.parseInt(numberprompt.getText().toString());
                Intent i = new Intent(RandomSequenceActivity.this, GeneratedSequence.class);
                i.putExtra("beltCheck", beltCheck);
                i.putExtra("NumberCount", count);
                if (areAllFalse(beltCheck)) {
                    startActivity(i);
                }
            }
        });

    }

    public static boolean areAllFalse(boolean[] array){
        for(boolean b : array) if (b) return true;
        return false;
    }

}
