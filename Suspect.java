package criminalGame;

public class Suspect {
	private String name;
	private boolean isGuilty;
	
	public Suspect(String name) {
		this.name = name;
		this.isGuilty = false;
	    }
		
		public String getName() {
			return name;
		}
		
		public void setAsGuilty() {
			isGuilty =true;
		}
		
		public boolean isGuilty() {
			return isGuilty;
		
	}

}
