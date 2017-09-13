package com.example.jianhao.duihuakuang;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.KeyStore;

import static android.R.attr.button;
import static android.R.attr.id;
import static android.R.attr.publicKey;
import static android.R.attr.quickContactBadgeStyleSmallWindowLarge;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)this.findViewById(R.id.button1);
        Button button2 = (Button) this.findViewById(R.id.button2);
        final Button button3 = (Button) this.findViewById(R.id.button3);
        View v =View.inflate(MainActivity.this,R.layout.login,null);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View view=inflater.inflate(R.layout.login,null);
                builder.setView(view);
                builder.setTitle("Login");
                final Button button3 = (Button)view.findViewById(R.id.button3);
                final EditText UserID = (EditText)view.findViewById(R.id.editTextUserID);
                final EditText Password = (EditText)view.findViewById(R.id.editTextPW);

                button3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                        if (UserID.getText().toString().equals("abc") && Password.getText().toString().equals("123")) {

                            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_LONG).show();

                        } else {

                            Toast.makeText(MainActivity.this, "Faild", Toast.LENGTH_LONG).show();
                        }
                    }
                });


                builder.show();


            }


        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Faild")//显示的消息内容
                        .setTitle("Faild");//对话框标题
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Faild", Toast.LENGTH_LONG).show();
                    }
                });

                builder.show();
            }
        });

        }
    }