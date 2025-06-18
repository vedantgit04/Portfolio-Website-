package com.portfolio.portfolio.website;


import com.portfolio.portfolio.website.Entities.Achievement;
import com.portfolio.portfolio.website.Entities.Experience;
import com.portfolio.portfolio.website.Entities.Project;
import com.portfolio.portfolio.website.Entities.Skill;
import com.portfolio.portfolio.website.Repo.AchievementRepo;
import com.portfolio.portfolio.website.Repo.ExperienceRepo;
import com.portfolio.portfolio.website.Repo.ProjectRepo;
import com.portfolio.portfolio.website.Repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProjectRepo projectRepository;

    @Autowired
    private SkillRepo skillRepository;

    @Autowired
    private AchievementRepo achievementRepository;

    @Autowired
    private ExperienceRepo experienceRepository;

    @Override
    public void run(String... args) throws Exception {
        // Seed Projects
        projectRepository.save(new Project("AI-Powered Health Monitoring and Disease Detection System", "reducing manual effort from 2 hours to 15 minutes per case, and deployed a LLM chatbot trained on a 500+ medical article knowledge base to analyze symptoms, achieving 40% faster diagnosis.achieved 92% diagnostic accuracy by integrating real-time sensor data." ,"https://github.com/vedantgit04/AI-Powered-Health-Monitoring-and-Disease-Detection-System"));
        projectRepository.save(new Project("Text-Analytics-Hub", "Reduced text analysis time by 50% with a custom NLP summarization model (BERT, spaCy) that condenses 10,000+ word documents into 200-word summaries at 95% semantic accuracy, validated on a 1,000+ article dataset. Automated video-to-text conversion using NLP-driven speech recognition (Whisper API) and summarization, processing 500+ hours of video content into concise summaries with 90% key-topic retention, slashing manual review time by 70%.","https://github.com/vedantgit04/Text-Analytics-Hub-Summarization-and-QA"));
        projectRepository.save(new Project("GcoeaSync","Built a full-stack community app for GCOEA using management, club portals, student marketplace, and college feed. Spring Boot, Next.js & MySQL, featuring event.Implemented secure authentication via JWT and scalable. Tech Stack: Java (Spring Boot), React (Next.js),MySQL","https://github.com/vedantgit04/Gcoeasync"));
        // Seed Skills
        skillRepository.save(new Skill("Java & Springboot", "Building robust REST APIs and backend systems.", "Intermidiate"));
        skillRepository.save(new Skill("Machine Learning", "Developing AI models for clustering and NLP.", "Intermidiate"));
        skillRepository.save(new Skill("C++ & DSA", "Solving complex problems with optimized algorithms.", "Advance"));


        // Seed Achievements
        achievementRepository.save(new Achievement("Secured 1st place in Code Hunt at Anusandhan", "Anusandhan a national-level tech fest by Prof. Ram Meghe College of Engineering and Management, showcasing strong problem-solving and coding skills.", "2025-02-14"));


        // Seed Experiences
        experienceRepository.save(new Experience("Software Intern", "Infosys SpringBoard", "2024-10-01", "2024-12-31", "Project-based internship focused on developing a semi-supervised machine learning model for cell population clustering in cytometry data.Enhanced the accuracy and interpretability of cell population identification to support biological research.Responsibilities included model development, data preprocessing, and performance evaluation for optimal clustering precision.I achieved 97% accuracy and 99% AURAC in semi supervise model."));

    }
}
