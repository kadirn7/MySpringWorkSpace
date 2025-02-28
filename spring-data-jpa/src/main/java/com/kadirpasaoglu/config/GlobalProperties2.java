package com.kadirpasaoglu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.List;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "app")
public class GlobalProperties2{
    
    private List<Server> servers;
    @Value("${key}")
    private String key;
}