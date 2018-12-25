package my.dubbo.service.test;


import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = Test.class)
public class TestImpl implements Test {
    @Override
    public String hello() {
        return "hello dubbo!!!!";
    }
}
