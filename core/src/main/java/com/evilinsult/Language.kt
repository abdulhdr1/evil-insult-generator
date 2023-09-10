package com.evilinsult

import androidx.annotation.StringRes
import com.evilinsult.R

enum class Language(@StringRes val languageId: Int, val languageCode: String) {
    ENGLISH(R.string.english, "en"),
    SPANISH(R.string.spanish, "es"),
    CHINESE(R.string.chinese, "cn"),
    HINDI(R.string.hindi, "ik"),
    ARABIC(R.string.arabic, "ar"),
    PORTUGUESE(R.string.portuguese, "pt"),
    BENGALI(R.string.bengali, "bn"),
    RUSSIAN(R.string.russian, "ru"),
    JAPANESE(R.string.japanese, "ja"),
    JAVANESE(R.string.javanese, "jv"),
    SWAHILI(R.string.swahili, "sw"),
    GERMAN(R.string.german, "de"),
    KOREAN(R.string.korean, "ko"),
    FRENCH(R.string.french, "fr"),
    TELUGU(R.string.telugu, "te"),
    MARATHI(R.string.marathi, "mr"),
    TURKISH(R.string.turkish, "tr"),
    TAMIL(R.string.tamil, "ta"),
    VIETNAMESE(R.string.vietnamese, "vi"),
    URDU(R.string.urdu, "ur"),
    GREEK(R.string.greek, "el"),
    ITALIAN(R.string.italian, "it"),
    CZECH(R.string.czech, "cs"),
    FINNISH(R.string.finnish, "fi"),
    AFRIKAANS(R.string.afrikaans, "af"),
    BULGARIAN(R.string.bulgarian, "bg"),
    CATALAN(R.string.catalan, "ca"),
    DANISH(R.string.danish, "da"),
    DUTCH(R.string.dutch, "nl"),
    HEBREW(R.string.hebrew, "he"),
    HUNGARIAN(R.string.hungarian, "hu"),
    INDONESIAN(R.string.indonesian, "id"),
    KANNADA(R.string.kannada, "kn"),
    NORWEGIAN(R.string.norwegian, "no"),
    PERSIAN(R.string.persian, "fa"),
    POLISH(R.string.polish, "pl"),
    PUNJABI(R.string.punjabi, "pa"),
    ROMANIAN(R.string.romanian, "ro"),
    SERBIAN(R.string.serbian, "sr"),
    SINHALA(R.string.sinhala, "si"),
    SWEDISH(R.string.swedish, "sv"),
    THAI(R.string.thai, "th"),
    UKRAINIAN(R.string.ukrainian, "uk"),
    LATIN(R.string.latin, "la"),
}