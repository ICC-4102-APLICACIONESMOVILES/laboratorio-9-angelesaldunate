package com.example.angeles.webview;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Angeles on 6/5/2018.
 */

public class WebAppInterface {
    Context mContext;

    WebAppInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void finishActivity() {
        Activity th = (Activity) mContext;
        th.finish();
    }
}
