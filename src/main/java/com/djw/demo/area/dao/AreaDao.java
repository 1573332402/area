package com.djw.demo.area.dao;import com.djw.demo.area.entity.Area;import org.springframework.stereotype.Repository;import java.util.List;@Repositorypublic interface AreaDao {    /**     * @return     */    List<Area> queryArea();    /***     *     * @return     */    Area queryAreaById(int areaId);    /***     *     * @param area     * @return     */    int insertArea(Area area);    /***     *     * @param area     * @return     */    int updateArea(Area area);    /***     *     * @param areaId     * @return     */    int deleteArea(int areaId);}