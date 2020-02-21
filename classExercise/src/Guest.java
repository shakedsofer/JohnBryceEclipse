
public class Guest {  
	// 
	
	private String name;
	private String id;
	
	
	public Guest (String name,String id ) { 
	//
		this.name=name;	
		this.id=id;
	}

	public Guest (Guest guest) {
		//
		this (guest.name,guest.id);
			
	}
	
	public boolean equals ( Guest other) {
		
		if (id == other.id) {
			
			return true;
		
		}else { 
			return false; 
		}
	
	}	
	
	public String toString(String id) {
	return name;
	
	}
}










