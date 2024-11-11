package org.socgen;

import java.util.List;

public class ComputerEngineer implements Engineer{

    private String name;

    private String skills;

    private List<Address> addresses;

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
//    private Address address;

//    public void setAddress(Address address) {
//        this.address = address;
//    }

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
    public String toString() {
        return "ComputerEngineer{" +
                "name='" + name + '\'' +
                ", skills='" + skills + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    @Override
    public void workForWages() {
        System.out.println("Engineers work for wages...");
        System.out.println(this);
//        System.out.println("My details : " + name + ", skills:  " + skills);
//        System.out.println("My address details : " + address);
    }
}
