package com.swarawan.fragmentexample;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragment(R.id.container_master, new FragmentMaster());
        addFragment(R.id.container_color, new FragmentColor());
    }

    private void addFragment(@IdRes int container, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().add(container, fragment).commit();
    }

    public void changeFragmentBackground(int color) {
        Bundle bundle = new Bundle();
        bundle.putInt(FragmentColor.paramKey, color);

        FragmentColor fragmentColor = new FragmentColor();
        fragmentColor.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_color, fragmentColor).commit();
    }
}
