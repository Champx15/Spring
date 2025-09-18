package org.champ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Telusko {
/*  @Autowired --> field injection ( can't be done using xm only),doesn't need custom constructor
      or setter */
    private ICourse course;
    //setter
//    @Autowired -->(Auto wired is "byType") setter injection
    public void setCourse(ICourse course){
        System.out.println("Setter Injection");
        this.course=course;
    }
    //constructor
//    @Autowired --> constructor injection
//    @Qualifier("java") --> overrides Primary, and usually bean name is camelCase(so Java class --> "java" bean)
    public Telusko(ICourse course) {
        System.out.println("Constructor Injection");
        System.out.println("Telusko Bean Created");
        this.course=course;
    }
    public Telusko(){
        System.out.println("Default Constructor called");
        System.out.println("Telusko Bean Created");
    }
    public boolean buyTheCourse(double amount){
        course.coursePurchased(amount);
        return true;
    }
}
