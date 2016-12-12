package desantisenterprise.ascabcapoeirahub;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.view.View;

import java.io.InputStream;

/**
 * Created by Broderick on 11/22/2016.
 */

public class MovementGif extends View {
    private Movie movie;
    private InputStream is;
    private long moviestart;
    public MovementGif(Context context) {
        super(context);
        is=getResources().openRawResource(R.drawable.placeholder);
        movie=Movie.decodeStream(is);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        long now=android.os.SystemClock.uptimeMillis();

        if (moviestart == 0)
            moviestart = now;

        int relTime = (int)((now - moviestart) % movie.duration());
        movie.setTime(relTime);
        movie.draw(canvas,10,10);
        this.invalidate();
    }

}
