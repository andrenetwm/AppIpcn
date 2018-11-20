package com.example.root.ipcn_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CmwPdfActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmw_pdf);

        pdfView = (PDFView)findViewById(R.id.pdfview_cmw);
        pdfView.fromAsset("pdf/catecismo-maior-westminster.pdf").load();
    }
}
