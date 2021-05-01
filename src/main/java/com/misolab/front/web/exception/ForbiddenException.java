package com.misolab.front.web.exception;

import com.misolab.front.web.ApiStatus;

/**
 * @author ock
 */
public class ForbiddenException extends ApiException {
    /**
     *
     */
    public ForbiddenException() {
        super(ApiStatus.FORBIDDEN, "");
    }

    /**
     * @param message
     */
    public ForbiddenException(String message) {
        super(ApiStatus.FORBIDDEN, message);
    }
}
