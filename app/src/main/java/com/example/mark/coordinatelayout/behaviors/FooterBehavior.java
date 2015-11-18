package com.example.mark.coordinatelayout.behaviors;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.example.mark.coordinatelayout.widgets.FooterLayout;

/**
 * Created by mark on 11/18/15.
 */
public class FooterBehavior extends CoordinatorLayout.Behavior<FooterLayout>{
    private int mDependencyOffset;
    private int mChildInitialOffset;
    private Context mContext;

    public FooterBehavior(){
        //requeride default constructor
    }

    public FooterBehavior(Context context, AttributeSet attrs){
        super(context, attrs);
        mContext = context;
    }


    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, FooterLayout child, View dependency) {
        return  dependency instanceof FooterLayout;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, FooterLayout child, View dependency) {

//        if (mDependencyOffset != dependency.getTop()) {
//            mDependencyOffset = dependency.getTop();
//
//            child.offsetTopAndBottom(
//                    mChildInitialOffset - child.getTop() - mDependencyOffset);
//            //Notify that we changed our attached child
//            return true;
//        }
        Toast.makeText(mContext, "Eh nois", Toast.LENGTH_SHORT).show();

        return false;
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, FooterLayout child, int layoutDirection) {

        mChildInitialOffset = child.getTop();

        return false;
    }
}
