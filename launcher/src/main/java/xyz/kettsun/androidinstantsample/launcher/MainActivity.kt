package xyz.kettsun.androidinstantsample.launcher

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.google.android.instantapps.InstantApps


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener { if (InstantApps.isInstantApp(this))showSecond() }
    }

    fun showSecond() {
        val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://kettsun.xyz/second"))
        intent.`package` = packageName
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        startActivity(intent)
    }
}
