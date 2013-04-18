package pattern.build;

import pattern.build.base.Builder;

public class Director {
	public static void construct(Builder builder){
		builder.buildId();
		builder.buildDesc();
		builder.buildOwner();
	}
}
