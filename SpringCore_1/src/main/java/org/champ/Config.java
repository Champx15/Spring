package org.champ;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
public class Config {
//    @Bean --> used inside @Configuration, if you make object and want Spring to take it as Bean
    public SpringBoot sb() {
        SpringBoot sb = new SpringBoot();
        return sb;
    }
}
