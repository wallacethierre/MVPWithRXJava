package com.example.wallacethierre.comicbook.home;

import com.example.wallacethierre.comicbook.api.ComicBookInfo;

/**
 * Created by wallacethierre on 11/01/18.
 */

public interface HomeView {

    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getListSuccess(ComicBookInfo cityListResponse);

}
