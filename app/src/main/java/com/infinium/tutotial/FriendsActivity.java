package com.infinium.tutotial;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.BottomNavigation);

        Menu menu= bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intentFriends = new Intent(FriendsActivity.this, MainActivity.class);
                        startActivity(intentFriends);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.ic_map:
                        Intent intentMaps = new Intent(FriendsActivity.this, MapsActivity.class);
                        startActivity(intentMaps);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.ic_friends:
                        break;
                }

                return false;
            }
        });
    }
}
