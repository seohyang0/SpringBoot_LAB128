package com.itnwe.Lab128.domain;

import java.util.List;

import com.itnwe.Lab128.mapper.TableSpaceMapper;

import lombok.Data;

//@Data : @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 모두를 자동으로 적용한다.
@Data
public class TableSpaceDao {
	private String TsName;
	private int MaxSize;
	private int Used;
	private int UsedPer;
	
}
