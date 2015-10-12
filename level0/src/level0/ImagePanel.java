package level0;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
BufferedImage bi;
int x,y;
public void paint(Graphics g)
{
	super.paint(g);
	g.drawImage(bi, 0, 0, x, y, null);
}
ImagePanel(String f, int w, int h)
{ 
	x=w;
	y=h;
	System.out.println(x+ " " +y);
	try {
		bi = ImageIO.read(this.getClass().getResourceAsStream(f));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

}
