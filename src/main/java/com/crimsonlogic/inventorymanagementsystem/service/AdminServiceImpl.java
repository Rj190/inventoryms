package com.crimsonlogic.inventorymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepositroy;

@Service
public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	private IAdminRepositroy adminRepositroy;

}
