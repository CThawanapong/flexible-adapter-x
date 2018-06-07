package com.github.cthawanapong.flexibleadapterx.sample.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.cthawanapong.flexibleadapterx.adapter.FlexibleAdapter

/**
 * Created by CThawanapong on 30/1/2018 AD.
 * Email: c.thawanapong@gmail.com
 */
class ShowcaseAdapter(context: Context) : FlexibleAdapter(context) {
    companion object {
        @JvmStatic
        private val TAG = ShowcaseAdapter::class.java.simpleName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return super.onCreateViewHolder(parent, viewType)
    }

    fun bindAdapter() {
        bind(listOf(VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM
                , VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM, VIEW_TYPE_LOADING_ITEM))
    }
}