package hsw.appsys.devuser.dao;

import java.util.List;

import hsw.appsys.entity.DataDictionary;


public interface DataDictionaryDao {
	/**
	 * ¸ù¾ÝtypeName²éÕÒvalueName
	 * @param typeName
	 * @return
	 */
	List<DataDictionary> findDicList(String typeCode);
}
