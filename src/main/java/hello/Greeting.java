package hello;

public class Greeting {

    private long id;
    public void setId(long id) {
		this.id = id;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setAge(long age) {
		this.age = age;
	}
	private String content;
    private long age;

    public Greeting(long id, String content, long age) {
        this.id = id;
        this.content = content;
        this.age = age;
    }
    public Greeting() {
    	
    }
    

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public long getAge() {
    	return age;
    }
}
