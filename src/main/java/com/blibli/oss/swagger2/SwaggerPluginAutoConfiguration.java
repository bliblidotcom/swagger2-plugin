package com.blibli.oss.swagger2;

import com.blibli.oss.swagger2.bean.ComponentsFactoryBean;
import com.blibli.oss.swagger2.bean.OpenAPIFactoryBean;
import io.swagger.v3.oas.models.Components;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerPluginAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public ComponentsFactoryBean components() {
    return new ComponentsFactoryBean();
  }

  @Bean
  @ConditionalOnMissingBean
  public OpenAPIFactoryBean openAPI(Components components) {
    OpenAPIFactoryBean bean = new OpenAPIFactoryBean();
    bean.setComponents(components);
    return bean;
  }

}
