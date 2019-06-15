package com.gfg.ruchi.config;

import com.gfg.ruchi.vechile.Car;
import com.gfg.ruchi.vechile.Vechile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gfg.ruchi.vechile, com.gfg.ruchi.tyre")
public class BeanConfig {
    @Bean
    public Vechile getVechile(){
        return new Car();
    }

}
