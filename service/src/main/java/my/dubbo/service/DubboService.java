
package my.dubbo.service;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@DubboComponentScan("my.dubbo.service")
public class DubboService {

    public static void main(String[] args) {
        SpringApplication.run(DubboService.class, args);
    }
}
