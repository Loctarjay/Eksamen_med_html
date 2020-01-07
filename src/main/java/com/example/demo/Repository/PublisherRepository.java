package com.example.demo.Repository;

import com.example.demo.Model.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.concurrent.Flow;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
