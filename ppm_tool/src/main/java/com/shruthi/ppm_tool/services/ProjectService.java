package com.shruthi.ppm_tool.services;

import com.shruthi.ppm_tool.domain.Project;
import com.shruthi.ppm_tool.repositories.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        return projectRepository.save(project);
    }
    
}
