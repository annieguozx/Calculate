package com.edu.niit.calculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText passWord;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText)findViewById(R.id.name);
        passWord = (EditText)findViewById(R.id.psd);

        Button login = (Button)findViewById(R.id.login);
        Button reset = (Button)findViewById(R.id.reset);

        //监听登录按钮
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                //通过intent传递登录信息到ResultActivity的界面中显示
                intent.putExtra("userName", userName.getText().toString());
                intent.putExtra("passWord", passWord.getText().toString());
                //启动ResultActivity显示登录结果
                startActivity(intent);
            }
        });
        //监听重置按钮
        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                resetInput();
            }
        });
    }
    public void resetInput()
    {
        userName.setText("");
        passWord.setText("");
    }
}
