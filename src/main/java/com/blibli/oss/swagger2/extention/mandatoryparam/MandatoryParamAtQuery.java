package com.blibli.oss.swagger2.extention.mandatoryparam;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;

import java.lang.annotation.*;

@Parameters({
  @Parameter(name = "queryStoreId", ref = "queryStoreId"),
  @Parameter(name = "queryClientId", ref = "queryClientId"),
  @Parameter(name = "queryChannelId", ref = "queryChannelId"),
  @Parameter(name = "queryUsername", ref = "queryUsername"),
  @Parameter(name = "queryRequestId", ref = "queryRequestId")
})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
public @interface MandatoryParamAtQuery {
}
