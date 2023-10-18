package be.vdab.muziekrest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
class ConfigurationRelease {
    @Bean
    Requests request(WebClient.Builder builder, @Value("${discogs.url}") String url) throws Exception {
        var client = builder.baseUrl(url).build();
        var adapter = WebClientAdapter.forClient(client);
        var factory = HttpServiceProxyFactory.builder(adapter).build();
        return factory.createClient(Requests.class);
    }
}
