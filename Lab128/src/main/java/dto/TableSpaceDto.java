package dto;

import lombok.Data;

//@Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 한번에 설정해주는 어노테이션
@Data 
public class TableSpaceDto {
	private String TsName;
	private int MaxSize;
	private int Used;
	private int UsedPer;
}
