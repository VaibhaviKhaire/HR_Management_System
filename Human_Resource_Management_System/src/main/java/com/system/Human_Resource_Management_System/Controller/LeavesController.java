package com.system.Human_Resource_Management_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.system.Human_Resource_Management_System.Model.Employee;
import com.system.Human_Resource_Management_System.Model.Leaves;
import com.system.Human_Resource_Management_System.Service.LeavesService;

@Controller
public class LeavesController {
    
    @Autowired
    private LeavesService leavesService;
    
    @GetMapping("/leaves_report")
    public String viewHomePage(Model model) {
        model.addAttribute("listLeaves", leavesService.getAllLeaves()); // Ensure the attribute name matches with your Thymeleaf template
        return "leaves_report";
    }
    
    @GetMapping("/showNewLeavesForm")
    public String showNewLeavesForm(Model model) {
        // Create model attribute to bind form data
        Leaves leaves = new Leaves();
        model.addAttribute("leaves", leaves);
        return "new_leaves";
    }
    
    @PostMapping("/saveLeaves")
    public String saveLeaves(@ModelAttribute("leaves") Leaves leaves) {
        leavesService.saveLeaves(leaves);
        
        // Corrected the redirect URL to remove the space
        return "redirect:/leaves_report";
    }
    

	@GetMapping("/showFormForUpdate1/{id}")
	public String showFormForUpdate(@PathVariable(value="id") long id, Model model) {
		Leaves leaves = leavesService.getLeavesById(id);
		model.addAttribute("leaves", leaves);
		return "update_leaves";
	}
    
    @GetMapping("/deleteLeaves/{id}")
    public String deleteLeaves(@PathVariable(value = "id") long id) {
        this.leavesService.deleteLeavesById(id);
        
        // Corrected the redirect URL to remove the space
        return "redirect:/leaves_report";
    }
}
