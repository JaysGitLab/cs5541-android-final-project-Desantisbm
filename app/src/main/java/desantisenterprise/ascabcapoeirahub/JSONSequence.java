package desantisenterprise.ascabcapoeirahub;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by Broderick on 12/4/2016.
 */

public class JSONSequence {
    private Context context;
    private String filename;

    private static final String TAG = "Stored Sequences";
    private static final String FILENAME = "sequences.json";

    public JSONSequence(Context c, String f){
        context = c;
        filename = f;
    }

    public void saveSequences(ArrayList<Sequence> stored)
            throws JSONException, IOException{
        JSONArray array = new JSONArray();
        for (Sequence s : stored){
            array.put(s.toJSON()); //called from sequence class, takes a sequence and converts its parts into JSON storable format
        }

        Writer w = null;
        try {
            OutputStream o = context
                    .openFileOutput(filename, Context.MODE_PRIVATE);
            w = new OutputStreamWriter(o);
            w.write(array.toString());
        }finally {
            if(w!=null){
                w.close();
            }

        }

    }


}
