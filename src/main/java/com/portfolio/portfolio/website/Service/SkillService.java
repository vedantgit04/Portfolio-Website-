package com.portfolio.portfolio.website.Service;

import com.portfolio.portfolio.website.Entities.Skill;
import com.portfolio.portfolio.website.Repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    SkillRepo skillRepo;

    public List<Skill> getallskills(){
        return skillRepo.findAll();
    }
}
