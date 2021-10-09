package state;

import java.util.List;

public class DiaperModel {
	String name;
	List<String> parts;
	public void addParts(List<String> parts) {
		this.parts = parts;
	}
	void padpreparation() {
		System.out.println("padpreparation " + name);
		System.out.println("The materials and collected and are formed into sheets which are then cut into shape . At some point a stretched elastic bands are attached to the back sheet");
		for(String part: parts) {
			System.out.println("   " + part);
		}
	}
	void Formpad() {
		System.out.println(" On a movable conveyer belt the fabric is placed and pressed. then the roller removes a portion and uniforms the thickness.\r\n" + 
				"");
	}
	void PartsArrangement() {
		System.out.println(" The pad, top sheet and bottom sheet are joined by gluing,heating or ultrasonic welding and are then cut into individual diapers.");
	}
	void packpads() {
		System.out.println("Pack Trimmer\n");
	}
	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----");
		for(String part : parts) {
			display.append(part + "\n");
		}
		return display.toString();
	}





}
