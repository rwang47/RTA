package com.example.rou.rta;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;
import com.example.rou.rta.Route;

/**
 * Created by Rou on 4/30/16.
 */

public interface FindPathListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
