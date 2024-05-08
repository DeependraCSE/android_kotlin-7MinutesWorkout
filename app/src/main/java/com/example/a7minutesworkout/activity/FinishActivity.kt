package com.example.a7minutesworkout.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.a7minutesworkout.database.HistoryDao
import com.example.a7minutesworkout.database.HistoryEntity
import com.example.a7minutesworkout.application.WorkOutApp
import com.example.a7minutesworkout.databinding.ActivityFinishBinding
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class FinishActivity : AppCompatActivity() {
    private var binding : ActivityFinishBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarFinishActivity)
        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarFinishActivity?.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding?.btnFinish?.setOnClickListener {
            finish()
        }

        val historyDao = (application as WorkOutApp).db.historyDao()
        addDateToDatabase(historyDao)
    }
    private fun addDateToDatabase(historyDao: HistoryDao){
        val c = Calendar.getInstance()
        val dateTime = c.time
        val sdf = SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault())
        val date = sdf.format(dateTime)

        lifecycleScope.launch {
            historyDao.insert(HistoryEntity(date))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}