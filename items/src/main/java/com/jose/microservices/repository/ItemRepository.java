package com.jose.microservices.repository;

import com.jose.microservices.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}


