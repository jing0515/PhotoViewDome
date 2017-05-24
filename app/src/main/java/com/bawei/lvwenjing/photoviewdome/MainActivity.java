package com.bawei.lvwenjing.photoviewdome;

import android.app.Activity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //photoview 使用与imagerview一样 就当是imagerview使用
        //同样可以放在imagetlout中与gilde中加载网络上的图片
        //使用步棸：倒jar包 加仓库 将photoview 加入布局中
        setContentView(R.layout.activity_main);
        PhotoView photoView = (PhotoView) findViewById(R.id.photoview);
        photoView.setImageResource(R.mipmap.ic_launcher);
    }
}
