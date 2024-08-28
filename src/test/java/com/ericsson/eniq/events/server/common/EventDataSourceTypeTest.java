/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.eniq.events.server.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class EventDataSourceTypeTest {

    @Test
    public void testIsTimeRangeOneWeek_True() {
        assertTrue(EventDataSourceType.isTimeRangeOneWeek("TR_4"));
    }

    @Test
    public void testIsTimeRangeOneWeek_False() {
        assertFalse(EventDataSourceType.isTimeRangeOneWeek("TR_1"));
    }

    @Test
    public void testIsTimeRangeOneWeek_Empty() {
        assertFalse(EventDataSourceType.isTimeRangeOneWeek(""));
    }

    @Test
    public void testIsTimeRangeOneWeek_Null() {
        assertFalse(EventDataSourceType.isTimeRangeOneWeek(null));
    }

}
