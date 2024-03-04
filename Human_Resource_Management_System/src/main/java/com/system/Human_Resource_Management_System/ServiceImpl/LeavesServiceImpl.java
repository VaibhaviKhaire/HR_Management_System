package com.system.Human_Resource_Management_System.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.Human_Resource_Management_System.Model.Leaves;

import com.system.Human_Resource_Management_System.Repository.LeavesRepository;

import com.system.Human_Resource_Management_System.Service.LeavesService;

@Service
public class LeavesServiceImpl implements LeavesService{
	
	@Autowired
	private LeavesRepository leavesRepository;
	
	
	public LeavesServiceImpl(LeavesRepository leavesRepository) {
		super();
		this.leavesRepository = leavesRepository;
	}

	@Override
	public List<Leaves> getAllLeaves() {
		return leavesRepository.findAll();
	}

	@Override
	public void saveLeaves(Leaves leaves) {
		this.leavesRepository.save(leaves);
	}

	@Override
	public Leaves getLeavesById(long id) {
	    return leavesRepository.findById(id)
	                             .orElseThrow(() -> new RuntimeException("Employee leaves not found for id :: " + id));
	}


	@Override
	public void deleteLeavesById(long id) {
		this.leavesRepository.deleteById(id);
	}

}

