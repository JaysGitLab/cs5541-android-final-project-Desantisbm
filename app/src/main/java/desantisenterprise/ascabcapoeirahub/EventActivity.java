package desantisenterprise.ascabcapoeirahub;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Broderick on 12/5/2016.
 */

public class EventActivity  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gif_layout);
        PlayGifView gif = (PlayGifView) findViewById(R.id.viewGif);
        gif.setImageResource(R.drawable.placeholder);
    }
}
