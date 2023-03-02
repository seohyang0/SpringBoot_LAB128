package com.itnwe.Lab128.TableSpace.service;

import java.util.List;

import com.itnwe.Lab128.TableSpace.dto.TableSpaceLabelDto;

public interface TableSpaceLabelService {
	List<TableSpaceLabelDto> selectTableSpaceLabelList() throws Exception;
}
