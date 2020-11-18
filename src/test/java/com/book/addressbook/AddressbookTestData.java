package com.book.addressbook;

import java.util.ArrayList;
import java.util.List;

import com.book.addressbook.model.AddressBook;
import com.book.addressbook.model.Contact;

public class AddressbookTestData {

	public static AddressBook getAddressBook1MockData() {
		AddressBook addressBook = new AddressBook();
		List<Contact> contactList = new ArrayList<>();
		Contact contact1 = new Contact("Ram", "8060454658");
		Contact contact2 = new Contact("Anil", "9856232466");
		Contact contact3 = new Contact("Jenny", "7523659878");
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		addressBook.setBookName("book1");
		addressBook.setContacts(contactList);
		return addressBook;
	}
	
	public static AddressBook getAddressBook2MockData() {
		AddressBook addressBook = new AddressBook();
		List<Contact> contactList = new ArrayList<>();
		Contact contact1 = new Contact("Jyotirmoy", "8060454658");
		Contact contact2 = new Contact("Anil", "9856232466");
		Contact contact3 = new Contact("Jenny", "7523659878");
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		addressBook.setBookName("book2");
		addressBook.setContacts(contactList);
		return addressBook;
	}

}
