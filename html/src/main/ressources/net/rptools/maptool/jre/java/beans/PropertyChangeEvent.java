/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

 /*
  * This file is based on code from the Apache Harmony Project.
  * http://svn.apache.org/repos/asf/harmony/enhanced/classlib/trunk/modules/beans/src/main/java/java/beans/PropertyChangeEvent.java
  */

package java.beans;

import java.util.EventObject;
import jsinterop.annotations.JsType;

public class PropertyChangeEvent extends EventObject {

    private String propertyName;

    private Object oldValue;

    private Object newValue;

    private Object propagationId;

    public PropertyChangeEvent(Object source, String propertyName,
            Object oldValue, Object newValue) {
        super(source);

        this.propertyName = propertyName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropagationId(Object propagationId) {
        this.propagationId = propagationId;
    }

    public Object getPropagationId() {
        return propagationId;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public Object getNewValue() {
        return newValue;
    }
}