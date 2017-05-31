package com.echo.kotlindemo

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.custom_view.view.*

/**
 * Created by echo on 5/31/17.
 */

class CustomComponent @JvmOverloads constructor(context: Context,
                                                attrs: AttributeSet? = null,
                                                defStyle: Int = 0,
                                                defStyleRes: Int = 0) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    init {
        LayoutInflater.from(context)
                .inflate(R.layout.custom_view, this, true)

        orientation = VERTICAL

        attrs.let {
            val typedArray = context.obtainStyledAttributes(it,
                    R.styleable.custom_component_attributes, 0, 0)
            val title = resources.getText(typedArray
                    .getResourceId(R.styleable
                            .custom_component_attributes_custom_component_title,
                            R.string.app_name))

            my_title.text = title
            my_edit.hint =
                    "${123} $title"

            typedArray.recycle()
        }
    }

}