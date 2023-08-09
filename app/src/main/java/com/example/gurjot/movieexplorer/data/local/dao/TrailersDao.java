package com.example.gurjot.movieexplorer.data.local.dao;

import com.example.gurjot.movieexplorer.data.local.model.Trailer;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

/**
 * @author Yassin Ajdi
 * @since 11/11/2018.
 */
@Dao
public interface TrailersDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAllTrailers(List<Trailer> trailers);

}
