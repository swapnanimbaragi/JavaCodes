package Set;
import java.util.*;
public class URLCompanyExtractor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter url");
        String s=scan.nextLine();
        String arr[]=s.split(",");
        TreeSet<String> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            String url = arr[i].trim();
            if (url.startsWith("http://")) {
                url = url.substring(7);
            }
            else if (url.startsWith("https://")) {
                url = url.substring(8);
            }
            if (url.startsWith("www.")) {
                url = url.substring(4);
            }
            if (url.endsWith(".com")) {
                url = url.substring(0, url.length() - 4);
            }
            else if (url.endsWith(".org")) {
                url = url.substring(0, url.length() - 4);
            }
            else if (url.endsWith(".net")) {
                url = url.substring(0, url.length() - 4);
            }   
            set.add(url);
        }
        for(String word : set)
        {
            System.out.println(word+" ");
        }
    }
}
