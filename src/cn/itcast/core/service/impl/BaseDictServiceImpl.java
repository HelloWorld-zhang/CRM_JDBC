package cn.itcast.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.bean.BaseDict;
import cn.itcast.core.dao.BaseDictDao;
import cn.itcast.core.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictDao baseDictDao;
	
	@Override
	public List<BaseDict> getDictListByTypeCode(String typeCode) {
			List<BaseDict> list = baseDictDao.getDictListByTypeCode(typeCode);
		return list;
	}

}
