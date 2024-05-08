package com.example.a7minutesworkout.application

import android.app.Application
import com.example.a7minutesworkout.database.HistoryDataBase

class WorkOutApp: Application() {
    val db by lazy {
        HistoryDataBase.getInstance(this)
    }
}