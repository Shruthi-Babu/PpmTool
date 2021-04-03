package com.shruthi.ppm_tool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shruthi.ppm_tool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    
    Project findByProjectIdentifier(String projectId);

    @Override
    Iterable<Project> findAll();

 
}
