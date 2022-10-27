package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbNumero;
    private JLabel lbMinutos;
    private JLabel lbCosto;
    private JLabel lbOperador;
    private JTextField tfNumero;
    private JTextField tfMinutos;
    private JTextField tfCosto;
    private JTextField tfOperador;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNumero = new JLabel("# Telefono: ");
        lbNumero.setBounds(20,30,80,20);
        add(lbNumero);
        
        lbMinutos = new JLabel("Cantidad Min:");
        lbMinutos.setBounds(10,80,120,20);
        add(lbMinutos);
        
        lbCosto = new JLabel("Valor Min:");
        lbCosto.setBounds(20,105,120,20);
        add(lbCosto);
        
        lbOperador = new JLabel("Operador:");
        lbOperador.setBounds(20,55,100,20);
        add(lbOperador);
        
        //Creación y adición de campos de texto
        tfNumero = new JTextField("");
        tfNumero.setBounds(90, 30, 100, 20);
        add(tfNumero);
        
        tfMinutos = new JTextField("");
        tfMinutos.setBounds(90, 80, 60, 20);
        add(tfMinutos);
        
        tfCosto = new JTextField("");
        tfCosto.setBounds(90, 105, 60, 20);
        add(tfCosto);

        tfOperador = new JTextField("");
        tfOperador.setBounds(90, 55, 100, 20);
        add(tfOperador);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Entrada de Datos");
        borde.setTitleColor(Color.RED);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNumero()
    {
        return tfNumero.getText();
    }
    
    public String getMinutos()
    {
        return tfMinutos.getText();
    }
    
    public String getCosto()
    {
        return tfCosto.getText();
    }

    public String getOperador()
    {
        return tfOperador.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNumero.setText("");
        tfMinutos.setText("");
        tfCosto.setText("");       
        tfOperador.setText("");
    }
}