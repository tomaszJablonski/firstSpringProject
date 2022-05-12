package com.project.helloSpring.firstSpringProject.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "sda.collections")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfigurationWithCollections {

    private List<String> username;
    private Map<String, Integer> values;


}
