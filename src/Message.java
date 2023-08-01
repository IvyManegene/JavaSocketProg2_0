import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {

    @Serial
    private static  final  long serialVersionUID = 1L;

    public String content;
    public String sender;
    public LocalDateTime timestamp;

    public Message(String sender,String content){
        this.sender = sender;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
