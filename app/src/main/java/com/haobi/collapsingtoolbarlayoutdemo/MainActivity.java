package com.haobi.collapsingtoolbarlayoutdemo;

import android.provider.ContactsContract;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private ImageView mImageView;
    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        //设置Toolbar
        setSupportActionBar(mToolbar);
        mImageView = (ImageView)findViewById(R.id.image_view);
        //设置天气图片
        mImageView.setImageResource(R.drawable.qinglang);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
        //设置标题
        mCollapsingToolbarLayout.setTitle("天气");
        mTextView = (TextView)findViewById(R.id.content_text);
        //设置文本
        String content = generateContent("晴朗");
        mTextView.setText(content);
    }

    //生成展示文本
    private String generateContent(String content){
        StringBuilder con = new StringBuilder();
        for(int i=0;i<500;i++){
            con.append(content);
        }
        return con.toString();
    }
}
