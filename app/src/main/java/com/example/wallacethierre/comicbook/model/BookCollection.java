package com.example.wallacethierre.comicbook.model;

import java.util.List;

/**
 * Created by wallacethierre on 11/01/18.
 */

public class BookCollection {

    private List<ComicBook> comicBookList;

    public BookCollection(List<ComicBook> comicBookList) {
        this.comicBookList = comicBookList;
    }


    public List<ComicBook> getComicBookList() {
        return comicBookList;
    }

    public void setComicBookList(List<ComicBook> comicBookList) {
        this.comicBookList = comicBookList;
    }
}
