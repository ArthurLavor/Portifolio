package com.portfolio.controller;

import com.portfolio.model.Skill;
import com.portfolio.repository.SkillRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/skills")
@Tag(name = "Habilidades", description = "API para gerenciamento de habilidades do portfólio")
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @Operation(summary = "Obter habilidade por ID", description = "Retorna uma habilidade específica pelo seu ID")
    @GetMapping("/{id")
    public ResponseEntity<Skill> getSkillById(@PathVariable String id) {
        Optional<Skill> skill = skillRepository.findById(id);
        return skill.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Operation(summary = "Criar nova habilidade", description = "Adiciona uma nova habilidade.")
    @PostMapping
    public Skill createSkill(@RequestBody Skill skill) {
        return skillRespository.save(skill);
    }
}
