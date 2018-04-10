package hsw.appsys.entity;

import java.util.Date;

public class AppInfo {
	private int id;
	private String softwareName;
	private String APKName;
	private String supportROM ;
	private String interfaceLanguage;
	private double softwareSize;
	private Date updateDate;
	private int devId;
	private String appInfo;
	private int status;	//App状态
	private String statusName;
	private Date onSaleDate; //上架时间
	private Date offSaleDate; //下架时间
	private int flatformId; //平台
	private String flateformName;
	private int downloads; //下载次数
	private int createdBy;
	private Date creationDate;
	private int modifyBy;
	private Date modifyDate;
	//private int categoryLevel1; //1级分类
	private AppCategory cateLevel1;
	//private int categoryLevel2 ;//2级分类
	private AppCategory cateLevel2;
	//private int categoryLevel3 ;//3级分类
	private AppCategory cateLevel3;
	private String logoPicPath; //应用图片路径
	private String logoLocPath;
	//private int versionId ; //版本ID
	private AppVersion version;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public double getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(double softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getFlateformName() {
		return flateformName;
	}
	public void setFlateformName(String flateformName) {
		this.flateformName = flateformName;
	}
	public AppCategory getCateLevel1() {
		return cateLevel1;
	}
	public void setCateLevel1(AppCategory cateLevel1) {
		this.cateLevel1 = cateLevel1;
	}
	public AppCategory getCateLevel2() {
		return cateLevel2;
	}
	public void setCateLevel2(AppCategory cateLevel2) {
		this.cateLevel2 = cateLevel2;
	}
	public AppCategory getCateLevel3() {
		return cateLevel3;
	}
	public void setCateLevel3(AppCategory cateLevel3) {
		this.cateLevel3 = cateLevel3;
	}
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public int getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(int flatformId) {
		this.flatformId = flatformId;
	}
	
	public int getDownloads() {
		return downloads;
	}
	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public AppVersion getVersion() {
		return version;
	}
	public void setVersion(AppVersion version) {
		this.version = version;
	}
	
}
