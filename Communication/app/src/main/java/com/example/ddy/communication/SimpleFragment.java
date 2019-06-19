package com.example.ddy.communication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
public class SimpleFragment extends Fragment implements ,View.OnClickListener {
    private static final String KEY_TITLE = "title";
        private String mTitle;
        private TextView mTv_msgFromActivity;
        private Button mBtn_sendToActivity;
        private ToFragmentListener toFragmentListener;
        private int tapCouts = 0;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater,
                @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
            return initView();
        }

        private View initView() {
        LinearLayout rootView = (LinearLayout) LayoutInflater.from(this.getContext()).inflate(R.layout.fragment_main, null);
        mTv_msgFromActivity = (TextView) rootView.findViewById(R.id.tv_fragment_msg);
        mTv_msgFromActivity.setText(mTitle);
        mBtn_sendToActivity = (Button) rootView.findViewById(R.id.btn_in_fragment);
        mBtn_sendToActivity.setOnClickListener(this);
        return rootView;
    }

    public void setToFragmentListener(ToFragmentListener listener){
        this.toFragmentListener = listener;
    }

    public void onTypeClick(String message) {
        mTv_msgFromActivity.setText(message);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_in_fragment:
                if (null != toActivityListener){
                    tapCouts++;
                    toActivityListener.toActivityClick("来自Fragment的数据"+tapCouts);
                }
                break;
        }
    }

    public static SimpleFragment newInstance (String title) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TITLE, title);
        SimpleFragment fragment = new SimpleFragment();
        fragment.setArguments(bundle);
        return fragment;
    }
}

