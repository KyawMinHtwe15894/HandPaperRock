package com.example.linetest;

import android.content.Context;
import android.util.AttributeSet;

/**
 * A {@link Hand} which stands for a paper hand.
 */
public class PaperButton extends HandButton {

    public PaperButton(Context context) {
        super(context);
    }

    public PaperButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    String getHandText() {
        return Hand.PAPER.toString();
    }

    @Override
    Hand getHand() {
        return Hand.PAPER;
    }
}
