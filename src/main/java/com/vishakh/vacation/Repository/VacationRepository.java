package com.vishakh.vacation.Repository;


import com.vishakh.vacation.Entity.VacationDetails;
import org.springframework.data.repository.CrudRepository;

public interface VacationRepository extends CrudRepository<VacationDetails, Integer> {

}
