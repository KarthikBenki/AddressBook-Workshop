package com.addressbook;

import java.util.ArrayList;
import java.util.List;
/*
    @purpose:Address Book computation
    @Author: Karthik M C
 */
public class AddressBook {
    static List<Contact> addressBookList = new ArrayList<Contact>();
    /*
    ability to add contact in addressbook
     */
    public void addContact(Contact contacts) {
        addressBookList.add(contacts);
    }

    /*
    ability to get contact list from addressbook list
     */
    public List<Contact> getcontactList() {
        return addressBookList;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to addressbook Creation");
    }
}
