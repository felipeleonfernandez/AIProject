import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> minimumPath = new ArrayList<String>();
		
		minimumPath.add("Ikebukuro");
		minimumPath.add("Otsuka");
		minimumPath.add("Sugamo");
		
		ImagePanel ip = new ImagePanel();
		ip.mainPanel.setMinimumPath(minimumPath);
		
	}

}
