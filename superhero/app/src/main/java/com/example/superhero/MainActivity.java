package com.example.superhero;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Hero>> {

    private ListView dataListView;
    private EditText requestTag;
    private TextView errorMessage;
    private ProgressBar loadingBar;
    private HeroAdapter adapter;

    private static final int HERO_SEARCH_LOADER = 1;
    private static final String HERO_QUERY_TAG = "query";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadingBar = findViewById(R.id.loadingBar);
        errorMessage = findViewById(R.id.errorMessage);
        requestTag = findViewById(R.id.requestTag);

        dataListView = findViewById(R.id.dataListView);
        dataListView.setEmptyView(errorMessage);

        adapter = new HeroAdapter(getApplicationContext());
        dataListView.setAdapter(adapter);

        if(savedInstanceState != null) {
            String queryUrl = savedInstanceState.getString((HERO_QUERY_TAG));
            requestTag.setText((queryUrl));
        }
        getSupportLoaderManager().initLoader(HERO_SEARCH_LOADER, null, this);


    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString(HERO_QUERY_TAG, requestTag.getText().toString().trim());
    }
    @NonNull
    @SuppressLint("StaticFieldLeak")
    public Loader<List<Hero>> onCreateLoader(int id, final Bundle args) {
        return new AsyncTaskLoader<List<Hero>>(this) {
            List<Hero> mHeroList;
            @Override
            protected void onStartLoading() {
                if (args == null) {
                    return;
                }

                loadingBar.setVisibility(View.VISIBLE);

                if (mHeroList != null) {
                    deliverResult(mHeroList);
                } else {
                    forceLoad();
                }
            }

            @Nullable
            @Override
            public List<Hero> loadInBackground() {
                String searchQueryUrlString = args.getString(HERO_QUERY_TAG);

                try {
                    return NetworkUtils.getDataFromAPi(searchQueryUrlString);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            public void deliverResult(@Nullable List<Hero> data) {
                mHeroList = data;
                super.deliverResult(data);
            }
        };
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Hero>> loader, List<Hero> data) {
        loadingBar.setVisibility(View.INVISIBLE);

        if(null == data)
            showErrorMessage();
        else {
            adapter.clear();
            adapter.addAll(data);
            showJsonDataView();
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Hero>> loader) {

    }


    private void showJsonDataView() {
        errorMessage.setVisibility(View.INVISIBLE);
        dataListView.setVisibility(View.VISIBLE);
    }

    private void showErrorMessage() {
        dataListView.setVisibility(View.INVISIBLE);
        errorMessage.setVisibility(View.VISIBLE);
    }
    public void searchHero(View view) {
        makeHeroSearchQuery();
    }
    private void makeHeroSearchQuery() {
        String heroQuery = requestTag.getText().toString();
        Bundle queryBundle = new Bundle();
        queryBundle.putString(HERO_QUERY_TAG, heroQuery);
        LoaderManager loaderManager = LoaderManager.getInstance(this);
        Loader<String> heroSearchLoader = loaderManager.getLoader(HERO_SEARCH_LOADER);
        if (heroSearchLoader == null) {
            loaderManager.initLoader(HERO_SEARCH_LOADER, queryBundle, this);
        } else {
            loaderManager.restartLoader(HERO_SEARCH_LOADER, queryBundle, this);
        }
    }

}