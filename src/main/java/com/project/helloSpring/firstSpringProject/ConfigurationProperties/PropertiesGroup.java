package com.project.helloSpring.firstSpringProject.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component //lub @EnableConfigurationProperties(PropertiesGroup.class)
@ConfigurationProperties(prefix = "pl.sdacademy.group")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertiesGroup {

    private String propA;
    private Integer propB;
}
