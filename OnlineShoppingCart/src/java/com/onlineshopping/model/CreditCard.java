/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlineshopping.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author pmkrish6
 */
@Entity
public class CreditCard implements Serializable {
    @Id
    @GeneratedValue
    
    @ManyToOne
    private User user;
   
    private String cart_Id;
    private String state;
    private int zipcode;
    private String country;
  
    
}
