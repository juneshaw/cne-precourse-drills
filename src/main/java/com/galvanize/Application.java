package com.galvanize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import main.java.com.galvanize.Address;

public class Application {

    public static void main(String[] args) {
        Gson builder = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        JsonObject object = new JsonObject();

        System.getProperties().stringPropertyNames().iterator().forEachRemaining(propertyName ->
                object.addProperty(propertyName, System.getProperty(propertyName))
        );

        System.out.println(builder.toJson(object));

        demoAddress();
    }

    private static void demoAddress() {
        Address address = new Address("16 Laniuma Loop", "Honolulu", "HI", "96818");
        System.out.println(address);
    }
}
