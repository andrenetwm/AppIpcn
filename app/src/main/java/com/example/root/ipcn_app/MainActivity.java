package com.example.root.ipcn_app;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "este é um menu floating action button", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_camera) {
            // Handle the camera action

        } else if (id == R.id.nav_sobreIgreja) {
            Intent intent1=new Intent(MainActivity.this,SobreIgrejaActivity.class);
            startActivity(intent1);



            /**fragmentManager.beginTransaction().replace(R.id.conteudo_fragmento, new FragmentoSobreIpcn()).commit();*/

        } else if (id == R.id.nav_simbolo_fe) {
            Intent intent1=new Intent(MainActivity.this,Simbolosfe.class);
            startActivity(intent1);

        } else if (id == R.id.nav_soc_interna) {
            Intent intent1=new Intent(MainActivity.this,SociedadesInternasActivity.class);
            startActivity(intent1);

        } else if (id == R.id.nav_galeria_videos) {
            Intent intent1=new Intent(MainActivity.this,PregacoesActivity.class);
            startActivity(intent1);

        } else if (id == R.id.nav_boletim_ipcn) {
            Intent intent1=new Intent(MainActivity.this,BoletinsActivity.class);
            startActivity(intent1);

        } else if (id == R.id.nav_radio_ipb) {
            Intent intent1=new Intent(MainActivity.this,RadioIpbActivity.class);
            startActivity(intent1);

        } else if (id == R.id.nav_biblia_ipcn) {

        } else if (id == R.id.nav_Lideranca) {
            Intent intent1=new Intent(MainActivity.this,LiderancaActivity.class);
            startActivity(intent1);

        } else if (id == R.id.nav_site_ipcn) {
            String url = "http://www.ipcn.org.br";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);


        } else if (id == R.id.nav_blog_ipcn) {
            String url = "http://blog.ipcn.org.br";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);

        } else if (id == R.id.nav_instagram) {
            String url = "https://www.instagram.com/ipresbiterianacn";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);

        } else if (id == R.id.nav_facebook) {
            String url = "https://www.facebook.com/ipresbiterianacn";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);

        } else if (id == R.id.nav_youtube) {
            String url = "https://www.youtube.com/ipresbiterianacn";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
