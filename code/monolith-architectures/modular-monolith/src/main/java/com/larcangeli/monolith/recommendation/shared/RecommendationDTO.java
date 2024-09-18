package com.larcangeli.monolith.recommendation.shared;

public record RecommendationDTO(Long recommendationId,
                                Long productId,
                                Integer version,
                                String author,
                                int rating,
                                String content){
}
