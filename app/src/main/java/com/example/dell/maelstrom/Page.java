package com.example.dell.maelstrom;

import android.support.annotation.Nullable;
import android.widget.Button;


/**
 * Created by Vivian on 12/19/2017.
 */

public class Page {
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private Choice mChoice3;
    private Choice mChoice4;
    private Choice mChoice5;
      int mBrainBoxStatValue;
      int mAutonomyStatValue;
      int mAcceptanceStatValue;
      int mDisruptionStatValue;
      int mLightningStatValue;
      int mHealthStatValue;
    private boolean mIsFinal = false;


    public Page(String text, Choice choice1, Choice choice2, Choice choice3, Choice choice4, Choice choice5) {
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
        mChoice3 = choice3;
        mChoice4 = choice4;
        mChoice5 = choice5;


    }


    public Page(String text) {
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mChoice3 = null;
        mChoice4 = null;
        mChoice5 = null;
        mIsFinal = true;

    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {

        mText = text;

    }


    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public Choice getChoice3() {
        return mChoice3;
    }

    public void setChoice3(Choice choice3) {
        mChoice3 = choice3;
    }

    public Choice getChoice4() {
        return mChoice4;
    }

    public void setChoice4(Choice choice4) {
        mChoice4 = choice4;
    }

    public Choice getChoice5() {
        return mChoice5;
    }

    public void setChoice5(Choice choice5) {
        mChoice5 = choice5;
    }
}




