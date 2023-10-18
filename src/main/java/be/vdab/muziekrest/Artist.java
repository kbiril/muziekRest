package be.vdab.muziekrest;

import com.fasterxml.jackson.annotation.JsonProperty;

record Artist(long id, String name, @JsonProperty("resource_url") String resourceUrl) {
}
