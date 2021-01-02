package com.dsc.rankmakers;

import com.dsc.rankmakers.domain.security.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class RankMakersWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RankMakersWebApplication.class, args);
    }

}
