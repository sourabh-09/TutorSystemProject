package com.cjc.ParentProxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient("parent-service")
@Component
public interface ParentServiceProxy {

}
