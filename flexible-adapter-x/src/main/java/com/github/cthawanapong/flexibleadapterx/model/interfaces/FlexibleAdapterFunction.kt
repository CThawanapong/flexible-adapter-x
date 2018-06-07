package com.github.cthawanapong.flexibleadapterx.model.interfaces

/**
 * Created by CThawanapong on 30/1/2018 AD.
 * Email: c.thawanapong@gmail.com
 */
interface FlexibleAdapterFunction {
    fun resetAdapter()

    fun showLoading()

    fun showError()

    fun showEmpty()

    val isContentEmpty: Boolean

    val isError: Boolean

    fun getItem(position: Int): IFlexibleViewType

    fun bind(newItemList: List<IFlexibleViewType>)
}