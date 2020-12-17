package box;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {
    private long id;
    private boolean premium;
    private String name;
    private Object department;
    private boolean has_test;
    private boolean response_letter_required;
    private Object area;
    private Object salary;
    private Object type;
    private Object address;
    private String response_url;
    private Object sort_point_distance;
    private Object employer;
    private String published_at;
    private String created_at;
    private boolean archived;
    private String apply_alternate_url;
    private Object insider_interview;
    private String url;
    private String alternate_url;
    private Collection<Object> relations;
    private Object snippet;
    private Object contacts;
    private Object schedule;
    private List<Object> working_days;
    private List<Object> working_time_intervals;
    private List<Object> working_time_modes;
    private boolean accept_temporary;

    public Items(){

    }

    public Items(long id, boolean premium, String name, Object department, boolean has_test, boolean response_letter_required, Object area, Object salary, Object type, Object address, String response_url, Object sort_point_distance, Object employer, String published_at, String created_at, boolean archived, String apply_alternate_url, Object insider_interview, String url, String alternate_url, Collection<Object> relations, Object snippet, Object contacts, Object schedule, List<Object> working_days, List<Object> working_time_intervals, List<Object> working_time_modes, boolean accept_temporary) {
        this.id = id;
        this.premium = premium;
        this.name = name;
        this.department = department;
        this.has_test = has_test;
        this.response_letter_required = response_letter_required;
        this.area = area;
        this.salary = salary;
        this.type = type;
        this.address = address;
        this.response_url = response_url;
        this.sort_point_distance = sort_point_distance;
        this.employer = employer;
        this.published_at = published_at;
        this.created_at = created_at;
        this.archived = archived;
        this.apply_alternate_url = apply_alternate_url;
        this.insider_interview = insider_interview;
        this.url = url;
        this.alternate_url = alternate_url;
        this.relations = relations;
        this.snippet = snippet;
        this.contacts = contacts;
        this.schedule = schedule;
        this.working_days = working_days;
        this.working_time_intervals = working_time_intervals;
        this.working_time_modes = working_time_modes;
        this.accept_temporary = accept_temporary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDepartamnend() {
        return department;
    }

    public void setDepartamnend(Object departamnend) {
        this.department = departamnend;
    }

    public boolean isHas_test() {
        return has_test;
    }

    public void setHas_test(boolean has_test) {
        this.has_test = has_test;
    }

    public boolean isResponse_letter_required() {
        return response_letter_required;
    }

    public void setResponse_letter_required(boolean response_letter_required) {
        this.response_letter_required = response_letter_required;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public Object getSalaty() {
        return salary;
    }

    public void setSalaty(Object salaty) {
        this.salary = salaty;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public String getResponse_url() {
        return response_url;
    }

    public void setResponse_url(String response_url) {
        this.response_url = response_url;
    }

    public Object getSort_point_distance() {
        return sort_point_distance;
    }

    public void setSort_point_distance(Object sort_point_distance) {
        this.sort_point_distance = sort_point_distance;
    }

    public Object getEmployer() {
        return employer;
    }

    public void setEmployer(Object employer) {
        this.employer = employer;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getApply_alternate_url() {
        return apply_alternate_url;
    }

    public void setApply_alternate_url(String apply_alternate_url) {
        this.apply_alternate_url = apply_alternate_url;
    }

    public Object getInsider_interview() {
        return insider_interview;
    }

    public void setInsider_interview(Object insider_interview) {
        this.insider_interview = insider_interview;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlternate_url() {
        return alternate_url;
    }

    public void setAlternate_url(String alternate_url) {
        this.alternate_url = alternate_url;
    }

    public Collection<Object> getRelations() {
        return relations;
    }

    public void setRelations(Collection<Object> relations) {
        this.relations = relations;
    }

    public Object getSnippet() {
        return snippet;
    }

    public void setSnippet(Object snippet) {
        this.snippet = snippet;
    }

    public Object getContacts() {
        return contacts;
    }

    public void setContacts(Object contacts) {
        this.contacts = contacts;
    }

    public Object getSchedule() {
        return schedule;
    }

    public void setSchedule(Object schedule) {
        this.schedule = schedule;
    }

    public List<Object> getWorking_days() {
        return working_days;
    }

    public void setWorking_days(List<Object> working_days) {
        this.working_days = working_days;
    }

    public List<Object> getWorking_time_intervals() {
        return working_time_intervals;
    }

    public void setWorking_time_intervals(List<Object> working_time_intervals) {
        this.working_time_intervals = working_time_intervals;
    }

    public List<Object> getWorking_time_modes() {
        return working_time_modes;
    }

    public void setWorking_time_modes(List<Object> working_time_modes) {
        this.working_time_modes = working_time_modes;
    }

    public boolean isAccept_temporary() {
        return accept_temporary;
    }

    public void setAccept_temporary(boolean accept_temporary) {
        this.accept_temporary = accept_temporary;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", premium=" + premium +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", has_test=" + has_test +
                ", response_letter_required=" + response_letter_required +
                ", area=" + area +
                ", salary=" + salary +
                ", type=" + type +
                ", address=" + address +
                ", response_url='" + response_url + '\'' +
                ", sort_point_distance=" + sort_point_distance +
                ", employer=" + employer +
                ", published_at='" + published_at + '\'' +
                ", created_at='" + created_at + '\'' +
                ", archived=" + archived +
                ", apply_alternate_url='" + apply_alternate_url + '\'' +
                ", insider_interview=" + insider_interview +
                ", url='" + url + '\'' +
                ", alternate_url='" + alternate_url + '\'' +
                ", relations=" + relations +
                ", snippet=" + snippet +
                ", contacts=" + contacts +
                ", schedule=" + schedule +
                ", working_days=" + working_days +
                ", working_time_intervals=" + working_time_intervals +
                ", working_time_modes=" + working_time_modes +
                ", accept_temporary=" + accept_temporary +
                '}';
    }
}
