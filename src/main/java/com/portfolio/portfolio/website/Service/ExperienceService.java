package com.portfolio.portfolio.website.Service;

import com.portfolio.portfolio.website.Entities.Experience;
import com.portfolio.portfolio.website.Repo.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepo experienceRepo;

    public List<Experience> getallexperience() {
        return experienceRepo.findAll();
    }
}