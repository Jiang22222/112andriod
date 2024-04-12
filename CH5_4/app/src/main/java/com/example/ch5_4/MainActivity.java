package com.example.ch5_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK){
            EditText txtInput = (EditText) findViewById(R.id.txtInput);
            txtInput.setText("按下back案件" + keyCode);
            return true;
        }
        return  super.onKeyDown(keyCode,event);
    }
    @Override
    public boolean onKeyUp(int keyCode,KeyEvent event){

            TextView output = (TextView) findViewById(R.id.lblOutput);
            Output.setText("按下案件馬:"+keyCode);
            return  super.onKeyUp(keyCode,event);
        }

}