package state;

public class NewDiapersState implements State {
	Diaper diaper;
	public NewDiapersState(Diaper diaper) {
		this.diaper = diaper;
	}

	@Override
	public void getNewDiapers() {
		System.out.println("You already have new diaper");
		DiaperBuilder diaperBuilder = new ClothDiaperBuilder();
		DiaperModel diaperModel = diaperBuilder.addCotton().addBamboo().addHemp().addCellulose().addAbsorbentPad().addNonwovenFabric().build();

		diaperModel.padpreparation();
		diaperModel.Formpad();
		diaperModel.PartsArrangement();
		diaperModel.packpads();

		System.out.println(diaperModel);


		diaperBuilder = new DisposableDiaperBuilder();
		diaperModel = diaperBuilder.addCotton().addBamboo().addHemp().addCellulose().addAbsorbentPad().addNonwovenFabric().build();

		diaperModel.padpreparation();
		diaperModel.Formpad();
		diaperModel.PartsArrangement();
		diaperModel.packpads();

//		System.out.println(diaperModel);
	}

	

	@Override
	public void wrapDiapers() {
		System.out.println("Wrapping diapers");
		diaper.setState(diaper.getWrapState());
	}

	@Override
	public void unwrapDiapers() {
		System.out.println("Diapers not used yet");

	}

	@Override
	public void throwAwayDiapers() {
		System.out.println("Diapers still new, you want to throw away?");

	}
	public String toString() {
		return " new";
	}

	@Override
	public void tornedDiapers() {
		System.out.println("Unwrapping diapers");
		
	}
}
