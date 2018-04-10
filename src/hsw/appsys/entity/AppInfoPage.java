package hsw.appsys.entity;
/**
 * 处理分页
 * @author monkey
 *
 */
public class AppInfoPage extends AppInfo{
	private int startIndex;//初始记录
	private int pageRows ;//每页显示的记录数
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
