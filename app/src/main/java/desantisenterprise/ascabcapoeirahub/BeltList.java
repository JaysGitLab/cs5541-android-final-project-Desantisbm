package desantisenterprise.ascabcapoeirahub;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import desantisenterprise.ascabcapoeirahub.Movement;

/**
 * Created by Broderick on 10/6/2016.
 */

public class BeltList extends AppCompatActivity{
    private Button grayBelt;
    private Button greenBelt;
    private Button yellowBelt;
    private Button blueBelt;
    private Button greenYellowBelt;
    private Button greenBlueBelt;
    private Button yellowBlueBelt;
    private Button other;
    public String belt;


//What i want to do with this class is call a singular layout view that changes the value of several strings by using each button to set those strings to the movement lists.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beltlist_view);
        grayBelt = (Button) findViewById(R.id.grayBelt);
        grayBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "gray";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }

        });

        greenBelt = (Button) findViewById(R.id.greenBelt);
        greenBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "green";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }
        });

        yellowBelt = (Button) findViewById(R.id.yellowBelt);
        yellowBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "yellow";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }
        });

        blueBelt = (Button) findViewById(R.id.blueBelt);
        blueBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "blue";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }
        });

        greenYellowBelt = (Button) findViewById(R.id.greenYellowBelt);
        greenYellowBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "green/yellow";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }
        });

        greenBlueBelt = (Button) findViewById(R.id.greenBlueBelt);
        greenBlueBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "green/blue";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }
        });

        yellowBlueBelt = (Button) findViewById(R.id.yellowBlueBelt);
        yellowBlueBelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "yellow/blue";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }
        });

        other = (Button) findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belt = "other";
                Intent i = new Intent(BeltList.this, beltDisplay.class);
                i.putExtra( "beltColor", belt);
                startActivity(i);
            }
        });
    }

    public String getBelt() {
        return belt;
    }
}
