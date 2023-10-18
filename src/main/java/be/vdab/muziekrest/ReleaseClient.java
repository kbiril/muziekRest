package be.vdab.muziekrest;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class ReleaseClient {
    private final Requests requests;
    public ReleaseClient(Requests requests) {
        this.requests = requests;
    }

    public Optional<ReleaseResponse> findById(long id) {
        try {
            var response = requests.findById(id);

            return Optional.of(new ReleaseResponse(response.id(), response.year(), response.title(),
                    response.artists()));
        } catch (WebClientResponseException.NotFound ex) {
            return Optional.empty();
        }
    }
}
