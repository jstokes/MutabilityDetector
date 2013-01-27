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
package org.mutabilitydetector;

import org.mutabilitydetector.IsImmutable;

public class AnalysisResultTheory {
    public final IsImmutable expected;
    public final Class<?> clazz;
    public AnalysisResultTheory(Class<?> clazz, IsImmutable expected) {
        this.expected = expected;
        this.clazz = clazz;
    }
    
    public static AnalysisResultTheory of(Class<?> clazz, IsImmutable toBe) {
        return new AnalysisResultTheory(clazz, toBe);
    }
}