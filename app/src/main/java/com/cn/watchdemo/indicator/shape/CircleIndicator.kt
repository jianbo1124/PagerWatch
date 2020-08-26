package com.cn.watchdemo.indicator.shape

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

/**
 *    @Author : chenjianbo
 *    @Date   : 2020/7/16
 *    @Desc   :
 */
class CircleIndicator : IndicatorShape {
    private val paint = Paint().apply { isAntiAlias = true }
    override val drawStartPosition: Float
        get() = radius
    var colorActive: Int = Color.CYAN
    var colorInactive: Int = Color.GRAY
    var radius: Float = 5F

    override var scaleFactor: Float = 1.2f

    override fun getIndicatorWidth() = radius * 2
    override fun getIndicatorHeight() = radius * 2
    override fun inactiveIndicatorDraw(c: Canvas, x: Float, y: Float) {
        paint.color = colorInactive
        c.drawCircle(x, y, radius, paint)
    }

    override fun activeIndicatorDraw(c: Canvas, x: Float, y: Float) {
        paint.color = colorActive
        c.drawCircle(x, y, radius * scaleFactor, paint)
    }
}