/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stdadmin;

import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import gui.SplashScreen;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Umayanga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());

            new SplashScreen(null, true).setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
