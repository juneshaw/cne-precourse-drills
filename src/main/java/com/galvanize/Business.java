package com.galvanize;

import java.util.ArrayList;

public class Business implements Addressable {

    private String name;
    private ArrayList<Address> addresses;

    public Business(String newName) {
        name = newName;
        addresses = new ArrayList();
    }

    public ArrayList getAddresses() {
        return addresses;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public String getName() {
        return name;
    }
}
