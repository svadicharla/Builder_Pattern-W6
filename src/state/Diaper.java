package state;

public class Diaper {
	State newDiapersState;
	State dirtyState;
	State unwrapState;
	State wrapState;
	State tornedDiaperState;
	State state;
	public Diaper() {
		newDiapersState = new NewDiapersState(this);
		dirtyState = new DirtyState(this);
		unwrapState = new UnwrapDiaper(this);
		wrapState = new WrapDiaperState(this);
		tornedDiaperState = new TornedDiaperState(this);
		state = newDiapersState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getNewDiapersState() {
		return newDiapersState;
	}
	public State getDirtyState() {
		return dirtyState;
	}
	public State getWrapState() {
		return wrapState;
	}
	public State getUnwrapState() {
		return unwrapState;
	}
	public void newDiaperState() {
		state.getNewDiapers();
	}
	public void throwAwayDiapers() {
		state.throwAwayDiapers();
	}
	public void unwrapDiapers() {
		state.unwrapDiapers();
	}
	public void wrapDiapers() {
		state.wrapDiapers();
	}
	public void tornedDiapers() {
		state.tornedDiapers();
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n----------Baby care --------\n");
		
		result.append("Diapers " + state + "\n");
		
		return result.toString();
	}
	

}
