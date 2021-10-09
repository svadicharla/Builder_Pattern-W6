package state;

public class TornedDiaperState implements State{
	Diaper diaper;
	public TornedDiaperState(Diaper diaper) {
		this.diaper = diaper;
	}

	@Override
	public void getNewDiapers() {
		System.out.println("Getting new diapers");
		diaper.setState(diaper.getNewDiapersState());
	}

	@Override
	public void wrapDiapers() {
		System.out.println("Get new diapers first");
		
	}

	@Override
	public void unwrapDiapers() {
		System.out.println("Unwrapping diapers");

	}

	@Override
	public void throwAwayDiapers() {
		System.out.println("throwing away dirty diapers");
		diaper.setState(diaper.getDirtyState());
	}

	public void tornedDiapers() {
		System.out.println("diapers are already torned, get new diapers");
		diaper.setState(diaper.getNewDiapersState());
	}

}
