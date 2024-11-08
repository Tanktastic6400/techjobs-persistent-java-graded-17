package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

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
