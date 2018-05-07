package po;

import java.util.ArrayList;
import java.util.List;

public class JourneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JourneyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andJidIsNull() {
            addCriterion("JId is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("JId is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Integer value) {
            addCriterion("JId =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Integer value) {
            addCriterion("JId <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Integer value) {
            addCriterion("JId >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JId >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Integer value) {
            addCriterion("JId <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Integer value) {
            addCriterion("JId <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Integer> values) {
            addCriterion("JId in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Integer> values) {
            addCriterion("JId not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Integer value1, Integer value2) {
            addCriterion("JId between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Integer value1, Integer value2) {
            addCriterion("JId not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andMotifIsNull() {
            addCriterion("Motif is null");
            return (Criteria) this;
        }

        public Criteria andMotifIsNotNull() {
            addCriterion("Motif is not null");
            return (Criteria) this;
        }

        public Criteria andMotifEqualTo(String value) {
            addCriterion("Motif =", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifNotEqualTo(String value) {
            addCriterion("Motif <>", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifGreaterThan(String value) {
            addCriterion("Motif >", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifGreaterThanOrEqualTo(String value) {
            addCriterion("Motif >=", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifLessThan(String value) {
            addCriterion("Motif <", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifLessThanOrEqualTo(String value) {
            addCriterion("Motif <=", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifLike(String value) {
            addCriterion("Motif like", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifNotLike(String value) {
            addCriterion("Motif not like", value, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifIn(List<String> values) {
            addCriterion("Motif in", values, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifNotIn(List<String> values) {
            addCriterion("Motif not in", values, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifBetween(String value1, String value2) {
            addCriterion("Motif between", value1, value2, "motif");
            return (Criteria) this;
        }

        public Criteria andMotifNotBetween(String value1, String value2) {
            addCriterion("Motif not between", value1, value2, "motif");
            return (Criteria) this;
        }

        public Criteria andExecutetimeIsNull() {
            addCriterion("ExecuteTime is null");
            return (Criteria) this;
        }

        public Criteria andExecutetimeIsNotNull() {
            addCriterion("ExecuteTime is not null");
            return (Criteria) this;
        }

        public Criteria andExecutetimeEqualTo(String value) {
            addCriterion("ExecuteTime =", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeNotEqualTo(String value) {
            addCriterion("ExecuteTime <>", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeGreaterThan(String value) {
            addCriterion("ExecuteTime >", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ExecuteTime >=", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeLessThan(String value) {
            addCriterion("ExecuteTime <", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeLessThanOrEqualTo(String value) {
            addCriterion("ExecuteTime <=", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeLike(String value) {
            addCriterion("ExecuteTime like", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeNotLike(String value) {
            addCriterion("ExecuteTime not like", value, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeIn(List<String> values) {
            addCriterion("ExecuteTime in", values, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeNotIn(List<String> values) {
            addCriterion("ExecuteTime not in", values, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeBetween(String value1, String value2) {
            addCriterion("ExecuteTime between", value1, value2, "executetime");
            return (Criteria) this;
        }

        public Criteria andExecutetimeNotBetween(String value1, String value2) {
            addCriterion("ExecuteTime not between", value1, value2, "executetime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRewardIsNull() {
            addCriterion("Reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("Reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(Integer value) {
            addCriterion("Reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(Integer value) {
            addCriterion("Reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(Integer value) {
            addCriterion("Reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("Reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(Integer value) {
            addCriterion("Reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(Integer value) {
            addCriterion("Reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<Integer> values) {
            addCriterion("Reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<Integer> values) {
            addCriterion("Reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(Integer value1, Integer value2) {
            addCriterion("Reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(Integer value1, Integer value2) {
            addCriterion("Reward not between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRequestIsNull() {
            addCriterion("Request is null");
            return (Criteria) this;
        }

        public Criteria andRequestIsNotNull() {
            addCriterion("Request is not null");
            return (Criteria) this;
        }

        public Criteria andRequestEqualTo(String value) {
            addCriterion("Request =", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotEqualTo(String value) {
            addCriterion("Request <>", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThan(String value) {
            addCriterion("Request >", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThanOrEqualTo(String value) {
            addCriterion("Request >=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThan(String value) {
            addCriterion("Request <", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThanOrEqualTo(String value) {
            addCriterion("Request <=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLike(String value) {
            addCriterion("Request like", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotLike(String value) {
            addCriterion("Request not like", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestIn(List<String> values) {
            addCriterion("Request in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotIn(List<String> values) {
            addCriterion("Request not in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestBetween(String value1, String value2) {
            addCriterion("Request between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotBetween(String value1, String value2) {
            addCriterion("Request not between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andTotimeIsNull() {
            addCriterion("ToTime is null");
            return (Criteria) this;
        }

        public Criteria andTotimeIsNotNull() {
            addCriterion("ToTime is not null");
            return (Criteria) this;
        }

        public Criteria andTotimeEqualTo(String value) {
            addCriterion("ToTime =", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotEqualTo(String value) {
            addCriterion("ToTime <>", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeGreaterThan(String value) {
            addCriterion("ToTime >", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeGreaterThanOrEqualTo(String value) {
            addCriterion("ToTime >=", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeLessThan(String value) {
            addCriterion("ToTime <", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeLessThanOrEqualTo(String value) {
            addCriterion("ToTime <=", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeLike(String value) {
            addCriterion("ToTime like", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotLike(String value) {
            addCriterion("ToTime not like", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeIn(List<String> values) {
            addCriterion("ToTime in", values, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotIn(List<String> values) {
            addCriterion("ToTime not in", values, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeBetween(String value1, String value2) {
            addCriterion("ToTime between", value1, value2, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotBetween(String value1, String value2) {
            addCriterion("ToTime not between", value1, value2, "totime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("ConTent is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("ConTent is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("ConTent =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("ConTent <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("ConTent >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("ConTent >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("ConTent <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("ConTent <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("ConTent like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("ConTent not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("ConTent in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("ConTent not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("ConTent between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("ConTent not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TId is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TId is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("TId =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("TId <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("TId >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TId >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("TId <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("TId <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("TId in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("TId not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("TId between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("TId not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andMaxquantityIsNull() {
            addCriterion("MaxQuantity is null");
            return (Criteria) this;
        }

        public Criteria andMaxquantityIsNotNull() {
            addCriterion("MaxQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andMaxquantityEqualTo(Integer value) {
            addCriterion("MaxQuantity =", value, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityNotEqualTo(Integer value) {
            addCriterion("MaxQuantity <>", value, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityGreaterThan(Integer value) {
            addCriterion("MaxQuantity >", value, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxQuantity >=", value, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityLessThan(Integer value) {
            addCriterion("MaxQuantity <", value, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityLessThanOrEqualTo(Integer value) {
            addCriterion("MaxQuantity <=", value, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityIn(List<Integer> values) {
            addCriterion("MaxQuantity in", values, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityNotIn(List<Integer> values) {
            addCriterion("MaxQuantity not in", values, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityBetween(Integer value1, Integer value2) {
            addCriterion("MaxQuantity between", value1, value2, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andMaxquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxQuantity not between", value1, value2, "maxquantity");
            return (Criteria) this;
        }

        public Criteria andIssueridIsNull() {
            addCriterion("IssueRId is null");
            return (Criteria) this;
        }

        public Criteria andIssueridIsNotNull() {
            addCriterion("IssueRId is not null");
            return (Criteria) this;
        }

        public Criteria andIssueridEqualTo(Integer value) {
            addCriterion("IssueRId =", value, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridNotEqualTo(Integer value) {
            addCriterion("IssueRId <>", value, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridGreaterThan(Integer value) {
            addCriterion("IssueRId >", value, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridGreaterThanOrEqualTo(Integer value) {
            addCriterion("IssueRId >=", value, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridLessThan(Integer value) {
            addCriterion("IssueRId <", value, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridLessThanOrEqualTo(Integer value) {
            addCriterion("IssueRId <=", value, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridIn(List<Integer> values) {
            addCriterion("IssueRId in", values, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridNotIn(List<Integer> values) {
            addCriterion("IssueRId not in", values, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridBetween(Integer value1, Integer value2) {
            addCriterion("IssueRId between", value1, value2, "issuerid");
            return (Criteria) this;
        }

        public Criteria andIssueridNotBetween(Integer value1, Integer value2) {
            addCriterion("IssueRId not between", value1, value2, "issuerid");
            return (Criteria) this;
        }

        public Criteria andAstateIsNull() {
            addCriterion("Astate is null");
            return (Criteria) this;
        }

        public Criteria andAstateIsNotNull() {
            addCriterion("Astate is not null");
            return (Criteria) this;
        }

        public Criteria andAstateEqualTo(Integer value) {
            addCriterion("Astate =", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotEqualTo(Integer value) {
            addCriterion("Astate <>", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateGreaterThan(Integer value) {
            addCriterion("Astate >", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Astate >=", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateLessThan(Integer value) {
            addCriterion("Astate <", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateLessThanOrEqualTo(Integer value) {
            addCriterion("Astate <=", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateIn(List<Integer> values) {
            addCriterion("Astate in", values, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotIn(List<Integer> values) {
            addCriterion("Astate not in", values, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateBetween(Integer value1, Integer value2) {
            addCriterion("Astate between", value1, value2, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotBetween(Integer value1, Integer value2) {
            addCriterion("Astate not between", value1, value2, "astate");
            return (Criteria) this;
        }

        public Criteria andIssuetimeIsNull() {
            addCriterion("IssueTime is null");
            return (Criteria) this;
        }

        public Criteria andIssuetimeIsNotNull() {
            addCriterion("IssueTime is not null");
            return (Criteria) this;
        }

        public Criteria andIssuetimeEqualTo(String value) {
            addCriterion("IssueTime =", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeNotEqualTo(String value) {
            addCriterion("IssueTime <>", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeGreaterThan(String value) {
            addCriterion("IssueTime >", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeGreaterThanOrEqualTo(String value) {
            addCriterion("IssueTime >=", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeLessThan(String value) {
            addCriterion("IssueTime <", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeLessThanOrEqualTo(String value) {
            addCriterion("IssueTime <=", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeLike(String value) {
            addCriterion("IssueTime like", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeNotLike(String value) {
            addCriterion("IssueTime not like", value, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeIn(List<String> values) {
            addCriterion("IssueTime in", values, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeNotIn(List<String> values) {
            addCriterion("IssueTime not in", values, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeBetween(String value1, String value2) {
            addCriterion("IssueTime between", value1, value2, "issuetime");
            return (Criteria) this;
        }

        public Criteria andIssuetimeNotBetween(String value1, String value2) {
            addCriterion("IssueTime not between", value1, value2, "issuetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}