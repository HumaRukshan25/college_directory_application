package org.jsp.college_directory_application.exeptionclasses;

import lombok.Builder;

@Builder
public class InvalidCredentialException extends RuntimeException {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}



