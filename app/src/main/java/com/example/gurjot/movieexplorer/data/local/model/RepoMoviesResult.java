package com.example.gurjot.movieexplorer.data.local.model;

import com.example.gurjot.movieexplorer.data.remote.paging.MoviePageKeyedDataSource;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PagedList;

/**
 * @author Yassin Ajdi.
 */
public class RepoMoviesResult {
    public LiveData<PagedList<Movie>> data;
    public LiveData<Resource> resource;
    public MutableLiveData<MoviePageKeyedDataSource> sourceLiveData;

    public RepoMoviesResult(LiveData<PagedList<Movie>> data,
                            LiveData<Resource> resource,
                            MutableLiveData<MoviePageKeyedDataSource> sourceLiveData) {
        this.data = data;
        this.resource = resource;
        this.sourceLiveData = sourceLiveData;
    }
}
