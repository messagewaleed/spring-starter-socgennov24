package org.socgen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("anEngineer")
//@Service
//@Repository
//@Controller
public class AnnotationsEngineer implements Engineer{

    @Autowired
    Address address;

//    @Autowired
//    public AnnotationsEngineer(@Qualifier("address") Address address) {
//        this.address = address;
//    }

    AnnotationsEngineer(){

    }

//    @Autowired
//    @Qualifier("otherAddress")//For the exact match
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "AnnotationsEngineer{" +
                "address=" + address +
                '}';
    }

    @Override
    public void workForWages() {
        System.out.println(this);
    }
}
