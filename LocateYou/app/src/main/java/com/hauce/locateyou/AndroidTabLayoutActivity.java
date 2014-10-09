package com.hauce.locateyou;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class AndroidTabLayoutActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TabHost tabHost = getTabHost();

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Home", getResources().getDrawable(R.drawable.icon_home_tab)).setContent(new Intent(this, HomeActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Map", getResources().getDrawable(R.drawable.icon_map_tab)).setContent(new Intent(this, MapActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Directory", getResources().getDrawable(R.drawable.icon_directory_tab)).setContent(new Intent(this, DirectoryActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Track", getResources().getDrawable(R.drawable.icon_track_tab)).setContent( new Intent(this, TrackActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Details", getResources().getDrawable(R.drawable.icon_details_tab)).setContent(new Intent(this, DetailsActivity.class)));

    }
}