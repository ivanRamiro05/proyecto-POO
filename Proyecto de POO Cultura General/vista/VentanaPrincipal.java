package vista;
import javax.swing.JFrame;
public class VentanaPrincipal extends JFrame {
    //------------------------
    //Atributos
    //-------------------------
   public fondo miFondo;
   public PanelOperaciones miPanelOperaciones;
   public trasfodo miTrasfodo;

    //------------------------
    //Metodos
    //-------------------------

    //-------------------------
    //constructor
    //-------------------------
    public VentanaPrincipal(){
     //creacion de  la ventana
    this.setTitle("TRAINER BRAIN");
    this.setSize(800,400); 
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);  
    }
    
}
