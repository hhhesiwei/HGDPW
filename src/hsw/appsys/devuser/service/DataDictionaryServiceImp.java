package hsw.appsys.devuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hsw.appsys.devuser.dao.DataDictionaryDao;
import hsw.appsys.entity.DataDictionary;
@Service
public class DataDictionaryServiceImp implements DataDictionaryService {
	@Autowired
	private DataDictionaryDao dataDictionaryDao;
	public void setDataDictionaryDao(DataDictionaryDao dataDictionaryDao) {
		this.dataDictionaryDao = dataDictionaryDao;
	}
	
	@Override
	public List<DataDictionary> findDicList(String typeCode) {
		return dataDictionaryDao.findDicList(typeCode);
	}
}
