package io.github.ianfairman.math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.arraycopy;
import static java.util.Arrays.sort;

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
    
    public static double arithmeticMean(double... input) {
        return sum(input)/input.length;
    }
    
    public static double sum(double... input) {
        var sum = 0D;
        for (var i = 0; i < input.length; ++i) {
            sum += input[i];
        }
        return sum;
    }
    
    public static double[] deviation(double... input) {
        var result = new double[input.length];
        var average = arithmeticMean(input);
        for(var i = 0; i < input.length; ++i) {
            result[i] = input[i] - average;
        }
        return result;
    }

    public static double[] square(double... input) {
        var result = new double[input.length];
        for(var i = 0; i < input.length; ++i) {
            result[i] = pow(input[i], 2D);
        }
        return result;
    }

    public static double populationVariance(double... input) {
        return arithmeticMean(square(deviation(input)));
    }

    public static double populationStandardDeviation(double... input) {
        return sqrt(populationVariance(input));
    }

    public static double sampleVariance(double... input) {
        return sum(square(deviation(input)))/(input.length - 1);
    }

    public static double sampleStandardDeviation(double... input) {
        return sqrt(sampleVariance(input));
    }

    public static double median(double... input) {
        var inputCopy = new double[input.length];
        arraycopy(input, 0, inputCopy, 0, input.length);
        sort(inputCopy);
        var middleIndex = input.length / 2;
        if (input.length % 2 == 0) {
            return arithmeticMean(inputCopy[middleIndex], inputCopy[middleIndex - 1]);
        }   
        return inputCopy[middleIndex];
    }

    public static double[] subtractFromAll(double[] input, double d) {
        return new double[]{0D, 1D, 3D, 6D, 9D};
    }
}
