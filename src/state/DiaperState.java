package state;

public class DiaperState {

	public static void main(String[] args) {
		Diaper diaper = new Diaper();
		System.out.println(diaper);
		diaper.throwAwayDiapers();
		diaper.unwrapDiapers();
		diaper.newDiaperState();
		System.out.println(diaper);
		diaper.throwAwayDiapers();
		diaper.tornedDiapers();
		diaper.wrapDiapers();
		diaper.unwrapDiapers();
		System.out.println(diaper);
		
	}

}
