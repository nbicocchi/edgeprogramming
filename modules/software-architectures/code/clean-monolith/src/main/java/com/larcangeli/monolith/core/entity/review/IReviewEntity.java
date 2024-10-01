package com.larcangeli.monolith.core.entity.review;

public interface IReviewEntity {
    Long getProductId();
    Long getReviewId();
    String getAuthor();
    String getContent();
    String getSubject();
}