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
public class NoSelectionException extends Exception {
    public NoSelectionException () {
        super("User Did Not select anything");
    }
}
