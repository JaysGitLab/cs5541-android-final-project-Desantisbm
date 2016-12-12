package desantisenterprise.ascabcapoeirahub;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class FamilyActivity extends FragmentActivity implements OnMapReadyCallback {
    static final LatLng AGUA = new LatLng(36.202300, -81.666259);
    static final LatLng LOBO_MAU = new LatLng(35.863423, -78.715441);
    static final LatLng MESTRE_DOTOUR = new LatLng(39.956166, -75.159553);
    static final LatLng JEROMIN = new LatLng(40.761963, -73.925190);
    private GoogleMap google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
       mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap map) {
google = map;

        Marker agua =  google.addMarker(new MarkerOptions()
                .position(AGUA)
                .title("Capoeira Arte Antigua")
                .snippet("Instructor: Monitor Agua de Bebe\n" +
                        "188 Boone Docks Rd, Boone, NC 28607\n" +
                        "M 6:00pm\n" +
                        "W 7:00pm\n" +
                        "R 7:00pm\n" +
                        "Su 12:30pm\n" +
                        "10$/Class"));

        Marker loboMau = google.addMarker(new MarkerOptions()
                .position(LOBO_MAU)
                .title("ASCAB NC")
                .snippet("Instructor: Monitor Lobo Mau\n" +
                        "7101 Glenwood Ave Raleigh NC 27612\n" +
                        "M 7:30pm\n" +
                        "W 7:30pm\n" +
                        "S 1:00pm\n" +
                        "10$/Class"));

        Marker dotour = google.addMarker(new MarkerOptions()
                .position(MESTRE_DOTOUR)
                .title("ASCAB Philly Capoeira")
                .snippet("Instrcutor: Mestre Dotour\n" +
                        "1213 Race Street Philadelphia, PA, United States 19107\n" +
                        "M 5:30pm, 7:00pm\n" +
                        "T 5:30pm, 6:30pm\n" +
                        "W 5:30pm, 7:00pm\n" +
                        "Th 5:30pm, 6:30pm\n" +
                        "F 5:30pm, 6:30pm\n" +
                        "S 1:00pm, 2:00pm, 3:00pm\n" +
                        "15$/Kids Class\n" +
                        "20$/Adult Class"));

        Marker jeromin = google.addMarker(new MarkerOptions()
                .position(JEROMIN)
                .title("Capoeira Astoria")
                .snippet("Instructor: Contra Mestre Jeromin\n" +
                        "31-08 Broadway, 2nd Floor, Astoria NY 11106\n" +
                        "M 5:00pm, 8:00pm\n" +
                        "T 8:00pm\n" +
                        "W 8:00pm\n" +
                        "F 5:00pm\n" +
                        "S 10:00pm\n" +
                        "20$/Class"));

        google.moveCamera(CameraUpdateFactory.newLatLng(AGUA));


    }
}
