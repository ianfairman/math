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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ian Fairman <ian.fairman@gmail.com>
 */
public class StatisticTest {
    
    public StatisticTest() {}
    
    @Test
    void shouldReturnThreeForArithmeticMeanOfTwoAndFour() {
        // Given
        double[] input = {2D, 4D};
        
        // When
        var result = Statistic.arithmeticMean(input);
        
        // Then
        assertEquals(3D, result);
    }
    
    @Test
    void shouldReturnFiveForArithmeticMeanOfOneThreeFiveSevenNine() {
        // Given
        double[] input = {1D, 3D, 5D, 7D, 9D};
        
        // When
        var result = Statistic.arithmeticMean(input);
        
        // Then
        assertEquals(5D, result);
    }
}
