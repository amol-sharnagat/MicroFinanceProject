package com.app.mfi.master.main.homerepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.mfi.master.main.model.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status	, Integer> {

}
