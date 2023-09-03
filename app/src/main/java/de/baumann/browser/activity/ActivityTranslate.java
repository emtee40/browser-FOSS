package de.baumann.browser.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ActivityTranslate extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        Intent browserIntent = new Intent(this, BrowserActivity.class);
        browserIntent.putExtra(Intent.EXTRA_TEXT, sharedText);
        browserIntent.setAction("translate");
        startActivity(browserIntent);
        finish();
    }
}