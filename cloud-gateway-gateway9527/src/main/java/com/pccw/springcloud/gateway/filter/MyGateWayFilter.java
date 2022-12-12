package com.pccw.springcloud.gateway.filter;

import io.netty.util.internal.StringUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Component
@Slf4j
public class MyGateWayFilter implements GlobalFilter, Ordered {
    //配置过滤，访问是需要指定一个用户名才可以访问
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
      /*  log.info("********* com in mygatewayfilter ******" + new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        //非法用户不可访问
        if(StringUtil.isNullOrEmpty(uname)){
            log.info("****** uname为null,是非法用户");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }*/
        //合法用户进入下一个过滤连
        return chain.filter(exchange);
    }

    //这个0数字代表加载过滤器的顺序，就是越小优先级越高，因为是全局的，所以必须是第一位的。
    @Override
    public int getOrder() {
        return 0;
    }
}
