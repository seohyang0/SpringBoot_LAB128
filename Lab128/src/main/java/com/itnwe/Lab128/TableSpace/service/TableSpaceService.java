package com.itnwe.Lab128.TableSpace.service;

import java.util.List;

import com.itnwe.Lab128.TableSpace.dto.TableSpaceDto;

public interface TableSpaceService {

    List<TableSpaceDto> selectTableSpaceList() throws Exception;

}