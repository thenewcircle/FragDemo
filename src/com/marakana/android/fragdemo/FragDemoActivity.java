
package com.marakana.android.fragdemo;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

import com.marakana.android.fragdemo.ZodiacListFragment.OnZodiacSelectedListener;

public class FragDemoActivity extends Activity implements OnZodiacSelectedListener {
    static final String TAG = "FragDemoActivity";
    ZodiacDetailFragment detailFragment;

    /*
     * Activity lifecycle methods
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.main);
        
        FragmentManager fragmentManager = getFragmentManager();
        detailFragment = (ZodiacDetailFragment) fragmentManager.findFragmentById(R.id.detail);
        
//        detailFragment = new ZodiacDetailFragment();
        
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.add(R.id.main_layout, detailFragment);
//        transaction.addToBackStack("initial");
//        transaction.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }


    /*
     * Listeners
     */

    public void onZodiacSelected(int index) {
        Log.d(TAG, "onZodiacSelected");
        detailFragment.showZodiacDetail(index);
        
        
    }
}
