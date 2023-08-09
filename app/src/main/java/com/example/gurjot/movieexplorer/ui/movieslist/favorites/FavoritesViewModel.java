package com.example.gurjot.movieexplorer.ui.movieslist.favorites;

import com.example.gurjot.movieexplorer.data.MovieRepository;
import com.example.gurjot.movieexplorer.data.local.model.Movie;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author Yassin Ajdi.
 */
public class FavoritesViewModel extends ViewModel {

    //    private final MovieRepository movieRepository;
    private LiveData<List<Movie>> favoriteListLiveData;

    public FavoritesViewModel(MovieRepository repository) {
        favoriteListLiveData = repository.getAllFavoriteMovies();
    }

    public LiveData<List<Movie>> getFavoriteListLiveData() {
        return favoriteListLiveData;
    }
}
