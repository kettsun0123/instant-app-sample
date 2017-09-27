package xyz.kettsun.androidinstantsample.launcher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener { showSecond() }
    }

    fun showSecond() {
        val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://kettsun.xyz/second"))
        intent.`package` = packageName
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        startActivity(intent)
    }
}
