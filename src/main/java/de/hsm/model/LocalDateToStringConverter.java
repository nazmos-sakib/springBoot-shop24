package de.hsm.model;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class LocalDateToStringConverter implements Converter<LocalDate, String>{

    @Override
    public String convert(LocalDate date) {
        if (date != null) {
        	return date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear();
        }
        return "";
    }


}
