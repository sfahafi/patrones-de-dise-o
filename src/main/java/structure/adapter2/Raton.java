package structure.adapter2;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Raton extends JFrame{
    //posiciones del clic
    private int xPos,yPos;
    
    //constructor que llama al adaptador
    public Raton(){
        addMouseListener(new ManejadorRaton());
        setSize(400,200);
        setVisible(true);
    }
    
    //Dibujara donde se hiso clic
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Se hiso clic en "+xPos+","+yPos, xPos, yPos);
    }
    
    public static void main(String[] args) {
        Raton r=new Raton();
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Clase Interna para el adaptador
    //La Clase MouseAdapter implementa MouseListener. Pero Mouse Adapter hacer
    //que no tengamos que implementar todos los métodos de MouseListener
    class ManejadorRaton extends MouseAdapter{

        @Override
        public void mouseClicked(MouseEvent e) {
            xPos=e.getX();
            yPos=e.getY();
            repaint();
        }
        
    }
}
