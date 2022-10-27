package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bAñadir;
    public JButton bSaldo;
    public JButton bSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bAñadir = new JButton("Añadir");
        bAñadir.setFont(new Font("Arial", BOLD, 12));
        bAñadir.setBounds(10,20,80,20);
        add(bAñadir);
        bAñadir.setActionCommand("añadir");
        
        
        bSaldo = new JButton("Calcular saldo");
        bSaldo.setFont(new Font("Arial", BOLD, 12));
        bSaldo.setBounds(10,50,120,20);
        add(bSaldo);
        bSaldo.setActionCommand("Saldo");
        bSaldo.setEnabled(false);

        bSalir = new JButton("Salir");
        bSalir.setFont(new Font("Arial", BOLD, 12));
        bSalir.setBounds(10,80,90,20);
        add(bSalir);
        bSalir.setActionCommand("Salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.RED);
        setBorder(borde);

    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bAñadir.addActionListener(pAL);
        bSaldo.addActionListener(pAL);
    }
    
    public void desactivarBotonCrear()
    {
        bAñadir.setEnabled(false);
    }
    
    public void activarBotones()
    {
        bSaldo.setEnabled(true);
    }
}