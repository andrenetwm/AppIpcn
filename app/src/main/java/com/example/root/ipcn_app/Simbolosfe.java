package com.example.root.ipcn_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class Simbolosfe extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simbolos_fe);


        Button btnCfw = (Button) findViewById(R.id.btn_cfw);
        btnCfw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(Simbolosfe.this, CfwPdfActivity.class);
                startActivity(it);
            }
        });

        Button btnCmw = (Button) findViewById(R.id.btn_cmw);
        btnCmw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(Simbolosfe.this, CmwPdfActivity.class);
                startActivity(it);
            }
        });

        Button btnBrevCw = (Button) findViewById(R.id.btn_bcw);
        btnBrevCw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(Simbolosfe.this, BreveCWPdfActivity.class);
                startActivity(it);
            }
        });


    }
}