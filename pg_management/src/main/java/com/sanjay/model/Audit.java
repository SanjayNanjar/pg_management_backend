package com.sanjay.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;

public class Audit {
	
	@Id
	private Long id;

	private Date modified;

	private String modifiedBy;

	private List<UpdateHistory> history;

	public Date createdDate;
	
	public String createdBy;
	
	

}
