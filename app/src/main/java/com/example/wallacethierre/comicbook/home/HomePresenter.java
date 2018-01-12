package com.example.wallacethierre.comicbook.home;

import com.example.wallacethierre.comicbook.data.communication.ComicBookRemote;
import com.example.wallacethierre.comicbook.model.ComicBook;

import java.util.List;

import io.reactivex.annotations.NonNull;

/**
 * Created by wallacethierre on 10/01/18.
 */

public class HomePresenter implements HomeContract.Presenter {

    // precisa analisar, se vai usar uma ou o padrao de projeto repositorio
    private final ComicBookRemote comicBookRequests;

    private HomeContract.View view;

    public HomePresenter(@NonNull ComicBookRemote api, @NonNull HomeContract.View view) {
        this.comicBookRequests = api;
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void getComicBook() {
        // Iremos fazer o request aqui
        this.comicBookRequests.getGeComicBook(new ComicBookRemote.GetBookCallback() {
            @Override
            public void onSuccess(List<ComicBook> comicBooks) {
                // vai chamar a referencia da view
                view.showComicBookResult(comicBooks);
            }

            @Override
            public void onError(Throwable ex) {
                view.showFailedComicBook(ex);
            }
        });
    }
}


