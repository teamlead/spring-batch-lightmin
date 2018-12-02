package org.tuxdevelop.spring.batch.lightmin.domain;


import org.tuxdevelop.spring.batch.lightmin.test.PojoTestBase;

public class JobListenerConfigurationTest extends PojoTestBase {

    @Override
    public void performPojoTest() {
        this.testEquals(JobListenerConfiguration.class);
        this.testStructureAndBehavior(JobListenerConfiguration.class);
    }
}
