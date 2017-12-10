package me.felixzhang.example.mvpdemo.ui.activity;

import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by felix on 15/6/17.
 */
public class BaseActivity extends ActionBarActivity {
    protected <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }
}
