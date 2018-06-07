package com.github.cthawanapong.flexibleadapterx.adapter.viewholder

import android.content.Context
import android.view.View
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.github.cthawanapong.flexibleadapterx.R
import kotlinx.android.synthetic.main.list_item_error.view.*

/**
 * Created by CThawanapong on 30/1/2018 AD.
 * Email: c.thawanapong@gmail.com
 */
class FlexibleErrorViewHolder(itemView: View, private val onRetryClickListener: View.OnClickListener) : RecyclerView.ViewHolder(itemView) {
    companion object {
        @JvmStatic
        private val TAG = FlexibleErrorViewHolder::class.java.simpleName
    }

    fun bindViewHolder(context: Context, @DrawableRes errorRes: Int = R.drawable.ic_error) {
        itemView.apply {
            imageViewItem.setImageResource(errorRes)
            buttonRetry.setOnClickListener(onRetryClickListener)
        }
    }
}