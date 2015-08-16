/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import javax.swing.JTextField;

/**
 *
 * @author user
 */

public class Validator {

 public static boolean checkInt(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void validateTP(JTextField txt) {
        try {
            String s = txt.getText();
            while (!checkInt(s)) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }
            if (s.length() > 10) {
                String s1 = s.substring(0, 10);
                txt.setText(s1);
            }
        } catch (Exception e) {
        }
    }



    public static boolean  validateEmail(String s){
         return   s.contains("@") && s.contains(".") ;
    }
}
