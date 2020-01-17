package com.blibli.oss.swagger2.example;

import io.swagger.v3.oas.models.parameters.HeaderParameter;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

  @Bean
  public Parameter headerServiceId() {
    return new HeaderParameter()
      .name("X-Service-Id")
      .example("SERVICE_ID")
      .required(true);
  }

  @Bean
  public Parameter headerUserId() {
    return new HeaderParameter()
      .name("X-User-Id")
      .example("USER_ID")
      .required(true);
  }

  @Bean
  public Parameter headerRequestId() {
    return new HeaderParameter()
      .name("X-Request-Id")
      .example("REQUEST_ID")
      .required(true);
  }

  @Bean
  public Parameter headerStoreId() {
    return new HeaderParameter()
      .name("X-Store-Id")
      .example("STORE_ID")
      .required(true);
  }

}
