package mathias.vanhack.skip.auth.dto;

import java.io.Serializable;
import java.util.Objects;

public class ResponseMessage implements Serializable {

    private int status;
    private String message;

    public ResponseMessage(int status) {
        this.status = status;
    }

    public ResponseMessage(int status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseMessage that = (ResponseMessage) o;
        return status == that.status &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {

        return Objects.hash(status, message);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
