package cn.itcast.core.dao;

import java.util.List;

import cn.itcast.core.bean.BaseDict;

public interface BaseDictDao {
	List<BaseDict> getDictListByTypeCode(String typeCode);
}
