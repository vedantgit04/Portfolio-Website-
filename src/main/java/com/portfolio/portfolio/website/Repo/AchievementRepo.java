package com.portfolio.portfolio.website.Repo;


import com.portfolio.portfolio.website.Entities.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementRepo extends JpaRepository<Achievement,Integer> {
}
