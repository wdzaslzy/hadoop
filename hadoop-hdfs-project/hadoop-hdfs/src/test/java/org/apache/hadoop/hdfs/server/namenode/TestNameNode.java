package org.apache.hadoop.hdfs.server.namenode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class TestNameNode {

    private static final Log LOG = LogFactory.getLog(TestNameNode.class);

    @Test
    public void testRun() throws Exception {
        NameNode.main(null);
        Thread.sleep(1000000L);
    }


}
