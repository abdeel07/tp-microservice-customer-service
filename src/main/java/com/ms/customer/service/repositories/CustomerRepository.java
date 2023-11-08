package com.ms.customer.service.repositories;

import com.ms.customer.service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
