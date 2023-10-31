package com.keyin;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class ApiClientTest {
    private WireMockServer wireMockServer;

    @Before
    public void setup() {
        wireMockServer = new WireMockServer(8081);
        wireMockServer.start();
    }

    @After
    public void teardown() {
        wireMockServer.stop();
    }

    @Test
    public void testGetItems() throws Exception {
        stubFor(get(urlEqualTo("/items"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"items\":[{\"id\":1,\"name\":\"Item 1\"}]}")
                )
        );

        ApiClient apiClient = new ApiClient("http://localhost:8081");

        String response = apiClient.getItems();

        // Add your assertions here to verify the response
    }
}

