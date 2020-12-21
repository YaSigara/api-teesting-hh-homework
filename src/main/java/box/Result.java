package box;

import java.util.List;

public class Result {
    private List<Items> items;
    private Integer found;
    private Integer pages;
    private Integer per_page;
    private Integer page;
    private String clusters;
    private String arguments;
    private String alternate_url;

    public Result(){

    }

    public Result(List<Items> items, Integer found, Integer pages, Integer per_page, Integer page, String clusters, String arguments, String alternate_url) {

        this.items = items;
        this.found = found;
        this.pages = pages;
        this.per_page = per_page;
        this.page = page;
        this.clusters = clusters;
        this.arguments = arguments;
        this.alternate_url = alternate_url;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getClusters() {
        return clusters;
    }

    public void setClusters(String clusters) {
        this.clusters = clusters;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public String getAlternate_url() {
        return alternate_url;
    }

    public void setAlternate_url(String alternate_url) {
        this.alternate_url = alternate_url;
    }

    @Override
    public String toString() {
        return "ResultText{" +
                "items=" + items +
                ", found=" + found +
                ", pages=" + pages +
                ", per_page=" + per_page +
                ", page=" + page +
                ", clusters='" + clusters + '\'' +
                ", arguments='" + arguments + '\'' +
                ", alternate_url='" + alternate_url + '\'' +
                '}';
    }
}
