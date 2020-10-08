package com.laioffer.tinnews.mode;

import java.util.List;
import java.util.Objects;

public class NewsResponse {
    public String status;
    public String code;
    public String messege;
    public Integer totalResults;
    public List<Article> articles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsResponse that = (NewsResponse) o;
        return Objects.equals(status, that.status) &&
                Objects.equals(code, that.code) &&
                Objects.equals(messege, that.messege) &&
                Objects.equals(totalResults, that.totalResults) &&
                Objects.equals(articles, that.articles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, code, messege, totalResults, articles);
    }

    @Override
    public String toString() {
        return "NewsResponse{" +
                "status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", messege='" + messege + '\'' +
                ", totalResults=" + totalResults +
                ", articles=" + articles +
                '}';
    }
}
