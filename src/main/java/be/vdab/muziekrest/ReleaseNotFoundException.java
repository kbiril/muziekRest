package be.vdab.muziekrest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ReleaseNotFoundException extends RuntimeException{
    public ReleaseNotFoundException() {
        super("Release not found");
    }
}
