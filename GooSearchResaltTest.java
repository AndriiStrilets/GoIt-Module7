package src.main.java.ua.goit.Module7;


public class GooSearchResaltTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com/").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult {
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        int a = url.indexOf("/");
        int b = url.lastIndexOf("/");
        if (b - a == 1) {
            return url.substring(b + 1);
        } else {
            return url.substring(a + 2, b);
        }
    }
}
