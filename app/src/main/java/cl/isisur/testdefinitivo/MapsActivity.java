package cl.isisur.testdefinitivo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.testdefinitivo.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng Lugar1 = new LatLng(-36.821628231403345, -73.05390285158329);
        LatLng Lugar2 = new LatLng(-36.82723795172677, -73.05370434552528);
        LatLng Lugar3 = new LatLng(-36.81929447447984, -73.04953472860005);
        LatLng Lugar4 = new LatLng(-36.827077739476046, -73.04814048441686);
        LatLng Lugar5 = new LatLng(-36.82235774241482, -73.05374331325349);
        mMap.addMarker(new MarkerOptions().position(Lugar1).title("Tostaduría Saldaña"));
        mMap.addMarker(new MarkerOptions().position(Lugar2).title("Tostaduría El Nogal"));
        mMap.addMarker(new MarkerOptions().position(Lugar3).title("Mundo Mani"));
        mMap.addMarker(new MarkerOptions().position(Lugar4).title("Nuts Deshidratados"));
        mMap.addMarker(new MarkerOptions().position(Lugar5).title("Tostaduria el Abasto Chile"));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugar1));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);
    }
}