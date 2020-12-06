package ru.job4j.stream.address;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Profile(Address address) {
        this.address = address;
    }

    public List<Address> collect(List<Profile> profiles) {
        Comparator<Address> comparator = new ComparatorAddress();
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(comparator)
                .distinct()
                .collect(Collectors.toList());
    }
}
