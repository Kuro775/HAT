package com.example.trashclassification.pages

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.trashclassification.R
import java.time.LocalDate

data class Activity(
    var itemName: String,
    var date: LocalDate,
    var score: Int,
    var imageRes: Int
)

@RequiresApi(Build.VERSION_CODES.O)
fun getAllActivities() : List<Activity> {
    return listOf<Activity>(
        Activity("Banana", LocalDate.of(2024,7,25), 20, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,24), 30, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,23), 40, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,22), 15, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,20), 20, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,19), 30, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,25), 40, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,25), 15, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,25), 20, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,25), 30, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,25), 40, R.drawable.welcome_img),
        Activity("Banana", LocalDate.of(2024,7,25), 15, R.drawable.welcome_img),
    )
}
