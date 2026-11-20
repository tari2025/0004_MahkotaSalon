package com.example.mahkotasalon.UiSalon.screen.Riwayat

package com.example.mahkotasalon.data.local

import android.content.Context
import android.content.SharedPreferences

class TokenManager(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("mahkota_prefs", Context.MODE_PRIVATE)

    fun saveToken(token: String) {
        sharedPreferences.edit().putString("TOKEN", token).apply()
    }

    fun getToken(): String? {
        return sharedPreferences.getString("TOKEN", null)
    }

    fun clearToken() {
        sharedPreferences.edit().clear().apply()
    }
}