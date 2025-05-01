package com.portfolio.portfolio.website.Repo;


import com.portfolio.portfolio.website.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer> {
}
