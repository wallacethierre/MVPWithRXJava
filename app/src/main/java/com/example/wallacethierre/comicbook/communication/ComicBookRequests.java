package com.example.wallacethierre.comicbook.communication;

import com.example.wallacethierre.comicbook.api.ComicBookApi;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by wallacethierre on 11/01/18.
 */

public class ComicBookRequests {

    private final ComicBookApi apiService;


    public ComicBookRequests(ComicBookApi apiService) {
        this.apiService = apiService;
    }

    public Disposable getGetComicBook(final GetBookCallback callback) {
        return apiService.getBooks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ComicBookApi>() {
                    @Override
                    public void accept(ComicBookApi comicBookApi) throws Exception {

                    }
                });
    }

    public interface GetBookCallback{
        void onSuccess(ComicBookApi comicBookInfoResponse);

        void onError(Throwable ex);
    }
}


