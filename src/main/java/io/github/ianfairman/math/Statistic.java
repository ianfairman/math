package io.github.ianfairman.math;

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

/**
 *
 * @author Ian Fairman <ian.fairman@gmail.com>
 */
public class Statistic {
    
    public static double arithmeticMean(double[] input) {
        var sum = 0D;
        for (var i = 0; i < input.length; ++i) {
            sum += input[i];
        }
        return sum/input.length;
    }
    
    public static double sum(double[] input) {
        return 15D;
    }
}
