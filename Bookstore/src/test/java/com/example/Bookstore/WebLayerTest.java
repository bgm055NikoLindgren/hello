package com.example.Bookstore;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.hamcrest.CoreMatchers.containsString;


@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
public class WebLayerTest {
 @Autowired
 private MockMvc mockMvc;
 
 @Test
 public void testDefaultMessage() throws Exception {
 this.mockMvc.perform(MockMvcRequestBuilders.get("/")).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk())
 .andExpect(MockMvcResultMatchers.content().string(containsString("Hello World")));
 }
}
