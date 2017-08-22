package com.rrt.leverton;

public class ShortenedUrl {
    private String url;
    private String shortened;

    public ShortenedUrl(String url, String shortened) {
        this.url = url;
        this.shortened = shortened;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortened() {
        return shortened;
    }

    public void setShortened(String shortened) {
        this.shortened = shortened;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShortenedUrl that = (ShortenedUrl) o;

        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        return shortened != null ? shortened.equals(that.shortened) : that.shortened == null;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (shortened != null ? shortened.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShortenedUrl{" +
                "url='" + url + '\'' +
                ", shortened='" + shortened + '\'' +
                '}';
    }
}
