package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.bean.BaseDict;

public interface BaseDictService {
	List<BaseDict> getDictListByTypeCode(String typeCode);
}
