import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		MapRepresentation mapita=new MapRepresentation();
		Graph graph = mapita.getEstaciones();
		Node origen=graph.getNode("Ochanomizu");
		Node destino=graph.getNode("Ebisu");
		mapita.getF(origen, destino);
		
		ArrayList<String> minimumPath = mapita.getCaminoMinimo();
		System.out.println(minimumPath);
		
		ImagePanel ip = new ImagePanel();
		ip.mainPanel.setMinimumPath(minimumPath);
		
	}

}
