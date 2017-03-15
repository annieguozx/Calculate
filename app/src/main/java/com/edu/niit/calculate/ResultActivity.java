package com.edu.niit.calculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    public static final String NAME = "android";
    public static final String PWD = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView result=(TextView)findViewById(R.id.result);
        //通过得到intent获取登录界面传来的信息  
        Intent intent=getIntent();
        String name=intent.getStringExtra("userName");
        String pwd=intent.getStringExtra("passWord");
        //将登录信息在页面中显示  
        if (NAME.equals(name) && PWD.equals(pwd)) {
            result.setText("登录成功");
        } else {
            result.setText("登录失败");
        }
    }
}
