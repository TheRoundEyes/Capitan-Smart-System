/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.intrfc;

import com.circuit.exception.ServiceException;
import com.circuit.obj.treasuryObj.PayrollDetails;
import javafx.collections.ObservableList;

/**
 *
 * @author Marvin
 */
public interface PayrollDatabase {
    
    public PayrollDetails addEmployee(PayrollDetails payrollDetails) throws ServiceException;
    
    public boolean removeEmployee(PayrollDetails payrollDetails) throws ServiceException;
    
    public PayrollDetails addSalary(PayrollDetails payrollDetails) throws ServiceException;
    
    public PayrollDetails editSalary(PayrollDetails payrollDetails) throws ServiceException;
    
    public PayrollDetails addTax(PayrollDetails payrollDetails) throws ServiceException;
    
    public PayrollDetails removeTax(PayrollDetails payrollDetails) throws ServiceException;
    
    public ObservableList<PayrollDetails> loadEmployees(PayrollDetails payrollDetails) throws ServiceException;
    
    
    
}
