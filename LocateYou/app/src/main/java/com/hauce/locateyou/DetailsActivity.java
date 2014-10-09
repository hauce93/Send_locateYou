package com.hauce.locateyou;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.plus.Plus;


public class DetailsActivity extends Activity implements OnClickListener {

    private GoogleApiClient mGoogleApiClient;
    private Button btnSignOut, btnRevokeAccess;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);

        btnSignOut = (Button) findViewById(R.id.btn_sign_out);

        btnSignOut.setOnClickListener(this);

    }

    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_sign_out) {
            if (mGoogleApiClient.isConnected()) {
                Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
                mGoogleApiClient.disconnect();
                mGoogleApiClient.connect();
            }
        }
    }
}
