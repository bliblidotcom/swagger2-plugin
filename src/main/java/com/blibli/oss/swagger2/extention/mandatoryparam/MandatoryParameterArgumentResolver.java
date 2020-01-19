package com.blibli.oss.swagger2.extention.mandatoryparam;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.BindingContext;
import org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class MandatoryParameterArgumentResolver implements HandlerMethodArgumentResolver, MandatoryParameterConstant {

  @Override
  public boolean supportsParameter(MethodParameter parameter) {
    return MandatoryParameter.class.isAssignableFrom(parameter.getParameterType());
  }

  @Override
  public Mono<Object> resolveArgument(MethodParameter parameter, BindingContext bindingContext, ServerWebExchange exchange) {
    return Mono.fromCallable(() -> {
      ServerHttpRequest request = exchange.getRequest();
      HttpHeaders headers = request.getHeaders();
      MultiValueMap<String, String> queryParams = request.getQueryParams();

      return MandatoryParameter.builder()
        .storeId(getValue(headers, queryParams, STORE_ID))
        .channelId(getValue(headers, queryParams, CHANNEL_ID))
        .clientId(getValue(headers, queryParams, CLIENT_ID))
        .username(getValue(headers, queryParams, USERNAME))
        .requestId(getValue(headers, queryParams, REQUEST_ID))
        .build();
    });
  }

  private String getValue(HttpHeaders headers, MultiValueMap<String, String> queryParams, String key) {
    return StringUtils.isEmpty(headers.getFirst(key)) ? queryParams.getFirst(key) : headers.getFirst(key);
  }
}
