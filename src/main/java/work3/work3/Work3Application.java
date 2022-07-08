package work3.work3;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import work3.work3.Interface.Sink;
import work3.work3.Interface.Source;

@EnableBinding(value = {Source.class, Sink.class})
@EnableApolloConfig
@EnableEurekaClient
@SpringBootApplication
public class Work3Application {

    public static void main(String[] args) {
        SpringApplication.run(Work3Application.class, args);
    }

}
