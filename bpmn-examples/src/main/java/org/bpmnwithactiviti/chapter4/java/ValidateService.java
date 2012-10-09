package org.bpmnwithactiviti.chapter4.java;

import java.util.Date;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ValidateService implements JavaDelegate {
	
	@Override
	public void execute(DelegateExecution execution) {
		System.out.println("execution id " + execution.getId());
		Long isbn = (Long) execution.getVariable("isbn");
		System.out.println("received isbn " + isbn);
		execution.setVariable("validatetime", new Date());
	}
}
