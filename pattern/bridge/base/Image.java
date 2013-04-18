package pattern.bridge.base;

/**
 * �Ž�ģʽ��ʵ�������
 * @author dell990-026
 *
 */
public abstract class Image {
	//���ʵ����ӿ�
	protected ImageImpl impl;
	
	public void setImpl(ImageImpl impl){
		this.impl = impl;
	}
	
	public abstract void parseFile(String fileName);
}
