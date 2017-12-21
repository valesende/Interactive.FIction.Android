package com.example.dell.maelstrom;

/**
 * Created by Vivian on 12/19/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    private Story mStory = new Story();
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;
    private Button mChoice4;
    private Button mChoice5;
    private Page mCurrentPage;

    //helper method used to open main menu at game end
    private void openMainMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //helper method used to open stats activity from story activity
    private void openStats() {
        Intent intent = new Intent(this, StatsActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();

        mTextView = (TextView) findViewById(R.id.story_text_view);
        mChoice1 = (Button) findViewById(R.id.choice_button_1);
        mChoice2 = (Button) findViewById(R.id.choice_button_2);
        mChoice3 = (Button) findViewById(R.id.choice_button_3);
        mChoice4 = (Button) findViewById(R.id.choice_button_4);
        mChoice5 = (Button) findViewById(R.id.choice_button_5);

        loadPage(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.story, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        if (item.getItemId() == R.id.action_view_stats) {
            openStats();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }


    private void loadPage(int choice) {
        mCurrentPage = mStory.getPage(choice);


        String pageText = mCurrentPage.getText();
        pageText = String.format(pageText);
        mTextView.setText(pageText);

        if (mCurrentPage.isFinal()) {
            mChoice1.setVisibility(View.INVISIBLE);
            mChoice2.setText("MAIN MENU");
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMainMenu();
                }
            });
        }



         else {
            if (mCurrentPage.getChoice1() != null) {
                mChoice1.setText(mCurrentPage.getChoice1().getText());
            } else {
                mChoice1.setVisibility(View.GONE);
            }
            if (mCurrentPage.getChoice2() != null) {
                mChoice2.setText(mCurrentPage.getChoice2().getText());
            } else {
                mChoice2.setVisibility(View.GONE);
            }
            if  (mCurrentPage.getChoice3() != null) {
                mChoice3.setText(mCurrentPage.getChoice3().getText());
            } else {
                mChoice3.setVisibility(View.GONE);

            }
            if ( mCurrentPage.getChoice4() != null) {
                mChoice4.setText(mCurrentPage.getChoice4().getText());
            } else {
                mChoice4.setVisibility(View.GONE);
            }
            if (mCurrentPage.getChoice5() != null) {
                mChoice5.setText(mCurrentPage.getChoice5().getText());
            } else {
                mChoice5.setVisibility(View.GONE);

            }

        }

            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice1().getNextPage();
                    loadPage(nextPage);
                }
            });

            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice2().getNextPage();
                    loadPage(nextPage);
                }
            });

            mChoice3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice3().getNextPage();
                    loadPage(nextPage);
                }
            });

            mChoice4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice4().getNextPage();
                    loadPage(nextPage);
                }
            });

            mChoice5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice5().getNextPage();
                    loadPage(nextPage);
                }
            });
        }


    }


