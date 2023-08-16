package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepositroy;

@Service
public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	private IAdminRepositroy adminRepositroy;

	@Override
	public List<Admin> viewAllAdmin() {
		return adminRepositroy.findAll();
	}

	@Override
	public Admin insertAdmin(Admin admin) {
		return adminRepositroy.save(admin);
	}

}
