package com.lesson2.bukreevei.lesson2.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.lesson2.bukreevei.lesson2.R;

public class PersonInfoView extends LinearLayout {

    public PersonInfoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.person_info_view, this);
        setOrientation(VERTICAL);
        ButterKnife.bind();
    }
}
