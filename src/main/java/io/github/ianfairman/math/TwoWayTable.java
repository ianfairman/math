/*
 * Copyright 2025 Ian Fairman <ian.fairman@gmail.com>.
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
package io.github.ianfairman.math;

import static java.util.Objects.requireNonNull;

/**
 *
 * @author Ian Fairman <ian.fairman@gmail.com>
 */
public class TwoWayTable {

    private final double[][] array;
    
    public TwoWayTable(double[][] array) {
        requireNonNull(array);
        checkIsRectangular(array);
        this.array = array;
    }

    private void checkIsRectangular(double[][] array) throws IllegalArgumentException {
        var firstLength = array[0].length;
        for(var i = 1; i < array.length; ++i) {
            if (firstLength != array[i].length) {
                throw new IllegalArgumentException();
            }
        }
    }

    public int numberOfRows() {
        return array.length;
    }
    
    public int numberOfColumns() {
        return 3;
    }
}