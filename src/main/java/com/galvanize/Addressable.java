package com.galvanize;

import java.util.List;

/**
 * Created by June on 3/4/17.
 */
public interface Addressable {

    List<Address> getAddresses();

    void addAddress(Address address);
}
