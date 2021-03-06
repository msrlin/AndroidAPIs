package com.msrlin.androidapis.logansquare.serializetasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.msrlin.androidapis.logansquare.model.Response;

public class LoganSquareSerializer extends Serializer {

    public LoganSquareSerializer(SerializeListener parseListener, Response response) {
        super(parseListener, response);
    }

    @Override
    protected String serialize(Response response) {
        try {
            return LoganSquare.serialize(response);
        } catch (Exception e) {
            return null;
        } finally {
            System.gc();
        }
    }
}
