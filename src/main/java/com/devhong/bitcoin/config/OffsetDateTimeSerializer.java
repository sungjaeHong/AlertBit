package com.devhong.bitcoin.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by devHong on 2017. 12. 9..
 */
@Component
public class OffsetDateTimeSerializer extends JsonSerializer<OffsetDateTime> {

    @Override
    public void serialize(OffsetDateTime value, JsonGenerator gen, SerializerProvider arg2) throws IOException, DateTimeException {
        String result = StringUtils.EMPTY;
        try {
            result = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(value);
        } catch (DateTimeException e) {
            result = DateTimeFormatter.ISO_INSTANT.format(value);
        }
        gen.writeString(result);
    }
}
