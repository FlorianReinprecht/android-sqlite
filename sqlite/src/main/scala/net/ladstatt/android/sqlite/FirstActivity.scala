package net.ladstatt.android.sqlite

import android.app.Activity
import android.os.Bundle

class FirstActivity extends Activity {

  override protected def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }

}
