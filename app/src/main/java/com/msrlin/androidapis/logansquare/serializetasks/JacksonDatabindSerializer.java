package com.msrlin.androidapis.logansquare.serializetasks;

import com.msrlin.androidapis.logansquare.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDatabindSerializer extends Serializer {

    private final ObjectMapper objectMapper;

    public JacksonDatabindSerializer(SerializeListener parseListener, Response response, ObjectMapper objectMapper) {
        super(parseListener, response);
        this.objectMapper = objectMapper;
    }

    @Override
    protected String serialize(Response response) {
        try {
            return objectMapper.writeValueAsString(response);
        } catch (Exception e) {
            return null;
        } finally {
            System.gc();
        }
    }
}
