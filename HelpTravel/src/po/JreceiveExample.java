package po;

import java.util.ArrayList;
import java.util.List;

public class JreceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JreceiveExample() {
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

        public Criteria andJridIsNull() {
            addCriterion("JRId is null");
            return (Criteria) this;
        }

        public Criteria andJridIsNotNull() {
            addCriterion("JRId is not null");
            return (Criteria) this;
        }

        public Criteria andJridEqualTo(Integer value) {
            addCriterion("JRId =", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridNotEqualTo(Integer value) {
            addCriterion("JRId <>", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridGreaterThan(Integer value) {
            addCriterion("JRId >", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridGreaterThanOrEqualTo(Integer value) {
            addCriterion("JRId >=", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridLessThan(Integer value) {
            addCriterion("JRId <", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridLessThanOrEqualTo(Integer value) {
            addCriterion("JRId <=", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridIn(List<Integer> values) {
            addCriterion("JRId in", values, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridNotIn(List<Integer> values) {
            addCriterion("JRId not in", values, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridBetween(Integer value1, Integer value2) {
            addCriterion("JRId between", value1, value2, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridNotBetween(Integer value1, Integer value2) {
            addCriterion("JRId not between", value1, value2, "jrid");
            return (Criteria) this;
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

        public Criteria andRidIsNull() {
            addCriterion("RId is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RId is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("RId =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("RId <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("RId >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RId >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("RId <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("RId <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("RId in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("RId not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("RId between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("RId not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNull() {
            addCriterion("RTime is null");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNotNull() {
            addCriterion("RTime is not null");
            return (Criteria) this;
        }

        public Criteria andRtimeEqualTo(String value) {
            addCriterion("RTime =", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotEqualTo(String value) {
            addCriterion("RTime <>", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThan(String value) {
            addCriterion("RTime >", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThanOrEqualTo(String value) {
            addCriterion("RTime >=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThan(String value) {
            addCriterion("RTime <", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThanOrEqualTo(String value) {
            addCriterion("RTime <=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLike(String value) {
            addCriterion("RTime like", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotLike(String value) {
            addCriterion("RTime not like", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeIn(List<String> values) {
            addCriterion("RTime in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotIn(List<String> values) {
            addCriterion("RTime not in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeBetween(String value1, String value2) {
            addCriterion("RTime between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotBetween(String value1, String value2) {
            addCriterion("RTime not between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andJrstateIsNull() {
            addCriterion("JRState is null");
            return (Criteria) this;
        }

        public Criteria andJrstateIsNotNull() {
            addCriterion("JRState is not null");
            return (Criteria) this;
        }

        public Criteria andJrstateEqualTo(Integer value) {
            addCriterion("JRState =", value, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateNotEqualTo(Integer value) {
            addCriterion("JRState <>", value, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateGreaterThan(Integer value) {
            addCriterion("JRState >", value, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("JRState >=", value, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateLessThan(Integer value) {
            addCriterion("JRState <", value, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateLessThanOrEqualTo(Integer value) {
            addCriterion("JRState <=", value, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateIn(List<Integer> values) {
            addCriterion("JRState in", values, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateNotIn(List<Integer> values) {
            addCriterion("JRState not in", values, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateBetween(Integer value1, Integer value2) {
            addCriterion("JRState between", value1, value2, "jrstate");
            return (Criteria) this;
        }

        public Criteria andJrstateNotBetween(Integer value1, Integer value2) {
            addCriterion("JRState not between", value1, value2, "jrstate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("CDate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("CDate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(String value) {
            addCriterion("CDate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(String value) {
            addCriterion("CDate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(String value) {
            addCriterion("CDate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(String value) {
            addCriterion("CDate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(String value) {
            addCriterion("CDate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(String value) {
            addCriterion("CDate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLike(String value) {
            addCriterion("CDate like", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotLike(String value) {
            addCriterion("CDate not like", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<String> values) {
            addCriterion("CDate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<String> values) {
            addCriterion("CDate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(String value1, String value2) {
            addCriterion("CDate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(String value1, String value2) {
            addCriterion("CDate not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCstateIsNull() {
            addCriterion("CState is null");
            return (Criteria) this;
        }

        public Criteria andCstateIsNotNull() {
            addCriterion("CState is not null");
            return (Criteria) this;
        }

        public Criteria andCstateEqualTo(Integer value) {
            addCriterion("CState =", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotEqualTo(Integer value) {
            addCriterion("CState <>", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThan(Integer value) {
            addCriterion("CState >", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CState >=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThan(Integer value) {
            addCriterion("CState <", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThanOrEqualTo(Integer value) {
            addCriterion("CState <=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateIn(List<Integer> values) {
            addCriterion("CState in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotIn(List<Integer> values) {
            addCriterion("CState not in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateBetween(Integer value1, Integer value2) {
            addCriterion("CState between", value1, value2, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotBetween(Integer value1, Integer value2) {
            addCriterion("CState not between", value1, value2, "cstate");
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