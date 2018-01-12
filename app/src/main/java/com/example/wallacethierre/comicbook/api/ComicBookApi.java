package com.example.wallacethierre.comicbook.api;

import com.example.wallacethierre.comicbook.model.ComicBook;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by wallacethierre on 11/01/18.
 */

public interface ComicBookApi {

    @GET("/comic_books/")
    Observable<List<ComicBook>> getBooks();

}
