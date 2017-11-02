package com.app.ptt.circleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by PTT on 10/30/2017.
 */

public class CircleView extends View {
    Paint red_paint_fill,
            blue_paint_fill,
            green_paint_fill;

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
        red_paint_fill.setColor(Color.RED);

        blue_paint_fill = new Paint();
        blue_paint_fill.setStyle(Paint.Style.FILL);
        blue_paint_fill.setColor(Color.BLUE);

        green_paint_fill = new Paint();
        green_paint_fill.setStyle(Paint.Style.FILL);
        green_paint_fill.setColor(Color.GRAY);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Arc
//        canvas.dr
    }
}
