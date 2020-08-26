package com.cn.watchdemo

import android.graphics.Color
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import androidx.recyclerview.widget.PagerSnapHelper
import com.cn.watchdemo.indicator.IndicatorItemDecoration
import com.cn.watchdemo.indicator.shape.CircleIndicator

import kotlinx.android.synthetic.main.activity_main.*

/**
 *    @Author : chenjianbo
 *    @Date   : 2020/8/26
 *    @Desc   :
 */
class MainActivity : WearableActivity() {
    private var mData = arrayListOf<String>()
    private var pageAdapter: PageAdapter? = null

    init {
        mData.run {
            for (index in 0..2) {
                add(index.toString())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPage()
        // Enables Always-on
        setAmbientEnabled()
    }

    private fun initPage() {
        recyclerView.addItemDecoration(IndicatorItemDecoration().apply {
            indicatorShape = CircleIndicator().apply {
                colorActive = Color.WHITE
                colorInactive = getColor(R.color.indicator_color)

            }
        })
        PagerSnapHelper().attachToRecyclerView(recyclerView)
        pageAdapter = PageAdapter(mData)
        recyclerView.adapter = pageAdapter
        recyclerView.setHasFixedSize(true)
        recyclerView.setItemViewCacheSize(3)


    }
}
