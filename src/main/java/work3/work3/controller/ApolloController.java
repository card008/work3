package work3.work3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {
    @Value("apolloKey")
    private String apolloKey;

    @RequestMapping("/apollo")
    public String apollo() {
        System.out.println("apolloConfig.apolloKey======="+apolloKey);
        return apolloKey;
    }
}
