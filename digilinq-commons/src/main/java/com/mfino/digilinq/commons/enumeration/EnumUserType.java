/*
Copyright (c) 2013,mFino. All rights reserved.
*/
package com.mfino.digilinq.commons.enumeration;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.usertype.UserType;

/**
 * This class acts as an user type to all enum of java5.
 *
 * @author chanaiah
 * @version 7
 */
public class EnumUserType<E extends Enum<E>> implements UserType, ParameterizedType, Serializable  {

	/** Field clazz represents a class name. */
	private Class<E> clazz = null;

	/**
	 * No argument Public Constructor.
	 */
	public EnumUserType() {
	}

	
	/**
	 * constructor takes class name as parameter.
	 *
	 * @param c the c
	 */
	protected EnumUserType(Class<E> c) {
		this.clazz = c;
	}

	/**
	 * Field SQL_TYPES an array of integers.
	 */
	private static final int[] SQL_TYPES = { Types.VARCHAR };
	
	/** Field PARAM_CLASS holds a constant Enum. */
	private static final String PARAM_CLASS = "Enum";

	/**
	 * Return the SQL type codes for the columns mapped by this type. The codes are defined on <tt>java.sql.Types</tt>.
	 *
	 * @return int[] the typecodes
	 * @see java.sql.Types
	 */
	public int[] sqlTypes() {
		return SQL_TYPES;
	}

	/**
	 * The class returned by <tt>nullSafeGet()</tt>.
	 * 
	 * @return Class
	 */
	public Class returnedClass() {
		return clazz;
	}

	/**
	 * Return a deep copy of the persistent state, stopping at entities and at collections. It is not necessary to copy
	 * immutable objects, or null values, in which case it is safe to simply return the argument.
	 *
	 * @param value the value
	 * @return Object a copy
	 * @throws HibernateException the hibernate exception
	 */
	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	/**
	 * Are objects of this type mutable?.
	 *
	 * @return boolean
	 */
	public boolean isMutable() {
		return false;
	}

	/**
	 * Reconstruct an object from the cacheable representation. At the very least this method should perform a deep copy
	 * if the type is mutable. (optional operation)
	 *
	 * @param cached the cached
	 * @param owner the owner
	 * @return a reconstructed object from the cachable representation
	 * @throws HibernateException the hibernate exception
	 */
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		return cached;
	}

	/**
	 * Transform the object into its cacheable representation. At the very least this method should perform a deep copy
	 * if the type is mutable.
	 *
	 * @param value the value
	 * @return a cachable representation of the object
	 * @throws HibernateException the hibernate exception
	 */
	public Serializable disassemble(Object value) throws HibernateException {
		return (Serializable) value;
	}

	/**
	 * During merge, replace the existing (target) value in the entity we are merging to with a new (original) value
	 * from the detached entity we are merging. For immutable objects, or null values, it is safe to simply return the
	 * first parameter. For mutable objects, it is safe to return a copy of the first parameter. For objects with
	 * component values, it might make sense to recursively replace component values.
	 *
	 * @param original the original
	 * @param target the target
	 * @param owner the owner
	 * @return the value to be merged
	 * @throws HibernateException the hibernate exception
	 */
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return original;
	}

	/**
	 * Get a hashcode for the instance, consistent with persistence "equality".
	 *
	 * @param x the x
	 * @return int
	 * @throws HibernateException the hibernate exception
	 */
	public int hashCode(Object x) throws HibernateException {
		return x.hashCode();
	}

	/**
	 * This method compares two objects of this class.
	 *
	 * @param x the x
	 * @param y the y
	 * @return boolean value
	 * @throws HibernateException the hibernate exception
	 * @see org.hibernate.usertype.UserType#equals(java.lang.Object, java.lang.Object)
	 */
	public boolean equals(Object x, Object y) throws HibernateException {
		if (x == y)
			return true;
		if (null == x || null == y)
			return false;
		return x.equals(y);
	}

	/**
	 * This method will set parameter values.
	 *
	 * @param parameters the new parameter values
	 */
	public void setParameterValues(Properties parameters) {
		if (parameters != null) {
			if (parameters.containsKey(PARAM_CLASS)) {
				try {
					clazz = (Class<E>) Class.forName(parameters.getProperty(PARAM_CLASS));
				} catch (ClassNotFoundException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	/**
	 * Retrieve an instance of the mapped class from a JDBC result set.
	 *
	 * @param resultSet the result set
	 * @param names the names
	 * @param arg2 the arg 2
	 * @param arg3 the arg 3
	 * @return Object
	 * @throws HibernateException the hibernate exception
	 * @throws SQLException the SQL exception
	 */
	public Object nullSafeGet(ResultSet resultSet, String[] names,
			SessionImplementor arg2, Object arg3) throws HibernateException,
			SQLException {
		String name = resultSet.getString(names[0]);
		E result = null;
		if ( !resultSet.wasNull()) {
			E[] universe = clazz.getEnumConstants();
			for (E constant : universe)
				if (name.equals(constant.toString()))
					result = constant;
		}
		return result;
	}

	/**
	 * Write an instance of the mapped class to a prepared statement.
	 *
	 * @param preparedStatement the prepared statement
	 * @param value the value
	 * @param index the index
	 * @param arg3 the arg 3
	 * @throws HibernateException the hibernate exception
	 * @throws SQLException the SQL exception
	 */
	public void nullSafeSet(PreparedStatement preparedStatement, Object value, int index,
			SessionImplementor arg3) throws HibernateException, SQLException {
		if (null == value) {
			preparedStatement.setNull(index, Types.VARCHAR);
		} else {
			preparedStatement.setString(index, (value).toString());
		}
	}


	/**
	 * Null safe get.
	 *
	 * @param resultSet the result set
	 * @param names the names
	 * @param session the session
	 * @param owner the owner
	 * @return the object
	 * @throws HibernateException the hibernate exception
	 * @throws SQLException the SQL exception
	 */
	@Override
	public Object nullSafeGet(ResultSet resultSet, String[] names, SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		String name = resultSet.getString(names[0]);
		E result = null;
		if ( !resultSet.wasNull()) {
			E[] universe = clazz.getEnumConstants();
			for (E constant : universe)
				if (name.equals(constant.toString()))
					result = constant;
		}
		return result;
	}


	/**
	 * Null safe set.
	 *
	 * @param preparedStatement the prepared statement
	 * @param value the value
	 * @param index the index
	 * @param session the session
	 * @throws HibernateException the hibernate exception
	 * @throws SQLException the SQL exception
	 */
	@Override
	public void nullSafeSet(PreparedStatement preparedStatement, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		if (null == value) {
			preparedStatement.setNull(index, Types.VARCHAR);
		} else {
			preparedStatement.setString(index, (value).toString());
		}
	}
}

