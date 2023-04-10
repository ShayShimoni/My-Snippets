package com.codere.hookaps.main.extensions

import android.annotation.SuppressLint
import com.codere.hookaps.main.extensions.enums.TimeFormatType
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

/**
 * Parse to Date object with the given format type.
 * @param timeFormatType The format type of this string
 * */
@SuppressLint("SimpleDateFormat")
fun String.toDate(timeFormatType: TimeFormatType): Date {
    return runCatching { SimpleDateFormat(timeFormatType.value).parse(this) }
        .onFailure {
            Timber.d(it)
            it.printStackTrace()
        }
        .getOrDefault(Date())
}