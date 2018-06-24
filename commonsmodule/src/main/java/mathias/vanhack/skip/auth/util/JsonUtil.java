package mathias.vanhack.skip.auth.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private final static ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper().findAndRegisterModules();
    }

    public static <T> String toJson(final T object) {

        try {

            return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Erro transforming object to json.", e);
        }

    }

    public static <T> T fromJson(final String json, final Class<T> type) {

        try {

            return MAPPER.readValue(json, type);
        } catch (IOException e) {
            throw new RuntimeException("Erro transforming object to json.", e);
        }

    }

}
