package com.blibli.oss.swagger2.extention.mandatoryparam;

import com.blibli.oss.swagger2.api.SwaggerIgnoredParameter;

import java.lang.reflect.Parameter;

public class MandatoryParameterSwaggerIgnoredParameter implements SwaggerIgnoredParameter {

  @Override
  public boolean isIgnored(Parameter parameter) {
    return MandatoryParameter.class.isAssignableFrom(parameter.getType());
  }
}
