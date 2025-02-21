package ai.traceable.websocket_echo_app;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {
    @MessageMapping("/echo")
    @SendTo("/topic/messages")
    public Message message(Message message) {
        return new Message("Your message was: " + HtmlUtils.htmlEscape(message.getMessage()));
    }
}
