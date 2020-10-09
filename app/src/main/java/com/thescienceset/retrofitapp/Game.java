package com.thescienceset.retrofitapp;

import com.google.gson.annotations.SerializedName;

public class Game {
    @SerializedName("id")
    int id;

    @SerializedName("name")
    String name;

    @SerializedName("popularity")
    double popularity;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPopularity() {
        return popularity;
    }
}
