package po;

public class Journey {
    @Override
	public String toString() {
		return "Journey [jid=" + jid + ", motif=" + motif + ", executetime=" + executetime + ", address=" + address
				+ ", reward=" + reward + ", request=" + request + ", totime=" + totime + ", content=" + content
				+ ", tid=" + tid + ", maxquantity=" + maxquantity + ", issuerid=" + issuerid + ", astate=" + astate
				+ ", issuetime=" + issuetime + "]";
	}

	private Integer jid;

    private String motif;

    private String executetime;

    private String address;

    private Integer reward;

    private String request;

    private String totime;

    private String content;

    private Integer tid;

    private Integer maxquantity;

    private Integer issuerid;

    private Integer astate;

    private String issuetime;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif == null ? null : motif.trim();
    }

    public String getExecutetime() {
        return executetime;
    }

    public void setExecutetime(String executetime) {
        this.executetime = executetime == null ? null : executetime.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getTotime() {
        return totime;
    }

    public void setTotime(String totime) {
        this.totime = totime == null ? null : totime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getMaxquantity() {
        return maxquantity;
    }

    public void setMaxquantity(Integer maxquantity) {
        this.maxquantity = maxquantity;
    }

    public Integer getIssuerid() {
        return issuerid;
    }

    public void setIssuerid(Integer issuerid) {
        this.issuerid = issuerid;
    }

    public Integer getAstate() {
        return astate;
    }

    public void setAstate(Integer astate) {
        this.astate = astate;
    }

    public String getIssuetime() {
        return issuetime;
    }

    public void setIssuetime(String issuetime) {
        this.issuetime = issuetime == null ? null : issuetime.trim();
    }
}