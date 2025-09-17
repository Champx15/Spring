package org.champ;

public class SpringBoot implements ICourse{
    public SpringBoot() {
        System.out.println("Spring Bean Created");
    }

    @Override
    public boolean coursePurchased(double amount){
       System.out.println("Spring Course purchased");
       return true;
    }
}
