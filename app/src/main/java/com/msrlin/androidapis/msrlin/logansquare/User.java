package com.msrlin.androidapis.msrlin.logansquare;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.msrlin.androidapis.logansquare.model.Friend;
import com.msrlin.androidapis.logansquare.model.Image;
import com.msrlin.androidapis.logansquare.model.Name;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonObject
public class User {

    @SerializedName("_id") // Annotation needed for GSON
    @JsonProperty("_id")
    @JsonField(name = "_id")
    public String id;

    @JsonField
    public int index;

    @JsonField
    public String guid;

    @SerializedName("is_active") // Annotation needed for GSON
    @JsonProperty("is_active") // Annotation needed for Jackson Databind
    @JsonField(name = "is_active")
    public boolean isActive;

    @JsonField
    public String balance;

    @JsonField(name = "picture")
    public String pictureUrl;

    @JsonField
    public int age;

    @JsonField
    public Name name;

    @JsonField
    public String company;

    @JsonField
    public String email;

    @JsonField
    public String address;

    @JsonField
    public String about;

    @JsonField
    public String registered;

    @JsonField
    public double latitude;

    @JsonField
    public double longitude;

    @JsonField
    public List<String> tags;

    @JsonField
    public List<Integer> range;

    @JsonField
    public List<Friend> friends;

    @JsonField
    public List<Image> images;

    @JsonField
    public String greeting;

    @SerializedName("favorite_fruit") // Annotation needed for GSON
    @JsonProperty("favorite_fruit") // Annotation needed for Jackson Databind
    @JsonField(name = "favorite_fruit")
    public String favoriteFruit;

    @SerializedName("eye_color") // Annotation needed for GSON
    @JsonProperty("eye_color") // Annotation needed for Jackson Databind
    @JsonField(name = "eye_color")
    public String eyeColor;

    @JsonField
    public String phone;
}