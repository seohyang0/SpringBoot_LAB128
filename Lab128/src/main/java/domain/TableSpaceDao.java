package domain;

import java.util.List;

import lombok.Data;
import mapper.TableSpaceMapper;

//@Data : @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 모두를 자동으로 적용한다.
@Data
public class TableSpaceDao {
	private String TsName;
	private int MaxSize;
	private int Used;
	private int UsedPer;
	
}
