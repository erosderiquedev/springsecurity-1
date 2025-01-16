package io.erosutuidev.springsecurity.controllers.dto;

public record AuthResponse(String accessToken, Long expiresIn) {
}
