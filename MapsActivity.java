package com.example.welcome.chapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(11.0817, 76.9979);
        LatLng sydney1 = new LatLng(11.059575, 77.074833);
        LatLng sydney2 = new LatLng(10.998492, 76.964261);
        LatLng sydney3 = new LatLng(11.058185, 77.070208);
        LatLng sydney4 = new LatLng(11.010785, 76.960446);
        LatLng sydney5 = new LatLng(11.042367, 77.044297);
        LatLng sydney6 = new LatLng(11.022379, 76.995843);


        mMap.addMarker(new MarkerOptions().position(sydney).title("I am here").icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));
        mMap.addMarker(new MarkerOptions().position(sydney1).title("Le-Meridian,coimbatore"));
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Hotel Rathna Residency,coimbatore"));
        mMap.addMarker(new MarkerOptions().position(sydney3).title("Clarion hotel, Coimbatore"));
        mMap.addMarker(new MarkerOptions().position(sydney4).title("VIjay Park Inn, Coimbatore"));
        mMap.addMarker(new MarkerOptions().position(sydney5).title("The Arcadia, Coimbatore"));
        mMap.addMarker(new MarkerOptions().position(sydney6).title("Haribhavanam, Coimbatore"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
