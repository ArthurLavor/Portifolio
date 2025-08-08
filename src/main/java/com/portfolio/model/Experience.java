package com.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Experience")

public class Experience {
    @Id
    private String id;
    private String title;
    private String company;
    private String location;
    private String startDate; // pode ser localDate ou String
    private String endDate; // pode ser localDate/String ou Present para atual
    private List<String> responsibilities;
    private List<String> technologiesUsed;

    public Experience() {
    }

    public Experience(String id, String title, String company, String location, String startDate, String endDate, List<String> responsabilities, List<String> technologiesUsed ){
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.responsibilities = responsabilities;
        this.technologiesUsed = technologiesUsed;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getStartDate(){
        return startDate;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public String getEndDate(){
        return endDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }

    public List<String> getTechnologiesUsed() {
        return technologiesUsed;
    }

    public void setTechnologiesUsed(List<String> technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }

    @Override

    public String toString(){
        return "Experience{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';

    }



}
