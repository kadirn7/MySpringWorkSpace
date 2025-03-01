package com.kadirpasaoglu.handler;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.kadirpasaoglu.exception.BaseException;

@ControllerAdvice

public class GlobalExceptionHandler {
    @ExceptionHandler(value={BaseException.class})
    public ResponseEntity<ApiError<String>> handleBaseException(BaseException exception,WebRequest request){
        return ResponseEntity.badRequest().body(createApiError(exception.getMessage(), request));
    }
    
    private String getHostName(){
        try{
            return InetAddress.getLocalHost().getHostName();
        } catch(UnknownHostException e){
            System.out.println("Hata oluştu " +  e.getMessage());
        }
        return null;

    }

    public <T> ApiError<T> createApiError(T message,WebRequest request){
        ApiError<T> apiError=new ApiError<>();
        apiError.setStatus(HttpStatus.BAD_REQUEST.value());
        Exception<T> exception= new Exception<>();
        exception.setCreateTime(new Date(0));
        exception.setHostName(getHostName());
        exception.setPath(request.getDescription(false));
        exception.setMessage(message);

        apiError.setException(exception);
        return apiError;

    }
}
