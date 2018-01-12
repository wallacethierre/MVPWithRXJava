package com.example.wallacethierre.comicbook.data.communication;

import android.util.Log;

import com.example.wallacethierre.comicbook.api.ComicBookApi;
import com.example.wallacethierre.comicbook.api.ServiceClient;
import com.example.wallacethierre.comicbook.model.ComicBook;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by wallacethierre on 11/01/18.
 */

public class ComicBookRemote {

    private final ComicBookApi apiService;

    public ComicBookRemote() {
        this.apiService = ServiceClient.comicBookClientBuild();
    }

    public Disposable getGeComicBook(@NonNull final GetBookCallback callback) {
        Disposable disposable =  apiService.getBooks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<ComicBook>>() {
                    @Override
                    public void accept(List<ComicBook> comicBookList) throws Exception {
                        Log.i("DJACA", "Json Value: "+comicBookList.size());
                        callback.onSuccess(comicBookList);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        callback.onError(throwable);
                    }
                });
//                .subscribe(new Consumer<ComicBookApi>() {
//                    @Override
//                    public void accept(ComicBookApi comicBookApi) throws Exception {
//                        Log.i("DJACA", "Json Value: "+comicBookApi.getBooks());
//                    }
//                });
        return disposable;
    }

    public interface GetBookCallback{
        void onSuccess(List<ComicBook> comicBooks);

        void onError(Throwable ex);
    }
}


