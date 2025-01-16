package io.erosutuidev.springsecurity.repositories;

import io.erosutuidev.springsecurity.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITweetRepository extends JpaRepository<Tweet, Long> {
}
