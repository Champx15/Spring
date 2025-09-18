package org.champ;

import org.champ.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LaunchViaAppContext {
    public static void main(String[] args)
    {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        Telusko t =container.getBean(Telusko.class);
        Boolean status = t.buyTheCourse(234);
        if(status) System.out.println("Enrolled successfully");
        else System.out.println("Didn't enrolled");

    }
}