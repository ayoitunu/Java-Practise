//package Tutorial;
//
//public class Turtle {
//	
//	private int direction;
//	private Pen TurtlePen;
//	
//	private int currentRow = 0;
//	private int currentColumn = 0;
//	private TurtleOrientation currentOrientation = TurtleOrientation.COLUMN_RIGHT;
//	//public enum TurtleOrientationS {COLUMN, ROW_DOWN}
//	
//	
//	public TurtleOrientation getCurrentOrientation() {
//		return currentOrientation;
//	}
//
//	public void setCurrentOrientation(TurtleOrientation currentOrientation) {
//		this.currentOrientation = currentOrientation;
//	}
//
//
//	public Pen getTurtlePen() {
//		return TurtlePen;
//	}
//
//	public void setTurtlePen(Pen turtlePen) {
//		TurtlePen = turtlePen;
//	}
//
//	public int getDirection() {
//		return direction;
//	}
//
//	public void setDirection(int direction) {
//		this.direction = direction;
//	}
//
//	public int getCurrentRow() {
//		return currentRow;
//	}
//
//	public void setCurrentRow(int row) {
//		this.currentRow = row;
//	}
//
//	public int getCurrentColumn() {
//		return currentColumn;
//	}
//
//	public void setCurrentColumn(int column) {
//		this.currentColumn = column;
//	}
//	
//	public void moveForward(int numberOfSteps, SketchPad sketchingPad) {
//		if(sketchingPad == null || numberOfSteps <= 0 || numberOfSteps > sketchingPad.getFloor().length) {
//			throw new IllegalArgumentException(" Sketching pad is required and Number of steps should be within floor range");
//		}
//		
//		this.getTurtlePen().setCurrentPosition(PenPosition.DOWN);
//		
//		if(this.getCurrentOrientation()== TurtleOrientation.COLUMN_RIGHT) {
//			
//			int tempCurrentColumn = this.getCurrentColumn();
//			sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] = 1;
//			for(int i = 1; i < numberOfSteps; i++) {
//				//or currentColumn +=1;
//				sketchingPad.getFloor()[this.getCurrentRow()][++tempCurrentColumn] = 1; //[currentColumn]
//				
//			}
//			this.setCurrentColumn(tempCurrentColumn);
////		}else {
////			int tempCurrentRow = this.getCurrentRow ();
////			sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] = 1;
////			for(int i = 1; i < numberOfSteps; i++) {
////				//or currentColumn +=1;
////				sketchingPad.getFloor()[this.getCurrentRow()][++tempCurrentColumn] = 1; //[currentColumn]
////				
////			}
////			this.setCurrentColumn(tempCurrentColumn);
////		}
////			
//	}
//	
//	public void turnRight() {
//		//no need of parameter if action its taking is on itself
//		if(this.currentOrientation==TurtleOrientation.COLUMN_RIGHT) {
//			this.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
//		}else if(this.getCurrentOrientation() == TurtleOrientation.ROW_DOWN){
//			this.setCurrentOrientation(TurtleOrientation.COLUMN_LEFT);
//		}
//		
//	
//	}
//
//}
