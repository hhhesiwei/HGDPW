package hsw.appsys.devuser.service;

import java.util.List;

import hsw.appsys.entity.DataDictionary;

public interface DataDictionaryService {
	/**
	 * ����typeName����valueName
	 * @param typeName
	 * @return
	 */
	List<DataDictionary> findDicList(String typeCode);
}
