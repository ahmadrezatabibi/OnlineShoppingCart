/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlineshopping.model;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author pmkrish6
 */
@Entity
public class Customer extends User{
   @OneToMany(mappedBy ="Customer")
   private Collection<CreditCard> creditcard; 
}
