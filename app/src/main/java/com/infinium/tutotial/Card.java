package com.infinium.tutotial;

import java.net.URL;

/**
 * Created by User on 28.10.17.
 */

public class Card {

    private String ImgURL;
    private String title;

    public Card(String ImgURL, String title){
        this.ImgURL = ImgURL;
        this.title = title;
    }

    public String getImgURL(){
        return ImgURL;
    }

    public void setImgURL(String ImgURL){
        this.ImgURL = ImgURL;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.ImgURL = title;
    }
}
