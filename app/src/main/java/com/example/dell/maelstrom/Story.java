package com.example.dell.maelstrom;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Vivian on 12/19/2017.
 */


public class Story {
    //define all stat variables used in the game. These will be shown on the Stats Activity
    private static  int mBrainBoxStatValue;
    private static int mAutonomyStatValue;
    private static  int mAcceptanceStatValue;
    private static  int mDisruptionStatValue;
    private static  int mLightningStatValue;
    private static  int mHealthStatValue;

    //define all invisible stat variables used in the game. These will NOT be shown on the Stats
    //Activity and are not shown to the user.
    public static int mMaelstromLoveValue;
    public static int mYifengLoveValue;
    public static int mKernLoveValue;
    private Page[] mPages;

    public Story() {
        mPages = new Page[3];

        mPages[0] = new Page(

                "Maelstrom is on a prison ship.  Chained up.  About to arrive at his punishment.  Pessimistic.  Getting jostled.  Only passenger.  Military people on ship.  Planet comes into view.  Soldier gives him a Brainbox",
                new Choice("He doesn't like Brainboxes. He wanted a simple translator unit.", 1),
                new Choice("He's grateful to have a Brainbox.  It will probably be a lot of help to him on this alien world.", 2),
                null, null, null);



        mPages[1] = new Page("Man these stupid things suck so hard!  Buzzing his neck.  He has enough problems, and now this.  In trouble, etc. Hurry up and turn on.", null, null, null, null, null);
        getBrainboxStatValue();
        mBrainBoxStatValue++;

        mPages[2] = new Page(
                "These are awesome things.  Buzzing his neck.  Maybe it will help him survive.  Needs help.  Really fucked up over situation.   Will it turn on soon?");


    }


    public static int getBrainboxStatValue() {
        return mBrainBoxStatValue;
    }

    public static void setBrainBoxStatValue(int brainBoxStatValue) {
        mBrainBoxStatValue = brainBoxStatValue;
    }

    public static int getAutonomyStatValue() {
        return mAutonomyStatValue;
    }

    public static void seAutonomyStatValue(int autonomyStatValue) {
        mAutonomyStatValue = autonomyStatValue;
    }

    public static int getAcceptanceStatValue() {
        return mAcceptanceStatValue;
    }

    public static void setAcceptanceStatValue(int acceptanceStatValue) {
        mAcceptanceStatValue = acceptanceStatValue;
    }



    public static int getDisruptionStatValue() {
        return mDisruptionStatValue;
    }

    public static void setDisruptionStatValue(int disruptionStatValue) {
        mDisruptionStatValue = disruptionStatValue;
    }

    public static int getLightningStatValue() {
        return mLightningStatValue;
    }

    public static void setLightningStatValue(int lightningStatValue) {
        mLightningStatValue = lightningStatValue;
    }

    public static int getHealthStatValue() {
        return mHealthStatValue;
    }

    public static void setHealthStatValue(int healthStatValue) {
        mHealthStatValue = healthStatValue;
    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }

}
