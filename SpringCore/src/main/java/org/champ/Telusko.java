package org.champ;

public class Telusko {
    private ICourse course;
    //setter
    public void setCourse(ICourse course){
        System.out.println("Setter Injection");
        this.course=course;
    }
    //constructor
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
