
package my.dubbo.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import my.dubbo.service.test.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDubbo
public class DubboClient {


    @Reference
    private Test test;


    @RequestMapping("/hello")
    public String hello() {
        return test.hello();
    }

    public static void main(String[] args) {

        SpringApplication.run(DubboClient.class, args);

    }

}
