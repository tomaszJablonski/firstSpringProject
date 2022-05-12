package com.project.helloSpring.firstSpringProject.profile;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.text.DateFormat;

@Profile("!dev") //dla wszystkich oprócz profilu dev !!!
@Component
public class ProdDateFormatProvider implements DateFormatProvider {
    @Override
    public DateFormat get() {
        return new StdDateFormat();
    }
}
