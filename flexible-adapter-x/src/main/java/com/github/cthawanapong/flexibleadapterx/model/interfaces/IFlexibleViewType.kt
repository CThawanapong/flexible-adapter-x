package com.github.cthawanapong.flexibleadapterx.model.interfaces

/**
 * Created by CThawanapong on 30/1/2018 AD.
 * Email: c.thawanapong@gmail.com
 */
interface IFlexibleViewType {
    var viewTypeId: Int
    fun areItemsTheSame(item: IFlexibleViewType): Boolean
    fun areContentsTheSame(item: IFlexibleViewType): Boolean {
        return this == item
    }
}