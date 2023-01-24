package com.tweteroo.tweteroo.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweteroo.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    Page<Tweet> findAllByOrderByIdDesc(Pageable pageable);
    List<Tweet> findByUsernameOrderByIdDesc(String username);
}
