package com.hauce.locateyou;

/**
 * Created by hauce on 11/10/2014.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class testActivity extends FragmentActivity {
    // Fragment TabHost as mTabHost
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection);

        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Home", getResources().getDrawable(R.drawable.icon_home_tab)),
                FragmentHome.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Map", getResources().getDrawable(R.drawable.icon_map_tab)),
                FragmentMap.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Directory", getResources().getDrawable(R.drawable.icon_directory_tab)),
                FragmentDirectory.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab4").setIndicator("Track", getResources().getDrawable(R.drawable.icon_track_tab)),
                FragmentTrack.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab5").setIndicator("Details", getResources().getDrawable(R.drawable.icon_details_tab)),
                FragmentDetails.class, null);

    }
}