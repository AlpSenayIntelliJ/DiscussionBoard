import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NewsFeed feed = new NewsFeed();
        System.out.println("Msg Test 1: ");
        String test1 = scan.nextLine();
        int dashIndex = test1.indexOf("-");
        String uname = test1.substring(0,dashIndex);
        String msg = test1.substring(dashIndex+1);
        MessagePost mp1 = new MessagePost(uname, msg);
        feed.addMessagePost(mp1);

        System.out.print("Msg Test 2: ");
        test1 = scan.nextLine();
        dashIndex = test1.indexOf("-");
        uname = test1.substring(0,dashIndex);
        msg = test1.substring(dashIndex+1);
        MessagePost mp2 = new MessagePost(uname, msg);
        feed.addMessagePost(mp2);

        System.out.print("Photo Test 1: ");
        String test2 = scan.nextLine();
        int dashIndex1 = test2.indexOf("-");
        int dashIndex2 = test2.indexOf("-",dashIndex1+1);
        uname = test2.substring(0,dashIndex1);
        String photoName = test2.substring(dashIndex1+1, dashIndex2);
        String caption = test2.substring(dashIndex2+1);
        PhotoPost pp = new PhotoPost(uname, photoName, caption);
        feed.addPhotoPost(pp);


        System.out.println("++ Test run of the three posts: ++");
        feed.show();
    }


}
