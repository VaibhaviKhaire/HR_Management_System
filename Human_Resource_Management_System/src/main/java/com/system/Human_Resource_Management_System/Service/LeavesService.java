package com.system.Human_Resource_Management_System.Service;

import java.util.List;


import com.system.Human_Resource_Management_System.Model.Leaves;

public interface LeavesService {
	List<Leaves> getAllLeaves();
	void saveLeaves(Leaves leaves);
	Leaves getLeavesById(long id);
	void deleteLeavesById(long id);
}
