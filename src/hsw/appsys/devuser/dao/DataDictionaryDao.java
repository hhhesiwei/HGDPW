package hsw.appsys.devuser.dao;

import java.util.List;

import hsw.appsys.entity.DataDictionary;


public interface DataDictionaryDao {
	/**
	 * ����typeName����valueName
	 * @param typeName
	 * @return
	 */
	List<DataDictionary> findDicList(String typeCode);
}
