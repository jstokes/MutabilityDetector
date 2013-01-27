/*
 *    Copyright (c) 2008-2013 Graham Allan
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
package org.mutabilitydetector.benchmarks.mutabletofield;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.mutabilitydetector.benchmarks.ImmutableExample;
import org.mutabilitydetector.benchmarks.types.AbstractType;
import org.mutabilitydetector.benchmarks.types.InterfaceType;

public final class DependsOnManyTypesBeingImmutable {

    public final ImmutableExample myImmutableField;
    public final Map<AbstractType, InterfaceType> mapWithRequiredImmutableTypes;
    
    public DependsOnManyTypesBeingImmutable(ImmutableExample myImmutableField, 
                                            AbstractType myAbstractClassField,
                                            Map<AbstractType, InterfaceType> someInterfaceTypes) {
        this.myImmutableField = myImmutableField;
        this.mapWithRequiredImmutableTypes = Collections.unmodifiableMap(new HashMap<AbstractType, InterfaceType>(someInterfaceTypes));
    }
    
}
