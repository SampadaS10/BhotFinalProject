package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;




public interface TestRepo extends CrudRepository<com.example.demo.Entity.TestEntity, Integer>
{

}
