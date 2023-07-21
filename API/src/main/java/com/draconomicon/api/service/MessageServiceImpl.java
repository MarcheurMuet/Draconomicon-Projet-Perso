package com.draconomicon.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.draconomicon.api.model.Message;
import com.draconomicon.api.repository.MessageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService{

	private MessageRepository messageRepository;
	
	@Override
	public Message creer(Message message) {
		return messageRepository.save(message);
	}

	@Override
	public List<Message> lire() {
		return messageRepository.findAll();
	}

	@Override
	public Message modifier(Long id_message, Message message) {
		return messageRepository.findById(id_message)
				.map(p-> {
					p.setTitre(message.getTitre());
					p.setMessage(message.getMessage());
					// p.setDatePost(message.getDatePost());
					p.setIdTopic(message.getIdTopic());
					p.setIdProfil(message.getIdProfil());
					return messageRepository.save(p); 			
				}).orElseThrow(() -> new RuntimeException("Espèce non trouvé"));
	}

	@Override
	public String supprimer(Long id_message) {
		messageRepository.deleteById(id_message);
		return "Message supprimé";
	}

}
