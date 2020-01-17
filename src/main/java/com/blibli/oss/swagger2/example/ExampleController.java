package com.blibli.oss.swagger2.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@MandatoryParamAtHeader
public class ExampleController {

  @GetMapping("/")
  public Mono<String> home() {
    return Mono.just("Home");
  }

  @GetMapping("/hello")
  public Mono<String> hello() {
    return Mono.just("Hello");
  }

}
