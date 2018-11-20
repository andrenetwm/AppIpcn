package com.example.root.ipcn_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BreveCWPdfActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breve_cw_pdf);

        pdfView = (PDFView)findViewById(R.id.pdfview_breve_cw);
        pdfView.fromAsset("pdf/breve-catecismo-westminster.pdf").load();
    }
}
