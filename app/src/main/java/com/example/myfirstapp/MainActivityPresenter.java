package com.example.myfirstapp;

import android.view.View;

public class MainActivityPresenter {

    private View view;
    private String text;

    public MainActivityPresenter (View view){
        this.view = view;
    }

    public void setDefaultText(String defaultText){
        text = defaultText;
        System.out.println(defaultText);
    }

    public interface View{

    }


}
