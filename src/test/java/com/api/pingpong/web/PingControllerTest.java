package com.api.pingpong.web;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PingControllerTest {

    @Test
    public void testPing() {
        PingController pingController = new PingController();
        ResponseEntity<String> response = pingController.ping();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("pong", response.getBody());
    }
}