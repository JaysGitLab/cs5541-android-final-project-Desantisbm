package desantisenterprise.ascabcapoeirahub;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.sax.RootElement;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Broderick on 11/25/2016.
 */

public class GeneratedSequence extends ExpandableListActivity {
        Sequence sequence = new Sequence();
        private ArrayList<String> parent = new ArrayList<>();
        private ArrayList<Object> child = new ArrayList<>();
        private boolean[] beltCheck = new boolean[8];
        private long seqSize;
        private int seqLength;
        Random dice = new Random();

    private static final String TAG = "Stored Sequences";
    private static final String FILENAME = "sequences.json";
    private ArrayList<Sequence> jsonSeq;
    private JSONSequence json;
    private static GeneratedSequence genSeq;
    private Context c;


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            beltCheck = getIntent().getBooleanArrayExtra("beltCheck");
            seqSize = getIntent().getLongExtra("NumberCount", seqSize); ////trying to pass number count. check put Extra
            seqLength = (int)seqSize;

            buildSequence(beltCheck, seqLength);
            ExpandableListView expandable = getExpandableListView();
            expandable.setDividerHeight(2);
            expandable.setGroupIndicator(null);
            expandable.setClickable(true);
            setUpListView();

            MyExpandableAdapter adapter = new MyExpandableAdapter(parent, child);

            adapter.setInflater((LayoutInflater)
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);
            expandable.setAdapter(adapter);
            expandable.setOnChildClickListener(this);



        }

    public void buildSequence(boolean[] beltCheck, int seqLength){
            Sequence random = new Sequence();
            if(beltCheck[0]){
                random.createGray(random);
            }if(beltCheck[1]){
                random.createGreen(random);
            }if(beltCheck[2]){
                random.createYellow(random);
            }if(beltCheck[3]){
                random.createBlue(random);
            }if(beltCheck[4]){
                random.creategreenYellow(random);
            }if(beltCheck[5]){
                random.creategreenBlue(random);
            }if(beltCheck[6]){
                random.createyellowBlue(random);
            }if(beltCheck[7]){
                random.createOther(random);
            }

            int diceRoll = 0;
            for(int i = 0; i < seqLength; i++){
                diceRoll = dice.nextInt(random.size()+ 1) ;
                sequence.addMove(random.getArray().get(diceRoll % (random.size())).getMovement());
            }

        }

        public void setUpListView() {
            for(Movement i : sequence.getArray()) {
                parent.add(i.getMovementName());
                ArrayList<String> child = new ArrayList<>(); //original type for child list
                child.add(i.getMovementName());
                this.child.add(child);
            }


            RelativeLayout rl = new RelativeLayout(this);
            RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.FILL_PARENT,
                    RelativeLayout.LayoutParams.FILL_PARENT);

            final Button favorite = new Button(this);
            favorite.setBackgroundResource(R.drawable.favoritesicon);

            final Button blackList = new Button(this);
            blackList.setBackgroundResource(R.drawable.blacklisticon);

            RelativeLayout.LayoutParams favoriteLayout = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            favoriteLayout.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            favoriteLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            favoriteLayout.height = 300;
            favoriteLayout.width = 300;
            favoriteLayout.bottomMargin = 300;

            RelativeLayout.LayoutParams blacklistLayout = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            blacklistLayout.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            blacklistLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            blacklistLayout.height = 300;
            blacklistLayout.width = 300;

            favorite.setLayoutParams(favoriteLayout);
            blackList.setLayoutParams(blacklistLayout);

            rl.addView(favorite);
            rl.addView(blackList);
            this.addContentView(rl, rlp);

            favorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        sequence.toJSON();
                        saveSeq();
                        favorite.setVisibility(favorite.GONE);
                        blackList.setVisibility(blackList.GONE);
                        //insert Toast here saying added to favorites or failed
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            });

            blackList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        sequence.toJSON();
                        saveSeq();
                        blackList.setVisibility(blackList.GONE);
                        favorite.setVisibility(favorite.GONE);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            });

        }
    public boolean saveSeq(){
        try{
            json.saveSequences(jsonSeq);
            Log.d(TAG, "sequences saved to file");
            return true;
        }catch(Exception e){
            Log.e(TAG, "Error saving sequences");
            return false;
        }
    }

    }