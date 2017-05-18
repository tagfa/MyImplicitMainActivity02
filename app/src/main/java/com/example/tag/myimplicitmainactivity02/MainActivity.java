package com.example.tag.myimplicitmainactivity02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        EditText editText = (EditText)findViewById(R.id.editText);
        final String text = editText.getText().toString();

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //文字列からUri型の変数を作成
                Uri uri = Uri.parse(text);

                //URIを使って何かを表示させたい場合、Intent.ACTION_VIEWを使う
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);

                startActivity(intent);
            }
        });
    }
}
