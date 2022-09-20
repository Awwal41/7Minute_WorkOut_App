package bgtap.babbangona.a7minuteworkoutapp

import android.app.Application
import bgtap.babbangona.a7minuteworkoutapp.database.HistoryDatabase

class WorkOutApp: Application() {

    val db:HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}
