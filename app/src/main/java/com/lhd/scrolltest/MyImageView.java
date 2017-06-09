package com.lhd.scrolltest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.Scroller;

/**
 * Created by lihuaidong on 2017/6/9 16:34.
 * 微信：lhd520ssp
 * QQ:414320737
 * 作用：
 */
public class MyImageView extends ImageView
{
    private Scroller scroller;
    public MyImageView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        scroller = new Scroller(context);
    }

    public void smoothReset()
    {
        scroller.startScroll(getScrollX(), getScrollY(), -getScrollX(), -getScrollY());
        invalidate();
    }
    @Override
    public void computeScroll()
    {
        super.computeScroll();
        if(scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(),scroller.getCurrY());
            invalidate();
        }
    }


}
