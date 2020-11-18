package com.book.addressbook;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.book.addressbook.model.Contact;
import com.book.addressbook.service.impl.AddressBookServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressbookApplicationTest {

	@InjectMocks
	private AddressBookServiceImpl addressBookService;
	
	@Test
	public void contextLoads() {}
	
	@Test
	public void addAndReturnAddressTest() {
		addressBookService.saveAddressBook(AddressbookTestData.getAddressBook1MockData());
		addressBookService.saveAddressBook(AddressbookTestData.getAddressBook2MockData());
		List<Contact> testContacts = addressBookService.getAddressBooks(AddressBookServiceImpl.addressList);		
		Assert.assertEquals(2, testContacts.size());		
	}

}
