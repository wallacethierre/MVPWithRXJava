package com.example.wallacethierre.comicbook.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wallacethierre.comicbook.R;
import com.example.wallacethierre.comicbook.data.communication.ComicBookRemote;
import com.example.wallacethierre.comicbook.model.ComicBook;

import java.util.List;

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    private HomeContract.Presenter presenter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomePresenter presenter = new HomePresenter(new ComicBookRemote(),this);
        initView();
    }

    private void initView() {
        button = findViewById(R.id.button);
        button.setOnClickListener(buttonListener);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            presenter.getComicBook();
        }
    };

    @Override
    public void showComicBookResult(List<ComicBook> comicBookList) {
        //Set adapter, load data
        Log.i("DJACA", "Comic book data: "+comicBookList.toString());
    }

    @Override
    public void showFailedComicBook(Throwable throwable) {
        //Show empty view to error to load data
        Log.e("DJACA", "Error to load comic book data", throwable);
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        this.presenter = presenter;
    }

}
