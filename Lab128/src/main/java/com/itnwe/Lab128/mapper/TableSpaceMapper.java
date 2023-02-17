package com.itnwe.Lab128.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.itnwe.Lab128.domain.TableSpaceDao;

@Repository("TableSpaceMapper")
public interface TableSpaceMapper {
	public List<TableSpaceDao> getTableSpace();

}