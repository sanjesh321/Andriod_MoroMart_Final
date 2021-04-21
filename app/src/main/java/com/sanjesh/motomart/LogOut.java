package com.sanjesh.motomart;

class LogOut(val activity: Activity, val context: Context) {
    fun logout()
    {
        var pref = activity.getSharedPreferences("credentials", Context.MODE_PRIVATE)
        var editor = pref.edit()
        editor.clear()
        editor.apply()
        val intent = Intent(context,LogInAct::class.java)
        context.startActivity(intent)
        activity.finish()
    }
}
