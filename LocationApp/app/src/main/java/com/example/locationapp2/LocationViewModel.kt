package com.example.locationapp2

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.data.SourceLocation
import androidx.lifecycle.ViewModel

class LocationViewModel: ViewModel(){
    private val _location = mutableStateOf<LocationData?>(null)
    val location: State<LocationData?> = _location

    fun updateLocation(newLocation: LocationData){
        _location.value = newLocation
    }
}