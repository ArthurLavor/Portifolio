package com.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "skills")
public class Skill {
    @Id
    private String id;
    private String name;
    private String category; // ex: linguagem de programação
    private String proficiency; // ex: basico, intermediario, avançado
    private String iconUrl;  // URL para icone de habilidade
    private String description;
    private List<String> relatedProjectsIds; // IDs de projetos relacionados

    public Skill(){
    }

    public Skill(String id, String name, String category, String proficiency, String iconUrl, String description, List<String> relatedProjectsIds){
        this.id = id;
        this.name = name;
        this.category = category;
        this.proficiency = proficiency;
        this.iconUrl = iconUrl;
        this.description = description;
        this.relatedProjectsIds = relatedProjectsIds;
    }

    //getters & setters

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getProficiency(){
        return proficiency;
    }

    public void setProficiency(String proficiency){
        this.proficiency = proficiency;
    }

    public String getIconUrl(){
        return iconUrl;
    }

    public void setIconUrl(String iconUrl){
        this.iconUrl = iconUrl;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<String> getRelatedProjectsIds(){
        return relatedProjectsIds;
    }

    public void setRelatedProjectsIds(List<String> relatedProjectsIds){
        this.relatedProjectsIds = relatedProjectsIds;
    }

    @Override

    public String toString(){
        return "Skill{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
