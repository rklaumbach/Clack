package com.example.clack.Services

import android.graphics.Color
import com.example.clack.Controller.App
import java.util.*

object UserDataService {

    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

    fun logout(){
        id = ""
        avatarColor = ""
        avatarName = ""
        email = ""
        name = ""
        App.prefs.authToken = ""
        App.prefs.userEmail = ""
        App.prefs.isLoggedIn = false
        MessageService.clearMessages()
        MessageService.clearChannels()

    }

    fun returnAvatarColor(components: String) : Int {
       // [0.996078431372549, 0.3333333333333333, 0.18823529411764706, 1]
        // 0.996078431372549 0.3333333333333333 0.18823529411764706 1

        val strippedColor = components
            .replace("[", "")
            .replace("[","")
            .replace(",", "")

        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColor)
        if(scanner.hasNext()){
            r = (scanner.nextDouble() * 256).toInt()
            g = (scanner.nextDouble() * 256).toInt()
            b = (scanner.nextDouble() * 256).toInt()
        }

        return Color.rgb(r, g, b)


    }

}