package com.example.myfirstapp;

import android.view.View;

public class MainActivityPresenter {

    private PresenterView view;
    private String text;

    public MainActivityPresenter (PresenterView view){
        this.view = view;
    }

    public void setDefaultText(String name){
        text = "Hello " + name;
        view.setText(text)
    }




    public void calculateNewState(inputFromView: String) {
        //logic logic logic

        presenterView.setColor(color);
        presenterView.setFontsize(fontsize);
        presenterView.setThingToShow(thing);
    }

    public interface PresenterView{
        public void setText(String newText);
    }


}
