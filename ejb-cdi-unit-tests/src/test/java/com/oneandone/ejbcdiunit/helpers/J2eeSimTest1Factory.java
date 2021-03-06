package com.oneandone.ejbcdiunit.helpers;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import com.oneandone.ejbcdiunit.persistence.PersistenceFactory;

/**
 * @author aschoerk
 */
@ApplicationScoped
public class J2eeSimTest1Factory extends PersistenceFactory {
    @Override
    protected String getPersistenceUnitName() {
        return "j2eeSimDS1Test";
    }

    /**
     * create a jdbc-Datasource using the same driver url user and password as the entityManager
     *
     * @return a jdbc-Datasource using the same driver url user and password as the entityManager
     */
    @Override
    @Produces
    public DataSource produceDataSource() {
        return super.produceDataSource();
    }
}
