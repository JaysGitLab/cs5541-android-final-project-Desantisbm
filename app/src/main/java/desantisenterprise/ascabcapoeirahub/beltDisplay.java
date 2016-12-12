package desantisenterprise.ascabcapoeirahub;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.widget.ExpandableListView;




/**
 * Created by Broderick on 11/8/2016.
 */

public class beltDisplay extends ExpandableListActivity {
    Sequence sequence = new Sequence();
    private ArrayList<String> duck = new ArrayList<>();
    private ArrayList<Object> duckling = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String belt = getIntent().getStringExtra("beltColor");
        setBelt(belt);
        ExpandableListView expandable = getExpandableListView();
        expandable.setDividerHeight(2);
        expandable.setGroupIndicator(null);
        expandable.setClickable(true);
        setUpListView();


        MyExpandableAdapter adapter = new MyExpandableAdapter(duck, duckling);

        adapter.setInflater((LayoutInflater)
                getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);
        expandable.setAdapter(adapter);
        expandable.setOnChildClickListener(this);
    }

    public void setBelt(String color) {
        switch (color) {
            case "gray":
                sequence.createGray(sequence);
                break;
            case "green":
                sequence.createGreen(sequence);
                break;
            case "yellow":
                sequence.createYellow(sequence);
                break;
            case "blue":
                sequence.createBlue(sequence);
                break;
            case "green/yellow":
                sequence.creategreenYellow(sequence);
                break;
            case "green/blue":
                sequence.creategreenBlue(sequence);
                break;
            case "yellow/blue":
                sequence.createyellowBlue(sequence);
                break;
            case "other":
                sequence.createOther(sequence);
                break;
        }
    }

    public void setUpListView() {
        /*
        PlayGifView gif = (PlayGifView) findViewById(R.id.viewGif);
        for (Movement i : sequence.getArray()) {
            duck.add(i.getMovementName());
            ArrayList<PlayGifView> egg = new ArrayList<>();
            addContentView(gif, null);
            gif.setImageResource(i.getGifLink());
            egg.add(gif);
            this.duckling.add(egg);
        }
        */
        //original code
        for (Movement i : sequence.getArray()) {
            duck.add(i.getMovementName());
            ArrayList<String> egg = new ArrayList<>();
            egg.add(i.getMovementName());
            this.duckling.add(egg);
        }

    }
}
