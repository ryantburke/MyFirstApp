package com.burke.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle;
    ImageView imLogo;
    EditText etName;
    Button btnGo;
    TextView tvDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tv_title);
        imLogo = findViewById(R.id.iv_logo);
        etName = findViewById(R.id.et_name);
        btnGo = findViewById(R.id.btn_go);
        tvDescription = findViewById(R.id.tv_description);
    }
}