package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class fondo extends JPanel 
 {
    //------------------------
    //Atributos
    //-------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    //------------------------
    //Metodos
    //-------------------------

    //-------------------------
    //constructor
    //-------------------------
    public fondo(){
        //Creacion y adicion de la imagen al panel
        iImagen= new ImageIcon((getClass().getResource("/Vista/Train.png")));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(20,15,200,200);
        this.add(lbImagen);
    }
}
