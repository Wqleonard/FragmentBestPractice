package com.wangqian.fragmentbestpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by t1 on 2018/3/7.
 */

public class NewsContentFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }

    public void refresh(String newsTittle,String newsContent){
        View visibilityLayout =view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTittleText=view.findViewById(R.id.news_tittle);
        TextView newsContentText=view.findViewById(R.id.news_content);
        newsTittleText.setText(newsTittle);
        newsContentText.setText(newsContent);
    }
}
