package pattern.bridge.base;

/**
 * 桥接模式的实体抽象类
 * @author dell990-026
 *
 */
public abstract class Image {
	//组合实现类接口
	protected ImageImpl impl;
	
	public void setImpl(ImageImpl impl){
		this.impl = impl;
	}
	
	public abstract void parseFile(String fileName);
}
