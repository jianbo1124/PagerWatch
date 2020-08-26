package  com.cn.watchdemo.indicator.shape

import android.graphics.Canvas
/**
 *    @Author : chenjianbo
 *    @Date   : 2020/7/16
 *    @Desc   :
 */
interface IndicatorShape {
    /**
     * Factor associated with the selected indicator scale value
     */
    var scaleFactor: Float

    /**
     * The starting coordinate that is actually drawn
     * For example, when drawing a square, draw a circle from the x coordinate to the width and a circle the radius of both sides of the x coordinate.
     */
    val drawStartPosition: Float
    /**
     * To draw inactive indicator
     */
    fun inactiveIndicatorDraw(c: Canvas, x: Float, y: Float)

    /**
     * To draw active indicator
     */
    fun activeIndicatorDraw(c: Canvas, x: Float, y: Float)

    /**
     * get indicator width
     */
    fun getIndicatorWidth(): Float

    /**
     * get indicator height
     */
    fun getIndicatorHeight(): Float
}