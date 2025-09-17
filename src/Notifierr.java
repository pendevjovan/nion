import java.util.*;
import java.util.Arrays;
import java.util.regex.*;

interface Notifier {
    void send(Message m);
}

abstract class Message {
    protected final String to;
    protected final String body;

    protected Message(String to, String body) {
        this.to = to;
        this.body = body;
    }

    public abstract boolean validate();

    public String to() {
        return to;
    }

    public String body() {
        return body;
    }
}

class EmailMessage extends Message {
    public EmailMessage(String to, String body) {
        super(to, body);
    }

    @Override
    public boolean validate() {
        return to != null && to.contains("@");
    }
}

class SmsMessage extends Message {
    private static final Pattern P = Pattern.compile("\\d{9,15}");

    public SmsMessage(String to, String body) {
        super(to, body);
    }

    @Override
    public boolean validate() {
        return to != null && P.matcher(to).matches();
    }
}

class EmailNotifier implements Notifier {
    @Override
    public void send(Message m) {
        if (!m.validate()) throw new IllegalArgumentException("Invalid email");
        System.out.println("EMAIL -> " + m.to() + ": " + m.body());
    }
}

class SmsNotifier implements Notifier {
    @Override
    public void send(Message m) {
        if (!m.validate()) throw new IllegalArgumentException("Invalid phone");
        System.out.println("SMS -> " + m.to() + ": " + m.body());
    }
}

public class Notifierr {
    public static void main(String[] args) {
        List<Notifier> channels = Arrays.asList(new EmailNotifier(), new SmsNotifier());
        Message e = new EmailMessage("alice@example.com", "Welcome!");
        Message s = new SmsMessage("38971234567", "Code: 123456");
        for (Notifier n : channels) {
            n.send(n instanceof EmailNotifier ? e : s);
        }
    }
}