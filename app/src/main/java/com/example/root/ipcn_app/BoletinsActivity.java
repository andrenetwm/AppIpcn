package com.example.root.ipcn_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoletinsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boletins);


        Button btnJaneiro = (Button) findViewById(R.id.btn_janeiro);
        btnJaneiro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(BoletinsActivity.this, JaneiroBoletimActivity.class);
                startActivity(it);
            }
        });
    }
}
