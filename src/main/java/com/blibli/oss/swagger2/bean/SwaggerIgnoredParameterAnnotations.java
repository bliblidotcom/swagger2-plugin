package com.blibli.oss.swagger2.bean;

import com.blibli.oss.swagger2.api.SwaggerIgnoredParameter;
import lombok.Setter;
import org.springdoc.core.IgnoredParameterAnnotations;

import java.lang.reflect.Parameter;
import java.util.List;

public class SwaggerIgnoredParameterAnnotations implements IgnoredParameterAnnotations {

  @Setter
  private List<SwaggerIgnoredParameter> parameters;

  @Override
  public boolean isAnnotationToIgnore(Parameter parameter) {
    for (SwaggerIgnoredParameter ignoredParameter : parameters) {
      if (ignoredParameter.isIgnored(parameter)) {
        return true;
      }
    }
    return false;
  }
}
