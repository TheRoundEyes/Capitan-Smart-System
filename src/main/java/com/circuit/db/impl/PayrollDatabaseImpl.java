/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.intrfc.PayrollDatabase;
import com.circuit.exception.ServiceException;
import com.circuit.obj.treasuryObj.PayrollDetails;
import javafx.collections.ObservableList;

/**
 *
 * @author Marvin
 */
public class PayrollDatabaseImpl extends DatabaseSource implements PayrollDatabase {

    @Override
    public PayrollDetails addEmployee(PayrollDetails payrollDetails) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeEmployee(PayrollDetails payrollDetails) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PayrollDetails addSalary(PayrollDetails payrollDetails) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PayrollDetails editSalary(PayrollDetails payrollDetails) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PayrollDetails addTax(PayrollDetails payrollDetails) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PayrollDetails removeTax(PayrollDetails payrollDetails) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObservableList<PayrollDetails> loadEmployees(PayrollDetails payrollDetails) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
