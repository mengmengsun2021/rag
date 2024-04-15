package com.edu.xmu.rag.controller.vo;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KnowledgeBaseVo {
    @NotBlank(message = "Id不能为空")
    private Long id;
    private String code;
    private String description;
    private Integer status;
    private Long userId;
}
