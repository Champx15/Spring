package org.champ;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
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
