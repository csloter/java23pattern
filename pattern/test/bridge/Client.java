package pattern.test.bridge;

import pattern.test.bridge.base.Reporter;
/**
 * ˵����
 * ��������������ʾ�����ݲɼ�������ά�ȷֿ���ϵͳ�ж��ֱ�����ʾ��ʽ
 * Ҳ�����ж������ݲɼ���ʽ�����Դ��ı��ļ��ж�ȡ�����Դ����ݿ��ж�ȡ��
 * ������ı��ж�ȡ����Ҫ���õ�����api��
 * ά��1��������ʾ��
 * ά��2�����ݲɼ���
 * @author dell990-026
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reporter report = new ReporterWeb();
		report.setData(new LogDataCollection());
		report.showReport();
		
		report.setData(new DbDataCollection());
		report.showReport();
	}

}
