package com.portfolio.portfolio.website.Service;


import com.portfolio.portfolio.website.Entities.Project;
import com.portfolio.portfolio.website.Repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    public List<Project>  getallprojects(){
        return projectRepo.findAll();
    }
}
