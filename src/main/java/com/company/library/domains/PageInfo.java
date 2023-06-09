package com.company.library.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo {

    private Integer number;
    private Integer totalPages;
    private Boolean hasPrevious;
    private Boolean hasNext;
}
