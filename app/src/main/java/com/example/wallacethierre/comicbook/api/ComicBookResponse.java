package com.example.wallacethierre.comicbook.api;

/**
 * Created by wallacethierre on 11/01/18.
 */

public class ComicBookResponse {

    private int comicId;

    private String title;

    private String imageUrlLarge;

    private String imageUrlSmall;


    public ComicBookResponse(int comicId, String title, String imageUrlLarge, String imageUrlSmall) {
        this.comicId = comicId;
        this.title = title;
        this.imageUrlLarge = imageUrlLarge;
        this.imageUrlSmall = imageUrlSmall;
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
