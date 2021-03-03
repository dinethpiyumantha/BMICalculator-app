package com.dinethpiyumantha.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText h;
    private EditText w;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        h = (EditText) findViewById(R.id.txtinp1);
        w = (EditText) findViewById(R.id.txtinp2);
        result = (TextView) findViewById(R.id.txtout);
    }

    public void calculateBmi(View view) {
        int hinp = Integer.parseInt(h.getText().toString());
        double winp = Double.parseDouble(w.getText().toString());
        double r = winp/Math.pow((hinp/100),2);
        result.setText(String.valueOf(r));
    }
}