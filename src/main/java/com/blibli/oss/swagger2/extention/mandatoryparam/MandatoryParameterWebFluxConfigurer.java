package com.blibli.oss.swagger2.extention.mandatoryparam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.result.method.annotation.ArgumentResolverConfigurer;

@Configuration
public class MandatoryParameterWebFluxConfigurer implements WebFluxConfigurer {

  @Autowired
  private MandatoryParameterArgumentResolver mandatoryParameterArgumentResolver;

  @Override
  public void configureArgumentResolvers(ArgumentResolverConfigurer configurer) {
    configurer.addCustomResolver(mandatoryParameterArgumentResolver);
  }
}
