package com.portfolio.portfolio.website.Controller;



import com.portfolio.portfolio.website.Service.AchievementService;
import com.portfolio.portfolio.website.Service.ExperienceService;
import com.portfolio.portfolio.website.Service.ProjectService;
import com.portfolio.portfolio.website.Service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @Autowired
    private AchievementService achievementService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private ExperienceService experienceService;

    @GetMapping("/")
    public String getPortfolio(Model model) {
        model.addAttribute("projects", projectService.getallprojects());
        model.addAttribute("skills", skillService.getallskills());
        model.addAttribute("achievements", achievementService.getallachievement());
        model.addAttribute("experiences", experienceService.getallexperience());
        return "index";
    }
}