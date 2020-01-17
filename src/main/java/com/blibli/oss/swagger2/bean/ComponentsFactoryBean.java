package com.blibli.oss.swagger2.bean;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.parameters.Parameter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

public class ComponentsFactoryBean implements FactoryBean<Components>, ApplicationContextAware {

  @Setter
  private ApplicationContext applicationContext;

  @Override
  public Components getObject() throws Exception {
    Components components = new Components();

    Map<String, Parameter> parameters = applicationContext.getBeansOfType(Parameter.class);
    parameters.forEach(components::addParameters);

    return components;
  }

  @Override
  public Class<?> getObjectType() {
    return Components.class;
  }
}
