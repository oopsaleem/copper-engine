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
package org.copperengine.monitoring.client.ui.adaptermonitoring.result.animation;

public class AnimationPartParameter {
    public long startTime;
    public long endTime;
    public String id;
    public double startx;
    public double starty;
    public double endx;
    public double endy;

    public AnimationPartParameter(long startTime, long endTime, String id, double startx, double starty, double endx,
            double endy) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.id = id;
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }
}