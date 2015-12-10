package org.hnyy.core.service.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hnyy.core.service.BaseService;
import org.hnyy.core.utils.Page;
import org.hnyy.core.utils.PageUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("systemService")
@Transactional
public class SystemServiceImpl extends BaseServiceImpl<Object, Serializable> implements BaseService {

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntity(java.lang.Class, java.lang.String)
	 */
	public <T> T getEntity(Class<T> entity, String methord) throws SQLException {
		return this.jdbcDao.getEntity(entity, methord);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntity(java.lang.Object)
	 */
	public <T> T getEntity(T entity) throws Exception {
		return this.jdbcDao.getEntity(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntity(java.lang.Object, java.lang.Object[])
	 */
	public <T> T getEntity(T entity, Object... param) throws Exception {
		return this.jdbcDao.getEntity(entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntity(java.lang.Class, java.lang.String, java.io.Serializable)
	 */
	public <T> T getEntity(Class<T> entity, String methord, Serializable id)
			throws SQLException {
		return this.jdbcDao.getEntity(entity, methord, id);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntity(java.lang.Class, java.lang.String, java.lang.Object[])
	 */
	public <T> T getEntity(Class<T> entity, String methord, Object... param) {
		return this.jdbcDao.getEntity(entity, methord, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntityCount(java.lang.Class, java.lang.String, java.io.Serializable)
	 */
	public <T> Integer getEntityCount(Class<T> entity, String methord,
			Serializable id) {
		return this.jdbcDao.getEntityCount(entity, methord, id);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntityCount(java.lang.Object)
	 */
	public <T> Integer getEntityCount(T entity) throws Exception {
		return this.jdbcDao.getEntityCount(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntityCount(java.lang.Object, java.lang.Object[])
	 */
	public <T> Integer getEntityCount(T entity, Object... param)
			throws Exception {
		return this.jdbcDao.getEntityCount(entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getEntityCountById(java.lang.Object)
	 */
	public <T> Integer getEntityCountById(T entity) throws Exception {
		return this.jdbcDao.getEntityCountById(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#find(java.lang.String)
	 */
	public <T> List<Map<String, Object>> find(String sql) {
		return this.jdbcDao.findForJdbc(sql);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findList(java.lang.Class, java.lang.String, java.io.Serializable)
	 */
	public <T> List<T> findList(Class<T> entity, String methord, Serializable id) {
		return this.jdbcDao.findList(entity, methord, id);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findList(java.lang.Class, java.lang.String, java.lang.Object[])
	 */
	public <T> List<T> findList(Class<T> entity, String methord,
			Object... param) {
		return this.jdbcDao.findList(entity, methord, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findList(java.lang.Object)
	 */
	public <T> List<T> findList(T entity) throws Exception {
		return this.jdbcDao.findList(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findList(java.lang.Object, java.lang.Object[])
	 */
	public <T> List<T> findList(T entity, Object... param) throws Exception {
		return this.jdbcDao.findList(entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findList(java.lang.Object, java.util.Map)
	 */
	public <T> List<T> findList(T entity, Map<String, Object> param)
			throws Exception {
		return this.jdbcDao.findList(entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findListByPage(java.lang.Object, java.lang.Object[])
	 */
	public <T> List<T> findListByPage(T entity, Object... param)
			throws Exception {
		return this.jdbcDao.findListByPage(entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findListByPage(org.takinframework.core.util.Page, java.lang.Object, java.lang.Object[])
	 */
	public <T> Page<T> findListByPage(Page<T> page, T entity, Object... param)
			throws Exception {
		return this.jdbcDao.findListByPage(page, entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findListByPage(org.takinframework.core.util.Page, java.lang.Object, java.util.Map)
	 */
	public <T> Page<T> findListByPage(Page<T> page, T entity,
			Map<String, Object> param) throws Exception {
		return this.findListByPage(page, entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findListByPage(org.takinframework.core.util.PageUtil, java.lang.Object, java.util.Map)
	 */
	public <T> PageUtil<T> findListByPage(PageUtil<T> page, T entity,
			Map<String, Object> param) throws Exception {
		return this.jdbcDao.findListByPage(page, entity, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findAll(java.lang.Class, java.lang.String)
	 */
	public <T> List<T> findAll(Class<T> entity, String methord)
			throws Exception {
		return this.jdbcDao.findAll(entity, methord);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findAll(java.lang.Class)
	 */
	public <T> List<T> findAll(Class<T> entity) throws Exception {
		return this.jdbcDao.findAll(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findAllByPage(java.lang.Object)
	 */
	public <T> List<T> findAllByPage(T entity) throws Exception {
		return this.jdbcDao.findAllByPage(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findAllByPage(org.takinframework.core.util.Page, java.lang.Object)
	 */
	public <T> Page<T> findAllByPage(Page<T> page, T entity) throws Exception {
		// TODO Auto-generated method stub
		return this.jdbcDao.findAllByPage(page, entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findAllByPage(org.takinframework.core.util.PageUtil, java.lang.Object)
	 */
	public <T> PageUtil<T> findAllByPage(PageUtil<T> page, T entity)
			throws Exception {
		return this.jdbcDao.findAllByPage(page, entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#findForJdbc(java.lang.String)
	 */
	public List<Map<String, Object>> findForJdbc(String sql) {
		return this.jdbcDao.findForJdbc(sql);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#executeSql(java.lang.String, java.lang.Object[])
	 */
	public void executeSql(String sql, Object... param) {
		this.jdbcDao.executeSql(sql, param);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#delete(java.lang.Object)
	 */
	public <T> void delete(T entity) {
		this.jdbcDao.delete(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#delete(java.lang.Object, java.lang.Object[])
	 */
	public <T> void delete(T entity, Object... params) {
		this.jdbcDao.delete(entity, params);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#delete(java.lang.Class, java.lang.String, java.lang.Object[])
	 */
	public <T> boolean delete(Class<T> entity, String methord,
			Object... parameters) {
		return this.jdbcDao.delete(entity, methord, parameters);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#deleteAllEntitie(java.util.Collection)
	 */
	public <T> void deleteAllEntitie(Collection<T> entities) {
		this.jdbcDao.delete(entities);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#save(java.lang.Object)
	 */
	public <T> boolean save(T entity) throws SQLException {
		return this.jdbcDao.save(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#batchSave(java.util.List)
	 */
	public <T> void batchSave(List<T> entitys) throws SQLException {

		this.jdbcDao.batchSave(entitys);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#addLog(java.lang.String, java.lang.Short, java.lang.Short)
	 */
	public void addLog(String LogContent, Short operatetype, Short loglevel) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#addLog(java.lang.String, java.lang.Short, java.lang.Short, java.lang.Exception)
	 */
	public void addLog(String LogContent, Short operatetype, Short loglevel,
			Exception e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getTypeGroup(java.lang.String, java.lang.String)
	 */
	public <T> T getTypeGroup(String typegroupcode, String typgroupename) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getOperationCodesByUserIdAndFunctionId(java.lang.String, java.lang.String)
	 */
	public <T> Set<T> getOperationCodesByUserIdAndFunctionId(String userId,
			String functionId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getOperationCodesByRoleIdAndFunctionId(java.lang.String, java.lang.String)
	 */
	public <T> Set<T> getOperationCodesByRoleIdAndFunctionId(String roleId,
			String functionId) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getTypeGroupByCode(java.lang.Class)
	 */
	public <T> T getTypeGroupByCode(Class<T> entity) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#initAllTypeGroups()
	 */
	public void initAllTypeGroups() {
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#refleshTypesCach(java.lang.Class)
	 */
	public <T> void refleshTypesCach(Class<T> entity) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#refleshTypeGroupCach()
	 */
	public void refleshTypeGroupCach() {

	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#update(java.lang.Object)
	 */
	public <T> boolean update(T entity) throws Exception {
		return this.jdbcDao.update(entity);
	}

	/* (non-Javadoc)
	 * @see org.takinframework.core.common.service.BaseService#getDBType()
	 */
	public <T> String getDBType() throws SQLException {
		return this.jdbcDao.getDBType();
	}
	

}
