package com.ryandro.webviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WebViewActivity extends AppCompatActivity {
    private static String my_URL = "";
    private Button btn_loadData;
    private WebView webView;
    private EditText et_url;
    private TextView tv_noData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        btn_loadData = findViewById(R.id.btn_loadData);
        webView = findViewById(R.id.webView_data);
        et_url = findViewById(R.id.et_url);
        tv_noData = findViewById(R.id.tv_noData);



        btn_loadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_URL = et_url.getText().toString();
                if (!my_URL.equalsIgnoreCase("")) {
                    webView.loadUrl(my_URL);
                    webView.setVisibility(View.VISIBLE);
                    tv_noData.setVisibility(View.GONE);
                } else {
                    webView.setVisibility(View.GONE);
                    tv_noData.setVisibility(View.VISIBLE);

                }
            }
        });


    }
}
