package org.socgen;

public class ComputerEngineer implements Engineer{

    private String name;

    private String skills;

    ComputerEngineer(){

    }

    public void setName(String name) {
        //System.out.println("Setter for name called....");
        this.name = name;
    }

    public ComputerEngineer(String name, String skills) {
        System.out.println("Constructor for CE called...");
        this.name = name;
        this.skills = skills;
    }

    public void setSkills(String skills) {
        //System.out.println("Setter for skills called....");
        this.skills = skills;
    }

    @Override
    public void workForWages() {
        System.out.println("Engineers work for wages...");
        System.out.println("My details : " + name + ", skills:  " + skills);
    }
}
