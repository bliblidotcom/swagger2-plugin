package com.blibli.oss.swagger2.bean;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

public class OpenAPIFactoryBean implements FactoryBean<OpenAPI> {

  @Setter
  private Components components;

  @Override
  public OpenAPI getObject() throws Exception {
    OpenAPI openAPI = new OpenAPI();

    openAPI.setComponents(components);

    return openAPI;
  }

  @Override
  public Class<?> getObjectType() {
    return OpenAPI.class;
  }
}
