package fr.rtgrenoble.crouzetl.logo;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView legendTextView;
    private ImageView image;
    static final String LEGENDE = "leg";
    static final String IMAGE = "im";
    private int leg = R.string.txt1;
    private  int im = R.drawable.android_lollipop;

    private void SetLogoLengend(int logoId, int legendId){
        this.leg = legendId;
        this.im = logoId;
        legendTextView.setText(legendId);
        image.setImageResource(logoId);
    }

    public void onClickButton1(View v){
        leg = R.string.txt1;
        im = R.drawable.android_lollipop;
        SetLogoLengend(im,leg);
    }

    public void onClickButton2(View v){
        leg = R.string.txt2;
        im = R.drawable.android_kitkat;
        SetLogoLengend(im,leg);
    }

    public void onClickButton3(View v){
        leg = R.string.txt3;
        im = R.drawable.android_jelly_bean;
        SetLogoLengend(im,leg);
    }

    public void onClickButton4(View v){
        leg = R.string.txt4;
        im = R.drawable.android_ice_cream_sandwich;
        SetLogoLengend(im,leg);
    }

    public void onClickButton5(View v){
        leg = R.string.txt5;
        im = R.drawable.android_honeycomb;
        SetLogoLengend(im,leg);
    }

    public void onClickButton6(View v){
        leg = R.string.txt6;
        im = R.drawable.android_gingerbread;
        SetLogoLengend(im,leg);
    }



    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(LEGENDE,leg);
        savedInstanceState.putInt(IMAGE,im);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        leg = savedInstanceState.getInt(LEGENDE);
        im = savedInstanceState.getInt(IMAGE);
        SetLogoLengend(im,leg);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        legendTextView = (TextView) findViewById(R.id.legend);
        image = (ImageView) findViewById(R.id.logo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 1. Instantiate an AlertDialog.Builder with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage(R.string.about_message)
                .setTitle(R.string.action_about)
                .show();

        return super.onOptionsItemSelected(item);
    }
}
