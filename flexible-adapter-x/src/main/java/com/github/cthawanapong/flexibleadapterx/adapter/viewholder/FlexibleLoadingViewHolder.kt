package com.github.cthawanapong.flexibleadapterx.adapter.viewholder

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build
import android.view.View
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.github.cthawanapong.flexibleadapterx.R

/**
 * Created by CThawanapong on 30/1/2018 AD.
 * Email: c.thawanapong@gmail.com
 */
class FlexibleLoadingViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
    companion object {
        @JvmStatic
        private val TAG = FlexibleLoadingViewHolder::class.java.simpleName

        @JvmStatic
        private val FALLBACK_COLOR = Color.parseColor("#FF000000")
    }

    init {
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        progressBar.indeterminateDrawable.setColorFilter(
                fetchColorAccentDark(context),
                PorterDuff.Mode.MULTIPLY)

        itemView.apply {
            when (layoutParams) {
                is StaggeredGridLayoutManager.LayoutParams -> {
                    (layoutParams as StaggeredGridLayoutManager.LayoutParams).isFullSpan = true
                }
            }
        }
    }

    @SuppressLint("ResourceType")
    private fun fetchColorAccentDark(context: Context): Int {
        val theme = context.theme
        val attr = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            android.R.attr.colorAccent
        } else {
            R.attr.flexibleLoadingIndicatorColor
        }

        val typedArray = theme.obtainStyledAttributes(intArrayOf(attr, R.attr.flexibleLoadingIndicatorColor))

        var colorAccent = typedArray.getColor(0, FALLBACK_COLOR)
        colorAccent = typedArray.getColor(1, colorAccent)
        typedArray.recycle()
        return colorAccent
    }
}