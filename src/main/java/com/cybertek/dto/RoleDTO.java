package com.cybertek.dto;



public class RoleDTO {

    private Long id;
    private String description;

    public RoleDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleDTO() {
    }
}
