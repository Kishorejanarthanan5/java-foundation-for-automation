package com.kishore.automation.basics.exceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {
    try{
        validateStatus(404);
    } catch (CustomException e){
        System.out.println(e.getMessage());
    }
    }

    static void validateStatus(int statusCode) throws CustomException {
        if(statusCode != 200){
            throw new CustomException("Invalid status code");
        }
    }
}
