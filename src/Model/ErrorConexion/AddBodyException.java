/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorConexion;

import java.sql.SQLException;

/**
 *
 *
 */
public class AddBodyException extends Exception {

    public AddBodyException(SQLException ex) {
        super(ex);
    }
    
}
