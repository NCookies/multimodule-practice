package com.ncookie.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (
        // 컴포넌트 스캔이 이루어질 패키지를 명시
        scanBasePackages = { "com.ncookie.moduleapi", "com.ncookie.modulecommon" }
)
@EntityScan("com.ncookie.modulecommon.domain")
@EnableJpaRepositories(basePackages = "com.ncookie.modulecommon.repository")
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
