package lff.com.ar.free_fire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

    public void sendFeedback(View button) {
    }

<include layout=”@layout/main_content”/>

private void setToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

final ActionBar ab = getSupportActionBar();

        if (ab != null) {

        ab.setHomeAsUpIndicator(R.mipmap.ic_launcher);

        ab.setDisplayHomeAsUpEnabled(true);

        }

        }

@Override

public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {

        case android.R.id.home:

        drawerLayout.openDrawer(GravityCompat.START);

        return true;

        }

        return super.onOptionsItemSelected(item);

        }

        DrawerLayout drawerLayout;

@Override

protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setToolbar();

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        }
