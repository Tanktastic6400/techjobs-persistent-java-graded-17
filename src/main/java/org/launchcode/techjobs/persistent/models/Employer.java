package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    public Employer(){}

    @NotBlank
    @Size(max=50)
    private String location;



    public @NotBlank @Size(max = 50) String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(max = 50) String location) {
        this.location = location;
    }



}
