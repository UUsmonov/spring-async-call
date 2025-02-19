package com.uusmonov.challenge.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "webclient")
public class ClientProperties {
    @NestedConfigurationProperty
    private BasePath basePath;
    @NestedConfigurationProperty
    private Timeout timeout;
}

@Data
class BasePath {
    private String usersUrl;
    private String postsUrl;
}

@Data
class Timeout {
    private int connect;
    private int read;
    private int write;
    private int response;
}
