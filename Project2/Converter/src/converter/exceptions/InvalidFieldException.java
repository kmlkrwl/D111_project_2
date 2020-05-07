/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.exceptions;

/**
 *
 * @author kamalkarwal
 */
public class InvalidFieldException extends Exception {
    
   public InvalidFieldException() {
       super("Input Field is Empty");
   }
    
}
