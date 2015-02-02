package com.example.vidyadhar.url;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TabHost initialization

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        //for the club Feed
        TabHost.TabSpec tabSpecFeed = tabHost.newTabSpec("Feed");
        tabSpecFeed.setContent(R.id.Feed);
        tabSpecFeed.setIndicator("Feed");
        tabHost.addTab(tabSpecFeed);
        //for the club Events
        TabHost.TabSpec tabSpecEvents = tabHost.newTabSpec("Events");
        tabSpecEvents.setContent(R.id.Events);
        tabSpecEvents.setIndicator("Events");
        tabHost.addTab(tabSpecEvents);
        //for the club Members
        TabHost.TabSpec tabSpecMembers = tabHost.newTabSpec("Members");
        tabSpecMembers.setContent(R.id.Members);
        tabSpecMembers.setIndicator("Members");
        tabHost.addTab(tabSpecMembers);
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
