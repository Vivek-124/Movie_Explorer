package com.example.gurjot.movieexplorer.data;

import com.example.gurjot.movieexplorer.data.local.model.Movie;
import com.example.gurjot.movieexplorer.data.local.model.MovieDetails;
import com.example.gurjot.movieexplorer.data.local.model.RepoMoviesResult;
import com.example.gurjot.movieexplorer.data.local.model.Resource;
import com.example.gurjot.movieexplorer.ui.movieslist.MoviesFilterType;

import java.util.List;

import androidx.lifecycle.LiveData;

/**
 * @author Gurjot Singh.
 */
public interface DataSource {

    LiveData<Resource<MovieDetails>> loadMovie(long movieId);

    RepoMoviesResult loadMoviesFilteredBy(MoviesFilterType sortBy);

    LiveData<List<Movie>> getAllFavoriteMovies();

    void favoriteMovie(Movie movie);

    void unfavoriteMovie(Movie movie);
}
