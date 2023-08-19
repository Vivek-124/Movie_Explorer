package com.example.gurjot.movieexplorer.data.local.dao;

import com.example.gurjot.movieexplorer.data.local.model.Cast;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

/**
 * @author Gurjot Singh
 * @since 11/12/2018.
 */
@Dao
public interface CastsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAllCasts(List<Cast> castList);

}
