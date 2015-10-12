/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_crm_opportunity*/
package com.esofthead.mycollab.module.crm.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_crm_opportunity")
public class Opportunity extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.id
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.opportunityName
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=255, message="Field value is too long")
    @Column("opportunityName")
    private String opportunityname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.currencyid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("currencyid")
    private Integer currencyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.accountid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("accountid")
    private Integer accountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.amount
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("amount")
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.type
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.source
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("source")
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.expectedClosedDate
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("expectedClosedDate")
    private Date expectedcloseddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.campaignid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("campaignid")
    private Integer campaignid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.nextStep
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=255, message="Field value is too long")
    @Column("nextStep")
    private String nextstep;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.probability
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("probability")
    private Integer probability;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.createdTime
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.createdUser
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.sAccountId
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.assignUser
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("assignUser")
    private String assignuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.opportunityType
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("opportunityType")
    private String opportunitytype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.salesStage
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("salesStage")
    private String salesstage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.lastUpdatedTime
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.avatarId
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=100, message="Field value is too long")
    @Column("avatarId")
    private String avatarid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_opportunity.description
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        Opportunity item = (Opportunity)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(153, 1731).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.id
     *
     * @return the value of m_crm_opportunity.id
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.id
     *
     * @param id the value for m_crm_opportunity.id
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.opportunityName
     *
     * @return the value of m_crm_opportunity.opportunityName
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getOpportunityname() {
        return opportunityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.opportunityName
     *
     * @param opportunityname the value for m_crm_opportunity.opportunityName
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setOpportunityname(String opportunityname) {
        this.opportunityname = opportunityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.currencyid
     *
     * @return the value of m_crm_opportunity.currencyid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Integer getCurrencyid() {
        return currencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.currencyid
     *
     * @param currencyid the value for m_crm_opportunity.currencyid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setCurrencyid(Integer currencyid) {
        this.currencyid = currencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.accountid
     *
     * @return the value of m_crm_opportunity.accountid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.accountid
     *
     * @param accountid the value for m_crm_opportunity.accountid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.amount
     *
     * @return the value of m_crm_opportunity.amount
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.amount
     *
     * @param amount the value for m_crm_opportunity.amount
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.type
     *
     * @return the value of m_crm_opportunity.type
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.type
     *
     * @param type the value for m_crm_opportunity.type
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.source
     *
     * @return the value of m_crm_opportunity.source
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.source
     *
     * @param source the value for m_crm_opportunity.source
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.expectedClosedDate
     *
     * @return the value of m_crm_opportunity.expectedClosedDate
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Date getExpectedcloseddate() {
        return expectedcloseddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.expectedClosedDate
     *
     * @param expectedcloseddate the value for m_crm_opportunity.expectedClosedDate
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setExpectedcloseddate(Date expectedcloseddate) {
        this.expectedcloseddate = expectedcloseddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.campaignid
     *
     * @return the value of m_crm_opportunity.campaignid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Integer getCampaignid() {
        return campaignid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.campaignid
     *
     * @param campaignid the value for m_crm_opportunity.campaignid
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setCampaignid(Integer campaignid) {
        this.campaignid = campaignid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.nextStep
     *
     * @return the value of m_crm_opportunity.nextStep
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getNextstep() {
        return nextstep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.nextStep
     *
     * @param nextstep the value for m_crm_opportunity.nextStep
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setNextstep(String nextstep) {
        this.nextstep = nextstep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.probability
     *
     * @return the value of m_crm_opportunity.probability
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Integer getProbability() {
        return probability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.probability
     *
     * @param probability the value for m_crm_opportunity.probability
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.createdTime
     *
     * @return the value of m_crm_opportunity.createdTime
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.createdTime
     *
     * @param createdtime the value for m_crm_opportunity.createdTime
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.createdUser
     *
     * @return the value of m_crm_opportunity.createdUser
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.createdUser
     *
     * @param createduser the value for m_crm_opportunity.createdUser
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.sAccountId
     *
     * @return the value of m_crm_opportunity.sAccountId
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.sAccountId
     *
     * @param saccountid the value for m_crm_opportunity.sAccountId
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.assignUser
     *
     * @return the value of m_crm_opportunity.assignUser
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getAssignuser() {
        return assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.assignUser
     *
     * @param assignuser the value for m_crm_opportunity.assignUser
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setAssignuser(String assignuser) {
        this.assignuser = assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.opportunityType
     *
     * @return the value of m_crm_opportunity.opportunityType
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getOpportunitytype() {
        return opportunitytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.opportunityType
     *
     * @param opportunitytype the value for m_crm_opportunity.opportunityType
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setOpportunitytype(String opportunitytype) {
        this.opportunitytype = opportunitytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.salesStage
     *
     * @return the value of m_crm_opportunity.salesStage
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getSalesstage() {
        return salesstage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.salesStage
     *
     * @param salesstage the value for m_crm_opportunity.salesStage
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setSalesstage(String salesstage) {
        this.salesstage = salesstage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.lastUpdatedTime
     *
     * @return the value of m_crm_opportunity.lastUpdatedTime
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_crm_opportunity.lastUpdatedTime
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.avatarId
     *
     * @return the value of m_crm_opportunity.avatarId
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getAvatarid() {
        return avatarid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.avatarId
     *
     * @param avatarid the value for m_crm_opportunity.avatarId
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setAvatarid(String avatarid) {
        this.avatarid = avatarid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_opportunity.description
     *
     * @return the value of m_crm_opportunity.description
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_opportunity.description
     *
     * @param description the value for m_crm_opportunity.description
     *
     * @mbggenerated Mon Oct 12 13:22:23 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        opportunityname,
        currencyid,
        accountid,
        amount,
        type,
        source,
        expectedcloseddate,
        campaignid,
        nextstep,
        probability,
        createdtime,
        createduser,
        saccountid,
        assignuser,
        opportunitytype,
        salesstage,
        lastupdatedtime,
        avatarid,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}