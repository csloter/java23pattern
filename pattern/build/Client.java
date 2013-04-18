package pattern.build;

import pattern.build.base.Builder;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Builder build = new JobBuilder();
		Director.construct(build);
		System.out.println(build.getJob());
	}

}
