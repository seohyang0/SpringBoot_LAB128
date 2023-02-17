package mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import domain.TableSpaceDao;


@Repository("TableSpaceMapper")
public interface TableSpaceMapper {
	public List<TableSpaceDao> getTableSpace();

}