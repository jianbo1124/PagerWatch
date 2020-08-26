package com.cn.watchdemo

import com.chad.library.adapter.base.BaseDelegateMultiAdapter
import com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate
import com.chad.library.adapter.base.viewholder.BaseViewHolder


/**
 *    @Author : chenjianbo
 *    @Date   : 2020/7/16
 *    @Desc   :
 */
class PageAdapter : BaseDelegateMultiAdapter<String, BaseViewHolder> {

    constructor(data: MutableList<String>?) : super(data) {
        setMultiTypeDelegate(PageMultiTypeDelegate())
    }

    override fun convert(holder: BaseViewHolder, item: String) {

        when (holder.itemViewType) {

            0 -> {

            }
            1 -> {

            }
            2 -> {

            }
        }
    }


    class PageMultiTypeDelegate : BaseMultiTypeDelegate<String>() {

        override fun getItemType(data: List<String>, position: Int): Int {

            return position
        }

        init {
            addItemType(0, R.layout.item_page_left)
            addItemType(1, R.layout.item_page_center)
            addItemType(2, R.layout.item_page_right)
        }
    }

}