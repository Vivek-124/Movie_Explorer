package com.example.gurjot.movieexplorer.data.local.dao;

import com.example.gurjot.movieexplorer.data.local.model.Review;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

/**
 * @author Gurjot Singh
 * @since 11/13/2018.
 */
@Dao
public interface ReviewsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAllReviews(List<Review> reviews);

}
