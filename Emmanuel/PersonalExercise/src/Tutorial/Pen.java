package Tutorial;

public class Pen {
	
	private PenPosition currentPosition = PenPosition.UP;

	public PenPosition getCurrentPosition() {
		return this.currentPosition;
	}

	public void setCurrentPosition(PenPosition currentPosition) {
		this.currentPosition = currentPosition;
	}

}
