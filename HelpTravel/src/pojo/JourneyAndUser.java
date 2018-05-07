/**
 * 
 */
package pojo;

/**
 * @author Administrator
 *
 */
public class JourneyAndUser {
	
	   private Integer uid;

	    private String  username;

	    private String password;

	    private String nickname;

	    private String name;

	   

	    private String education;

	    private String sex;

	    private String birthday;

	    private String idno;

	    private String tel;

	    private Integer state;

	    private String qq;

	    public Integer getUid() {
	        return uid;
	    }

	    public void setUid(Integer uid) {
	        this.uid = uid;
	    }

	    public String  getUsername() {
	        return username;
	    }

	    public void setUsername(String  username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password == null ? null : password.trim();
	    }

	    public String getNickname() {
	        return nickname;
	    }

	    public void setNickname(String nickname) {
	        this.nickname = nickname == null ? null : nickname.trim();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }

	  
	    public String getEducation() {
	        return education;
	    }

	    public void setEducation(String education) {
	        this.education = education == null ? null : education.trim();
	    }

	    public String getSex() {
	        return sex;
	    }

	    public void setSex(String sex) {
	        this.sex = sex == null ? null : sex.trim();
	    }

	    public String getBirthday() {
	        return birthday;
	    }

	    public void setBirthday(String birthday) {
	        this.birthday = birthday == null ? null : birthday.trim();
	    }

	    public String getIdno() {
	        return idno;
	    }

	    public void setIdno(String idno) {
	        this.idno = idno == null ? null : idno.trim();
	    }

	    public String getTel() {
	        return tel;
	    }

	    public void setTel(String tel) {
	        this.tel = tel == null ? null : tel.trim();
	    }

	    public Integer getState() {
	        return state;
	    }

	    public void setState(Integer state) {
	        this.state = state;
	    }

	    public String getQq() {
	        return qq;
	    }

	    public void setQq(String qq) {
	        this.qq = qq == null ? null : qq.trim();
	    }
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
