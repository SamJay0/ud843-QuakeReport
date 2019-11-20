package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView=convertView;
        if(ListItemView == null){
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.quake_container,parent,false);
        }
        Earthquake currentEarthquake=getItem(position);
        TextView magnitude=ListItemView.findViewById(R.id.magnitude);
        magnitude.setText(""+currentEarthquake.getMagnitude());
        TextView place=ListItemView.findViewById(R.id.place);
        place.setText(currentEarthquake.getPlace());
        TextView time =ListItemView.findViewById(R.id.time);
        time.setText(currentEarthquake.getTime());

        return ListItemView;
    }

}
