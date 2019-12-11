import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class ImagePanel extends JFrame {
	
	Panel mainPanel = new Panel();
	String route = "C:\\Users\\Felipe\\Programas\\workspace-eclipse\\IA-GUI\\src\\metro.PNG";
	Image img = Toolkit.getDefaultToolkit().getImage(route);

	public ImagePanel() {
		setTitle("Proyecto IA 2019 - Metro Tokio");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
		prepareImage(img, mainPanel);
		getContentPane().add(mainPanel, BorderLayout.CENTER);

		setSize(new Dimension(575, 541));
		setLocationRelativeTo(null);	//	Si se le pasa el valor null se posiciona en el centro de la pantalla
		
		//	Posible solución para coger origen y destino
		this.add(mainPanel);
		mainPanel.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) {
		        System.out.println(e.getX() + "," + e.getY());
		    }
		});
		
	}

	private class Panel extends JPanel {
		@Override
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			int circleSize = 17;
			
			//	LÍNEA VERDE
			//	Instancias de los objetos (círculos) a dibujar
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.DARK_GRAY);
			
			Ellipse2D ikebukuroE = new Ellipse2D.Double(214-10, 73-10, circleSize, circleSize);
			Ellipse2D otsukaE = new Ellipse2D.Double(279-10, 73-10, circleSize, circleSize);
			Ellipse2D sugamoE = new Ellipse2D.Double(313-10, 73-10, circleSize, circleSize);
			Ellipse2D komagomeE = new Ellipse2D.Double(345-10, 73-10, circleSize, circleSize);
			Ellipse2D tabataE = new Ellipse2D.Double(386-10, 88-10, circleSize, circleSize);
			Ellipse2D nishiNipporiE = new Ellipse2D.Double(405-10, 105-10, circleSize, circleSize);
			Ellipse2D nipporiE = new Ellipse2D.Double(412-10, 134-10, circleSize, circleSize);
			Ellipse2D uguisudaniE = new Ellipse2D.Double(412-10, 161-10, circleSize, circleSize);
			Ellipse2D uenoE = new Ellipse2D.Double(412-10, 185-10, circleSize, circleSize);
			Ellipse2D okachimachiE = new Ellipse2D.Double(412-10, 211-10, circleSize, circleSize);
			Ellipse2D akihabaraE = new Ellipse2D.Double(412-10, 238-10, circleSize, circleSize);
			Ellipse2D kandaE = new Ellipse2D.Double(412-10, 277-10, circleSize, circleSize);
			Ellipse2D tokyoE = new Ellipse2D.Double(412-10, 313-10, circleSize, circleSize);
			Ellipse2D yurakuchoE = new Ellipse2D.Double(407-10, 347-10, circleSize, circleSize);
			Ellipse2D shimbashiE = new Ellipse2D.Double(384-10, 371-10, circleSize, circleSize);
			Ellipse2D hamamatsuchoE = new Ellipse2D.Double(356-10, 395-10, circleSize, circleSize);
			Ellipse2D tamachiE = new Ellipse2D.Double(326-10, 424-10, circleSize, circleSize);
			Ellipse2D shinagawaE = new Ellipse2D.Double(293-10, 455-10, circleSize, circleSize);
			Ellipse2D osakiE = new Ellipse2D.Double(236-10, 463-10, circleSize, circleSize);
			Ellipse2D gotandaE = new Ellipse2D.Double(199-10, 463-10, circleSize, circleSize);
			Ellipse2D meguroE = new Ellipse2D.Double(165-10, 463-10, circleSize, circleSize);
			Ellipse2D ebisuE = new Ellipse2D.Double(118-10, 440-10, circleSize, circleSize);
			Ellipse2D shibuyaE = new Ellipse2D.Double(118-10, 392-10, circleSize, circleSize);
			Ellipse2D harajukuE = new Ellipse2D.Double(118-10, 348-10, circleSize, circleSize);
			Ellipse2D yoyogiVE = new Ellipse2D.Double(118-10, 282-10, circleSize, circleSize);
			Ellipse2D shinjukuVE = new Ellipse2D.Double(118-10, 249-10, circleSize, circleSize);
			Ellipse2D shinOkuboE = new Ellipse2D.Double(118-10, 178-10, circleSize, circleSize);
			Ellipse2D takadanobabaE = new Ellipse2D.Double(122-10, 140-10, circleSize, circleSize);
			Ellipse2D mejiroE = new Ellipse2D.Double(157-10, 107-10, circleSize, circleSize);
			
			//	Dibujar círculos
			g2.draw(ikebukuroE);			
			g2.draw(otsukaE);
			g2.draw(sugamoE);
			g2.draw(komagomeE);
			g2.draw(tabataE);
			g2.draw(nishiNipporiE);
			g2.draw(nipporiE);
			g2.draw(uguisudaniE);
			g2.draw(uenoE);
			g2.draw(okachimachiE);
			g2.draw(akihabaraE);
			g2.draw(kandaE);
			g2.draw(tokyoE);
			g2.draw(yurakuchoE);
			g2.draw(shimbashiE);
			g2.draw(hamamatsuchoE);
			g2.draw(tamachiE);
			g2.draw(shinagawaE);
			g2.draw(osakiE);
			g2.draw(gotandaE);
			g2.draw(meguroE);
			g2.draw(ebisuE);
			g2.draw(shibuyaE);
			g2.draw(harajukuE);
			g2.draw(yoyogiVE);
			g2.draw(shinjukuVE);
			g2.draw(shinOkuboE);
			g2.draw(takadanobabaE);
			g2.draw(mejiroE);
			
			//	Rellenar círculos
			g2.fill(ikebukuroE);
			g2.fill(otsukaE);
			g2.fill(sugamoE);
			g2.fill(komagomeE);
			g2.fill(tabataE);
			g2.fill(nishiNipporiE);
			g2.fill(nipporiE);
			g2.fill(uguisudaniE);
			g2.fill(uenoE);
			g2.fill(okachimachiE);
			g2.fill(akihabaraE);
			g2.fill(kandaE);
			g2.fill(tokyoE);
			g2.fill(yurakuchoE);
			g2.fill(shimbashiE);
			g2.fill(hamamatsuchoE);
			g2.fill(tamachiE);
			g2.fill(shinagawaE);
			g2.fill(osakiE);
			g2.fill(gotandaE);
			g2.fill(meguroE);
			g2.fill(ebisuE);
			g2.fill(shibuyaE);
			g2.fill(harajukuE);
			g2.fill(yoyogiVE);
			g2.fill(shinjukuVE);
			g2.fill(shinOkuboE);
			g2.fill(takadanobabaE);
			g2.fill(mejiroE);
			
			
			//	LÍNEA AMARILLA
			Graphics2D g3 = (Graphics2D) g;
			g2.setColor(Color.darkGray);
			
			Ellipse2D shinjukuAE = new Ellipse2D.Double(75-10, 249-10, circleSize, circleSize);
			Ellipse2D yoyogiAE = new Ellipse2D.Double(75-10, 283-10, circleSize, circleSize);			
			Ellipse2D sendagayaE = new Ellipse2D.Double(141-10, 324-10, circleSize, circleSize);
			Ellipse2D shinanomachiE = new Ellipse2D.Double(183-10, 324-10, circleSize, circleSize);
			
			Ellipse2D yotsuyaE = new Ellipse2D.Double(206-10, 304-10, circleSize, circleSize);
			Ellipse2D ichidagayaE = new Ellipse2D.Double(223-10, 288-10, circleSize, circleSize);
			Ellipse2D iidabashiE = new Ellipse2D.Double(240-10, 272-10, circleSize, circleSize);
			Ellipse2D suidobashiE = new Ellipse2D.Double(257-10, 256-10, circleSize, circleSize);
			Ellipse2D ochanomizuAE = new Ellipse2D.Double(284-10, 238-10, circleSize, circleSize);
			
			g3.draw(shinjukuAE);
			g3.draw(yoyogiAE);
			g3.draw(sendagayaE);
			g3.draw(shinanomachiE);
			g3.draw(yotsuyaE);
			g3.draw(ichidagayaE);
			g3.draw(iidabashiE);
			g3.draw(suidobashiE);
			g3.draw(ochanomizuAE);
			
			g3.fill(shinjukuAE);
			g3.fill(yoyogiAE);
			g3.fill(sendagayaE);
			g3.fill(shinanomachiE);
			g3.fill(yotsuyaE);
			g3.fill(ichidagayaE);
			g3.fill(iidabashiE);
			g3.fill(suidobashiE);
			g3.fill(ochanomizuAE);
			
			
			//	LÍNEA ROJA
			Graphics2D g4 = (Graphics2D) g;
			g4.setColor(Color.DARK_GRAY);
			
			Ellipse2D shinjukuRE = new Ellipse2D.Double(95-10, 249-10, circleSize, circleSize);
			Ellipse2D ochanomizuRE = new Ellipse2D.Double(303-10, 218-10, circleSize, circleSize);
			
			g4.draw(shinjukuRE);
			g4.draw(ochanomizuRE);
			
			g4.fill(shinjukuRE);
			g4.fill(ochanomizuRE);
		}
		
		
		
		//	No estoy seguro de si es necesario quitar el código a continuación 
		/*@Override
		public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
			if((infoflags & ImageObserver.ALLBITS) != 0) {
				repaint();
				return false;
			}
			return true;
		}*/
	}
}