package com.dicoding.associate.ikhwanbrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void picikanSoto (View view){
        goToUrl ( "https://historiafactory.wordpress.com/2017/03/31/salahuddin-al-ayyubi-2/");
    }

    public void picikanSup (View view) {
        goToUrl ( "https://www.visitmasjidalaqsa.com/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    

}
