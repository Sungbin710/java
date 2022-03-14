import java.util.*;

abstract class Sprite{
	
	int x,y;
	abstract void move();

}

class Me extends Sprite{			//@

	public Me(){
		
	}
	public void move() {
		
	}
}

class Gold extends Sprite{			//G
	
	public Gold() {
		
	}
	
	public void move() {
		
	}
	
}

class Monster extends Sprite{		//M
	
	public Monster(){
		
	}
	public void move() {
		
	}
}


class map{
	
	
	int Height, Width;
	char[][] MAP;
	
	public map(int H,int W) {
		Height = H;
		Width = W;
		char[][] M = new char[H][W]; 
	}
	
	void Init() {
			
		for(int i=0; i<Height;i++) {
			for(int j=0; j<Width;j++) {
				MAP[i][j]=' ';
			}
		}
		
		for(int i=0;i<Height;i++)
			MAP[i][0] = '#';
		
		for(int i=0;i<Height;i++)
			MAP[i][Width-1] = '#';
		
		for(int i=0;i<Width;i++)
			MAP[0][i] = '#';
		
		for(int i=0;i<Width;i++)
			MAP[Height-1][i] = '#';	
	}
	
}



public class TestGame {

	static final int MAP_HEIGHT = 10;
	static final int MAP_WIDTH = 20;
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map m = new map(10,20);
		
		m.Init();
		
		for(int i=0; i<m.Height;i++) {
			for(int j=0; j<m.Width;j++) {
				System.out.print(m.MAP[i][j]);
			}
			System.out.println("");
		}
		
		
	
	}
		

}
