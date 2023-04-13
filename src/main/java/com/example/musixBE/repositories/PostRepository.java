package com.example.musixBE.repositories;

import com.example.musixBE.models.social.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    @Query("{'ownerUsername': ?0}")
    List<Post> findByUsername(String username, Pageable pageable);
}
