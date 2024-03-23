/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SrpingBootWeb_maven.services.exceptions;

/**
 *
 * @author alexp
 */
public class DatabaseException extends RuntimeException{
    
    public DatabaseException(String msg){
        super(msg);
    }
}
