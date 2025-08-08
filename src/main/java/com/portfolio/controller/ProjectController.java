package com.portfolio.controller;

import com.portfolio.model.Project;
import com.portfolio.repository.ProjectRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
@Tag(name = "Projetos", description = "API para gerenciamento de projetos do portfólio")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @Operation(summary = "Obter todos os projetos", description = "Retorna uma lista de todos os projetos no portfólio.")
    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Operation(summary = "Obter projeto por ID", description = "Retorna um projeto específico pelo seu ID.")
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable String id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Operation(summary = "Criar novo projeto", description = "Adiciona um novo projeto ao portfólio.")
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    @Operation(summary = "Atualizar projeto existente", description = "Atualiza os detalhes de um projeto existente pelo seu ID.")
    @PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable String id, @RequestBody Project projectDetails) {
        Optional<Project> project = projectRepository.findById(id);
        if (project.isPresent()) {
            Project existingProject = project.get();
            existingProject.setName(projectDetails.getName());
            existingProject.setShortDescription(projectDetails.getShortDescription());
            existingProject.setLongDescription(projectDetails.getLongDescription());
            existingProject.setTechnologiesUsed(projectDetails.getTechnologiesUsed());
            existingProject.setProjectType(projectDetails.getProjectType());
            existingProject.setStatus(projectDetails.getStatus());
            existingProject.setStartDate(projectDetails.getStartDate());
            existingProject.setEndDate(projectDetails.getEndDate());
            existingProject.setGithubUrl(projectDetails.getGithubUrl());
            existingProject.setLiveDemoUrl(projectDetails.getLiveDemoUrl());
            existingProject.setImageUrls(projectDetails.getImageUrls());
            existingProject.setModel3d(projectDetails.getModel3d());
            existingProject.setExternalApiIntegrations(projectDetails.getExternalApiIntegrations());
            existingProject.setFeatured(projectDetails.isFeatured());
            return ResponseEntity.ok(projectRepository.save(existingProject));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Excluir projeto", description = "Remove um projeto do portfólio pelo seu ID.")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable String id) {
        if (projectRepository.existsById(id)) {
            projectRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Obter projetos por tecnologia", description = "Retorna projetos que utilizam uma tecnologia específica.")
    @GetMapping("/technology/{technology}")
    public List<Project> getProjectsByTechnology(@PathVariable String technology) {
        return projectRepository.findByTechnologiesUsedContaining(technology);
    }

    @Operation(summary = "Obter projetos em destaque", description = "Retorna projetos marcados como destaque.")
    @GetMapping("/featured")
    public List<Project> getFeaturedProjects() {
        return projectRepository.findByIsFeatured(true);
    }
}