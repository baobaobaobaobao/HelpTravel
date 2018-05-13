package po;

import java.util.ArrayList;
import java.util.List;

public class FriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FId is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FId is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("FId =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("FId <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("FId >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FId >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("FId <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("FId <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("FId in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("FId not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("FId between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("FId not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andUidoneIsNull() {
            addCriterion("UidOne is null");
            return (Criteria) this;
        }

        public Criteria andUidoneIsNotNull() {
            addCriterion("UidOne is not null");
            return (Criteria) this;
        }

        public Criteria andUidoneEqualTo(Integer value) {
            addCriterion("UidOne =", value, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneNotEqualTo(Integer value) {
            addCriterion("UidOne <>", value, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneGreaterThan(Integer value) {
            addCriterion("UidOne >", value, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("UidOne >=", value, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneLessThan(Integer value) {
            addCriterion("UidOne <", value, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneLessThanOrEqualTo(Integer value) {
            addCriterion("UidOne <=", value, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneIn(List<Integer> values) {
            addCriterion("UidOne in", values, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneNotIn(List<Integer> values) {
            addCriterion("UidOne not in", values, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneBetween(Integer value1, Integer value2) {
            addCriterion("UidOne between", value1, value2, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidoneNotBetween(Integer value1, Integer value2) {
            addCriterion("UidOne not between", value1, value2, "uidone");
            return (Criteria) this;
        }

        public Criteria andUidtwoIsNull() {
            addCriterion("UidTwo is null");
            return (Criteria) this;
        }

        public Criteria andUidtwoIsNotNull() {
            addCriterion("UidTwo is not null");
            return (Criteria) this;
        }

        public Criteria andUidtwoEqualTo(Integer value) {
            addCriterion("UidTwo =", value, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoNotEqualTo(Integer value) {
            addCriterion("UidTwo <>", value, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoGreaterThan(Integer value) {
            addCriterion("UidTwo >", value, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("UidTwo >=", value, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoLessThan(Integer value) {
            addCriterion("UidTwo <", value, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoLessThanOrEqualTo(Integer value) {
            addCriterion("UidTwo <=", value, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoIn(List<Integer> values) {
            addCriterion("UidTwo in", values, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoNotIn(List<Integer> values) {
            addCriterion("UidTwo not in", values, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoBetween(Integer value1, Integer value2) {
            addCriterion("UidTwo between", value1, value2, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andUidtwoNotBetween(Integer value1, Integer value2) {
            addCriterion("UidTwo not between", value1, value2, "uidtwo");
            return (Criteria) this;
        }

        public Criteria andFriendshipIsNull() {
            addCriterion("Friendship is null");
            return (Criteria) this;
        }

        public Criteria andFriendshipIsNotNull() {
            addCriterion("Friendship is not null");
            return (Criteria) this;
        }

        public Criteria andFriendshipEqualTo(Integer value) {
            addCriterion("Friendship =", value, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipNotEqualTo(Integer value) {
            addCriterion("Friendship <>", value, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipGreaterThan(Integer value) {
            addCriterion("Friendship >", value, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipGreaterThanOrEqualTo(Integer value) {
            addCriterion("Friendship >=", value, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipLessThan(Integer value) {
            addCriterion("Friendship <", value, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipLessThanOrEqualTo(Integer value) {
            addCriterion("Friendship <=", value, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipIn(List<Integer> values) {
            addCriterion("Friendship in", values, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipNotIn(List<Integer> values) {
            addCriterion("Friendship not in", values, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipBetween(Integer value1, Integer value2) {
            addCriterion("Friendship between", value1, value2, "friendship");
            return (Criteria) this;
        }

        public Criteria andFriendshipNotBetween(Integer value1, Integer value2) {
            addCriterion("Friendship not between", value1, value2, "friendship");
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