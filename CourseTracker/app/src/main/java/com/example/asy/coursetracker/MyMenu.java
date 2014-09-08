package com.example.asy.coursetracker;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_menu);
    }

    public void onClickOpenCalendar(View v) {

        Intent OpenCalendar = new Intent(MyMenu.this,Calendar.class);
        startActivity(OpenCalendar);

    }

    public void onClickOpenNotes(View v) {

        Intent Open = new Intent(MyMenu.this,Notes.class);
        startActivity(Open);

    }

    public void onClickOpenMenu(View v) {

        Intent Open = new Intent(MyMenu.this,MySubjectMenu.class);
        startActivity(Open);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
