package com.itnwe.Lab128.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itnwe.Lab128.domain.TableSpaceDao;
import com.itnwe.Lab128.mapper.TableSpaceMapper;


@Service
public class TableSpaceService {
	@Autowired private TableSpaceMapper m;
		public List<TableSpaceDao> getTableSpace() {
			return m.getTableSpace();
		}
}
