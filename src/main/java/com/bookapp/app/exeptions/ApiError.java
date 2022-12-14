package com.bookapp.app.exeptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ApiError {
    private String message;
    private LocalDateTime localDateTime;
    private HttpStatus httpStatus;
}
