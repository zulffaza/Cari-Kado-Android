package com.example.carikado.review.datasource;

import android.support.annotation.NonNull;

import com.example.carikado.base.model.MyResponse;
import com.example.carikado.review.model.Review;

/**
 * Merupakan class yang mengatur pengaksesan data
 *
 * @author Faza Zulfika P P
 * @version 1.0
 * @since 13 Oktober 2017
 */
public interface ReviewDataSource {

    interface AddReviewCallback {

        void onAddSuccess(@NonNull MyResponse response, @NonNull Boolean isFinish);
        void onAddFailed(@NonNull String message);
    }

    void addReview(@NonNull Review review, @NonNull AddReviewCallback addReviewCallback);
}
