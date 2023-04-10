package com.codere.hookaps.main.extensions

import android.annotation.SuppressLint
import com.codere.hookaps.main.extensions.enums.TimeFormatType
import java.text.SimpleDateFormat
import java.util.*

/**
 * Format to String object with the given format type.
 * @param timeFormatType The desired output format type
 * */
@SuppressLint("SimpleDateFormat")
fun Date.dateToString(timeFormatType: TimeFormatType): String = SimpleDateFormat(timeFormatType.value).format(this)
