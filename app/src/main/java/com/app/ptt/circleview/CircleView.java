package com.app.ptt.circleview;

import android.content.Context;
import android.graphics.Canvas;
<<<<<<< HEAD
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
=======
import android.graphics.Color;
import android.graphics.Paint;
>>>>>>> e53e036688e2437d55774454f54e63ea35d1ce91
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by PTT on 10/30/2017.
 */

public class CircleView extends View {
<<<<<<< HEAD
    Paint red_paint_fill;
=======
    Paint red_paint_fill,
            blue_paint_fill,
            green_paint_fill;
>>>>>>> e53e036688e2437d55774454f54e63ea35d1ce91

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        red_paint_fill = new Paint();
        red_paint_fill.setStyle(Paint.Style.FILL);
<<<<<<< HEAD
=======
        red_paint_fill.setColor(Color.RED);

        blue_paint_fill = new Paint();
        blue_paint_fill.setStyle(Paint.Style.FILL);
        blue_paint_fill.setColor(Color.BLUE);

        green_paint_fill = new Paint();
        green_paint_fill.setStyle(Paint.Style.FILL);
        green_paint_fill.setColor(Color.GRAY);
>>>>>>> e53e036688e2437d55774454f54e63ea35d1ce91
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
<<<<<<< HEAD
        Rect cirle_1=new Rect();
        cirle_1.set(100,100,150,160);
        canvas.drawRect);
=======
//        Arc
//        canvas.dr
>>>>>>> e53e036688e2437d55774454f54e63ea35d1ce91
    }
}
