package state;

public class ClothDiaperBuilder extends DiaperBuilder{
	public ClothDiaperBuilder() {
		this.name = "Cloth Diaper";
	}

	@Override
	public DiaperBuilder addCotton() {
		this.parts.add("Cotton");
		return this;
	}

	@Override
	public DiaperBuilder addBamboo() {
		this.parts.add("Bamboo");
		return this;
	}

	@Override
	public DiaperBuilder addHemp() {
		this.parts.add("Hemp");
		return this;
	}

	@Override
	public DiaperBuilder addCellulose() {
		return this;
	}

	@Override
	public DiaperBuilder addAbsorbentPad() {
		return this;
	}

	@Override
	public DiaperBuilder addNonwovenFabric() {
		return this;
	}

	
	

}


