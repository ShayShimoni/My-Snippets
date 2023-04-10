package com.codere.hookaps.main.extensions.enums

enum class TimeFormatType(val value: String){
    FORMAT_DEFAULT_DISPLAY_DATE("E, MMM d'th'"),
    FORMAT_ISO1806("yyyy-MM-dd'T'HH:mm:ss.sss'Z'"),
    FORMAT_AM_PM("hh:mm a"),
    FORMAT_SIMPLE_DATE("dd.MM.yyyy"),
    FORMAT_MONTH_NAME("MMMM")
}