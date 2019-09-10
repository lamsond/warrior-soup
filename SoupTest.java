import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.Document;

public class SoupTest{
    public static void main(String[] args){
        try{
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Taco_Tuesday").get();
            System.out.println(doc);
        }
        catch(IOException ex){
            System.out.println("IOException: Hang your head in shame :( ");
        }
    }
}
