package com.blibli.oss.swagger2.example;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;

import java.lang.annotation.*;

@Parameters({
  @Parameter(name = "headerServiceId", ref = "headerServiceId"),
  @Parameter(name = "headerUserId", ref = "headerUserId"),
  @Parameter(name = "headerRequestId", ref = "headerRequestId"),
  @Parameter(name = "headerStoreId", ref = "headerStoreId")
})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
public @interface MandatoryParamAtHeader {
}
