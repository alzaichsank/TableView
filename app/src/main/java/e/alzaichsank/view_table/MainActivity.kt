package e.alzaichsank.view_table

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        view_only.setOnClickListener {
            val i = Intent(this@MainActivity, ShowTableActivity::class.java)
            startActivity(i)
            finish()
        }
        view_list.setOnClickListener {  }
    }
}
