package com.example.msrlin.androidapis.logansquare.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Friend {

    @JsonField
    public int id;

    @JsonField
    public String name;
}
