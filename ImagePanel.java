import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

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

	class Panel extends JPanel {
		private ArrayList<Station> allStations;
		private ArrayList<String> minimumPath; 
		
		public void setMinimumPath(ArrayList<String> minimumPath) {
			this.minimumPath = minimumPath;
			allStations = new ArrayList<Station>();
		}
		
		@Override
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			int circleSize = 17;
			
			//	LÍNEA VERDE
			//	Instancias de los objetos (círculos) a dibujar
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.DARK_GRAY);
			
			Station ikebukuro = new Station("Ikebukuro", 214-10, 73-10, circleSize, circleSize);
			allStations.add(ikebukuro);
			Station otsuka = new Station("Otsuka", 279-10, 73-10, circleSize, circleSize);
			allStations.add(otsuka);
			Station sugamo = new Station("Sugamo", 313-10, 73-10, circleSize, circleSize);
			allStations.add(sugamo);
			Station komagome = new Station("Komagome", 345-10, 73-10, circleSize, circleSize);
			allStations.add(komagome);
			Station tabata = new Station("Tabata", 386-10, 88-10, circleSize, circleSize);
			allStations.add(tabata);
			Station nishiNippori = new Station("Nishi-Nippori", 405-10, 105-10, circleSize, circleSize);
			allStations.add(nishiNippori);
			Station nippori = new Station("Nippori", 412-10, 134-10, circleSize, circleSize);
			allStations.add(nippori);
			Station uguisudani = new Station("Uguisudani", 412-10, 161-10, circleSize, circleSize);
			allStations.add(uguisudani);
			Station ueno = new Station("Ueno", 412-10, 185-10, circleSize, circleSize);
			allStations.add(ueno);
			Station okachimachi = new Station("Okachimachi", 412-10, 211-10, circleSize, circleSize);
			allStations.add(okachimachi);
			Station akihabara = new Station("Akihabara", 412-10, 238-10, circleSize, circleSize);
			allStations.add(akihabara);
			Station kanda = new Station("Kanda", 412-10, 277-10, circleSize, circleSize);
			allStations.add(kanda);
			Station tokyo = new Station("Tokyo", 412-10, 313-10, circleSize, circleSize);
			allStations.add(tokyo);
			Station yurakucho = new Station("Yurakucho", 407-10, 347-10, circleSize, circleSize);
			allStations.add(yurakucho);
			Station shimbashi = new Station("Shimbasi", 384-10, 371-10, circleSize, circleSize);
			allStations.add(shimbashi);
			Station hamamatsucho = new Station("Hamamatsucho", 356-10, 395-10, circleSize, circleSize);
			allStations.add(hamamatsucho);
			Station tamachi = new Station("Tamachi", 326-10, 424-10, circleSize, circleSize);
			allStations.add(tamachi);
			Station shinagawa = new Station("Shinagawa", 293-10, 455-10, circleSize, circleSize);
			allStations.add(shinagawa);
			Station osaki = new Station("Osaki", 236-10, 463-10, circleSize, circleSize);
			allStations.add(osaki);
			Station gotanda = new Station("Gotanda", 199-10, 463-10, circleSize, circleSize);
			allStations.add(gotanda);
			Station meguro = new Station("Meguro", 165-10, 463-10, circleSize, circleSize);
			allStations.add(meguro);
			Station ebisu = new Station("Ebisu", 118-10, 440-10, circleSize, circleSize);
			allStations.add(ebisu);
			Station shibuya = new Station("Shibuya", 118-10, 392-10, circleSize, circleSize);
			allStations.add(shibuya);
			Station harajuku = new Station("Harajuku", 118-10, 348-10, circleSize, circleSize);
			allStations.add(harajuku);
			Station yoyogiV = new Station("YoyogiV", 118-10, 282-10, circleSize, circleSize);
			allStations.add(yoyogiV);
			Station shinjukuV = new Station("ShinjukuV", 118-10, 249-10, circleSize, circleSize);
			allStations.add(shinjukuV);
			Station shinOkubo = new Station("Shin-Okubo", 118-10, 178-10, circleSize, circleSize);
			allStations.add(shinOkubo);
			Station takadanobaba = new Station("Takadanobaba", 122-10, 140-10, circleSize, circleSize);
			allStations.add(takadanobaba);
			Station mejiro = new Station("Mejiro", 157-10, 107-10, circleSize, circleSize);
			allStations.add(mejiro);
			
			//	Dibujar círculos
			g2.draw(ikebukuro.getEllipseStation());			
			g2.draw(otsuka.getEllipseStation());
			g2.draw(sugamo.getEllipseStation());
			g2.draw(komagome.getEllipseStation());
			g2.draw(tabata.getEllipseStation());
			g2.draw(nishiNippori.getEllipseStation());
			g2.draw(nippori.getEllipseStation());
			g2.draw(uguisudani.getEllipseStation());
			g2.draw(ueno.getEllipseStation());
			g2.draw(okachimachi.getEllipseStation());
			g2.draw(akihabara.getEllipseStation());
			g2.draw(kanda.getEllipseStation());
			g2.draw(tokyo.getEllipseStation());
			g2.draw(yurakucho.getEllipseStation());
			g2.draw(shimbashi.getEllipseStation());
			g2.draw(hamamatsucho.getEllipseStation());
			g2.draw(tamachi.getEllipseStation());
			g2.draw(shinagawa.getEllipseStation());
			g2.draw(osaki.getEllipseStation());
			g2.draw(gotanda.getEllipseStation());
			g2.draw(meguro.getEllipseStation());
			g2.draw(ebisu.getEllipseStation());
			g2.draw(shibuya.getEllipseStation());
			g2.draw(harajuku.getEllipseStation());
			g2.draw(yoyogiV.getEllipseStation());
			g2.draw(shinjukuV.getEllipseStation());
			g2.draw(shinOkubo.getEllipseStation());
			g2.draw(takadanobaba.getEllipseStation());
			g2.draw(mejiro.getEllipseStation());
			
			//	Rellenar círculos
			g2.fill(ikebukuro.getEllipseStation());			
			g2.fill(otsuka.getEllipseStation());
			g2.fill(sugamo.getEllipseStation());
			g2.fill(komagome.getEllipseStation());
			g2.fill(tabata.getEllipseStation());
			g2.fill(nishiNippori.getEllipseStation());
			g2.fill(nippori.getEllipseStation());
			g2.fill(uguisudani.getEllipseStation());
			g2.fill(ueno.getEllipseStation());
			g2.fill(okachimachi.getEllipseStation());
			g2.fill(akihabara.getEllipseStation());
			g2.fill(kanda.getEllipseStation());
			g2.fill(tokyo.getEllipseStation());
			g2.fill(yurakucho.getEllipseStation());
			g2.fill(shimbashi.getEllipseStation());
			g2.fill(hamamatsucho.getEllipseStation());
			g2.fill(tamachi.getEllipseStation());
			g2.fill(shinagawa.getEllipseStation());
			g2.fill(osaki.getEllipseStation());
			g2.fill(gotanda.getEllipseStation());
			g2.fill(meguro.getEllipseStation());
			g2.fill(ebisu.getEllipseStation());
			g2.fill(shibuya.getEllipseStation());
			g2.fill(harajuku.getEllipseStation());
			g2.fill(yoyogiV.getEllipseStation());
			g2.fill(shinjukuV.getEllipseStation());
			g2.fill(shinOkubo.getEllipseStation());
			g2.fill(takadanobaba.getEllipseStation());
			g2.fill(mejiro.getEllipseStation());
			
			
			//	LÍNEA AMARILLA
			Graphics2D g3 = (Graphics2D) g;
			g2.setColor(Color.darkGray);
			
			Station shinjukuA = new Station("ShinjukuA", 75-10, 249-10, circleSize, circleSize);
			allStations.add(shinjukuA);
			Station yoyogiA = new Station("YoyogiA", 75-10, 283-10, circleSize, circleSize);			
			allStations.add(yoyogiA);
			Station sendagaya = new Station("Sendagaya", 141-10, 324-10, circleSize, circleSize);
			allStations.add(sendagaya);
			Station shinanomachi = new Station("Shinanomachi", 183-10, 324-10, circleSize, circleSize);
			allStations.add(shinanomachi);
			Station yotsuya = new Station("Yotsuya", 206-10, 304-10, circleSize, circleSize);
			allStations.add(yotsuya);
			Station ichidagaya = new Station("Ichidagaya", 223-10, 288-10, circleSize, circleSize);
			allStations.add(ichidagaya);
			Station iidabashi = new Station("Iidabashi", 240-10, 272-10, circleSize, circleSize);
			allStations.add(iidabashi);
			Station suidobashi = new Station("Suidobashi", 257-10, 256-10, circleSize, circleSize);
			allStations.add(suidobashi);
			Station ochanomizuA = new Station("OchanomizuA", 284-10, 238-10, circleSize, circleSize);
			allStations.add(ochanomizuA);
			
			g3.draw(shinjukuA.getEllipseStation());
			g3.draw(yoyogiA.getEllipseStation());
			g3.draw(sendagaya.getEllipseStation());
			g3.draw(shinanomachi.getEllipseStation());
			g3.draw(yotsuya.getEllipseStation());
			g3.draw(ichidagaya.getEllipseStation());
			g3.draw(iidabashi.getEllipseStation());
			g3.draw(suidobashi.getEllipseStation());
			g3.draw(ochanomizuA.getEllipseStation());
			
			g3.fill(shinjukuA.getEllipseStation());
			g3.fill(yoyogiA.getEllipseStation());
			g3.fill(sendagaya.getEllipseStation());
			g3.fill(shinanomachi.getEllipseStation());
			g3.fill(yotsuya.getEllipseStation());
			g3.fill(ichidagaya.getEllipseStation());
			g3.fill(iidabashi.getEllipseStation());
			g3.fill(suidobashi.getEllipseStation());
			g3.fill(ochanomizuA.getEllipseStation());
			
			
			//	LÍNEA ROJA
			Graphics2D g4 = (Graphics2D) g;
			g4.setColor(Color.DARK_GRAY);
			
			Station shinjukuR = new Station("ShinjukuR", 95-10, 249-10, circleSize, circleSize);
			allStations.add(shinjukuR);
			Station ochanomizuR = new Station("OchanomizuR", 303-10, 218-10, circleSize, circleSize);
			allStations.add(ochanomizuR);
			
			g4.draw(shinjukuR.getEllipseStation());
			g4.draw(ochanomizuR.getEllipseStation());
			
			g4.fill(shinjukuR.getEllipseStation());
			g4.fill(ochanomizuR.getEllipseStation());
			

			Graphics2D g5 = (Graphics2D) g;
			g5.setColor(Color.CYAN);
			
			ArrayList<Ellipse2D.Double> minimumPathEllipse = new ArrayList<Ellipse2D.Double>();
						
			for(int i=0; i<minimumPath.size(); i++) {
				for(int j=0; j<allStations.size(); j++) {
					if(minimumPath.get(i).equals(allStations.get(j).getName())) {
						minimumPathEllipse.add(allStations.get(j).getEllipseStation());
						g5.draw(allStations.get(j).getEllipseStation());
						g5.fill(allStations.get(j).getEllipseStation());
					}
				}
			}
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