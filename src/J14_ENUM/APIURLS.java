package J14_ENUM;

enum APIURLS {

    google("https://google.com"),
    katalon("https://katalon.com");

    private String url;

    APIURLS(String url_c) {
        this.url = url_c;
    }

    String getUrl() {
        return this.url;
    }
}
