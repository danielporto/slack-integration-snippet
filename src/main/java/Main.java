import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;


public class Main {

public static void main(String []args) throws Exception{
    String auth = "Get from slack webpage ";
    SlackSession session = SlackSessionFactory.createWebSocketSlackSession(auth);
    session.connect();
    SlackChannel channel = session.findChannelByName("#ramdom");
    session.sendMessage(channel, "Hey there");
    session.disconnect();
}

}

