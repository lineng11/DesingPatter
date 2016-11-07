package com.neng.app.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.neng.app.R;

public abstract class BaseActivity extends AppCompatActivity {

    protected View mContentView;
    protected final String TITLE_KEY = "title_key";
    protected String title;
    protected TextView textView;
    private String textStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getContentView() == 0) {
            setViewIndate(R.layout.activity_base);
            textView = (TextView) findViewById(R.id.textcontext);
        } else
            setViewIndate(getContentView());

        if (getIntent() != null && getIntent().getExtras() != null) {
            title = getIntent().getExtras().getString(TITLE_KEY, getString(R.string.app_name));
            setTitle(title);
        }
        initCreate();

    }

    private void setViewIndate(int resource) {
        mContentView = LinearLayout.inflate(this, resource, null);
        setContentView(mContentView);
    }

    /**
     * 初始化 layout
     *
     * @return 0时候用Base 默认layout
     */
    protected abstract int getContentView();

    public void onClickButton(View view) {
        if (textView != null && !TextUtils.isEmpty(getTextStr()))
            textView.setText(getTextStr());
    }


    protected abstract void initCreate();

    protected void log(int log) {
        log(String.valueOf(log));
    }

    protected void log(String log) {
        Log.e(getClass().getSimpleName(), log);
    }

    protected void toastShow(int num) {
        toastShow(String.valueOf(num));
    }

    protected void toastShow(CharSequence text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public String getTextStr() {
        return textStr;
    }

    public void setTextStr(String textStr) {
        this.textStr = textStr;
    }
}
