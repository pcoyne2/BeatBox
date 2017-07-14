package com.bignerdranch.coyne.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Patrick Coyne on 7/14/2017.
 */

public class SoundViewModel extends BaseObservable{

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public Sound getSound(){
        return mSound;
    }

    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }
}
