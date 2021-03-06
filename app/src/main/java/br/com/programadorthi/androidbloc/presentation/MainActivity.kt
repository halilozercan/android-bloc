package br.com.programadorthi.androidbloc.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.programadorthi.androidbloc.R
import br.com.programadorthi.counter.presentation.CounterActivity
import br.com.programadorthi.infinitelist.presentation.PostListActivity
import br.com.programadorthi.login.presentation.SplashActivity
import br.com.programadorthi.timer.presentation.TimerActivity
import br.com.programadorthi.weather.presentation.WeatherActivity
import kotlinx.android.synthetic.main.activity_main.startCounterActivity
import kotlinx.android.synthetic.main.activity_main.startLoginActivity
import kotlinx.android.synthetic.main.activity_main.startPostListActivity
import kotlinx.android.synthetic.main.activity_main.startTimerActivity
import kotlinx.android.synthetic.main.activity_main.startWeatherActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startCounterActivity.setOnClickListener {
            startActivity(activity = CounterActivity::class.java)
        }

        startLoginActivity.setOnClickListener {
            startActivity(activity = SplashActivity::class.java)
        }

        startPostListActivity.setOnClickListener {
            startActivity(activity = PostListActivity::class.java)
        }

        startTimerActivity.setOnClickListener {
            startActivity(activity = TimerActivity::class.java)
        }

        startWeatherActivity.setOnClickListener {
            startActivity(activity = WeatherActivity::class.java)
        }
    }

    private fun startActivity(activity: Class<*>) {
        val intent = Intent(this, activity)
        startActivity(intent)
    }

}
