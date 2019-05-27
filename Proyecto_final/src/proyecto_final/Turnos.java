package proyecto_final;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Turnos {
    String m1;
    String m2;
    String m3;
    protected String nombre;
    protected long año;
    protected String servicio;
    public String getnombre(){return nombre;}
    public void setnombre(String nombre){this.nombre=nombre;}
    public long getaño(){return año;}
    public void setaño(long año){this.año=año;}
    public String getservicio(){return servicio;}
    public void setservicio(String servicio){this.servicio=servicio;}
    public void imprimir(){
    m1=("Nombre:"+nombre);
    m2=("Año:"+año);
    m3=("Servicio:"+servicio);
    }
    public static boolean exportToCSV(JTable tableToExport,
        String pathToExportTo) {
    try {
        TableModel model = tableToExport.getModel();
        FileWriter csv = new FileWriter(new File(pathToExportTo));
        for (int x = 0; x < model.getColumnCount(); x++) {
            csv.write(model.getColumnName(x) + ",");
        }
        csv.write("\n");
        for (int x = 0; x < model.getRowCount(); x++) {
            for (int y = 0; y < model.getColumnCount(); y++) {
                csv.write(model.getValueAt(x, y).toString() + ",");
            }
            csv.write("\n");
        }
        csv.close();
        return true;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}

    void exportToCSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void exportarExcel(JTable jTable1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
