package com.book.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.addressbook.model.AddressBook;
import com.book.addressbook.model.Contact;
import com.book.addressbook.service.impl.AddressBookServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/address-book")
@Api(value = "Address Book Service")
public class AddressBookController {

	@Autowired
	private AddressBookServiceImpl addressBookService;
	
	@PostMapping("/book")
	@ApiOperation(value = "store address book api")
	public ResponseEntity<List<Contact>> addBook(@RequestBody AddressBook addressBook) {
		List<Contact> contactList= addressBookService.addAndReturnAddress(addressBook);
		
		return new ResponseEntity<>(contactList, HttpStatus.OK);
	}
}
