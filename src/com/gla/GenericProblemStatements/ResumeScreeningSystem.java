package com.gla.GenericProblemStatements;
import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    private int experienceYears;

    public Resume(String candidateName, T jobRole, int experienceYears) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.experienceYears = experienceYears;
    }

    public String getCandidateName() { return candidateName; }
    public T getJobRole() { return jobRole; }
    public int getExperienceYears() { return experienceYears; }

    public String toString() {
        return candidateName + " | Role: " + jobRole.getRoleName() + " | Experience: " + experienceYears + " years";
    }
}

public class ResumeScreeningSystem {

    public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
        System.out.println("Screening resumes...");
        for (Resume<? extends JobRole> r : resumes) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        List<Resume<SoftwareEngineer>> seResumes = new ArrayList<>();
        seResumes.add(new Resume<>("Alice", new SoftwareEngineer(), 5));
        seResumes.add(new Resume<>("Bob", new SoftwareEngineer(), 3));

        List<Resume<DataScientist>> dsResumes = new ArrayList<>();
        dsResumes.add(new Resume<>("Charlie", new DataScientist(), 4));

        List<Resume<ProductManager>> pmResumes = new ArrayList<>();
        pmResumes.add(new Resume<>("Diana", new ProductManager(), 7));

        System.out.println("Software Engineer Resumes:");
        screenResumes(seResumes);

        System.out.println("Data Scientist Resumes:");
        screenResumes(dsResumes);

        System.out.println("Product Manager Resumes:");
        screenResumes(pmResumes);
    }
}
