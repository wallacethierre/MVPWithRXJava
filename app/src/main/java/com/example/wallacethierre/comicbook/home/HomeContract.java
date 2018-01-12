package com.example.wallacethierre.comicbook.home;


import com.example.wallacethierre.comicbook.model.ComicBook;

import java.util.List;

/**
 * Created by wallacethierre on 11/01/18.
 */

public interface HomeContract {

    interface View {
        void showComicBookResult(List<ComicBook> comicBookList);

        void showFailedComicBook(Throwable throwable);

        void setPresenter(HomeContract.Presenter presenter);
    }

    interface Presenter {
        void getComicBook();
    }
}
