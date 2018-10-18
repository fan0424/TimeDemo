package com.example.fanfeng.timedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TimeSelectorView tsvTimeSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tsvTimeSelector = (TimeSelectorView) findViewById(R.id.tsvTimeSelector);

        tsvTimeSelector.setOnChangeTimeListener(new TimeSelectorView.OnChangeTimeListener() {
            @Override
            public void onChangeTime(boolean isSelect, List<Integer> seletedList) {
                Log.e("xxx", "当前是选中？：" + isSelect + "    集合中选中的有：" + seletedList.toString());
            }
        });

    }
}
