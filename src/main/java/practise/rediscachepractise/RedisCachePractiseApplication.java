package practise.rediscachepractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisCachePractiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCachePractiseApplication.class, args);
    }

}
