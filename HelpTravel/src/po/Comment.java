package po;

public class Comment {
    private Integer cid;

    private Integer jid;

    private Integer cto;

    private Integer cform;

    private String content;

    private Integer state;

    private String cdate;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getCto() {
        return cto;
    }

    public void setCto(Integer cto) {
        this.cto = cto;
    }

    public Integer getCform() {
        return cform;
    }

    public void setCform(Integer cform) {
        this.cform = cform;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate == null ? null : cdate.trim();
    }
}