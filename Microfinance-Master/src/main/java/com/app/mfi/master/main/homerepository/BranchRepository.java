package com.app.mfi.master.main.homerepository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.mfi.master.main.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

	

	
}
