package com.addressbook;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class AddressBookTest {
    public static AddressBook addressBook;

    @BeforeClass
    public static void init(){
        addressBook = new AddressBook();
        System.out.println("Welcome to the Address Book System");
    }
    @Test
    public void givenAContact_IfMatchesWithTheListReturnTrue() {
        Contact contacts = new Contact("Karthik","Benki","Challakere","Chitradurga","Karnataka","577522","7411949218","karthikmc007@gmail.com");
        addressBook.addContact(contacts);
        List<Contact> addressBookList = addressBook.getcontactList();
        Assert.assertTrue(addressBookList.contains(contacts));
    }

    @Test
    public void givenAContact_IfNotMatchesWithTheListReturnFalse() {
        Contact contacts = new Contact("Karthik","Benki","Challakere","Chitradurga","Karnataka","577522","7411949218","karthikmc007@gmail.com");
        Contact contacts1 = new Contact("Karthik","Benki","Mannekote","Chitradurga","Karnataka","577522","7411949218","karthikmc007@gmail.com");
        addressBook.addContact(contacts);
        List<Contact> addressBookList = addressBook.getcontactList();
        Assert.assertFalse(addressBookList.contains(contacts1));
    }
}
