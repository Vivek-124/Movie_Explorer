package com.example.gurjot.movieexplorer.utils;

import android.content.Context;

import com.example.gurjot.movieexplorer.data.MovieRepository;
import com.example.gurjot.movieexplorer.data.local.MoviesDatabase;
import com.example.gurjot.movieexplorer.data.local.MoviesLocalDataSource;
import com.example.gurjot.movieexplorer.data.remote.MoviesRemoteDataSource;
import com.example.gurjot.movieexplorer.data.remote.api.ApiClient;
import com.example.gurjot.movieexplorer.data.remote.api.MovieService;

/**
 * Class that handles object creation.
 *
 * @author Gurjot Singh.
 */
public class Injection {

    /**
     * Creates an instance of MoviesRemoteDataSource
     */
    public static MoviesRemoteDataSource provideMoviesRemoteDataSource() {
        MovieService apiService = ApiClient.getInstance();
        AppExecutors executors = AppExecutors.getInstance();
        return MoviesRemoteDataSource.getInstance(apiService, executors);
    }

    /**
     * Creates an instance of MoviesRemoteDataSource
     */
    public static MoviesLocalDataSource provideMoviesLocalDataSource(Context context) {
        MoviesDatabase database = MoviesDatabase.getInstance(context.getApplicationContext());
        return MoviesLocalDataSource.getInstance(database);
    }

    /**
     * Creates an instance of MovieRepository
     */
    public static MovieRepository provideMovieRepository(Context context) {
        MoviesRemoteDataSource remoteDataSource = provideMoviesRemoteDataSource();
        MoviesLocalDataSource localDataSource = provideMoviesLocalDataSource(context);
        AppExecutors executors = AppExecutors.getInstance();
        return MovieRepository.getInstance(
                localDataSource,
                remoteDataSource,
                executors);
    }

    public static ViewModelFactory provideViewModelFactory(Context context) {
        MovieRepository repository = provideMovieRepository(context);
        return ViewModelFactory.getInstance(repository);
    }
}
