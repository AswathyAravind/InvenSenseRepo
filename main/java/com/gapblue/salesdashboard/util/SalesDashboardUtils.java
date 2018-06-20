package com.gapblue.salesdashboard.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

public class SalesDashboardUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(SalesDashboardUtils.class);
	
	public String getInterfaceIdentifier(String interfaceName,
			@Qualifier(value = "batchDatasource") DataSource batchDatasource) {
		LOGGER.debug("In getInterfaceIdentifier");
		String query = "select batch_identifier from batch_job_identifier where interface_name=?";
		String batchIdentifier = null;
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		
		try {

			LOGGER.debug("In getInterfaceIdentifier " + batchDatasource);
			conn = batchDatasource.getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, interfaceName);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				LOGGER.debug("BatchIdentifier=" + rs.getString("batch_identifier"));
				batchIdentifier = rs.getString("batch_identifier");
			}
		} catch (Exception e) {
			LOGGER.debug("Error :: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
					preparedStatement.close();
					LOGGER.debug("Closed connection in setInterfacePoolDateTime");
				} catch (SQLException e) {
					LOGGER.error("Failed to close the connection");
					e.printStackTrace();
				}

		}
		return batchIdentifier;
	}

	public String getInterfacePoolDateTime(String interfaceName,
			@Qualifier(value = "batchDatasource") DataSource batchDatasource) {
		LOGGER.debug("In getInterfacePoolDateTime");
		String query = "select lastruntime from batch_job_metadata where interface_name=?";
		String lastrundate = null;
		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try {

			LOGGER.debug("In getInterfacePoolDateTime " + batchDatasource);
			conn = batchDatasource.getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, interfaceName);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				LOGGER.debug("LastRundate=" + rs.getString("lastruntime"));
				lastrundate = rs.getString("lastruntime");
			}
		} catch (Exception e) {
			LOGGER.debug("Error :: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
					preparedStatement.close();
					LOGGER.debug("Closed connection in setInterfacePoolDateTime");
				} catch (SQLException e) {
					LOGGER.error("Failed to close the connection");
					e.printStackTrace();
				}

		}
		return lastrundate;
	}

	public void setInterfacePoolDateTime(String interfaceName,
			@Qualifier(value = "batchDatasource") DataSource batchDatasource) {
		LOGGER.debug("In setInterfacePoolDateTime : " + interfaceName);
		String query = "update batch_job_metadata set lastruntime=? where interface_name=?";
		String currenttime = null;
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try {

			LOGGER.debug("In setInterfacePoolDateTime " + batchDatasource);
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss.sss'Z'");
			currenttime = sdf.format(new Date());
			conn = batchDatasource.getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, currenttime);
			preparedStatement.setString(2, interfaceName);
			boolean flag = preparedStatement.execute();// executeQuery();
			LOGGER.debug("Updated database with time : " + currenttime);

		} catch (Exception e) {

			LOGGER.debug("In setInterfacePoolDateTime error block " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
					preparedStatement.close();
					LOGGER.debug("Closed connection in setInterfacePoolDateTime");
				} catch (SQLException e) {
					LOGGER.error("Failed to close the connection");
					e.printStackTrace();
				}

		}
	}

}
