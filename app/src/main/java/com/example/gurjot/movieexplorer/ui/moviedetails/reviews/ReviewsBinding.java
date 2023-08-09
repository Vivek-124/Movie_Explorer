package com.example.gurjot.movieexplorer.ui.moviedetails.reviews;

import com.example.gurjot.movieexplorer.data.local.model.Review;

import java.util.List;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author Yassin Ajdi
 * @since 11/12/2018.
 */
public class ReviewsBinding {

    @BindingAdapter("items")
    public static void setItems(RecyclerView recyclerView, List<Review> items) {
        ReviewsAdapter adapter = (ReviewsAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.submitList(items);
        }
    }
}
