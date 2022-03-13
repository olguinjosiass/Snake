import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

	

	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: Serpiente , 1: comida, 0:vacío 
	SquarePanel square;
	public DataOfSquare(int col){
		
		//Agregando color
		C.add(Color.darkGray);//0
		C.add(Color.BLUE);    //1
		C.add(Color.white);   //2
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
