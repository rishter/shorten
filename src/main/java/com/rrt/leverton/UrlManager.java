package com.rrt.leverton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UrlManager {
    private HashMap<String, String> urls = new HashMap<String, String>();
    private HashMap<String, String> reverseUrls = new HashMap<String, String>();
    HashAdler32 hashAdler32 = new HashAdler32();


    public synchronized List<ShortenedUrl> addUrl(String url) {
        if (!urls.containsKey(url)) {
            String shortened = hashAdler32.adler32String(url);
            urls.put(url, shortened);
            reverseUrls.put(shortened, url);
        }
        return getUrls();
    }

    public synchronized List<ShortenedUrl> getUrls() {
        List<ShortenedUrl> urlList = new ArrayList<ShortenedUrl>();
        for (String url: urls.keySet()) {
            urlList.add(new ShortenedUrl(url, urls.get(url)));

        }
        return urlList;
    }

    public synchronized List<ShortenedUrl> removeUrl(String url) {
        if (urls.containsKey(url)) {
            String shortened = urls.get(url);
            reverseUrls.remove(shortened);
            urls.remove(url);
        }

        return getUrls();
    }

    public synchronized String getUrlFromHash(String shortened) {
        return reverseUrls.get(shortened);
    }
}
