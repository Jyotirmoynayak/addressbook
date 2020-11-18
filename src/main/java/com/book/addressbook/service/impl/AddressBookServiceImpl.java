package com.book.addressbook.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.book.addressbook.model.AddressBook;
import com.book.addressbook.model.Contact;

@Service
public class AddressBookServiceImpl {
	
	public static List<AddressBook> addressList = new ArrayList<>();

    public List<Contact> addAndReturnAddress(AddressBook addressBook) {
        saveAddressBook(addressBook);
        return getAddressBooks(addressList);
    }    
    
    public void saveAddressBook(AddressBook book) {
    	if(!book.getBookName().isEmpty()) {
    		addressList.add(book);
    	}
    }
    
    public List<Contact> getAddressBooks(List<AddressBook> addressList) {
    	
    	List<Contact> allContactList = addressList.stream().flatMap(addressBook -> addressBook.getContacts().stream())
    											.sorted(Comparator.comparing(Contact::getName))
    											.collect(Collectors.toList());
    	
    	Set<Contact> duplicateContacts = allContactList.stream().filter(contact -> Collections.frequency(allContactList, contact) > 1)
    										.collect(Collectors.toSet());
    			
    	allContactList.removeAll(duplicateContacts);	
    	
    	return allContactList;
    }

}
