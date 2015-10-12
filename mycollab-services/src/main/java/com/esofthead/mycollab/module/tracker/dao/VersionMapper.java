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
package com.esofthead.mycollab.module.tracker.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.tracker.domain.Version;
import com.esofthead.mycollab.module.tracker.domain.VersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface VersionMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int countByExample(VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int deleteByExample(VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int insert(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int insertSelective(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    List<Version> selectByExampleWithBLOBs(VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    List<Version> selectByExample(VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    Version selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int updateByExampleSelective(@Param("record") Version record, @Param("example") VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int updateByExampleWithBLOBs(@Param("record") Version record, @Param("example") VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int updateByExample(@Param("record") Version record, @Param("example") VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int updateByPrimaryKeySelective(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int updateByPrimaryKeyWithBLOBs(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    int updateByPrimaryKey(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    Integer insertAndReturnKey(Version value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_version
     *
     * @mbggenerated Mon Oct 12 13:22:26 ICT 2015
     */
    void massUpdateWithSession(@Param("record") Version record, @Param("primaryKeys") List primaryKeys);
}