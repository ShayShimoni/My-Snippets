package com.codere.hookaps.main.extensions

import java.text.DecimalFormat

/**
 * Round the value according to the format pattern.
 * @param pattern Format pattern (default is 0.00).
 * */
fun Double.round(pattern: String? = null): Double {
    return DecimalFormat(pattern ?: "0.00").format(this).toDouble()
}