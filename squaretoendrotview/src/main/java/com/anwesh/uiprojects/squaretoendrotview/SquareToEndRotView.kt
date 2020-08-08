package com.anwesh.uiprojects.squaretoendrotview

/**
 * Created by anweshmishra on 09/08/20.
 */

import android.view.View
import android.view.MotionEvent
import android.content.Context
import android.app.Activity
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF

val colors : Array<String> = arrayOf("#4CAF50", "#F44336", "#3F51B5", "#FFEB3B", "#2196F3")
val parts : Int = 4
val scGap : Float = 0.02f / parts
val sizeFactor : Float = 5.1f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val rot : Float = 90f
