package com.draconomicon.api.service;

import com.draconomicon.api.model.*;
import java.util.List;

public interface MessageService {
	Message creer(Message message);
	
	List<Message> lire();
	
	Message modifier(Long id_message, Message message);
	
	String supprimer(Long id_message);
}