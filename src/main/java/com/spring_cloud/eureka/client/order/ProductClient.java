package com.spring_cloud.eureka.client.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// product-service: ProductApplication 의 application.yml 에서 지정
@FeignClient(name = "product-service")
// product-service 라는 식별자를 가지고 Eureka 에서 찾아서 호출 한다.
public interface ProductClient {

  @GetMapping("/product/{id}")
  String getProduct(
          @PathVariable("id")
          String id
  );

}
