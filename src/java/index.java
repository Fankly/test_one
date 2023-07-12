import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        String encodedString = "dXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNCdXBkYXRlJTIwdXNlciUyMHNldCUyMG5hbWUlMjAlM0QlMjAnJUU0JUI4JUFEJUU2JTk2JTg3JyUyMHdoZXJlJTIwaWQlMjAlM0QlMjAxJTNC";
        try {
            byte[] decodedBytes = base64Decode(encodedString);
            String decodedString = new String(decodedBytes, "UTF-8");
            String decodedURL = urlDecode(decodedString);
            System.out.println(decodedURL);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static byte[] base64Decode(String encodedString) throws UnsupportedEncodingException {
        byte[] encodedBytes = encodedString.getBytes("UTF-8");
        try {
            return new sun.misc.BASE64Decoder().decodeBuffer(new String(encodedBytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String urlDecode(String decodedString) throws UnsupportedEncodingException {
        return java.net.URLDecoder.decode(decodedString, "UTF-8");
    }
}