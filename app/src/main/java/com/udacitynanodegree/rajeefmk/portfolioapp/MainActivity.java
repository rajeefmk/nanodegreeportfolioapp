package com.udacitynanodegree.rajeefmk.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showToast(View v) {

        if (v.getId() == R.id.popularMovie) {

            showToastMessage(getResources().getString(R.string.button_text_popular_movies));

        } else if (v.getId() == R.id.superDuo) {

            showToastMessage(getResources().getString(R.string.button_text_super_duo));

        } else if (v.getId() == R.id.buildItBigger) {

            showToastMessage(getResources().getString(R.string.button_text_build_it_bigger));

        } else if (v.getId() == R.id.materialApp) {

            showToastMessage(getResources().getString(R.string.button_text_material_app));

        } else if (v.getId() == R.id.goUbiquitous) {

            showToastMessage(getResources().getString(R.string.button_text_go_ubiquitous));

        } else if (v.getId() == R.id.capStone) {

            showToastMessage(getResources().getString(R.string.button_text_capstone));

        }


    }

    private void showToastMessage(String string) {

        Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_message_template)
                + " " + string + " " + "app", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


}
