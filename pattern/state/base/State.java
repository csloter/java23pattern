package pattern.state.base;

import pattern.state.Context;

/**
 * �Ƿ�������Ķ�����Ϊ�������ݣ���ϵ���Ƿ�״̬��ת����װ��ʵ�ֵ�״̬����
 * ���������Ķ����С�
 * @author dell990-026
 *
 */
public interface State {
	void execute(Context content);
}
