package com.ntgclarity.smartcompound.portal.managedbean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.ntgclarity.smartcompound.business.management.SmartCompoundManagment;
import com.ntgclarity.smartcompound.common.entity.Employee;
import com.ntgclarity.smartcompound.portal.base.BaseBean;


@ManagedBean
@ApplicationScoped
public class EmployeeListenerBean extends BaseBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{smartCompoundManagmentImpl}")
	private SmartCompoundManagment smartCompoundManagment;
	
	private Employee employee;
	@PostConstruct
	public void init() {
		this.employee=new Employee();
		
	}
	
	public Employee getEmployee() {
		return employee;
	}

	
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}






	public SmartCompoundManagment getSmartCompoundManagment() {
		return smartCompoundManagment;
	}

	public void setSmartCompoundManagment(
			SmartCompoundManagment smartCompoundManagment) {
		this.smartCompoundManagment = smartCompoundManagment;
	}

	
	public void onSubmit(){
	   getSmartCompoundManagment().insertEmployeeWithListener(employee);
	   
	}


}
