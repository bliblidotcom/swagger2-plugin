package com.blibli.oss.swagger2.extention.mandatoryparam;

import io.swagger.v3.oas.models.parameters.HeaderParameter;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.QueryParameter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MandatoryParamConfiguration {

  @Configuration
  public static class MandatoryParamAtQueryConfiguration {

    @Bean
    public Parameter queryChannelId() {
      return new QueryParameter()
        .name("channelId")
        .example("channelId")
        .required(true);
    }

    @Bean
    public Parameter queryUsername() {
      return new QueryParameter()
        .name("username")
        .example("username")
        .required(true);
    }

    @Bean
    public Parameter queryRequestId() {
      return new QueryParameter()
        .name("requestId")
        .example("requestId")
        .required(true);
    }

    @Bean
    public Parameter queryStoreId() {
      return new QueryParameter()
        .name("storeId")
        .example("10001")
        .required(true);
    }

    @Bean
    public Parameter queryClientId() {
      return new QueryParameter()
        .name("clientId")
        .example("clientId")
        .required(true);
    }
  }

  @Configuration
  public static class MandatoryParamAtHeaderConfiguration {

    @Bean
    public Parameter headerChannelId() {
      return new HeaderParameter()
        .name("channelId")
        .example("channelId")
        .required(true);
    }

    @Bean
    public Parameter headerUsername() {
      return new HeaderParameter()
        .name("username")
        .example("username")
        .required(true);
    }

    @Bean
    public Parameter headerRequestId() {
      return new HeaderParameter()
        .name("requestId")
        .example("requestId")
        .required(true);
    }

    @Bean
    public Parameter headerStoreId() {
      return new HeaderParameter()
        .name("storeId")
        .example("10001")
        .required(true);
    }

    @Bean
    public Parameter headerClientId() {
      return new HeaderParameter()
        .name("clientId")
        .example("clientId")
        .required(true);
    }

  }

}
