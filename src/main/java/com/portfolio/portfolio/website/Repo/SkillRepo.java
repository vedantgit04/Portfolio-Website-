package com.portfolio.portfolio.website.Repo;

import com.portfolio.portfolio.website.Entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepo extends JpaRepository<Skill,Integer> {

}
