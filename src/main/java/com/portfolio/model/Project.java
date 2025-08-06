package com.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "projects")

public class Project {
    @Id
    private String id;
    private String name;
    private String shortDescription;
    private String longDescription;
    private List<String> technoLogiesUsed;
    private String projectType;
    private String status;
    private String startDate; //pode ser LocalDate ou string
    private String endDate; //pode ser LocalDate ou string
    private String gitUrl;
    private String liveDemoUrl;
    private List<String> imageUrls; // urls para imagens do projeto
    private Model3D model3d; // objeto embutido para os metadados do modelo 3d
    private List<String> externalApiIntegrations;
    private boolean isFeatured;

    //criação do constructor padrão
    public Project(){
    }
    //construtor com todos os campos (opcional, nova forma de criar)
    public Project(String id, String name, String shortDescription, String longDescription, List<String> technologiesUsed, String projectType, String status, String startDate, String endDate, String githubUrl, String liveDemoUrl, List<String> imageUrls, Model3D model3d, List<String> externalApiIntegrations, boolean isFeatured) {
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.technoLogiesUsed = technologiesUsed;
        this.projectType = projectType;
        this.status = status;
        this.startDate = startDate;
        this.endDate= endDate;
        this.gitUrl = githubUrl;
        this.liveDemoUrl = liveDemoUrl;
        this.imageUrls = imageUrls;
        this.imageUrls = imageUrls;
        this.externalApiIntegrations = externalApiIntegrations;
        this.isFeatured = isFeatured;
    }

    //getter & setters
    public String getId(){
        return id = id;
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

    public String getShortDescription(){
        return shortDescription;
    }

    public void setShortDescription(String shortDescription){
        this.shortDescription = shortDescription;
    }

    public String getLongDescription(){
        return longDescription;
    }

    public void setLongDescription(String longDescription){
        this.longDescription = longDescription;
    }

    public List<String> getTechnoLogiesUsed(){
        return technoLogiesUsed;
    }

    public void setTechnoLogiesUsed(List<String> technoLogiesUsed){
        this.technoLogiesUsed = technoLogiesUsed;
    }

    public String getProjectType(){
        return projectType;
    }

    public void setProjectType(String projectType){
        this.projectType = projectType;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStartDate(){
        return startDate;
    }

    public void setStartDate(String StartDate){
        this.startDate = startDate;
    }

    public String getEndDate(){
        return endDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public String getGitUrl(){
        return gitUrl;
    }

    public void setGitUrl(String gitUrl){
        this.gitUrl = gitUrl;
    }

    public String getLiveDemoUrl(){
        return liveDemoUrl;
    }

    public void setLiveDemoUrl(String liveDemoUrl){
        this.liveDemoUrl = liveDemoUrl;
    }

    public List<String> getImageUrls(){
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls){
        this.imageUrls = imageUrls;
    }

    public Model3D getModel3d() {
        return model3d;
    }

    public void setModel3D(Model3D model3d){
        this.model3d = model3d;
    }

    public List<String> getExternalApiIntegrations(){
        return externalApiIntegrations;
    }

    public void setExternalApiIntegrations(List<String> externalApiIntegrations){
        this.externalApiIntegrations = externalApiIntegrations;
    }

    public boolean getIsFeatured(){
        return isFeatured;
    }

    public void setIsFeatured(boolean isFeatured){
        this.isFeatured = isFeatured;
    }

    @Override
    public String toString(){
        return "Project{" +
                "id='" + id + '\'' +
                ", name= '" + name + '\'' +
                ", shortDescription= '" + shortDescription + '\'' +
                '}';
    }
}