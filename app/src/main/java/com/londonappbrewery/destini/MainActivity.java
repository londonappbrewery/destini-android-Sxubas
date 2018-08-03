package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private final int NOT_TEXT = 1;

    private Story[] mStories = {
            null, //As programmers love to count from 0, lets just remember that the stories are not count from 0 (or I should have added -1 on every array access)
            new Story(1, R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 3, 2, false),
            new Story(2, R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 3, 4, false),
            new Story(3, R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 6, 5, false),
            new Story(4, R.string.T4_End, NOT_TEXT, NOT_TEXT, -1, -1, true),
            new Story(5, R.string.T5_End, NOT_TEXT, NOT_TEXT, -1, -1, true),
            new Story(6, R.string.T6_End, NOT_TEXT, NOT_TEXT, -1, -1, true)
    };

    private int currentStory;

    Button mAns1;
    Button mAns2;
    TextView mStoryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mAns1 = findViewById(R.id.buttonBottom);
        mAns2 = findViewById(R.id.buttonTop);
        mStoryText = findViewById(R.id.storyTextView);

        //Custom - arrange state

        currentStory = 1; //Always start at story #1
        //To avoid reset at rotate, state should be retrieved and update currentStory

        goToStory(mStories[currentStory]);
    }


    private void goToStory(final Story story){

        mStoryText.setText(story.getStoryText());

        if(story.getIsEnd()){
            //MURDER those buttons
            mAns1.setVisibility(View.GONE);
            mAns2.setVisibility(View.INVISIBLE);
        } else {
            mAns1.setText(story.getAns1Text());
            mAns1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToStory(mStories[story.getAns1LeadsTo()]);
                }
            });

            mAns2.setText(story.getAns2Text());
            mAns2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToStory(mStories[story.getAns2LeadsTo()]);
                }
            });
        }
    }
}
