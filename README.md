# Swagger Plugin for Spring Boot 2 WebFlux

This is plugin integrate swagger on Spring Boot 2 WebFlux project. This project is not working on Spring Web MVC. 

## How to use it

Add dependency

```xml
<dependency>
  <groupId>com.blibli.oss</groupId>
  <artifactId>swagger-plugin2</artifactId>
  <version>...</version>
</dependency>
```

And this plugin will automatically scan all your controller

You can access your swagger ui on `http://localhost:8080/swagger-ui.html`

## Global Parameter

Sometimes you want to add global parameter (configure once, and use everywhere). You can use this by register your custom `io.swagger.v3.oas.models.parameters.Parameter` bean. Example :

```java
@Configuration
public class YourConfiguration {
  
  @Bean
  public Parameter queryChannelId() {
    return new QueryParameter()
      .name("channelId")
      .example("channelId")
      .required(true);
  }

} 
```

After that, you can use your parameter using `@io.swagger.v3.oas.annotations.Parameter(name="uniqueName", ref="beanName")` annotation, example :

```java
@RestController
public class ExampleController {

  @GetMapping("/")
  @Parameter(name = "queryChannelId", ref = "queryChannelId")
  public Mono<String> home() {
    return Mono.just("Home");
  }

}
```   

## Ignore Parameter