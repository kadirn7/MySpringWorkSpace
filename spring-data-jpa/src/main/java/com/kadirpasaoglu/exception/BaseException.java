package com.kadirpasaoglu.exception;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class BaseException extends RuntimeException  {

        public BaseException(ErrorMessage errorMessage){
             super(errorMessage.prepareErrorMessage());   
        }
        
}
