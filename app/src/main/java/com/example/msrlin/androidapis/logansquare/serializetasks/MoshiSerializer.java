package com.example.msrlin.androidapis.logansquare.serializetasks;

import com.example.msrlin.androidapis.logansquare.model.Response;
import com.squareup.moshi.Moshi;

public class MoshiSerializer extends Serializer {

    private final Moshi moshi;

    public MoshiSerializer(Serializer.SerializeListener parseListener, Response response, Moshi moshi) {
        super(parseListener, response);
        this.moshi = moshi;
    }

    @Override
    protected String serialize(Response response) {
        try {
            return moshi.adapter(Response.class).toJson(response);
        } catch (Exception e) {
            return null;
        } finally {
           System.gc();
        }
    }

}
