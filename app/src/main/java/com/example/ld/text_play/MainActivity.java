package com.example.ld.text_play;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
    private Button mybutton1;
    private Button mybutton2;
    private EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
        mybutton1 = (Button) findViewById(R.id.button0);
        mybutton2 = (Button) findViewById(R.id.button1);
        edt1 = (EditText) findViewById(R.id.edit1);
        edt2 = (EditText) findViewById(R.id.edit2);
        mybutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).setTitle("提示").create();
                if (view.getId() == R.id.button0) {
                    mybutton1.setText("登陆");
                    dialog.setMessage("欢迎");
                    dialog.show();
                }

            }
        });
        mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).setTitle("提示").create();
                if (view.getId() == R.id.button1) {
                    mybutton2.setText("注册");
                    dialog.setMessage("请注册");
                    dialog.show();
                }

            }
        });
    }
}
