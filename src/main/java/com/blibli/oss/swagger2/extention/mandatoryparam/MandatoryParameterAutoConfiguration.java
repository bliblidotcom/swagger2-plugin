package com.blibli.oss.swagger2.extention.mandatoryparam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MandatoryParameterAutoConfiguration {

  @Bean
  public MandatoryParameterSwaggerIgnoredParameter mandatoryParameterSwaggerIgnoredParameter() {
    return new MandatoryParameterSwaggerIgnoredParameter();
  }

}
