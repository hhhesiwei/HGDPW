package hsw.appsys.devuser.dao;
import org.apache.ibatis.annotations.Param;
import hsw.appsys.entity.DevUser;
public interface DevUserDao {
	/**
	 * �û���½
	 * @return
	 */
	public DevUser login(@Param("devCode") String devCode);
	
}
