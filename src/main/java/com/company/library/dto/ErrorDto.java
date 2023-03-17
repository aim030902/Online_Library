package com.company.library.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ErrorDto {
    private String message;
    private String detailedMessage;
    private String path;
    @Builder.Default
    private Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
}
