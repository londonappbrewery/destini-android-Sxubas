package com.londonappbrewery.destini;

public class Story {

    private int mStoryNumber;
    private int mStoryText;
    private int mAns1Text;
    private int mAns2Text;
    private int mAns1LeadsTo;
    private int mAns2LeadsTo;
    private boolean mIsEnd;

    public Story(int storyNumber, int storyText, int ans1Text, int ans2Text, int ans1LeadsTo, int ans2LeadsTo, boolean isEnd) {
        mStoryNumber = storyNumber;
        mStoryText = storyText;
        mAns1Text = ans1Text;
        mAns2Text = ans2Text;
        mAns1LeadsTo = ans1LeadsTo;
        mAns2LeadsTo = ans2LeadsTo;
        mIsEnd = isEnd;
    }

    public int getStoryNumber() {
        return mStoryNumber;
    }

    public void setStoryNumber(int storyNumber) {
        mStoryNumber = storyNumber;
    }

    public int getStoryText() {
        return mStoryText;
    }

    public void setStoryText(int storyText) {
        mStoryText = storyText;
    }

    public int getAns1Text() {
        return mAns1Text;
    }

    public void setAns1Text(int ans1Text) {
        mAns1Text = ans1Text;
    }

    public int getAns2Text() {
        return mAns2Text;
    }

    public void setAns2Text(int ans2Text) {
        mAns2Text = ans2Text;
    }

    public int getAns1LeadsTo() {
        return mAns1LeadsTo;
    }

    public void setAns1LeadsTo(int ans1LeadsTo) {
        mAns1LeadsTo = ans1LeadsTo;
    }

    public int getAns2LeadsTo() {
        return mAns2LeadsTo;
    }

    public void setAns2LeadsTo(int ans2LeadsTo) {
        mAns2LeadsTo = ans2LeadsTo;
    }

    public boolean getIsEnd() {
        return mIsEnd;
    }

    public void setIsEnd(boolean isEnd) {
        mIsEnd = isEnd;
    }
}
