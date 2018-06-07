package com.github.cthawanapong.flexibleadapterx.model

import com.github.cthawanapong.flexibleadapterx.model.interfaces.IFlexibleFragmentType

data class FlexibleFragmentType(
        override var fragmentTypeId: Long = -1,
        override val fragmentTitle: String = ""
) : IFlexibleFragmentType