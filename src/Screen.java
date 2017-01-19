import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PolygonObject Poly1;	
	public Screen()
	{
		Poly1 = new PolygonObject(new int[]{10, 50, 75}, new int[]{100, 20, 100}, Color.green);
	}
	
	public void paintComponent(Graphics g)
	{
		Poly1.fillPolygon(g);
	}
}