package util;
import com.thoughtworks.xstream.XStream;
public class XStreamUtility {

    private static final XStream xStream = XStreamFactory.getXStream ();

    /**
     * Javabean 转XML
     * @param t 待转javabean对象
     * @param <T>
     * @return xml字符串
     */
    public static <T> String toXml(T t){
        String headLine = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        return headLine + xStream.toXML ( t );
    }

    /**
     * XML字符串转javabean
     * @param xmlStr xml字符串
     * @param <T>
     * @return Java对象
     */
    public static <T> T toJavaBean(String xmlStr){
        return (T) xStream.fromXML ( xmlStr);
    }
}

