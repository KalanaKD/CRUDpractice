package com.kd.playerSearch.advisor;

import com.kd.playerSearch.exception.NotFoundException;
import com.kd.playerSearch.utils.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotFoundExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> notFoundExceptionHandler(NotFoundException exception){
        return new ResponseEntity<>(
                new StandardResponse(404,"Error occured and handled", exception.getMessage()),HttpStatus.NOT_FOUND
        );
    }
}
