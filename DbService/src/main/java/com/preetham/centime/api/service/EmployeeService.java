package com.preetham.centime.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preetham.centime.api.dto.DEmployeeDTO;
import com.preetham.centime.api.dto.EmployeeDTO;
import com.preetham.centime.api.entity.Employee;
import com.preetham.centime.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
    @Autowired
    private EmployeeRepository employeeRepo;
    
    private ModelMapper modelmapper = new ModelMapper();

	public EmployeeDTO getEmployeeById(Long id) {
		Optional<Employee> e = employeeRepo.findById(id);
    	EmployeeDTO dto = null;
    	if(e.isPresent()) {
    		dto=modelmapper.map(e.get(), EmployeeDTO.class);
    	}
    	return dto;
	}

	public List<EmployeeDTO> getAllEmployees() {
		List<Employee> empList = employeeRepo.findAll();  
    	List<EmployeeDTO> returnList = new ArrayList<>();
    	empList.forEach( e-> {
        			returnList.add(modelmapper.map(e, EmployeeDTO.class));
        	});
    	return returnList ;
	}
	
	public List<DEmployeeDTO> getAllDEmployees() {
		List<Employee> empList = employeeRepo.findAll();
    	
    	List<DEmployeeDTO> returnList = new ArrayList<>();
    	
    	
    	empList.forEach( e-> {
   		if(e != null && (e.getParent()!= null && e.getParent().getName().equals("ceo")))
    			returnList.add(modelmapper.map(e, DEmployeeDTO.class));
    	});
    	      
    	
    	return returnList ;
	}

}
