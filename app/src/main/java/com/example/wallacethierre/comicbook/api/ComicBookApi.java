package com.example.wallacethierre.comicbook.api;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by wallacethierre on 11/01/18.
 */

public interface ComicBookApi {

    @GET("/comic_books/")
    Observable<ComicBookApi> getBooks();

}
