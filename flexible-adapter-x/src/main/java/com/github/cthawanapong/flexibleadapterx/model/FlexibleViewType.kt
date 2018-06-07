package com.github.cthawanapong.flexibleadapterx.model

import com.github.cthawanapong.flexibleadapterx.model.interfaces.IFlexibleViewType

/**
 * Created by CThawanapong on 30/1/2018 AD.
 * Email: c.thawanapong@gmail.com
 */
data class FlexibleViewType(
        @Transient override var viewTypeId: Int = -1
) : IFlexibleViewType {
    override fun areItemsTheSame(item: IFlexibleViewType): Boolean {
        return item.viewTypeId == viewTypeId
    }
}