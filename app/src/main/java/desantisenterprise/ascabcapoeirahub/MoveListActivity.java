package desantisenterprise.ascabcapoeirahub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Broderick on 9/22/2016.
 */

public class MoveListActivity extends AppCompatActivity{
    private Button favoritesButton;
    private Button blackListButton;
    private Button randomSequenceButton;
    private Button testCollectionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movelist_view);

        //Establishes a link between Home page and Event Page
        testCollectionButton = (Button) findViewById(R.id.testCollectionButton);
        testCollectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoveListActivity.this, BeltList.class);
                startActivity(i);
            }
        });

        randomSequenceButton = (Button) findViewById(R.id.randomSequenceButton);
        randomSequenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoveListActivity.this, RandomSequenceActivity.class);
                startActivity(i);
            }
        });

        favoritesButton = (Button) findViewById(R.id.favoritesButton);
        favoritesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoveListActivity.this, BlackStar.class);
                i.putExtra("F_Or_B", "favorite");
                startActivity(i);
            }
        });

        blackListButton = (Button) findViewById(R.id.blackListButton);
        blackListButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoveListActivity.this, BlackStar.class);
                i.putExtra("F_Or_B", "blacklist");
                startActivity(i);
            }

        }));
    }
}
