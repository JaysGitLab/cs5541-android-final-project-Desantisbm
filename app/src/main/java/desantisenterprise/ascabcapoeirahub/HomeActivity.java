package desantisenterprise.ascabcapoeirahub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button eventButton;
    private Button moveListButton;
    private Button familyButton;
    private Button challengeButton;
    private Button aboutButton;
    private Button adminButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Establishes a link between Home page and Event Page
        eventButton = (Button) findViewById(R.id.eventButton);
        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, EventActivity.class);
                startActivity(i);
            }
        });

        //Establishes a link between Home page and MoveList Page
        moveListButton = (Button) findViewById(R.id.moveListButton);
        moveListButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, MoveListActivity.class);
                startActivity(i);
            }
        }));
        //Establishes a link between Home page and ASCABFamily Page
        familyButton = (Button) findViewById(R.id.familyButton);
        familyButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, FamilyActivity.class);
                startActivity(i);
            }
        }));

        //Establishes a link between Home page and Weekly Challenge Page in case you forget, its on the ascabHuB evernote page
        /*
        challengeButton = (Button) findViewById(R.id.challengeButton);
        challengeButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, ChallengeActivity.class);
                startActivity(i);
            }
        }));
        */
        //Establishes a link between Home page and About Page
        aboutButton = (Button) findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(i);
            }
        }));
    }
}
