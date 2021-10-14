package ir.omidashouri.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"ir.omidashouri.common.entity"}) // we can also use: @EnableJpaRepositories("ir.omidashouri.common.entity")
@SpringBootApplication
public class ShopmeBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmeBackEndApplication.class, args);
    }

}
