package hsw.appsys.entity;
/**
 * �����ҳ
 * @author monkey
 *
 */
public class AppInfoPage extends AppInfo{
	private int startIndex;//��ʼ��¼
	private int pageRows ;//ÿҳ��ʾ�ļ�¼��
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getPageRows() {
		return pageRows;
	}
	public void setPageRows(int pageRows) {
		this.pageRows = pageRows;
	}
	
}
