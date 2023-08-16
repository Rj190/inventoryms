package com.crimsonlogic.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.service.IAdminService;

@RequestMapping("/admin")
@RestController
public class AdminController {
	
	@Autowired 
	private IAdminService adminService;
	

	@GetMapping("/listadmin")
	public List<Admin> viewAllAdmin(){
		return adminService.viewAllAdmin();
	}
	
	@PostMapping("/insertadmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return adminService.insertAdmin(admin);
	}

}
