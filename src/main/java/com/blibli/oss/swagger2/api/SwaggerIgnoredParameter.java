package com.blibli.oss.swagger2.api;

import java.lang.reflect.Parameter;

public interface SwaggerIgnoredParameter {

  boolean isIgnored(Parameter parameter);

}
