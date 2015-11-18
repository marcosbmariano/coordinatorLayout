package com.example.mark.coordinatelayout.widgets;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.example.mark.coordinatelayout.behaviors.FooterBehavior;

/**
 * Created by mark on 11/18/15.
 */

@CoordinatorLayout.DefaultBehavior(FooterBehavior.class)
public class FooterLayout extends RelativeLayout {
    public FooterLayout(Context context) {
        super(context);
    }

    public FooterLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FooterLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
