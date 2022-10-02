package com.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class DoacaoDTO {

	private Long id;
	
	private BigDecimal valor;
		
	private Long aluno;
}
