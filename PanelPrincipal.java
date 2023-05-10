import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JFrame {
    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;
    public PanelPrincipal() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X
        this.setSize(1000, 800); //se pueden pasar como parámetros del constructor
        this.setVisible(true); //para que se abra y sea visible

        }
    public void paint (Graphics g) {
        super.paint(g);
    }
