package com.draconomicon.api.repository;

import com.draconomicon.api.model.Dragon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DragonRepository extends JpaRepository<Dragon, Long> {
}
