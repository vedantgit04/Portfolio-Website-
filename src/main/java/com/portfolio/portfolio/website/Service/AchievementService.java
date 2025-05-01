package com.portfolio.portfolio.website.Service;


import com.portfolio.portfolio.website.Entities.Achievement;
import com.portfolio.portfolio.website.Repo.AchievementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementService {

    @Autowired
    private AchievementRepo achievementRepo;

    public List<Achievement>  getallachievement(){
        return achievementRepo.findAll();
    }

}
