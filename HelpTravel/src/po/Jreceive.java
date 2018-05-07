package po;

public class Jreceive {
    private Integer jrid;

    private Integer jid;

    private Integer rid;

    private String rtime;

    private Integer jrstate;

    private String content;

    private String cdate;

    private Integer cstate;

    public Integer getJrid() {
        return jrid;
    }

    public void setJrid(Integer jrid) {
        this.jrid = jrid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime == null ? null : rtime.trim();
    }

    public Integer getJrstate() {
        return jrstate;
    }

    public void setJrstate(Integer jrstate) {
        this.jrstate = jrstate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate == null ? null : cdate.trim();
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }
}