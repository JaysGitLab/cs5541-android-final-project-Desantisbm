package desantisenterprise.ascabcapoeirahub;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Broderick on 10/6/2016.
 */

public class BlackStar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String choice = getIntent().getStringExtra("F_Or_B");
        ArrayList<Sequence> fetchedSequences;

        try {
            //fetchedSequences = json.loadSequences();
        } catch (Exception e){
            fetchedSequences = new ArrayList<>();
            Toast.makeText(this, "Error Loading Sequences. chances are you havnt favorited any yet. get on that", Toast.LENGTH_LONG);
        }

        if(choice == "favorites"){
            //code to generate favorites


        }else{
            //code to generate blacklist


        }





    }
}
