package com.example.dell.maelstrom;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.dell.maelstrom.StoryActivity;

import org.w3c.dom.Text;

/**
 * Created by Vivian on 12/19/2017.
 */

public class StatsActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    public TextView mBrainBoxTextView;
    public TextView mAutonomyTextView;
    public TextView mAcceptanceTextView;
    public TextView mDisruptionTextView;
    public TextView mLightningTextView;
    public TextView mHealthTextView;


    //helper method used to close the stats activity to return to the story
    private void backToStory() {
        this.finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
//        getActionBar().setHomeAsUpIndicator(null);

        mBrainBoxTextView = (TextView) findViewById(R.id.brainbox_stat_value);
        mAutonomyTextView = (TextView) findViewById(R.id.autonomy_stat_value);
        mAcceptanceTextView = (TextView) findViewById(R.id.acceptance_stat_value);
        mDisruptionTextView = (TextView) findViewById(R.id.disruption_stat_value);
        mLightningTextView = (TextView) findViewById(R.id.lightning_stat_value);
        mHealthTextView = (TextView) findViewById(R.id.health_stat_value);

        //set the value of the brain box stat and set it to the brainbox stat text view
                mBrainBoxTextView.setText(Integer.toString(Story.getBrainboxStatValue()));


        //set the value of the autonomy stat and set it to the autonomy stat text view
//        int autonomyStatValue = Story.mAutonomyStatValue;
        mAutonomyTextView.setText(Integer.toString(Story.getAutonomyStatValue()));

        //set the value of the acceptance stat and set it to the acceptance stat text view
//        int acceptanceStatValue = Story.mAcceptanceStatValue;
        mAcceptanceTextView.setText(Integer.toString(Story.getAcceptanceStatValue()));

        //set the value of the disruption stat and set it to the acceptance stat text view
//        int disruptionStatValue = Story.mDisruptionStatValue;
        mDisruptionTextView.setText(Integer.toString(Story.getDisruptionStatValue()));

        //set the value of the lightning stat and set it to the lightning stat text view
//        int lightningStatValue = Story.mLightningStatValue;
        mLightningTextView.setText(Integer.toString(Story.getLightningStatValue()));

        //set the value of the health stat and set it to the health stat text view
//        int healthStatValue = Story.mHealthStatValue;
        mHealthTextView.setText(Integer.toString(Story.getHealthStatValue()));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
            getMenuInflater().inflate(R.menu.stats, menu);
            return true;
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_back_to_story) {
            backToStory();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }
}
