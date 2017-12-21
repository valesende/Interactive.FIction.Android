package com.example.dell.maelstrom;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Button;

/**
 * Created by Vivian on 12/19/2017.
 */

public class Choice {
    private String mText;
    private int mNextPage;


   public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }


    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setmNextPage(int nextPage){
        mNextPage = nextPage;
    }






}