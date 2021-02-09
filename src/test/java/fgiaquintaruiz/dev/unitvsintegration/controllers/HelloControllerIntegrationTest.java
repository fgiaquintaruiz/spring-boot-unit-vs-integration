package fgiaquintaruiz.dev.unitvsintegration.controllers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.test.context.junit.jupiter.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDefaultHelloWorld() throws Exception {
        RequestBuilder rq = MockMvcRequestBuilders.get("/hello");
        MvcResult result = mockMvc.perform(rq).andReturn();
        assertEquals("Hello, World", result.getResponse().getContentAsString());
    }

    @Test
    public void shouldReturnHelloWithTheSendedParameter() throws Exception {
        MvcResult result = mockMvc.perform(get("/hello?name=Fabio")).andReturn();
        assertEquals("Hello, Fabio", result.getResponse().getContentAsString());
    }
}