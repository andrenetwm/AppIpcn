package com.example.root.ipcn_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CfwPdfActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfw_pdf);

        pdfView = (PDFView)findViewById(R.id.pdfview_cfw);
        pdfView.fromAsset("pdf/confissao-westminster.pdf").load();
    }
}
