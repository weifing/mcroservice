package com.pccw.springcloud;

import com.pccw.springcloud.pojo.CommonResult;
import com.pccw.springcloud.pojo.Payment;
import com.pccw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
* 提供restful服务，供其他服务调用
* */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    //注入服务发现的注解
    @Autowired
    private DiscoveryClient discoveryClient;

    //获取服务信息
    @GetMapping("/payment/discovery")
    public  Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String s : services){
            log.info("********注册到eureka中的服务中有:"+services);
        }
        List <ServiceInstance> instances = discoveryClient.getInstances("MCROSERVICE-PAYMENT");
        for (ServiceInstance s: instances) {
            log.info("当前服务的实例有"+s.getServiceId()+"\t"+s.getHost()+"\t"+s.getPort()+"\t"+s.getUri());
        }
        return this.discoveryClient;
    }

    @RequestMapping("/payment/creat")
    public CommonResult creat(@RequestBody Payment dept){
      int i =  paymentService.creat(dept);
      log.info("***************插入成功********************"+i);
      if(i > 0){
          return new CommonResult(200, "插入数据库成功:"+ port, i);
      }else {
          return new CommonResult(500, "插入数据库失败:"+ port, null);
      }
    }

    @GetMapping("payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = paymentService.queryById(id);
        log.info("****************查询成功*******************"+payment);
        if(payment != null){
            return  new CommonResult(200, "查询数据库成功"+ port, payment);
        }else {
            return new CommonResult(500, "查询数据库失败", null);
        }
    }

    //模拟业务接口延时3秒
    @GetMapping("/payment/feign/timeout")
    public String PaymentFeignTimeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return port;
    }

    @GetMapping("/payment/lb")
    public String PaymentLb() throws InterruptedException {
        return port;
    }
}
