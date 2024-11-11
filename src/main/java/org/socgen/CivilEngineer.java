package org.socgen;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CivilEngineer implements Engineer{//, InitializingBean, DisposableBean {

    private Address address;

    public CivilEngineer(Address address) {
        this.address = address;
    }

    CivilEngineer(){

    }

    @Override
    public String toString() {
        return "CivilEngineer{" +
                "address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void workForWages() {
        System.out.println(this);
    }

    public void callAtStart(){
        System.out.println("Bean for CivilEngineer instantiated...");
    }

    public void callAtEnd(){
        System.out.println("Bean for CivilEngineer about to be taken out...");
    }


//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean for CivilEngineer about to be taken out...");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean for CivilEngineer instantiated...");
//    }
}
