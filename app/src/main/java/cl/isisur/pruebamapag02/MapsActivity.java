package cl.isisur.pruebamapag02;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.pruebamapag02.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
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

        // Añade los puntos con sus respectivas coordenadas
        LatLng FrutosDeLosBosquesFrancia = new LatLng(-36.596659, -72.101926);
        LatLng FrutosDeLosBosquesLosCopihues = new LatLng(-36.625908, -72.116614);
        LatLng Lugares2 = new LatLng(-36.596659, -72.101926);
        LatLng FrutosDeLosBosquesIndependencia = new LatLng(-36.602789, -72.094376);
        LatLng FrutosDeLosBosquesUltraEstacion =new LatLng(-36.603656, -72.118654);
        LatLng FrutosDeLosBosquesAlonsoDeArcilla =new LatLng(-36.625279, -72.085447);


        // marcadores y nombres que apareceran en el mapa
        mMap.addMarker(new MarkerOptions().position(FrutosDeLosBosquesFrancia).title("Frutos De Los Bosques Francia"));
        mMap.addMarker(new MarkerOptions().position(FrutosDeLosBosquesLosCopihues).title("Fruto De Los Bosques Los Copihues"));
        mMap.addMarker(new MarkerOptions().position(FrutosDeLosBosquesIndependencia).title("Frutos De Los Bosques Independencia"));
        mMap.addMarker(new MarkerOptions().position(FrutosDeLosBosquesUltraEstacion).title("Frutos De Los Bosque Ultraestacion"));
        mMap.addMarker(new MarkerOptions().position(FrutosDeLosBosquesAlonsoDeArcilla).title("Frutos De Los Bosque Alonso De Arcilla"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugares2));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0F);
    }
}