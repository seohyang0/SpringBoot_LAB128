package com.itnwe.Lab128.TableSpace.dto;

import lombok.Data;

//@Data : @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 모두를 자동으로 적용한다.
@Data
public class TableSpaceDto {
	private String TABLESPACENAME;
	private String MAXSIZE;
	private String USED;
	private String USEDPER;
}
