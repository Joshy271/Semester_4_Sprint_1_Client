package com.keyin;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class HTTPClient {
    private final CloseableHttpClient httpClient;

    public HTTPClient() {
        // Configure custom truststore with TrustManager
        try {
            TrustManager[] trustAllCertificates = new TrustManager[]{
                    new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }

                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }
                    }
            };

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCertificates, null);

            this.httpClient = HttpClients.custom()
                    .setSslcontext(sslContext)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to configure SSL context.");
        }
    }

    public String fetchCityData() {
        return fetchData("http://localhost:8080/cities");
    }

    public String fetchPassengerData() {
        return fetchData("http://localhost:8080/passengers");
    }

    public String fetchAircraftData() {
        return fetchData("http://localhost:8080/aircrafts");
    }

    public String fetchAirportData() {
        return fetchData("http://localhost:8080/airports");
    }

    private String fetchData(String url) {
        try {
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);

            if (response.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(response.getEntity());
            } else {
                System.err.println("HTTP request failed with status code: " + response.getStatusLine().getStatusCode());
            }

            response.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Failed to fetch data.";
    }

    public void close() {
        try {
            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


