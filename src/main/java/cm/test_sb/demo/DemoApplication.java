package cm.test_sb.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//相当于@Configuration、@EnableAutoConfiguration、@ComponentScan这三个注解的组合
//其中，@EnableAutoConfiguration 让 Spring Boot 根据类路径中的 jar 包依赖为当前项目进行自动配置(即：自动配置jar包所依赖的jar包)
//注：Spring Boot 还会自动扫描 @SpringBootApplication 所在类的同级包以及下级包里的 Bean

//入口类（建议：配置在 grounpID + arctifactID 组合的包名下）
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
