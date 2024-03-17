package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.ConstructorGreetingController;
import com.example.dependencyinjection.controller.PropertyGreetingController;
import com.example.dependencyinjection.controller.SetterGreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
      ApplicationContext ctx =  SpringApplication.run(DependencyInjectionApplication.class, args);
        PropertyGreetingController propertyGreetingController = (PropertyGreetingController) ctx.getBean("propertyGreetingController");
        System.out.println("............... field.");
        System.out.println(propertyGreetingController.getGreeting());

        ConstructorGreetingController constructorGreetingController  = (ConstructorGreetingController) ctx.getBean("constructorGreetingController");
        System.out.println("........... constructor ");
        System.out.println(constructorGreetingController.sayGreeting());

        SetterGreetingController setterGreetingController = (SetterGreetingController) ctx.getBean("setterGreetingController");
        System.out.println(".......... setter.");
        System.out.println(setterGreetingController.sayGreeting());
    }

}
