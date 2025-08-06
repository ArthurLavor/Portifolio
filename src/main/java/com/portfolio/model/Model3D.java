package com.portfolio.model;

public class Model3D {
    private String name;
    private String path; // caminho para o arquivo .glb ou .gltf
    private String type; // ex GLB OU GLTF
    private String description;

    public Model3D(){
    }

    public Model3D(String name, String path, String type, String description){
        this.name = name;
        this.path = path;
        this.type = type;
        this.description = description;
    }

    // getters & setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}


