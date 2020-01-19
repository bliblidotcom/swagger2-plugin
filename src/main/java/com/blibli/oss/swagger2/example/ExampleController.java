package com.blibli.oss.swagger2.example;

import com.blibli.oss.swagger2.extention.mandatoryparam.MandatoryParameter;
import com.blibli.oss.swagger2.extention.mandatoryparam.MandatoryParameterAtHeader;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@MandatoryParameterAtHeader
public class ExampleController {

  @GetMapping("/")
  public Mono<String> home(MandatoryParameter mandatoryParameter) {
    return Mono.just("Home from " + mandatoryParameter.getStoreId());
  }

  @GetMapping("/hello")
  public Mono<String> hello(MandatoryParameter mandatoryParameter) {
    return Mono.just("Hello from " + mandatoryParameter.getStoreId());
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  public Mono<String> sayHello(MandatoryParameter mandatoryParameter, @RequestBody SayHelloRequest request) {
    return Mono.just("Hello " + request.getName() + " from store id " + mandatoryParameter.getStoreId());
  }

  @Data
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class SayHelloRequest {

    private String name;
  }

}
