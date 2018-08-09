package e.alzaichsank.view_table

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ShowTableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_table)
    }

    override fun onBackPressed() {
        val i = Intent(this@ShowTableActivity, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}
