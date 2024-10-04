package com.opsc7312.landmarknavigator_icetask4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng

// Firebase authentication
import com.google.firebase.auth.FirebaseAuth


class DirectionsService {
    fun fetchRoute(origin: LatLng, destination: LatLng, onRouteReceived: (List<LatLng>) -> Unit) {
        // Call Google Directions API, parse response, and return route
    }
}
