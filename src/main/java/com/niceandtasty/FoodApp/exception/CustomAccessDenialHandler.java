package com.niceandtasty.FoodApp.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.niceandtasty.FoodApp.response.Response;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@AllArgsConstructor
public class CustomAccessDenialHandler implements AccessDeniedHandler {
    private final ObjectMapper objectMapper ;

    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException accessDeniedException)
            throws IOException, ServletException {
        Response<?> errorrResponse = Response.builder()
                .statusCode(HttpStatus.UNAUTHORIZED.value()) // 403 forbidden
                .message(accessDeniedException.getMessage())
                .build() ;

        response.setContentType("appliaction/json");
        response.setStatus(HttpStatus.FORBIDDEN.value());
        response.getWriter().write(objectMapper.writeValueAsString(errorrResponse));
    }

    ;
}
