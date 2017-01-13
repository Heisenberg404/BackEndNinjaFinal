package com.amh.component;

import org.springframework.stereotype.Component;

import com.amh.entity.Contact;
import com.amh.model.ContactModel;

@Component
public class ContactConverter {
	
	public Contact convertContactModelToContact(ContactModel contacModel){
		Contact contact = new Contact();
		contact.setId(contacModel.getId());
		contact.setFirtsname(contacModel.getFirtsname());
		contact.setLastname(contacModel.getLastname());
		contact.setCity(contacModel.getCity());
		contact.setTelephone(contacModel.getTelephone());
		
		return contact;
		
	}
	
	public ContactModel convertContactToContactModel(Contact contact){
		ContactModel contactModel = new ContactModel();
		contactModel.setId(contact.getId());
		contactModel.setFirtsname(contact.getFirtsname());
		contactModel.setLastname(contact.getLastname());
		contactModel.setCity(contact.getCity());
		contactModel.setTelephone(contact.getTelephone());
		
		return contactModel;
		
	}
}
