package com.itnwe.Lab128.service;

import java.util.List;
import com.itnwe.Lab128.dto.TableSpaceDto;

public interface TableSpaceService {

    List<TableSpaceDto> selectTableSpaceList() throws Exception;

}