package com.gfg.ruchi.vechile;

import com.gfg.ruchi.tyre.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vechile {
    @Autowired
    private Tyre tyre;
    public void drive(){
        tyre.setBrand("MRF12");
        System.out.println("car chal rahi hai");
        System.out.println("car"+tyre.getBrand());
    }
}
