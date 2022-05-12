package com.project.helloSpring.firstSpringProject.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Profile("dev") // tylko dla profilu dev
@Component
public class DevDateFormatProvider implements DateFormatProvider {
    @Override
    public DateFormat get() {
        return new SimpleDateFormat();
    }
}
