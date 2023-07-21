package com.draconomicon.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.draconomicon.api.model.Message;
import com.draconomicon.api.service.MessageService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/message")
@AllArgsConstructor

public class MessageController {
	private MessageService messageService;
	
	@PostMapping()
	public Message create(@RequestBody Message message) {
		return messageService.creer(message);
	}
	
	@GetMapping()
	public List<Message> read(){
		return messageService.lire();
	}
	
	@PutMapping("/{id_message}")
	public Message update(@PathVariable Long id_message, @RequestBody Message message){
		return messageService.modifier(id_message, message);	
	}
	
	@DeleteMapping("/{id_message}")
	public String delete(@PathVariable Long id_message){
		return messageService.supprimer(id_message);
	}
}