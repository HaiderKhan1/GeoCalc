package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class sbt extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbt);
        final Button RectAnswer=(Button) findViewById(R.id. SbtAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText SbtHeight = (EditText) findViewById(R.id.SbtHeight);
                EditText SbtBase= (EditText) findViewById(R.id.SbtBase);
                EditText SbtLength= (EditText) findViewById(R.id.SbtLength);
                TextView SbtSurfaceArea = (TextView) findViewById(R.id.SbtSurfaceArea);
                TextView SbtVolume= (TextView) findViewById(R.id.SbtVolume);
                int Sbtlength = Integer.parseInt(SbtLength.getText().toString());
                int Sbtbase = Integer.parseInt(SbtBase.getText().toString());
                int Sbtheight = Integer.parseInt(SbtHeight.getText().toString());
                int SurfaceArea = (2*Sbtbase*Sbtlength)+(Sbtbase*Sbtbase);
                int Volume =Sbtbase*Sbtlength*Sbtheight;
                SbtSurfaceArea.setText(SurfaceArea + "");
                SbtVolume.setText(Volume + "");
            }
        });
    }
}

