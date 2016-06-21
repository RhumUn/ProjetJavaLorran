package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class DAOLorannWorld extends DAOEntity<LorannWorld> {

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOLorannWorld(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(LorannWorld entity) {
		try {
			final String sql = "{call addElement(?, ?, ?, ?, ?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, entity.getX());
			call.setInt(2, entity.getY());
			call.setInt(3, entity.getIdlevel());
			call.setString(4, entity.getInteraction());
			call.setString(5, entity.getLabel());
			call.execute();

			return true;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public ResultSet find(final int id) {
		try {
			final String sql = "{call loadElement(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			return resultSet;
			
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean delete(LorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(LorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
