package com.amh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amh.component.ContactConverter;
import com.amh.entity.Contact;
import com.amh.model.ContactModel;
import com.amh.repository.ContactRepository;
import com.amh.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;
	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact contact = contactRepository.save(contactConverter.convertContactModelToContact(contactModel));
		
		return contactConverter.convertContactToContactModel(contact);
	}

	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		List<ContactModel> contactsModel = new ArrayList<ContactModel>();
		for (Contact contact : contacts) {
			contactsModel.add(contactConverter.convertContactToContactModel(contact));
		}
		return contactsModel;
	}

	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
		
	}
	
	public ContactModel findContactByIdModel(int id){
		return contactConverter.convertContactToContactModel(findContactById(id));
	}

	@Override
	public void removeContact(int id) {
		Contact contact = findContactById(id);
		if (null != contact)
			contactRepository.delete(findContactById(id));
		
		
	}

}
