package com.learning.springmongodb.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "service.downstream")
public class DownstreamProperties {
    private String url;
    private Long connectTimeout;
    private Long readTimeout;
}
