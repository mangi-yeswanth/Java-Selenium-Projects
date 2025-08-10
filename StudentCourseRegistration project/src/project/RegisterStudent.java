package project;

public abstract class RegisterStudent {
	
	    private String id;
	    private String name;

	    public RegisterStudent(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    
	}
