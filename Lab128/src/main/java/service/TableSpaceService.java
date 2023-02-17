package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.TableSpaceDao;
import mapper.TableSpaceMapper;

@Service
public class TableSpaceService {
	@Autowired private TableSpaceMapper m;
	public List<TableSpaceDao> getTableSpace(){
        return m.getTableSpace();
    }
}
