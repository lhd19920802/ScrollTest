package com.lhd.scrolltest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{

    private MyImageView miv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miv_main = (MyImageView) findViewById(R.id.miv_main);

    }

    public void scrollLeft(View v)
    {
//        miv_main.scrollBy(10,0);
        miv_main.scrollTo(miv_main.getScrollX()+10,miv_main.getScrollY());
    }

    public void scrollRight(View v)
    {

//        miv_main.scrollBy(-10,0);
        miv_main.scrollTo(miv_main.getScrollX() - 10, miv_main.getScrollY());
    }

    public void scrollUp(View v)
    {

//        miv_main.scrollBy(0,10);
        miv_main.scrollTo(miv_main.getScrollX(), miv_main.getScrollY() + 10);

    }

    public void scrollDown(View v)
    {

//        miv_main.scrollBy(0,-10);
        miv_main.scrollTo(miv_main.getScrollX(), miv_main.getScrollY() - 10);
    }

    /**
     * 瞬间复位
     * @param v
     */
    public void reset1(View v)
    {
//        miv_main.scrollBy(-miv_main.getScrollX(),-miv_main.getScrollY());
        miv_main.scrollTo(0, 0);
    }

    /**
     * 平滑复位
     * @param v
     */
    public void reset2(View v)
    {
        miv_main.smoothReset();
    }


}
