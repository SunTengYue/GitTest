package com.example.ddy.communication;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    private SimpleFragment testFragment;
    private ToFragmentListener mFragmentListener;
    private Button mBtn_AToF;
    private int tapCounts = 0;
    private TextView mTv_fragmentMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView(){
        FragmentManager fm = getSupportFragmentManager();
        testFragment = (SimpleFragment) fm.findFragmentById(R.id.fragment2);
        mBtn_AToF = (Button)findViewById(R.id.btn_atof);
        mBtn_AToF.setOnClickListener(this);
        mTv_fragmentMsg = (TextView)findViewById(R.id.tv_from_fragment);
    }

    private void initData(){
        mFragmentListener = testFragment;
        testFragment.setToActivityListener(new ToActivityListener(){

            public void toActivityClick(String message){
                mTv_fragmentMsg.setText(message);
            }
        });
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_atof:
                if (null != mFragmentListener){
                    tapCounts ++;
                    mFragmentListener.onTypeClick("来自Activity的实时数据"+tapCounts);
                }
                break;
        }
    }
}
