package com.array.apparray;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<MyEntity, Integer> {
}
