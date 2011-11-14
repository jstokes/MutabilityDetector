/*
 *    Copyright (c) 2008-2011 Graham Allan
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.mutabilitydetector.benchmarks.inheritance;

import static org.mutabilitydetector.ImmutableAssert.assertImmutable;
import static org.mutabilitydetector.ImmutableAssert.assertNotImmutable;

import org.junit.Test;
import org.mutabilitydetector.benchmarks.MutableByExtendingMutableType;
import org.mutabilitydetector.benchmarks.types.AbstractType.ImmutableSubtypeOfAbstractType;

public class TestSubclassingOfMutableType {

    @Test
    public void testSupertypeIsEffectivelyImmutable() throws Exception {
        assertNotImmutable(ImmutableSupertype.class);
    }

    @Test
    public void testImmutableSubtypeIsReportedAsImmutable() throws Exception {
        assertImmutable(ImmutableSubtypeOfImmutableSupertype.class);
    }

    @Test
    public void mutableSubtype() throws Exception {
        assertNotImmutable(MutableSubtypeOfImmutableSupertype.class);
    }

    @Test
    public void classExtendingObjectIsNotRenderedMutable() throws Exception {
        assertImmutable(ImmutableSubtypeWithNoSuperclass.class);
    }

    @Test
    public void classIsNotMadeMutableJustByExtendingAbstractClass() throws Exception {
        assertImmutable(ImmutableSubtypeOfAbstractType.class);
    }

    @Test
    public void immutableSubclassIsMutableIfSuperclassIsMutable() throws Exception {
        assertNotImmutable(MutableByExtendingMutableType.class);
    }
}
