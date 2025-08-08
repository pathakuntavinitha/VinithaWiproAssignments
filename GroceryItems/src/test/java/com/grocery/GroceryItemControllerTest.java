package com.grocery;

import com.controller.GroceryItemController;
import com.entity.GroceryItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.GroceryItemService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GroceryItemController.class)

@ContextConfiguration(classes =GroceryApplication.class)
class GroceryItemControllerTest {

 @Autowired
 private MockMvc mockMvc;

 @MockBean
 private GroceryItemService service;

 @Autowired
 private ObjectMapper objectMapper;

 @Test
 void testCreateItem() throws Exception {
     GroceryItem item = new GroceryItem();
     item.setName("Oil");
     item.setQuantity(1);
     item.setPrice(120);

     when(service.save(any())).thenReturn(item);

     mockMvc.perform(post("/api/grocery")
             .contentType("application/json")
             .content(objectMapper.writeValueAsString(item)))
             .andExpect(status().isOk());
 }
}
