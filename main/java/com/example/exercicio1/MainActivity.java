package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       Button btn;
       EditText edt;
       TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.btn);
        edt =(EditText) findViewById(R.id.edt);
        txt =(TextView) findViewById(R.id.txt);
    }

    public void Clicar(View v)
    {
        double celcius =Double.parseDouble(edt.getText().toString());
        double f=celcius*1.8+32;
        txt.setText(f + " Fahrenheit");
    }
}