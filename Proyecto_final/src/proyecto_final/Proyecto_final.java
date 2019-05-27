package proyecto_final;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Proyecto_final {
    public static void main(String[] args) {
        JFExportar inicio = new JFExportar();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }

    private static class JFExportar {

        public JFExportar() {
        }

        private void setLocationRelativeTo(Object object) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
