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
    
    @Test
    void shouldReturnFifteenAsSumOfOneTwoThreeFourFive() {
        // Given
        double[] input = {1D, 2D, 3D, 4D, 5D};
        
        // When
        var result = Statistic.sum(input);
        
        // Then
        assertEquals(15D, result);

    }
    
    @Test
    void shouldReturnTwentyOneAsSumOfOneTwoThreeFourFiveSix() {
        // Given
        double[] input = {1D, 2D, 3D, 4D, 5D, 6D};
        
        // When
        var result = Statistic.sum(input);
        
        // Then
        assertEquals(21D, result);
    }
    
    @Test 
    void shouldReturnMinusFourAndFourAsDeviationForOneAndNine() {
        // Given
        double[] input = {1D, 9D};
        
        // When
        double result[] = Statistic.deviation(input);
        
        // Then
        assertArrayEquals(new double[]{-4D, 4D}, result);
    }
    
    @Test 
    void shouldReturnMinusThreeAndThreeAsDeviationForTwoAndEight() {
        // Given
        double[] input = {2D, 8D};
        
        // When
        double result[] = Statistic.deviation(input);
        
        // Then
        assertArrayEquals(new double[]{-3D, 3D}, result);
    }
    
    @Test
    void shouldReturnOneTwentyFiveFortyNineForSquareOfOneFiveAndSeven() {
        // Given
        double[] input = {1D, 5D, 7D};
        
        // When
        double result[] = Statistic.square(input);
        
        // Then
        assertArrayEquals(new double[]{1D, 25D, 49D}, result);
   }
    
    @Test
    void shouldReturnFourSixteenSixtyFourForSquareOfTwoMinusFourAndEight() {
        // Given
        double[] input = {2D, -4D, 8D};
        
        // When
        double result[] = Statistic.square(input);
        
        // Then
        assertArrayEquals(new double[]{4D, 16D, 64D}, result);
    }
    
    @Test
    void shouldCalculatePopulationVarianceWikipediaOne() {
        // Given
        double[] input = {2D, 4D, 4D, 4D, 5D, 5D, 7D, 9D};
        
        // When
        double result = Statistic.populationVariance(input);
        
        // Then
        assertEquals(4D, result);
    }
    
    @Test
    void shouldCalculatePopulationVarianceOne() {
        // Given
        double[] input = {16D, 11D, 9D, 8D, 1D};
        
        // When
        double result = Statistic.populationVariance(input);
        
        // Then
        assertEquals(23.6D, result, 0.001D);
    }
    
    @Test
    void shouldCalculateStandardDeviation1() {
        // Given
        double[] input = {7D, 9D, 11D, 13D, 15D};
        
        // When
        double result = Statistic.populationStandardDeviation(input);
        
        // Then
        assertEquals(2.83D, result, 0.01D);
    }
    
    @Test
    void shouldCalculateStandardDeviation2() {
        // Given
        double[] input = {2D, 4D, 4D, 4D, 5D, 5D, 7D, 9D};        
        // When
        double result = Statistic.populationStandardDeviation(input);
        
        // Then
        assertEquals(2, result, 0.1D);
    }
           
   @Test
    void shouldCalculateSampleVariance1() {
        // Given
        double[] input = {1D, 2D, 3D, 4D, 5D, 6D, 7D};
        
        // When
        double result = Statistic.sampleVariance(input);
        
        // Then
        assertEquals(4.67D, result, 0.01D);
    }
           
   @Test
    void shouldCalculateSampleVariance2() {
        // Given
        double[] input = {2D, 3D, 5D, 7D, 11D, 13D, 17, 23D};
        
        // When
        double result = Statistic.sampleVariance(input);
        
        // Then
        assertEquals(53.5D, result, 0.1D);
    }
        
    @Test
    void shouldCalculateSampleStandardDeviation1() {
        // Given
        double[] input = {7D, 9D, 11D, 13D, 15D};
        
        // When
        double result = Statistic.sampleStandardDeviation(input);
        
        // Then
        assertEquals(3.16D, result, 0.01D);
    }    
      
    @Test
    void shouldCalculateSampleStandardDeviation2() {
        // Given
        double[] input = {2D, 4D, 4D, 4D, 5D, 5D, 7D, 9D};        

        // When
        double result = Statistic.sampleStandardDeviation(input);
        
        // Then
        assertEquals(2.138D, result, 0.001D);
    }
    
    @Test
    void shouldCalculateMedianForSingleItem1() {
        // Given
        double[] input = {5D};
        
        // When
        double result = Statistic.median(input);
        
        // Then
        assertEquals(5D, result, 0.001);
    }
    
    @Test
    void shouldCalculateMedianForSingleItem2() {
        // Given
        double[] input = {6D};
        
        // When
        double result = Statistic.median(input);
        
        // Then
        assertEquals(6D, result, 0.001);
    }
    
    @Test
    void shouldCalculateMedianForThreeSortedItems() {
        // Given
        double[] input = {1D, 2D, 3D};
        
        // When
        double result = Statistic.median(input);
        
        // Then
        assertEquals(2D, result, 0.001);
    }
    
    @Test
    void shouldCalculateMedianForThreeUnsortedItems() {
        // Given
        double[] input = {2D, 3D, 1D};
        
        // When
        double result = Statistic.median(input);
        
        // Then
        assertEquals(2D, result, 0.001);
    }
    
    @Test
    void shouldCalculateMedianForFourSortedItems1() {
        // Given
        double[] input = {1D, 2D, 3D, 4D};
        
        // When
        double result = Statistic.median(input);
        
        // Then
        assertEquals(2.5D, result, 0.001);
    }
    
    @Test
    void shouldCalculateMedianForFourSortedItems2() {
        // Given
        double[] input = {10D, 20D, 30D, 40D};
        
        // When
        double result = Statistic.median(input);
        
        // Then
        assertEquals(25D, result, 0.001);
    }
    
    @Test
    void shouldNotInterfereWithInput() {
        // Given
        double[] input = {20D, 30D, 10D};
        
        // When
        double _ = Statistic.median(input);
        
        // Then
        assertEquals(20D, input[0], 0.001);
    }
}
