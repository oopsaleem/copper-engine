/*
 * Copyright 2002-2014 SCOOP Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.scoopgmbh.copper.wfrepo.classpath;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

final class Clazz {
    URL classfile;
    String classname;
    String superClassname;
    Set<String> interruptableMethods = new HashSet<String>();
    Set<String> aggregatedInterruptableMethods = new HashSet<String>();
}