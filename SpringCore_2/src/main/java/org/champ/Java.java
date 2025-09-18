package org.champ;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Java  implements ICourse{
    public Java() {
        System.out.println("Java Bean Created");
    }

    @Override
    public boolean coursePurchased(double amount) {
        System.out.println("Java Course purchased successfully");
        return true;
    }
}
