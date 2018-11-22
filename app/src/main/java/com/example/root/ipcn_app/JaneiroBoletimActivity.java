package com.example.root.ipcn_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class JaneiroBoletimActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janeiro_boletim);

        pdfView = (PDFView)findViewById(R.id.pdfview_janeiro_boletim);
        pdfView.fromAsset("pdf/boletins/janeiro2018.pdf").load();
    }
}
