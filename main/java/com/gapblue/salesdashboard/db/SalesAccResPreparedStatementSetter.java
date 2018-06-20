package com.gapblue.salesdashboard.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.gapblue.web.stubs.accountresource.SalesAccountResource;

/**
 * This class is used to set the actual parameter values of a prepared
 * statement.
 */
public final class SalesAccResPreparedStatementSetter implements ItemPreparedStatementSetter<SalesAccountResource> {
	private static final Logger LOGGER = LoggerFactory.getLogger(SalesAccResPreparedStatementSetter.class);

	@Override
	public void setValues(SalesAccountResource salesAccountResource, PreparedStatement preparedStatement)
			throws SQLException {
		try {
			if (salesAccountResource.getResourceId() != null
					&& salesAccountResource.getResourceId().getValue() != null) {
				preparedStatement.setString(1, salesAccountResource.getResourceId().getValue().toString());
			} else {
				preparedStatement.setString(1, null);
			}

			if (salesAccountResource.getSAccountResourceId() != null) {
				preparedStatement.setString(2, salesAccountResource.getSAccountResourceId().toString());
			} else {
				preparedStatement.setString(2, null);
			}

			preparedStatement.setString(3, salesAccountResource.getPartyName());
			if (salesAccountResource.getResourcePrimaryOrgName() != null) {
				preparedStatement.setString(4, salesAccountResource.getResourcePrimaryOrgName().getValue());
			} else {
				preparedStatement.setString(4, null);
			}

			preparedStatement.setString(5, "INVN");
		} catch (Exception e) {
			LOGGER.debug("Mapping failed for " + salesAccountResource.getResourceId());
			e.printStackTrace();
		}

	}
}
