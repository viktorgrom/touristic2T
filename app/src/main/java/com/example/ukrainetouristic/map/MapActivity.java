package com.example.ukrainetouristic.map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.ukrainetouristic.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng location = new LatLng(50.418020, 30.633058);
        MarkerOptions options = new MarkerOptions();
        options.position(location);
        options.title("Старт");
        options.snippet("Youuuuhy");
        options.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_icon));

        LatLng location2 = new LatLng(51.258020, 31.633058);
        MarkerOptions options2 = new MarkerOptions();
        options2.position(location2);
        options2.title("Старт");
        options2.snippet("Youuuuhy");
        options2.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_icon));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(location, +15));
        map.addMarker(options);
        map.addMarker(options2);

    }
}
