package state;


public class DisposableDiaperBuilder extends DiaperBuilder {
	public DisposableDiaperBuilder() {
		this.name = "Disposable Diaper";
	}
	
	@Override
	public DiaperBuilder addCellulose() {
		this.parts.add("Cellulose");
		return this;
	}

	@Override
	public DiaperBuilder addAbsorbentPad() {
		this.parts.add("Absorbent Pad");
		return this;
	}

	@Override
	public DiaperBuilder addNonwovenFabric() {
		this.parts.add("Nonwoven Fabric");
		return this;
	}

	@Override
	public DiaperBuilder addCotton() {
		return this;
	}

	@Override
	public DiaperBuilder addBamboo() {
		return this;
	}

	@Override
	public DiaperBuilder addHemp() {
		return this;
	}
	
	
}


