package com.example.servicio4;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class ClientControllerTest {

    private MockMvc mockMvc;

    @Test
    void testCreateClient() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/createClient")
                .contentType("application/json")
                .content("{\"nombre\":\"Juan\",\"apellidoPaterno\":\"Perez\",\"apellidoMaterno\":\"Lopez
