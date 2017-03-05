package com.galvanize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Iterator;

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

        demoBusiness();
    }

    private static void demoAddress() {
        System.out.println("Demo Address");

        Address address = new Address("16 Laniuma Loop", "Honolulu", "HI", "96818");
        System.out.println(address);
    }

    private static void demoBusiness() {
        System.out.println("Business Demo");

        Business newBiz = new Business("myBiz");
        Address address1 = new Address("31 Snowshoe Drive", "Evergreen", "CO", "80439");
        Address address2 = new Address("21 21st Street", "Pensacola", "FL", "31313");
        Address address3 = new Address("500 Main Street", "Raleigh", "NC", "11223");
        newBiz.addAddress(address1);
        newBiz.addAddress(address2);
        newBiz.addAddress(address3);

        ArrayList<Address> addresses = newBiz.getAddresses();

//        For loop style
        System.out.println("For loop style");
        for (int i = 0; i < addresses.size(); i++) {
            System.out.println(addresses.get(i));
        }

//        Advance for style
        System.out.println("Advanced for loop style");
        for (Address address : addresses) {
            System.out.println(address);
        }

//        Iterator style
        System.out.println("Iterator style");
        Iterator addressIterator = addresses.iterator();
        while (addressIterator.hasNext()) {
            System.out.println(addressIterator.next());
        }

//        While style
        System.out.println("While style");
        int i = 0;
        while (i < addresses.size()) {
            System.out.println(addresses.get(i));
            i++;
        }

//        Foreach style
        System.out.println("Foreach style");
        addresses.forEach((address) ->
                System.out.println(address));
    }
}

