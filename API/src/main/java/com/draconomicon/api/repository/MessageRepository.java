package com.draconomicon.api.repository;

import com.draconomicon.api.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

}