package com.example.book.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.book.entity.AddressEntity;

@Repository
public interface AddressRepostory extends JpaRepository<AddressEntity, Long> {

}
