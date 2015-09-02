package com.kasijjuf.udacity.project0myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void displayMoviesToast(View view) {
        Toast.makeText(getApplicationContext(), "This will open the Movies app", LENGTH_SHORT).show();
    }

    public void displayScoresToast(View view) {
        Toast.makeText(getApplicationContext(), "This will open the Scores app", LENGTH_SHORT).show();
    }

    public void displayLibraryToast(View view) {
        Toast.makeText(getApplicationContext(), "This will open the Library app", LENGTH_SHORT).show();
    }

    public void displayBuildBiggerToast(View view) {
        Toast.makeText(getApplicationContext(), "This will open the Build It Bigger app", LENGTH_SHORT).show();
    }

    public void displayXYZReadeToast(View view) {
        Toast.makeText(getApplicationContext(), "This will open the XYZ Reader app", LENGTH_SHORT).show();
    }

    public void displayCapstoneToast(View view) {
        Toast.makeText(getApplicationContext(), "This will open my Capstone app", LENGTH_SHORT).show();
    }
}
