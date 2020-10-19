import stanford.karel.*;
 
 public class karelMakesBorder extends SuperKarel {
	
	public void run(){
		
		//gets karel in starting position
		getInPosition();
		//there will be four boarders so...
		for(int i=0; i<4; i++){
		
		//puts beepers along row while front is clear, skips first and last column positiion
		makeABorder();
		
		//repositions karel to make the next boarder
		repositionKarel()
		
			}
		}
		
	private void getInPosition(){
		turnLeft();
		move();
		turnRight();
	}
	
	Private void makeABorder(){
		move();
		while (frontIsClear()){
			if(noBeepersPresent){
				putBeeper();
				}
			move();
			}
		}
	private void repositionKarel(){
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
		}
		}
	