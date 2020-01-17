package com.blibli.oss.swagger2.extention.mandatoryparam;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;

import java.lang.annotation.*;

@Parameters({
  @Parameter(name = "headerStoreId", ref = "headerStoreId"),
  @Parameter(name = "headerClientId", ref = "headerClientId"),
  @Parameter(name = "headerChannelId", ref = "headerChannelId"),
  @Parameter(name = "headerUsername", ref = "headerUsername"),
  @Parameter(name = "headerRequestId", ref = "headerRequestId")
})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
public @interface MandatoryParamAtHeader {
}
