package com.book.addressbook.model;

import java.io.Serializable;
import java.util.List;

public class AddressBook implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bookName;
    private List<Contact> contacts;
    
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	@Override
	public String toString() {
		return "AddressBook [bookName=" + bookName + ", contacts=" + contacts + "]";
	}     

}
