package org.apache.phoenix.transaction;

import java.sql.SQLException;
import java.util.concurrent.TimeoutException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.coprocessor.BaseRegionObserver;
import org.apache.phoenix.jdbc.PhoenixEmbeddedDriver.ConnectionInfo;
import org.apache.phoenix.schema.PTable;
import org.apache.phoenix.util.ReadOnlyProps;
import org.apache.twill.zookeeper.ZKClientService;
import org.slf4j.Logger;

public class OmidTransactionContext implements PhoenixTransactionContext {

    @Override
    public void begin() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void commit() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void abort() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void checkpoint(boolean hasUncommittedData) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void commitDDLFence(PTable dataTable, Logger logger) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void markDMLFence(PTable table) {
        // TODO Auto-generated method stub

    }

    @Override
    public void join(PhoenixTransactionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isTransactionRunning() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub

    }

    @Override
    public long getTransactionId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getReadPointer() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getWritePointer() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public PhoenixVisibilityLevel getVisibilityLevel() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setVisibilityLevel(PhoenixVisibilityLevel visibilityLevel) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public byte[] encodeTransaction() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getMaxTransactionsPerSecond() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isPreExistingVersion(long version) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public BaseRegionObserver getCoProcessor() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setInMemoryTransactionClient(Configuration config) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ZKClientService setTransactionClient(Configuration config, ReadOnlyProps props,
            ConnectionInfo connectionInfo) {
        // TODO Auto-generated method stub
        
        return null;
        
    }

    @Override
    public byte[] get_famility_delete_marker() {
        // TODO Auto-generated method stub
        return null;
    }
}
