package com.example.cloudapp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.cloudapp.R;
import com.example.cloudapp.adapter.ViewPagerAdapter;
import com.example.cloudapp.ui.fragment.FindFragment;
import com.example.cloudapp.ui.fragment.HomeFragment;
import com.example.cloudapp.ui.fragment.LiveFragment;
import com.example.cloudapp.ui.fragment.MeFragment;
import com.example.cloudapp.ui.fragment.TaskFragment;
import com.example.cloudapp.widget.BottomNavigationViewHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private String[] bottomStr ={"首页","直播","任务","发现","我的"};
    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_video:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_assignment:
                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.navigation_find:
                    viewPager.setCurrentItem(3);
                    return true;
                case R.id.navigation_my:
                    viewPager.setCurrentItem(4);
                    return true;
            }
            return false;
        }

    };
    private ViewPager viewPager;
    private BottomNavigationView navigation;
    private MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        viewPager =(ViewPager)findViewById(R.id.viewPager);
        HomeFragment homeFragment = new HomeFragment();
        LiveFragment liveFragment = new LiveFragment();
        FindFragment findFragment = new FindFragment();
        TaskFragment taskFragment = new TaskFragment();
        MeFragment meFragment = new MeFragment();
        fragmentList.add(homeFragment);
        fragmentList.add(liveFragment);
        fragmentList.add(findFragment);
        fragmentList.add(taskFragment);
        fragmentList.add(meFragment);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    navigation.getMenu().getItem(0).setChecked(false);
                }
                menuItem = navigation.getMenu().getItem(position);
                menuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
