package com.infinium.tutotial;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.facebook.FacebookSdk;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_plus);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.containter);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_check_box_outline_blank_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_star_border_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_chat_bubble_outline_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_person_outline_black_24dp);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.BottomNavigation);

        Menu menu= bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.ic_home:

                        break;
                    case R.id.ic_map:
                        Intent intentMaps = new Intent(MainActivity.this, MapsActivity.class);
                        startActivity(intentMaps);
                        overridePendingTransition(0, 0);
                        break;
                    case R.id.ic_friends:
                        Intent intentFriends = new Intent(MainActivity.this, FriendsActivity.class);
                        startActivity(intentFriends);
                        overridePendingTransition(0, 0);
                        break;
                }

                return false;
            }
        });

//        Fragment1.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
//            public void onSwipeTop() {
//                Toast.makeText(MainActivity.this, "top", Toast.LENGTH_SHORT).show();
//            }
//            public void onSwipeRight() {
//                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
//            }
//            public void onSwipeLeft() {
//                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
//            }
//            public void onSwipeBottom() {
//                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
//            }
//
//        });

//        fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, NewMessageActivity.class);
//                startActivity(intent);
//            }
//        });
    }


//        public void create(View view) {
//            //Intent intent = new Intent(MainActivity.this, Create Event.class);
//            startActivity(intent);
//        }


    private void setupViewPager(ViewPager mViewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        //adapter.addFragment(new CamFragment());
        adapter.addFragment(new Fragment1());
        adapter.addFragment(new Fragment2());
        adapter.addFragment(new Fragment3());
        adapter.addFragment(new Fragment4());
        mViewPager.setAdapter(adapter);
    }
//    public void Camera(){
//        Intent intentFriends = new Intent(this, CamFragment.class);
//        startActivity(intentFriends);
//    }



}
