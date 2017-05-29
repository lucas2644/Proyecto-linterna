package com.proyecto1.linterna;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //encernder el flash
        camera =Camera.open();
        Camera.Parameters parameters =camera.getParameters();
        parameters.setFlashMode(parameters.FLASH_MODE_TORCH);
        camera.setParameters(parameters);
        camera.startPreview();
    }
    @Override
    public void onBackPressed()
    {
       super.onBackPressed();

      camera.stopPreview();
        camera.release();

    }
    //apagar la linterna



}
