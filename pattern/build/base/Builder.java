package pattern.build.base;

import pattern.build.Job;

public interface Builder {
	void buildId();
	void buildDesc();
	void buildOwner();
	Job getJob();
}
