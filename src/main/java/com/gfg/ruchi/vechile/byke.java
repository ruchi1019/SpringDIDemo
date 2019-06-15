package com.gfg.ruchi.vechile;

import com.gfg.ruchi.tyre.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class byke implements Vechile {
    @Autowired
    private Tyre tyre;
    public void drive(){
        tyre.setBrand("MRF");
        System.out.println("byke bhaag rahi hai");
        System.out.println("Byke"+tyre.getBrand());
    }
}
