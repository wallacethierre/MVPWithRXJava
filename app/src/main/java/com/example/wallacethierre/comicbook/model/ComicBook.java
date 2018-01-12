package com.example.wallacethierre.comicbook.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wallacethierre on 10/01/18.
 */
public class ComicBook {
    @SerializedName("comic_book_id")
    private int comicId;

    @SerializedName("title")
    private String title;

    @SerializedName("img_large")
    private String imageUrlLarge;

    @SerializedName("img_small")
    private String imageUrlSmall;


    public ComicBook(int id, String title, String imgUrlLarge, String imgUrlSmall) {
        this.comicId = id;
        this.title = title;
        this.imageUrlLarge = imgUrlLarge;
        this.imageUrlSmall = imgUrlSmall;
    }

    public int getComicId() {
        return comicId;
    }

    public void setComicId(int comicId) {
        this.comicId = comicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrlLarge() {
        return imageUrlLarge;
    }

    public void setImageUrlLarge(String imageUrlLarge) {
        this.imageUrlLarge = imageUrlLarge;
    }

    public String getImageUrlSmall() {
        return imageUrlSmall;
    }

    public void setImageUrlSmall(String imageUrlSmall) {
        this.imageUrlSmall = imageUrlSmall;
    }
}
