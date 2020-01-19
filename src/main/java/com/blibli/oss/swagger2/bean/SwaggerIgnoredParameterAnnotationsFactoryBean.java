package com.blibli.oss.swagger2.bean;

import com.blibli.oss.swagger2.api.SwaggerIgnoredParameter;
import lombok.Setter;
import org.springdoc.core.IgnoredParameterAnnotations;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;

public class SwaggerIgnoredParameterAnnotationsFactoryBean implements FactoryBean<IgnoredParameterAnnotations>, ApplicationContextAware {

  @Setter
  private ApplicationContext applicationContext;

  @Override
  public IgnoredParameterAnnotations getObject() throws Exception {
    SwaggerIgnoredParameterAnnotations ignoredParameter = new SwaggerIgnoredParameterAnnotations();
    ignoredParameter.setParameters(new ArrayList<>(applicationContext.getBeansOfType(SwaggerIgnoredParameter.class).values()));
    return ignoredParameter;
  }

  @Override
  public Class<?> getObjectType() {
    return IgnoredParameterAnnotations.class;
  }

}
