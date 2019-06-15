package com.gfg.ruchi.application;

import com.gfg.ruchi.config.BeanConfig;
import com.gfg.ruchi.vechile.Car;
import com.gfg.ruchi.vechile.Vechile;
import com.gfg.ruchi.vechile.byke;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Application {
    public static void main(String[] args) throws BeansException{
       /* Car c = new Car();
        c.drive();
        byke b =new byke();
        b.drive();
        Vechile v = new Car();
        v.drive();
        Vechile v1 = new byke();
        v1.drive();*/
        ApplicationContext context = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) context).register(BeanConfig.class);


                ((AnnotationConfigApplicationContext) context).refresh();

                Vechile object =((AnnotationConfigApplicationContext) context).getBean("Car",Vechile.class);
        object.drive();


    }
}
