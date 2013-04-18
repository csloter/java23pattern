package pattern.build;

public class Job {
	private long id;
	private String desc;
	private String owner;
	
	public Job(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Job(long id,String desc,String owner){
		this.id = id;
		this.desc = desc;
		this.owner = owner;
	}
}
