package pattern.build;

import pattern.build.base.Builder;

public class JobBuilder implements Builder {

	private Job job = new Job();
	@Override
	public void buildId() {
		job.setId(100);
	}

	@Override
	public void buildDesc() {
		job.setDesc("desc");
	}

	@Override
	public void buildOwner() {
		job.setOwner("owner");
	}
	
	public Job getJob(){
		System.out.println("id" + this.job.getId());
		return this.job;
	}

}
