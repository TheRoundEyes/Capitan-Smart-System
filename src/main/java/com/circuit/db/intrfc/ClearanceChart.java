package com.circuit.db.intrfc;


import com.circuit.exception.ServiceException;
import javafx.scene.chart.XYChart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marvin
 */
public interface ClearanceChart {
    
    public XYChart.Series<String, Integer>  loadBrgyClearance() throws ServiceException;
    
    public XYChart.Series<String, Integer>  loadBusClearance() throws ServiceException;
    
    public XYChart.Series<String, Integer>  loadWorkingClearance() throws ServiceException;
    
    public XYChart.Series<String, Integer>  loadPedicabClearance() throws ServiceException;
    
}
