package state;

import java.util.*;

public abstract class DiaperBuilder {
	String name;
	List<String> parts = new ArrayList<String>();
	public abstract DiaperBuilder addCotton();
	public abstract DiaperBuilder addBamboo();
	public abstract DiaperBuilder addHemp();
	public abstract DiaperBuilder addCellulose();
	public abstract DiaperBuilder addAbsorbentPad();
	public abstract DiaperBuilder addNonwovenFabric();

	public DiaperModel build() {
		DiaperModel diaperModel = new DiaperModel();

		diaperModel.setName(this.name);
		diaperModel.addParts(parts);
		return diaperModel;
	}
}

